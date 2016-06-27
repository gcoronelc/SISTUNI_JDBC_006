package org.nh.salida;

import java.util.Date;

import org.nh.bancos.Agencia;
import org.nh.bancos.Banco;
import org.nh.cajeros.Empleado;
import org.nh.cajeros.Ventanilla;
import org.nh.cuentas.Cliente;
import org.nh.cuentas.Cuenta;
import org.nh.cuentas.TransCajero;

public class Consola {
Cliente xcliente;
Cuenta xcuenta;
Agencia xagencia;
Banco xbanco;
Ventanilla xvent;
	
	public Consola() {
		// TODO Auto-generated constructor stub
		System.out.println("Prueba de codigo de salida");
		crear_cliente();
		crear_cuenta(xcliente);
		crear_agencia("BBVA","456","Jr.Canada 390",
				"Torres Candiotti","Luis Alberto");
		crear_ventanilla(3,"Herrera Lopez","Eduardo Jose");
		realizar_transaccion(2,120.00,xvent,xcuenta);
	}
	
	private void realizar_transaccion(int operacion,
			double monto, Ventanilla xvent2, Cuenta xcuenta2) {
		// TODO Auto-generated method stub
		switch (operacion) {
		case 1:
			// retiro de cuenta
			break;
		case 2:
			// deposito en cuenta
			deposito_cuenta(monto,xvent2,xcuenta2);
			break;
		default:
			break;
		}
	}

	private void deposito_cuenta(double monto,
			Ventanilla xvent2, Cuenta xcuenta2) {
		// TODO Auto-generated method stub
		String[] operaciones= {"","Retiro en cuenta",
				"Deposito en cuenta","Retiro CTS",
				"Consulta Saldo","Pago Servicios"};
		if((xcuenta2.getSaldo() + monto) <= xcuenta2.getLimite()){
		TransCajero xcajero = new TransCajero("99442", "2", monto, 
				"77777", xcuenta2, xvent2);
		modif_saldo(xcuenta2,monto,2);
		System.out.println("Datos de la transaccion realizada");
		System.out.println("Codigo:"+xcajero.getCodtrans());
		System.out.println("Fecha:"+xcajero.getFechatrans());
		System.out.println("Agencia:"+xcajero.getCajero().
				getUnAgencia().getCodigo());
		System.out.println("Ventanilla:"+xcajero.getCajero().getNumv());
		System.out.println("Operacion:"+
		operaciones[Integer.parseInt(xcajero.getOperacion())]);
		System.out.println("Monto de la operacion:"+xcajero.getImporte());
		System.out.println("Cuenta:"+xcajero.getUnCuenta().getNum_cuenta());
		System.out.println("Titular de la Cuenta:"+
		     xcajero.getUnCuenta().getPoseedor().nombre_completo());
		System.out.println("Saldo actual:"+
		     xcajero.getUnCuenta().getSaldo());
		System.out.println("-----------------------------------");
		}else{
			System.out.println("Monto ingresado es mayor al limite permitido,"
					+ " Transaccion cancelada");
		}
	}

	private void modif_saldo(Cuenta xcuenta2, double monto, int i) {
		switch (i) {
		case 2:
			double nusaldo = xcuenta2.getSaldo() + monto;
			xcuenta2.setSaldo(nusaldo);
			break;

		default:
			break;
		}
		
	}

	private void crear_ventanilla(int numvent,
			String apellcajero, String nombcajero) {
		// TODO Auto-generated method stub
		Empleado cajero = new Empleado("9224", apellcajero, nombcajero);
		xvent= new Ventanilla(numvent, xagencia, cajero);
	}

	private void crear_agencia(String nombanco,
			String codagencia, String diragencia,
			String apellgerente, String nomgerente) {
		// TODO Auto-generated method stub
		Empleado xgente= new Empleado("84747", apellgerente, nomgerente,
				new Date("30/6/1972"), new Date("12/02/2000"), "Integra", 
				"Av. Larco 111", "4456678");
		Banco xbanco = new Banco("123", nombanco, "Jr. Camana 112", "9675522",
				"gerencia@bbva.com.pe", "Luis Garcia");
		xagencia= new Agencia("988", xbanco, diragencia,
				"1993344", "19998", xgente);
	}

	private void crear_cuenta(Cliente xcliente2) {
		// TODO Auto-generated method stub
		xcuenta = new Cuenta("85577567", xcliente2,
				"Ahorro", "Soles", 200.00);
		System.out.println("Datos de la Cuenta aperturada");
		System.out.println("Numero:"+xcuenta.getNum_cuenta());
		System.out.println("Titular de la cuenta:"+
		xcuenta.getPoseedor().nombre_completo());
		System.out.println("Tipo de Cuenta:"+xcuenta.tipo_cuenta());
		System.out.println("Monto de apertura: "+xcuenta.getSaldo());
		System.out.println("--------------------------------");
	}

	private void crear_cliente() {
		// TODO Auto-generated method stub
	   xcliente = new Cliente("06787897", "Flores Gamboa", 
			   "Luis Alberto", new Date("21/09/1980"), "Av Canada 1010",
			   "05534587", "H", "Soltero");	
	   System.out.println("Datos del cliente ingresado");
	   System.out.println("Codigo:"+xcliente.getCodigo());
	   System.out.println("Nombre:"+xcliente.nombre_completo());
	   System.out.println("Sexo:"+
	   (xcliente.getSexo().equals("H")?"Hombre":"Mujer"));
	   System.out.println("-----------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Consola();
	}

}
