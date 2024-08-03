package Vista.Cruds.CRUDS1;

import Conexion.Conexion_db;
import Models.Administrador;
import Models.Ciudad;
import Models.Persona;
import Models.Persona.Rol;
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

public class CrudPanelAdministrador extends javax.swing.JPanel {

    private byte[] imagenAdmi;

    public void GuardarAdministrador(String titulo_Administrador, Administrador.Estado estado, String ciudad, byte[] imagenAdmi,
            String cedula, String nombres, String apellidos, String direccion, String correo, String celular, String genero,
            String fechaNacimiento, String estadoCivil, String nombreUsuario, String password, String correoRecuperacion, Rol rol) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        int siguienteID = obtenerProximoIDAdministrador(BaseBD);

        Administrador administrador1 = new Administrador( titulo_Administrador, estado,  ciudad,imagenAdmi,  cedula,
         nombres,  apellidos,  direccion,  correo,  celular,  genero,  fechaNacimiento,
                 estadoCivil,  nombreUsuario,  password,  correoRecuperacion, rol);

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
    
    private void mostrarComboCiudad() {
    ObjectContainer BaseBD = Conexion_db.ConectarBD();
    
    Query ciudadbox = BaseBD.query();
    ciudadbox.constrain(Ciudad.class);
    ObjectSet<Ciudad> resultado = ciudadbox.execute();
    
    for (Ciudad ciudad : resultado) {
        cbxCiudadAdmi.addItem(ciudad.getCiudad());
    }
    
    BaseBD.close();
}

    public CrudPanelAdministrador() {
        initComponents();
        
         mostrarComboCiudad(); 
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
        lblTituloAdmi = new javax.swing.JLabel();
        lblFEchaNac_Admi = new javax.swing.JLabel();
        lblCiudad_Admi = new javax.swing.JLabel();
        lblEstadoCivil_Admi = new javax.swing.JLabel();
        txtCedulaAdmi = new rojeru_san.RSMTextFull();
        txtNombresAdmi = new rojeru_san.RSMTextFull();
        txtApellidosAdmi = new rojeru_san.RSMTextFull();
        txtDireccionAdmi = new rojeru_san.RSMTextFull();
        txtCorreoAdmi = new rojeru_san.RSMTextFull();
        txtTituloAdmi = new rojeru_san.RSMTextFull();
        btnCancelar = new rojeru_san.RSButtonRiple();
        jDateFechaNacAdmi = new com.toedter.calendar.JDateChooser();
        cbxCiudadAdmi = new javax.swing.JComboBox<>();
        cbxEstadoCivilAdmi = new javax.swing.JComboBox<>();
        lblPassword_Admi = new javax.swing.JLabel();
        lblCelularAdmi = new javax.swing.JLabel();
        txtCelularAdmi = new rojeru_san.RSMTextFull();
        lblGenero_Admi = new javax.swing.JLabel();
        cbxGeneroAdmi = new javax.swing.JComboBox<>();
        btnGuardar = new rojeru_san.RSButtonRiple();
        btnSeleccionarImgen = new rojeru_san.RSButtonRiple();
        lblImagenAdmi = new javax.swing.JLabel();
        txtPasswordAdmi = new rojeru_san.RSMPassView();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Registro Administrador");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 330, 40));

        Cedula_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        Cedula_Admi.setForeground(new java.awt.Color(0, 53, 79));
        Cedula_Admi.setText("Usuario/Cédula:");
        jPanel2.add(Cedula_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, 40));

