
package Models;
public class Producto {
    private String codigo_Producto;
    private String nombre_Producto;
    private Double precio_Producto;
    private String codigo_categoria_Producto;
    private int numeroProductos_Producto;
    private int existenciaMaxima_Producto;
    private int existenciaMinima_Producto;
    private String descripcion_Producto;
    private String ID_Proveedor_Producto;
    private byte[] imagen;
    private Estado estado; 
    
    //haremos que tenga solo dos posibles valores
     public enum Estado {
        ACTIVO,
        INACTIVO
    }
    public Producto() {
    }

    

    public Producto(String codigo_Producto, String nombre_Producto, Double precio_Producto, String codigo_categoria_Producto,
            int numeroProductos_Producto, int existenciaMaxima_Producto, int existenciaMinima_Producto, String descripcion_Producto, 
            String ID_Proveedor_Producto, byte[] imagen, Estado estado) {
        this.codigo_Producto = codigo_Producto;
        this.nombre_Producto = nombre_Producto;
        this.precio_Producto = precio_Producto;
        this.codigo_categoria_Producto = codigo_categoria_Producto;
        this.numeroProductos_Producto = numeroProductos_Producto;
        this.existenciaMaxima_Producto = existenciaMaxima_Producto;
        this.existenciaMinima_Producto = existenciaMinima_Producto;
        this.descripcion_Producto = descripcion_Producto;
        this.ID_Proveedor_Producto = ID_Proveedor_Producto;
        this.imagen = imagen;
        this.estado = Estado.ACTIVO;
    }

    public byte[] getImagen() {
        return imagen;
    }
     public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
   

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getCodigo_Producto() {
        return codigo_Producto;
    }

    public void setCodigo_Producto(String codigo_Producto) {
        this.codigo_Producto = codigo_Producto;
    }

    public String getNombre_Producto() {
        return nombre_Producto;
    }

    public void setNombre_Producto(String nombre_Producto) {
        this.nombre_Producto = nombre_Producto;
    }

    public Double getPrecio_Producto() {
        return precio_Producto;
    }

    public void setPrecio_Producto(Double precio_Producto) {
        this.precio_Producto = precio_Producto;
    }

    public String getCodigo_categoria_Producto() {
        return codigo_categoria_Producto;
    }

    public void setCodigo_categoria_Producto(String codigo_categoria_Producto) {
        this.codigo_categoria_Producto = codigo_categoria_Producto;
    }

    public int getNumeroProductos_Producto() {
        return numeroProductos_Producto;
    }

    public void setNumeroProductos_Producto(int numeroProductos_Producto) {
        this.numeroProductos_Producto = numeroProductos_Producto;
    }

    public int getExistenciaMaxima_Producto() {
        return existenciaMaxima_Producto;
    }

    public void setExistenciaMaxima_Producto(int existenciaMaxima_Producto) {
        this.existenciaMaxima_Producto = existenciaMaxima_Producto;
    }

    public int getExistenciaMinima_Producto() {
        return existenciaMinima_Producto;
    }

    public void setExistenciaMinima_Producto(int existenciaMinima_Producto) {
        this.existenciaMinima_Producto = existenciaMinima_Producto;
    }

    public String getDescripcion_Producto() {
        return descripcion_Producto;
    }

    public void setDescripcion_Producto(String descripcion_Producto) {
        this.descripcion_Producto = descripcion_Producto;
    }

    public String getID_Proveedor_Producto() {
        return ID_Proveedor_Producto;
    }

    public void setID_Proveedor_Producto(String ID_Proveedor_Producto) {
        this.ID_Proveedor_Producto = ID_Proveedor_Producto;
    }
    //METODOS
    public  void activarProducto() {
        this.estado = Estado.ACTIVO;
    }

    public  void desactivarProducto() {
        this.estado = Estado.INACTIVO;
    }

   public int restarCantidad(int cantidad) {
    if (cantidad <= this.numeroProductos_Producto) {
        this.numeroProductos_Producto -= cantidad;
        return this.numeroProductos_Producto;
    } else {
        return -1; // Indicador de que no hay suficiente stock
    }
}
    
}
