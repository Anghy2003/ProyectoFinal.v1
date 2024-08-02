package Models;

import Conexion.Conexion_db;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

/**
 *
 * @author aberr
 */
public class ModeloVehiculo {

    private String codigoModelo;
    private String Nombre_modelo;
    private String id_Marca;

    public ModeloVehiculo() {
    }

    public ModeloVehiculo(String codigoModelo, String Nombre_modelo, String id_Marca) {
        this.codigoModelo = codigoModelo;
        this.Nombre_modelo = Nombre_modelo;
        this.id_Marca = id_Marca;
    }

    /**
     * @return the codigoModelo
     */
    public String getCodigoModelo() {
        return codigoModelo;
    }

    /**
     * @param codigoModelo the codigoModelo to set
     */
    public void setCodigoModelo(String codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    /**
     * @return the Nombre_modelo
     */
    public String getNombre_modelo() {
        return Nombre_modelo;
    }

    /**
     * @param Nombre_modelo the Nombre_modelo to set
     */
    public void setNombre_modelo(String Nombre_modelo) {
        this.Nombre_modelo = Nombre_modelo;
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
    
    //verificar Modelos
    public static int verificarNumeroModelos() {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        ModeloVehiculo ModeloBusca = new ModeloVehiculo();
        ObjectSet resultado = BaseBD.get(ModeloBusca);
        int coincidencias= resultado.size();
        //Cerrar BD
        BaseBD.close();
        return coincidencias;
    }
    
    
}
