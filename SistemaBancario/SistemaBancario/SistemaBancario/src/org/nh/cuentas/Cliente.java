package org.nh.cuentas;

import java.util.ArrayList;
import java.util.Date;

import org.nh.datos.Archivo;
import org.nh.datos.Conexion;

public class Cliente {
	private String codigo;
	private String apellidos;
	private String nombres;
	private Date fec_nac;
	private String direccion;
	private String dni;
	private String sexo;
	private String est_civil;
	
	
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEst_civil() {
		return est_civil;
	}
	public void setEst_civil(String est_civil) {
		this.est_civil = est_civil;
	}
	public Cliente(String codigo, String apellidos, String nombres, Date fec_nac, String direccion, String dni,
			String sexo, String est_civil) {
		this.codigo = codigo;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.fec_nac = fec_nac;
		this.direccion = direccion;
		this.dni = dni;
		this.sexo = sexo;
		this.est_civil = est_civil;
	}
	public Cliente() {
		// TODO Auto-generated constructor stub
		
	}
	
    public Cliente(String codigo) {
		this.codigo = codigo;
	}
	public String nombre_completo(){
    	return this.apellidos+" "+this.nombres;
    }
	public boolean crear_cliente() {
		// TODO Auto-generated method stub
		Archivo xarchivo = new Archivo();
		return xarchivo.guardar_cliente(this);
	}
	public String[] ubicar_cliente(String ccliente) {
		// TODO Auto-generated method stub
		Archivo xarchivo = new Archivo();
		return xarchivo.datos_cliente(ccliente);
	}
	public int leer_datos_archivo() {
		// TODO Auto-generated method stub
		Archivo xarchivo = new Archivo();
		ArrayList relacion = xarchivo.lista_clientes();
		Conexion xcon = new Conexion();
		return xcon.guardar_clientes(relacion);
	}
	public String nombre_cliente(String codigo2) {
		// TODO Auto-generated method stub
		Conexion xcon = new Conexion();
		return xcon.buscar_nombre_cliente(codigo2);
	}
}
