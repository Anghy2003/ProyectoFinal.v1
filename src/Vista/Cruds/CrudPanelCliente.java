/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Cruds;

import Conexion.Conexion_db;
import Models.Cliente;
import Models.IdManager;
import Vista.Menu.VistaMenu;
import Vista.Tables.TablaClientes;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.BorderLayout;
import java.awt.Panel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import rojeru_san.RSMTextFull;

/**
 *
 * @author luisd
 */
public class CrudPanelCliente extends javax.swing.JPanel {

    private String cedula;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String correo;
    private String celular;
    private String genero;
    private String fechaNacimiento;
    private String estadoCivil;
    //usuario
    private String iD_Usuario;
    private String nombreUsuario;
    private String password;
    private String correoRecuperacion;
    //cliente
    private String iD_Cliente;

    /**
     * Creates new form CrudPanelCliente
     */
    public CrudPanelCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDatosUsu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtContraUsu = new app.bolivia.swing.JCTextField();
        txtNomUsu = new app.bolivia.swing.JCTextField();
        btnGuardarCli = new rojeru_san.complementos.ButtonHover();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblCedula_Cli = new javax.swing.JLabel();
        lblNombres_Cli = new javax.swing.JLabel();
        lblApellidos_Cli = new javax.swing.JLabel();
        lblDireccion_Cli = new javax.swing.JLabel();
        lblCorreoElectronico_Cli = new javax.swing.JLabel();
        lblCelular_Cli = new javax.swing.JLabel();
        lblFechaNacimiento_Cli = new javax.swing.JLabel();
        lblGenero_Cli = new javax.swing.JLabel();
        lblEstadoCivil_Cli = new javax.swing.JLabel();
        txtCedula_Cli = new rojeru_san.RSMTextFull();
        txtNombres_Cli = new rojeru_san.RSMTextFull();
        txtApellidos_Cli = new rojeru_san.RSMTextFull();
        txtDireccion_Cli = new rojeru_san.RSMTextFull();
        txtCorreoElectronico_Cli = new rojeru_san.RSMTextFull();
        txtCelular_Cli = new rojeru_san.RSMTextFull();
        btnCancelar = new rojeru_san.RSButtonRiple();
        jDateFechaNac = new com.toedter.calendar.JDateChooser();
        cbxGenero = new javax.swing.JComboBox<>();
        cbxEstadoC = new javax.swing.JComboBox<>();
        btnSiguiente = new rojeru_san.RSButtonRiple();
        jLabel12 = new javax.swing.JLabel();

        PanelDatosUsu.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Datos de Usuario");

        jLabel13.setText("Nombre de Usuario:");

        jLabel14.setText("Contraseña");

