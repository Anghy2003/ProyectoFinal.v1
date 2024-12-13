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
    String FECHA;
    String DIAGNOSTICO;
    String ID_CONTROLMEDICO;
    String ID_VETERINARIO;
    String ID_MASCOTA;

    public Control_Medico() {
    }

    public Control_Medico(String FECHA, String DIAGNOSTICO, String ID_CONTROLMEDICO, String ID_VETERINARIO, String ID_MASCOTA) {
        this.FECHA = FECHA;
        this.DIAGNOSTICO = DIAGNOSTICO;
        this.ID_CONTROLMEDICO = ID_CONTROLMEDICO;
        this.ID_VETERINARIO = ID_VETERINARIO;
        this.ID_MASCOTA = ID_MASCOTA;
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

    public String getID_CONTROLMEDICO() {
        return ID_CONTROLMEDICO;
    }

    public void setID_CONTROLMEDICO(String ID_CONTROLMEDICO) {
        this.ID_CONTROLMEDICO = ID_CONTROLMEDICO;
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

    @Override
    public String toString() {
        return "Control_Medico{" + "FECHA=" + FECHA + ", DIAGNOSTICO=" + DIAGNOSTICO + ", ID_CONTROLMEDICO=" + ID_CONTROLMEDICO + ", ID_VETERINARIO=" + ID_VETERINARIO + ", ID_MASCOTA=" + ID_MASCOTA + '}';
    }
    
    
    
}
