
package Models;

public class Mecanico extends Persona {
    
    private String iD_Mecanico;
    private String titulo;
    private double Sueldo;

    public Mecanico() {
        super();
    }

    public Mecanico(String iD_Mecanico, String titulo, double Sueldo) {
        this.iD_Mecanico = iD_Mecanico;
        this.titulo = titulo;
        this.Sueldo = Sueldo;
    }

    public Mecanico(String iD_Mecanico, String titulo, double Sueldo, String cedula, String nombres, String apellidos, String direccion, String correo, String celular, String genero, String fechaNacimiento, String estadoCivil, String nombreUsuario, String password, String correoRecuperacion) {
        super(cedula, nombres, apellidos, direccion, correo, celular, genero, fechaNacimiento, estadoCivil, nombreUsuario, password, correoRecuperacion);
        this.iD_Mecanico = iD_Mecanico;
        this.titulo = titulo;
        this.Sueldo = Sueldo;
    }
    
    
}
