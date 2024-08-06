
package Models;

public abstract class  Persona {
    
   private String cedula;
   private String nombres;
   private String apellidos;
   private String direccion;
   private String correo;
   private String celular;
   private String genero;
   private String fechaNacimiento;
   private String estadoCivil;
   private String nombreUsuario;
   private String password;   
   private String correoRecuperacion;   
   private Rol rol;
   
   public enum Rol {
        ADMINISTRADOR,
        CLIENTE,
        VENDEDOR,
        MECANICO
    }

    public Persona() {
    }

    public Persona(String cedula, String nombres, String apellidos, String direccion, String correo, String celular, String genero,
            String fechaNacimiento, String estadoCivil, String nombreUsuario, String password, String correoRecuperacion ,Rol rol) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correo = correo;
        this.celular = celular;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.correoRecuperacion = correoRecuperacion;        
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + getCedula() + ", nombres=" + getNombres() + ", apellidos=" + getApellidos() + ", direccion=" + getDireccion() + 
                ", correo=" + getCorreo() + ", celular=" + getCelular() + ", genero=" + getGenero() + ", fechaNacimiento=" + getFechaNacimiento() + 
                ", estadoCivil=" + getEstadoCivil() + ", nombreUsuario=" + getNombreUsuario() + ", password=" + getPassword() + ", correoRecuperacion=" + getCorreoRecuperacion() + '}';
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the estadoCivil
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param estadoCivil the estadoCivil to set
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
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

   

    /**
     * @return the rol
     */
    public Rol getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(Rol rol) {
        this.rol = rol;
    }
   
    
   

    public static boolean validarCedula(String cedula) {
        // Verificar que la cédula tenga 10 dígitos
        if (cedula == null || cedula.length() != 10) {
            return false;
        }

        try {
            // Verificar que la cédula esté compuesta solo por números
            Long.parseLong(cedula);
        } catch (NumberFormatException e) {
            return false;
        }

        // Extraer los dígitos necesarios
        int provincia = Integer.parseInt(cedula.substring(0, 2));
        int tercerDigito = Integer.parseInt(cedula.substring(2, 3));

        // Verificar que el número de provincia sea válido (0-24)
        if (provincia < 0 || provincia > 24) {
            return false;
        }

        // Verificar que el tercer dígito sea menor que 6
        if (tercerDigito >= 6) {
            return false;
        }

        // Coeficientes para la validación de cédulas
        int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        int total = 0;

        for (int i = 0; i < coeficientes.length; i++) {
            int digito = Character.getNumericValue(cedula.charAt(i));
            int producto = digito * coeficientes[i];

            if (producto >= 10) {
                producto -= 9;
            }

            total += producto;
        }

        // Verificar el dígito verificador
        int digitoVerificador = Character.getNumericValue(cedula.charAt(9));
        int modulo = total % 10;
        int valorVerificador = (modulo == 0) ? 0 : 10 - modulo;

        return valorVerificador == digitoVerificador;
    }

    
}