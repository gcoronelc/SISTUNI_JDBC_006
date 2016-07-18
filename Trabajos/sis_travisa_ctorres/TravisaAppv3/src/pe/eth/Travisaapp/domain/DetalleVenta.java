
package pe.eth.Travisaapp.domain;

/**
 *
 * @author CARLOS
 */
public class DetalleVenta {  
 private int IDVENTA;
 private String IDPRODUCTO;
 private double PRECIO;
 private int CANTIDAD;
 private double IMPORTE;

    public int getIDVENTA() {
        return IDVENTA;
    }

    public void setIDVENTA(int IDVENTA) {
        this.IDVENTA = IDVENTA;
    }

    public String getIDPRODUCTO() {
        return IDPRODUCTO;
    }

    public void setIDPRODUCTO(String IDPRODUCTO) {
        this.IDPRODUCTO = IDPRODUCTO;
    }

    public double getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(double PRECIO) {
        this.PRECIO = PRECIO;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public double getIMPORTE() {
        return IMPORTE;
    }

    public void setIMPORTE(double IMPORTE) {
        this.IMPORTE = IMPORTE;
    }
 
         
}
