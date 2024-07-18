
package Models;

import Conexion.Conexion_db;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class Proveedor {
    private String codigo_proveedor;
    private String tipo_proveedor;
    private String nombre_proveedor;
    private String direccion_proveedor;
    private String correo_proveedor;
    private String celular_proveedor;
    private Boolean estado_proveedor;

    public Proveedor() {
    }

    public Proveedor(Boolean estado_proveedor) {
        this.estado_proveedor = estado_proveedor;
    }

    public Proveedor(String codigo_proveedor, Boolean estado_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
        this.estado_proveedor = estado_proveedor;
    }
    //sin estado ni id

    public Proveedor(String tipo_proveedor, String nombre_proveedor, String direccion_proveedor, String correo_proveedor, String celular_proveedor) {
        this.tipo_proveedor = tipo_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.direccion_proveedor = direccion_proveedor;
        this.correo_proveedor = correo_proveedor;
        this.celular_proveedor = celular_proveedor;
    }
    
    
    public Proveedor(String tipo, String nombre, String direccion, String correo, String celular, Boolean estado) {
        this.tipo_proveedor = tipo;
        this.nombre_proveedor = nombre;
        this.direccion_proveedor = direccion;
        this.correo_proveedor = correo;
        this.celular_proveedor = celular;
        this.estado_proveedor = estado;

        // Generar el código concatenado "PROV" + k
        int k=verificarNumeroProveedores()+1;
        this.codigo_proveedor = "PROV" +k;
    }
    
    //constructor para busqueda por codigo
    public Proveedor(String codigo_proveedor, String tipo_proveedor, String nombre_proveedor, String direccion_proveedor, String correo_proveedor, String celular_proveedor, Boolean estado_proveedor) {
        this.tipo_proveedor = tipo_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.direccion_proveedor = direccion_proveedor;
        this.correo_proveedor = correo_proveedor;
        this.celular_proveedor = celular_proveedor;
        this.estado_proveedor = estado_proveedor;
        // Generar el código concatenado "PROV" + k
        int k=verificarNumeroProveedores()+1;
        this.codigo_proveedor = "PROV"+k;
    }

    
    
    //constructor sin estado
    public Proveedor(String codigo_proveedor, String tipo_proveedor, String nombre_proveedor, String direccion_proveedor, String correo_proveedor, String celular_proveedor) {
        this.tipo_proveedor = tipo_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.direccion_proveedor = direccion_proveedor;
        this.correo_proveedor = correo_proveedor;
        this.celular_proveedor = celular_proveedor;
        // Generar el código concatenado "PROV" + k
        int k=verificarNumeroProveedores()+1;
        this.codigo_proveedor = "PROV"+k;
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

    /**
     * @return the direccion_proveedor
     */
    public String getDireccion_proveedor() {
        return direccion_proveedor;
    }

    /**
     * @param direccion_proveedor the direccion_proveedor to set
     */
    public void setDireccion_proveedor(String direccion_proveedor) {
        this.direccion_proveedor = direccion_proveedor;
    }

    /**
     * @return the correo_proveedor
     */
    public String getCorreo_proveedor() {
        return correo_proveedor;
    }

    /**
     * @param correo_proveedor the correo_proveedor to set
     */
    public void setCorreo_proveedor(String correo_proveedor) {
        this.correo_proveedor = correo_proveedor;
    }

    /**
     * @return the celular_proveedor
     */
    public String getCelular_proveedor() {
        return celular_proveedor;
    }

    /**
     * @param celular_proveedor the celular_proveedor to set
     */
    public void setCelular_proveedor(String celular_proveedor) {
        this.celular_proveedor = celular_proveedor;
    }

    /**
     * @return the estado_proveedor
     */
    public Boolean getEstado_proveedor() {
        return estado_proveedor;
    }

    /**
     * @param estado_proveedor the estado_proveedor to set
     */
    public void setEstado_proveedor(Boolean estado_proveedor) {
        this.estado_proveedor = estado_proveedor;
    }
    
    
    //verificar Proveedores
    public static int verificarNumeroProveedores() {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Proveedor ProveedorBusca = new Proveedor();
        ObjectSet resultado = BaseBD.get(ProveedorBusca);
        int coincidencias= resultado.size();
        //Cerrar BD
        BaseBD.close();
        return coincidencias;
    }
    
}
