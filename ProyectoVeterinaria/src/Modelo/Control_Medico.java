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
public class Control_Medico {
    int ID;
    String FECHA;
    String DIAGNOSTICO;
    int ID_VETERINARIO;
    int ID_MASCOTA;

    public Control_Medico() {
    }

    public Control_Medico(int ID, String FECHA, String DIAGNOSTICO, int ID_VETERINARIO, int ID_MASCOTA) {
        this.ID = ID;
        this.FECHA = FECHA;
        this.DIAGNOSTICO = DIAGNOSTICO;
        this.ID_VETERINARIO = ID_VETERINARIO;
        this.ID_MASCOTA = ID_MASCOTA;
    }

    public Control_Medico(String FECHA, String DIAGNOSTICO, int ID_VETERINARIO, int ID_MASCOTA) {
        this.FECHA = FECHA;
        this.DIAGNOSTICO = DIAGNOSTICO;
        this.ID_VETERINARIO = ID_VETERINARIO;
        this.ID_MASCOTA = ID_MASCOTA;
    }
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFECHA() {
        return FECHA;
    }

    public void setFECHA(String FECHA) {
        this.FECHA = FECHA;
    }

    public String getDIAGNOSTICO() {
        return DIAGNOSTICO;
    }

    public void setDIAGNOSTICO(String DIAGNOSTICO) {
        this.DIAGNOSTICO = DIAGNOSTICO;
    }

    public int getID_VETERINARIO() {
        return ID_VETERINARIO;
    }

    public void setID_VETERINARIO(int ID_VETERINARIO) {
        this.ID_VETERINARIO = ID_VETERINARIO;
    }

    public int getID_MASCOTA() {
        return ID_MASCOTA;
    }

    public void setID_MASCOTA(int ID_MASCOTA) {
        this.ID_MASCOTA = ID_MASCOTA;
    }
    
    
    
    
    
}
