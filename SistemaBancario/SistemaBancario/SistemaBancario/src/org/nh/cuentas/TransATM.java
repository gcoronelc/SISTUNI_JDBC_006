package org.nh.cuentas;

import java.util.Date;

import org.nh.bancos.Agencia;
import org.nh.bancos.Redex;
import org.nh.cajeros.Ventanilla;

public class TransATM extends Transaccion {
	private String terminal;
	private Agencia unAgencia;

	
	public String getTerminal() {
		return terminal;
	}






	public void setTerminal(String terminal) {
		this.terminal = terminal;
		
	}






	public Agencia getUnAgencia() {
		return unAgencia;
	}






	public void setUnAgencia(Agencia unAgencia) {
		this.unAgencia = unAgencia;
		
	}






	public TransATM(String codtrans, Date fechatrans, Date hora, String operacion, double importe, String codval,
			Cuenta unCuenta, String terminal, Agencia unAgencia) {
		super(codtrans, fechatrans, hora, operacion, importe, codval, unCuenta);
		this.terminal = terminal;
		this.unAgencia = unAgencia;
	}






	






	



	

}
