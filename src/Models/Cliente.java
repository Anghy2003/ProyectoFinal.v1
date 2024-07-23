
package Models;

public class Cliente extends Persona {
    
    private int iD_Cliente;
    private Estado estado;
    
    //haremos que tenga solo dos posibles valores
    public enum Estado {
        ACTIVO,
        INACTIVO
    }

    public Cliente() {
        super();
    }

    public Cliente(Estado estado, String cedula, String nombres, String apellidos, String direccion, String correo, String celular,
            String genero, String fechaNacimiento, String estadoCivil, String nombreUsuario, String password, String correoRecuperacion) {
        super(cedula, nombres, apellidos, direccion, correo, celular, genero, fechaNacimiento, estadoCivil, nombreUsuario, password, correoRecuperacion);
        this.estado = Estado.ACTIVO;
    }

    
    

   
    @Override
    public String toString() {
        return "Cliente{" + "iD_Cliente=" + getiD_Cliente() + '}';
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
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

    //METODOS
    public  void activarCliente() {
        this.estado = Estado.ACTIVO;
    }

    public  void desactivarCliente() {
        this.estado = Estado.INACTIVO;
    } 
    
    
}
