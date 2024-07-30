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
public class CategoriaServicio {
    private String codigoCatSer;
   private String nombreCatSer;
   private String DescripcionCatSer;

    public CategoriaServicio() {
    }

    public CategoriaServicio(String codigoCatSer, String nombreCatSer, String DescripcionCatSer) {
        this.codigoCatSer = codigoCatSer;
        this.nombreCatSer = nombreCatSer;
        this.DescripcionCatSer = DescripcionCatSer;
    }

    public String getCodigoCatSer() {
        return codigoCatSer;
    }

    public void setCodigoCatSer(String codigoCatSer) {
        this.codigoCatSer = codigoCatSer;
    }

    public String getNombreCatSer() {
        return nombreCatSer;
    }

    public void setNombreCatSer(String nombreCatSer) {
        this.nombreCatSer = nombreCatSer;
    }

    public String getDescripcionCatSer() {
        return DescripcionCatSer;
    }

    public void setDescripcionCatSer(String DescripcionCatSer) {
        this.DescripcionCatSer = DescripcionCatSer;
    }

    
}
