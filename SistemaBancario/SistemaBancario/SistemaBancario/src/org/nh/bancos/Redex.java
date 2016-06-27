package org.nh.bancos;


/*
 *  Representa a los comercios que realizan transacciones bancarias
 *  se llama Redex
 */
public class Redex {
	private String codigo;
	private String raz_social;   // razon social del establecimiento
	private Banco unBanco;
	private String dirección;
	private String tel;
	private String ubigeo;
	private String rep_legal;
	private String ruc;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getRaz_social() {
		return raz_social;
	}

	public void setRaz_social(String raz_social) {
		this.raz_social = raz_social;
	}

	public Banco getUnBanco() {
		return unBanco;
	}

	public void setUnBanco(Banco unBanco) {
		this.unBanco = unBanco;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getUbigeo() {
		return ubigeo;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}

	public String getRep_legal() {
		return rep_legal;
	}

	public void setRep_legal(String rep_legal) {
		this.rep_legal = rep_legal;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public Redex(String codigo, String raz_social, Banco unBanco, String dirección, String tel, String ubigeo,
			String rep_legal, String ruc) {
		this.codigo = codigo;
		this.raz_social = raz_social;
		this.unBanco = unBanco;
		this.dirección = dirección;
		this.tel = tel;
		this.ubigeo = ubigeo;
		this.rep_legal = rep_legal;
		this.ruc = ruc;
	}

}
