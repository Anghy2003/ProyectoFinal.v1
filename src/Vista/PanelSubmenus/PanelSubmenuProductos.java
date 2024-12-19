
package Vista.PanelSubmenus;

import Vista.Catálogo.CrudProductos;
import Vista.Menu.VistaMenu;
import Vista.Tables.TablaCategoria;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class PanelSubmenuProductos extends javax.swing.JPanel {

    /**
     * Creates new form PanelSubmenuAuto
     */
    public PanelSubmenuProductos() {
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
        jSeparator1 = new javax.swing.JSeparator();
        btngestion = new javax.swing.JToggleButton();
        btnCategoria1 = new javax.swing.JToggleButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(0, 53, 79));

        btngestion.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        btngestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar-producto.png"))); // NOI18N
        btngestion.setText("GESTION PRODUCTOS");
        btngestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngestionActionPerformed(evt);
            }
        });

        btnCategoria1.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        btnCategoria1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/categorias.png"))); // NOI18N
        btnCategoria1.setText("CATEGORIA PRODUCTOS");
        btnCategoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoria1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(405, Short.MAX_VALUE)
                .addComponent(btngestion)
                .addGap(18, 18, 18)
                .addComponent(btnCategoria1)
                .addGap(51, 51, 51))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btngestion, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(btnCategoria1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btngestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngestionActionPerformed
        CrudProductos pro= new CrudProductos();
        MostrarpaneCruds(pro);
    }//GEN-LAST:event_btngestionActionPerformed

    private void btnCategoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoria1ActionPerformed
        TablaCategoria tblcat = new TablaCategoria();
        MostrarpaneCruds(tblcat);
    }//GEN-LAST:event_btnCategoria1ActionPerformed
private void MostrarpaneCruds(JPanel p) {
        p.setSize(870, 630);
        p.setLocation(0, 0);
        VistaMenu.PanelPrincipal.removeAll();
        VistaMenu.PanelPrincipal.add(p, BorderLayout.CENTER);
        VistaMenu.PanelPrincipal.revalidate();
        VistaMenu.PanelPrincipal.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCategoria1;
    private javax.swing.JToggleButton btngestion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}