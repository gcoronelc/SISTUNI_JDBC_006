package org.nh.cajeros;

import java.util.Date;

public class Empleado {
	private String codigo;
	private String apellidos;
	private String nombres;
	private Date fec_nac;
	private Date fec_ing;
	private String afp;
	private String direcci�n;
	private String telf;
	
	

	public Empleado(String codigo, String apellidos,
			String nombres) {
		this.codigo = codigo;
		this.apellidos = apellidos;
		this.nombres = nombres;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public Date getFec_nac() {
		return fec_nac;
	}

	public void setFec_nac(Date fec_nac) {
		this.fec_nac = fec_nac;
	}

	public Date getFec_ing() {
		return fec_ing;
	}

	public void setFec_ing(Date fec_ing) {
		this.fec_ing = fec_ing;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getDirecci�n() {
		return direcci�n;
	}

	public void setDirecci�n(String direcci�n) {
		this.direcci�n = direcci�n;
	}

	public String getTelf() {
		return telf;
	}

	public void setTelf(String telf) {
		this.telf = telf;
	}

	public Empleado(String codigo, String apellidos, String nombres, Date fec_nac, Date fec_ing, String afp,
			String direcci�n, String telf) {
		this.codigo = codigo;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.fec_nac = fec_nac;
		this.fec_ing = fec_ing;
		this.afp = afp;
		this.direcci�n = direcci�n;
		this.telf = telf;
	}

}
