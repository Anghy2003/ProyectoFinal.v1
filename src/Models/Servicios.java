
package Models;


public class Servicios {
    private String codigo_Servicio;
    private String nombre_Servicio;
    private String descripcion_Servicio;
    private double precioTotal_Servicio;
    private String duracion_Servicio;
    private byte[] imagen;
    private Estado estado;  
   
 public enum Estado {
        ACTIVO,
        INACTIVO
    }
     public Servicios() {
    }

    public Servicios(String codigo_Servicio, String nombre_Servicio, String descripcion_Servicio, double precioTotal_Servicio,
            String duracion_Servicio, byte[] imagen, Estado estado) {
        this.codigo_Servicio = codigo_Servicio;
        this.nombre_Servicio = nombre_Servicio;
        this.descripcion_Servicio = descripcion_Servicio;
        this.precioTotal_Servicio = precioTotal_Servicio;
        this.duracion_Servicio = duracion_Servicio;
        this.imagen = imagen;
        this.estado = estado;
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
     * @return the nombre_Servicio
     */
    public String getNombre_Servicio() {
        return nombre_Servicio;
    }

    /**
     * @param nombre_Servicio the nombre_Servicio to set
     */
    public void setNombre_Servicio(String nombre_Servicio) {
        this.nombre_Servicio = nombre_Servicio;
    }

    /**
     * @return the descripcion_Servicio
     */
    public String getDescripcion_Servicio() {
        return descripcion_Servicio;
    }

    /**
     * @param descripcion_Servicio the descripcion_Servicio to set
     */
    public void setDescripcion_Servicio(String descripcion_Servicio) {
        this.descripcion_Servicio = descripcion_Servicio;
    }

    /**
     * @return the precioTotal_Servicio
     */
    public double getPrecioTotal_Servicio() {
        return precioTotal_Servicio;
    }

    /**
     * @param precioTotal_Servicio the precioTotal_Servicio to set
     */
    public void setPrecioTotal_Servicio(double precioTotal_Servicio) {
        this.precioTotal_Servicio = precioTotal_Servicio;
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
     * @return the imagen
     */
    public byte[] getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
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
    //METODOS
    public  void activarServicio() {
        this.estado = Estado.ACTIVO;
    }

    public  void desactivarServicio() {
        this.estado = Estado.INACTIVO;
    }
    
}
