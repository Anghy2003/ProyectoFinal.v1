package Models;

import Conexion.Conexion_db;
import com.db4o.*;

/**
 *
 * @author aberr
 */
public class MarcaVehiculo {
    private String id_Marca;
    private String nombre_Marca;

    public MarcaVehiculo() {
    }

    public MarcaVehiculo(String id_Marca, String nombre_Marca) {
        this.id_Marca = id_Marca;
        this.nombre_Marca = nombre_Marca;
    }

    /**
     * @return the id_Marca
     */
    public String getId_Marca() {
        return id_Marca;
    }

    /**
     * @param id_Marca the id_Marca to set
     */
    public void setId_Marca(String id_Marca) {
        this.id_Marca = id_Marca;
    }

    /**
     * @return the nombre_Marca
     */
    public String getNombre_Marca() {
        return nombre_Marca;
    }

    /**
     * @param nombre_Marca the nombre_Marca to set
     */
    public void setNombre_Marca(String nombre_Marca) {
        this.nombre_Marca = nombre_Marca;
    }
    //verificar Marcas
    public static int verificarNumeroMarcas() {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        MarcaVehiculo MarcaBusca = new MarcaVehiculo();
        ObjectSet resultado = BaseBD.get(MarcaBusca);
        int coincidencias= resultado.size();
        //Cerrar BD
        BaseBD.close();
        return coincidencias;
    }
    
}
