
package Models;

public class Administrador extends Persona {
    
    private int iD_Administrador;
    private String titulo_Administrador;
    private Estado estado;
    
    //haremos que tenga solo dos posibles valores
    public enum Estado {
        ACTIVO,
        INACTIVO
    }
    
    public Administrador() {
        super();
    }

    public Administrador(String titulo_Administrador, Estado estado, String cedula, String nombres, String apellidos, String direccion, String correo, String celular, String genero,
            String fechaNacimiento, String estadoCivil, String nombreUsuario, String password, String correoRecuperacion) {
        super(cedula, nombres, apellidos, direccion, correo, celular, genero, fechaNacimiento, estadoCivil, nombreUsuario, password, correoRecuperacion);
        this.titulo_Administrador = titulo_Administrador;
        this.estado = Estado.ACTIVO;
    }

    

    @Override
    public String toString() {
        return "Administrador{" + "iD_Administrador=" + getiD_Administrador() + ", titulo_Administrador=" + getTitulo_Administrador() + '}';
    }

    /**
     * @return the iD_Administrador
     */
    public int getiD_Administrador() {
        return iD_Administrador;
    }

    /**
     * @param iD_Administrador the iD_Administrador to set
     */
    public void setiD_Administrador(int iD_Administrador) {
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    //METODOS
    public  void activarAdministrador() {
        this.estado = Estado.ACTIVO;
    }

    public  void desactivarAdministrador() {
        this.estado = Estado.INACTIVO;
    } 
}