        lblNombres_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblNombres_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblNombres_Admi.setText("Nombres:");
        jPanel2.add(lblNombres_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 90, 40));

        lblApellidos_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblApellidos_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblApellidos_Admi.setText("Apellidos:");
        jPanel2.add(lblApellidos_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 90, 40));

        lblDireccion_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblDireccion_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblDireccion_Admi.setText("Dirección:");
        jPanel2.add(lblDireccion_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, 40));

        lblCorreo_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCorreo_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblCorreo_Admi.setText("Correo Electrónico:");
        jPanel2.add(lblCorreo_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 180, 40));

        lblTituloAdmi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblTituloAdmi.setForeground(new java.awt.Color(0, 53, 79));
        lblTituloAdmi.setText("Titulo:");
        jPanel2.add(lblTituloAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 70, 40));

        lblFEchaNac_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblFEchaNac_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblFEchaNac_Admi.setText("Fecha Nacimiento:");
        jPanel2.add(lblFEchaNac_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 180, 40));

        lblCiudad_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCiudad_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblCiudad_Admi.setText("Ciudad:");
        jPanel2.add(lblCiudad_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 80, 30));

        lblEstadoCivil_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblEstadoCivil_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblEstadoCivil_Admi.setText("Estado Civil:");
        jPanel2.add(lblEstadoCivil_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 120, 40));

        txtCedulaAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtCedulaAdmi.setColorTransparente(true);
        txtCedulaAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCedulaAdmi.setPlaceholder("0123456789");
        jPanel2.add(txtCedulaAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 220, 40));

        txtNombresAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtNombresAdmi.setColorTransparente(true);
        txtNombresAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombresAdmi.setPlaceholder("Yins Yan");
        jPanel2.add(txtNombresAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 220, 40));

        txtApellidosAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtApellidosAdmi.setColorTransparente(true);
        txtApellidosAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtApellidosAdmi.setPlaceholder("Yins Yan");
        jPanel2.add(txtApellidosAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 220, 40));

        txtDireccionAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtDireccionAdmi.setColorTransparente(true);
        txtDireccionAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDireccionAdmi.setPlaceholder("Octavio Chacon");
        jPanel2.add(txtDireccionAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 220, 40));

        txtCorreoAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtCorreoAdmi.setColorTransparente(true);
        txtCorreoAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCorreoAdmi.setPlaceholder("Yins_Yan@tecazuay.com");
        jPanel2.add(txtCorreoAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 220, 40));

        txtTituloAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtTituloAdmi.setColorTransparente(true);
        txtTituloAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtTituloAdmi.setPlaceholder("Tglo. Software");
        jPanel2.add(txtTituloAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 190, 40));

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
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, -1, -1));
        jPanel2.add(jDateFechaNacAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 190, 30));

        jPanel2.add(cbxCiudadAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 190, 30));

        cbxEstadoCivilAdmi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel2.add(cbxEstadoCivilAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 190, 30));

        lblPassword_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblPassword_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblPassword_Admi.setText("Contraseña:");
        jPanel2.add(lblPassword_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, 40));

        lblCelularAdmi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCelularAdmi.setForeground(new java.awt.Color(0, 53, 79));
        lblCelularAdmi.setText("Celular:");
        jPanel2.add(lblCelularAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, -1, 40));

        txtCelularAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtCelularAdmi.setColorTransparente(true);
        txtCelularAdmi.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCelularAdmi.setPlaceholder("0960188019");
        jPanel2.add(txtCelularAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 190, 40));

        lblGenero_Admi.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblGenero_Admi.setForeground(new java.awt.Color(0, 53, 79));
        lblGenero_Admi.setText("Género:");
        jPanel2.add(lblGenero_Admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 80, 40));

        cbxGeneroAdmi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero/a", "Casado/a", "Divorciado/a", "Viudo/a", "Union Libre", " " }));
        jPanel2.add(cbxGeneroAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 190, 30));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, -1, 40));

        btnSeleccionarImgen.setText("Selecionar Imagen");
        btnSeleccionarImgen.setToolTipText("SOLO JPG");
        btnSeleccionarImgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarImgenActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeleccionarImgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 180, -1));

        lblImagenAdmi.setToolTipText("SOLO JPG");
        lblImagenAdmi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(lblImagenAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 180, 140));

        txtPasswordAdmi.setForeground(new java.awt.Color(0, 53, 79));
        txtPasswordAdmi.setOpaque(false);
        txtPasswordAdmi.setPlaceholder("Digite su Contraseña");
        txtPasswordAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordAdmiActionPerformed(evt);
            }
        });
        jPanel2.add(txtPasswordAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 220, 40));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 448, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 448, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.out.println("salir");
        cambiartabla();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void cambiartabla() {
        TablaAdministradores tblCli = new TablaAdministradores();
        ShowpanelCruds(tblCli);
    }

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
                                
                                if (imagenAdmi == null) {
                                try {
                                    File imagenPredeterminada = new File("C:\\BasedeDatos\\defectousuario\\imagenDefecto.jpg");
                                    imagenAdmi = leerImagen(imagenPredeterminada);
                                } catch (IOException e) {
                                    JOptionPane.showMessageDialog(null, "Error al cargar la imagen predeterminada: " + e.getMessage());
                                }
                            }

                                GuardarAdministrador(txtTituloAdmi.getText(), Administrador.Estado.ACTIVO, (String) cbxCiudadAdmi.getSelectedItem(), imagenAdmi, txtCedulaAdmi.getText(),
                                        txtNombresAdmi.getText().toUpperCase(), txtApellidosAdmi.getText().toUpperCase(), txtDireccionAdmi.getText().toUpperCase(), txtCorreoAdmi.getText(), txtCelularAdmi.getText(),
                                        (String) cbxGeneroAdmi.getSelectedItem(), fechaNacimiento, (String) cbxEstadoCivilAdmi.getSelectedItem(), txtCedulaAdmi.getText(), txtPasswordAdmi.getText(),
                                        txtCorreoAdmi.getText(), Rol.CLIENTE);

                                cambiartabla();
                                limpiar();
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

    private void btnSeleccionarImgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarImgenActionPerformed
