
package Models;

public class Cliente extends Persona {
    
    private int iD_Cliente;

    public Cliente() {
        super();
    }

    public Cliente(int iD_Cliente) {
        this.iD_Cliente = iD_Cliente;
    }

    public Cliente(String cedula, String nombres, String apellidos, String direccion, String correo, String celular, String genero, String fechaNacimiento,
            String estadoCivil, String nombreUsuario, String password, String correoRecuperacion) {
        super(cedula, nombres, apellidos, direccion, correo, celular, genero, fechaNacimiento, estadoCivil, nombreUsuario, password, correoRecuperacion);
    }

    
    
    public Cliente(int iD_Cliente, String cedula, String nombres, String apellidos, String direccion, String correo, String celular, String genero, String fechaNacimiento, String estadoCivil, String nombreUsuario, String password, String correoRecuperacion) {
        super(cedula, nombres, apellidos, direccion, correo, celular, genero, fechaNacimiento, estadoCivil, nombreUsuario, password, correoRecuperacion);
        this.iD_Cliente = iD_Cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "iD_Cliente=" + getiD_Cliente() + '}';
    }

    /**
     * @return the iD_Cliente
     */
    public int getiD_Cliente() {
        return iD_Cliente;
    }

    /**
     * @param iD_Cliente the iD_Cliente to set
     */
    public void setiD_Cliente(int iD_Cliente) {
        this.iD_Cliente = iD_Cliente;
    }

    
    
}
