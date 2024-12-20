/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author aberr
 */
public class Control_Vacunas {
    String ID;
    int DOSIS;
    Date FECHA;
    String ID_VACUNA;
    String ID_MASCOTA;
    

    public Control_Vacunas() {
    }

    public Control_Vacunas(String ID, int DOSIS, Date FECHA, String ID_VACUNA, String ID_MASCOTA) {
        this.ID = ID;
        this.DOSIS = DOSIS;
        this.FECHA = FECHA;
        this.ID_VACUNA = ID_VACUNA;
        this.ID_MASCOTA = ID_MASCOTA;
    }

    public Control_Vacunas(int DOSIS, Date FECHA, String ID_VACUNA, String ID_MASCOTA) {
        this.DOSIS = DOSIS;
        this.FECHA = FECHA;
        this.ID_VACUNA = ID_VACUNA;
        this.ID_MASCOTA = ID_MASCOTA;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getDOSIS() {
        return DOSIS;
    }

    public void setDOSIS(int DOSIS) {
        this.DOSIS = DOSIS;
    }

    public Date getFECHA() {
        return FECHA;
    }

    public void setFECHA(Date FECHA) {
        this.FECHA = FECHA;
    }

    public String getID_VACUNA() {
        return ID_VACUNA;
    }

    public void setID_VACUNA(String ID_VACUNA) {
        this.ID_VACUNA = ID_VACUNA;
    }

    public String getID_MASCOTA() {
        return ID_MASCOTA;
    }

    public void setID_MASCOTA(String ID_MASCOTA) {
        this.ID_MASCOTA = ID_MASCOTA;
    }

   
    
    
    
}
