
package Models;

public class EncabezadoCita {
    
    private String codigo_encabezadoCita;
    private String fecha_encabezadoCita;
    private String cedulaCliente_encabezadoCita;
    private String cedulaMecanico_encabezadoCita;
    private String placaVehiculo_encabezadoCita;

    public EncabezadoCita(String codigo_encabezadoCita, String fecha_encabezadoCita, String cedulaCliente_encabezadoCita, String cedulaMecanico_encabezadoCita) {
        this.codigo_encabezadoCita = codigo_encabezadoCita;
        this.fecha_encabezadoCita = fecha_encabezadoCita;
        this.cedulaCliente_encabezadoCita = cedulaCliente_encabezadoCita;
        this.cedulaMecanico_encabezadoCita = cedulaMecanico_encabezadoCita;
        
    }
    
    
    
    

    @Override
    public String toString() {
        return "EncabezadoCita{" + "codigo_encabezadoCita=" + getCodigo_encabezadoCita() + ", fecha_encabezadoCita=" + getFecha_encabezadoCita() + ", cedulaCliente_encabezadoCita=" + getCedulaCliente_encabezadoCita() + ", cedulaMecanico_encabezadoCita=" + getCedulaMecanico_encabezadoCita() + ", placaVehiculo_encabezadoCita=" + getPlacaVehiculo_encabezadoCita() + '}';
    }

    /**
     * @return the codigo_encabezadoCita
     */
    public String getCodigo_encabezadoCita() {
        return codigo_encabezadoCita;
    }

    /**
     * @param codigo_encabezadoCita the codigo_encabezadoCita to set
     */
    public void setCodigo_encabezadoCita(String codigo_encabezadoCita) {
        this.codigo_encabezadoCita = codigo_encabezadoCita;
    }

    /**
     * @return the fecha_encabezadoCita
     */
    public String getFecha_encabezadoCita() {
        return fecha_encabezadoCita;
    }

    /**
     * @param fecha_encabezadoCita the fecha_encabezadoCita to set
     */
    public void setFecha_encabezadoCita(String fecha_encabezadoCita) {
        this.fecha_encabezadoCita = fecha_encabezadoCita;
    }

    /**
     * @return the cedulaCliente_encabezadoCita
     */
    public String getCedulaCliente_encabezadoCita() {
        return cedulaCliente_encabezadoCita;
    }

    /**
     * @param cedulaCliente_encabezadoCita the cedulaCliente_encabezadoCita to set
     */
    public void setCedulaCliente_encabezadoCita(String cedulaCliente_encabezadoCita) {
        this.cedulaCliente_encabezadoCita = cedulaCliente_encabezadoCita;
    }

    /**
     * @return the cedulaMecanico_encabezadoCita
     */
    public String getCedulaMecanico_encabezadoCita() {
        return cedulaMecanico_encabezadoCita;
    }

    /**
     * @param cedulaMecanico_encabezadoCita the cedulaMecanico_encabezadoCita to set
     */
    public void setCedulaMecanico_encabezadoCita(String cedulaMecanico_encabezadoCita) {
        this.cedulaMecanico_encabezadoCita = cedulaMecanico_encabezadoCita;
    }

    /**
     * @return the placaVehiculo_encabezadoCita
     */
    public String getPlacaVehiculo_encabezadoCita() {
        return placaVehiculo_encabezadoCita;
    }

    /**
     * @param placaVehiculo_encabezadoCita the placaVehiculo_encabezadoCita to set
     */
    public void setPlacaVehiculo_encabezadoCita(String placaVehiculo_encabezadoCita) {
        this.placaVehiculo_encabezadoCita = placaVehiculo_encabezadoCita;
    }
    
    
    
    
    
    
    
    
    
}
