package Vista.PanelSubmenus;

import Vista.Menu.VistaMenu;
import static Vista.Menu.VistaMenu.PanelHeader;
import static Vista.Menu.VistaMenu.PanelPrincipal;
import static Vista.Menu.VistaMenu.PanelSubmenu;
import Vista.Tables.TablaMarcasVehiculo;
import Vista.Tables.TablaVehiculos;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author aberr
 */
public class PanelSubmenuAuto extends javax.swing.JPanel {
    public PanelSubmenuAuto() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGestionMarcas = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnGestionMarcas = new javax.swing.JToggleButton();
        btnGestionVehiculos = new javax.swing.JToggleButton();
        btnGestionColores = new javax.swing.JToggleButton();

        pnlGestionMarcas.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(0, 53, 79));

        btnGestionMarcas.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        btnGestionMarcas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/marca32x32.png"))); // NOI18N
        btnGestionMarcas.setText("Gestion de marcas");
        btnGestionMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionMarcasActionPerformed(evt);
            }
        });

        btnGestionVehiculos.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        btnGestionVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/embotellamiento.png"))); // NOI18N
        btnGestionVehiculos.setText("Gestion de vehículos");
        btnGestionVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionVehiculosActionPerformed(evt);
            }
        });

        btnGestionColores.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        btnGestionColores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/paletaColores32x32.png"))); // NOI18N
        btnGestionColores.setText("Gestion de colores");
        btnGestionColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionColoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 310, Short.MAX_VALUE)
                .addComponent(btnGestionColores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGestionMarcas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGestionVehiculos)
                .addGap(29, 29, 29))
            .addComponent(jSeparator1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGestionMarcas)
                    .addComponent(btnGestionVehiculos)
                    .addComponent(btnGestionColores))
                .addContainerGap())
        );

        pnlGestionMarcas.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlGestionMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlGestionMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionMarcasActionPerformed
        TablaMarcasVehiculo tblMArcas = new TablaMarcasVehiculo();
        ShowpanelCruds(tblMArcas);
    }//GEN-LAST:event_btnGestionMarcasActionPerformed

    private void btnGestionVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionVehiculosActionPerformed
        TablaVehiculos vehiculof = new TablaVehiculos();
        MostarpanelCruds(vehiculof);
        PanelSubmenuAuto autopanel = new PanelSubmenuAuto();
        MostrarpanelSubmenu(autopanel);
    }//GEN-LAST:event_btnGestionVehiculosActionPerformed

    private void btnGestionColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionColoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionColoresActionPerformed

    private void MostrarpanelTitulo(JPanel p) {
        p.setSize(870, 80);
        p.setLocation(0, 0);
        PanelHeader.removeAll();
        PanelHeader.add(p, BorderLayout.CENTER);
        PanelHeader.revalidate();
        PanelHeader.repaint();
    }
    private void MostrarpanelSubmenu(JPanel p) {
        p.setSize(870, 80);
        p.setLocation(0, 0);
        PanelSubmenu.removeAll();
        PanelSubmenu.add(p, BorderLayout.CENTER);
        PanelSubmenu.revalidate();
        PanelSubmenu.repaint();

    }

    private void MostarpanelCruds(JPanel p) {
        p.setSize(870, 630);
        p.setLocation(0, 0);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(p, BorderLayout.CENTER);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
    }
    private void ShowpanelCruds(JPanel p) {
        p.setSize(870, 630);
        p.setLocation(0, 0);
        VistaMenu.PanelPrincipal.removeAll();
        VistaMenu.PanelPrincipal.add(p, BorderLayout.CENTER);
        VistaMenu.PanelPrincipal.revalidate();
        VistaMenu.PanelPrincipal.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnGestionColores;
    private javax.swing.JToggleButton btnGestionMarcas;
    private javax.swing.JToggleButton btnGestionVehiculos;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnlGestionMarcas;
    // End of variables declaration//GEN-END:variables
}
