
package pe.eth.Travisaapp.domain;

/**
 *
 * @author CARLOS
 */
public class ventas {
 private int IDVENTA;
 private String IDCLIENTE;
 private String IDEMPLEADO;
 //private String TIPODOC;
 private String NRODOC;
private String FECHA;
 private double TOTAL; 

    public int getIDVENTA() {
        return IDVENTA;
    }

    public void setIDVENTA(int IDVENTA) {
        this.IDVENTA = IDVENTA;
    }

    public String getIDCLIENTE() {
        return IDCLIENTE;
    }

    public void setIDCLIENTE(String IDCLIENTE) {
        this.IDCLIENTE = IDCLIENTE;
    }

    public String getIDEMPLEADO() {
        return IDEMPLEADO;
    }

    public void setIDEMPLEADO(String IDEMPLEADO) {
        this.IDEMPLEADO = IDEMPLEADO;
    }

//    public String getTIPODOC() {
//        return TIPODOC;
//    }
//
//    public void setTIPODOC(String TIPODOC) {
//        this.TIPODOC = TIPODOC;
//    }

    public String getNRODOC() {
        return NRODOC;
    }

    public void setNRODOC(String NRODOC) {
        this.NRODOC = NRODOC;
    }

    public String getFECHA() {
        return FECHA;
    }

    public void setFECHA(String FECHA) {
        this.FECHA = FECHA;
    }

    public double getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(double TOTAL) {
        this.TOTAL = TOTAL;
    }
 
 
}
