
package Models;

public class DetalleFactura_1 {
  private String  codigo_encabezadoFactura;
  private String codigoProducto_detalleFactura;
  private int cantidad_detalleFactura;

    public DetalleFactura_1() {
    }

    public DetalleFactura_1(String codigo_encabezadoFactura, String codigoProducto_detalleFactura, int cantidad_detalleFactura) {
        this.codigo_encabezadoFactura = codigo_encabezadoFactura;
        this.codigoProducto_detalleFactura = codigoProducto_detalleFactura;
        this.cantidad_detalleFactura = cantidad_detalleFactura;
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
     * @return the codigoProducto_detalleFactura
     */
    public String getCodigoProducto_detalleFactura() {
        return codigoProducto_detalleFactura;
    }

    /**
     * @param codigoProducto_detalleFactura the codigoProducto_detalleFactura to set
     */
    public void setCodigoProducto_detalleFactura(String codigoProducto_detalleFactura) {
        this.codigoProducto_detalleFactura = codigoProducto_detalleFactura;
    }

    /**
     * @return the cantidad_detalleFactura
     */
    public int getCantidad_detalleFactura() {
        return cantidad_detalleFactura;
    }

    /**
     * @param cantidad_detalleFactura the cantidad_detalleFactura to set
     */
    public void setCantidad_detalleFactura(int cantidad_detalleFactura) {
        this.cantidad_detalleFactura = cantidad_detalleFactura;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" + "codigo_encabezadoFactura=" + codigo_encabezadoFactura + ", codigoProducto_detalleFactura=" + codigoProducto_detalleFactura + ", cantidad_detalleFactura=" + cantidad_detalleFactura + '}';
    }
  
}
