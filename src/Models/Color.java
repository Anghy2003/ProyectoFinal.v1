
package Models;

/**
 *
 * @author aberr
 */
public class Color {
    private String codigoColor;
    private String Nomnbre_color;
    private String tipoColor;
    
    public Color() {
    }

    public Color(String codigoColor, String Nomnbre_color, String tipoColor) {
        this.codigoColor = codigoColor;
        this.Nomnbre_color = Nomnbre_color;
        this.tipoColor = tipoColor;
    }

    /**
     * @return the codigoColor
     */
    public String getCodigoColor() {
        return codigoColor;
    }

    /**
     * @param codigoColor the codigoColor to set
     */
    public void setCodigoColor(String codigoColor) {
        this.codigoColor = codigoColor;
    }

    /**
     * @return the Nomnbre_color
     */
    public String getNomnbre_color() {
        return Nomnbre_color;
    }

    /**
     * @param Nomnbre_color the Nomnbre_color to set
     */
    public void setNomnbre_color(String Nomnbre_color) {
        this.Nomnbre_color = Nomnbre_color;
    }

    /**
     * @return the tipoColor
     */
    public String getTipoColor() {
        return tipoColor;
    }

    /**
     * @param tipoColor the tipoColor to set
     */
    public void setTipoColor(String tipoColor) {
        this.tipoColor = tipoColor;
    }
    
}
