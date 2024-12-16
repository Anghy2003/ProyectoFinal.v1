
package Modelo;

/**
 *
 * @author aberr
 */
public class VACUNA {
    String ID;
    String TIPO;
    String NOMBRE;
    String FECHA_CREACION;
    String FECHA_EXPIRACION;
    

    public VACUNA() {
    }

    public VACUNA(String ID, String TIPO, String NOMBRE, String FECHA_CREACION, String FECHA_EXPIRACION) {
        this.ID = ID;
        this.TIPO = TIPO;
        this.NOMBRE = NOMBRE;
        this.FECHA_CREACION = FECHA_CREACION;
        this.FECHA_EXPIRACION = FECHA_EXPIRACION;
    }

    public VACUNA(String TIPO, String NOMBRE, String FECHA_CREACION, String FECHA_EXPIRACION) {
        this.TIPO = TIPO;
        this.NOMBRE = NOMBRE;
        this.FECHA_CREACION = FECHA_CREACION;
        this.FECHA_EXPIRACION = FECHA_EXPIRACION;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getFECHA_CREACION() {
        return FECHA_CREACION;
    }

    public void setFECHA_CREACION(String FECHA_CREACION) {
        this.FECHA_CREACION = FECHA_CREACION;
    }

    public String getFECHA_EXPIRACION() {
        return FECHA_EXPIRACION;
    }

    public void setFECHA_EXPIRACION(String FECHA_EXPIRACION) {
        this.FECHA_EXPIRACION = FECHA_EXPIRACION;
    }
    
    
}
