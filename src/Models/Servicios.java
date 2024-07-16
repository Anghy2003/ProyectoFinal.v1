/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


public class Servicios {
   private String codigo_Servicio;
   private String nombre_Servicio;
   private String descripcion_Servicio;
   private double precioTotal_Servicio;
   private String duracion_Servicio;
   private boolean estado_Servicio;
   private String Id_mecanico;
   private String placa_Vehiculo;

    public Servicios() {
    }

    public Servicios(String codigo_Servicio, String nombre_Servicio, String descripcion_Servicio, double precioTotal_Servicio, String duracion_Servicio, boolean estado_Servicio, String Id_mecanico, String placa_Vehiculo) {
        this.codigo_Servicio = codigo_Servicio;
        this.nombre_Servicio = nombre_Servicio;
        this.descripcion_Servicio = descripcion_Servicio;
        this.precioTotal_Servicio = precioTotal_Servicio;
        this.duracion_Servicio = duracion_Servicio;
        this.estado_Servicio = estado_Servicio;
        this.Id_mecanico = Id_mecanico;
        this.placa_Vehiculo = placa_Vehiculo;
    }

    /**
     * @return the codigo_Servicio
     */
    public String getCodigo_Servicio() {
        return codigo_Servicio;
    }

    /**
     * @param codigo_Servicio the codigo_Servicio to set
     */
    public void setCodigo_Servicio(String codigo_Servicio) {
        this.codigo_Servicio = codigo_Servicio;
    }

    /**
     * @return the nombre_Servicio
     */
    public String getNombre_Servicio() {
        return nombre_Servicio;
    }

    /**
     * @param nombre_Servicio the nombre_Servicio to set
     */
    public void setNombre_Servicio(String nombre_Servicio) {
        this.nombre_Servicio = nombre_Servicio;
    }

    /**
     * @return the descripcion_Servicio
     */
    public String getDescripcion_Servicio() {
        return descripcion_Servicio;
    }

    /**
     * @param descripcion_Servicio the descripcion_Servicio to set
     */
    public void setDescripcion_Servicio(String descripcion_Servicio) {
        this.descripcion_Servicio = descripcion_Servicio;
    }

    /**
     * @return the precioTotal_Servicio
     */
    public double getPrecioTotal_Servicio() {
        return precioTotal_Servicio;
    }

    /**
     * @param precioTotal_Servicio the precioTotal_Servicio to set
     */
    public void setPrecioTotal_Servicio(double precioTotal_Servicio) {
        this.precioTotal_Servicio = precioTotal_Servicio;
    }

    /**
     * @return the duracion_Servicio
     */
    public String getDuracion_Servicio() {
        return duracion_Servicio;
    }

    /**
     * @param duracion_Servicio the duracion_Servicio to set
     */
    public void setDuracion_Servicio(String duracion_Servicio) {
        this.duracion_Servicio = duracion_Servicio;
    }

    /**
     * @return the estado_Servicio
     */
    public boolean isEstado_Servicio() {
        return estado_Servicio;
    }

    /**
     * @param estado_Servicio the estado_Servicio to set
     */
    public void setEstado_Servicio(boolean estado_Servicio) {
        this.estado_Servicio = estado_Servicio;
    }

    /**
     * @return the Id_mecanico
     */
    public String getId_mecanico() {
        return Id_mecanico;
    }

    /**
     * @param Id_mecanico the Id_mecanico to set
     */
    public void setId_mecanico(String Id_mecanico) {
        this.Id_mecanico = Id_mecanico;
    }

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

    @Override
    public String toString() {
        return "Servicios{" + "codigo_Servicio=" + codigo_Servicio + ", nombre_Servicio=" + nombre_Servicio + ", descripcion_Servicio=" + descripcion_Servicio + ", precioTotal_Servicio=" + precioTotal_Servicio + ", duracion_Servicio=" + duracion_Servicio + ", estado_Servicio=" + estado_Servicio + ", Id_mecanico=" + Id_mecanico + ", placa_Vehiculo=" + placa_Vehiculo + '}';
    }
   
}
