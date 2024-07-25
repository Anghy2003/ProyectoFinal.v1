
package Models;

public class Estado_Civil {
    
    private String iD_estado_Civil;
    private String estadoCivil;
    

    public Estado_Civil(String estadoCivil) {        
        this.estadoCivil = estadoCivil;
    }

    public Estado_Civil() {
    }

    @Override
    public String toString() {
        return "Estado_Civil{ estadoCivil=" + getEstadoCivil() + '}';
    }

   
    /**
     * @return the estadoCivil
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param estadoCivil the estadoCivil to set
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * @return the iD_estado_Civil
     */
    public String getiD_estado_Civil() {
        return iD_estado_Civil;
    }

    /**
     * @param iD_estado_Civil the iD_estado_Civil to set
     */
    public void setiD_estado_Civil(String iD_estado_Civil) {
        this.iD_estado_Civil = iD_estado_Civil;
    }
   
    
}
