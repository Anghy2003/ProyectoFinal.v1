
package Models;

public class Administrador extends Persona {
    
    private String iD_Administrador;
    private String titulo_Administrador;

    public Administrador() {
        super();
    }

    public Administrador(String iD_Administrador, String titulo_Administrador) {
        this.iD_Administrador = iD_Administrador;
        this.titulo_Administrador = titulo_Administrador;
    }

    public Administrador(String iD_Administrador, String titulo_Administrador, String cedula, String nombres, String apellidos, String direccion, String correo, String celular, String genero, String fechaNacimiento, String estadoCivil, String nombreUsuario, String password, String correoRecuperacion) {
        super(cedula, nombres, apellidos, direccion, correo, celular, genero, fechaNacimiento, estadoCivil, nombreUsuario, password, correoRecuperacion);
        this.iD_Administrador = iD_Administrador;
        this.titulo_Administrador = titulo_Administrador;
    }

    @Override
    public String toString() {
        return "Administrador{" + "iD_Administrador=" + getiD_Administrador() + ", titulo_Administrador=" + getTitulo_Administrador() + '}';
    }

    /**
     * @return the iD_Administrador
     */
    public String getiD_Administrador() {
        return iD_Administrador;
    }

    /**
     * @param iD_Administrador the iD_Administrador to set
     */
    public void setiD_Administrador(String iD_Administrador) {
        this.iD_Administrador = iD_Administrador;
    }

    /**
     * @return the titulo_Administrador
     */
    public String getTitulo_Administrador() {
        return titulo_Administrador;
    }

    /**
     * @param titulo_Administrador the titulo_Administrador to set
     */
    public void setTitulo_Administrador(String titulo_Administrador) {
        this.titulo_Administrador = titulo_Administrador;
    }

    
    
}
