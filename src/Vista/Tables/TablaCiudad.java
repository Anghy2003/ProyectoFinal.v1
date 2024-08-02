
package Vista.Tables;

import Conexion.Conexion_db;
import Conexion.ImageRenderer;
import Models.Ciudad;
import Vista.Cruds.CRUDS1.CrudCiudad;
import Vista.Cruds.CRUDS1.CrudCiudad2;
import Vista.Menu.VistaMenu;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TablaCiudad extends javax.swing.JPanel {

    
    public TablaCiudad() {
        initComponents();
        mostrarDatosCiudad();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarCiudad = new rojeru_san.RSMTextFull();
        btnAgregar = new rsbuttongradiente.RSButtonGradiente();
        btnBuscar = new rsbuttongradiente.RSButtonGradiente();
        tblCity = new javax.swing.JScrollPane();
        tblCiudad = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        jLabel1.setText("Listado Ciudades");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 38, -1, -1));

        txtBuscarCiudad.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        txtBuscarCiudad.setPlaceholder("ejm. 0106388747");
        jPanel2.add(txtBuscarCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, 40));

        btnAgregar.setText("Agregar");
        btnAgregar.setColorPrimario(new java.awt.Color(0, 204, 51));
        btnAgregar.setColorPrimarioHover(new java.awt.Color(0, 204, 51));
        btnAgregar.setColorSecundario(new java.awt.Color(153, 255, 153));
        btnAgregar.setColorSecundarioHover(new java.awt.Color(204, 255, 204));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 102, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.setColorPrimario(new java.awt.Color(0, 51, 153));
        btnBuscar.setColorPrimarioHover(new java.awt.Color(51, 0, 255));
        btnBuscar.setColorSecundario(new java.awt.Color(51, 153, 255));
        btnBuscar.setColorSecundarioHover(new java.awt.Color(153, 204, 255));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 102, -1));

        tblCity.setBackground(new java.awt.Color(255, 255, 255));
        tblCity.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblCity.setForeground(new java.awt.Color(255, 255, 255));

        tblCiudad.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCity.setViewportView(tblCiudad);

        jPanel2.add(tblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 890, 360));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel3.setText("Buscar");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked

    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        CrudCiudad ciudad3 = new CrudCiudad();
        ShowpanelCruds(ciudad3);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMouseClicked
    public final int VerificarCiudad(String ciudad) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Query query = BaseBD.query();
        query.constrain(Ciudad.class);
        query.descend("ciudad").constrain(ciudad.toUpperCase());        
        ObjectSet<Ciudad> resultado = query.execute();

        int coincidencias = resultado.size();

        BaseBD.close();
        return coincidencias;
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        
        if (!txtBuscarCiudad.getText().trim().isEmpty()) {
            String BuscarCiudad = txtBuscarCiudad.getText().trim();

            // Llamar al método VerificarAdministrador y obtener el número de coincidencias
            int coincidencias = VerificarCiudad(BuscarCiudad);

            // Verificar si se encontraron coincidencias
            if (coincidencias > 0) {
                // Crear una instancia del panel con los datos del administrador
                CrudCiudad2 mibuscarciu = new CrudCiudad2(BuscarCiudad);
                ShowpanelCruds(mibuscarciu);
            } else {
                // Mostrar mensaje si no se encontraron administradores
                JOptionPane.showMessageDialog(this, "Ciudad no encontrada");
            }
        } else {
                // Mostrar mensaje si el campo de búsqueda está vacío
            JOptionPane.showMessageDialog(this, "Ingrese un codigo ciudad.");
        
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void mostrarDatosCiudad() {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        tblCiudad.setEnabled(true);
        
        Ciudad city = new Ciudad();
        
        ObjectSet<Ciudad> resultado = BaseBD.get(city);

        Object matriz[][] = new Object[resultado.size()][5];
        int i = 0;
        for (Ciudad cty3 : resultado) {

            matriz[i][0] = cty3.getIdCiudad();
            matriz[i][1] = cty3.getCiudad();
            matriz[i][2] = String.valueOf(cty3.getPoblacion());
            matriz[i][3] = cty3.getRegion();
            

            byte[] imagen = cty3.getImagen();
            if (imagen != null) {
                ImageIcon icono = new ImageIcon(new ImageIcon(imagen).getImage().getScaledInstance(180, 140, Image.SCALE_SMOOTH));
                matriz[i][4] = new JLabel(icono);
            } else {
                matriz[i][4] = new JLabel("No image");
            }

            
            i++;
        }
        //datos configurados
        tblCiudad.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"ID Ciudad", "Nombre", "Poblacion aproximada", "Region", "Imagen"}));
        
       //  Usar el ImageRenderer para la columna de imágenes
        tblCiudad.getColumnModel().getColumn(4).setCellRenderer(new ImageRenderer());
        tblCiudad.setRowHeight(100);
        tblCiudad.setEnabled(false);
        BaseBD.close();
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
    private rsbuttongradiente.RSButtonGradiente btnAgregar;
    private rsbuttongradiente.RSButtonGradiente btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane tblCity;
    private javax.swing.JTable tblCiudad;
    private rojeru_san.RSMTextFull txtBuscarCiudad;
    // End of variables declaration//GEN-END:variables
}
