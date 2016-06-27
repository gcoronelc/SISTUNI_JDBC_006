package org.nh.bancos;

import org.nh.cajeros.Empleado;

public class Agencia {
	private String codigo;
	private Banco unBanco;
	private String direccion;
	private String telf;
	private String ubigeo;
	private Empleado gerente;

	
	public Empleado getGerente() {
		return gerente;
	}

	public void setGerente(Empleado gerente) {
		this.gerente = gerente;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Banco getUnBanco() {
		return unBanco;
	}

	public void setUnBanco(Banco unBanco) {
		this.unBanco = unBanco;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelf() {
		return telf;
	}

	public void setTelf(String telf) {
		this.telf = telf;
	}

	public String getUbigeo() {
		return ubigeo;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}

	public Agencia(String codigo, Banco unBanco,
			String direccion, String telf, String ubigeo, Empleado gerente) {
		this.codigo = codigo;
		this.unBanco = unBanco;
		this.direccion = direccion;
		this.telf = telf;
		this.ubigeo = ubigeo;
		this.gerente = gerente;
	}

	

	
}
