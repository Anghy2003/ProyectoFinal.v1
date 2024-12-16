
package Modelo;

/**
 *
 * @author aberr
 */
public class VETERINARIO {
    String CEDULA;
    String NOMBRE;
    String DIRECCION;
    String CELULAR;
    String ID_VETERINARIO;

    public VETERINARIO() {
    }

    public VETERINARIO(String CEDULA, String NOMBRE, String DIRECCION, String CELULAR, String ID_VETERINARIO) {
        this.CEDULA = CEDULA;
        this.NOMBRE = NOMBRE;
        this.DIRECCION = DIRECCION;
        this.CELULAR = CELULAR;
        this.ID_VETERINARIO = ID_VETERINARIO;
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

    public String getID_VETERINARIO() {
        return ID_VETERINARIO;
    }

    public void setID_VETERINARIO(String ID_VETERINARIO) {
        this.ID_VETERINARIO = ID_VETERINARIO;
    }

    @Override
    public String toString() {
        return "VETERINARIO{" + "CEDULA=" + CEDULA + ", NOMBRE=" + NOMBRE + ", DIRECCION=" + DIRECCION + ", CELULAR=" + CELULAR + ", ID_VETERINARIO=" + ID_VETERINARIO + '}';
    }
    
    
}
