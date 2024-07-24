package Vista.Catálogo;

import Conexion.Conexion_db;
import Models.Categoria;

import Models.Producto;
import Models.Proveedor;


import Vista.Menu.VistaMenu;

import Vista.Tables.TablaProductos;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class BuscarProductos extends javax.swing.JPanel {
     private byte[] imagenProducto; // Añadir campo para la imagen
    private String BuscarCodigo;
    public BuscarProductos(String receivedString) {
        this.BuscarCodigo = receivedString;
        initComponents();
        buscarProducto();
        txtCodigoProducto.setEnabled(false);
      
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TablaProvedores = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        txtBuscar = new rojeru_san.RSMTextFull();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new rsbuttongradiente.RSButtonGradiente();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoProducto = new rojeru_san.RSMTextFull();
        jLabel4 = new javax.swing.JLabel();
        txtNombreProducto = new rojeru_san.RSMTextFull();
        btnCancelar = new rojeru_san.RSButtonRiple();
        btnModficar = new rojeru_san.RSButtonRiple();
        lblCodigooProducto = new javax.swing.JLabel();
        lblPrecioProducto = new javax.swing.JLabel();
        lblCodigoocategoria = new javax.swing.JLabel();
        lblNumeroProductos = new javax.swing.JLabel();
        lblExistenciaMinima = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblProveedorID = new javax.swing.JLabel();
        txtDescripcion = new rojeru_san.RSMTextFull();
        txtExistenciaMaxima = new rojeru_san.RSMTextFull();
        txtProveedorID = new rojeru_san.RSMTextFull();
        txtPrecioProducto = new rojeru_san.RSMTextFull();
        txtNumeroProductos = new rojeru_san.RSMTextFull();
        lblExistenciaMinima1 = new javax.swing.JLabel();
        txtExistenciaMinima = new rojeru_san.RSMTextFull();
        cmbCategoria = new javax.swing.JComboBox<>();
        BtnBuscar = new rojeru_san.RSButtonRiple();
        lblImagen = new javax.swing.JLabel();
        btnSeleccionarImgen = new rojeru_san.RSButtonRiple();

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        jLabel1.setText("Listado Proveedores");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tblProveedores.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProveedores);

        txtBuscar.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        txtBuscar.setPlaceholder("ejm: PROV12");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel3.setText("Buscar:");

        btnAgregar.setBackground(new java.awt.Color(51, 102, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setColorPrimario(new java.awt.Color(0, 204, 51));
        btnAgregar.setColorPrimarioHover(new java.awt.Color(0, 204, 51));
        btnAgregar.setColorSecundario(new java.awt.Color(153, 255, 153));
        btnAgregar.setColorSecundarioHover(new java.awt.Color(204, 255, 204));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout TablaProvedoresLayout = new javax.swing.GroupLayout(TablaProvedores.getContentPane());
        TablaProvedores.getContentPane().setLayout(TablaProvedoresLayout);
        TablaProvedoresLayout.setHorizontalGroup(
            TablaProvedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
            .addGroup(TablaProvedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TablaProvedoresLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        TablaProvedoresLayout.setVerticalGroup(
            TablaProvedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
            .addGroup(TablaProvedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TablaProvedoresLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Modificar Productos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 330, 40));

        txtCodigoProducto.setForeground(new java.awt.Color(0, 53, 79));
        txtCodigoProducto.setColorTransparente(true);
        txtCodigoProducto.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCodigoProducto.setPlaceholder("Código");
        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 200, 40));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 53, 79));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 100, 40));

        txtNombreProducto.setForeground(new java.awt.Color(0, 53, 79));
        txtNombreProducto.setColorTransparente(true);
        txtNombreProducto.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombreProducto.setPlaceholder("Escriba el nombre");
        jPanel1.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 200, 40));

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, -1, -1));

        btnModficar.setText("Modficar");
        btnModficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModficarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, -1, -1));

        lblCodigooProducto.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblCodigooProducto.setForeground(new java.awt.Color(0, 53, 79));
        lblCodigooProducto.setText("Código:");
        jPanel1.add(lblCodigooProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        lblPrecioProducto.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblPrecioProducto.setForeground(new java.awt.Color(0, 53, 79));
        lblPrecioProducto.setText("Precio:");
        jPanel1.add(lblPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        lblCodigoocategoria.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblCodigoocategoria.setForeground(new java.awt.Color(0, 53, 79));
        lblCodigoocategoria.setText("Código de categoría:");
        jPanel1.add(lblCodigoocategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        lblNumeroProductos.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblNumeroProductos.setForeground(new java.awt.Color(0, 53, 79));
        lblNumeroProductos.setText("Numero de productos:");
        jPanel1.add(lblNumeroProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        lblExistenciaMinima.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblExistenciaMinima.setForeground(new java.awt.Color(0, 53, 79));
        lblExistenciaMinima.setText("Existencia maxima:");
        jPanel1.add(lblExistenciaMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        lblDescripcion.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 53, 79));
        lblDescripcion.setText("Descripción:");
        jPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        lblProveedorID.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblProveedorID.setForeground(new java.awt.Color(0, 53, 79));
        lblProveedorID.setText("ID proveedor:");
        jPanel1.add(lblProveedorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        txtDescripcion.setForeground(new java.awt.Color(0, 53, 79));
        txtDescripcion.setColorTransparente(true);
        txtDescripcion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDescripcion.setPlaceholder("Descripción");
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 200, 40));

        txtExistenciaMaxima.setForeground(new java.awt.Color(0, 53, 79));
        txtExistenciaMaxima.setColorTransparente(true);
        txtExistenciaMaxima.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtExistenciaMaxima.setPlaceholder("Existencia Minima");
        jPanel1.add(txtExistenciaMaxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 190, 40));

        txtProveedorID.setForeground(new java.awt.Color(0, 53, 79));
        txtProveedorID.setColorTransparente(true);
        txtProveedorID.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtProveedorID.setPlaceholder(" Escriba ID del prodevor");
        jPanel1.add(txtProveedorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 200, 40));

        txtPrecioProducto.setForeground(new java.awt.Color(0, 53, 79));
        txtPrecioProducto.setColorTransparente(true);
        txtPrecioProducto.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtPrecioProducto.setPlaceholder("Escriba el precio");
        txtPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 200, 40));

        txtNumeroProductos.setForeground(new java.awt.Color(0, 53, 79));
        txtNumeroProductos.setColorTransparente(true);
        txtNumeroProductos.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNumeroProductos.setPlaceholder("Numero de productos");
        jPanel1.add(txtNumeroProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 180, 40));

        lblExistenciaMinima1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblExistenciaMinima1.setForeground(new java.awt.Color(0, 53, 79));
        lblExistenciaMinima1.setText("Existencia minima:");
        jPanel1.add(lblExistenciaMinima1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        txtExistenciaMinima.setForeground(new java.awt.Color(0, 53, 79));
        txtExistenciaMinima.setColorTransparente(true);
        txtExistenciaMinima.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtExistenciaMinima.setPlaceholder("Existencia Minima");
        jPanel1.add(txtExistenciaMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 190, 40));

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 200, 30));

        BtnBuscar.setBackground(new java.awt.Color(0, 204, 51));
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 80, 30));

        lblImagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 180, 140));

        btnSeleccionarImgen.setText("Selecionar Imagen");
        btnSeleccionarImgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarImgenActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionarImgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        TablaProductos tblpro = new TablaProductos();
        MostrarpaneCruds(tblpro);
    }//GEN-LAST:event_btnCancelarMouseClicked
    private void MostrarpaneCruds(JPanel p) {
        p.setSize(870, 630);
        p.setLocation(0, 0);
        VistaMenu.PanelPrincipal.removeAll();
        VistaMenu.PanelPrincipal.add(p, BorderLayout.CENTER);
        VistaMenu.PanelPrincipal.revalidate();
        VistaMenu.PanelPrincipal.repaint();
    }
    private void txtPrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioProductoActionPerformed

    }//GEN-LAST:event_txtPrecioProductoActionPerformed

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoActionPerformed

    }//GEN-LAST:event_txtCodigoProductoActionPerformed

    private void btnModficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModficarActionPerformed
        // Validar campos de texto
        if (txtNombreProducto.getText().trim().isBlank()) {
            JOptionPane.showMessageDialog(this, "No deje espacios en blanco en el nombre del producto");
            return;
        }
        if (txtDescripcion.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "No deje espacios en blanco en la descripción del producto");
            return;
        }

        // Validar campos numéricos
        if (!txtPrecioProducto.getText().matches("\\d+(\\.\\d{1,2})?")) {
            JOptionPane.showMessageDialog(this, "Ingrese un precio válido (ejemplo: 10.99)");
            return;
        }
        if (!txtNumeroProductos.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Ingrese un número de productos válido");
            return;
        }
        if (!txtExistenciaMaxima.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Ingrese una existencia máxima válida");
            return;
        }
        if (!txtExistenciaMinima.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Ingrese una existencia mínima válida");
            return;
        }

        // Validar que se haya seleccionado una categoría del JComboBox
        if (cmbCategoria.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una categoría válida");
            return;
        }

        // Convertir campos de texto a tipos numéricos
        Double precioProducto = Double.parseDouble(txtPrecioProducto.getText());
        int numeroProductosProducto = Integer.parseInt(txtNumeroProductos.getText());
        int existenciaMaximaProducto = Integer.parseInt(txtExistenciaMaxima.getText());
        int existenciaMinimaProducto = Integer.parseInt(txtExistenciaMinima.getText());

        // Obtener la categoría seleccionada del JComboBox
        String categoriaSeleccionada = (String) cmbCategoria.getSelectedItem();

        // Llamar al método modificarProducto
        modificarProducto(
            txtCodigoProducto.getText().toUpperCase(),
            txtNombreProducto.getText(),
            precioProducto,
            categoriaSeleccionada.toUpperCase(), // Usar la categoría seleccionada
            numeroProductosProducto,
            existenciaMaximaProducto,
            existenciaMinimaProducto,
            txtDescripcion.getText(),
            txtProveedorID.getText(),
            imagenProducto, // Incluir la imagen
            Producto.Estado.ACTIVO
        );

        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "Producto Modificado");

        // Limpiar campos y actualizar la tabla
        resetCampos();
    
    }//GEN-LAST:event_btnModficarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        activarJdialog(TablaProvedores);
    }//GEN-LAST:event_BtnBuscarActionPerformed

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
                imagenProducto = leerImagen(archivoImagen);

                // Mostrar la imagen en el label
                Image mImagen = new ImageIcon(Ruta).getImage();
                ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
                lblImagen.setIcon(mIcono);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al leer la imagen: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnSeleccionarImgenActionPerformed
 


    private byte[] leerImagen(File archivoImagen) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream(); FileInputStream fis = new FileInputStream(archivoImagen)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        mostrarNombreProveedor();
    }//GEN-LAST:event_btnAgregarActionPerformed
   // Método para modificar producto
