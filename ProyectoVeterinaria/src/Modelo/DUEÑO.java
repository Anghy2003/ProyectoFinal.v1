/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author aberr
 */
public class DUEÑO {
    String CEDULA;
    String NOMBRE;
    String APELLIDO;
    String DIRECCION;
    String TELEFONO;
    String ID_MASCOTA;
    String ID_DUEÑO;

    public DUEÑO() {
    }

    public DUEÑO(String CEDULA, String NOMBRE, String APELLIDO, String DIRECCION, String TELEFONO, String ID_MASCOTA, String ID_DUEÑO) {
        this.CEDULA = CEDULA;
        this.NOMBRE = NOMBRE;
        this.APELLIDO = APELLIDO;
        this.DIRECCION = DIRECCION;
        this.TELEFONO = TELEFONO;
        this.ID_MASCOTA = ID_MASCOTA;
        this.ID_DUEÑO = ID_DUEÑO;
    }

    public String getCEDULA() {
        return CEDULA;
    }

    public void setCEDULA(String CEDULA) {
        this.CEDULA = CEDULA;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO() {
        return APELLIDO;
    }

    public void setAPELLIDO(String APELLIDO) {
        this.APELLIDO = APELLIDO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getID_MASCOTA() {
        return ID_MASCOTA;
    }

    public void setID_MASCOTA(String ID_MASCOTA) {
        this.ID_MASCOTA = ID_MASCOTA;
    }

    public String getID_DUEÑO() {
        return ID_DUEÑO;
    }

    public void setID_DUEÑO(String ID_DUEÑO) {
        this.ID_DUEÑO = ID_DUEÑO;
    }

    @Override
    public String toString() {
        return "DUE\u00d1O{" + "CEDULA=" + CEDULA + ", NOMBRE=" + NOMBRE + ", APELLIDO=" + APELLIDO + ", DIRECCION=" + DIRECCION + ", TELEFONO=" + TELEFONO + ", ID_MASCOTA=" + ID_MASCOTA + ", ID_DUE\u00d1O=" + ID_DUEÑO + '}';
    }
    
}
