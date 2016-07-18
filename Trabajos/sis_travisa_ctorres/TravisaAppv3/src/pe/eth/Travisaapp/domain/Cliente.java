package pe.eth.Travisaapp.domain;


public class Cliente { 
 private String IDCLIENTE;
 private String NOMBRE;
 private String DIRECCION;
 private String RUCDNI;
 private String TELEFONO;

    public String getIDCLIENTE() {
        return IDCLIENTE;
    }

    public void setIDCLIENTE(String IDCLIENTE) {
        this.IDCLIENTE = IDCLIENTE;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getRUCDNI() {
        return RUCDNI;
    }

    public void setRUCDNI(String RUCDNI) {
        this.RUCDNI = RUCDNI;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }
 
}
