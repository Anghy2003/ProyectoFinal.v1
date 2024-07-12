
package Models;

public class Cliente extends Usuario {
    
    private String iD_Cliente;
    private String tipo_Cliente;

    public Cliente() {
        super();
    }

    public Cliente(String user) {
        this.nombreUsuario = user;
    }

    
    
    
    public Cliente(String iD_Cliente, String tipo_Cliente) {
        this.iD_Cliente = iD_Cliente;
        this.tipo_Cliente = tipo_Cliente;
    }

    public Cliente(String iD_Cliente, String tipo_Cliente, String iD_Usuario, String usuario, String password, String correoRecuperacion) {
        super(iD_Usuario, usuario, password, correoRecuperacion);
        this.iD_Cliente = iD_Cliente;
        this.tipo_Cliente = tipo_Cliente;
    }

    public Cliente(String iD_Cliente, String tipo_Cliente, String iD_Usuario, String usuario, String password, String correoRecuperacion, String cedula, String nombres, String apellidos, String direccion, String correo, String celular, String genero, String fechaNacimiento, String estadoCivil) {
        super(iD_Usuario, usuario, password, correoRecuperacion, cedula, nombres, apellidos, direccion, correo, celular, genero, fechaNacimiento, estadoCivil);
        this.iD_Cliente = iD_Cliente;
        this.tipo_Cliente = tipo_Cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "iD_Cliente=" + getiD_Cliente() + ", tipo_Cliente=" + getTipo_Cliente() + '}';
    }

    /**
     * @return the iD_Cliente
     */
    public String getiD_Cliente() {
        return iD_Cliente;
    }

    /**
     * @param iD_Cliente the iD_Cliente to set
     */
    public void setiD_Cliente(String iD_Cliente) {
        this.iD_Cliente = iD_Cliente;
    }

    /**
     * @return the tipo_Cliente
     */
    public String getTipo_Cliente() {
        return tipo_Cliente;
    }

    /**
     * @param tipo_Cliente the tipo_Cliente to set
     */
    public void setTipo_Cliente(String tipo_Cliente) {
        this.tipo_Cliente = tipo_Cliente;
    }

    
    
    
    
}
