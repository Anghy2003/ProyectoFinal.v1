
package Models;

public class Usuario extends Persona {
    
    String iD_Usuario;
    String nombreUsuario;
    private String password;
    private String correoRecuperacion;

    public Usuario() {
        super();
    }

    
    
    public Usuario(String iD_Usuario, String usuario, String password, String correoRecuperacion) {
        this.iD_Usuario = iD_Usuario;
        this.nombreUsuario = usuario;
        this.password = password;
        this.correoRecuperacion = correoRecuperacion;
    }

    public Usuario(String iD_Usuario, String usuario, String password, String correoRecuperacion, String cedula, String nombres, String apellidos, String direccion, String correo, String celular, String genero, String fechaNacimiento, String estadoCivil) {
        super(cedula, nombres, apellidos, direccion, correo, celular, genero, fechaNacimiento, estadoCivil);
        this.iD_Usuario = iD_Usuario;
        this.nombreUsuario = usuario;
        this.password = password;
        this.correoRecuperacion = correoRecuperacion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "iD_Usuario=" + getiD_Usuario() + ", usuario=" + getUsuario() + ", password=" + getPassword() + ", correoRecuperacion=" + getCorreoRecuperacion() + '}';
    }

    /**
     * @return the iD_Usuario
     */
    public String getiD_Usuario() {
        return iD_Usuario;
    }

    /**
     * @param iD_Usuario the iD_Usuario to set
     */
    public void setiD_Usuario(String iD_Usuario) {
        this.iD_Usuario = iD_Usuario;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return nombreUsuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.nombreUsuario = usuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the correoRecuperacion
     */
    public String getCorreoRecuperacion() {
        return correoRecuperacion;
    }

    /**
     * @param correoRecuperacion the correoRecuperacion to set
     */
    public void setCorreoRecuperacion(String correoRecuperacion) {
        this.correoRecuperacion = correoRecuperacion;
    }
    
    
}
