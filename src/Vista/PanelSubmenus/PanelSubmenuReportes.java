
package Vista.PanelSubmenus;

import Vista.Cruds.pnlReporteProductos;
import Vista.Menu.VistaMenu;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class PanelSubmenuReportes extends javax.swing.JPanel {

    /**
     * Creates new form PanelSubmenu
     */
    public PanelSubmenuReportes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        btnreportetablas = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jToggleButton1.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/grafico.png"))); // NOI18N
        jToggleButton1.setText("REPORTE EN GRAFICOS ");

        btnreportetablas.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        btnreportetablas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/relacional.png"))); // NOI18N
        btnreportetablas.setText("REPORTES EN TABLAS ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(428, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnreportetablas, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(btnreportetablas))
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
private void ShowpanelCruds(JPanel p) {
    p.setSize(870, 630);
    p.setLocation(0, 0);
    VistaMenu.PanelPrincipal.removeAll();
    VistaMenu.PanelPrincipal.add(p, BorderLayout.CENTER);
    VistaMenu.PanelPrincipal.revalidate();
    VistaMenu.PanelPrincipal.repaint();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnreportetablas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
