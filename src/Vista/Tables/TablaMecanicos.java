package Vista.Tables;

import Conexion.Conexion_db;
import Models.Mecanico;
import static Models.Vendedor.Estado.ACTIVO;
import static Models.Vendedor.Estado.INACTIVO;
import Vista.Cruds.CRUDS1.CrudPanelMecanico;
import Vista.Cruds.CRUDS1.CrudPanelMecanico2;
import Vista.Menu.VistaMenu;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TablaMecanicos extends javax.swing.JPanel {

    /**
     * Creates new form TablaMecanicos
     */
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
        btnBuscar = new rsbuttongradiente.RSButtonGradiente();
        btnEliminar = new rsbuttongradiente.RSButtonGradiente();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMecanico = new javax.swing.JTable();

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
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
        CrudPanelMecanico agregarVehi = new CrudPanelMecanico();
        ShowpanelCruds(agregarVehi);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (!txtBuscar.getText().trim().isEmpty()) {

            String Buscarmeca = txtBuscar.getText();
            CrudPanelMecanico2 mibuscarmeca = new CrudPanelMecanico2(Buscarmeca);
            ShowpanelCruds(mibuscarmeca);

        } else {
            JOptionPane.showMessageDialog(this, "ingrese una cedula ");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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

        String matriz[][] = new String[resultado.size()][16];
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
            matriz[i][15] = String.valueOf(meca.getEstado());
            i++;
        }
        
        //datos configurados
        tblMecanicoInactivo.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"ID Mecanico", "Usuario", "Contraseña", "Cedula", "Nombres", "Apellidos", "Direccion", "Correo Electronico", "Correo recuperacion", "Celular", "Fecha Nacimiento",
                    "Estado Civil", "Genero","Titulo","Sueldo",  "Estado"}));
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

        String matriz[][] = new String[resultado.size()][17];
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
            matriz[i][15] = String.valueOf(meca.getEstado());
            i++;
        }

        tblMecanico.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"ID Mecanico", "Usuario", "Contraseña", "Cedula", "Nombres", "Apellidos", "Direccion", "Correo Electronico", "Correo recuperacion", "Celular", "Fecha Nacimiento",
                    "Estado Civil", "Genero"," Titulo", "Sueldo", "Estado"}));
        tblMecanico.setEnabled(false);
        BaseBD.close();
    }

    public void eliminarMecanico(String cedula) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        ObjectSet<Mecanico> result = BaseBD.queryByExample(new Mecanico(null,0.0,null,cedula, null, null, null, null,
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
    private rsbuttongradiente.RSButtonGradiente btnBuscar;
    private rsbuttongradiente.RSButtonGradiente btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMecanico;
    private javax.swing.JTable tblMecanicoInactivo;
    private rojeru_san.RSMTextFull txtBuscar;
    // End of variables declaration//GEN-END:variables
}
