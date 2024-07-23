
package Models;


public class Servicios {
    private String codigo_Servicio;
    private String nombre_Servicio;
    private String descripcion_Servicio;
    private double precioTotal_Servicio;
    private String duracion_Servicio;
    private String Id_mecanico;
    private String placa_Vehiculo;
    
    public Servicios() {
    }

    public Servicios(String codigo_Servicio, String nombre_Servicio, String descripcion_Servicio, double precioTotal_Servicio, String duracion_Servicio, String Id_mecanico, String placa_Vehiculo) {
        this.codigo_Servicio = codigo_Servicio;
        this.nombre_Servicio = nombre_Servicio;
        this.descripcion_Servicio = descripcion_Servicio;
        this.precioTotal_Servicio = precioTotal_Servicio;
        this.duracion_Servicio = duracion_Servicio;
        this.Id_mecanico = Id_mecanico;
        this.placa_Vehiculo = placa_Vehiculo;
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

    public String getId_mecanico() {
        return Id_mecanico;
    }

    public void setId_mecanico(String Id_mecanico) {
        this.Id_mecanico = Id_mecanico;
    }

    public String getPlaca_Vehiculo() {
        return placa_Vehiculo;
    }

    public void setPlaca_Vehiculo(String placa_Vehiculo) {
        this.placa_Vehiculo = placa_Vehiculo;
    }

    @Override
    public String toString() {
        return "Servicios{" + "codigo_Servicio=" + codigo_Servicio + ", nombre_Servicio=" + nombre_Servicio + ", descripcion_Servicio=" + descripcion_Servicio + ", precioTotal_Servicio=" + precioTotal_Servicio + ", duracion_Servicio=" + duracion_Servicio + ", Id_mecanico=" + Id_mecanico + ", placa_Vehiculo=" + placa_Vehiculo + '}';
    }

    
}
