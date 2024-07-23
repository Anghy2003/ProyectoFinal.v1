
package Models;


public class Categoria {
   private String codigoCat;
   private String nombreCat;
   private String DescripcionCat;

    public Categoria() {
    }

    public Categoria(String codigoCat, String nombreCat, String DescripcionCat) {
        this.codigoCat = codigoCat;
        this.nombreCat = nombreCat;
        this.DescripcionCat = DescripcionCat;
    }

    public String getCodigoCat() {
        return codigoCat;
    }

    public void setCodigoCat(String codigoCat) {
        this.codigoCat = codigoCat;
    }

    public String getNombreCat() {
        return nombreCat;
    }

    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }

    public String getDescripcionCat() {
        return DescripcionCat;
    }

    public void setDescripcionCat(String DescripcionCat) {
        this.DescripcionCat = DescripcionCat;
    }
   
}
