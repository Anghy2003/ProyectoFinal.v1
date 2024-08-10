package Vista.Catálogo;

import Conexion.Conexion_db;
import Models.Categoria;
;
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

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;



public class CrudProductos extends javax.swing.JPanel {

    private byte[] imagenProducto;

    public CrudProductos() {
        initComponents();
        mostrarCombo();
        mostrarDatos();
        mostrarDatospro();

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
        jLabel4 = new javax.swing.JLabel();
        txtNombreProducto = new rojeru_san.RSMTextFull();
        btnCancelar = new rojeru_san.RSButtonRiple();
        btnGuardar = new rojeru_san.RSButtonRiple();
        lblPrecioProducto = new javax.swing.JLabel();
        lblCodigoocategoria = new javax.swing.JLabel();
        lblNumeroProductos = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblProveedorID = new javax.swing.JLabel();
        txtDescripcion = new rojeru_san.RSMTextFull();
        txtExistenciaMaxima = new rojeru_san.RSMTextFull();
        txtProveedorID = new rojeru_san.RSMTextFull();
        txtPrecioProducto = new rojeru_san.RSMTextFull();
        lblExistenciaMinima1 = new javax.swing.JLabel();
        txtExistenciaMinima = new rojeru_san.RSMTextFull();
        lblExistenciaMinima2 = new javax.swing.JLabel();
        txtNumeroProductos1 = new rojeru_san.RSMTextFull();
        lblImagen = new javax.swing.JLabel();
        btnSeleccionarImgen = new rojeru_san.RSButtonRiple();
        CmbCategoria = new javax.swing.JComboBox<>();
        BtnBuscar = new rojeru_san.RSButtonRiple();

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
        jLabel2.setText("Registro Productos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 330, 40));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 53, 79));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 100, 30));

        txtNombreProducto.setForeground(new java.awt.Color(0, 53, 79));
        txtNombreProducto.setColorTransparente(true);
        txtNombreProducto.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombreProducto.setPlaceholder("Escriba el nombre");
        jPanel1.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 280, 40));

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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        lblPrecioProducto.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblPrecioProducto.setForeground(new java.awt.Color(0, 53, 79));
        lblPrecioProducto.setText("Precio:");
        jPanel1.add(lblPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, 40));

        lblCodigoocategoria.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblCodigoocategoria.setForeground(new java.awt.Color(0, 53, 79));
        lblCodigoocategoria.setText("Categoría:");
        jPanel1.add(lblCodigoocategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 100, 40));

        lblNumeroProductos.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblNumeroProductos.setForeground(new java.awt.Color(0, 53, 79));
        lblNumeroProductos.setText("Cantidad:");
        jPanel1.add(lblNumeroProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, 40));

        lblDescripcion.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 53, 79));
        lblDescripcion.setText("Descripción:");
        jPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 40));

        lblProveedorID.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblProveedorID.setForeground(new java.awt.Color(0, 53, 79));
        lblProveedorID.setText(" Proveedor:");
        jPanel1.add(lblProveedorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 100, 40));

        txtDescripcion.setForeground(new java.awt.Color(0, 53, 79));
        txtDescripcion.setColorTransparente(true);
        txtDescripcion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDescripcion.setPlaceholder("Descripción");
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 270, 40));

        txtExistenciaMaxima.setForeground(new java.awt.Color(0, 53, 79));
        txtExistenciaMaxima.setColorTransparente(true);
        txtExistenciaMaxima.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtExistenciaMaxima.setPlaceholder("Existencia Minima");
        jPanel1.add(txtExistenciaMaxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 280, 40));

        txtProveedorID.setForeground(new java.awt.Color(0, 53, 79));
        txtProveedorID.setColorTransparente(true);
        txtProveedorID.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtProveedorID.setPlaceholder(" Escriba ID del prodevor");
        jPanel1.add(txtProveedorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 200, 50));

        txtPrecioProducto.setForeground(new java.awt.Color(0, 53, 79));
        txtPrecioProducto.setColorTransparente(true);
        txtPrecioProducto.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtPrecioProducto.setPlaceholder("Escriba el precio");
        txtPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 280, 40));

        lblExistenciaMinima1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblExistenciaMinima1.setForeground(new java.awt.Color(0, 53, 79));
        lblExistenciaMinima1.setText("Existencia minima:");
        jPanel1.add(lblExistenciaMinima1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 170, 40));

        txtExistenciaMinima.setForeground(new java.awt.Color(0, 53, 79));
        txtExistenciaMinima.setColorTransparente(true);
        txtExistenciaMinima.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtExistenciaMinima.setPlaceholder("Existencia Minima");
        jPanel1.add(txtExistenciaMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 280, 40));

        lblExistenciaMinima2.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblExistenciaMinima2.setForeground(new java.awt.Color(0, 53, 79));
        lblExistenciaMinima2.setText("Existencia maxima:");
        jPanel1.add(lblExistenciaMinima2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 40));

        txtNumeroProductos1.setForeground(new java.awt.Color(0, 53, 79));
        txtNumeroProductos1.setColorTransparente(true);
        txtNumeroProductos1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNumeroProductos1.setPlaceholder("Numero de productos");
        jPanel1.add(txtNumeroProductos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 280, 40));

        lblImagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 180, 140));

        btnSeleccionarImgen.setText("Selecionar Imagen");
        btnSeleccionarImgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarImgenActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionarImgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 180, -1));

        jPanel1.add(CmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 270, -1));

        BtnBuscar.setBackground(new java.awt.Color(0, 204, 51));
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Verificar que el nombre del producto no esté vacío
    if (txtNombreProducto.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "No deje espacios en blanco en el nombre del producto");
        return;
    }

    // Validar precio del producto
    if (!txtPrecioProducto.getText().matches("\\d+(\\.\\d{1,2})?")) {
        JOptionPane.showMessageDialog(this, "Ingrese un precio válido (ejemplo: 10.99)");
        return;
    }

    // Validar número de productos
    if (!txtNumeroProductos1.getText().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Ingrese un número de productos válido");
        return;
    }

    // Validar existencia máxima
    if (!txtExistenciaMaxima.getText().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Ingrese una existencia máxima válida");
        return;
    }

    // Validar existencia mínima
    if (!txtExistenciaMinima.getText().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Ingrese una existencia mínima válida");
        return;
    }

    int existenciaMaxima = Integer.parseInt(txtExistenciaMaxima.getText());
    int existenciaMinima = Integer.parseInt(txtExistenciaMinima.getText());
    if (existenciaMinima > existenciaMaxima) {
        JOptionPane.showMessageDialog(this, "La existencia mínima no puede ser mayor que la existencia máxima");
        return;
    }

    // Si todas las validaciones pasan, proceder a guardar el producto
    String precioProducto = txtPrecioProducto.getText().replace(",", ".");
    guardarProducto(
        txtNombreProducto.getText(),
        Double.parseDouble(precioProducto),
        CmbCategoria.getSelectedItem().toString(),
        Integer.parseInt(txtNumeroProductos1.getText()),
        Integer.parseInt(txtExistenciaMaxima.getText()),
        Integer.parseInt(txtExistenciaMinima.getText()),
        txtDescripcion.getText(),
        txtProveedorID.getText(),
        imagenProducto,
        Producto.Estado.ACTIVO
    );

    JOptionPane.showMessageDialog(this, "Producto Guardado");
    resetCampos();

    // Redirigir a la tabla de productos después de guardar
    TablaProductos tblpro = new TablaProductos();
    MostrarpaneCruds(tblpro);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
     TablaProductos tblpro = new TablaProductos();
    MostrarpaneCruds(tblpro);
    }//GEN-LAST:event_btnCancelarActionPerformed

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
    private void mostrarDatos() {
        // Método para mostrar datos si es necesario
    }

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
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        mostrarNombreProveedor();
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        activarJdialog(TablaProvedores);
    }//GEN-LAST:event_BtnBuscarActionPerformed
    private void resetCampos() {

        txtNombreProducto.setText("");
        txtPrecioProducto.setText("");
        txtNumeroProductos1.setText("");
        txtExistenciaMaxima.setText("");
        txtExistenciaMinima.setText("");
        txtDescripcion.setText("");
        txtProveedorID.setText("");
        CmbCategoria.setSelectedIndex(-1);
        txtNombreProducto.setEnabled(true);
        lblImagen.setIcon(null);  // Restablecer la imagen a null
        lblImagen.setText("No image available"); // Establecer texto por defecto si no hay imagen
    }

    private static String obtenerProximoCodigoProducto(ObjectContainer db) {
        // Consultar todos los productos
        ObjectSet<Producto> result = db.queryByExample(Producto.class);

        // Determinar el máximo ID numérico existente
        int auto = 0;
        while (result.hasNext()) {
            Producto producto = result.next();
            String codigo = producto.getCodigo_Producto();
            if (codigo != null && codigo.startsWith("PRO")) {
                int id = Integer.parseInt(codigo.substring(3)); // Extraer la parte numérica del código
                if (id > auto) {
                    auto = id;
                }
            }
        }
        // El próximo ID es el máximo + 1
        int siguienteID = auto + 1;
        // Retornar el nuevo código concatenado con "PRO"
        return "PRO" + siguienteID;
    }

    public static void guardarProducto(String nombre_Producto, Double precio_Producto, String codigo_categoria_Producto, int numeroProductos_Producto,
            int existenciaMaxima_Producto, int existenciaMinima_Producto, String descripcion_Producto,
            String ID_Proveedor_Producto, byte[] imagen, Producto.Estado estado) {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer baseBD = Conexion_db.ConectarBD();

        // Obtener el próximo código de producto disponible
        String codigo_Producto = obtenerProximoCodigoProducto(baseBD);

        // Verificar si el código ya existe (esto no debería suceder, pero es una precaución)
        if (verificarProducto(baseBD, codigo_Producto) == 0) {
            // Crear objeto de Producto con los datos proporcionados
            Producto nuevoProducto = new Producto(codigo_Producto, nombre_Producto, precio_Producto, codigo_categoria_Producto, numeroProductos_Producto, existenciaMaxima_Producto, existenciaMinima_Producto, descripcion_Producto, ID_Proveedor_Producto, imagen, Producto.Estado.ACTIVO);

            // Guardar el producto en la base de datos
            baseBD.set(nuevoProducto);

        } else {
            JOptionPane.showMessageDialog(null, " El código de producto ya existe. Intente nuevamente.");
        }

        // Cerrar conexión con la base de datos
        baseBD.close();
    }

    public static int verificarProducto(ObjectContainer baseBD, String codigo_Producto) {
        // Crear objeto para buscar el producto por su código
        Producto productoBusca = new Producto(codigo_Producto, null, null, null, 0, 0, 0, null, null, null, null);
        ObjectSet<Producto> resultado = baseBD.get(productoBusca);
        return resultado.size();
    }

    private void mostrarCombo() {
//abrir base
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
// Consulta a la base de datos para obtener todos los objetos Ciudad
        ObjectSet<Categoria> categorias = BaseBD.query(Categoria.class);

// Itera sobre los resultados y agrega los nombres de ciudades al JComboBox
        categorias.forEach((categoria) -> {
            CmbCategoria.addItem(categoria.getNombreCat());
        });
        BaseBD.close();
    }

    private void mostrarDatospro() {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        tblProveedores.setEnabled(true);
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Proveedor ProveedorBusca = new Proveedor();
        ObjectSet<Proveedor> resultado = BaseBD.get(ProveedorBusca);

        // Crear una matriz
        String matriz[][] = new String[resultado.size()][6];
        int i = 0;
        for (Proveedor miProveedor : resultado) {
            matriz[i][0] = miProveedor.getCodigo_proveedor();
            matriz[i][1] = miProveedor.getTipo_proveedor();
            matriz[i][2] = miProveedor.getNombre_proveedor();
            matriz[i][3] = miProveedor.getDireccion_proveedor();
            matriz[i][4] = miProveedor.getCorreo_proveedor();
            matriz[i][5] = miProveedor.getCelular_proveedor();
            i++;
        }

        // Configurar datos en la tabla
        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"Código", "Tipo", "Nombre", "Dirección", "Email", "Celular"}));
        tblProveedores.setEnabled(false);

        // Cerrar la conexión con la base de datos
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
                  JOptionPane.showMessageDialog(this, " Proveedor Agregado");
                 
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "No se encontró Proveedor");
        }
        TablaProvedores.dispose();
        // Cerrar la conexión con la base de datos
        BaseBD.close();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple BtnBuscar;
    private javax.swing.JComboBox<String> CmbCategoria;
    private javax.swing.JDialog TablaProvedores;
    private rsbuttongradiente.RSButtonGradiente btnAgregar;
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private rojeru_san.RSButtonRiple btnSeleccionarImgen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoocategoria;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblExistenciaMinima1;
    private javax.swing.JLabel lblExistenciaMinima2;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNumeroProductos;
    private javax.swing.JLabel lblPrecioProducto;
    private javax.swing.JLabel lblProveedorID;
    private javax.swing.JTable tblProveedores;
    private rojeru_san.RSMTextFull txtBuscar;
    private rojeru_san.RSMTextFull txtDescripcion;
    private rojeru_san.RSMTextFull txtExistenciaMaxima;
    private rojeru_san.RSMTextFull txtExistenciaMinima;
    private rojeru_san.RSMTextFull txtNombreProducto;
    private rojeru_san.RSMTextFull txtNumeroProductos1;
    private rojeru_san.RSMTextFull txtPrecioProducto;
    private rojeru_san.RSMTextFull txtProveedorID;
    // End of variables declaration//GEN-END:variables
}
