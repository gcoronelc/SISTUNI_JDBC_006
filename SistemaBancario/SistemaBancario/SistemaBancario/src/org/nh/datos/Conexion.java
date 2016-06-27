package org.nh.datos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;

import org.nh.cuentas.Cuenta;

public class Conexion {
	Connection conectar;
	Statement operacion;
	ResultSet respuesta;
	PreparedStatement comando;
	
	public Conexion() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver JDBC cargado");
			conectar = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
					"system","admin");
			conectar.setAutoCommit(false);
			System.out.println("Base de datos XE conectada");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public String encontrar_usuario(String xusuario, String xclave) {
		// TODO Auto-generated method stub
		String znombre ="x";
		String sentencia = "SELECT NOMBRE FROM ALUMNONH.USUARIO WHERE ALIAS = '"+
		xusuario+"' AND CLAVE = '"+xclave+"'";
		try {
			operacion = conectar.createStatement();
			respuesta = operacion.executeQuery(sentencia);
			if(respuesta.next()){
				znombre= respuesta.getString(1);
			}
			respuesta.close();
			operacion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return znombre;
	}


	public int guardar_clientes(ArrayList relacion) {
		// TODO Auto-generated method stub
		boolean fallido = false;
		int numero = 0;
		String sentencia = "insert into ALUMNONH.CLIENTE values(?,?,?,?,?,?,?,?)";
		try {
			comando = conectar.prepareStatement(sentencia);
			
			for (Object item : relacion) {
				String[] zcliente= (String[]) item;
				comando.setString(1, zcliente[0]);
				comando.setString(2, zcliente[1]);
				comando.setString(3, zcliente[2]);
				comando.setDate(4, Date.valueOf(form_fecha(zcliente[7])));
				comando.setString(5, zcliente[3]);
				comando.setString(6, zcliente[4]);
				comando.setString(7, zcliente[6]);
				comando.setString(8, zcliente[5]);
				int valor1 = comando.executeUpdate();
				if(valor1 < 1){
				   fallido = true;
				   break;
				}
				comando.clearParameters();
			}
			if(fallido){
				conectar.rollback();
			}else{
				numero = relacion.size();
				conectar.commit();
			}
			comando.close();
			conectar.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return numero;
	}

  // fecha1 estara en formato dd/mm/yyyy
	private String form_fecha(String fecha1) {
		// TODO Auto-generated method stub
		String[] cadena = fecha1.split("/");
		return cadena[2]+"-"+cadena[1]+"-"+cadena[0];
	}


	public int guardar_cuentas(ArrayList<Cuenta> relacion) {
		// TODO Auto-generated method stub
		boolean fallido = false;
		int numero = 0;
		String sentencia = "insert into ALUMNONH.CUENTA values(?,?,?,?,?,?,?)";
		try {
			comando = conectar.prepareStatement(sentencia);
			
			for (Cuenta nitem : relacion) {
				comando.setString(1, nitem.getNum_cuenta());
				comando.setDate(2, conv_date(nitem.getFec_apertura()));
				comando.setString(3, nitem.getPoseedor().getCodigo());
				comando.setString(4, nitem.getTipo());
				comando.setString(5, nitem.getTipo_moneda());
				comando.setDouble(6, nitem.getSaldo());
				comando.setDouble(7, ver_limite(nitem.getTipo_moneda()));
				int valor1 = comando.executeUpdate();
				if(valor1 < 1){
				   fallido = true;
				   break;
				}
				comando.clearParameters();
			}
			if(fallido){
				conectar.rollback();
			}else{
				numero = relacion.size();
				conectar.commit();
			}
			comando.close();
			conectar.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return numero;
	}


	private double ver_limite(String moneda) {
		// TODO Auto-generated method stub
		double dlim=0;
		String sentencia1= "SELECT DESCRIPCION FROM ALUMNONH.PARAMETRO WHERE TABLA = 3 AND PARAM = ?";
		try {
			PreparedStatement comando1= conectar.prepareStatement(sentencia1);
			comando1.setString(1, moneda);
			ResultSet resp2= comando1.executeQuery();
			if(resp2.next()){
				dlim = Double.parseDouble(resp2.getString(1));
			}
			resp2.close();
			comando1.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return dlim;
	}


	private java.sql.Date conv_date(java.util.Date fec_apertura) {
		// TODO Auto-generated method stub
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String cad1 = formato.format(fec_apertura);
		String[] corte = cad1.split("/");
		String cadena = corte[2]+"-"+corte[1]+"-"+corte[0];
		return java.sql.Date.valueOf(cadena);
	}


	public String buscar_nombre_cliente(String codigo2) {
		// TODO Auto-generated method stub
		String znombre ="x";
		String sentencia = "SELECT APELLIDOS||' '||NOMBRES as completo FROM ALUMNONH.CLIENTE WHERE CODIGO = ?";
		try {
			comando = conectar.prepareStatement(sentencia);
			comando.setString(1, codigo2);
			respuesta = comando.executeQuery();
			if(respuesta.next()){
				znombre= respuesta.getString(1);
			}
			respuesta.close();
			comando.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return znombre;
	}


	public LinkedList<String[]> relacion_cuentas(String codigo) {
		// TODO Auto-generated method stub
		LinkedList<String[]> valores = new LinkedList<>();
		String sentencia = "SELECT a.NUM_CTA, a.FEC_APT, a.TIPO,a.TIPO_MONEDA, a.SALDO, b.DESCRIPCION,c.DESCRIPCION,a.LIMITE,a.POSEEDOR "+
  " FROM ALUMNONH.CUENTA a, ALUMNONH.PARAMETRO b, ALUMNONH.PARAMETRO c   WHERE b.TABLA = 1 AND a.TIPO = b.PARAM AND "+
  " c.TABLA = 2 AND a.TIPO_MONEDA = c.PARAM  AND a.POSEEDOR = ?";
		try {
			comando = conectar.prepareStatement(sentencia);
			comando.setString(1, codigo);
			respuesta = comando.executeQuery();
			while(respuesta.next()){
				String[] valor1 = new String[9];
				valor1[0]= respuesta.getString(1);
				valor1[1]= respuesta.getDate(2).toLocaleString();
				valor1[2]= respuesta.getString(3);
				valor1[3]= respuesta.getString(4);
				valor1[4]= ""+respuesta.getDouble(5);
				valor1[5]= respuesta.getString(6);
				valor1[6]= respuesta.getString(7);
				valor1[7]= ""+respuesta.getDouble(8);
				valor1[8]= respuesta.getString(9);
				valores.add(valor1);
			}
			respuesta.close();
			comando.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return valores;
	}


	public boolean ingresar_transaccion(double imonto,
			String[] dcuenta, int ioperar) {
		// TODO Auto-generated method stub
		SimpleDateFormat fechita = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat horita = new SimpleDateFormat("hh:mm:ss");
		java.util.Date hoy = new java.util.Date();
		boolean hecho=false;
		String sentencia = "insert into ALUMNONH.TRANSACCIONES(MONTO,FECHA,HORA,CLIENTE,CUENTA,TRANSACCION) values (?,?,?,?,?,?)";
		try {
			comando = conectar.prepareStatement(sentencia);
			comando.setDouble(1, imonto);
			comando.setString(2, fechita.format(hoy));
			comando.setString(3, horita.format(hoy));
			comando.setString(4, dcuenta[8]);
			comando.setString(5, dcuenta[0]);
			comando.setString(6, cod_transacc(dcuenta,ioperar));
			int ifila = comando.executeUpdate();
			if(ifila > 0){
				hecho =true;
				conectar.commit();
			}else
				conectar.rollback();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return hecho;
	}


	private String cod_transacc(String[] dcuenta,int ioperar) {
		// TODO Auto-generated method stub
		String xcodigo="0";
		switch (ioperar) {
		case 1: 
		case 2:xcodigo=""+ioperar+dcuenta[2];
			break;

		default: xcodigo =""+ioperar;
			break;
		}
		
		return xcodigo;
	}


	public boolean actualizar_saldo_cuenta(String[] dcuenta, double nsaldo) {
		// TODO Auto-generated method stub
		boolean aplicar=false;
		String sentencia ="update ALUMNONH.CUENTA set SALDO = ? where NUM_CTA= ?";
		try {
			comando = conectar.prepareStatement(sentencia);
			comando.setDouble(1, nsaldo);
			comando.setString(2, dcuenta[0]);
			int ifila = comando.executeUpdate();
			if(ifila > 0){
				aplicar= true;
				conectar.commit();
			}else{
				conectar.rollback();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aplicar;
	}

}
