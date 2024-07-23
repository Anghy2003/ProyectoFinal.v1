
package Vista.Cruds.CRUDS1;

import Conexion.Conexion_db;
import Models.Cliente;
import Models.Cliente.Estado;



import Vista.Menu.VistaMenu;
import Vista.Tables.TablaClientes;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.awt.BorderLayout;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class CrudPanelCliente extends javax.swing.JPanel {

     public void GuardarCliente( Cliente.Estado estado, String cedula, String nombres, String apellidos, String direccion, String correo, String celular,
            String genero, String fechaNacimiento, String estadoCivil, String nombreUsuario, String password, String correoRecuperacion ) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        
        int siguienteID = obtenerProximoIDCliente(BaseBD);
        
        Cliente cliente1 = new Cliente( estado,  cedula,  nombres,  apellidos,  direccion,  correo,  celular,
             genero,  fechaNacimiento,  estadoCivil,  nombreUsuario,  password,  correoRecuperacion );
      
        cliente1.setiD_Cliente(siguienteID);
        BaseBD.close();

        if (VerificarClienteRepetidos() == 0) {

            BaseBD = Conexion_db.ConectarBD();
            BaseBD.set(cliente1);
           BaseBD.close();

            JOptionPane.showMessageDialog(this, "Cliente Guardado");

        } else {

            JOptionPane.showMessageDialog(this, "Ya existe el Cliente ");
        }
    }

    public final int VerificarClienteRepetidos() {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();        
        Query cliente = BaseBD.query();
        cliente.constrain(Cliente.class);
        cliente.descend("cedula").constrain(txtCedula_Cli.getText());
        ObjectSet<Cliente> resultado = cliente.execute();
        
        int coincidencias = resultado.size();
        
        BaseBD.close();
        return coincidencias;
        
    }

    // Método para obtener el próximo ID_Vendedor disponible
    private int obtenerProximoIDCliente(ObjectContainer db) {
    // Consultar el máximo ID_Vendedor almacenado en la base de datos
    ObjectSet<Cliente> result = db.queryByExample(Cliente.class);
    int maxID = 0;
    while (result.hasNext()) {
        Cliente cliente = result.next();
        if (cliente.getiD_Cliente() > maxID) {
            maxID = cliente.getiD_Cliente();
        }
    }
    // El próximo ID es el máximo + 1
    return maxID + 1;
}
    
    
    
    public CrudPanelCliente() {
        initComponents();
    }

