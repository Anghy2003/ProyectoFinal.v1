/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Catálogo;

import Conexion.Conexion_db;
import Models.Categoria;
import Vista.Menu.VistaMenu;
import Vista.Tables.TablaCategoria;
import Vista.Tables.TablaProductos;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 59399
 */
public class CrudCategoria extends javax.swing.JPanel {

    /**
     * Creates new form CrudCategoria
     */
    public CrudCategoria() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombres = new rojeru_san.RSMTextFull();
        btnCancelar = new rojeru_san.RSButtonRiple();
        btnGuardar = new rojeru_san.RSButtonRiple();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new rojeru_san.RSMTextFull();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Registro De Categorias De Productos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 510, 40));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 53, 79));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 100, 20));

        txtNombres.setForeground(new java.awt.Color(0, 53, 79));
        txtNombres.setColorTransparente(true);
        txtNombres.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombres.setPlaceholder("Escriba el nombre");
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 200, 40));

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        lblDescripcion.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 53, 79));
        lblDescripcion.setText("Descripción:");
        jPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 120, -1));

        txtDescripcion.setForeground(new java.awt.Color(0, 53, 79));
        txtDescripcion.setColorTransparente(true);
        txtDescripcion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDescripcion.setPlaceholder("Descripción");
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 200, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        CrudPanelServicios ser = new CrudPanelServicios();
        MostrarpaneCruds(ser);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       if (!txtNombres.getText().trim().isBlank()) {
        // número con dos decimales para el precio
        guardarCategoria(
                txtNombres.getText(),
                txtDescripcion.getText());
        
        resetCampos();
    } else {
        JOptionPane.showMessageDialog(this, "No deje espacios en blanco en el nombre de la Categoria");
    }
        // Redirigir a la tabla de productos después de guardar
    TablaCategoria tblproCA = new TablaCategoria();
    MostrarpaneCruds(tblproCA);
    }//GEN-LAST:event_btnGuardarActionPerformed
    public static void guardarCategoria(String nombreCat, String descripcionCat) {
    // Establecer conexión con la base de datos
    ObjectContainer baseBD = Conexion_db.ConectarBD();

    // Obtener el próximo código de categoría disponible
    String codigoCat = obtenerProximoCodigoCategoria(baseBD);

    // Crear objeto de Categoria
    Categoria nuevaCategoria = new Categoria(codigoCat, nombreCat, descripcionCat);

    // Guardar la categoría en la base de datos
    baseBD.set(nuevaCategoria);
    JOptionPane.showMessageDialog(null, "Categoria guardada exitosamente.");

    // Cerrar conexión con la base de datos
    baseBD.close();
}
// Método para verificar si una nueva categoria existe

    public static int verificarCategoria(ObjectContainer baseBD, String codigoCat) {
        // Crear objeto para buscar el servicio por su código
        Categoria servicioBusca = new Categoria(codigoCat, null, null);
        ObjectSet<Categoria> resultado = baseBD.get(servicioBusca);
        return resultado.size();
    }
    // Método para obtener el próximo código de servicio disponible

   private static String obtenerProximoCodigoCategoria(ObjectContainer db) {
    // Consultar todas las categorías
    ObjectSet<Categoria> result = db.query(Categoria.class);

    // Determinar el máximo ID numérico existente
    int maxID = 0;
    for (Categoria categoria : result) {
        String codigo = categoria.getCodigoCat();
        if (codigo != null && codigo.startsWith("CAT-")) {
            int id = Integer.parseInt(codigo.substring(4)); // Extraer la parte numérica del código
            if (id > maxID) {
                maxID = id;
            }
        }
    }
    // El próximo ID es el máximo + 1
    int siguienteID = maxID + 1;
    // Retornar el nuevo código concatenado con "CAT-"
    return "CAT-" + siguienteID;
}
   private void resetCampos() {
    txtNombres.setText("");
    txtDescripcion.setText("");
}
    
    private void MostrarpaneCruds(JPanel p) {
        p.setSize(870, 630);
        p.setLocation(0, 0);
        VistaMenu.PanelPrincipal.removeAll();
        VistaMenu.PanelPrincipal.add(p, BorderLayout.CENTER);
        VistaMenu.PanelPrincipal.revalidate();
        VistaMenu.PanelPrincipal.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDescripcion;
    private rojeru_san.RSMTextFull txtDescripcion;
    private rojeru_san.RSMTextFull txtNombres;
    // End of variables declaration//GEN-END:variables
}