        btnGuardarCli.setText("Guardar");
        btnGuardarCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarCliMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel11))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContraUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuardarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel11)
                .addGap(73, 73, 73)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNomUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtContraUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(btnGuardarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );

        PanelDatosUsu.add(jPanel4, java.awt.BorderLayout.CENTER);

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Registro Clientes");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 240, 40));

        lblCedula_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCedula_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblCedula_Cli.setText("Cédula:");
        jPanel1.add(lblCedula_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 100, 40));

        lblNombres_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblNombres_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblNombres_Cli.setText("Nombres:");
        jPanel1.add(lblNombres_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, 40));

        lblApellidos_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblApellidos_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblApellidos_Cli.setText("Apellidos:");
        jPanel1.add(lblApellidos_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 100, 40));

        lblDireccion_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblDireccion_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblDireccion_Cli.setText("Dirección");
        jPanel1.add(lblDireccion_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 90, 40));

        lblCorreoElectronico_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCorreoElectronico_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblCorreoElectronico_Cli.setText("Correo Electrónico:");
        jPanel1.add(lblCorreoElectronico_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 190, 40));

        lblCelular_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCelular_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblCelular_Cli.setText("Celular:");
        jPanel1.add(lblCelular_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 80, 40));

        lblFechaNacimiento_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblFechaNacimiento_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblFechaNacimiento_Cli.setText("Fecha Nacimiento:");
        jPanel1.add(lblFechaNacimiento_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 180, 40));

        lblGenero_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblGenero_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblGenero_Cli.setText("Género:");
        jPanel1.add(lblGenero_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 80, 40));

        lblEstadoCivil_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblEstadoCivil_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblEstadoCivil_Cli.setText("Estado Civil:");
        jPanel1.add(lblEstadoCivil_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 120, 40));

        txtCedula_Cli.setForeground(new java.awt.Color(0, 53, 79));
        txtCedula_Cli.setColorTransparente(true);
        txtCedula_Cli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCedula_Cli.setPlaceholder("Escriba la cédula");
        jPanel1.add(txtCedula_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 200, 40));

        txtNombres_Cli.setForeground(new java.awt.Color(0, 53, 79));
        txtNombres_Cli.setColorTransparente(true);
        txtNombres_Cli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombres_Cli.setPlaceholder("Escriba los nombres");
        jPanel1.add(txtNombres_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 200, 40));

        txtApellidos_Cli.setForeground(new java.awt.Color(0, 53, 79));
        txtApellidos_Cli.setColorTransparente(true);
        txtApellidos_Cli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtApellidos_Cli.setPlaceholder("Escriba los apellidos");
        jPanel1.add(txtApellidos_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, 40));

        txtDireccion_Cli.setForeground(new java.awt.Color(0, 53, 79));
        txtDireccion_Cli.setColorTransparente(true);
        txtDireccion_Cli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDireccion_Cli.setPlaceholder("Escriba la dirección");
        jPanel1.add(txtDireccion_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 200, 40));

        txtCorreoElectronico_Cli.setForeground(new java.awt.Color(0, 53, 79));
        txtCorreoElectronico_Cli.setColorTransparente(true);
        txtCorreoElectronico_Cli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCorreoElectronico_Cli.setPlaceholder("Escriba el email");
        jPanel1.add(txtCorreoElectronico_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 200, 40));

        txtCelular_Cli.setForeground(new java.awt.Color(0, 53, 79));
        txtCelular_Cli.setColorTransparente(true);
        txtCelular_Cli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCelular_Cli.setPlaceholder("Escriba su número celular");
        jPanel1.add(txtCelular_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 200, 40));

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, -1, -1));
        jPanel1.add(jDateFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 140, 30));

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));
        jPanel1.add(cbxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 150, 30));

        cbxEstadoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Divorciado", "viudo" }));
        jPanel1.add(cbxEstadoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 150, 30));

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondomecanicatamano.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 650));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        System.out.println("salir");
        TablaClientes tblCli = new TablaClientes();
        ShowpanelCruds(tblCli);
    }//GEN-LAST:event_btnCancelarMouseClicked


    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked

        ShowpanelCruds(PanelDatosUsu);


    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void btnGuardarCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCliMouseClicked
        // OBTENER TODOS LOS VALORES DE LA INTERFAZ
        cedula = txtCedula_Cli.getText();
        nombres = txtNombres_Cli.getText();
        fechaNacimiento = jDateFechaNac.getDateFormatString();
        apellidos = txtApellidos_Cli.getText();
        direccion = txtDireccion_Cli.getText();
        correo = txtCorreoElectronico_Cli.getText();
        celular = txtCelular_Cli.getText();
        genero = cbxGenero.getSelectedItem().toString();
        estadoCivil = cbxEstadoC.getSelectedItem().toString();
        nombreUsuario = txtNomUsu.getText();
        password = txtContraUsu.getText();

        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        // OBTENER EL GESTOR DE ID
        ObjectSet<IdManager> result = BaseBD.query(IdManager.class);
        IdManager idManager;
        if (result.isEmpty()) {
            idManager = new IdManager();
        } else {
            idManager = result.get(0);
        }

        // GENERAR NUEVOS ID
        int newClienteId = idManager.getLastClienteId() + 1;
        int newUsuarioId = idManager.getLastUsuarioId() + 1;

        // CREAR OBJETO DE CLIENTE
        Cliente nuevoCli = new Cliente(String.valueOf(newClienteId), String.valueOf(newUsuarioId), nombreUsuario, password, correoRecuperacion, cedula, nombres,
                apellidos, direccion, correo, celular, genero, fechaNacimiento, estadoCivil);

        // ACTUALIZAR EL GESTOR DE ID
        idManager.setLastClienteId(newClienteId);
        idManager.setLastUsuarioId(newUsuarioId);

        // GUARDAR EL CLIENTE Y EL GESTOR DE ID EN LA BASE DE DATOS
        BaseBD.set(nuevoCli);
        BaseBD.set(idManager);

        JOptionPane.showMessageDialog(null, "Registro exitoso");
        BaseBD.close();
        TablaClientes tblCli = new TablaClientes();
        ShowpanelCruds(tblCli);
    }//GEN-LAST:event_btnGuardarCliMouseClicked
    private void ShowpanelCruds(JPanel p) {
        p.setSize(870, 630);
        p.setLocation(0, 0);
        VistaMenu.PanelPrincipal.removeAll();
        VistaMenu.PanelPrincipal.add(p, BorderLayout.CENTER);
        VistaMenu.PanelPrincipal.revalidate();
        VistaMenu.PanelPrincipal.repaint();
    }

    public RSMTextFull getTxtCedula_Cli() {
        return txtCedula_Cli;
    }

    public void setTxtCedula_Cli(RSMTextFull txtCedula_Cli) {
        this.txtCedula_Cli = txtCedula_Cli;
    }

    public RSMTextFull getTxtApellidos_Cli() {
        return txtApellidos_Cli;
    }

    public void setTxtApellidos_Cli(RSMTextFull txtApellidos_Cli) {
        this.txtApellidos_Cli = txtApellidos_Cli;
    }

    public RSMTextFull getTxtNombres_Cli() {
        return txtNombres_Cli;
    }

    public void setTxtNombres_Cli(RSMTextFull txtNombres_Cli) {
        this.txtNombres_Cli = txtNombres_Cli;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDatosUsu;
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.complementos.ButtonHover btnGuardarCli;
    private rojeru_san.RSButtonRiple btnSiguiente;
    private rojeru_san.complementos.ButtonHover btn_guardarUsu;
    private rojeru_san.complementos.ButtonHover btn_guardarUsu1;
    private javax.swing.JComboBox<String> cbxEstadoC;
    private javax.swing.JComboBox<String> cbxGenero;
    private com.toedter.calendar.JDateChooser jDateFechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblApellidos_Cli;
    private javax.swing.JLabel lblCedula_Cli;
    private javax.swing.JLabel lblCelular_Cli;
    private javax.swing.JLabel lblCorreoElectronico_Cli;
    private javax.swing.JLabel lblDireccion_Cli;
    private javax.swing.JLabel lblEstadoCivil_Cli;
    private javax.swing.JLabel lblFechaNacimiento_Cli;
    private javax.swing.JLabel lblGenero_Cli;
    private javax.swing.JLabel lblNombres_Cli;
    private rojeru_san.RSMTextFull txtApellidos_Cli;
    private rojeru_san.RSMTextFull txtCedula_Cli;
    private rojeru_san.RSMTextFull txtCelular_Cli;
    private app.bolivia.swing.JCTextField txtContra;
    private app.bolivia.swing.JCTextField txtContra1;
    private app.bolivia.swing.JCTextField txtContraUsu;
    private rojeru_san.RSMTextFull txtCorreoElectronico_Cli;
    private rojeru_san.RSMTextFull txtDireccion_Cli;
    private app.bolivia.swing.JCTextField txtNomUsu;
    private app.bolivia.swing.JCTextField txtNombreUsu;
    private app.bolivia.swing.JCTextField txtNombreUsu1;
    private rojeru_san.RSMTextFull txtNombres_Cli;
    private app.bolivia.swing.JCTextField txtUsu1;
    private app.bolivia.swing.JCTextField txtUsuContra;
    // End of variables declaration//GEN-END:variables
}
