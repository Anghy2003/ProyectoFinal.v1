
package Models;

/**
 *
 * @author aberr
 */
public class Cita {
    private String Codigo_cita;
    private String fecha_cita;
    private String cedula_cliente;
    private String codigo_servicio;
    private String hora;

    public Cita() {
    }

    public Cita(String Codigo_cita, String fecha_cita, String cedula_cliente, String codigo_servicio, String hora) {
        this.Codigo_cita = Codigo_cita;
        this.fecha_cita = fecha_cita;
        this.cedula_cliente = cedula_cliente;
        this.codigo_servicio = codigo_servicio;
        this.hora = hora;
    }

    /**
     * @return the Codigo_cita
     */
    public String getCodigo_cita() {
        return Codigo_cita;
    }

    /**
     * @param Codigo_cita the Codigo_cita to set
     */
    public void setCodigo_cita(String Codigo_cita) {
        this.Codigo_cita = Codigo_cita;
    }

    /**
     * @return the fecha_cita
     */
    public String getFecha_cita() {
        return fecha_cita;
    }

    /**
     * @param fecha_cita the fecha_cita to set
     */
    public void setFecha_cita(String fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    /**
     * @return the cedula_cliente
     */
    public String getCedula_cliente() {
        return cedula_cliente;
    }

    /**
     * @param cedula_cliente the cedula_cliente to set
     */
    public void setCedula_cliente(String cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    /**
     * @return the codigo_servicio
     */
    public String getCodigo_servicio() {
        return codigo_servicio;
    }

    /**
     * @param codigo_servicio the codigo_servicio to set
     */
    public void setCodigo_servicio(String codigo_servicio) {
        this.codigo_servicio = codigo_servicio;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }
    
   
    
}
