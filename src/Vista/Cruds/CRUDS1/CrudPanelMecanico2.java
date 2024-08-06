package Vista.Cruds.CRUDS1;

import Conexion.Conexion_db;
import Models.Ciudad;
import Models.Mecanico;
import Models.Persona;
import Models.Persona.Rol;
import Vista.Menu.VistaMenu;
import Vista.Tables.TablaMecanicos;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.awt.BorderLayout;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CrudPanelMecanico2 extends javax.swing.JPanel {

    private byte[] imagenMeca;
    private String BuscarMecanico;

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

    private void mostrarComboCiudad() {
        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        Query ciudadbox = BaseBD.query();
        ciudadbox.constrain(Ciudad.class);
        ObjectSet<Ciudad> resultado = ciudadbox.execute();

        for (Ciudad ciudad : resultado) {
            cbxCiudadMeca.addItem(ciudad.getCiudad());
        }

        BaseBD.close();
    }

    public CrudPanelMecanico2(String receivedString) {
        this.BuscarMecanico = receivedString;
        initComponents();
        Mecanicobuscar();
        mostrarComboCiudad();
        configurarFechaNacimiento();
    }

    

    private void configurarFechaNacimiento() {
        Calendar calendar = Calendar.getInstance();
        // Obtener la fecha actual
        Date fechaActual = calendar.getTime();

        // Calcular la fecha máxima permitida (fecha actual menos 18 años)
        calendar.add(Calendar.YEAR, -18);
        Date fechaMaxima = calendar.getTime();

        // Establecer el rango de fechas permitido en el JDateChooser
        jDateFechaNacMeca.setMaxSelectableDate(fechaMaxima);
        jDateFechaNacMeca.setMinSelectableDate(null); // Si no deseas establecer una fecha mínima, puedes dejar esto como null
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new rojeru_san.RSButtonRiple();
        btnModificar = new rojeru_san.RSButtonRiple();
        lblImagenMeca = new javax.swing.JLabel();
        btnSeleccionarImgen1 = new rojeru_san.RSButtonRiple();
        CedulaMeca = new javax.swing.JLabel();
        txtCedulaMeca = new rojeru_san.RSMTextFull();
        lblPasswordMeca = new javax.swing.JLabel();
        txtPasswordMeca = new rojeru_san.RSMPassView();
        lblNombresMeca = new javax.swing.JLabel();
        txtNombresMeca = new rojeru_san.RSMTextFull();
        lblApellidosMeca = new javax.swing.JLabel();
        txtApellidosMeca = new rojeru_san.RSMTextFull();
        lblDireccionMeca = new javax.swing.JLabel();
        txtDireccionMeca = new rojeru_san.RSMTextFull();
        lblCorreoMeca = new javax.swing.JLabel();
        txtCorreoMeca = new rojeru_san.RSMTextFull();
        lblCelularMeca = new javax.swing.JLabel();
        txtCelularMeca = new rojeru_san.RSMTextFull();
        lblCiudadMeca = new javax.swing.JLabel();
        cbxCiudadMeca = new javax.swing.JComboBox<>();
        lblFEchaNacMeca = new javax.swing.JLabel();
        jDateFechaNacMeca = new com.toedter.calendar.JDateChooser();
        lblEstadoCivilMeca = new javax.swing.JLabel();
        cbxGeneroMeca = new javax.swing.JComboBox<>();
        lblGeneroMeca = new javax.swing.JLabel();
        cbxEstadoCivilMeca = new javax.swing.JComboBox<>();
        lblTituloMeca = new javax.swing.JLabel();
        txtTituloMeca = new rojeru_san.RSMTextFull();
        lblSueldoMeca = new javax.swing.JLabel();
        txtSueldoMeca = new rojeru_san.RSMTextFull();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Buscar/Modificar Mecanico");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 370, 40));

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
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, -1, -1));

        lblImagenMeca.setToolTipText("SOLO JPG");
        lblImagenMeca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(lblImagenMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 180, 140));

        btnSeleccionarImgen1.setText("Selecionar Imagen");
        btnSeleccionarImgen1.setToolTipText("SOLO JPG");
        btnSeleccionarImgen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarImgen1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeleccionarImgen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 180, -1));

        CedulaMeca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        CedulaMeca.setForeground(new java.awt.Color(0, 53, 79));
        CedulaMeca.setText("Usuario/Cédula:");
        jPanel2.add(CedulaMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 150, 40));

        txtCedulaMeca.setForeground(new java.awt.Color(0, 53, 79));
        txtCedulaMeca.setColorTransparente(true);
        txtCedulaMeca.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCedulaMeca.setPlaceholder("0123456789");
        jPanel2.add(txtCedulaMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 220, 40));

        lblPasswordMeca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblPasswordMeca.setForeground(new java.awt.Color(0, 53, 79));
        lblPasswordMeca.setText("Contraseña:");
        jPanel2.add(lblPasswordMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, 40));

        txtPasswordMeca.setForeground(new java.awt.Color(0, 53, 79));
        txtPasswordMeca.setOpaque(false);
        txtPasswordMeca.setPlaceholder("Digite su Contraseña");
        txtPasswordMeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordMecaActionPerformed(evt);
            }
        });
        jPanel2.add(txtPasswordMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 220, 40));

        lblNombresMeca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblNombresMeca.setForeground(new java.awt.Color(0, 53, 79));
        lblNombresMeca.setText("Nombres:");
        jPanel2.add(lblNombresMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 90, 40));

        txtNombresMeca.setForeground(new java.awt.Color(0, 53, 79));
        txtNombresMeca.setColorTransparente(true);
        txtNombresMeca.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombresMeca.setPlaceholder("Yins Yan");
        jPanel2.add(txtNombresMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 220, 40));

        lblApellidosMeca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblApellidosMeca.setForeground(new java.awt.Color(0, 53, 79));
        lblApellidosMeca.setText("Apellidos:");
        jPanel2.add(lblApellidosMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 90, 40));

        txtApellidosMeca.setForeground(new java.awt.Color(0, 53, 79));
        txtApellidosMeca.setColorTransparente(true);
        txtApellidosMeca.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtApellidosMeca.setPlaceholder("Yins Yan");
        jPanel2.add(txtApellidosMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 220, 40));

        lblDireccionMeca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblDireccionMeca.setForeground(new java.awt.Color(0, 53, 79));
        lblDireccionMeca.setText("Dirección:");
        jPanel2.add(lblDireccionMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, 40));

        txtDireccionMeca.setForeground(new java.awt.Color(0, 53, 79));
        txtDireccionMeca.setColorTransparente(true);
        txtDireccionMeca.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDireccionMeca.setPlaceholder("Octavio Chacon");
        jPanel2.add(txtDireccionMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 220, 40));

        lblCorreoMeca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCorreoMeca.setForeground(new java.awt.Color(0, 53, 79));
        lblCorreoMeca.setText("Correo Electrónico:");
        jPanel2.add(lblCorreoMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 190, 40));

        txtCorreoMeca.setForeground(new java.awt.Color(0, 53, 79));
        txtCorreoMeca.setColorTransparente(true);
        txtCorreoMeca.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCorreoMeca.setPlaceholder("Yins_Yan@tecazuay.com");
        jPanel2.add(txtCorreoMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 220, 40));

        lblCelularMeca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCelularMeca.setForeground(new java.awt.Color(0, 53, 79));
        lblCelularMeca.setText("Celular:");
        jPanel2.add(lblCelularMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, -1, 40));

        txtCelularMeca.setForeground(new java.awt.Color(0, 53, 79));
        txtCelularMeca.setColorTransparente(true);
        txtCelularMeca.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCelularMeca.setPlaceholder("0960188019");
        jPanel2.add(txtCelularMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 220, 40));

        lblCiudadMeca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCiudadMeca.setForeground(new java.awt.Color(0, 53, 79));
        lblCiudadMeca.setText("Ciudad:");
        jPanel2.add(lblCiudadMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 80, 30));

        cbxCiudadMeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCiudadMecaActionPerformed(evt);
            }
        });
        jPanel2.add(cbxCiudadMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 220, 30));

        lblFEchaNacMeca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblFEchaNacMeca.setForeground(new java.awt.Color(0, 53, 79));
        lblFEchaNacMeca.setText("Fecha Nacimiento:");
        jPanel2.add(lblFEchaNacMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 180, 40));
        jPanel2.add(jDateFechaNacMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 220, 30));

        lblEstadoCivilMeca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblEstadoCivilMeca.setForeground(new java.awt.Color(0, 53, 79));
        lblEstadoCivilMeca.setText("Estado Civil:");
        jPanel2.add(lblEstadoCivilMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 120, 40));

        cbxGeneroMeca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero/a", "Casado/a", "Divorciado/a", "Viudo/a", "Union Libre" }));
        jPanel2.add(cbxGeneroMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 220, 30));

        lblGeneroMeca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblGeneroMeca.setForeground(new java.awt.Color(0, 53, 79));
        lblGeneroMeca.setText("Género:");
        jPanel2.add(lblGeneroMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 80, 40));

        cbxEstadoCivilMeca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel2.add(cbxEstadoCivilMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 220, 30));

        lblTituloMeca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblTituloMeca.setForeground(new java.awt.Color(0, 53, 79));
        lblTituloMeca.setText("Titulo:");
        jPanel2.add(lblTituloMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 60, 40));

        txtTituloMeca.setForeground(new java.awt.Color(0, 53, 79));
        txtTituloMeca.setColorTransparente(true);
        txtTituloMeca.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtTituloMeca.setPlaceholder("Tglo. Software");
        jPanel2.add(txtTituloMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 220, 40));

        lblSueldoMeca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblSueldoMeca.setForeground(new java.awt.Color(0, 53, 79));
        lblSueldoMeca.setText("Sueldo:");
        jPanel2.add(lblSueldoMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 70, 40));

        txtSueldoMeca.setForeground(new java.awt.Color(0, 53, 79));
        txtSueldoMeca.setColorTransparente(true);
        txtSueldoMeca.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtSueldoMeca.setPlaceholder("$1000");
        jPanel2.add(txtSueldoMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 220, 40));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 448, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 448, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

    }//GEN-LAST:event_btnCancelarMouseClicked
    public void cambiartabla() {
        TablaMecanicos tblmeca = new TablaMecanicos();
        ShowpanelCruds(tblmeca);
    }
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

         Boolean valido = true;
            // Verificar que todos los campos no estén vacíos
            if (txtCedulaMeca.getText().isEmpty()
                    || txtNombresMeca.getText().isEmpty()
                    || txtApellidosMeca.getText().isEmpty()
                    || txtCorreoMeca.getText().isEmpty()
                    || txtCelularMeca.getText().isEmpty()
                    || txtTituloMeca.getText().isEmpty()
                    || txtSueldoMeca.getText().isEmpty()
                    || txtDireccionMeca.getText().isEmpty()
                    || txtPasswordMeca.getText().isEmpty()
                    || jDateFechaNacMeca.getDate() == null) {
                valido = false;
                JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");

            }

            if (valido) {

                Date fechaNacimientoDate = jDateFechaNacMeca.getDate(); // Obtener la fecha de nacimiento del JDateChooser

                // Formatear la fecha como String en el formato deseado (por ejemplo, "dd/MM/yyyy")
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimiento = sdf.format(fechaNacimientoDate);

                if (Persona.validarCedula(txtCedulaMeca.getText())) {
                    if (valido = txtNombresMeca.getText().toUpperCase().matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)?$")) {
                        if (valido = txtApellidosMeca.getText().toUpperCase().matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)?$")) {
                            if (valido = txtCorreoMeca.getText().matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
                                if (valido = txtCelularMeca.getText().matches("^09\\d{8}$")) {
                                    if (valido = txtSueldoMeca.getText().matches("^\\d+(\\.\\d{1,2})?$")) {

                                        if (imagenMeca == null) {
                                            try {
                                                File imagenPredeterminada = new File("C:\\BasedeDatos\\defectousuario\\imagenDefecto.jpg");
                                                imagenMeca = leerImagen(imagenPredeterminada);
                                            } catch (IOException e) {
                                                JOptionPane.showMessageDialog(null, "Error al cargar la imagen predeterminada: " + e.getMessage());
                                            }
                                        }

                                        modificarMecanico(txtTituloMeca.getText().toUpperCase(), Double.parseDouble(txtSueldoMeca.getText()), Mecanico.Estado.ACTIVO, (String) cbxCiudadMeca.getSelectedItem(), imagenMeca, txtCedulaMeca.getText(), txtNombresMeca.getText().toUpperCase(),
                                                txtApellidosMeca.getText().toUpperCase(), txtDireccionMeca.getText().toUpperCase(), txtCorreoMeca.getText(), txtCelularMeca.getText(),
                                                (String) cbxGeneroMeca.getSelectedItem(), fechaNacimiento, (String) cbxEstadoCivilMeca.getSelectedItem(), txtCedulaMeca.getText(), txtPasswordMeca.getText(),
                                                txtCorreoMeca.getText(), Rol.MECANICO);

                                        cambiartabla();

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Ingrese un sueldo valido");
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "Ingrese un celular valido");
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "Ingrese un correo valido");
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
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.out.println("salir");
        cambiartabla();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSeleccionarImgen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarImgen1ActionPerformed

        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG", "jpg");
        jFileChooser.setFileFilter(filtrado);

        int respuesta = jFileChooser.showOpenDialog(this);

        if (respuesta == JFileChooser.APPROVE_OPTION) {
            File archivoImagen = jFileChooser.getSelectedFile();
            String Ruta = archivoImagen.getPath();

            try {
                // Leer la imagen y convertirla a un array de bytes
                imagenMeca = leerImagen(archivoImagen);

                // Mostrar la imagen en el label
                Image mImagen = new ImageIcon(Ruta).getImage();
                ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lblImagenMeca.getWidth(), lblImagenMeca.getHeight(), Image.SCALE_SMOOTH));
                lblImagenMeca.setIcon(mIcono);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al leer la imagen: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnSeleccionarImgen1ActionPerformed

    private void txtPasswordMecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordMecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordMecaActionPerformed

    private void cbxCiudadMecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCiudadMecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCiudadMecaActionPerformed

    public final void Mecanicobuscar() {

        Boolean encontrado = true;

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        Query mecanico = BaseBD.query();
        mecanico.constrain(Mecanico.class);
        mecanico.descend("cedula").constrain(BuscarMecanico);
        ObjectSet<Mecanico> resultado = mecanico.execute();

        for (Mecanico meca : resultado) {

            txtCedulaMeca.setText(meca.getCedula());
            txtCedulaMeca.setEnabled(false); // porque es el atributo principal
            txtPasswordMeca.setText(meca.getPassword());
            txtNombresMeca.setText(meca.getNombres());
            txtApellidosMeca.setText(meca.getApellidos());
            txtDireccionMeca.setText(meca.getDireccion());
            txtCorreoMeca.setText(meca.getCorreo());
            txtCelularMeca.setText(meca.getCelular());
            cbxCiudadMeca.setSelectedItem(meca.getCiudad());
            cbxGeneroMeca.setSelectedItem(meca.getGenero());
            cbxEstadoCivilMeca.setSelectedItem(meca.getEstadoCivil());
            txtTituloMeca.setText(meca.getTitulo());
            txtSueldoMeca.setText(String.valueOf(meca.getSueldo()));
            jDateFechaNacMeca.setDate(convertirStringADate(meca.getFechaNacimiento()));
            // Mostrar la imagen
            byte[] imagen = meca.getImagenMeca();
            if (imagen != null) {
                try {
                    ImageIcon icono = new ImageIcon(imagen);
                    // Verifica si el tamaño del JLabel está definido
                    int ancho = lblImagenMeca.getWidth();
                    int alto = lblImagenMeca.getHeight();

                    if (ancho > 0 && alto > 0) {
                        Image imagenEscalada = icono.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
                        lblImagenMeca.setIcon(new ImageIcon(imagenEscalada));
                    } else {
                        // Puedes definir un tamaño por defecto
                        Image imagenEscalada = icono.getImage().getScaledInstance(180, 140, Image.SCALE_SMOOTH);
                        lblImagenMeca.setIcon(new ImageIcon(imagenEscalada));
                    }

                    imagenMeca = imagen; // Guardar la imagen en el campo de la clase
                } catch (Exception e) {
                    e.printStackTrace();
                    lblImagenMeca.setIcon(null); // O puedes poner una imagen por defecto
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

    public void modificarMecanico(String titulo, double Sueldo, Mecanico.Estado estado, String ciudad, byte[] imagenMeca, String cedula, String nombres, String apellidos,
            String direccion, String correo, String celular, String genero, String fechaNacimiento, String estadoCivil,
            String nombreUsuario, String password, String correoRecuperacion, Rol rol) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        Mecanico modificarMecanico = new Mecanico(titulo, Sueldo, estado, ciudad, imagenMeca, cedula, nombres, apellidos,
                direccion, correo, celular, genero, fechaNacimiento, estadoCivil,
                nombreUsuario, password, correoRecuperacion, rol);

        Mecanico mecanicoBusca = new Mecanico(null, 0.0, null, null, null, cedula, null, null, null, null,
                null, null, null, null, null, null, null, null);

        ObjectSet resultado = BaseBD.get(mecanicoBusca);

        int coincidencias = resultado.size();

        if (coincidencias > 0) {

            Mecanico vendedorVEliminar = (Mecanico) resultado.next();
            BaseBD.delete(vendedorVEliminar);

            BaseBD.set(modificarMecanico);
            JOptionPane.showMessageDialog(this, "Mecanico Modificado");

            TablaMecanicos miTablaVendedored = new TablaMecanicos();
            ShowpanelCruds(miTablaVendedored);

        } else {
            JOptionPane.showMessageDialog(this, "No se encontro ningun Mecanico");
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
    private javax.swing.JLabel CedulaMeca;
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnModificar;
    private rojeru_san.RSButtonRiple btnSeleccionarImgen1;
    private javax.swing.JComboBox<String> cbxCiudadMeca;
    private javax.swing.JComboBox<String> cbxEstadoCivilMeca;
    private javax.swing.JComboBox<String> cbxGeneroMeca;
    private com.toedter.calendar.JDateChooser jDateFechaNacMeca;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblApellidosMeca;
    private javax.swing.JLabel lblCelularMeca;
    private javax.swing.JLabel lblCiudadMeca;
    private javax.swing.JLabel lblCorreoMeca;
    private javax.swing.JLabel lblDireccionMeca;
    private javax.swing.JLabel lblEstadoCivilMeca;
    private javax.swing.JLabel lblFEchaNacMeca;
    private javax.swing.JLabel lblGeneroMeca;
    private javax.swing.JLabel lblImagenMeca;
    private javax.swing.JLabel lblNombresMeca;
    private javax.swing.JLabel lblPasswordMeca;
    private javax.swing.JLabel lblSueldoMeca;
    private javax.swing.JLabel lblTituloMeca;
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
