
package Vista.Catálogo;

import Conexion.Conexion_db;
import Models.IdManager;
import Models.Producto;
import Models.Servicios;

import Vista.Menu.VistaMenu;
import Vista.Tables.TablaClientes;
import Vista.Tables.TablaServicios;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CrudPanelServicios extends javax.swing.JPanel {

    /**
     * Creates new form CrudPanelServicios
     */
    public CrudPanelServicios() {
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
        txtCodigo = new rojeru_san.RSMTextFull();
        jLabel4 = new javax.swing.JLabel();
        txtNombres = new rojeru_san.RSMTextFull();
        txtDuracion = new rojeru_san.RSMTextFull();
        btnCancelar = new rojeru_san.RSButtonRiple();
        btnGuardar = new rojeru_san.RSButtonRiple();
        lblCodigooProducto = new javax.swing.JLabel();
        lblPrecioProducto = new javax.swing.JLabel();
        lblCodigoocategoria = new javax.swing.JLabel();
        lblNumeroProductos = new javax.swing.JLabel();
        lblExistenciaMinima = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new rojeru_san.RSMTextFull();
        txtPlacaVehiculo = new rojeru_san.RSMTextFull();
        txtPrecio = new rojeru_san.RSMTextFull();
        txtIdMecanico = new rojeru_san.RSMTextFull();
        jFileChooser1 = new javax.swing.JFileChooser();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Registro De Servicios");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 330, 40));

        txtCodigo.setForeground(new java.awt.Color(0, 53, 79));
        txtCodigo.setColorTransparente(true);
        txtCodigo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCodigo.setPlaceholder("Código");
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 200, 40));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 53, 79));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 100, 40));

        txtNombres.setForeground(new java.awt.Color(0, 53, 79));
        txtNombres.setColorTransparente(true);
        txtNombres.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombres.setPlaceholder("Escriba el nombre");
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 200, 40));

        txtDuracion.setForeground(new java.awt.Color(0, 53, 79));
        txtDuracion.setColorTransparente(true);
        txtDuracion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDuracion.setPlaceholder("Duración del Servicio");
        jPanel1.add(txtDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 200, 40));

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, -1, -1));

        lblCodigooProducto.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblCodigooProducto.setForeground(new java.awt.Color(0, 53, 79));
        lblCodigooProducto.setText("Código:");
        jPanel1.add(lblCodigooProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lblPrecioProducto.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblPrecioProducto.setForeground(new java.awt.Color(0, 53, 79));
        lblPrecioProducto.setText("Precio Total:");
        jPanel1.add(lblPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        lblCodigoocategoria.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblCodigoocategoria.setForeground(new java.awt.Color(0, 53, 79));
        lblCodigoocategoria.setText("Duración del servicio:");
        jPanel1.add(lblCodigoocategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        lblNumeroProductos.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblNumeroProductos.setForeground(new java.awt.Color(0, 53, 79));
        lblNumeroProductos.setText("ID del Mecanico:");
        jPanel1.add(lblNumeroProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        lblExistenciaMinima.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblExistenciaMinima.setForeground(new java.awt.Color(0, 53, 79));
        lblExistenciaMinima.setText("Placa del Vehiculo:");
        jPanel1.add(lblExistenciaMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        lblDescripcion.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 53, 79));
        lblDescripcion.setText("Descripción:");
        jPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        txtDescripcion.setForeground(new java.awt.Color(0, 53, 79));
        txtDescripcion.setColorTransparente(true);
        txtDescripcion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDescripcion.setPlaceholder("Descripción");
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 200, 40));

        txtPlacaVehiculo.setForeground(new java.awt.Color(0, 53, 79));
        txtPlacaVehiculo.setColorTransparente(true);
        txtPlacaVehiculo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtPlacaVehiculo.setPlaceholder("Placa Del Vehiculo");
        txtPlacaVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaVehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(txtPlacaVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 200, 40));

        txtPrecio.setForeground(new java.awt.Color(0, 53, 79));
        txtPrecio.setColorTransparente(true);
        txtPrecio.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtPrecio.setPlaceholder("Escriba el precio");
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 200, 40));

        txtIdMecanico.setForeground(new java.awt.Color(0, 53, 79));
        txtIdMecanico.setColorTransparente(true);
        txtIdMecanico.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtIdMecanico.setPlaceholder("ID del Mecanico");
        jPanel1.add(txtIdMecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 200, 40));
        jPanel1.add(jFileChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 220, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        TablaServicios tblser = new TablaServicios();
        MostrarpaneCruds(tblser);
    }//GEN-LAST:event_btnCancelarActionPerformed
    private void MostrarpaneCruds(JPanel p) {
        p.setSize(870, 630);
        p.setLocation(0, 0);
        VistaMenu.PanelPrincipal.removeAll();
        VistaMenu.PanelPrincipal.add(p, BorderLayout.CENTER);
        VistaMenu.PanelPrincipal.revalidate();
        VistaMenu.PanelPrincipal.repaint();
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Boolean encontrado = false;

// Verificar si el servicio ya está registrado
        if (verificarServicio(txtCodigo.getText()) != 0) {
            JOptionPane.showMessageDialog(null, "Código de Servicio ya registrado");
            encontrado = true;
        }

        if (!encontrado) {
            // Llamar al método para guardar el servicio
            guardarServicio(txtCodigo.getText().toUpperCase(), txtNombres.getText(), txtDescripcion.getText(), Double.parseDouble(txtPrecio.getText()), txtDuracion.getText(), true, txtIdMecanico.getText(), txtPlacaVehiculo.getText());

            JOptionPane.showMessageDialog(this, "Servicio Guardado");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    public static void guardarServicio(String codigo_Servicio, String nombre_Servicio, String descripcion_Servicio, double precioTotal_Servicio, String duracion_Servicio, boolean estado_Servicio, String Id_mecanico, String placa_Vehiculo) {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        // Obtener el gestor de ID
        ObjectSet<IdManager> result = BaseBD.query(IdManager.class);
        IdManager idManager;
        if (result.isEmpty()) {
            idManager = new IdManager(); // Si no hay gestor de ID, crear uno nuevo
        } else {
            idManager = result.get(0); // Obtener el primer gestor de ID encontrado
        }

        // Generar nuevo ID para el servicio
        int newServicioId = idManager.getLastServicio() + 1;

        // Crear objeto de servicio con el nuevo ID generado
        Servicios nuevoServicio = new Servicio(String.valueOf(newServicioId), codigo_Servicio, nombre_Servicio, descripcion_Servicio, precioTotal_Servicio, duracion_Servicio, estado_Servicio, Id_mecanico, placa_Vehiculo);

        // Actualizar el gestor de ID
        idManager.setLastServicio(newServicioId);

        // Guardar el servicio y el gestor de ID en la base de datos
        BaseBD.set(nuevoServicio);
        BaseBD.set(idManager);

        JOptionPane.showMessageDialog(null, "Servicio Guardado");

        // Cerrar conexión con la base de datos
        BaseBD.close();
    }

    public static int verificarServicio(String codigo_Servicio) {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        // Crear objeto para buscar el servicio por su código
        Servicio servicioBusca = new Servicio(null, codigo_Servicio, null, null, 0, null, false, null, null);
        ObjectSet resultado = BaseBD.get(servicioBusca);
        int coincidencias = resultado.size();

        // Cerrar conexión con la base de datos
        BaseBD.close();

        return coincidencias;
    }
    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtPlacaVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaVehiculoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigooProducto;
    private javax.swing.JLabel lblCodigoocategoria;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblExistenciaMinima;
    private javax.swing.JLabel lblNumeroProductos;
    private javax.swing.JLabel lblPrecioProducto;
    private rojeru_san.RSMTextFull txtCodigo;
    private rojeru_san.RSMTextFull txtDescripcion;
    private rojeru_san.RSMTextFull txtDuracion;
    private rojeru_san.RSMTextFull txtIdMecanico;
    private rojeru_san.RSMTextFull txtNombres;
    private rojeru_san.RSMTextFull txtPlacaVehiculo;
    private rojeru_san.RSMTextFull txtPrecio;
    // End of variables declaration//GEN-END:variables
}