// Método para modificar producto
    public static void modificarProducto(String codigo_Producto, String nombre_Producto, Double precio_Producto, String codigo_categoria_Producto, int numeroProductos_Producto, int existenciaMaxima_Producto, int existenciaMinima_Producto, String descripcion_Producto, String ID_Proveedor_Producto, byte[] imagen, Producto.Estado estado) {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        // Buscar el objeto existente en la base de datos
        Producto productoBusca = new Producto(codigo_Producto, null, null, null, 0, 0, 0, null, null, null, null);
        ObjectSet<Producto> resultado = BaseBD.get(productoBusca);

        if (resultado.size() > 0) {
            // Actualizar el objeto existente
            Producto productoExistente = resultado.next();

            // Actualizar campos del objeto existente con los nuevos valores
            productoExistente.setNombre_Producto(nombre_Producto);
            productoExistente.setPrecio_Producto(precio_Producto);
            productoExistente.setCodigo_categoria_Producto(codigo_categoria_Producto);
            productoExistente.setNumeroProductos_Producto(numeroProductos_Producto);
            productoExistente.setExistenciaMaxima_Producto(existenciaMaxima_Producto);
            productoExistente.setExistenciaMinima_Producto(existenciaMinima_Producto);
            productoExistente.setDescripcion_Producto(descripcion_Producto);
            productoExistente.setID_Proveedor_Producto(ID_Proveedor_Producto);
            productoExistente.setImagen(imagen); // Actualizar la imagen

            // Guardar los cambios en la base de datos
            BaseBD.store(productoExistente);

        } else {
            System.out.println("No se encontró ningún producto con el código especificado.");
        }

        // Cerrar la base de datos
        BaseBD.close();
    }
