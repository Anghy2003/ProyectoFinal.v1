package Vista.Tables;

import Conexion.Conexion_db;
import Conexion.ImageRenderer;
import Models.Administrador;
import static Models.Administrador.Estado.ACTIVO;
import static Models.Administrador.Estado.INACTIVO;
import Vista.Cruds.CRUDS1.CrudCiudad;
import Vista.Cruds.CRUDS1.CrudPanelAdministrador;
import Vista.Cruds.CRUDS1.CrudPanelAdministrador2;
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

        btnAgregar1 = new rsbuttongradiente.RSButtonGradiente();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdmiInactivos = new javax.swing.JTable();
        txtBuscar = new rojeru_san.RSMTextFull();
        btnAgregar = new rsbuttongradiente.RSButtonGradiente();
        btnEditar = new rsbuttongradiente.RSButtonGradiente();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAdmi = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new rsbuttongradiente.RSButtonGradiente();
        jLabel3 = new javax.swing.JLabel();

        btnAgregar1.setText("Agregar");
        btnAgregar1.setColorPrimario(new java.awt.Color(0, 204, 51));
        btnAgregar1.setColorPrimarioHover(new java.awt.Color(0, 204, 51));
        btnAgregar1.setColorSecundario(new java.awt.Color(153, 255, 153));
        btnAgregar1.setColorSecundarioHover(new java.awt.Color(204, 255, 204));
        btnAgregar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregar1MouseClicked(evt);
            }
        });
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

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

        btnEditar.setText("Editar");
        btnEditar.setColorPrimario(new java.awt.Color(0, 51, 153));
        btnEditar.setColorPrimarioHover(new java.awt.Color(51, 0, 255));
        btnEditar.setColorSecundario(new java.awt.Color(51, 153, 255));
        btnEditar.setColorSecundarioHover(new java.awt.Color(153, 204, 255));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
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

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel3.setText("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(43, 43, 43)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked

    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        // TODO add your handling code here:        
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        CrudPanelAdministrador agregaradmi3 = new CrudPanelAdministrador();
        ShowpanelCruds(agregaradmi3);
    }//GEN-LAST:event_btnAgregarActionPerformed

    public final int VerificarAdministrador(String cedula) {
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Query admin = BaseBD.query();
        admin.constrain(Administrador.class);
        admin.descend("cedula").constrain(cedula);
        ObjectSet<Administrador> resultado = admin.execute();

        int coincidencias = resultado.size();

        BaseBD.close();
        return coincidencias;
    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if (!txtBuscar.getText().trim().isEmpty()) {
            String BuscarAdministrador = txtBuscar.getText().trim();

            // Llamar al método VerificarAdministrador y obtener el número de coincidencias
            int coincidencias = VerificarAdministrador(BuscarAdministrador);

            // Verificar si se encontraron coincidencias
            if (coincidencias > 0) {
                // Crear una instancia del panel con los datos del administrador
                CrudPanelAdministrador2 mibuscaradmin = new CrudPanelAdministrador2(BuscarAdministrador);
                ShowpanelCruds(mibuscaradmin);
            } else {
                // Mostrar mensaje si no se encontraron administradores
                JOptionPane.showMessageDialog(this, "Administrador no encontrado.");
            }
        } else {
            // Mostrar mensaje si el campo de búsqueda está vacío
            JOptionPane.showMessageDialog(this, "Ingrese una cédula.");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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

    private void btnAgregar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar1MouseClicked

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void mostrarDatosInactivos() {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        tblAdmiInactivos.setEnabled(true);

        Query query = BaseBD.query();
        query.constrain(Administrador.class);
        query.descend("estado").constrain(INACTIVO);

        ObjectSet<Administrador> resultado = query.execute();

        Object matriz[][] = new Object[resultado.size()][17];

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
            matriz[i][14] = admin3.getCiudad();

            byte[] imagen = admin3.getImagenAdmi();
            if (imagen != null) {
                ImageIcon icono = new ImageIcon(new ImageIcon(imagen).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
                matriz[i][15] = new JLabel(icono);
            } else {
                matriz[i][15] = new JLabel("No image");
            }

            matriz[i][16] = String.valueOf(admin3.getEstado());
            i++;
        }
        //datos configurados
        tblAdmiInactivos.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"ID Vendedor", "Usuario", "Contraseña", "Cedula", "Nombres", "Apellidos", "Direccion", "Correo Electronico", "Correo recuperacion", "Celular", "Fecha Nacimiento",
            "Estado Civil", "Genero", "Titulo", "Ciudad", "Foto", "Estado"}));
        tblAdmiInactivos.getColumnModel().getColumn(15).setCellRenderer(new ImageRenderer());
        tblAdmiInactivos.setRowHeight(100);
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

        Object matriz[][] = new Object[resultado.size()][17];
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
            matriz[i][14] = admin3.getCiudad();

            byte[] imagen = admin3.getImagenAdmi();
            if (imagen != null) {
                ImageIcon icono = new ImageIcon(new ImageIcon(imagen).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
                matriz[i][15] = new JLabel(icono);
            } else {
                matriz[i][15] = new JLabel("No image");
            }

            matriz[i][16] = String.valueOf(admin3.getEstado());
            i++;
        }
        //datos configurados
        tblAdmi.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"ID Vendedor", "Usuario", "Contraseña", "Cedula", "Nombres", "Apellidos", "Direccion", "Correo Electronico", "Correo recuperacion", "Celular", "Fecha Nacimiento",
            "Estado Civil", "Genero", "Titulo", "Ciudad", "Foto", "Estado"}));

        // Usar el ImageRenderer para la columna de imágenes
        tblAdmi.getColumnModel().getColumn(15).setCellRenderer(new ImageRenderer());
        tblAdmi.setRowHeight(100);
        tblAdmi.setEnabled(false);
        BaseBD.close();
    }

    public void eliminarVendedor(String cedula) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        ObjectSet<Administrador> result = BaseBD.queryByExample(new Administrador(null, null, null, null, cedula, null,
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
    private rsbuttongradiente.RSButtonGradiente btnAgregar1;
    private rsbuttongradiente.RSButtonGradiente btnEditar;
    private rsbuttongradiente.RSButtonGradiente btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAdmi;
    private javax.swing.JTable tblAdmiInactivos;
    private rojeru_san.RSMTextFull txtBuscar;
    // End of variables declaration//GEN-END:variables
}