//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDatosUsu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblCedula_Cli = new javax.swing.JLabel();
        lblContraseña_Cli = new javax.swing.JLabel();
        lblApellidos_Cli = new javax.swing.JLabel();
        lblDireccion_Cli = new javax.swing.JLabel();
        lblCorreoElectronico_Cli = new javax.swing.JLabel();
        lblCelular_Cli = new javax.swing.JLabel();
        lblFechaNacimiento_Cli = new javax.swing.JLabel();
        lblGenero_Cli = new javax.swing.JLabel();
        lblEstadoCivil_Cli = new javax.swing.JLabel();
        txtCedula_Cli = new rojeru_san.RSMTextFull();
        txtApellidos_Cli = new rojeru_san.RSMTextFull();
        txtDireccion_Cli = new rojeru_san.RSMTextFull();
        txtCorreoElectronico_Cli = new rojeru_san.RSMTextFull();
        txtCelular_Cli = new rojeru_san.RSMTextFull();
        btnCancelar = new rojeru_san.RSButtonRiple();
        jDateFechaNac_Cli = new com.toedter.calendar.JDateChooser();
        cbxGenero = new javax.swing.JComboBox<>();
        cbxEstadoC = new javax.swing.JComboBox<>();
        btnGuardar = new rojeru_san.RSButtonRiple();
        lblNombres_Cli = new javax.swing.JLabel();
        txtNombres_Cli = new rojeru_san.RSMTextFull();
        txtPasswordCli = new rojeru_san.RSMPassView();

        PanelDatosUsu.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Datos de Usuario");

        jLabel13.setText("Nombre de Usuario:");

        jLabel14.setText("Contraseña");

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
                            .addComponent(jLabel14))))
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel11)
                .addGap(73, 73, 73)
                .addComponent(jLabel13)
                .addGap(25, 25, 25)
                .addComponent(jLabel14)
                .addContainerGap(167, Short.MAX_VALUE))
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
        jPanel1.add(lblCedula_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 100, 40));

        lblContraseña_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblContraseña_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblContraseña_Cli.setText("Contraseña:");
        jPanel1.add(lblContraseña_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 40));

        lblApellidos_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblApellidos_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblApellidos_Cli.setText("Apellidos:");
        jPanel1.add(lblApellidos_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 100, 40));

        lblDireccion_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblDireccion_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblDireccion_Cli.setText("Dirección:");
        jPanel1.add(lblDireccion_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 110, 40));

        lblCorreoElectronico_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCorreoElectronico_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblCorreoElectronico_Cli.setText("Correo Electrónico:");
        jPanel1.add(lblCorreoElectronico_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 190, 40));

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
        jPanel1.add(lblEstadoCivil_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 120, 40));

        txtCedula_Cli.setForeground(new java.awt.Color(0, 53, 79));
        txtCedula_Cli.setColorTransparente(true);
        txtCedula_Cli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCedula_Cli.setPlaceholder("Escriba la cédula");
        jPanel1.add(txtCedula_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 200, 40));

        txtApellidos_Cli.setForeground(new java.awt.Color(0, 53, 79));
        txtApellidos_Cli.setColorTransparente(true);
        txtApellidos_Cli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtApellidos_Cli.setPlaceholder("Escriba los apellidos");
        jPanel1.add(txtApellidos_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 200, 40));

        txtDireccion_Cli.setForeground(new java.awt.Color(0, 53, 79));
        txtDireccion_Cli.setColorTransparente(true);
        txtDireccion_Cli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDireccion_Cli.setPlaceholder("Escriba la dirección");
        jPanel1.add(txtDireccion_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 200, 40));

        txtCorreoElectronico_Cli.setForeground(new java.awt.Color(0, 53, 79));
        txtCorreoElectronico_Cli.setColorTransparente(true);
        txtCorreoElectronico_Cli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCorreoElectronico_Cli.setPlaceholder("Escriba el email");
        jPanel1.add(txtCorreoElectronico_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 200, 40));

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
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, -1, -1));
        jPanel1.add(jDateFechaNac_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 140, 30));

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));
        jPanel1.add(cbxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 150, 30));

        cbxEstadoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Divorciado", "viudo" }));
        jPanel1.add(cbxEstadoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 150, 30));

        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, -1, -1));

        lblNombres_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblNombres_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblNombres_Cli.setText("Nombres:");
        jPanel1.add(lblNombres_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, 40));

        txtNombres_Cli.setForeground(new java.awt.Color(0, 53, 79));
        txtNombres_Cli.setColorTransparente(true);
        txtNombres_Cli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombres_Cli.setPlaceholder("Escriba los nombres");
        jPanel1.add(txtNombres_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 200, 40));

        txtPasswordCli.setForeground(new java.awt.Color(0, 53, 79));
        txtPasswordCli.setOpaque(false);
        txtPasswordCli.setPlaceholder("Digite su Contraseña");
        txtPasswordCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordCliActionPerformed(evt);
            }
        });
        jPanel1.add(txtPasswordCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 210, 40));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
       
    }//GEN-LAST:event_btnCancelarMouseClicked


    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked

    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnGuardarCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCliMouseClicked
        
    }//GEN-LAST:event_btnGuardarCliMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean usuarioRepetido = false;
        
        if (VerificarClienteRepetidos() != 0) {
            JOptionPane.showMessageDialog(null, "Cliente ya registrado");
            usuarioRepetido = true;
        }

        if (!usuarioRepetido) {
            
            Boolean valido = false;
            
            Date fechaNacimientoDate = jDateFechaNac_Cli.getDate(); // Obtener la fecha de nacimiento del JDateChooser

            // Formatear la fecha como String en el formato deseado (por ejemplo, "dd/MM/yyyy")
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimiento = sdf.format(fechaNacimientoDate);

           
            if (valido = txtCedula_Cli.getText().matches("\\d{10}")) {
                if (valido = txtNombres_Cli.getText().toUpperCase().matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)?$")) {
                    if (valido = txtApellidos_Cli.getText().toUpperCase().matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)?$")) {                        
                            if (valido = txtCorreoElectronico_Cli.getText().matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
                                if (valido = txtCelular_Cli.getText().matches("^09\\d{8}$")) {

                                    
                                    GuardarCliente(Estado.ACTIVO,txtCedula_Cli.getText(), txtNombres_Cli.getText().toUpperCase().toUpperCase(), txtApellidos_Cli.getText().toUpperCase(),
                                            txtDireccion_Cli.getText().toUpperCase(), txtCorreoElectronico_Cli.getText(),
                                            txtCelular_Cli.getText(), (String) cbxGenero.getSelectedItem(), fechaNacimiento, (String) cbxEstadoC.getSelectedItem(),
                                            txtCedula_Cli.getText(), txtPasswordCli.getText(), fechaNacimiento);
                                    

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

    private void txtPasswordCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordCliActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         System.out.println("salir");
        TablaClientes tblCli = new TablaClientes();
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
    private javax.swing.JPanel PanelDatosUsu;
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private javax.swing.JComboBox<String> cbxEstadoC;
    private javax.swing.JComboBox<String> cbxGenero;
    private com.toedter.calendar.JDateChooser jDateFechaNac_Cli;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblApellidos_Cli;
    private javax.swing.JLabel lblCedula_Cli;
    private javax.swing.JLabel lblCelular_Cli;
    private javax.swing.JLabel lblContraseña_Cli;
    private javax.swing.JLabel lblCorreoElectronico_Cli;
    private javax.swing.JLabel lblDireccion_Cli;
    private javax.swing.JLabel lblEstadoCivil_Cli;
    private javax.swing.JLabel lblFechaNacimiento_Cli;
    private javax.swing.JLabel lblGenero_Cli;
    private javax.swing.JLabel lblNombres_Cli;
    private rojeru_san.RSMTextFull txtApellidos_Cli;
    private rojeru_san.RSMTextFull txtCedula_Cli;
    private rojeru_san.RSMTextFull txtCelular_Cli;
    private rojeru_san.RSMTextFull txtCorreoElectronico_Cli;
    private rojeru_san.RSMTextFull txtDireccion_Cli;
    private rojeru_san.RSMTextFull txtNombres_Cli;
    private rojeru_san.RSMPassView txtPasswordCli;
    // End of variables declaration//GEN-END:variables
}
