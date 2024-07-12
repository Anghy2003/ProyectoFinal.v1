
package Models;
public class Producto {
    private String codigo_Producto;
    private String nombre_Producto;
    private Double precio_Producto;
    private String codigo_categoria_Producto;
    private int numeroProductos_Producto;
    private int existrenciaMaxima_Producto;
    private int existenciaMinima_Producto;
    private String descripcion_Producto;
    private String ID_Proveedor_Producto;
    private static int contadorProductos = 0;

    public Producto() {
    }
    public Producto(String codigo_Producto, String nombre_Producto, Double precio_Producto, String codigo_categoria_Producto, int numeroProductos_Producto, int existrenciaMaxima_Producto, int existenciaMinima_Producto, String descripcion_Producto, String ID_Proveedor_Producto) {
        this.codigo_Producto = "PROD_" + (++contadorProductos);
        this.nombre_Producto = nombre_Producto;
        this.precio_Producto = precio_Producto;
        this.codigo_categoria_Producto = codigo_categoria_Producto;
        this.numeroProductos_Producto = numeroProductos_Producto;
        this.existrenciaMaxima_Producto = existrenciaMaxima_Producto;
        this.existenciaMinima_Producto = existenciaMinima_Producto;
        this.descripcion_Producto = descripcion_Producto;
        this.ID_Proveedor_Producto = ID_Proveedor_Producto;
        
    }

    /**
     * @return the codigo_Producto
     */
    public String getCodigo_Producto() {
        return codigo_Producto;
    }

    /**
     * @param codigo_Producto the codigo_Producto to set
     */
    public void setCodigo_Producto(String codigo_Producto) {
        this.codigo_Producto = codigo_Producto;
    }

    /**
     * @return the nombre_Producto
     */
    public String getNombre_Producto() {
        return nombre_Producto;
    }

    /**
     * @param nombre_Producto the nombre_Producto to set
     */
    public void setNombre_Producto(String nombre_Producto) {
        this.nombre_Producto = nombre_Producto;
    }

    /**
     * @return the precio_Producto
     */
    public Double getPrecio_Producto() {
        return precio_Producto;
    }

    /**
     * @param precio_Producto the precio_Producto to set
     */
    public void setPrecio_Producto(Double precio_Producto) {
        this.precio_Producto = precio_Producto;
    }

    /**
     * @return the codigo_categoria_Producto
     */
    public String getCodigo_categoria_Producto() {
        return codigo_categoria_Producto;
    }

    /**
     * @param codigo_categoria_Producto the codigo_categoria_Producto to set
     */
    public void setCodigo_categoria_Producto(String codigo_categoria_Producto) {
        this.codigo_categoria_Producto = codigo_categoria_Producto;
    }

    /**
     * @return the numeroProductos_Producto
     */
    public int getNumeroProductos_Producto() {
        return numeroProductos_Producto;
    }

    /**
     * @param numeroProductos_Producto the numeroProductos_Producto to set
     */
    public void setNumeroProductos_Producto(int numeroProductos_Producto) {
        this.numeroProductos_Producto = numeroProductos_Producto;
    }

    /**
     * @return the existrenciaMaxima_Producto
     */
    public int getExistrenciaMaxima_Producto() {
        return existrenciaMaxima_Producto;
    }

    /**
     * @param existrenciaMaxima_Producto the existrenciaMaxima_Producto to set
     */
    public void setExistrenciaMaxima_Producto(int existrenciaMaxima_Producto) {
        this.existrenciaMaxima_Producto = existrenciaMaxima_Producto;
    }

    /**
     * @return the existenciaMinima_Producto
     */
    public int getExistenciaMinima_Producto() {
        return existenciaMinima_Producto;
    }

    /**
     * @param existenciaMinima_Producto the existenciaMinima_Producto to set
     */
    public void setExistenciaMinima_Producto(int existenciaMinima_Producto) {
        this.existenciaMinima_Producto = existenciaMinima_Producto;
    }

    /**
     * @return the descripcion_Producto
     */
    public String getDescripcion_Producto() {
        return descripcion_Producto;
    }

    /**
     * @param descripcion_Producto the descripcion_Producto to set
     */
    public void setDescripcion_Producto(String descripcion_Producto) {
        this.descripcion_Producto = descripcion_Producto;
    }

    /**
     * @return the ID_Proveedor_Producto
     */
    public String getID_Proveedor_Producto() {
        return ID_Proveedor_Producto;
    }

    /**
     * @param ID_Proveedor_Producto the ID_Proveedor_Producto to set
     */
    public void setID_Proveedor_Producto(String ID_Proveedor_Producto) {
        this.ID_Proveedor_Producto = ID_Proveedor_Producto;
    }

    /**
     * @return the contadorProductos
     */
    public static int getContadorProductos() {
        return contadorProductos;
    }

    /**
     * @param aContadorProductos the contadorProductos to set
     */
    public static void setContadorProductos(int aContadorProductos) {
        contadorProductos = aContadorProductos;
    }
    
}
