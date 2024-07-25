
package Vista.Cruds.CRUDS1;

import Conexion.Conexion_db;
import Models.Administrador;
import Vista.Menu.VistaMenu;
import Vista.Tables.TablaAdministradores;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CrudPanelAdministrador extends javax.swing.JPanel {

    public void GuardarMecanico(String titulo_Administrador, Administrador.Estado estado, String cedula, String nombres, String apellidos, String direccion, String correo, String celular, String genero,
            String fechaNacimiento, String estadoCivil, String nombreUsuario, String password, String correoRecuperacion) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        int siguienteID = obtenerProximoIDAdministrador(BaseBD);

        Administrador administrador1 = new Administrador( titulo_Administrador, estado,  cedula,  nombres,  apellidos,  direccion,  correo,  celular,  genero,
             fechaNacimiento,  estadoCivil,  nombreUsuario,  password,  correoRecuperacion);

        administrador1.setiD_Administrador(siguienteID);
        BaseBD.close();

        if (VerificarAdministradorRepetidos() == 0) {

            BaseBD = Conexion_db.ConectarBD();
            BaseBD.set(administrador1);
            BaseBD.close();

            JOptionPane.showMessageDialog(this, "Administrador Guardado");

        } else {

            JOptionPane.showMessageDialog(this, "Ya existe el Administrador ");
        }
    }

    
    public final int VerificarAdministradorRepetidos() {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Query admin = BaseBD.query();
        admin.constrain(Administrador.class);
        admin.descend("cedula").constrain(txtCedulaAdmi.getText());
        ObjectSet<Administrador> resultado = admin.execute();

        int coincidencias = resultado.size();

        BaseBD.close();
        return coincidencias;
    }

    // Método para obtener el próximo ID_Administrador disponible
    private int obtenerProximoIDAdministrador(ObjectContainer db) {
        // Consultar el máximo ID_Administrador almacenado en la base de datos
        ObjectSet<Administrador> result = db.queryByExample(Administrador.class);
        int maxID = 0;
        while (result.hasNext()) {
            Administrador administrador2 = result.next();
            if (administrador2.getiD_Administrador() > maxID) {
                maxID = administrador2.getiD_Administrador();
            }
        }
        // El próximo ID es el máximo + 1
        return maxID + 1;
    }

   
    public CrudPanelAdministrador() {
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

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Cedula_Admi = new javax.swing.JLabel();
        lblNombres_Admi = new javax.swing.JLabel();
        lblApellidos_Admi = new javax.swing.JLabel();
        lblDireccion_Admi = new javax.swing.JLabel();
        lblCorreo_Admi = new javax.swing.JLabel();
        lblComiciones_Ven = new javax.swing.JLabel();
        lblFEchaNac_Admi = new javax.swing.JLabel();
        lblGenero_Admi = new javax.swing.JLabel();
        lblEstadoCivil_Admi = new javax.swing.JLabel();
        txtCedulaAdmi = new rojeru_san.RSMTextFull();
        txtNombresAdmi = new rojeru_san.RSMTextFull();
        txtApellidosAdmi = new rojeru_san.RSMTextFull();
        txtDireccionAdmi = new rojeru_san.RSMTextFull();
        txtCorreoAdmi = new rojeru_san.RSMTextFull();
        txtTituloAdmi = new rojeru_san.RSMTextFull();
        btnCancelar = new rojeru_san.RSButtonRiple();
        jDateFechaNacAdmi = new com.toedter.calendar.JDateChooser();
        cbxGeneroAdmi = new javax.swing.JComboBox<>();
        cbxEstadoCivilAdmi = new javax.swing.JComboBox<>();
        btnGuardar = new rojeru_san.RSButtonRiple();
        lblPassword_Admi = new javax.swing.JLabel();
        txtPasswordAdmi = new rojeru_san.RSMTextFull();
        lblCelular_Admi = new javax.swing.JLabel();
        txtCelularAdmi = new rojeru_san.RSMTextFull();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Registro Administrador");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 330, 40));

        Cedula_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        Cedula_Admi.setForeground(new java.awt.Color(0, 53, 79));
        Cedula_Admi.setText("Cédula/Usuario:");
        jPanel2.add(Cedula_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 40));

        lblNombres_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblNombres_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblNombres_Admi.setText("Nombres:");
        jPanel2.add(lblNombres_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, 40));

        lblApellidos_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblApellidos_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblApellidos_Admi.setText("Apellidos:");
        jPanel2.add(lblApellidos_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, 40));

        lblDireccion_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblDireccion_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblDireccion_Admi.setText("Dirección");
        jPanel2.add(lblDireccion_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 90, 40));

        lblCorreo_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCorreo_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblCorreo_Admi.setText("Correo Electrónico:");
        jPanel2.add(lblCorreo_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 190, 40));

        lblComiciones_Ven.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblComiciones_Ven.setForeground(new java.awt.Color(0, 53, 79));
        lblComiciones_Ven.setText("Titulo");
        jPanel2.add(lblComiciones_Ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 120, 40));

        lblFEchaNac_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblFEchaNac_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblFEchaNac_Admi.setText("Fecha Nacimiento:");
        jPanel2.add(lblFEchaNac_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 180, 40));

        lblGenero_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblGenero_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblGenero_Admi.setText("Género:");
        jPanel2.add(lblGenero_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 80, 40));

        lblEstadoCivil_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblEstadoCivil_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblEstadoCivil_Admi.setText("Estado Civil:");
        jPanel2.add(lblEstadoCivil_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 120, 40));

        txtCedulaAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtCedulaAdmi.setColorTransparente(true);
        txtCedulaAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCedulaAdmi.setPlaceholder("0123456789");
        jPanel2.add(txtCedulaAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 200, 40));

        txtNombresAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtNombresAdmi.setColorTransparente(true);
        txtNombresAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombresAdmi.setPlaceholder("Escriba los nombres");
        jPanel2.add(txtNombresAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 200, 40));

        txtApellidosAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtApellidosAdmi.setColorTransparente(true);
        txtApellidosAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtApellidosAdmi.setPlaceholder("Escriba los apellidos");
        jPanel2.add(txtApellidosAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, 40));

        txtDireccionAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtDireccionAdmi.setColorTransparente(true);
        txtDireccionAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDireccionAdmi.setPlaceholder("Escriba la dirección");
        jPanel2.add(txtDireccionAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 200, 40));

        txtCorreoAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtCorreoAdmi.setColorTransparente(true);
        txtCorreoAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCorreoAdmi.setPlaceholder("Escriba su correo electronico");
        jPanel2.add(txtCorreoAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 250, 40));

        txtTituloAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtTituloAdmi.setColorTransparente(true);
        txtTituloAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtTituloAdmi.setPlaceholder("Escriba su número celular");
        jPanel2.add(txtTituloAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 230, 40));

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
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, -1, -1));
        jPanel2.add(jDateFechaNacAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 140, 30));

        cbxGeneroAdmi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cbxGeneroAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 150, 30));

        cbxEstadoCivilAdmi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cbxEstadoCivilAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 150, 30));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, -1, -1));

        lblPassword_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblPassword_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblPassword_Admi.setText("Contraseña:");
        jPanel2.add(lblPassword_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 40));

        txtPasswordAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtPasswordAdmi.setColorTransparente(true);
        txtPasswordAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtPasswordAdmi.setPlaceholder("123abc");
        jPanel2.add(txtPasswordAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 200, 40));

        lblCelular_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCelular_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblCelular_Admi.setText("Celular:");
        jPanel2.add(lblCelular_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 80, 40));

        txtCelularAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtCelularAdmi.setColorTransparente(true);
        txtCelularAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCelularAdmi.setPlaceholder("Escriba su número celular");
        jPanel2.add(txtCelularAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 230, 40));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 448, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 448, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 319, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 319, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

 boolean usuarioRepetido = false;

        if (VerificarAdministradorRepetidos() != 0) {
            JOptionPane.showMessageDialog(null, "Administrador ya registrado");
            usuarioRepetido = true;
        }

        if (!usuarioRepetido) {

            Boolean valido = false;

            Date fechaNacimientoDate = jDateFechaNacAdmi.getDate(); // Obtener la fecha de nacimiento del JDateChooser

            // Formatear la fecha como String en el formato deseado (por ejemplo, "dd/MM/yyyy")
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimiento = sdf.format(fechaNacimientoDate);

            if (valido = txtCedulaAdmi.getText().matches("\\d{10}")) {
                if (valido = txtNombresAdmi.getText().toUpperCase().matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)?$")) {
                    if (valido = txtApellidosAdmi.getText().toUpperCase().matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)?$")) {
                        if (valido = txtCorreoAdmi.getText().matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
                            if (valido = txtCelularAdmi.getText().matches("^09\\d{8}$")) {

                                GuardarMecanico(txtTituloAdmi.getText().toUpperCase(), Administrador.Estado.ACTIVO, txtCedulaAdmi.getText(), txtNombresAdmi.getText().toUpperCase(),
                                        txtApellidosAdmi.getText().toUpperCase(), txtDireccionAdmi.getText().toUpperCase(), txtCorreoAdmi.getText(), txtCelularAdmi.getText(),
                                        (String) cbxGeneroAdmi.getSelectedItem(), fechaNacimiento, (String) cbxEstadoCivilAdmi.getSelectedItem(), txtCedulaAdmi.getText(), txtPasswordAdmi.getText(),
                                        txtCorreoAdmi.getText());

                            } else {
                                JOptionPane.showMessageDialog(null, "Ingrese un celular valido");
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Ingrese un correo valida");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese un apellido valido");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un nombre valido");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una cedula valida");
            }

        }
        TablaAdministradores tblCli = new TablaAdministradores();
        ShowpanelCruds(tblCli);

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         System.out.println("salir");
        TablaAdministradores tblCli = new TablaAdministradores();
        ShowpanelCruds(tblCli);
    }//GEN-LAST:event_btnCancelarActionPerformed

