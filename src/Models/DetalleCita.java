
package Models;

public class DetalleCita {
    
    private String codigo_encabezadoCita;
    private double precioServicio_detallecita;
    private String codigoServicio_detallecita;
    private double precioToral_detallecita;

    public DetalleCita(String codigoServicio_detallecita) {
        this.codigoServicio_detallecita = codigoServicio_detallecita;
    }

    public DetalleCita(String codigo_encabezadoCita, double precioServicio_detallecita, String codigoServicio_detallecita) {
        this.codigo_encabezadoCita = codigo_encabezadoCita;
        this.precioServicio_detallecita = precioServicio_detallecita;
        this.codigoServicio_detallecita = codigoServicio_detallecita;
    }

    public DetalleCita(double precioServicio_detallecita, String codigoServicio_detallecita) {
        this.precioServicio_detallecita = precioServicio_detallecita;
        this.codigoServicio_detallecita = codigoServicio_detallecita;
    }

    
    
    
    

    @Override
    public String toString() {
        return "DetalleCita{" + "codigo_encabezadoCita=" + getCodigo_encabezadoCita() + ", precioServicio_detallecita=" + getPrecioServicio_detallecita() + ", codigoServicio_detallecita=" + getCodigoServicio_detallecita() + ", precioToral_detallecita=" + getPrecioToral_detallecita() + '}';
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
     * @return the precioServicio_detallecita
     */
    public double getPrecioServicio_detallecita() {
        return precioServicio_detallecita;
    }

    /**
     * @param precioServicio_detallecita the precioServicio_detallecita to set
     */
    public void setPrecioServicio_detallecita(double precioServicio_detallecita) {
        this.precioServicio_detallecita = precioServicio_detallecita;
    }

    /**
     * @return the codigoServicio_detallecita
     */
    public String getCodigoServicio_detallecita() {
        return codigoServicio_detallecita;
    }

    /**
     * @param codigoServicio_detallecita the codigoServicio_detallecita to set
     */
    public void setCodigoServicio_detallecita(String codigoServicio_detallecita) {
        this.codigoServicio_detallecita = codigoServicio_detallecita;
    }

    /**
     * @return the precioToral_detallecita
     */
    public double getPrecioToral_detallecita() {
        return precioToral_detallecita;
    }

    /**
     * @param precioToral_detallecita the precioToral_detallecita to set
     */
    public void setPrecioToral_detallecita(double precioToral_detallecita) {
        this.precioToral_detallecita = precioToral_detallecita;
    }
    
    
    
}
