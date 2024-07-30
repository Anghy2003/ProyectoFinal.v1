
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
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;



public class CrudPanelCliente extends javax.swing.JPanel {
    
    
    private byte [] imagenCli;

     public void GuardarCliente( Cliente.Estado estado, String ciudad, byte[] imagenCli, String cedula, String nombres, String apellidos, String direccion, String correo, String celular,
            String genero, String fechaNacimiento, String estadoCivil, String nombreUsuario, String password, String correoRecuperacion) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        
        int siguienteID = obtenerProximoIDCliente(BaseBD);
        
        Cliente cliente1 = new Cliente(estado,  ciudad,  imagenCli,  cedula,  nombres,  apellidos,  direccion,  correo,  celular,
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
        cliente.descend("cedula").constrain(txtCedulaCli.getText());
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
        btnCancelar = new rojeru_san.RSButtonRiple();
        btnGuardar = new rojeru_san.RSButtonRiple();
        Cedula_Cli = new javax.swing.JLabel();
        txtCedulaCli = new rojeru_san.RSMTextFull();
        txtPasswordCli = new rojeru_san.RSMPassView();
        lblPassword_Cli = new javax.swing.JLabel();
        lblNombres_Cli = new javax.swing.JLabel();
        txtNombresCli = new rojeru_san.RSMTextFull();
        lblApellidos_Cli = new javax.swing.JLabel();
        txtApellidosCli = new rojeru_san.RSMTextFull();
        lblDireccion_Cli = new javax.swing.JLabel();
        txtDireccionCli = new rojeru_san.RSMTextFull();
        lblCorreo_Cli = new javax.swing.JLabel();
        txtCorreoCli = new rojeru_san.RSMTextFull();
        btnSeleccionarImgen1 = new rojeru_san.RSButtonRiple();
        lblImagenCli = new javax.swing.JLabel();
        lblCelularCli = new javax.swing.JLabel();
        txtCelularCli = new rojeru_san.RSMTextFull();
        lblCiudad_Cli = new javax.swing.JLabel();
        cbxCiudadCli = new javax.swing.JComboBox<>();
        lblFEchaNac_Cli = new javax.swing.JLabel();
        jDateFechaNacCli = new com.toedter.calendar.JDateChooser();
        lblEstadoCivil_Cli = new javax.swing.JLabel();
        cbxGeneroCli = new javax.swing.JComboBox<>();
        lblGenero_Cli = new javax.swing.JLabel();
        cbxEstadoCivilCli = new javax.swing.JComboBox<>();

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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 240, 40));

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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, -1, -1));

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
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, -1, -1));

        Cedula_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        Cedula_Cli.setForeground(new java.awt.Color(0, 53, 79));
        Cedula_Cli.setText("Usuario/Cédula:");
        jPanel1.add(Cedula_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 150, 40));

        txtCedulaCli.setForeground(new java.awt.Color(0, 53, 79));
        txtCedulaCli.setColorTransparente(true);
        txtCedulaCli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCedulaCli.setPlaceholder("0123456789");
        jPanel1.add(txtCedulaCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 220, 40));

        txtPasswordCli.setForeground(new java.awt.Color(0, 53, 79));
        txtPasswordCli.setOpaque(false);
        txtPasswordCli.setPlaceholder("Digite su Contraseña");
        txtPasswordCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordCliActionPerformed(evt);
            }
        });
        jPanel1.add(txtPasswordCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 220, 40));

        lblPassword_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblPassword_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblPassword_Cli.setText("Contraseña:");
        jPanel1.add(lblPassword_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, 40));

        lblNombres_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblNombres_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblNombres_Cli.setText("Nombres:");
        jPanel1.add(lblNombres_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 90, 40));

        txtNombresCli.setForeground(new java.awt.Color(0, 53, 79));
        txtNombresCli.setColorTransparente(true);
        txtNombresCli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombresCli.setPlaceholder("Yins Yan");
        jPanel1.add(txtNombresCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 220, 40));

        lblApellidos_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblApellidos_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblApellidos_Cli.setText("Apellidos:");
        jPanel1.add(lblApellidos_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 90, 40));

        txtApellidosCli.setForeground(new java.awt.Color(0, 53, 79));
        txtApellidosCli.setColorTransparente(true);
        txtApellidosCli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtApellidosCli.setPlaceholder("Yins Yan");
        jPanel1.add(txtApellidosCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 220, 40));

        lblDireccion_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblDireccion_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblDireccion_Cli.setText("Dirección:");
        jPanel1.add(lblDireccion_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, 40));

        txtDireccionCli.setForeground(new java.awt.Color(0, 53, 79));
        txtDireccionCli.setColorTransparente(true);
        txtDireccionCli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDireccionCli.setPlaceholder("Octavio Chacon");
        jPanel1.add(txtDireccionCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 220, 40));

        lblCorreo_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCorreo_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblCorreo_Cli.setText("Correo Electrónico:");
        jPanel1.add(lblCorreo_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 190, 40));

        txtCorreoCli.setForeground(new java.awt.Color(0, 53, 79));
        txtCorreoCli.setColorTransparente(true);
        txtCorreoCli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCorreoCli.setPlaceholder("Yins_Yan@tecazuay.com");
        jPanel1.add(txtCorreoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 220, 40));

        btnSeleccionarImgen1.setText("Selecionar Imagen");
        btnSeleccionarImgen1.setToolTipText("SOLO JPG");
        btnSeleccionarImgen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarImgen1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionarImgen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 180, 40));

        lblImagenCli.setToolTipText("SOLO JPG");
        lblImagenCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(lblImagenCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 180, 140));

        lblCelularCli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCelularCli.setForeground(new java.awt.Color(0, 53, 79));
        lblCelularCli.setText("Celular:");
        jPanel1.add(lblCelularCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, 40));

        txtCelularCli.setForeground(new java.awt.Color(0, 53, 79));
        txtCelularCli.setColorTransparente(true);
        txtCelularCli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCelularCli.setPlaceholder("0960188019");
        jPanel1.add(txtCelularCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 190, 40));

        lblCiudad_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCiudad_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblCiudad_Cli.setText("Ciudad:");
        jPanel1.add(lblCiudad_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 80, 30));

        cbxCiudadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCiudadCliActionPerformed(evt);
            }
        });
        jPanel1.add(cbxCiudadCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 190, 30));

        lblFEchaNac_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblFEchaNac_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblFEchaNac_Cli.setText("Fecha Nacimiento:");
        jPanel1.add(lblFEchaNac_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 180, 40));
        jPanel1.add(jDateFechaNacCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 190, 30));

        lblEstadoCivil_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblEstadoCivil_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblEstadoCivil_Cli.setText("Estado Civil:");
        jPanel1.add(lblEstadoCivil_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 120, 40));

        cbxGeneroCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero/a", "Casado/a", "Divorciado/a", "Viudo/a", "Union Libre" }));
        jPanel1.add(cbxGeneroCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 190, 30));

        lblGenero_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblGenero_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblGenero_Cli.setText("Género:");
        jPanel1.add(lblGenero_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 80, 40));

        cbxEstadoCivilCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel1.add(cbxEstadoCivilCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 190, 30));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


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

            Date fechaNacimientoDate = jDateFechaNacCli.getDate(); // Obtener la fecha de nacimiento del JDateChooser

            // Formatear la fecha como String en el formato deseado (por ejemplo, "dd/MM/yyyy")
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimiento = sdf.format(fechaNacimientoDate);

            if (valido = txtCedulaCli.getText().matches("\\d{10}")) {
                if (valido = txtNombresCli.getText().toUpperCase().matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)?$")) {
                    if (valido = txtApellidosCli.getText().toUpperCase().matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)?$")) {
                        if (valido = txtCorreoCli.getText().matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
                            if (valido = txtCelularCli.getText().matches("^09\\d{8}$")) {

                                GuardarCliente(Estado.ACTIVO,(String)cbxCiudadCli.getSelectedItem(),imagenCli,txtCedulaCli.getText(), txtNombresCli.getText().toUpperCase().toUpperCase(), txtApellidosCli.getText().toUpperCase(),
                                    txtDireccionCli.getText().toUpperCase(), txtCorreoCli.getText(),txtCelularCli.getText(), (String) cbxGeneroCli.getSelectedItem(), fechaNacimiento, (String) cbxEstadoCivilCli.getSelectedItem(),
                                    txtCedulaCli.getText(), txtPasswordCli.getText(), fechaNacimiento);

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

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked

    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.out.println("salir");
        TablaClientes tblCli = new TablaClientes();
        ShowpanelCruds(tblCli);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

    }//GEN-LAST:event_btnCancelarMouseClicked

    private void txtPasswordCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordCliActionPerformed

    private void btnSeleccionarImgen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarImgen1ActionPerformed
        
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        jFileChooser.setFileFilter(filtrado);
        
        int respuesta = jFileChooser.showOpenDialog(this);
        
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            File archivoImagen = jFileChooser.getSelectedFile();
            String Ruta = archivoImagen.getPath();
            
            try {
                // Leer la imagen y convertirla a un array de bytes
                imagenCli = leerImagen(archivoImagen);

                // Mostrar la imagen en el label
                Image mImagen = new ImageIcon(Ruta).getImage();
                ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lblImagenCli.getWidth(), lblImagenCli.getHeight(), Image.SCALE_SMOOTH));
                lblImagenCli.setIcon(mIcono);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al leer la imagen: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnSeleccionarImgen1ActionPerformed

    private void cbxCiudadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCiudadCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCiudadCliActionPerformed
   
    //transforma la imagen en bytes
    private byte[] leerImagen(File archivoImagen) throws IOException {
        try ( ByteArrayOutputStream baos = new ByteArrayOutputStream();  FileInputStream fis = new FileInputStream(archivoImagen)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
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
    private javax.swing.JLabel Cedula_Cli;
    private javax.swing.JPanel PanelDatosUsu;
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private rojeru_san.RSButtonRiple btnSeleccionarImgen1;
    private javax.swing.JComboBox<String> cbxCiudadCli;
    private javax.swing.JComboBox<String> cbxEstadoCivilCli;
    private javax.swing.JComboBox<String> cbxGeneroCli;
    private com.toedter.calendar.JDateChooser jDateFechaNacCli;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblApellidos_Cli;
    private javax.swing.JLabel lblCelularCli;
    private javax.swing.JLabel lblCiudad_Cli;
    private javax.swing.JLabel lblCorreo_Cli;
    private javax.swing.JLabel lblDireccion_Cli;
    private javax.swing.JLabel lblEstadoCivil_Cli;
    private javax.swing.JLabel lblFEchaNac_Cli;
    private javax.swing.JLabel lblGenero_Cli;
    private javax.swing.JLabel lblImagenCli;
    private javax.swing.JLabel lblNombres_Cli;
    private javax.swing.JLabel lblPassword_Cli;
    private rojeru_san.RSMTextFull txtApellidosCli;
    private rojeru_san.RSMTextFull txtCedulaCli;
    private rojeru_san.RSMTextFull txtCelularCli;
    private rojeru_san.RSMTextFull txtCorreoCli;
    private rojeru_san.RSMTextFull txtDireccionCli;
    private rojeru_san.RSMTextFull txtNombresCli;
    private rojeru_san.RSMPassView txtPasswordCli;
    // End of variables declaration//GEN-END:variables
}
