/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DUENO;

import DUENO.*;
import Modelo.conexion;
import javax.swing.JPanel;
import Vista.menu.Menu;
import java.awt.BorderLayout;

/**
 *
 * @author aberr
 */
public class TablaDuenos extends javax.swing.JPanel {

    /**
     * Creates new form CRUDMascotas
     */
    public TablaDuenos() {
        initComponents();
        conexion Base = new conexion();
        DuenoDb miDueno = new DuenoDb(Base);
        miDueno.cargarDatosEnTabla(tblDuenos);
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlPrincipalTabla = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lblMASCOTAS = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnlTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDuenos = new javax.swing.JTable();

        pnlLogo.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogo.setForeground(new java.awt.Color(204, 204, 204));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOPL.png"))); // NOI18N

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogoLayout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(700, 480));
        setMinimumSize(new java.awt.Dimension(700, 480));
        setPreferredSize(new java.awt.Dimension(700, 582));

        pnlPrincipalTabla.setBackground(new java.awt.Color(183, 224, 210));
        pnlPrincipalTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(78, 108, 152)));
        pnlPrincipalTabla.setPreferredSize(new java.awt.Dimension(700, 480));

        btnSalir.setBackground(new java.awt.Color(183, 224, 210));
        btnSalir.setForeground(new java.awt.Color(78, 108, 152));
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        lblMASCOTAS.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        lblMASCOTAS.setForeground(new java.awt.Color(78, 108, 152));
        lblMASCOTAS.setText("DUEÑOS");

        jPanel1.setBackground(new java.awt.Color(183, 224, 210));

        pnlTabla.setBackground(new java.awt.Color(183, 224, 210));
        pnlTabla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(78, 108, 152), 1, true));

        tblDuenos.setBackground(new java.awt.Color(255, 255, 255));
        tblDuenos.setForeground(new java.awt.Color(0, 0, 0));
        tblDuenos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDuenos.setEnabled(false);
        tblDuenos.setSelectionForeground(new java.awt.Color(183, 224, 210));
        tblDuenos.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(tblDuenos);

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnlTabla);

        javax.swing.GroupLayout pnlPrincipalTablaLayout = new javax.swing.GroupLayout(pnlPrincipalTabla);
        pnlPrincipalTabla.setLayout(pnlPrincipalTablaLayout);
        pnlPrincipalTablaLayout.setHorizontalGroup(
            pnlPrincipalTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalTablaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMASCOTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlPrincipalTablaLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPrincipalTablaLayout.setVerticalGroup(
            pnlPrincipalTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalTablaLayout.createSequentialGroup()
                .addGroup(pnlPrincipalTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addGroup(pnlPrincipalTablaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMASCOTAS)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipalTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipalTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents



    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        pnlPrincipalTabla.setVisible(false);
        Mostrarpanelcrud(pnlLogo);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void Mostrarpanelcrud(JPanel p) {
        p.setSize(700, 460);
        p.setLocation(0, 0);
        Menu.PanelPrincipal.removeAll();
        Menu.PanelPrincipal.add(p, BorderLayout.CENTER);
        Menu.PanelPrincipal.revalidate();
        Menu.PanelPrincipal.repaint();
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMASCOTAS;
    public static javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlPrincipalTabla;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JTable tblDuenos;
    // End of variables declaration//GEN-END:variables
}
