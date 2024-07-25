
package Models;

public class Genero {
    
    private String id_Genero;
    private String genero;
    

    public Genero() {
    }

    public Genero(String genero) {
       
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Genero{" + "id_Genero=" + getId_Genero() + ", genero=" + getGenero() + '}';
    }

    /**
     * @return the id_Genero
     */
    public String getId_Genero() {
        return id_Genero;
    }

    /**
     * @param id_Genero the id_Genero to set
     */
    public void setId_Genero(String id_Genero) {
        this.id_Genero = id_Genero;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
