package org.nh.cuentas;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

import org.nh.datos.Archivo;
import org.nh.datos.Conexion;

public class Cuenta {
	private String num_cuenta;
	private Date fec_apertura;
	private Cliente poseedor;
	private String tipo;
	private String tipo_moneda;
	private double saldo;
	private double limite;
	
	
	public Cuenta(String num_cuenta,Date fec_apertura,
			Cliente poseedor,String tipo,String tipo_moneda,
	double saldo, double limite){
		this.fec_apertura= fec_apertura;
		this.limite= limite;
		this.num_cuenta= num_cuenta;
		this.poseedor= poseedor;
		this.saldo= saldo;
		this.tipo= tipo;
		this.tipo_moneda= tipo_moneda;
	}
	
	public Cuenta(String num_cuenta, Cliente poseedor, 
			String tipo, String tipo_moneda, double saldo) {
		this.num_cuenta = num_cuenta;
		this.poseedor = poseedor;
		this.tipo = tipo;
		this.tipo_moneda = tipo_moneda;
		this.saldo = saldo;
		this.limite = 15000.00;
		this.fec_apertura = new Date();
	}

	public Cuenta() {
		// TODO Auto-generated constructor stub
		this.limite = 15000.00;
		this.fec_apertura = new Date();
	}
	public String getNum_cuenta() {
		return num_cuenta;
	}
	public void setNum_cuenta(String num_cuenta) {
		this.num_cuenta = num_cuenta;
	}
	public Date getFec_apertura() {
		return fec_apertura;
	}
	public void setFec_apertura(Date fec_apertura) {
		this.fec_apertura = fec_apertura;
	}
	public Cliente getPoseedor() {
		return poseedor;
	}
	public void setPoseedor(Cliente poseedor) {
		this.poseedor = poseedor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo_moneda() {
		return tipo_moneda;
	}
	public void setTipo_moneda(String tipo_moneda) {
		this.tipo_moneda = tipo_moneda;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	/**
	 * Este metodo permite convertir un monto de dinero de un tipo de 
	 * moneda a otro
	 * @param mini moneda inicial
	 * @param mfin   moneda final
	 * @param monto  cantidad de dinero a cambiar
	 * @return   monto de dinero obtenido en la moneda final
	 */
	public double cambio_actual(double mini,double mfin,
			double monto){
		return 0;
	}
	public String tipo_cuenta(){
		return this.tipo+" "+this.tipo_moneda;
	}

	public boolean guardar_nueva_cuenta() {
		// TODO Auto-generated method stub
		Archivo xarchivo = new Archivo();
		return xarchivo.guardar_cuenta(this);
	}

	public int leer_datos_archivo() {
		// TODO Auto-generated method stub
		Archivo xarchivo = new Archivo();
		ArrayList relacion = xarchivo.lista_cuentas();
		Conexion xcon = new Conexion();
		return xcon.guardar_cuentas(relacion);
	}

	public LinkedList<String[]> lista_cuentas(String codigo) {
		// TODO Auto-generated method stub
		Conexion xcon = new Conexion();
		return xcon.relacion_cuentas(codigo);
	}

	public boolean insertar_transaccion(double imonto,
			String[] dcuenta, int ioperar, double nsaldo) {
		// TODO Auto-generated method stub
		boolean completo =false;
		Conexion xcon = new Conexion();
		boolean realizado= xcon.ingresar_transaccion(imonto,dcuenta,ioperar);
		if(realizado){
			completo = xcon.actualizar_saldo_cuenta(dcuenta,nsaldo);
		}
		return completo;
	}
}
