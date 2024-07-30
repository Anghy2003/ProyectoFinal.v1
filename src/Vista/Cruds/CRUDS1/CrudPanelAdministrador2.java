package Vista.Cruds.CRUDS1;

import Conexion.Conexion_db;
import Models.Administrador;
import Vista.Menu.VistaMenu;
import Vista.Tables.TablaAdministradores;
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

public class CrudPanelAdministrador2 extends javax.swing.JPanel {

    private byte[] imagenAdmi;
    private String BuscarAdministrador;

    public CrudPanelAdministrador2(String receivedString) {
        this.BuscarAdministrador = receivedString;
        initComponents();
        Administradorbuscar();
    }

    //tranforma la imagen a bytes
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnModificar = new rojeru_san.RSButtonRiple();
        Cedula_Admi = new javax.swing.JLabel();
        txtCedulaAdmi = new rojeru_san.RSMTextFull();
        lblPassword_Admi = new javax.swing.JLabel();
        txtPasswordAdmi = new rojeru_san.RSMPassView();
        lblNombres_Admi = new javax.swing.JLabel();
        txtNombresAdmi = new rojeru_san.RSMTextFull();
        lblApellidos_Admi = new javax.swing.JLabel();
        txtApellidosAdmi = new rojeru_san.RSMTextFull();
        lblDireccion_Admi = new javax.swing.JLabel();
        txtDireccionAdmi = new rojeru_san.RSMTextFull();
        lblCorreo_Admi = new javax.swing.JLabel();
        txtCorreoAdmi = new rojeru_san.RSMTextFull();
        lblImagenAdmi = new javax.swing.JLabel();
        btnSeleccionarImgen = new rojeru_san.RSButtonRiple();
        jLabel2 = new javax.swing.JLabel();
        lblCelularAdmi = new javax.swing.JLabel();
        txtCelularAdmi = new rojeru_san.RSMTextFull();
        lblTituloAdmi = new javax.swing.JLabel();
        txtTituloAdmi = new rojeru_san.RSMTextFull();
        lblCiudad_Admi = new javax.swing.JLabel();
        cbxCiudadAdmi = new javax.swing.JComboBox<>();
        lblFEchaNac_Admi = new javax.swing.JLabel();
        jDateFechaNacAdmi = new com.toedter.calendar.JDateChooser();
        lblEstadoCivil_Admi = new javax.swing.JLabel();
        cbxGeneroAdmi = new javax.swing.JComboBox<>();
        lblGenero_Admi = new javax.swing.JLabel();
        cbxEstadoCivilAdmi = new javax.swing.JComboBox<>();
        btnCancelar = new rojeru_san.RSButtonRiple();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, -1, -1));

        Cedula_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        Cedula_Admi.setForeground(new java.awt.Color(0, 53, 79));
        Cedula_Admi.setText("Usuario/Cédula:");
        jPanel2.add(Cedula_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 150, 40));

        txtCedulaAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtCedulaAdmi.setColorTransparente(true);
        txtCedulaAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCedulaAdmi.setPlaceholder("0123456789");
        jPanel2.add(txtCedulaAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 220, 40));

        lblPassword_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblPassword_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblPassword_Admi.setText("Contraseña:");
        jPanel2.add(lblPassword_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, 40));

        txtPasswordAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtPasswordAdmi.setOpaque(false);
        txtPasswordAdmi.setPlaceholder("Digite su Contraseña");
        txtPasswordAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordAdmiActionPerformed(evt);
            }
        });
        jPanel2.add(txtPasswordAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 220, 40));

        lblNombres_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblNombres_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblNombres_Admi.setText("Nombres:");
        jPanel2.add(lblNombres_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 90, 40));

        txtNombresAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtNombresAdmi.setColorTransparente(true);
        txtNombresAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombresAdmi.setPlaceholder("Yins Yan");
        jPanel2.add(txtNombresAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 220, 40));

        lblApellidos_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblApellidos_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblApellidos_Admi.setText("Apellidos:");
        jPanel2.add(lblApellidos_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 90, 40));

        txtApellidosAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtApellidosAdmi.setColorTransparente(true);
        txtApellidosAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtApellidosAdmi.setPlaceholder("Yins Yan");
        jPanel2.add(txtApellidosAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 220, 40));

        lblDireccion_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblDireccion_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblDireccion_Admi.setText("Dirección:");
        jPanel2.add(lblDireccion_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, 40));

        txtDireccionAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtDireccionAdmi.setColorTransparente(true);
        txtDireccionAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDireccionAdmi.setPlaceholder("Octavio Chacon");
        jPanel2.add(txtDireccionAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 220, 40));

        lblCorreo_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCorreo_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblCorreo_Admi.setText("Correo Electrónico:");
        jPanel2.add(lblCorreo_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 180, 40));

        txtCorreoAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtCorreoAdmi.setColorTransparente(true);
        txtCorreoAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCorreoAdmi.setPlaceholder("Yins_Yan@tecazuay.com");
        jPanel2.add(txtCorreoAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 220, 40));

        lblImagenAdmi.setToolTipText("SOLO JPG");
        lblImagenAdmi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(lblImagenAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 180, 140));

        btnSeleccionarImgen.setText("Selecionar Imagen");
        btnSeleccionarImgen.setToolTipText("SOLO JPG");
        btnSeleccionarImgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarImgenActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeleccionarImgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 180, 40));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Buscar/Modificar Administrador");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 430, 40));

        lblCelularAdmi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCelularAdmi.setForeground(new java.awt.Color(0, 53, 79));
        lblCelularAdmi.setText("Celular:");
        jPanel2.add(lblCelularAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, 40));

        txtCelularAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtCelularAdmi.setColorTransparente(true);
        txtCelularAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCelularAdmi.setPlaceholder("0960188019");
        jPanel2.add(txtCelularAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 190, 40));

        lblTituloAdmi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblTituloAdmi.setForeground(new java.awt.Color(0, 53, 79));
        lblTituloAdmi.setText("Titulo:");
        jPanel2.add(lblTituloAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 70, 40));

        txtTituloAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtTituloAdmi.setColorTransparente(true);
        txtTituloAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtTituloAdmi.setPlaceholder("Tglo. Software");
        jPanel2.add(txtTituloAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 190, 40));

        lblCiudad_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCiudad_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblCiudad_Admi.setText("Ciudad:");
        jPanel2.add(lblCiudad_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 80, 30));

        jPanel2.add(cbxCiudadAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 190, 30));

        lblFEchaNac_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblFEchaNac_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblFEchaNac_Admi.setText("Fecha Nacimiento:");
        jPanel2.add(lblFEchaNac_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 180, 40));
        jPanel2.add(jDateFechaNacAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 190, 30));

        lblEstadoCivil_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblEstadoCivil_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblEstadoCivil_Admi.setText("Estado Civil:");
        jPanel2.add(lblEstadoCivil_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 120, 40));

        cbxGeneroAdmi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero/a", "Casado/a", "Divorciado/a", "Viudo/a", "Union Libre" }));
        jPanel2.add(cbxGeneroAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 190, 30));

        lblGenero_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblGenero_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblGenero_Admi.setText("Género:");
        jPanel2.add(lblGenero_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 80, 40));

        cbxEstadoCivilAdmi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel2.add(cbxEstadoCivilAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 190, 30));

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
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

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

                            modificarAdministrador(txtTituloAdmi.getText(), Administrador.Estado.ACTIVO, (String) cbxCiudadAdmi.getSelectedItem(), imagenAdmi, txtCedulaAdmi.getText(),
                                    txtNombresAdmi.getText().toUpperCase(), txtApellidosAdmi.getText().toUpperCase(), txtDireccionAdmi.getText().toUpperCase(), txtCorreoAdmi.getText(), txtCelularAdmi.getText(),
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
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.out.println("salir");
        TablaAdministradores admi1 = new TablaAdministradores();
        ShowpanelCruds(admi1);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

    }//GEN-LAST:event_btnCancelarMouseClicked

    private void txtPasswordAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordAdmiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordAdmiActionPerformed

    private void btnSeleccionarImgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarImgenActionPerformed
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        jFileChooser.setFileFilter(filtrado);

        int respuesta = jFileChooser.showOpenDialog(this);

        if (respuesta == JFileChooser.APPROVE_OPTION) {
            File archivoImagen = jFileChooser.getSelectedFile();
            String Ruta = archivoImagen.getPath();

            try {
                // Leer la imagen y convertirla a un array de bytes
                imagenAdmi = leerImagen(archivoImagen);

                // Mostrar la imagen en el label
                Image mImagen = new ImageIcon(Ruta).getImage();
                ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lblImagenAdmi.getWidth(), lblImagenAdmi.getHeight(), Image.SCALE_SMOOTH));
                lblImagenAdmi.setIcon(mIcono);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al leer la imagen: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnSeleccionarImgenActionPerformed

    public final void Administradorbuscar() {

        Boolean encontrado = true;

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        Query vendedor = BaseBD.query();
        vendedor.constrain(Administrador.class);
        vendedor.descend("cedula").constrain(BuscarAdministrador);
        ObjectSet<Administrador> resultado = vendedor.execute();

        for (Administrador admi2 : resultado) {

            txtCedulaAdmi.setText(admi2.getCedula());
            txtCedulaAdmi.setEnabled(false); // porque es el atributo principal
            txtPasswordAdmi.setText(admi2.getPassword());
            txtNombresAdmi.setText(admi2.getNombres());
            txtApellidosAdmi.setText(admi2.getApellidos());
            txtDireccionAdmi.setText(admi2.getDireccion());
            txtCorreoAdmi.setText(admi2.getCorreo());
            txtCelularAdmi.setText(admi2.getCelular());
            cbxGeneroAdmi.setSelectedItem(admi2.getGenero());
            cbxEstadoCivilAdmi.setSelectedItem(admi2.getEstadoCivil());
            txtTituloAdmi.setText(admi2.getTitulo_Administrador());
            jDateFechaNacAdmi.setDate(convertirStringADate(admi2.getFechaNacimiento()));
            cbxCiudadAdmi.setSelectedItem(admi2.getCiudad());

            // Mostrar la imagen
            byte[] imagen = admi2.getImagenAdmi();
            if (imagen != null) {
                try {
                    ImageIcon icono = new ImageIcon(imagen);
                    // Verifica si el tamaño del JLabel está definido
                    int ancho = lblImagenAdmi.getWidth();
                    int alto = lblImagenAdmi.getHeight();

                    if (ancho > 0 && alto > 0) {
                        Image imagenEscalada = icono.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
                        lblImagenAdmi.setIcon(new ImageIcon(imagenEscalada));
                    } else {
                        // Puedes definir un tamaño por defecto
                        Image imagenEscalada = icono.getImage().getScaledInstance(180, 140, Image.SCALE_SMOOTH);
                        lblImagenAdmi.setIcon(new ImageIcon(imagenEscalada));
                    }

                    imagenAdmi = imagen; // Guardar la imagen en el campo de la clase
                } catch (Exception e) {
                    e.printStackTrace();
                    lblImagenAdmi.setIcon(null); // O puedes poner una imagen por defecto
                }
            }

            encontrado = true;
            JOptionPane.showMessageDialog(this, "Encontrado");
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "No se encontraron Datos");
        }
        BaseBD.close();
    }

    public static Date convertirStringADate(String fechaString) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return formato.parse(fechaString);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void modificarAdministrador(String titulo_Administrador, Administrador.Estado estado, String ciudad, byte[] imagenAdmi, String cedula, String nombres, String apellidos, String direccion, String correo, String celular, String genero,
            String fechaNacimiento, String estadoCivil, String nombreUsuario, String password, String correoRecuperacion) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        Administrador modificarAdministrador = new Administrador(titulo_Administrador, estado, ciudad, imagenAdmi, cedula, nombres, apellidos, direccion, correo, celular, genero,
                fechaNacimiento, estadoCivil, nombreUsuario, password, correoRecuperacion);

        Administrador administradorBusca = new Administrador(null, null, null, null, cedula, null,
                null, null, null, null, null, null, null, null,
                null, null);

        ObjectSet resultado = BaseBD.get(administradorBusca);

        int coincidencias = resultado.size();

        if (coincidencias > 0) {

            Administrador administadorVEliminar = (Administrador) resultado.next();
            BaseBD.delete(administadorVEliminar);

            BaseBD.set(modificarAdministrador);
            JOptionPane.showMessageDialog(this, "Aministrador Modificado");

            TablaAdministradores miTablaVendedored = new TablaAdministradores();
            ShowpanelCruds(miTablaVendedored);

        } else {
            JOptionPane.showMessageDialog(this, "No se encontro ningun Administrador");
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
    private javax.swing.JLabel Cedula_Admi;
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnModificar;
    private rojeru_san.RSButtonRiple btnSeleccionarImgen;
    private javax.swing.JComboBox<String> cbxCiudadAdmi;
    private javax.swing.JComboBox<String> cbxEstadoCivilAdmi;
    private javax.swing.JComboBox<String> cbxGeneroAdmi;
    private com.toedter.calendar.JDateChooser jDateFechaNacAdmi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblApellidos_Admi;
    private javax.swing.JLabel lblCelularAdmi;
    private javax.swing.JLabel lblCiudad_Admi;
    private javax.swing.JLabel lblCorreo_Admi;
    private javax.swing.JLabel lblDireccion_Admi;
    private javax.swing.JLabel lblEstadoCivil_Admi;
    private javax.swing.JLabel lblFEchaNac_Admi;
    private javax.swing.JLabel lblGenero_Admi;
    private javax.swing.JLabel lblImagenAdmi;
    private javax.swing.JLabel lblNombres_Admi;
    private javax.swing.JLabel lblPassword_Admi;
    private javax.swing.JLabel lblTituloAdmi;
    private rojeru_san.RSMTextFull txtApellidosAdmi;
    private rojeru_san.RSMTextFull txtCedulaAdmi;
    private rojeru_san.RSMTextFull txtCelularAdmi;
    private rojeru_san.RSMTextFull txtCorreoAdmi;
    private rojeru_san.RSMTextFull txtDireccionAdmi;
    private rojeru_san.RSMTextFull txtNombresAdmi;
    private rojeru_san.RSMPassView txtPasswordAdmi;
    private rojeru_san.RSMTextFull txtTituloAdmi;
    // End of variables declaration//GEN-END:variables
}
