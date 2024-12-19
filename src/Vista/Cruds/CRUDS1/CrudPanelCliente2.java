package Vista.Cruds.CRUDS1;

import Conexion.Conexion_db;
import Models.Ciudad;
import Models.Cliente;
import Models.Cliente.Estado;
import Models.Persona;
import Models.Persona.Rol;
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

public class CrudPanelCliente2 extends javax.swing.JPanel {

    private String BuscarCliente;
    private byte[] imagenCli;

    public CrudPanelCliente2(String receivedString) {
        this.BuscarCliente = receivedString;
        initComponents();
        Clientebuscar();
        mostrarComboCiudad();

    }

    private void mostrarComboCiudad() {
        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        Query ciudadbox = BaseBD.query();
        ciudadbox.constrain(Ciudad.class);
        ObjectSet<Ciudad> resultado = ciudadbox.execute();

        for (Ciudad ciudad : resultado) {
            cbxCiudadCli.addItem(ciudad.getCiudad());
        }

        BaseBD.close();
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new rojeru_san.RSButtonRiple();
        btnModificar = new rojeru_san.RSButtonRiple();
        lblImagenCli = new javax.swing.JLabel();
        btnSeleccionarImgen1 = new rojeru_san.RSButtonRiple();
        Cedula_Cli = new javax.swing.JLabel();
        txtCedulaCli = new rojeru_san.RSMTextFull();
        lblPassword_Cli = new javax.swing.JLabel();
        txtPasswordCli = new rojeru_san.RSMPassView();
        lblNombres_Cli = new javax.swing.JLabel();
        txtNombresCli = new rojeru_san.RSMTextFull();
        lblApellidos_Cli = new javax.swing.JLabel();
        txtApellidosCli = new rojeru_san.RSMTextFull();
        lblDireccion_Cli = new javax.swing.JLabel();
        txtDireccionCli = new rojeru_san.RSMTextFull();
        lblCorreo_Cli = new javax.swing.JLabel();
        txtCorreoCli = new rojeru_san.RSMTextFull();
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

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Buscar/Modificar Cliente");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 330, 40));

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
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, -1, -1));

        lblImagenCli.setToolTipText("SOLO JPG");
        lblImagenCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(lblImagenCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 180, 140));

        btnSeleccionarImgen1.setText("Selecionar Imagen");
        btnSeleccionarImgen1.setToolTipText("SOLO JPG");
        btnSeleccionarImgen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarImgen1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeleccionarImgen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 180, 40));

        Cedula_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        Cedula_Cli.setForeground(new java.awt.Color(0, 53, 79));
        Cedula_Cli.setText("Usuario/Cédula:");
        jPanel2.add(Cedula_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 150, 40));

        txtCedulaCli.setForeground(new java.awt.Color(0, 53, 79));
        txtCedulaCli.setColorTransparente(true);
        txtCedulaCli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCedulaCli.setPlaceholder("0123456789");
        jPanel2.add(txtCedulaCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 220, 40));

        lblPassword_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblPassword_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblPassword_Cli.setText("Contraseña:");
        jPanel2.add(lblPassword_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, 40));

        txtPasswordCli.setForeground(new java.awt.Color(0, 53, 79));
        txtPasswordCli.setOpaque(false);
        txtPasswordCli.setPlaceholder("Digite su Contraseña");
        txtPasswordCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordCliActionPerformed(evt);
            }
        });
        jPanel2.add(txtPasswordCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 220, 40));

        lblNombres_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblNombres_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblNombres_Cli.setText("Nombres:");
        jPanel2.add(lblNombres_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 90, 40));

        txtNombresCli.setForeground(new java.awt.Color(0, 53, 79));
        txtNombresCli.setColorTransparente(true);
        txtNombresCli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombresCli.setPlaceholder("Yins Yan");
        jPanel2.add(txtNombresCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 220, 40));

        lblApellidos_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblApellidos_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblApellidos_Cli.setText("Apellidos:");
        jPanel2.add(lblApellidos_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 90, 40));

        txtApellidosCli.setForeground(new java.awt.Color(0, 53, 79));
        txtApellidosCli.setColorTransparente(true);
        txtApellidosCli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtApellidosCli.setPlaceholder("Yins Yan");
        jPanel2.add(txtApellidosCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 220, 40));

        lblDireccion_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblDireccion_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblDireccion_Cli.setText("Dirección:");
        jPanel2.add(lblDireccion_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, 40));

        txtDireccionCli.setForeground(new java.awt.Color(0, 53, 79));
        txtDireccionCli.setColorTransparente(true);
        txtDireccionCli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDireccionCli.setPlaceholder("Octavio Chacon");
        jPanel2.add(txtDireccionCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 220, 40));

        lblCorreo_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCorreo_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblCorreo_Cli.setText("Correo Electrónico:");
        jPanel2.add(lblCorreo_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 190, 40));

        txtCorreoCli.setForeground(new java.awt.Color(0, 53, 79));
        txtCorreoCli.setColorTransparente(true);
        txtCorreoCli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCorreoCli.setPlaceholder("Yins_Yan@tecazuay.com");
        jPanel2.add(txtCorreoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 220, 40));

        lblCelularCli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCelularCli.setForeground(new java.awt.Color(0, 53, 79));
        lblCelularCli.setText("Celular:");
        jPanel2.add(lblCelularCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, 40));

        txtCelularCli.setForeground(new java.awt.Color(0, 53, 79));
        txtCelularCli.setColorTransparente(true);
        txtCelularCli.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCelularCli.setPlaceholder("0960188019");
        jPanel2.add(txtCelularCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 190, 40));

        lblCiudad_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCiudad_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblCiudad_Cli.setText("Ciudad:");
        jPanel2.add(lblCiudad_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 80, 30));

        cbxCiudadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCiudadCliActionPerformed(evt);
            }
        });
        jPanel2.add(cbxCiudadCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 190, 30));

        lblFEchaNac_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblFEchaNac_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblFEchaNac_Cli.setText("Fecha Nacimiento:");
        jPanel2.add(lblFEchaNac_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 180, 40));
        jPanel2.add(jDateFechaNacCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 190, 30));

        lblEstadoCivil_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblEstadoCivil_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblEstadoCivil_Cli.setText("Estado Civil:");
        jPanel2.add(lblEstadoCivil_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 120, 40));

        cbxGeneroCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero/a", "Casado/a", "Divorciado/a", "Viudo/a", "Union Libre" }));
        jPanel2.add(cbxGeneroCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 190, 30));

        lblGenero_Cli.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblGenero_Cli.setForeground(new java.awt.Color(0, 53, 79));
        lblGenero_Cli.setText("Género:");
        jPanel2.add(lblGenero_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 80, 40));

        cbxEstadoCivilCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel2.add(cbxEstadoCivilCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 445, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 445, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 320, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 320, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

    }//GEN-LAST:event_btnCancelarMouseClicked
    public void cambiartabla() {
        TablaClientes tblCli = new TablaClientes();
        ShowpanelCruds(tblCli);
    }
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        Boolean valido = true;

        // Verificar si algún campo está vacío
        if (txtCedulaCli.getText().trim().isEmpty()
                || txtNombresCli.getText().trim().isEmpty()
                || txtApellidosCli.getText().trim().isEmpty()
                || txtCorreoCli.getText().trim().isEmpty()
                || txtCelularCli.getText().trim().isEmpty()
                || txtDireccionCli.getText().trim().isEmpty()
                || txtPasswordCli.getText().trim().isEmpty()
                || jDateFechaNacCli.getDate() == null) {

            JOptionPane.showMessageDialog(null, "Todos los campos deben ser llenados");
            valido = false;
        }

        if (valido) {
            Date fechaNacimientoDate = jDateFechaNacCli.getDate(); // Obtener la fecha de nacimiento del JDateChooser

            // Formatear la fecha como String en el formato deseado (por ejemplo, "dd/MM/yyyy")
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimiento = sdf.format(fechaNacimientoDate);

            if (Persona.validarCedula(txtCedulaCli.getText())) {
                if (valido = txtNombresCli.getText().toUpperCase().matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)?$")) {
                    if (valido = txtApellidosCli.getText().toUpperCase().matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)?$")) {
                        if (valido = txtCorreoCli.getText().matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
                            if (valido = txtCelularCli.getText().matches("^09\\d{8}$")) {

                                if (imagenCli == null) {
                                    try {
                                        File imagenPredeterminada = new File("C:\\BasedeDatos\\defectousuario\\imagenDefecto.jpg");
                                        imagenCli = leerImagen(imagenPredeterminada);
                                    } catch (IOException e) {
                                        JOptionPane.showMessageDialog(null, "Error al cargar la imagen predeterminada: " + e.getMessage());
                                    }
                                }

                                modificarCliente(Estado.ACTIVO, (String) cbxCiudadCli.getSelectedItem(), imagenCli, txtCedulaCli.getText(), txtNombresCli.getText().toUpperCase().toUpperCase(), txtApellidosCli.getText().toUpperCase(),
                                        txtDireccionCli.getText().toUpperCase(), txtCorreoCli.getText(), txtCelularCli.getText(), (String) cbxGeneroCli.getSelectedItem(), fechaNacimiento, (String) cbxEstadoCivilCli.getSelectedItem(),
                                        txtCedulaCli.getText(), txtPasswordCli.getText(), txtCorreoCli.getText(), Rol.CLIENTE);

                                cambiartabla();
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

    private void txtPasswordCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordCliActionPerformed

    private void cbxCiudadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCiudadCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCiudadCliActionPerformed

    public final void Clientebuscar() {

        Boolean encontrado = true;

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        Query cliente = BaseBD.query();
        cliente.constrain(Cliente.class);
        cliente.descend("cedula").constrain(BuscarCliente);
        ObjectSet<Cliente> resultado = cliente.execute();

        for (Cliente cli : resultado) {

            txtCedulaCli.setText(cli.getCedula());
            txtCedulaCli.setEnabled(false); // porque es el atributo principal
            txtPasswordCli.setText(cli.getPassword());
            txtNombresCli.setText(cli.getNombres());
            txtApellidosCli.setText(cli.getApellidos());
            txtDireccionCli.setText(cli.getDireccion());
            txtCorreoCli.setText(cli.getCorreo());
            txtCelularCli.setText(cli.getCelular());
            cbxCiudadCli.setSelectedItem(cli.getCiudad());
            cbxGeneroCli.setSelectedItem(cli.getGenero());
            cbxEstadoCivilCli.setSelectedItem(cli.getEstadoCivil());
            jDateFechaNacCli.setDate(convertirStringADate(cli.getFechaNacimiento()));

            // Mostrar la imagen
            byte[] imagen = cli.getImagenCli();
            if (imagen != null) {
                try {
                    ImageIcon icono = new ImageIcon(imagen);
                    // Verifica si el tamaño del JLabel está definido
                    int ancho = lblImagenCli.getWidth();
                    int alto = lblImagenCli.getHeight();

                    if (ancho > 0 && alto > 0) {
                        Image imagenEscalada = icono.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
                        lblImagenCli.setIcon(new ImageIcon(imagenEscalada));
                    } else {
                        // Puedes definir un tamaño por defecto
                        Image imagenEscalada = icono.getImage().getScaledInstance(180, 140, Image.SCALE_SMOOTH);
                        lblImagenCli.setIcon(new ImageIcon(imagenEscalada));
                    }

                    imagenCli = imagen; // Guardar la imagen en el campo de la clase
                } catch (Exception e) {
                    e.printStackTrace();
                    lblImagenCli.setIcon(null); // O puedes poner una imagen por defecto
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

    public void modificarCliente(Cliente.Estado estado, String ciudad, byte[] imagenCli, String cedula, String nombres, String apellidos, String direccion, String correo, String celular,
            String genero, String fechaNacimiento, String estadoCivil, String nombreUsuario, String password, String correoRecuperacion, Rol rol) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        Cliente modificarCliente = new Cliente(estado, ciudad, imagenCli, cedula, nombres, apellidos, direccion, correo, celular,
                genero, fechaNacimiento, estadoCivil, nombreUsuario, password, correoRecuperacion, rol);

        Cliente clienteBusca = new Cliente(null, null, null, cedula, null,
                null, null, null, null, null, null, null, null,
                null, null, null);

        ObjectSet resultado = BaseBD.get(clienteBusca);

        int coincidencias = resultado.size();

        if (coincidencias > 0) {

            Cliente clienteVEliminar = (Cliente) resultado.next();
            BaseBD.delete(clienteVEliminar);

            BaseBD.set(modificarCliente);
            JOptionPane.showMessageDialog(this, "Cliente Modificado");

        } else {
            JOptionPane.showMessageDialog(this, "No se encontro ningun Cliente");
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
    private javax.swing.JLabel Cedula_Cli;
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnModificar;
    private rojeru_san.RSButtonRiple btnSeleccionarImgen1;
    private javax.swing.JComboBox<String> cbxCiudadCli;
    private javax.swing.JComboBox<String> cbxEstadoCivilCli;
    private javax.swing.JComboBox<String> cbxGeneroCli;
    private com.toedter.calendar.JDateChooser jDateFechaNacCli;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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