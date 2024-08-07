package Vista.Catálogo;

import Conexion.Conexion_db;
import Models.Categoria;

import Models.Producto;
import Models.Proveedor;


import Vista.Menu.VistaMenu;
import Vista.Tables.TablaCategoria;

import Vista.Tables.TablaProductos;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.InvalidIDException;
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
        mostrarCombo();

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
        rSButtonGradiente1 = new rsbuttongradiente.RSButtonGradiente();

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
        jPanel1.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 230, 40));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 53, 79));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 100, 40));

        txtNombreProducto.setForeground(new java.awt.Color(0, 53, 79));
        txtNombreProducto.setColorTransparente(true);
        txtNombreProducto.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombreProducto.setPlaceholder("Escriba el nombre");
        jPanel1.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 230, 40));

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
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 230, 40));

        txtExistenciaMaxima.setForeground(new java.awt.Color(0, 53, 79));
        txtExistenciaMaxima.setColorTransparente(true);
        txtExistenciaMaxima.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtExistenciaMaxima.setPlaceholder("Existencia Minima");
        jPanel1.add(txtExistenciaMaxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 240, 40));

        txtProveedorID.setForeground(new java.awt.Color(0, 53, 79));
        txtProveedorID.setColorTransparente(true);
        txtProveedorID.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtProveedorID.setPlaceholder(" Escriba ID del prodevor");
        jPanel1.add(txtProveedorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 200, 40));

        txtPrecioProducto.setForeground(new java.awt.Color(0, 53, 79));
        txtPrecioProducto.setColorTransparente(true);
        txtPrecioProducto.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtPrecioProducto.setPlaceholder("Escriba el precio");
        jPanel1.add(txtPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 240, 40));

        txtNumeroProductos.setForeground(new java.awt.Color(0, 53, 79));
        txtNumeroProductos.setColorTransparente(true);
        txtNumeroProductos.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNumeroProductos.setPlaceholder("Numero de productos");
        jPanel1.add(txtNumeroProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 230, 40));

        lblExistenciaMinima1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblExistenciaMinima1.setForeground(new java.awt.Color(0, 53, 79));
        lblExistenciaMinima1.setText("Existencia minima:");
        jPanel1.add(lblExistenciaMinima1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        txtExistenciaMinima.setForeground(new java.awt.Color(0, 53, 79));
        txtExistenciaMinima.setColorTransparente(true);
        txtExistenciaMinima.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtExistenciaMinima.setPlaceholder("Existencia Minima");
        jPanel1.add(txtExistenciaMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 240, 40));

        jPanel1.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 130, 30));

        BtnBuscar.setBackground(new java.awt.Color(0, 204, 51));
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 80, 30));

        lblImagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 180, 140));

        btnSeleccionarImgen.setText("Selecionar Imagen");
        btnSeleccionarImgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarImgenActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionarImgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 180, -1));

        rSButtonGradiente1.setText("Añadir");
        rSButtonGradiente1.setColorPrimario(new java.awt.Color(0, 112, 192));
        rSButtonGradiente1.setColorSecundario(new java.awt.Color(51, 102, 255));
        rSButtonGradiente1.setColorSecundarioHover(new java.awt.Color(0, 102, 255));
        rSButtonGradiente1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rSButtonGradiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonGradiente1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private void btnModficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModficarActionPerformed
       if (validarCampos()) {
        modificarProducto(
            txtCodigoProducto.getText().toUpperCase(),
            txtNombreProducto.getText(),
            Double.parseDouble(txtPrecioProducto.getText()),
            cmbCategoria.getSelectedItem().toString().toUpperCase(),
            Integer.parseInt(txtNumeroProductos.getText()),
            Integer.parseInt(txtExistenciaMaxima.getText()),
            Integer.parseInt(txtExistenciaMinima.getText()),
            txtDescripcion.getText(),
            txtProveedorID.getText(),
            imagenProducto,
            Producto.Estado.ACTIVO
        );

        JOptionPane.showMessageDialog(this, "Producto Modificado");
        resetCampos();
    }

    }//GEN-LAST:event_btnModficarActionPerformed
    private boolean validarCampos() {
    if (txtNombreProducto.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese un nombre válido");
        return false;
    }
    if (txtDescripcion.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese una descripción válida");
        return false;
    }
    if (!txtPrecioProducto.getText().matches("\\d+(\\.\\d{1,2})?")) {
        JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos para el precio");
        return false;
    }
    if (!txtNumeroProductos.getText().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Ingrese un número de productos válido");
        return false;
    }
    if (!txtExistenciaMaxima.getText().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Ingrese una existencia máxima válida");
        return false;
    }
    if (!txtExistenciaMinima.getText().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Ingrese una existencia mínima válida");
        return false;
    }
    if (cmbCategoria.getSelectedIndex() == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione una categoría válida");
        return false;
    }
    return true;
}
    

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
            lblImagen.setText(""); // Limpiar el texto cuando se seleccione una imagen
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

    private void rSButtonGradiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonGradiente1ActionPerformed
        CrudCategoria cate = new CrudCategoria();
        MostrarpaneCruds(cate);
    }//GEN-LAST:event_rSButtonGradiente1ActionPerformed

