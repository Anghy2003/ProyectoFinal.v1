
package Models;

public class DetalleFactura_1 {
  private String  codigo_encabezadoFactura;
  private String codigoProducto_detalleFactura;
  private int cantidadProdcutos_detalleFactura;

    public DetalleFactura_1() {
    }

    public DetalleFactura_1(String codigo_encabezadoFactura, String codigoProducto_detalleFactura, int cantidadProdcutos_detalleFactura) {
        this.codigo_encabezadoFactura = codigo_encabezadoFactura;
        this.codigoProducto_detalleFactura = codigoProducto_detalleFactura;
        this.cantidadProdcutos_detalleFactura = cantidadProdcutos_detalleFactura;
    }
    
    
    

    public DetalleFactura_1(String codigoProducto_detalleFactura) {
        this.codigoProducto_detalleFactura = codigoProducto_detalleFactura;
    }

    public String getCodigo_encabezadoFactura() {
        return codigo_encabezadoFactura;
    }

    public void setCodigo_encabezadoFactura(String codigo_encabezadoFactura) {
        this.codigo_encabezadoFactura = codigo_encabezadoFactura;
    }

    public String getCodigoProducto_detalleFactura() {
        return codigoProducto_detalleFactura;
    }

    public void setCodigoProducto_detalleFactura(String codigoProducto_detalleFactura) {
        this.codigoProducto_detalleFactura = codigoProducto_detalleFactura;
    }

    public int getCantidadProdcutos_detalleFactura() {
        return cantidadProdcutos_detalleFactura;
    }

    public void setCantidadProdcutos_detalleFactura(int cantidadProdcutos_detalleFactura) {
        this.cantidadProdcutos_detalleFactura = cantidadProdcutos_detalleFactura;
    }
  

    }