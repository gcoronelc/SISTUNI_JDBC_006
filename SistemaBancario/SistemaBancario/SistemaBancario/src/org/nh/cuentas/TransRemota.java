package org.nh.cuentas;

import java.util.Date;

import org.nh.bancos.Redex;
import org.nh.cajeros.Ventanilla;

public class TransRemota extends Transaccion {
	private Redex unRedex;

	

	public Redex getUnRedex() {
		return unRedex;
	}



	public void setUnRedex(Redex unRedex) {
		this.unRedex = unRedex;
	}



	public TransRemota(String codtrans, Date fechatrans,
			Date hora, String operacion, double importe, String codval,
			Cuenta unCuenta, Redex unRedex) {
		super(codtrans, fechatrans, hora, operacion,
				importe, codval, unCuenta);
		this.unRedex = unRedex;
	}



	

}
