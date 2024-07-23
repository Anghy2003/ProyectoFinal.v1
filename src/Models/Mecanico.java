package Models;

public class Mecanico extends Persona {

    private int iD_Mecanico;
    private String titulo;
    private double Sueldo;
    private Estado estado;

    //haremos que tenga solo dos posibles valores
    public enum Estado {
        ACTIVO,
        INACTIVO
    }

    public Mecanico(String titulo, double Sueldo, Estado estado, String cedula, String nombres, String apellidos,
            String direccion, String correo, String celular, String genero, String fechaNacimiento, String estadoCivil,
            String nombreUsuario, String password, String correoRecuperacion) {
        super(cedula, nombres, apellidos, direccion, correo, celular, genero, fechaNacimiento, estadoCivil, nombreUsuario, password, correoRecuperacion);
        this.titulo = titulo;
        this.Sueldo = Sueldo;
        this.estado = Estado.ACTIVO;
    }

    public Mecanico() {
        super();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mecanico{" + "iD_Mecanico=" + getiD_Mecanico() + ", titulo=" + getTitulo() + ", Sueldo=" + getSueldo() + '}';
    }

    /**
     * @return the iD_Mecanico
     */
    public int getiD_Mecanico() {
        return iD_Mecanico;
    }

    /**
     * @param iD_Mecanico the iD_Mecanico to set
     */
    public void setiD_Mecanico(int iD_Mecanico) {
        this.iD_Mecanico = iD_Mecanico;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the Sueldo
     */
    public double getSueldo() {
        return Sueldo;
    }

    /**
     * @param Sueldo the Sueldo to set
     */
    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    //METODOS
    public void activarMecanico() {
        this.estado = Estado.ACTIVO;
    }

    public void desactivarMecanico() {
        this.estado = Estado.INACTIVO;
    }

}
