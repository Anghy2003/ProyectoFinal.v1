package Models;

public class Cliente extends Persona {

    private int iD_Cliente;
    private Estado estado;
    private String ciudad;
    private byte[] imagenCli;

    //haremos que tenga solo dos posibles valores
    public enum Estado {
        ACTIVO,
        INACTIVO
    }

    public Cliente() {
        super();
    }

    public Cliente(Estado estado, String ciudad, byte[] imagenCli, String cedula, String nombres, String apellidos, String direccion, String correo, String celular,
            String genero, String fechaNacimiento, String estadoCivil, String nombreUsuario, String password, String correoRecuperacion) {
        super(cedula, nombres, apellidos, direccion, correo, celular, genero, fechaNacimiento, estadoCivil, nombreUsuario, password, correoRecuperacion);
        this.estado = Estado.ACTIVO;
        this.ciudad = ciudad;
        this.imagenCli = imagenCli;
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

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the imagenCli
     */
    public byte[] getImagenCli() {
        return imagenCli;
    }

    /**
     * @param imagenCli the imagenCli to set
     */
    public void setImagenCli(byte[] imagenCli) {
        this.imagenCli = imagenCli;
    }

    //METODOS
    public void activarCliente() {
        this.setEstado(Estado.ACTIVO);
    }

    public void desactivarCliente() {
        this.setEstado(Estado.INACTIVO);
    }

}
