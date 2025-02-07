
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
    private String codigo_Servicio;
    private double precioTotal;
    private String duracion_Servicio;
    private String Id_mecanico;
    private String placa_Vehiculo;
    private Estado estado;
    
    //haremos que tenga solo dos posibles valores
    public enum Estado {
        ACTIVO,
        INACTIVO
    }
    

    public Cita() {
    }

    public Cita(String Codigo_cita, String fecha_cita, String cedula_cliente, String codigo_servicio, String hora, String codigo_Servicio,
            double precioTotal, String duracion_Servicio, String Id_mecanico, String placa_Vehiculo, Estado estado) {
        this.Codigo_cita = Codigo_cita;
        this.fecha_cita = fecha_cita;
        this.cedula_cliente = cedula_cliente;
        this.codigo_servicio = codigo_servicio;
        this.hora = hora;
        this.codigo_Servicio = codigo_Servicio;
        this.precioTotal = precioTotal;
        this.duracion_Servicio = duracion_Servicio;
        this.Id_mecanico = Id_mecanico;
        this.placa_Vehiculo = placa_Vehiculo;
        this.estado = Estado.ACTIVO;
    }
    
    
    
    //METODOS
    public  void activarCita() {
        this.setEstado(Estado.ACTIVO);
    }

    public  void desactivarCita() {
        this.setEstado(Estado.INACTIVO);
    } 
   //getter

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

    /**
     * @return the codigo_Servicio
     */
    public String getCodigo_Servicio() {
        return codigo_Servicio;
    }

    /**
     * @param codigo_Servicio the codigo_Servicio to set
     */
    public void setCodigo_Servicio(String codigo_Servicio) {
        this.codigo_Servicio = codigo_Servicio;
    }

    /**
     * @return the precioTotal
     */
    public double getPrecioTotal() {
        return precioTotal;
    }

    /**
     * @param precioTotal the precioTotal to set
     */
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    /**
     * @return the duracion_Servicio
     */
    public String getDuracion_Servicio() {
        return duracion_Servicio;
    }

    /**
     * @param duracion_Servicio the duracion_Servicio to set
     */
    public void setDuracion_Servicio(String duracion_Servicio) {
        this.duracion_Servicio = duracion_Servicio;
    }

    /**
     * @return the Id_mecanico
     */
    public String getId_mecanico() {
        return Id_mecanico;
    }

    /**
     * @param Id_mecanico the Id_mecanico to set
     */
    public void setId_mecanico(String Id_mecanico) {
        this.Id_mecanico = Id_mecanico;
    }

    /**
     * @return the placa_Vehiculo
     */
    public String getPlaca_Vehiculo() {
        return placa_Vehiculo;
    }

    /**
     * @param placa_Vehiculo the placa_Vehiculo to set
     */
    public void setPlaca_Vehiculo(String placa_Vehiculo) {
        this.placa_Vehiculo = placa_Vehiculo;
    }

    /**
     * @return the estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
   
    
}
