
package Models;

public class Ciudad {
    
    private String idCiudad;
    private String ciudad;
    private int poblacion;
    private String region;
    private byte [] imagen;

    public Ciudad() {
    }

    public Ciudad(String idCiudad, String ciudad, int poblacion, String region, byte[] imagen) {
        this.idCiudad = idCiudad;
        this.ciudad = ciudad;
        this.poblacion = poblacion;
        this.region = region;
        this.imagen = imagen;
    }

    public Ciudad(String ciudad, int poblacion, String region, byte[] imagen) {
        this.ciudad = ciudad;
        this.poblacion = poblacion;
        this.region = region;
        this.imagen = imagen;
    }
    
    

   

    @Override
    public String toString() {
        return "Ciudad{" + "idCiudad=" + getIdCiudad() + ", ciudad=" + getCiudad() + ", poblacion=" + getPoblacion() + ", region=" + getRegion() + ", imagen=" + getImagen() + '}';
    }

    /**
     * @return the idCiudad
     */
    public String getIdCiudad() {
        return idCiudad;
    }

    /**
     * @param idCiudad the idCiudad to set
     */
    public void setIdCiudad(String idCiudad) {
        this.idCiudad = idCiudad;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the poblacion
     */
    public int getPoblacion() {
        return poblacion;
    }

    /**
     * @param poblacion the poblacion to set
     */
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    /**
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return the imagen
     */
    public byte[] getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    
    
    
    
}
