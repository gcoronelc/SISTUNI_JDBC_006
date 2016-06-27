package org.nh.cajeros;

import org.nh.bancos.Agencia;

public class Ventanilla {
	private int numv;
	private Agencia unAgencia;
	private Empleado cajero;

	public int getNumv() {
		return numv;
	}

	public void setNumv(int numv) {
		this.numv = numv;
	}

	public Agencia getUnAgencia() {
		return unAgencia;
	}

	public void setUnAgencia(Agencia unAgencia) {
		this.unAgencia = unAgencia;
	}

	public Empleado getCajero() {
		return cajero;
	}

	public void setCajero(Empleado cajero) {
		this.cajero = cajero;
	}

	public Ventanilla(int numv, Agencia unAgencia, Empleado cajero) {
		this.numv = numv;
		this.unAgencia = unAgencia;
		this.cajero = cajero;
	}

}
