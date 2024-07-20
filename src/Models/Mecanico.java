
package Models;

public class Mecanico extends Persona {
    
    private int iD_Mecanico;
    private String titulo;
    private double Sueldo;

    public Mecanico() {
        super();
    }

    public Mecanico(int iD_Mecanico, String titulo, double Sueldo) {
        this.iD_Mecanico = iD_Mecanico;
        this.titulo = titulo;
        this.Sueldo = Sueldo;
    }

    public Mecanico(int iD_Mecanico, String titulo, double Sueldo, String cedula, String nombres, String apellidos, String direccion, String correo, String celular, String genero, String fechaNacimiento, String estadoCivil, String nombreUsuario, String password, String correoRecuperacion) {
        super(cedula, nombres, apellidos, direccion, correo, celular, genero, fechaNacimiento, estadoCivil, nombreUsuario, password, correoRecuperacion);
        this.iD_Mecanico = iD_Mecanico;
        this.titulo = titulo;
        this.Sueldo = Sueldo;
    }

    public Mecanico(String titulo, double Sueldo, String cedula, String nombres, String apellidos, String direccion, String correo, String celular, String genero,
            String fechaNacimiento, String estadoCivil, String nombreUsuario, String password, String correoRecuperacion) {
        super(cedula, nombres, apellidos, direccion, correo, celular, genero, fechaNacimiento, estadoCivil, nombreUsuario, password, correoRecuperacion);
        this.titulo = titulo;
        this.Sueldo = Sueldo;
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
    
    
}
