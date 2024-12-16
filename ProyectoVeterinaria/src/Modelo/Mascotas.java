
package Modelo;

import java.util.Date;

/**
 *
 * @author aberr
 */
public class Mascotas {
    String  NOMBRE;
    String ESPECIE;
    String RAZA;
    String CEDULA_DUEÑO;
    String ID_MASCOTA;

    public Mascotas() {
    }

    public Mascotas(String NOMBRE, String ESPECIE, String RAZA, String CEDULA_DUEÑO, String ID_MASCOTA) {
        this.NOMBRE = NOMBRE;
        this.ESPECIE = ESPECIE;
        this.RAZA = RAZA;
        this.CEDULA_DUEÑO = CEDULA_DUEÑO;
        this.ID_MASCOTA = ID_MASCOTA;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getESPECIE() {
        return ESPECIE;
    }

    public void setESPECIE(String ESPECIE) {
        this.ESPECIE = ESPECIE;
    }

    public String getRAZA() {
        return RAZA;
    }

    public void setRAZA(String RAZA) {
        this.RAZA = RAZA;
    }

    public String getCEDULA_DUEÑO() {
        return CEDULA_DUEÑO;
    }

    public void setCEDULA_DUEÑO(String CEDULA_DUEÑO) {
        this.CEDULA_DUEÑO = CEDULA_DUEÑO;
    }

    public String getID_MASCOTA() {
        return ID_MASCOTA;
    }

    public void setID_MASCOTA(String ID_MASCOTA) {
        this.ID_MASCOTA = ID_MASCOTA;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "NOMBRE=" + NOMBRE + ", ESPECIE=" + ESPECIE + ", RAZA=" + RAZA + ", CEDULA_DUE\u00d1O=" + CEDULA_DUEÑO + ", ID_MASCOTA=" + ID_MASCOTA + '}';
    }
    
}
