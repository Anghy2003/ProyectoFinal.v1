package Models;

public class IdManager {

    private int lastClienteId;
    private int lastUsuarioId;

    public IdManager() {
        this.lastClienteId = 0;
        this.lastUsuarioId = 0;
    }

    public int getLastClienteId() {
        return lastClienteId;
    }

    public void setLastClienteId(int lastClienteId) {
        this.lastClienteId = lastClienteId;
    }

    public int getLastUsuarioId() {
        return lastUsuarioId;
    }

    public void setLastUsuarioId(int lastUsuarioId) {
        this.lastUsuarioId = lastUsuarioId;
    }
}
