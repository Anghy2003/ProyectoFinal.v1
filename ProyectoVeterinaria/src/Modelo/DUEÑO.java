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
    String ID;
    String CEDULA;
    String NOMBRE;
    String APELLIDO;
    String DIRECCION;
    String TELEFONO;
    String ID_MASCOTA;
    

    public DUEÑO() {
    }

    public DUEÑO(String ID, String CEDULA, String NOMBRE, String APELLIDO, String DIRECCION, String TELEFONO, String ID_MASCOTA) {
        this.ID = ID;
        this.CEDULA = CEDULA;
        this.NOMBRE = NOMBRE;
        this.APELLIDO = APELLIDO;
        this.DIRECCION = DIRECCION;
        this.TELEFONO = TELEFONO;
        this.ID_MASCOTA = ID_MASCOTA;
    }

    public DUEÑO(String CEDULA, String NOMBRE, String APELLIDO, String DIRECCION, String TELEFONO, String ID_MASCOTA) {
        this.CEDULA = CEDULA;
        this.NOMBRE = NOMBRE;
        this.APELLIDO = APELLIDO;
        this.DIRECCION = DIRECCION;
        this.TELEFONO = TELEFONO;
        this.ID_MASCOTA = ID_MASCOTA;
    }
    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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
    
}
