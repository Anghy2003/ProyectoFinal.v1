
package Models;
public class Proveedor {
    private String codigo_proveedor;
    private String tipo_proveedor;
    private String nombre_proveedor;

    public Proveedor() {
    }

    public Proveedor(String codigo_proveedor, String tipo_proveedor, String nombre_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
        this.tipo_proveedor = tipo_proveedor;
        this.nombre_proveedor = nombre_proveedor;
    }

    /**
     * @return the codigo_proveedor
     */
    public String getCodigo_proveedor() {
        return codigo_proveedor;
    }

    /**
     * @param codigo_proveedor the codigo_proveedor to set
     */
    public void setCodigo_proveedor(String codigo_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
    }

    /**
     * @return the tipo_proveedor
     */
    public String getTipo_proveedor() {
        return tipo_proveedor;
    }

    /**
     * @param tipo_proveedor the tipo_proveedor to set
     */
    public void setTipo_proveedor(String tipo_proveedor) {
        this.tipo_proveedor = tipo_proveedor;
    }

    /**
     * @return the nombre_proveedor
     */
    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    /**
     * @param nombre_proveedor the nombre_proveedor to set
     */
    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }
    
}
