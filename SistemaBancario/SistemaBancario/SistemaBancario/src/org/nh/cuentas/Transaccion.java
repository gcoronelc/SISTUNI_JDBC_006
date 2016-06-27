package org.nh.cuentas;

import java.util.Date;

public class Transaccion {
	private String codtrans;
	private Date fechatrans;
	private Date hora;
	private String operacion;
	private double importe;
	private String codval;
	private Cuenta unCuenta;
	

	public Transaccion(String codtrans, Date fechatrans,
			Date hora, String operacion, double importe,
			String codval,
			Cuenta unCuenta) {
		this.codtrans = codtrans;
		this.fechatrans = fechatrans;
		this.hora = hora;
		this.operacion = operacion;
		this.importe = importe;
		this.codval = codval;
		this.unCuenta = unCuenta;
	}

	public Transaccion(String codtrans, String operacion,
			double importe, String codval, Cuenta unCuenta) {
		this.codtrans = codtrans;
		this.operacion = operacion;
		this.importe = importe;
		this.codval = codval;
		this.unCuenta = unCuenta;
		this.fechatrans= new Date();
		this.hora= new Date();
	}

	public Cuenta getUnCuenta() {
		return unCuenta;
	}

	public void setUnCuenta(Cuenta unCuenta) {
		this.unCuenta = unCuenta;
	}

	public String getCodtrans() {
		return codtrans;
	}

	public void setCodtrans(String codtrans) {
		this.codtrans = codtrans;
	}

	public Date getFechatrans() {
		return fechatrans;
	}

	public void setFechatrans(Date fechatrans) {
		this.fechatrans = fechatrans;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getCodval() {
		return codval;
	}

	public void setCodval(String codval) {
		this.codval = codval;
	}

	

	

	
}
