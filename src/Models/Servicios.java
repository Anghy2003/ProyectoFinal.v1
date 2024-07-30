
package Models;


public class Servicios {
    private String codigo_Servicio;
    private String nombre_Servicio;
    private String descripcion_Servicio;
    private double precioTotal_Servicio;
    private String duracion_Servicio;
    private byte[] imagen;
    private Estado estado;
    private String Categoria;
   
 public enum Estado {
        ACTIVO,
        INACTIVO
    }
     public Servicios() {
    }

    public Servicios(String codigo_Servicio, String nombre_Servicio, String descripcion_Servicio, double precioTotal_Servicio, String duracion_Servicio, byte[] imagen, Estado estado, String Categoria) {
        this.codigo_Servicio = codigo_Servicio;
        this.nombre_Servicio = nombre_Servicio;
        this.descripcion_Servicio = descripcion_Servicio;
        this.precioTotal_Servicio = precioTotal_Servicio;
        this.duracion_Servicio = duracion_Servicio;
        this.imagen = imagen;
        this.estado = Estado.ACTIVO;
        this.Categoria = Categoria;
    }

    public String getCodigo_Servicio() {
        return codigo_Servicio;
    }

    public void setCodigo_Servicio(String codigo_Servicio) {
        this.codigo_Servicio = codigo_Servicio;
    }

    public String getNombre_Servicio() {
        return nombre_Servicio;
    }

    public void setNombre_Servicio(String nombre_Servicio) {
        this.nombre_Servicio = nombre_Servicio;
    }

    public String getDescripcion_Servicio() {
        return descripcion_Servicio;
    }

    public void setDescripcion_Servicio(String descripcion_Servicio) {
        this.descripcion_Servicio = descripcion_Servicio;
    }

    public double getPrecioTotal_Servicio() {
        return precioTotal_Servicio;
    }

    public void setPrecioTotal_Servicio(double precioTotal_Servicio) {
        this.precioTotal_Servicio = precioTotal_Servicio;
    }

    public String getDuracion_Servicio() {
        return duracion_Servicio;
    }

    public void setDuracion_Servicio(String duracion_Servicio) {
        this.duracion_Servicio = duracion_Servicio;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

  
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