// Método para verificar si un producto existe antes de guardar
public static int verificarProductoGuardar(String codigo_Producto) {
    // ESTABLECER CONEXION CON LA BASE DE DATOS
    ObjectContainer BaseBD = Conexion_db.ConectarBD();
    Producto productoBusca = new Producto(codigo_Producto, null, null, null, 0, 0, 0, null, null,null,null);
    ObjectSet resultado = BaseBD.get(productoBusca);
    int coincidencias = resultado.size();
    // Cerrar la base de datos
    BaseBD.close();
    return coincidencias;
}
// Método para verificar si un producto existe
public static int verificarProducto(String codigo_Producto) {
    // ESTABLECER CONEXION CON LA BASE DE DATOS
    ObjectContainer BaseBD = Conexion_db.ConectarBD();
    Producto productoBusca = new Producto(codigo_Producto, null, null, null, 0, 0, 0, null, null,null,null);
    ObjectSet resultado = BaseBD.get(productoBusca);
    int coincidencias = resultado.size();
    // Cerrar la base de datos
    BaseBD.close();
    return coincidencias;
}

   
  private void resetCampos() {
    txtCodigoProducto.setText("");
    txtNombreProducto.setText("");
    txtPrecioProducto.setText("");    
    txtNumeroProductos.setText("");
    txtExistenciaMaxima.setText("");
    txtExistenciaMinima.setText("");
    txtDescripcion.setText("");
    txtProveedorID.setText("");
    cmbCategoria.setSelectedIndex(-1); 
    txtNombreProducto.setEnabled(true);
    lblImagen.setIcon(null);  // Restablecer la imagen a null
    lblImagen.setText("No image available"); // Establecer texto por defecto si no hay imagen
}
public final void buscarProducto() {
    Boolean encontrado = false;
        // ESTABLECER CONEXIÓN CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Query productoQuery = BaseBD.query(); // método para iniciar una consulta
        productoQuery.constrain(Producto.class); // buscaremos en la clase Producto
        productoQuery.descend("codigo_Producto").constrain(BuscarCodigo.toUpperCase()); // verificamos las coincidencias en el atributo especificado
        ObjectSet<Producto> resultado = productoQuery.execute(); // Ejecutamos la consulta y almacenamos en "resultado"

        // Iterar sobre los resultados para obtener los atributos
        if (resultado.hasNext()) {
            Producto prod = resultado.next(); // Obtener el primer resultado
            // Seteamos en los campos recibiendo del objeto
            txtCodigoProducto.setText(prod.getCodigo_Producto());
            txtNombreProducto.setText(prod.getNombre_Producto());
            txtPrecioProducto.setText(String.format("%.2f", prod.getPrecio_Producto()));
            txtNumeroProductos.setText(String.valueOf(prod.getNumeroProductos_Producto()));
            txtExistenciaMaxima.setText(String.valueOf(prod.getExistenciaMaxima_Producto()));
            txtExistenciaMinima.setText(String.valueOf(prod.getExistenciaMinima_Producto()));
            txtDescripcion.setText(prod.getDescripcion_Producto());
            txtProveedorID.setText(prod.getID_Proveedor_Producto());
            cmbCategoria.setSelectedItem(prod.getCodigo_categoria_Producto()); // Seleccionar la categoría en el JComboBox

            // Mostrar la imagen
            byte[] imagen = prod.getImagen();
            if (imagen != null) {
                ImageIcon icono = new ImageIcon(new ImageIcon(imagen).getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
                lblImagen.setIcon(icono);
                imagenProducto = imagen; // Guardar la imagen en el campo de la clase
            }

            txtNombreProducto.setEnabled(true);
            encontrado = true;
            JOptionPane.showMessageDialog(this, "PRODUCTO ENCONTRADO");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el Producto");
        }

        BaseBD.close();
}
private void activarJdialog(JDialog TablaProvedores) {

        TablaProvedores.setTitle("Listado Provedores");
        TablaProvedores.setSize(680, 330);
        TablaProvedores.setLocationRelativeTo(this);
        TablaProvedores.setVisible(true);
    }
    private void mostrarNombreProveedor() {
        // Establecer conexión con la base de datos
        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        // Crear un objeto de consulta para buscar proveedores
        Query proveedorQuery = BaseBD.query();
        proveedorQuery.constrain(Proveedor.class);
        ObjectSet<Proveedor> resultado = proveedorQuery.execute();

        boolean encontrado = false;
        String inputCodigo = txtBuscar.getText().trim();

        // Iterar sobre los resultados para encontrar y cargar el nombre del proveedor
        for (Proveedor miProveedor : resultado) {
            String codigoProveedor = miProveedor.getCodigo_proveedor().trim();

            if (codigoProveedor.equals(inputCodigo)) {
                txtProveedorID.setText(miProveedor.getNombre_proveedor());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "No se encontró Proveedor");
        }

        // Cerrar la conexión con la base de datos
        BaseBD.close();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple BtnBuscar;
    private javax.swing.JDialog TablaProvedores;
    private rsbuttongradiente.RSButtonGradiente btnAgregar;
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnModficar;
    private rojeru_san.RSButtonRiple btnSeleccionarImgen;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigooProducto;
    private javax.swing.JLabel lblCodigoocategoria;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblExistenciaMinima;
    private javax.swing.JLabel lblExistenciaMinima1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNumeroProductos;
    private javax.swing.JLabel lblPrecioProducto;
    private javax.swing.JLabel lblProveedorID;
    private javax.swing.JTable tblProveedores;
    private rojeru_san.RSMTextFull txtBuscar;
    private rojeru_san.RSMTextFull txtCodigoProducto;
    private rojeru_san.RSMTextFull txtDescripcion;
    private rojeru_san.RSMTextFull txtExistenciaMaxima;
    private rojeru_san.RSMTextFull txtExistenciaMinima;
    private rojeru_san.RSMTextFull txtNombreProducto;
    private rojeru_san.RSMTextFull txtNumeroProductos;
    private rojeru_san.RSMTextFull txtPrecioProducto;
    private rojeru_san.RSMTextFull txtProveedorID;
    // End of variables declaration//GEN-END:variables
}
