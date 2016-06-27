package org.nh.cuentas;

import java.util.Date;

import org.nh.cajeros.Ventanilla;

public class TransCajero extends Transaccion {
	private Ventanilla cajero;

	public Ventanilla getCajero() {
		return cajero;
	}

	public void setCajero(Ventanilla cajero) {
		this.cajero = cajero;
	}

	public TransCajero(String codtrans, Date fechatrans, Date hora, String operacion, double importe, String codval,
			Cuenta unCuenta, Ventanilla cajero) {
		super(codtrans, fechatrans, hora, operacion, importe, codval, unCuenta);
		this.cajero = cajero;
	}

	public TransCajero(String codtrans, String operacion, double importe, String codval, Cuenta unCuenta,
			Ventanilla cajero) {
		super(codtrans, operacion, importe, codval, unCuenta);
		this.cajero = cajero;
	}

	
	

}
