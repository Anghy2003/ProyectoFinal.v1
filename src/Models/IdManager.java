package Models;

public class IdManager {

    private int lastClienteId;
    private int lastUsuarioId;
    private int lastServicio;
    private int lastproducto;

    public IdManager() {
        this.lastClienteId = 0;
        this.lastUsuarioId = 0;
    }

    /**
     * @return the lastClienteId
     */
    public int getLastClienteId() {
        return lastClienteId;
    }

    /**
     * @param lastClienteId the lastClienteId to set
     */
    public void setLastClienteId(int lastClienteId) {
        this.lastClienteId = lastClienteId;
    }

    /**
     * @return the lastUsuarioId
     */
    public int getLastUsuarioId() {
        return lastUsuarioId;
    }

    /**
     * @param lastUsuarioId the lastUsuarioId to set
     */
    public void setLastUsuarioId(int lastUsuarioId) {
        this.lastUsuarioId = lastUsuarioId;
    }

    /**
     * @return the lastServicio
     */
    public int getLastServicio() {
        return lastServicio;
    }

    /**
     * @param lastServicio the lastServicio to set
     */
    public void setLastServicio(int lastServicio) {
        this.lastServicio = lastServicio;
    }

    /**
     * @return the lastproducto
     */
    public int getLastproducto() {
        return lastproducto;
    }

    /**
     * @param lastproducto the lastproducto to set
     */
    public void setLastproducto(int lastproducto) {
        this.lastproducto = lastproducto;
    }

   
}
