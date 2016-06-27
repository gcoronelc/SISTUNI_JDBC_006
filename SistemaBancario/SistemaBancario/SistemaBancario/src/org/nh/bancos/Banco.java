package org.nh.bancos;

import org.nh.cuentas.TransATM;

public class Banco {
	private String codigo;
	private String descripci�n;
	private String dom_fiscal;
	private String telefono;
	private String email;
	private String rep_legal;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripci�n() {
		return descripci�n;
	}

	public void setDescripci�n(String descripci�n) {
		this.descripci�n = descripci�n;
	}

	public String getDom_fiscal() {
		return dom_fiscal;
	}

	public void setDom_fiscal(String dom_fiscal) {
		this.dom_fiscal = dom_fiscal;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRep_legal() {
		return rep_legal;
	}

	public void setRep_legal(String rep_legal) {
		this.rep_legal = rep_legal;
		
		
	}

	public Banco(String codigo, String descripci�n, String dom_fiscal, String telefono, String email,
			String rep_legal) {
		this.codigo = codigo;
		this.descripci�n = descripci�n;
		this.dom_fiscal = dom_fiscal;
		this.telefono = telefono;
		this.email = email;
		this.rep_legal = rep_legal;
	}

}
