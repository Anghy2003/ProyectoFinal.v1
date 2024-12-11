/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author 59399
 */
public class Mascotas {
    String  Nombre;
    int id_Mascota,id_Propietario;
    private Date Fecha_Nacimiento;

    public Mascotas() {
    }

    public Mascotas(String Nombre, int id_Mascota, int id_Propietario, Date Fecha_Nacimiento) {
        this.Nombre = Nombre;
        this.id_Mascota = id_Mascota;
        this.id_Propietario = id_Propietario;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getId_Mascota() {
        return id_Mascota;
    }

    public void setId_Mascota(int id_Mascota) {
        this.id_Mascota = id_Mascota;
    }

    public int getId_Propietario() {
        return id_Propietario;
    }

    public void setId_Propietario(int id_Propietario) {
        this.id_Propietario = id_Propietario;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "Nombre=" + Nombre + ", id_Mascota=" + id_Mascota + ", id_Propietario=" + id_Propietario + ", Fecha_Nacimiento=" + Fecha_Nacimiento + '}';
    }

    

    

    

}
