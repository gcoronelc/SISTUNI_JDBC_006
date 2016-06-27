package org.nh.cuentas;

import java.sql.Connection;

import org.nh.datos.Conexion;

public class Usuario {
	
	private String codusuario;
	private String nombre;
	private String alias;
	private String clave;
	private int perfil;
	public String getCodusuario() {
		return codusuario;
	}
	public void setCodusuario(String codusuario) {
		this.codusuario = codusuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public int getPerfil() {
		return perfil;
	}
	public void setPerfil(int perfil) {
		this.perfil = perfil;
	}
	public Usuario(String codusuario, String nombre, 
			String alias, String clave, int perfil) {
		this.codusuario = codusuario;
		this.nombre = nombre;
		this.alias = alias;
		this.clave = clave;
		this.perfil = perfil;
	}
	public Usuario(String codusuario, String nombre,
			String alias, String clave) {
		this.codusuario = codusuario;
		this.nombre = nombre;
		this.alias = alias;
		this.clave = clave;
		this.perfil = 2;
	}
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	public String verif_usuario(String xusuario, String xclave) {
		// TODO Auto-generated method stub
		Conexion xcon = new Conexion();
		return xcon.encontrar_usuario(xusuario,xclave);
	}

}