//        JFileChooser jFileChooser = new JFileChooser();
//        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
//        jFileChooser.setFileFilter(filtrado);
//
//        int respuesta = jFileChooser.showOpenDialog(this);
//
//        if (respuesta == JFileChooser.APPROVE_OPTION) {
//            File archivoImagen = jFileChooser.getSelectedFile();
//            String Ruta = archivoImagen.getPath();
//
//            try {
//                // Leer la imagen y convertirla a un array de bytes
//                imagenAdmi = leerImagen(archivoImagen);
//
//                // Mostrar la imagen en el label
//                Image mImagen = new ImageIcon(Ruta).getImage();
//                ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lblImagenAdmi.getWidth(), lblImagenAdmi.getHeight(), Image.SCALE_SMOOTH));
//                lblImagenAdmi.setIcon(mIcono);
//            } catch (IOException e) {
//                JOptionPane.showMessageDialog(this, "Error al leer la imagen: " + e.getMessage());
//            }
//        }
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

    private void txtPasswordAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordAdmiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordAdmiActionPerformed

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

    public void limpiar() {
        txtCedulaAdmi.setText("");
        txtPasswordAdmi.setText("");
        txtNombresAdmi.setText("");
        txtApellidosAdmi.setText("");
        txtDireccionAdmi.setText("");
        txtCorreoAdmi.setText("");
        txtCelularAdmi.setText("");
        txtTituloAdmi.setText("");
        cbxCiudadAdmi.setSelectedItem(-1);        
        jDateFechaNacAdmi.setDate(null);
        cbxEstadoCivilAdmi.setSelectedIndex(-1);
        cbxGeneroAdmi.setSelectedIndex(-1);
        imagenAdmi = null;
        lblImagenAdmi.setIcon(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cedula_Admi;
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private rojeru_san.RSButtonRiple btnSeleccionarImgen;
    private javax.swing.JComboBox<String> cbxCiudadAdmi;
    private javax.swing.JComboBox<String> cbxEstadoCivilAdmi;
    private javax.swing.JComboBox<String> cbxGeneroAdmi;
    private com.toedter.calendar.JDateChooser jDateFechaNacAdmi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
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
