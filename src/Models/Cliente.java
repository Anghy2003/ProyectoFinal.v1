
package Models;

public class Cliente extends Usuario {
    
    private String iD_Cliente;

    public Cliente() {
        super();
    }

    public Cliente(String iD_Cliente) {
        this.iD_Cliente = iD_Cliente;
    }

    public Cliente(String iD_Cliente, String iD_Usuario, String usuario, String password, String correoRecuperacion) {
        super(iD_Usuario, usuario, password, correoRecuperacion);
        this.iD_Cliente = iD_Cliente;
    }

    public Cliente(String iD_Cliente, String iD_Usuario, String usuario, String password, String correoRecuperacion, String cedula, String nombres, String apellidos, String direccion, String correo, String celular, String genero, String fechaNacimiento, String estadoCivil) {
        super(iD_Usuario, usuario, password, correoRecuperacion, cedula, nombres, apellidos, direccion, correo, celular, genero, fechaNacimiento, estadoCivil);
        this.iD_Cliente = iD_Cliente;
    }

    public String getiD_Cliente() {
        return iD_Cliente;
    }

    public void setiD_Cliente(String iD_Cliente) {
        this.iD_Cliente = iD_Cliente;
    }

    public String getiD_Usuario() {
        return iD_Usuario;
    }

    public void setiD_Usuario(String iD_Usuario) {
        this.iD_Usuario = iD_Usuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
}