private void ShowpanelCruds(JPanel p) {
        p.setSize(870, 630);
        p.setLocation(0, 0);
        VistaMenu.PanelPrincipal.removeAll();
        VistaMenu.PanelPrincipal.add(p, BorderLayout.CENTER);
        VistaMenu.PanelPrincipal.revalidate();
        VistaMenu.PanelPrincipal.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cedula_Admi;
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private javax.swing.JComboBox<String> cbxEstadoCivilAdmi;
    private javax.swing.JComboBox<String> cbxGeneroAdmi;
    private com.toedter.calendar.JDateChooser jDateFechaNacAdmi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblApellidos_Admi;
    private javax.swing.JLabel lblCelular_Admi;
    private javax.swing.JLabel lblComiciones_Ven;
    private javax.swing.JLabel lblCorreo_Admi;
    private javax.swing.JLabel lblDireccion_Admi;
    private javax.swing.JLabel lblEstadoCivil_Admi;
    private javax.swing.JLabel lblFEchaNac_Admi;
    private javax.swing.JLabel lblGenero_Admi;
    private javax.swing.JLabel lblNombres_Admi;
    private javax.swing.JLabel lblPassword_Admi;
    private rojeru_san.RSMTextFull txtApellidosAdmi;
    private rojeru_san.RSMTextFull txtCedulaAdmi;
    private rojeru_san.RSMTextFull txtCelularAdmi;
    private rojeru_san.RSMTextFull txtCorreoAdmi;
    private rojeru_san.RSMTextFull txtDireccionAdmi;
    private rojeru_san.RSMTextFull txtNombresAdmi;
    private rojeru_san.RSMTextFull txtPasswordAdmi;
    private rojeru_san.RSMTextFull txtTituloAdmi;
    // End of variables declaration//GEN-END:variables
}
