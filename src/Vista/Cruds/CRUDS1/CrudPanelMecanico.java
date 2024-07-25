package Vista.Cruds.CRUDS1;

import Conexion.Conexion_db;
import Models.Mecanico;
import Vista.Menu.VistaMenu;
import Vista.Tables.TablaMecanicos;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CrudPanelMecanico extends javax.swing.JPanel {

    public void GuardarMecanico(String titulo, double Sueldo, Mecanico.Estado estado, String cedula, String nombres, String apellidos,
            String direccion, String correo, String celular, String genero, String fechaNacimiento, String estadoCivil,
            String nombreUsuario, String password, String correoRecuperacion) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        int siguienteID = obtenerProximoIDMecanico(BaseBD);

        Mecanico mecanico1 = new Mecanico(titulo, Sueldo, estado, cedula, nombres, apellidos,
                direccion, correo, celular, genero, fechaNacimiento, estadoCivil,
                nombreUsuario, password, correoRecuperacion);

        mecanico1.setiD_Mecanico(siguienteID);
        BaseBD.close();

        if (VerificarMecanicoRepetidos() == 0) {

            BaseBD = Conexion_db.ConectarBD();
            BaseBD.set(mecanico1);
            BaseBD.close();

            JOptionPane.showMessageDialog(this, "Mecanico Guardado");

        } else {

            JOptionPane.showMessageDialog(this, "Ya existe el Mecanico ");
        }
    }

    public final int VerificarMecanicoRepetidos() {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Query vendedor = BaseBD.query();
        vendedor.constrain(Mecanico.class);
        vendedor.descend("cedula").constrain(txtCedulaMeca.getText());
        ObjectSet<Mecanico> resultado = vendedor.execute();

        int coincidencias = resultado.size();

        BaseBD.close();
        return coincidencias;
    }

    // Método para obtener el próximo ID_Vendedor disponible
    private int obtenerProximoIDMecanico(ObjectContainer db) {
        // Consultar el máximo ID_Vendedor almacenado en la base de datos
        ObjectSet<Mecanico> result = db.queryByExample(Mecanico.class);
        int maxID = 0;
        while (result.hasNext()) {
            Mecanico mecanico = result.next();
            if (mecanico.getiD_Mecanico() > maxID) {
                maxID = mecanico.getiD_Mecanico();
            }
        }
        // El próximo ID es el máximo + 1
        return maxID + 1;
    }

    public CrudPanelMecanico() {
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

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Cedula_Meca = new javax.swing.JLabel();
        lblNombres_Meca = new javax.swing.JLabel();
        lblApellidos_Meca = new javax.swing.JLabel();
        lblDireccion_Meca = new javax.swing.JLabel();
        lblCorreo_Meca = new javax.swing.JLabel();
        lblTituloMec = new javax.swing.JLabel();
        lblFEchaNac_Meca = new javax.swing.JLabel();
        lblGenero_Meca = new javax.swing.JLabel();
        lblEstadoCivil_Meca = new javax.swing.JLabel();
        txtCedulaMeca = new rojeru_san.RSMTextFull();
        txtNombresMeca = new rojeru_san.RSMTextFull();
        txtApellidosMeca = new rojeru_san.RSMTextFull();
        txtDireccionMeca = new rojeru_san.RSMTextFull();
        txtCorreoMeca = new rojeru_san.RSMTextFull();
        txtTituloMeca = new rojeru_san.RSMTextFull();
        btnCancelar = new rojeru_san.RSButtonRiple();
        jDateFechaNacMeca = new com.toedter.calendar.JDateChooser();
        cbxGeneroMeca = new javax.swing.JComboBox<>();
        cbxEstadoCivilMeca = new javax.swing.JComboBox<>();
        btnGuardar = new rojeru_san.RSButtonRiple();
        lblPassword_Meca = new javax.swing.JLabel();
        lblSueldoMec = new javax.swing.JLabel();
        lblCelular_Meca = new javax.swing.JLabel();
        txtSueldoMeca = new rojeru_san.RSMTextFull();
        txtCelularMeca = new rojeru_san.RSMTextFull();
        txtPasswordMeca = new rojeru_san.RSMPassView();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Registro Mecanico");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 260, 40));

        Cedula_Meca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        Cedula_Meca.setForeground(new java.awt.Color(0, 53, 79));
        Cedula_Meca.setText("Cédula/Usuario:");
        jPanel2.add(Cedula_Meca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 40));

        lblNombres_Meca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblNombres_Meca.setForeground(new java.awt.Color(0, 53, 79));
        lblNombres_Meca.setText("Nombres:");
        jPanel2.add(lblNombres_Meca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, 40));

        lblApellidos_Meca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblApellidos_Meca.setForeground(new java.awt.Color(0, 53, 79));
        lblApellidos_Meca.setText("Apellidos:");
        jPanel2.add(lblApellidos_Meca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, 40));

        lblDireccion_Meca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblDireccion_Meca.setForeground(new java.awt.Color(0, 53, 79));
        lblDireccion_Meca.setText("Dirección");
        jPanel2.add(lblDireccion_Meca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 90, 40));

        lblCorreo_Meca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCorreo_Meca.setForeground(new java.awt.Color(0, 53, 79));
        lblCorreo_Meca.setText("Correo Electrónico:");
        jPanel2.add(lblCorreo_Meca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 190, 40));

        lblTituloMec.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblTituloMec.setForeground(new java.awt.Color(0, 53, 79));
        lblTituloMec.setText("Titulo:");
        jPanel2.add(lblTituloMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 60, 40));

        lblFEchaNac_Meca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblFEchaNac_Meca.setForeground(new java.awt.Color(0, 53, 79));
        lblFEchaNac_Meca.setText("Fecha Nacimiento:");
        jPanel2.add(lblFEchaNac_Meca, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 180, 40));

        lblGenero_Meca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblGenero_Meca.setForeground(new java.awt.Color(0, 53, 79));
        lblGenero_Meca.setText("Género:");
        jPanel2.add(lblGenero_Meca, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 80, 40));

        lblEstadoCivil_Meca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblEstadoCivil_Meca.setForeground(new java.awt.Color(0, 53, 79));
        lblEstadoCivil_Meca.setText("Estado Civil:");
        jPanel2.add(lblEstadoCivil_Meca, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 120, 40));

        txtCedulaMeca.setForeground(new java.awt.Color(0, 53, 79));
        txtCedulaMeca.setColorTransparente(true);
        txtCedulaMeca.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCedulaMeca.setPlaceholder("0123456789");
        jPanel2.add(txtCedulaMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 200, 40));

        txtNombresMeca.setForeground(new java.awt.Color(0, 53, 79));
        txtNombresMeca.setColorTransparente(true);
        txtNombresMeca.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombresMeca.setPlaceholder("Escriba los nombres");
        jPanel2.add(txtNombresMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 200, 40));

        txtApellidosMeca.setForeground(new java.awt.Color(0, 53, 79));
        txtApellidosMeca.setColorTransparente(true);
        txtApellidosMeca.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtApellidosMeca.setPlaceholder("Escriba los apellidos");
        jPanel2.add(txtApellidosMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, 40));

        txtDireccionMeca.setForeground(new java.awt.Color(0, 53, 79));
        txtDireccionMeca.setColorTransparente(true);
        txtDireccionMeca.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDireccionMeca.setPlaceholder("Escriba la dirección");
        jPanel2.add(txtDireccionMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 200, 40));

        txtCorreoMeca.setForeground(new java.awt.Color(0, 53, 79));
        txtCorreoMeca.setColorTransparente(true);
        txtCorreoMeca.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCorreoMeca.setPlaceholder("Escriba su correo electronico");
        jPanel2.add(txtCorreoMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 250, 40));

        txtTituloMeca.setForeground(new java.awt.Color(0, 53, 79));
        txtTituloMeca.setColorTransparente(true);
        txtTituloMeca.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtTituloMeca.setPlaceholder("Escriba su titulo");
        jPanel2.add(txtTituloMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 230, 40));

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
        jPanel2.add(jDateFechaNacMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 140, 30));

        cbxGeneroMeca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino\t\t", "Femenino" }));
        jPanel2.add(cbxGeneroMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 150, 30));

        cbxEstadoCivilMeca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Viudo", "Union Libre" }));
        jPanel2.add(cbxEstadoCivilMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 150, 30));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, -1, -1));

        lblPassword_Meca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblPassword_Meca.setForeground(new java.awt.Color(0, 53, 79));
        lblPassword_Meca.setText("Contraseña:");
        jPanel2.add(lblPassword_Meca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 40));

        lblSueldoMec.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblSueldoMec.setForeground(new java.awt.Color(0, 53, 79));
        lblSueldoMec.setText("Sueldo:");
        jPanel2.add(lblSueldoMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 80, 40));

        lblCelular_Meca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCelular_Meca.setForeground(new java.awt.Color(0, 53, 79));
        lblCelular_Meca.setText("Celular:");
        jPanel2.add(lblCelular_Meca, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 80, 40));

        txtSueldoMeca.setForeground(new java.awt.Color(0, 53, 79));
        txtSueldoMeca.setColorTransparente(true);
        txtSueldoMeca.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtSueldoMeca.setPlaceholder("Escriba el sueldo");
        jPanel2.add(txtSueldoMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 230, 40));

        txtCelularMeca.setForeground(new java.awt.Color(0, 53, 79));
        txtCelularMeca.setColorTransparente(true);
        txtCelularMeca.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCelularMeca.setPlaceholder("Escriba su número celular");
        jPanel2.add(txtCelularMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 230, 40));

        txtPasswordMeca.setForeground(new java.awt.Color(0, 53, 79));
        txtPasswordMeca.setOpaque(false);
        txtPasswordMeca.setPlaceholder("Digite su Contraseña");
        txtPasswordMeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordMecaActionPerformed(evt);
            }
        });
        jPanel2.add(txtPasswordMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 210, 40));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 448, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 448, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
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
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean usuarioRepetido = false;

        if (VerificarMecanicoRepetidos() != 0) {
            JOptionPane.showMessageDialog(null, "Mecanico ya registrado");
            usuarioRepetido = true;
        }

        if (!usuarioRepetido) {

            Boolean valido = false;

            Date fechaNacimientoDate = jDateFechaNacMeca.getDate(); // Obtener la fecha de nacimiento del JDateChooser

            // Formatear la fecha como String en el formato deseado (por ejemplo, "dd/MM/yyyy")
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimiento = sdf.format(fechaNacimientoDate);

            if (valido = txtCedulaMeca.getText().matches("\\d{10}")) {
                if (valido = txtNombresMeca.getText().toUpperCase().matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)?$")) {
                    if (valido = txtApellidosMeca.getText().toUpperCase().matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)?$")) {
                        if (valido = txtCorreoMeca.getText().matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
                            if (valido = txtCelularMeca.getText().matches("^09\\d{8}$")) {

                                GuardarMecanico(txtTituloMeca.getText().toUpperCase(), Double.parseDouble(txtSueldoMeca.getText()), Mecanico.Estado.ACTIVO, txtCedulaMeca.getText(), txtNombresMeca.getText().toUpperCase(),
                                        txtApellidosMeca.getText().toUpperCase(), txtDireccionMeca.getText().toUpperCase(), txtCorreoMeca.getText(), txtCelularMeca.getText(),
                                        (String) cbxGeneroMeca.getSelectedItem(), fechaNacimiento, (String) cbxEstadoCivilMeca.getSelectedItem(), txtCedulaMeca.getText(), txtPasswordMeca.getText(),
                                        txtCorreoMeca.getText());

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

       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtPasswordMecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordMecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordMecaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.out.println("salir");
        TablaMecanicos tblCli = new TablaMecanicos();
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
    private javax.swing.JLabel Cedula_Meca;
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private javax.swing.JComboBox<String> cbxEstadoCivilMeca;
    private javax.swing.JComboBox<String> cbxGeneroMeca;
    private com.toedter.calendar.JDateChooser jDateFechaNacMeca;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblApellidos_Meca;
    private javax.swing.JLabel lblCelular_Meca;
    private javax.swing.JLabel lblCorreo_Meca;
    private javax.swing.JLabel lblDireccion_Meca;
    private javax.swing.JLabel lblEstadoCivil_Meca;
    private javax.swing.JLabel lblFEchaNac_Meca;
    private javax.swing.JLabel lblGenero_Meca;
    private javax.swing.JLabel lblNombres_Meca;
    private javax.swing.JLabel lblPassword_Meca;
    private javax.swing.JLabel lblSueldoMec;
    private javax.swing.JLabel lblTituloMec;
    private rojeru_san.RSMTextFull txtApellidosMeca;
    private rojeru_san.RSMTextFull txtCedulaMeca;
    private rojeru_san.RSMTextFull txtCelularMeca;
    private rojeru_san.RSMTextFull txtCorreoMeca;
    private rojeru_san.RSMTextFull txtDireccionMeca;
    private rojeru_san.RSMTextFull txtNombresMeca;
    private rojeru_san.RSMPassView txtPasswordMeca;
    private rojeru_san.RSMTextFull txtSueldoMeca;
    private rojeru_san.RSMTextFull txtTituloMeca;
    // End of variables declaration//GEN-END:variables
}
