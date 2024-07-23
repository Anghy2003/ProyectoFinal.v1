/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Tables;

import Conexion.Conexion_db;
import Models.Vendedor;
import static Models.Vendedor.Estado.ACTIVO;
import static Models.Vendedor.Estado.INACTIVO;
import Vista.Cruds.CRUDS1.CrudPanelVendedor;
import Vista.Cruds.CRUDS1.CrudPanelVendedor2;
import Vista.Menu.VistaMenu;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TablaVendedores extends javax.swing.JPanel {

    public TablaVendedores() {
        initComponents();
        mostrarDatosActivos();
        mostrarDatosInactivos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tableVendedor = new javax.swing.JScrollPane();
        tblVendedor = new javax.swing.JTable();
        txtBuscarVendedor = new rojeru_san.RSMTextFull();
        btnAgregarVendedor = new rsbuttongradiente.RSButtonGradiente();
        btnEliminarVendedor = new rsbuttongradiente.RSButtonGradiente();
        btnBuscarVendedor = new rsbuttongradiente.RSButtonGradiente();
        tableVendedor1 = new javax.swing.JScrollPane();
        tblVendedorInactivo = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        jLabel1.setText("Listado Vendedores");

        tableVendedor.setBackground(new java.awt.Color(255, 255, 255));
        tableVendedor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tableVendedor.setForeground(new java.awt.Color(255, 255, 255));

        tblVendedor.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tblVendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Vendedor", "Usuario", "Contraseña", "Cedula", "Nombres", "Apellidos", "Direccion", "Correo Eletronico", "Correo Recuperacion", "Celular", "Fecha Nacimiento", "Estado Civil", "Genero", "Sueldo", "Comiciones", "# Ventas"
            }
        ));
        tableVendedor.setViewportView(tblVendedor);

        txtBuscarVendedor.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        txtBuscarVendedor.setPlaceholder("ejm. 0106388747");

        btnAgregarVendedor.setText("Agregar");
        btnAgregarVendedor.setColorPrimario(new java.awt.Color(0, 204, 51));
        btnAgregarVendedor.setColorPrimarioHover(new java.awt.Color(0, 204, 51));
        btnAgregarVendedor.setColorSecundario(new java.awt.Color(153, 255, 153));
        btnAgregarVendedor.setColorSecundarioHover(new java.awt.Color(204, 255, 204));
        btnAgregarVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarVendedorMouseClicked(evt);
            }
        });
        btnAgregarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVendedorActionPerformed(evt);
            }
        });

        btnEliminarVendedor.setText("Eliminar");
        btnEliminarVendedor.setColorPrimario(new java.awt.Color(204, 0, 0));
        btnEliminarVendedor.setColorPrimarioHover(new java.awt.Color(255, 51, 51));
        btnEliminarVendedor.setColorSecundario(new java.awt.Color(255, 153, 153));
        btnEliminarVendedor.setColorSecundarioHover(new java.awt.Color(255, 204, 204));
        btnEliminarVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarVendedorMouseClicked(evt);
            }
        });
        btnEliminarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVendedorActionPerformed(evt);
            }
        });

        btnBuscarVendedor.setText("Buscar");
        btnBuscarVendedor.setColorPrimario(new java.awt.Color(0, 51, 153));
        btnBuscarVendedor.setColorPrimarioHover(new java.awt.Color(51, 0, 255));
        btnBuscarVendedor.setColorSecundario(new java.awt.Color(51, 153, 255));
        btnBuscarVendedor.setColorSecundarioHover(new java.awt.Color(153, 204, 255));
        btnBuscarVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarVendedorMouseClicked(evt);
            }
        });
        btnBuscarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVendedorActionPerformed(evt);
            }
        });

        tableVendedor1.setBackground(new java.awt.Color(255, 255, 255));
        tableVendedor1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tableVendedor1.setForeground(new java.awt.Color(255, 255, 255));

        tblVendedorInactivo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tblVendedorInactivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Vendedor", "Usuario", "Contraseña", "Cedula", "Nombres", "Apellidos", "Direccion", "Correo Eletronico", "Correo Recuperacion", "Celular", "Fecha Nacimiento", "Estado Civil", "Genero", "Sueldo", "Comiciones", "# Ventas"
            }
        ));
        tableVendedor1.setViewportView(tblVendedorInactivo);

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        jLabel2.setText("Listado Vendedores Inactivados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnBuscarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableVendedor1, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tableVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tableVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(tableVendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarVendedorMouseClicked
        CrudPanelVendedor agregarVehi = new CrudPanelVendedor();
        ShowpanelCruds(agregarVehi);
    }//GEN-LAST:event_btnAgregarVendedorMouseClicked

    private void btnEliminarVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarVendedorMouseClicked

    }//GEN-LAST:event_btnEliminarVendedorMouseClicked

    private void btnBuscarVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarVendedorMouseClicked
        // TODO add your handling code here:
        System.out.println("clickmet");
    }//GEN-LAST:event_btnBuscarVendedorMouseClicked

    private void btnAgregarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVendedorActionPerformed
        CrudPanelVendedor vendee = new CrudPanelVendedor();
        ShowpanelCruds(vendee);

    }//GEN-LAST:event_btnAgregarVendedorActionPerformed

    private void btnBuscarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVendedorActionPerformed

        if (!txtBuscarVendedor.getText().trim().isEmpty()) {

            String BuscarVendedor = txtBuscarVendedor.getText();
            CrudPanelVendedor2 mibuscarvendedor = new CrudPanelVendedor2(BuscarVendedor);
            ShowpanelCruds(mibuscarvendedor);

        } else {
            JOptionPane.showMessageDialog(this, "ingrese una cedula ");
        }
    }//GEN-LAST:event_btnBuscarVendedorActionPerformed

    private void btnEliminarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVendedorActionPerformed

        if (!txtBuscarVendedor.getText().trim().isEmpty()) {
            String eliminarVende = txtBuscarVendedor.getText();
            eliminarVendedor(eliminarVende);
            JOptionPane.showMessageDialog(this, "Vendedor Eliminado");
            mostrarDatosActivos();
            mostrarDatosInactivos();

        } else {
            JOptionPane.showMessageDialog(this, "Vendedor no encontrado ");
        }
    }//GEN-LAST:event_btnEliminarVendedorActionPerformed

    private void ShowpanelCruds(JPanel p) {
        p.setSize(870, 630);
        p.setLocation(0, 0);
        VistaMenu.PanelPrincipal.removeAll();
        VistaMenu.PanelPrincipal.add(p, BorderLayout.CENTER);
        VistaMenu.PanelPrincipal.revalidate();
        VistaMenu.PanelPrincipal.repaint();
    }

    private void mostrarDatosInactivos() {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        tblVendedorInactivo.setEnabled(true);

        Query query = BaseBD.query();
        query.constrain(Vendedor.class);
        query.descend("estado").constrain(INACTIVO);

        ObjectSet<Vendedor> resultado = query.execute();

        String matriz[][] = new String[resultado.size()][17];
        int i = 0;
        for (Vendedor vende : resultado) {

            matriz[i][0] = String.valueOf(vende.getiD_Vendedor());
            matriz[i][1] = vende.getNombreUsuario();
            matriz[i][2] = vende.getPassword();
            matriz[i][3] = vende.getCedula();
            matriz[i][4] = vende.getNombres();
            matriz[i][5] = vende.getApellidos();
            matriz[i][6] = vende.getDireccion();
            matriz[i][7] = vende.getCorreo();
            matriz[i][8] = vende.getCorreoRecuperacion();
            matriz[i][9] = vende.getCelular();
            matriz[i][10] = vende.getFechaNacimiento();
            matriz[i][11] = vende.getEstadoCivil();
            matriz[i][12] = vende.getGenero();
            matriz[i][13] = String.valueOf(vende.getSueldoBase_Vendedor());
            matriz[i][14] = String.valueOf(vende.getComiciones_Vendedor());
            matriz[i][15] = String.valueOf(vende.getNumeroVentas_Vendedor());
            matriz[i][16] = String.valueOf(vende.getEstado());
            i++;
        }
        
        //datos configurados
        tblVendedorInactivo.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"ID Vendedor", "Usuario", "Contraseña", "Cedula", "Nombres", "Apellidos", "Direccion", "Correo Electronico", "Correo recuperacion", "Celular", "Fecha Nacimiento",
                    "Estado Civil", "Genero", "Sueldo", "Comiciones", "Numero de Ventas", "Estado"}));
        tblVendedorInactivo.setEnabled(false);
        BaseBD.close();
    }

    private void mostrarDatosActivos() {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        tblVendedor.setEnabled(true);

        Query query = BaseBD.query();
        query.constrain(Vendedor.class);
        query.descend("estado").constrain(ACTIVO);

        ObjectSet<Vendedor> resultado = query.execute();

        String matriz[][] = new String[resultado.size()][17];
        int i = 0;
        for (Vendedor vende : resultado) {

            matriz[i][0] = String.valueOf(vende.getiD_Vendedor());
            matriz[i][1] = vende.getNombreUsuario();
            matriz[i][2] = vende.getPassword();
            matriz[i][3] = vende.getCedula();
            matriz[i][4] = vende.getNombres();
            matriz[i][5] = vende.getApellidos();
            matriz[i][6] = vende.getDireccion();
            matriz[i][7] = vende.getCorreo();
            matriz[i][8] = vende.getCorreoRecuperacion();
            matriz[i][9] = vende.getCelular();
            matriz[i][10] = vende.getFechaNacimiento();
            matriz[i][11] = vende.getEstadoCivil();
            matriz[i][12] = vende.getGenero();
            matriz[i][13] = String.valueOf(vende.getSueldoBase_Vendedor());
            matriz[i][14] = String.valueOf(vende.getComiciones_Vendedor());
            matriz[i][15] = String.valueOf(vende.getNumeroVentas_Vendedor());
            matriz[i][16] = String.valueOf(vende.getEstado());
            i++;
        }

        tblVendedor.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"ID Vendedor", "Usuario", "Contraseña", "Cedula", "Nombres", "Apellidos", "Direccion", "Correo Electronico", "Correo recuperacion", "Celular", "Fecha Nacimiento",
                    "Estado Civil", "Genero", "Sueldo", "Comiciones", "Numero de Ventas", "Estado"}));
        tblVendedor.setEnabled(false);
        BaseBD.close();
    }

    public void eliminarVendedor(String cedula) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        ObjectSet<Vendedor> result = BaseBD.queryByExample(new Vendedor(0.0, 0.0, 0, null, cedula, null,
                null, null, null, null, null, null, null, null,
                null, null)); // Crear objeto para consultar

        if (result.hasNext()) {
            Vendedor VendedorAEliminar = result.next();

            // Preguntar al usuario si está seguro de eliminar
            int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este Vehiculo?",
                    "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                VendedorAEliminar.desactivarVendedor();
                BaseBD.store(VendedorAEliminar);
                System.out.println("Vendedor eliminado correctamente.");
            } else {
                System.out.println("Cancelado por el usuario.");
            }
        } else {
            System.out.println("No se encontró Vendedor");
        }

        BaseBD.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttongradiente.RSButtonGradiente btnAgregarVendedor;
    private rsbuttongradiente.RSButtonGradiente btnBuscarVendedor;
    private rsbuttongradiente.RSButtonGradiente btnEliminarVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane tableVendedor;
    private javax.swing.JScrollPane tableVendedor1;
    private javax.swing.JTable tblVendedor;
    private javax.swing.JTable tblVendedorInactivo;
    private rojeru_san.RSMTextFull txtBuscarVendedor;
    // End of variables declaration//GEN-END:variables
}
