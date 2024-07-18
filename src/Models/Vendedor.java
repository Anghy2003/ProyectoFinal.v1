package Models;

public class Vendedor extends Persona {

    private int iD_Vendedor;
    private double sueldoBase_Vendedor;
    private double comiciones_Vendedor;
    private int numeroVentas_Vendedor;

    public Vendedor() {
        super();
    }

    public Vendedor(int iD_Vendedor, double sueldoBase_Vendedor, double comiciones_Vendedor, int numeroVentas_Vendedor) {
        this.iD_Vendedor = iD_Vendedor;
        this.sueldoBase_Vendedor = sueldoBase_Vendedor;
        this.comiciones_Vendedor = comiciones_Vendedor;
        this.numeroVentas_Vendedor = numeroVentas_Vendedor;
    }

    public Vendedor(double sueldoBase_Vendedor, double comiciones_Vendedor, int numeroVentas_Vendedor, String cedula, String nombres, String apellidos, String direccion, String correo, String celular, String genero, String fechaNacimiento, String estadoCivil, String nombreUsuario, String password, String correoRecuperacion) {
        super(cedula, nombres, apellidos, direccion, correo, celular, genero, fechaNacimiento, estadoCivil, nombreUsuario, password, correoRecuperacion);
        this.sueldoBase_Vendedor = sueldoBase_Vendedor;
        this.comiciones_Vendedor = comiciones_Vendedor;
        this.numeroVentas_Vendedor = numeroVentas_Vendedor;
    }

   
    
    

    public Vendedor(int iD_Vendedor, double sueldoBase_Vendedor, double comiciones_Vendedor, int numeroVentas_Vendedor, String cedula, String nombres,
            String apellidos, String direccion, String correo, String celular, String genero, String fechaNacimiento, String estadoCivil, String nombreUsuario,
            String password, String correoRecuperacion) {
        super(cedula, nombres, apellidos, direccion, correo, celular, genero, fechaNacimiento, estadoCivil, nombreUsuario, password, correoRecuperacion);
        this.iD_Vendedor = iD_Vendedor;
        this.sueldoBase_Vendedor = sueldoBase_Vendedor;
        this.comiciones_Vendedor = comiciones_Vendedor;
        this.numeroVentas_Vendedor = numeroVentas_Vendedor;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "iD_Vendedor=" + getiD_Vendedor() + ", sueldoBase_Vendedor=" + getSueldoBase_Vendedor() + ", comiciones_Vendedor=" + getComiciones_Vendedor() + ", numeroVentas_Vendedor=" + getNumeroVentas_Vendedor() + '}';
    }

    /**
     * @return the iD_Vendedor
     */
    public int getiD_Vendedor() {
        return iD_Vendedor;
    }

    /**
     * @param iD_Vendedor the iD_Vendedor to set
     */
    public void setiD_Vendedor(int iD_Vendedor) {
        this.iD_Vendedor = iD_Vendedor;
    }

    /**
     * @return the sueldoBase_Vendedor
     */
    public double getSueldoBase_Vendedor() {
        return sueldoBase_Vendedor;
    }

    /**
     * @param sueldoBase_Vendedor the sueldoBase_Vendedor to set
     */
    public void setSueldoBase_Vendedor(double sueldoBase_Vendedor) {
        this.sueldoBase_Vendedor = sueldoBase_Vendedor;
    }

    /**
     * @return the comiciones_Vendedor
     */
    public double getComiciones_Vendedor() {
        return comiciones_Vendedor;
    }

    /**
     * @param comiciones_Vendedor the comiciones_Vendedor to set
     */
    public void setComiciones_Vendedor(double comiciones_Vendedor) {
        this.comiciones_Vendedor = comiciones_Vendedor;
    }

    /**
     * @return the numeroVentas_Vendedor
     */
    public int getNumeroVentas_Vendedor() {
        return numeroVentas_Vendedor;
    }

    /**
     * @param numeroVentas_Vendedor the numeroVentas_Vendedor to set
     */
    public void setNumeroVentas_Vendedor(int numeroVentas_Vendedor) {
        this.numeroVentas_Vendedor = numeroVentas_Vendedor;
    }

}
