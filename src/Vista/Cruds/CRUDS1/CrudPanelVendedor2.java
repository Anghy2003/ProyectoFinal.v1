package Vista.Cruds.CRUDS1;

import Conexion.Conexion_db;
import Models.Ciudad;
import Models.Persona;
import Models.Persona.Rol;
import Models.Vendedor;
import Models.Vendedor.Estado;
import Vista.Menu.VistaMenu;
import Vista.Tables.TablaVendedores;
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
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CrudPanelVendedor2 extends javax.swing.JPanel {

    private byte[] imagenVende;
    private String BuscarVendedor;

    public CrudPanelVendedor2(String receivedString) {
        this.BuscarVendedor = receivedString;
        initComponents();
        Vendedorbuscar();
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
        jDateFechaNacVende.setMaxSelectableDate(fechaMaxima);
        jDateFechaNacVende.setMinSelectableDate(null); // Si no deseas establecer una fecha mínima, puedes dejar esto como null
    }

    private void mostrarComboCiudad() {
        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        Query ciudadbox = BaseBD.query();
        ciudadbox.constrain(Ciudad.class);
        ObjectSet<Ciudad> resultado = ciudadbox.execute();

        for (Ciudad ciudad : resultado) {
            cbxCiudadVende.addItem(ciudad.getCiudad());
        }

        BaseBD.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new rojeru_san.RSButtonRiple();
        btnModificar = new rojeru_san.RSButtonRiple();
        lblImagenVende = new javax.swing.JLabel();
        btnSeleccionarImgen1 = new rojeru_san.RSButtonRiple();
        CedulaVende = new javax.swing.JLabel();
        txtCedulaVende = new rojeru_san.RSMTextFull();
        lblPasswordVende = new javax.swing.JLabel();
        txtPasswordVende = new rojeru_san.RSMPassView();
        lblNombresVende = new javax.swing.JLabel();
        txtNombresVende = new rojeru_san.RSMTextFull();
        lblApellidosVende = new javax.swing.JLabel();
        txtApellidosVende = new rojeru_san.RSMTextFull();
        lblDireccionVende = new javax.swing.JLabel();
        txtDireccionVende = new rojeru_san.RSMTextFull();
        lblCorreoVende = new javax.swing.JLabel();
        txtCorreoVende = new rojeru_san.RSMTextFull();
        lblCelularVende = new javax.swing.JLabel();
        txtCelularVende = new rojeru_san.RSMTextFull();
        lblCiudadVende = new javax.swing.JLabel();
        cbxCiudadVende = new javax.swing.JComboBox<>();
        lblFEchaNacVende = new javax.swing.JLabel();
        jDateFechaNacVende = new com.toedter.calendar.JDateChooser();
        lblEstadoCivilVende = new javax.swing.JLabel();
        cbxGeneroVende = new javax.swing.JComboBox<>();
        lblGeneroVende = new javax.swing.JLabel();
        cbxEstadoCivilVende = new javax.swing.JComboBox<>();
        lblComicionesVende = new javax.swing.JLabel();
        txtComicionesVende = new rojeru_san.RSMTextFull();
        lblNumeroVentasVende = new javax.swing.JLabel();
        txtNumeroVentasVende = new rojeru_san.RSMTextFull();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Buscar/Modificar Vendedor");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 370, 40));

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
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, -1, -1));

        lblImagenVende.setToolTipText("SOLO JPG");
        lblImagenVende.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(lblImagenVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 180, 140));

        btnSeleccionarImgen1.setText("Selecionar Imagen");
        btnSeleccionarImgen1.setToolTipText("SOLO JPG");
        btnSeleccionarImgen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarImgen1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeleccionarImgen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 180, -1));

        CedulaVende.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        CedulaVende.setForeground(new java.awt.Color(0, 53, 79));
        CedulaVende.setText("Usuario/Cédula:");
        jPanel2.add(CedulaVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 150, 40));

        txtCedulaVende.setForeground(new java.awt.Color(0, 53, 79));
        txtCedulaVende.setColorTransparente(true);
        txtCedulaVende.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCedulaVende.setPlaceholder("0123456789");
        jPanel2.add(txtCedulaVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 220, 40));

        lblPasswordVende.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblPasswordVende.setForeground(new java.awt.Color(0, 53, 79));
        lblPasswordVende.setText("Contraseña:");
        jPanel2.add(lblPasswordVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, 40));

        txtPasswordVende.setForeground(new java.awt.Color(0, 53, 79));
        txtPasswordVende.setOpaque(false);
        txtPasswordVende.setPlaceholder("Digite su Contraseña");
        txtPasswordVende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordVendeActionPerformed(evt);
            }
        });
        jPanel2.add(txtPasswordVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 220, 40));

        lblNombresVende.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblNombresVende.setForeground(new java.awt.Color(0, 53, 79));
        lblNombresVende.setText("Nombres:");
        jPanel2.add(lblNombresVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 90, 40));

        txtNombresVende.setForeground(new java.awt.Color(0, 53, 79));
        txtNombresVende.setColorTransparente(true);
        txtNombresVende.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombresVende.setPlaceholder("Yins Yan");
        jPanel2.add(txtNombresVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 220, 40));

        lblApellidosVende.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblApellidosVende.setForeground(new java.awt.Color(0, 53, 79));
        lblApellidosVende.setText("Apellidos:");
        jPanel2.add(lblApellidosVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 90, 40));

        txtApellidosVende.setForeground(new java.awt.Color(0, 53, 79));
        txtApellidosVende.setColorTransparente(true);
        txtApellidosVende.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtApellidosVende.setPlaceholder("Yins Yan");
        jPanel2.add(txtApellidosVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 220, 40));

        lblDireccionVende.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblDireccionVende.setForeground(new java.awt.Color(0, 53, 79));
        lblDireccionVende.setText("Dirección:");
        jPanel2.add(lblDireccionVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, 40));

        txtDireccionVende.setForeground(new java.awt.Color(0, 53, 79));
        txtDireccionVende.setColorTransparente(true);
        txtDireccionVende.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDireccionVende.setPlaceholder("Octavio Chacon");
        jPanel2.add(txtDireccionVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 220, 40));

        lblCorreoVende.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCorreoVende.setForeground(new java.awt.Color(0, 53, 79));
        lblCorreoVende.setText("Correo Electrónico:");
        jPanel2.add(lblCorreoVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 190, 40));

        txtCorreoVende.setForeground(new java.awt.Color(0, 53, 79));
        txtCorreoVende.setColorTransparente(true);
        txtCorreoVende.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCorreoVende.setPlaceholder("Yins_Yan@tecazuay.com");
        jPanel2.add(txtCorreoVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 220, 40));

        lblCelularVende.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCelularVende.setForeground(new java.awt.Color(0, 53, 79));
        lblCelularVende.setText("Celular:");
        jPanel2.add(lblCelularVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, -1, 40));

        txtCelularVende.setForeground(new java.awt.Color(0, 53, 79));
        txtCelularVende.setColorTransparente(true);
        txtCelularVende.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCelularVende.setPlaceholder("0960188019");
        jPanel2.add(txtCelularVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 220, 40));

        lblCiudadVende.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCiudadVende.setForeground(new java.awt.Color(0, 53, 79));
        lblCiudadVende.setText("Ciudad:");
        jPanel2.add(lblCiudadVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 80, 30));

        cbxCiudadVende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCiudadVendeActionPerformed(evt);
            }
        });
        jPanel2.add(cbxCiudadVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 220, 30));

        lblFEchaNacVende.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblFEchaNacVende.setForeground(new java.awt.Color(0, 53, 79));
        lblFEchaNacVende.setText("Fecha Nacimiento:");
        jPanel2.add(lblFEchaNacVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 180, 40));
        jPanel2.add(jDateFechaNacVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 220, 30));

        lblEstadoCivilVende.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblEstadoCivilVende.setForeground(new java.awt.Color(0, 53, 79));
        lblEstadoCivilVende.setText("Estado Civil:");
        jPanel2.add(lblEstadoCivilVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 120, 40));

        cbxGeneroVende.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero/a", "Casado/a", "Divorciado/a", "Viudo/a", "Union Libre" }));
        jPanel2.add(cbxGeneroVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 220, 30));

        lblGeneroVende.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblGeneroVende.setForeground(new java.awt.Color(0, 53, 79));
        lblGeneroVende.setText("Género:");
        jPanel2.add(lblGeneroVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 80, 40));

        cbxEstadoCivilVende.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel2.add(cbxEstadoCivilVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 220, 30));

        lblComicionesVende.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblComicionesVende.setForeground(new java.awt.Color(0, 53, 79));
        lblComicionesVende.setText("Comisiones:");
        jPanel2.add(lblComicionesVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 120, 40));

        txtComicionesVende.setForeground(new java.awt.Color(0, 53, 79));
        txtComicionesVende.setColorTransparente(true);
        txtComicionesVende.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtComicionesVende.setPlaceholder("$10 por venta");
        jPanel2.add(txtComicionesVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 230, 40));

        lblNumeroVentasVende.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblNumeroVentasVende.setForeground(new java.awt.Color(0, 53, 79));
        lblNumeroVentasVende.setText("Numero Ventas:");
        jPanel2.add(lblNumeroVentasVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 160, 40));

        txtNumeroVentasVende.setForeground(new java.awt.Color(0, 53, 79));
        txtNumeroVentasVende.setColorTransparente(true);
        txtNumeroVentasVende.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNumeroVentasVende.setPlaceholder("Por mes");
        jPanel2.add(txtNumeroVentasVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 230, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 448, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 448, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 325, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 325, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
private double calcularSueldoTotal(double sueldoBase, double comisiones, int numeroVentas) {
        return sueldoBase + (comisiones * numeroVentas);
    }
    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

    }//GEN-LAST:event_btnCancelarMouseClicked
    public void cambiartabla() {
        TablaVendedores tblvende = new TablaVendedores();
        ShowpanelCruds(tblvende);
    }
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        if (txtCedulaVende.getText().isEmpty()
                || txtNombresVende.getText().isEmpty()
                || txtApellidosVende.getText().isEmpty()
                || txtCorreoVende.getText().isEmpty()
                || txtCelularVende.getText().isEmpty()
                
                || txtComicionesVende.getText().isEmpty()
                || txtNumeroVentasVende.getText().isEmpty()
                || txtDireccionVende.getText().isEmpty()
                || txtPasswordVende.getText().isEmpty()
                || jDateFechaNacVende.getDate() == null) {

            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return; // Detener la ejecución si algún campo está vacío
        }

        Boolean valido = true;

        Date fechaNacimientoDate = jDateFechaNacVende.getDate(); // Obtener la fecha de nacimiento del JDateChooser

        // Formatear la fecha como String en el formato deseado (por ejemplo, "dd/MM/yyyy")
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaNacimiento = sdf.format(fechaNacimientoDate);

        if (Persona.validarCedula(txtCedulaVende.getText())) {
            if (valido = txtNombresVende.getText().toUpperCase().matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)?$")) {
                if (valido = txtApellidosVende.getText().toUpperCase().matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)?$")) {

                    if (valido = txtCorreoVende.getText().matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
                        if (valido = txtCelularVende.getText().matches("^09\\d{8}$")) {
                            if (valido = txtComicionesVende.getText().matches("^[0-9]*\\.?[0-9]+$")) {
                                if (valido = txtNumeroVentasVende.getText().matches("^[0-9]+$")) {

                                    if (imagenVende == null) {
                                        try {
                                            File imagenPredeterminada = new File("C:\\BasedeDatos\\defectousuario\\imagenDefecto.jpg");
                                            imagenVende = leerImagen(imagenPredeterminada);
                                        } catch (IOException e) {
                                            JOptionPane.showMessageDialog(null, "Error al cargar la imagen predeterminada: " + e.getMessage());
                                        }
                                    }

                                    double sueldo = 465; // Sueldo base
                                    double comisiones = Double.parseDouble(txtComicionesVende.getText());
                                    int numeroVentas = Integer.parseInt(txtNumeroVentasVende.getText());
                                    double sueldoTotal = calcularSueldoTotal(sueldo, comisiones, numeroVentas);

                                    modificarVendedor(sueldoTotal, comisiones, numeroVentas, Estado.ACTIVO,
                                            (String) cbxCiudadVende.getSelectedItem(), imagenVende, txtCedulaVende.getText(), txtNombresVende.getText().toUpperCase(), txtApellidosVende.getText().toUpperCase(), txtDireccionVende.getText().toUpperCase(),
                                            txtCorreoVende.getText(), txtCelularVende.getText(), (String) cbxGeneroVende.getSelectedItem(), fechaNacimiento, (String) cbxEstadoCivilVende.getSelectedItem(),
                                            txtCedulaVende.getText(), txtPasswordVende.getText(), txtCorreoVende.getText(), Rol.VENDEDOR);

                                    cambiartabla();

                                } else {
                                    JOptionPane.showMessageDialog(null, "Ingrese un número de ventas válido (solo números enteros)");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Ingrese un valor de comisiones válido (números enteros o decimales)");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Ingrese un celular válido");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese un correo válido");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un apellido válido");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un nombre válido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una cédula válida");
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
                imagenVende = leerImagen(archivoImagen);

                // Mostrar la imagen en el label
                Image mImagen = new ImageIcon(Ruta).getImage();
                ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lblImagenVende.getWidth(), lblImagenVende.getHeight(), Image.SCALE_SMOOTH));
                lblImagenVende.setIcon(mIcono);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al leer la imagen: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnSeleccionarImgen1ActionPerformed

    private void txtPasswordVendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordVendeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordVendeActionPerformed

    private void cbxCiudadVendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCiudadVendeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCiudadVendeActionPerformed

    ////transforma la imagen en bytes
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

    public final void Vendedorbuscar() {

        Boolean encontrado = true;

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        Query vendedor = BaseBD.query();
        vendedor.constrain(Vendedor.class);
        vendedor.descend("cedula").constrain(BuscarVendedor);
        ObjectSet<Vendedor> resultado = vendedor.execute();

        for (Vendedor vende : resultado) {

            txtCedulaVende.setText(vende.getCedula());
            txtCedulaVende.setEnabled(false); // porque es el atributo principal
            txtPasswordVende.setText(vende.getPassword());
            txtNombresVende.setText(vende.getNombres());
            txtApellidosVende.setText(vende.getApellidos());
            txtDireccionVende.setText(vende.getDireccion());
            txtCorreoVende.setText(vende.getCorreo());
            txtCelularVende.setText(vende.getCelular());
            cbxCiudadVende.setSelectedItem(vende.getCiudad());
            cbxGeneroVende.setSelectedItem(vende.getGenero());
            cbxEstadoCivilVende.setSelectedItem(vende.getEstadoCivil());
            txtComicionesVende.setText(String.valueOf(vende.getComiciones_Vendedor()));
            txtNumeroVentasVende.setText(String.valueOf(vende.getNumeroVentas_Vendedor()));
            jDateFechaNacVende.setDate(convertirStringADate(vende.getFechaNacimiento()));
            // Mostrar la imagen
            byte[] imagen = vende.getImagenVende();
            if (imagen != null) {
                try {
                    ImageIcon icono = new ImageIcon(imagen);
                    // Verifica si el tamaño del JLabel está definido
                    int ancho = lblImagenVende.getWidth();
                    int alto = lblImagenVende.getHeight();

                    if (ancho > 0 && alto > 0) {
                        Image imagenEscalada = icono.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
                        lblImagenVende.setIcon(new ImageIcon(imagenEscalada));
                    } else {
                        // Puedes definir un tamaño por defecto
                        Image imagenEscalada = icono.getImage().getScaledInstance(180, 140, Image.SCALE_SMOOTH);
                        lblImagenVende.setIcon(new ImageIcon(imagenEscalada));
                    }

                    imagenVende = imagen; // Guardar la imagen en el campo de la clase
                } catch (Exception e) {
                    e.printStackTrace();
                    lblImagenVende.setIcon(null); // O puedes poner una imagen por defecto
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

    public void modificarVendedor(double sueldoBase_Vendedor, double comiciones_Vendedor, int numeroVentas_Vendedor, Vendedor.Estado estado, String ciudad, byte[] imagenVende, String cedula,
            String nombres, String apellidos, String direccion, String correo, String celular, String genero,
            String fechaNacimiento, String estadoCivil, String nombreUsuario, String password, String correoRecuperacion, Rol rol) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        Vendedor modificarVendedor = new Vendedor(sueldoBase_Vendedor, comiciones_Vendedor, numeroVentas_Vendedor, estado, ciudad, imagenVende, cedula,
                nombres, apellidos, direccion, correo, celular, genero,
                fechaNacimiento, estadoCivil, nombreUsuario, password, correoRecuperacion, rol);

        Vendedor vendedorBusca = new Vendedor(0.0, 0.0, 0, null, null, null, cedula, null,
                null, null, null, null, null, null, null, null,
                null, null, null);

        ObjectSet resultado = BaseBD.get(vendedorBusca);

        int coincidencias = resultado.size();

        if (coincidencias > 0) {

            Vendedor vendedorVEliminar = (Vendedor) resultado.next();
            BaseBD.delete(vendedorVEliminar);

            BaseBD.set(modificarVendedor);
            JOptionPane.showMessageDialog(this, "Vendedor Modificado");

            TablaVendedores miTablaVendedored = new TablaVendedores();
            ShowpanelCruds(miTablaVendedored);

        } else {
            JOptionPane.showMessageDialog(this, "No se encontro ningun Vendedor");
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
    private javax.swing.JLabel CedulaVende;
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnModificar;
    private rojeru_san.RSButtonRiple btnSeleccionarImgen1;
    private javax.swing.JComboBox<String> cbxCiudadVende;
    private javax.swing.JComboBox<String> cbxEstadoCivilVende;
    private javax.swing.JComboBox<String> cbxGeneroVende;
    private com.toedter.calendar.JDateChooser jDateFechaNacVende;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblApellidosVende;
    private javax.swing.JLabel lblCelularVende;
    private javax.swing.JLabel lblCiudadVende;
    private javax.swing.JLabel lblComicionesVende;
    private javax.swing.JLabel lblCorreoVende;
    private javax.swing.JLabel lblDireccionVende;
    private javax.swing.JLabel lblEstadoCivilVende;
    private javax.swing.JLabel lblFEchaNacVende;
    private javax.swing.JLabel lblGeneroVende;
    private javax.swing.JLabel lblImagenVende;
    private javax.swing.JLabel lblNombresVende;
    private javax.swing.JLabel lblNumeroVentasVende;
    private javax.swing.JLabel lblPasswordVende;
    private rojeru_san.RSMTextFull txtApellidosVende;
    private rojeru_san.RSMTextFull txtCedulaVende;
    private rojeru_san.RSMTextFull txtCelularVende;
    private rojeru_san.RSMTextFull txtComicionesVende;
    private rojeru_san.RSMTextFull txtCorreoVende;
    private rojeru_san.RSMTextFull txtDireccionVende;
    private rojeru_san.RSMTextFull txtNombresVende;
    private rojeru_san.RSMTextFull txtNumeroVentasVende;
    private rojeru_san.RSMPassView txtPasswordVende;
    // End of variables declaration//GEN-END:variables
}