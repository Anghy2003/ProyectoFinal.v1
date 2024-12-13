/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author 59399
 */
public class Propietario {
    int id_propietario;
    String Nombre,Direccion,Telefono;

    public Propietario() {
    }

    public Propietario(int id_propietario, String Nombre, String Direccion, String Telefono) {
        this.id_propietario = id_propietario;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    public int getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(int id_propietario) {
        this.id_propietario = id_propietario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    @Override
    public String toString() {
        return "Propietario{" + "id_propietario=" + id_propietario + ", Nombre=" + Nombre + ", Direccion=" + Direccion + ", Telefono=" + Telefono + '}';
    }
    
}
