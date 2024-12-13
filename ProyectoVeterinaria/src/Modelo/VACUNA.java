
package Modelo;

/**
 *
 * @author aberr
 */
public class VACUNA {
    String TIPO;
    String NOMBRE;
    String FECHA_CREACION;
    String FECHA_EXPIRACION;
    String ID_VACUNA;

    public VACUNA() {
    }

    public VACUNA(String TIPO, String NOMBRE, String FECHA_CREACION, String FECHA_EXPIRACION, String ID_VACUNA) {
        this.TIPO = TIPO;
        this.NOMBRE = NOMBRE;
        this.FECHA_CREACION = FECHA_CREACION;
        this.FECHA_EXPIRACION = FECHA_EXPIRACION;
        this.ID_VACUNA = ID_VACUNA;
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

    public String getID_VACUNA() {
        return ID_VACUNA;
    }

    public void setID_VACUNA(String ID_VACUNA) {
        this.ID_VACUNA = ID_VACUNA;
    }

    @Override
    public String toString() {
        return "VACUNA{" + "TIPO=" + TIPO + ", NOMBRE=" + NOMBRE + ", FECHA_CREACION=" + FECHA_CREACION + ", FECHA_EXPIRACION=" + FECHA_EXPIRACION + ", ID_VACUNA=" + ID_VACUNA + '}';
    }
    
    
    
}
