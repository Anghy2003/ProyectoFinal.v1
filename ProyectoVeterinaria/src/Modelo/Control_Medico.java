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
public class Control_Medico {
    String ID;
    Date FECHA;
    String DIAGNOSTICO;
    String ID_VETERINARIO;
    String ID_MASCOTA;

    public Control_Medico() {
    }

    public Control_Medico(String ID, Date FECHA, String DIAGNOSTICO, String ID_VETERINARIO, String ID_MASCOTA) {
        this.ID = ID;
        this.FECHA = FECHA;
        this.DIAGNOSTICO = DIAGNOSTICO;
        this.ID_VETERINARIO = ID_VETERINARIO;
        this.ID_MASCOTA = ID_MASCOTA;
    }

    public Control_Medico(Date FECHA, String DIAGNOSTICO, String ID_VETERINARIO, String ID_MASCOTA) {
        this.FECHA = FECHA;
        this.DIAGNOSTICO = DIAGNOSTICO;
        this.ID_VETERINARIO = ID_VETERINARIO;
        this.ID_MASCOTA = ID_MASCOTA;
    }
    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getFECHA() {
        return FECHA;
    }

    public void setFECHA(Date FECHA) {
        this.FECHA = FECHA;
    }

    public String getDIAGNOSTICO() {
        return DIAGNOSTICO;
    }

    public void setDIAGNOSTICO(String DIAGNOSTICO) {
        this.DIAGNOSTICO = DIAGNOSTICO;
    }

    public String getID_VETERINARIO() {
        return ID_VETERINARIO;
    }

    public void setID_VETERINARIO(String ID_VETERINARIO) {
        this.ID_VETERINARIO = ID_VETERINARIO;
    }

    public String getID_MASCOTA() {
        return ID_MASCOTA;
    }

    public void setID_MASCOTA(String ID_MASCOTA) {
        this.ID_MASCOTA = ID_MASCOTA;
    }
    
    
    
    
    
}
