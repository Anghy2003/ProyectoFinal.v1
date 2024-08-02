package Vista.Tables;

import Conexion.Conexion_db;
import Conexion.ImageRenderer;
import static Models.Mecanico.Estado.ACTIVO;
import Models.Mecanico;
import static Models.Mecanico.Estado.INACTIVO;
import Vista.Cruds.CRUDS1.CrudPanelMecanico;
import Vista.Cruds.CRUDS1.CrudPanelMecanico2;
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

public class TablaMecanicos extends javax.swing.JPanel {

    public TablaMecanicos() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMecanicoInactivo = new javax.swing.JTable();
        txtBuscar = new rojeru_san.RSMTextFull();
        btnAgregar = new rsbuttongradiente.RSButtonGradiente();
        btnEditar = new rsbuttongradiente.RSButtonGradiente();
        btnEliminar = new rsbuttongradiente.RSButtonGradiente();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMecanico = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        jLabel1.setText("Listado Mecánicos Inactivados");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tblMecanicoInactivo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tblMecanicoInactivo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblMecanicoInactivo);

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

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        jLabel3.setText("Listado Mecánicos");

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        tblMecanico.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tblMecanico.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblMecanico);

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel4.setText("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(18, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked

    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        // TODO add your handling code here:
        System.out.println("clickmet");
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        CrudPanelMecanico agregarVehi = new CrudPanelMecanico();
        ShowpanelCruds(agregarVehi);
    }//GEN-LAST:event_btnAgregarActionPerformed

        public final int VerificarMecanico(String cedula) {
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Query meca = BaseBD.query();
        meca.constrain(Mecanico.class);
        meca.descend("cedula").constrain(cedula);
        ObjectSet<Mecanico> resultado = meca.execute();

        int coincidencias = resultado.size();

        BaseBD.close();
        return coincidencias;
    }
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         if (!txtBuscar.getText().trim().isEmpty()) {
            String BuscarMeca = txtBuscar.getText().trim();

            // Llamar al método VerificarMecanico y obtener el número de coincidencias
            int coincidencias = VerificarMecanico(BuscarMeca);

            // Verificar si se encontraron coincidencias
            if (coincidencias > 0) {
                // Crear una instancia del panel con los datos del mecanico
                CrudPanelMecanico2 mibuscarmeca = new CrudPanelMecanico2(BuscarMeca);
                ShowpanelCruds(mibuscarmeca);
            } else {
                // Mostrar mensaje si no se encontraron mecanico
                JOptionPane.showMessageDialog(this, "Mecanico no encontrado.");
            }
        } else {
            // Mostrar mensaje si el campo de búsqueda está vacío
            JOptionPane.showMessageDialog(this, "Ingrese una cédula.");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         if (!txtBuscar.getText().trim().isEmpty()) {
            String eliminarMeca = txtBuscar.getText();
            eliminarMecanico(eliminarMeca);
            JOptionPane.showMessageDialog(this, "Mecanico Eliminado");
            mostrarDatosActivos();
            mostrarDatosInactivos();

        } else {
            JOptionPane.showMessageDialog(this, "Mecanico no encontrado ");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

     
    private void mostrarDatosInactivos() {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        tblMecanicoInactivo.setEnabled(true);

        Query query = BaseBD.query();
        query.constrain(Mecanico.class);
        query.descend("estado").constrain(INACTIVO);

        ObjectSet<Mecanico> resultado = query.execute();

        Object matriz[][] = new Object[resultado.size()][18];
        int i = 0;
        for (Mecanico meca : resultado) {

            matriz[i][0] = String.valueOf(meca.getiD_Mecanico());
            matriz[i][1] = meca.getNombreUsuario();
            matriz[i][2] = meca.getPassword();
            matriz[i][3] = meca.getCedula();
            matriz[i][4] = meca.getNombres();
            matriz[i][5] = meca.getApellidos();
            matriz[i][6] = meca.getDireccion();
            matriz[i][7] = meca.getCorreo();
            matriz[i][8] = meca.getCorreoRecuperacion();
            matriz[i][9] = meca.getCelular();
            matriz[i][10] = meca.getFechaNacimiento();
            matriz[i][11] = meca.getEstadoCivil();
            matriz[i][12] = meca.getGenero();
            matriz[i][13] = meca.getTitulo();
            matriz[i][14] = String.valueOf(meca.getSueldo()); 
            matriz[i][15] = meca.getCiudad();

            byte[] imagen = meca.getImagenMeca();
            if (imagen != null) {
                ImageIcon icono = new ImageIcon(new ImageIcon(imagen).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
                matriz[i][16] = new JLabel(icono);
            } else {
                matriz[i][16] = new JLabel("No image");
            }

            
            matriz[i][17] = String.valueOf(meca.getEstado());
            i++;
        }
        
        //datos configurados
        tblMecanicoInactivo.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"ID Mecanico", "Usuario", "Contraseña", "Cedula", "Nombres", "Apellidos", "Direccion", "Correo Electronico", "Correo recuperacion", "Celular", "Fecha Nacimiento",
                    "Estado Civil", "Genero","Titulo","Sueldo", "Ciudad" , "Foto","Estado"}));
         tblMecanicoInactivo.getColumnModel().getColumn(16).setCellRenderer(new ImageRenderer());
        tblMecanicoInactivo.setRowHeight(100);
        tblMecanicoInactivo.setEnabled(false);
        BaseBD.close();
    }

    private void mostrarDatosActivos() {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        tblMecanico.setEnabled(true);

        Query query = BaseBD.query();
        query.constrain(Mecanico.class);
        query.descend("estado").constrain(ACTIVO);

        ObjectSet<Mecanico> resultado = query.execute();

        Object matriz[][] = new Object[resultado.size()][18];
        int i = 0;
        for (Mecanico meca : resultado) {

            matriz[i][0] = String.valueOf(meca.getiD_Mecanico());
            matriz[i][1] = meca.getNombreUsuario();
            matriz[i][2] = meca.getPassword();
            matriz[i][3] = meca.getCedula();
            matriz[i][4] = meca.getNombres();
            matriz[i][5] = meca.getApellidos();
            matriz[i][6] = meca.getDireccion();
            matriz[i][7] = meca.getCorreo();
            matriz[i][8] = meca.getCorreoRecuperacion();
            matriz[i][9] = meca.getCelular();
            matriz[i][10] = meca.getFechaNacimiento();
            matriz[i][11] = meca.getEstadoCivil();
            matriz[i][12] = meca.getGenero();
            matriz[i][13] = meca.getTitulo();
            matriz[i][14] = String.valueOf(meca.getSueldo()); 
            matriz[i][15] = meca.getCiudad();

            byte[] imagen = meca.getImagenMeca();
            if (imagen != null) {
                ImageIcon icono = new ImageIcon(new ImageIcon(imagen).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
                matriz[i][16] = new JLabel(icono);
            } else {
                matriz[i][16] = new JLabel("No image");
            }

            
            matriz[i][17] = String.valueOf(meca.getEstado());
            i++;
        }
        
        //datos configurados
        tblMecanico.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"ID Mecanico", "Usuario", "Contraseña", "Cedula", "Nombres", "Apellidos", "Direccion", "Correo Electronico", "Correo recuperacion", "Celular", "Fecha Nacimiento",
                    "Estado Civil", "Genero","Titulo","Sueldo", "Ciudad" , "Foto","Estado"}));
         tblMecanico.getColumnModel().getColumn(16).setCellRenderer(new ImageRenderer());
        tblMecanico.setRowHeight(100);
        tblMecanico.setEnabled(false);
        BaseBD.close();
    }

    public void eliminarMecanico(String cedula) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        ObjectSet<Mecanico> result = BaseBD.queryByExample(new Mecanico(null,0.0,null,null,null,cedula, null, null, null, null,
                null,  null, null, null, null, null, null)); // Crear objeto para consultar

        if (result.hasNext()) {
            Mecanico MecanicoAEliminar = result.next();

            // Preguntar al usuario si está seguro de eliminar
            int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este Vehiculo?",
                    "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                MecanicoAEliminar.desactivarMecanico();
                BaseBD.store(MecanicoAEliminar);
                System.out.println("Vendedor eliminado correctamente.");
            } else {
                System.out.println("Cancelado por el usuario.");
            }
        } else {
            System.out.println("No se encontró Vendedor");
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
    private rsbuttongradiente.RSButtonGradiente btnEditar;
    private rsbuttongradiente.RSButtonGradiente btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMecanico;
    private javax.swing.JTable tblMecanicoInactivo;
    private rojeru_san.RSMTextFull txtBuscar;
    // End of variables declaration//GEN-END:variables
}
