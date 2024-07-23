package Models;

public class Vehiculo {
    private String placa_Vehiculo;
    private String modelo_Vehiculo;
    private String marca_Vehiculo;
    private String color_Vehiculo;
    private int anioFabricacion_Vehiculo;
    private String id_Cliente;
    private Estado estado;
    
    //haremos que tenga solo dos posibles valores
    public enum Estado {
        ACTIVO,
        INACTIVO
    }
    
    //Constructores

    public Vehiculo() {
    }
    public Vehiculo(String placa_Vehiculo, String modelo_Vehiculo, String marca_Vehiculo, String color_Vehiculo, int anioFabricacion_Vehiculo, String id_Cliente, Estado estado) {
        this.placa_Vehiculo = placa_Vehiculo;
        this.modelo_Vehiculo = modelo_Vehiculo;
        this.marca_Vehiculo = marca_Vehiculo;
        this.color_Vehiculo = color_Vehiculo;
        this.anioFabricacion_Vehiculo = anioFabricacion_Vehiculo;
        this.id_Cliente = id_Cliente;
        this.estado = Estado.ACTIVO;//iniciamos  el atributo en activo
    }
    //Getter Setter

    /**
     * @return the placa_Vehiculo
     */
    public String getPlaca_Vehiculo() {
        return placa_Vehiculo;
    }

    /**
     * @param placa_Vehiculo the placa_Vehiculo to set
     */
    public void setPlaca_Vehiculo(String placa_Vehiculo) {
        this.placa_Vehiculo = placa_Vehiculo;
    }

    /**
     * @return the modelo_Vehiculo
     */
    public String getModelo_Vehiculo() {
        return modelo_Vehiculo;
    }

    /**
     * @param modelo_Vehiculo the modelo_Vehiculo to set
     */
    public void setModelo_Vehiculo(String modelo_Vehiculo) {
        this.modelo_Vehiculo = modelo_Vehiculo;
    }

    /**
     * @return the marca_Vehiculo
     */
    public String getMarca_Vehiculo() {
        return marca_Vehiculo;
    }

    /**
     * @param marca_Vehiculo the marca_Vehiculo to set
     */
    public void setMarca_Vehiculo(String marca_Vehiculo) {
        this.marca_Vehiculo = marca_Vehiculo;
    }

    /**
     * @return the color_Vehiculo
     */
    public String getColor_Vehiculo() {
        return color_Vehiculo;
    }

    /**
     * @param color_Vehiculo the color_Vehiculo to set
     */
    public void setColor_Vehiculo(String color_Vehiculo) {
        this.color_Vehiculo = color_Vehiculo;
    }

    /**
     * @return the anioFabricacion_Vehiculo
     */
    public int getAnioFabricacion_Vehiculo() {
        return anioFabricacion_Vehiculo;
    }

    /**
     * @param anioFabricacion_Vehiculo the anioFabricacion_Vehiculo to set
     */
    public void setAnioFabricacion_Vehiculo(int anioFabricacion_Vehiculo) {
        this.anioFabricacion_Vehiculo = anioFabricacion_Vehiculo;
    }

    /**
     * @return the id_Cliente
     */
    public String getId_Cliente() {
        return id_Cliente;
    }

    /**
     * @param id_Cliente the id_Cliente to set
     */
    public void setId_Cliente(String id_Cliente) {
        this.id_Cliente = id_Cliente;
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
    public  void activarVehiculo() {
        this.estado = Estado.ACTIVO;
    }

    public  void desactivarVehiculo() {
        this.estado = Estado.INACTIVO;
    }    
}
