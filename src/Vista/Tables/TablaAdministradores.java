package Vista.Tables;

import Conexion.Conexion_db;
import Models.Administrador;
import static Models.Administrador.Estado.ACTIVO;
import static Models.Administrador.Estado.INACTIVO;
import Vista.Cruds.CRUDS1.CrudPanelAdministrador;
import Vista.Cruds.CRUDS1.CrudPanelAdministrador2;
import Vista.Menu.VistaMenu;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TablaAdministradores extends javax.swing.JPanel {

    /**
     * Creates new form TablaAdministradores
     */
    public TablaAdministradores() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdmiInactivos = new javax.swing.JTable();
        txtBuscar = new rojeru_san.RSMTextFull();
        btnAgregar = new rsbuttongradiente.RSButtonGradiente();
        btnBuscar = new rsbuttongradiente.RSButtonGradiente();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAdmi = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new rsbuttongradiente.RSButtonGradiente();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        jLabel1.setText("Listado Administradores");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tblAdmiInactivos.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tblAdmiInactivos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblAdmiInactivos);

        txtBuscar.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        txtBuscar.setPlaceholder("ejm. 0106388747");

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

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        tblAdmi.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tblAdmi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblAdmi);

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        jLabel2.setText("Listado Administradores Inactivos");

        btnEliminar.setText("Eliminar");
        btnEliminar.setColorPrimario(new java.awt.Color(204, 0, 0));
        btnEliminar.setColorPrimarioHover(new java.awt.Color(255, 51, 51));
        btnEliminar.setColorSecundario(new java.awt.Color(255, 153, 153));
        btnEliminar.setColorSecundarioHover(new java.awt.Color(255, 204, 204));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(177, 177, 177)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(319, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked

    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:
        System.out.println("clickmet");
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        CrudPanelAdministrador agregaradmi3 = new CrudPanelAdministrador();
        ShowpanelCruds(agregaradmi3);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (!txtBuscar.getText().trim().isEmpty()) {

            String BuscarAdministrador = txtBuscar.getText();
            CrudPanelAdministrador2 mibuscarvendedor = new CrudPanelAdministrador2(BuscarAdministrador);
            ShowpanelCruds(mibuscarvendedor);

        } else {
            JOptionPane.showMessageDialog(this, "ingrese una cedula ");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (!txtBuscar.getText().trim().isEmpty()) {

            String eliminarVende = txtBuscar.getText();
            eliminarVendedor(eliminarVende);
            JOptionPane.showMessageDialog(this, "Administrador Eliminado");
            mostrarDatosActivos();
            mostrarDatosInactivos();

        } else {
            JOptionPane.showMessageDialog(this, "Administrador no encontrado ");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

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
        tblAdmiInactivos.setEnabled(true);

        Query query = BaseBD.query();
        query.constrain(Administrador.class);
        query.descend("estado").constrain(INACTIVO);

        ObjectSet<Administrador> resultado = query.execute();

        String matriz[][] = new String[resultado.size()][15];
        int i = 0;
        for (Administrador admin3 : resultado) {

            matriz[i][0] = String.valueOf(admin3.getiD_Administrador());
            matriz[i][1] = admin3.getNombreUsuario();
            matriz[i][2] = admin3.getPassword();
            matriz[i][3] = admin3.getCedula();
            matriz[i][4] = admin3.getNombres();
            matriz[i][5] = admin3.getApellidos();
            matriz[i][6] = admin3.getDireccion();
            matriz[i][7] = admin3.getCorreo();
            matriz[i][8] = admin3.getCorreoRecuperacion();
            matriz[i][9] = admin3.getCelular();
            matriz[i][10] = admin3.getFechaNacimiento();
            matriz[i][11] = admin3.getEstadoCivil();
            matriz[i][12] = admin3.getGenero();
            matriz[i][13] = admin3.getTitulo_Administrador();
            matriz[i][14] = String.valueOf(admin3.getEstado());
            i++;
        }

        //datos configurados
        tblAdmiInactivos.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"ID Vendedor", "Usuario", "Contraseña", "Cedula", "Nombres", "Apellidos", "Direccion", "Correo Electronico", "Correo recuperacion", "Celular", "Fecha Nacimiento",
            "Estado Civil", "Genero", "Titulo", "Estado"}));
        tblAdmiInactivos.setEnabled(false);
        BaseBD.close();
    }

    private void mostrarDatosActivos() {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        tblAdmi.setEnabled(true);

        Query query = BaseBD.query();
        query.constrain(Administrador.class);
        query.descend("estado").constrain(ACTIVO);

        ObjectSet<Administrador> resultado = query.execute();

        String matriz[][] = new String[resultado.size()][15];
        int i = 0;
        for (Administrador admin3 : resultado) {

            matriz[i][0] = String.valueOf(admin3.getiD_Administrador());
            matriz[i][1] = admin3.getNombreUsuario();
            matriz[i][2] = admin3.getPassword();
            matriz[i][3] = admin3.getCedula();
            matriz[i][4] = admin3.getNombres();
            matriz[i][5] = admin3.getApellidos();
            matriz[i][6] = admin3.getDireccion();
            matriz[i][7] = admin3.getCorreo();
            matriz[i][8] = admin3.getCorreoRecuperacion();
            matriz[i][9] = admin3.getCelular();
            matriz[i][10] = admin3.getFechaNacimiento();
            matriz[i][11] = admin3.getEstadoCivil();
            matriz[i][12] = admin3.getGenero();
            matriz[i][13] = admin3.getTitulo_Administrador();
            matriz[i][14] = String.valueOf(admin3.getEstado());
            i++;

        }

        tblAdmi.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"ID Vendedor", "Usuario", "Contraseña", "Cedula", "Nombres", "Apellidos", "Direccion", "Correo Electronico", "Correo recuperacion", "Celular", "Fecha Nacimiento",
            "Estado Civil", "Genero", "Titulo" ,"Estado"}));
        tblAdmi.setEnabled(false);
        BaseBD.close();
    }

    public void eliminarVendedor(String cedula) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        ObjectSet<Administrador> result = BaseBD.queryByExample(new Administrador(null, null, cedula, null,
                null, null, null, null, null, null, null, null,
                null, null)); // Crear objeto para consultar

        if (result.hasNext()) {
            Administrador VendedorAEliminar = result.next();

            // Preguntar al usuario si está seguro de eliminar
            int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este Administrador?",
                    "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                VendedorAEliminar.desactivarAdministrador();
                BaseBD.store(VendedorAEliminar);
                System.out.println("Administrador eliminado correctamente.");
            } else {
                System.out.println("Cancelado por el usuario.");
            }
        } else {
            System.out.println("No se encontró Administrador");
        }

        BaseBD.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttongradiente.RSButtonGradiente btnAgregar;
    private rsbuttongradiente.RSButtonGradiente btnBuscar;
    private rsbuttongradiente.RSButtonGradiente btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAdmi;
    private javax.swing.JTable tblAdmiInactivos;
    private rojeru_san.RSMTextFull txtBuscar;
    // End of variables declaration//GEN-END:variables
}
