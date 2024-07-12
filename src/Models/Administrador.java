
package Models;

public class Administrador extends Usuario {
    
    private String iD_Administrador;
    private String titulo_Administrador;

    public Administrador() {
        super();
    }

    public Administrador(String id_Administrador, String titulo) {
        this.iD_Administrador = id_Administrador;
        this.titulo_Administrador = titulo;
    }

    public Administrador(String id_Administrador, String titulo, String iD_Usuario, String usuario, String password, String correoRecuperacion) {
        super(iD_Usuario, usuario, password, correoRecuperacion);
        this.iD_Administrador = id_Administrador;
        this.titulo_Administrador = titulo;
    }

    public Administrador(String id_Administrador, String titulo, String iD_Usuario, String usuario, String password, String correoRecuperacion, String cedula, String nombres, String apellidos, String direccion, String correo, String celular, String genero, String fechaNacimiento, String estadoCivil) {
        super(iD_Usuario, usuario, password, correoRecuperacion, cedula, nombres, apellidos, direccion, correo, celular, genero, fechaNacimiento, estadoCivil);
        this.iD_Administrador = id_Administrador;
        this.titulo_Administrador = titulo;
    }

    @Override
    public String toString() {
        return "Administrador{" + "id_Administrador=" + getId_Administrador() + ", titulo=" + getTitulo() + '}';
    }

    /**
     * @return the id_Administrador
     */
    public String getId_Administrador() {
        return iD_Administrador;
    }

    /**
     * @param id_Administrador the id_Administrador to set
     */
    public void setId_Administrador(String id_Administrador) {
        this.iD_Administrador = id_Administrador;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo_Administrador;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo_Administrador = titulo;
    }
    
    
}