// Método para verificar si un producto existe antes de guardar
    public static int verificarProductoGuardar(String codigo_Producto) {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Producto productoBusca = new Producto(codigo_Producto, null, null, null, 0, 0, 0, null, null, null, null);
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
        Producto productoBusca = new Producto(codigo_Producto, null, null, null, 0, 0, 0, null, null, null, null);
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

    private void buscarProducto() {
    Boolean encontrado = false;
    ObjectContainer BaseBD = Conexion_db.ConectarBD();
    Query productoQuery = BaseBD.query();
    productoQuery.constrain(Producto.class);
    productoQuery.descend("codigo_Producto").constrain(BuscarCodigo.toUpperCase());
    ObjectSet<Producto> resultado = productoQuery.execute();

    if (resultado.hasNext()) {
        Producto prod = resultado.next();
        txtCodigoProducto.setText(prod.getCodigo_Producto());
        txtNombreProducto.setText(prod.getNombre_Producto());
        txtPrecioProducto.setText(String.format("%.2f", prod.getPrecio_Producto()));
        cmbCategoria.setSelectedItem(prod.getCodigo_categoria_Producto());
        txtNumeroProductos.setText(String.valueOf(prod.getNumeroProductos_Producto()));
        txtExistenciaMaxima.setText(String.valueOf(prod.getExistenciaMaxima_Producto()));
        txtExistenciaMinima.setText(String.valueOf(prod.getExistenciaMinima_Producto()));
        txtDescripcion.setText(prod.getDescripcion_Producto());
        txtProveedorID.setText(prod.getID_Proveedor_Producto());

        byte[] imagen = prod.getImagen();
        if (imagen != null && imagen.length > 0) {
            ImageIcon icono = new ImageIcon(imagen);
            int ancho = lblImagen.getWidth();
            int alto = lblImagen.getHeight();
            if (ancho > 0 && alto > 0) {
                Image imagenEscalada = icono.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
                lblImagen.setIcon(new ImageIcon(imagenEscalada));
            } else {
                Image imagenEscalada = icono.getImage().getScaledInstance(180, 140, Image.SCALE_SMOOTH);
                lblImagen.setIcon(new ImageIcon(imagenEscalada));
            }
            this.imagenProducto = imagen; // Guardar la imagen en el campo de la clase
        } else {
            lblImagen.setIcon(null); // Restablecer la imagen a null
            lblImagen.setText("No image available"); // Establecer texto por defecto si no hay imagen
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
                JOptionPane.showMessageDialog(this, " Proveedor Añadido con exito");
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
    
   public static void modificarProducto(String codigo_Producto, String nombre_Producto, Double precio_Producto, String codigo_categoria_Producto, int numeroProductos_Producto, int existenciaMaxima_Producto, int existenciaMinima_Producto, String descripcion_Producto, String ID_Proveedor_Producto, byte[] imagen, Producto.Estado estado) {
    // ESTABLECER CONEXION CON LA BASE DE DATOS
    ObjectContainer BaseBD = Conexion_db.ConectarBD();

    // Crear el objeto con los datos nuevos
    Producto productoModificado = new Producto(codigo_Producto, nombre_Producto, precio_Producto, codigo_categoria_Producto, numeroProductos_Producto, existenciaMaxima_Producto, existenciaMinima_Producto, descripcion_Producto, ID_Proveedor_Producto, imagen, estado);

    // Buscar el objeto existente en la base de datos
    Producto productoBusca = new Producto(codigo_Producto, null, null, null, 0, 0, 0, null, null, null, null);
    ObjectSet resultado = BaseBD.get(productoBusca);
    int coincidencias = resultado.size();

    if (coincidencias > 0) {
        // Eliminar el objeto existente
        Producto productoAEliminar = (Producto) resultado.next();
        BaseBD.delete(productoAEliminar);
        
        // Guardar el nuevo objeto con los datos modificados
        BaseBD.set(productoModificado); 
    }

    // Cerrar la base de datos
    BaseBD.close();
    
}
   
    private void mostrarCombo() {
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        try {
            ObjectSet<Categoria> categorias = BaseBD.query(Categoria.class);
            for (Categoria categoria : categorias) {
                cmbCategoria.addItem(categoria.getNombreCat());
            }
        } catch (InvalidIDException e) {
            JOptionPane.showMessageDialog(this, "Error: ID inválido en la base de datos. " + e.getMessage());
        } finally {
            BaseBD.close();
        }
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
    private rsbuttongradiente.RSButtonGradiente rSButtonGradiente1;
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
