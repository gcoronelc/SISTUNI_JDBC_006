package org.nh.datos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Date;

import org.nh.cuentas.Cliente;
import org.nh.cuentas.Cuenta;

public class Archivo {
	String ruta="D:/java1/datos/";
	FileReader lectura;
	FileWriter escritura;
	BufferedReader contenido;
	PrintWriter salida;
	String[] nombres = {"clientes.txt","cuentas.txt"};
	public Archivo() {
		// TODO Auto-generated constructor stub
	}
    
	public BufferedReader abrir_archivo_lectura(String nomarchivo){
		BufferedReader temporal = null;
		try {
			lectura = new FileReader(ruta+nomarchivo);
			temporal = new BufferedReader(lectura);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return temporal;
	}
	public PrintWriter abrir_archivo_escritura(String nomarchivo){
		PrintWriter temporal = null;
		try {
			escritura = new FileWriter(ruta+nomarchivo, true);
			temporal = new PrintWriter(escritura);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return temporal;
	}

	public boolean guardar_cliente(Cliente xcliente) {
		// TODO Auto-generated method stub
		
		salida = abrir_archivo_escritura(nombres[0]);
		String cadena = xcliente.getCodigo()+"*"+
		xcliente.getApellidos()+"*"+xcliente.getNombres()+"*"+
				xcliente.getDireccion()+"*"+xcliente.getDni()+"*"+
		xcliente.getEst_civil()+"*"+xcliente.getSexo()+"*"+
				new SimpleDateFormat("dd/MM/yyyy").
				format(xcliente.getFec_nac())+"\n";
		salida.append(cadena);
		salida.close();
		return true;
	}

	public String[] datos_cliente(String ccliente) {
		// TODO Auto-generated method stub
		String[] datos = new String[2];
		String linea;
		boolean encontre=false;
		contenido = abrir_archivo_lectura(nombres[0]);
		try {
			linea = contenido.readLine();
			while((linea != null) && (linea.length() > 0)){
			 StringTokenizer corte = new StringTokenizer(linea, "*");
			  String codigo = corte.nextToken();
			  if(codigo.equals(ccliente)){
				  datos[0]="1";
				 String xape = corte.nextToken();
				 String xnom = corte.nextToken();
				 datos[1]= xape+" "+xnom;
				 encontre=true;
				 break;
			  }
			  linea = contenido.readLine();
			}
			if(!encontre){
				datos[0] ="0";
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return datos;
	}

	public boolean guardar_cuenta(Cuenta ncuenta) {
		// TODO Auto-generated method stub
		salida = abrir_archivo_escritura(nombres[1]);
		String cadena = ncuenta.getNum_cuenta()+"*"+
				ncuenta.getPoseedor().getCodigo()+"*"+
				ncuenta.getPoseedor().getApellidos()+"*"+
				ncuenta.getTipo()+"*"+ncuenta.getTipo_moneda()+"*"+
				ncuenta.getSaldo()+"*"+
				new SimpleDateFormat("dd/MM/yyyy").
				format(ncuenta.getFec_apertura())+"\n";
		salida.append(cadena);
		salida.close();
		return true;
	}

	public ArrayList lista_clientes() {
		// TODO Auto-generated method stub
		ArrayList listado = new ArrayList();
		String linea;
	    contenido = abrir_archivo_lectura(nombres[0]);
		try {
			linea = contenido.readLine();
			while((linea != null) && (linea.length() > 0)){
			 StringTokenizer corte = new StringTokenizer(linea, "*");
			 String[] valores = new String[8];
			 for (int i = 0; i < valores.length; i++) {
				valores[i]= corte.nextToken();
			 }
			  listado.add(valores);
			  linea = contenido.readLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listado;
	}

	public ArrayList lista_cuentas() {
		// TODO Auto-generated method stub
		String[] lismonedas= {"","Soles","Dolares","Euros"};
		String[] listipos= {"","Ahorro","Corriente","CTS"};
		ArrayList<Cuenta> listado = new ArrayList();
		String linea;
	    contenido = abrir_archivo_lectura(nombres[1]);
		try {
			linea = contenido.readLine();
			while((linea != null) && (linea.length() > 0)){
			 StringTokenizer corte = new StringTokenizer(linea, "*");
			 Cuenta zcuenta = new Cuenta();
			 zcuenta.setNum_cuenta(corte.nextToken());
			 zcuenta.setPoseedor(new Cliente(corte.nextToken()));
			 corte.nextToken();
			 String stipo = corte.nextToken();
			 zcuenta.setTipo(pos_tipo(stipo,listipos));
			 String smoneda = corte.nextToken();
			 zcuenta.setTipo_moneda(pos_moneda(smoneda,lismonedas));
			 zcuenta.setSaldo(Double.parseDouble(corte.nextToken()));
			 zcuenta.setFec_apertura(new Date(corte.nextToken()));
			  listado.add(zcuenta);
			  linea = contenido.readLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listado;
	}

	private String pos_moneda(String smoneda, String[] lismonedas) {
		// TODO Auto-generated method stub
		int res1=0;
		for (int i = 0; i < lismonedas.length; i++) {
			if(lismonedas[i].equals(smoneda)){
				res1 = i;
			}
			
		}
		return ""+res1;
	}

	private String pos_tipo(String stipo, String[] listipos) {
		// TODO Auto-generated method stub
		int res1=0;
		for (int i = 0; i < listipos.length; i++) {
			if(listipos[i].equals(stipo)){
				res1 = i;
			}
			
		}
		return ""+res1;
	}
	
}
