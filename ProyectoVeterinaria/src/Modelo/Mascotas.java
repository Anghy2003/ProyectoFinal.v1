
package Modelo;

import java.util.Date;

/**
 *
 * @author aberr
 */
public class Mascotas {
    String ID;
    String  NOMBRE;
    String ESPECIE;
    String RAZA;
    String CEDULA_DUEÑO;    
    Date FECHANACIMIENTO;

    public Mascotas() {
    }
    

    public Mascotas(String ID, String NOMBRE, String ESPECIE, String RAZA, String CEDULA_DUEÑO, Date FECHANACIMIENTO) {
        this.ID = ID;
        this.NOMBRE = NOMBRE;
        this.ESPECIE = ESPECIE;
        this.RAZA = RAZA;
        this.CEDULA_DUEÑO = CEDULA_DUEÑO;
        this.FECHANACIMIENTO = FECHANACIMIENTO;
    }

    public Mascotas(String NOMBRE, String ESPECIE, String RAZA, String CEDULA_DUEÑO, Date FECHANACIMIENTO) {
        this.NOMBRE = NOMBRE;
        this.ESPECIE = ESPECIE;
        this.RAZA = RAZA;
        this.CEDULA_DUEÑO = CEDULA_DUEÑO;
        this.FECHANACIMIENTO = FECHANACIMIENTO;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public Date getFECHANACIMIENTO() {
        return FECHANACIMIENTO;
    }

    public void setFECHANACIMIENTO(Date FECHANACIMIENTO) {
        this.FECHANACIMIENTO = FECHANACIMIENTO;
    }
    
    
    
}
