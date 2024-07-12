/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author 59399
 */
public class EncabezadoFactura_1 {
private String codigo_encabezadoFactura;
private String fecha_encabezadoFactura;
private String cedulaCliente_encabezadoFactura;

private double total_encabezadoFactura;

    public EncabezadoFactura_1() {
    }

    public EncabezadoFactura_1(String codigo_encabezadoFactura) {
        this.codigo_encabezadoFactura = codigo_encabezadoFactura;
    }

    
    public EncabezadoFactura_1(String codigo_encabezadoFactura, String fecha_encabezadoFactura, String cedulaCliente_encabezadoFactura, double total_encabezadoFactura) {
        this.codigo_encabezadoFactura = codigo_encabezadoFactura;
        this.fecha_encabezadoFactura = fecha_encabezadoFactura;
        this.cedulaCliente_encabezadoFactura = cedulaCliente_encabezadoFactura;
        this.total_encabezadoFactura = total_encabezadoFactura;
    }

    /**
     * @return the codigo_encabezadoFactura
     */
    public String getCodigo_encabezadoFactura() {
        return codigo_encabezadoFactura;
    }

    /**
     * @param codigo_encabezadoFactura the codigo_encabezadoFactura to set
     */
    public void setCodigo_encabezadoFactura(String codigo_encabezadoFactura) {
        this.codigo_encabezadoFactura = codigo_encabezadoFactura;
    }

    /**
     * @return the fecha_encabezadoFactura
     */
    public String getFecha_encabezadoFactura() {
        return fecha_encabezadoFactura;
    }

    /**
     * @param fecha_encabezadoFactura the fecha_encabezadoFactura to set
     */
    public void setFecha_encabezadoFactura(String fecha_encabezadoFactura) {
        this.fecha_encabezadoFactura = fecha_encabezadoFactura;
    }

    /**
     * @return the cedulaCliente_encabezadoFactura
     */
    public String getCedulaCliente_encabezadoFactura() {
        return cedulaCliente_encabezadoFactura;
    }

    /**
     * @param cedulaCliente_encabezadoFactura the cedulaCliente_encabezadoFactura to set
     */
    public void setCedulaCliente_encabezadoFactura(String cedulaCliente_encabezadoFactura) {
        this.cedulaCliente_encabezadoFactura = cedulaCliente_encabezadoFactura;
    }

    /**
     * @return the total_encabezadoFactura
     */
    public double getTotal_encabezadoFactura() {
        return total_encabezadoFactura;
    }

    /**
     * @param total_encabezadoFactura the total_encabezadoFactura to set
     */
    public void setTotal_encabezadoFactura(double total_encabezadoFactura) {
        this.total_encabezadoFactura = total_encabezadoFactura;
    }

    @Override
    public String toString() {
        return "EncabezadoFactura{" + "codigo_encabezadoFactura=" + codigo_encabezadoFactura + ", fecha_encabezadoFactura=" + fecha_encabezadoFactura + ", cedulaCliente_encabezadoFactura=" + cedulaCliente_encabezadoFactura + ", total_encabezadoFactura=" + total_encabezadoFactura + '}';
    }

}
