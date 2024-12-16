
package Modelo;

/**
 *
 * @author aberr
 */
public class VETERINARIO {
    String ID;
    String CEDULA;
    String NOMBRE;
    String DIRECCION;
    String CELULAR;

    public VETERINARIO() {
    }

    public VETERINARIO(String ID, String CEDULA, String NOMBRE, String DIRECCION, String CELULAR) {
        this.ID = ID;
        this.CEDULA = CEDULA;
        this.NOMBRE = NOMBRE;
        this.DIRECCION = DIRECCION;
        this.CELULAR = CELULAR;
    }

    public VETERINARIO(String CEDULA, String NOMBRE, String DIRECCION, String CELULAR) {
        this.CEDULA = CEDULA;
        this.NOMBRE = NOMBRE;
        this.DIRECCION = DIRECCION;
        this.CELULAR = CELULAR;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCEDULA() {
        return CEDULA;
    }

    public void setCEDULA(String CEDULA) {
        this.CEDULA = CEDULA;
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

    public String getCELULAR() {
        return CELULAR;
    }

    public void setCELULAR(String CELULAR) {
        this.CELULAR = CELULAR;
    }
    
    
}
