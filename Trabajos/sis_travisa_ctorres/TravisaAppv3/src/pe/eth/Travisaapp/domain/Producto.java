/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.eth.Travisaapp.domain;

/**
 *
 * @author Alumno
 */
public class Producto {
     private String IDPRODUCTO;
 private String DESCRIPCION;
private int IDCATEGORIA;
 private double PRECIOVENTA;
 private double PRECIOCOMPRA;
 private int STOCK;

    public Producto() {
    }

    public String getIDPRODUCTO() {
        return IDPRODUCTO;
    }

    public void setIDPRODUCTO(String IDPRODUCTO) {
        this.IDPRODUCTO = IDPRODUCTO;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public int getIDCATEGORIA() {
        return IDCATEGORIA;
    }

    public void setIDCATEGORIA(int IDCATEGORIA) {
        this.IDCATEGORIA = IDCATEGORIA;
    }

    public double getPRECIOVENTA() {
        return PRECIOVENTA;
    }

    public void setPRECIOVENTA(double PRECIOVENTA) {
        this.PRECIOVENTA = PRECIOVENTA;
    }

    public double getPRECIOCOMPRA() {
        return PRECIOCOMPRA;
    }

    public void setPRECIOCOMPRA(double PRECIOCOMPRA) {
        this.PRECIOCOMPRA = PRECIOCOMPRA;
    }

    public int getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(int STOCK) {
        this.STOCK = STOCK;
    }
 
}
