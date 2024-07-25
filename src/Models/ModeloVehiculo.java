package Models;
/**
 *
 * @author aberr
 */
public class ModeloVehiculo {

    private String Nombre_modelo;
    private String id_Marca;

    public ModeloVehiculo() {
    }

    public ModeloVehiculo(String Nombre_modelo, String id_Marca) {
        this.Nombre_modelo = Nombre_modelo;
        this.id_Marca = id_Marca;
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
    
    
}
