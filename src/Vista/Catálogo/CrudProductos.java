
package Vista.Catálogo;

import Conexion.Conexion_db;
import Models.IdManager;
import Models.Producto;
import static Vista.Catálogo.CRUD_Prodcuto.BaseFinal;
import Vista.Menu.VistaMenu;
import Vista.Tables.TablaProductos;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import javax.swing.JPanel;


public class CrudProductos extends javax.swing.JPanel {

    /**
     * Creates new form CrudProductos
     */
    public CrudProductos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoProducto = new rojeru_san.RSMTextFull();
        jLabel4 = new javax.swing.JLabel();
        txtNombreProducto = new rojeru_san.RSMTextFull();
        txtCodigoCategoria = new rojeru_san.RSMTextFull();
        btnCancelar = new rojeru_san.RSButtonRiple();
        btnGuardar = new rojeru_san.RSButtonRiple();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Registro Productos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 330, 40));

        txtCodigoProducto.setForeground(new java.awt.Color(0, 53, 79));
        txtCodigoProducto.setColorTransparente(true);
        txtCodigoProducto.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCodigoProducto.setPlaceholder("Código");
        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 200, 40));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 53, 79));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 100, 40));

        txtNombreProducto.setForeground(new java.awt.Color(0, 53, 79));
        txtNombreProducto.setColorTransparente(true);
        txtNombreProducto.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombreProducto.setPlaceholder("Escriba el nombre");
        jPanel1.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 200, 40));

        txtCodigoCategoria.setForeground(new java.awt.Color(0, 53, 79));
        txtCodigoCategoria.setColorTransparente(true);
        txtCodigoCategoria.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCodigoCategoria.setPlaceholder("Código de la Categoria");
        jPanel1.add(txtCodigoCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 200, 40));

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, -1, -1));

        lblCodigooProducto.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblCodigooProducto.setForeground(new java.awt.Color(0, 53, 79));
        lblCodigooProducto.setText("Código:");
        jPanel1.add(lblCodigooProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        lblPrecioProducto.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblPrecioProducto.setForeground(new java.awt.Color(0, 53, 79));
        lblPrecioProducto.setText("Precio:");
        jPanel1.add(lblPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        lblCodigoocategoria.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblCodigoocategoria.setForeground(new java.awt.Color(0, 53, 79));
        lblCodigoocategoria.setText("Código de categoría:");
        jPanel1.add(lblCodigoocategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        lblNumeroProductos.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblNumeroProductos.setForeground(new java.awt.Color(0, 53, 79));
        lblNumeroProductos.setText("Numero de productos:");
        jPanel1.add(lblNumeroProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        lblExistenciaMinima.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblExistenciaMinima.setForeground(new java.awt.Color(0, 53, 79));
        lblExistenciaMinima.setText("Existencia maxima:");
        jPanel1.add(lblExistenciaMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        lblDescripcion.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 53, 79));
        lblDescripcion.setText("Descripción:");
        jPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        lblProveedorID.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblProveedorID.setForeground(new java.awt.Color(0, 53, 79));
        lblProveedorID.setText("ID proveedor:");
        jPanel1.add(lblProveedorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        txtDescripcion.setForeground(new java.awt.Color(0, 53, 79));
        txtDescripcion.setColorTransparente(true);
        txtDescripcion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDescripcion.setPlaceholder("Descripción");
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 200, 40));

        txtExistenciaMaxima.setForeground(new java.awt.Color(0, 53, 79));
        txtExistenciaMaxima.setColorTransparente(true);
        txtExistenciaMaxima.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtExistenciaMaxima.setPlaceholder("Existencia Minima");
        jPanel1.add(txtExistenciaMaxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 200, 40));

        txtProveedorID.setForeground(new java.awt.Color(0, 53, 79));
        txtProveedorID.setColorTransparente(true);
        txtProveedorID.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtProveedorID.setPlaceholder(" Escriba ID del prodevor");
        jPanel1.add(txtProveedorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 200, 40));

        txtPrecioProducto.setForeground(new java.awt.Color(0, 53, 79));
        txtPrecioProducto.setColorTransparente(true);
        txtPrecioProducto.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtPrecioProducto.setPlaceholder("Escriba el precio");
        txtPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 200, 40));

        txtNumeroProductos.setForeground(new java.awt.Color(0, 53, 79));
        txtNumeroProductos.setColorTransparente(true);
        txtNumeroProductos.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNumeroProductos.setPlaceholder("Numero de productos");
        jPanel1.add(txtNumeroProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 200, 40));

        lblExistenciaMinima1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblExistenciaMinima1.setForeground(new java.awt.Color(0, 53, 79));
        lblExistenciaMinima1.setText("Existencia minima:");
        jPanel1.add(lblExistenciaMinima1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        txtExistenciaMinima.setForeground(new java.awt.Color(0, 53, 79));
        txtExistenciaMinima.setColorTransparente(true);
        txtExistenciaMinima.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtExistenciaMinima.setPlaceholder("Existencia Minima");
        jPanel1.add(txtExistenciaMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 200, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        TablaProductos tblser = new TablaProductos();
        MostrarpaneCruds(tblser);
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Obtener todos los valores de la interfaz
        String nombreProducto = txtNombreProducto.getText();
        String precioTexto = txtPrecioProducto.getText();
        String numeroProductosTexto = txtNumeroProductos.getText();
        String existenciaMaximaTexto = txtExistenciaMaxima.getText();
        String existenciaMinimaTexto = txtExistenciaMinima.getText();
        String codigoCategoria = txtCodigoCategoria.getText();
        String descripcion = txtDescripcion.getText();
        String proveedorID = txtProveedorID.getText();

        // Verificar si el producto ya existe
        for (Producto producto : listaProductosBase) {
            if (producto.getNombre_Producto().equalsIgnoreCase(nombreProducto)) {
                JOptionPane.showMessageDialog(this, "YA EXISTE EL PRODUCTO " + producto.getCodigo_Producto());
                resetCampos();
                return;
            }
        }

        // Validar los campos
        if (!precioTexto.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Ingrese un precio en decimales ej: 10.25");
            return;
        }
        if (!numeroProductosTexto.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero entero positivo de productos ej: 10");
            return;
        }
        if (!existenciaMaximaTexto.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero entero positivo de existencia maxima de productos ej: 10");
            return;
        }
        if (!existenciaMinimaTexto.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero entero positivo de existencia minima de productos ej: 10");
            return;
        }

        // Convertir los campos a sus tipos correspondientes
        Double precio = Double.parseDouble(precioTexto);
        int numeroProductos = Integer.parseInt(numeroProductosTexto);
        int existenciaMaxima = Integer.parseInt(existenciaMaximaTexto);
        int existenciaMinima = Integer.parseInt(existenciaMinimaTexto);

        // Establecer conexión con la base de datos
        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        // Obtener el gestor de ID
        ObjectSet<IdManager> result = BaseBD.query(IdManager.class);
        IdManager idManager;
        if (result.isEmpty()) {
            idManager = new IdManager();
        } else {
            idManager = result.get(0);
        }

        // Generar nuevo ID para el producto
        int newProductoId = idManager.getLastproducto() + 1;

        // Crear objeto de Producto
        Producto nuevoProducto = new Producto(
                "PROD_" + newProductoId,
                nombreProducto,
                precio,
                codigoCategoria,
                numeroProductos,
                existenciaMaxima,
                existenciaMinima,
                descripcion,
                proveedorID
        );

        // Actualizar el gestor de ID
        idManager.setLastproducto(newProductoId);

        // Guardar el producto y el gestor de ID en la base de datos
        BaseBD.set(nuevoProducto);
        BaseBD.set(idManager);

        JOptionPane.showMessageDialog(this, "Producto registrado exitosamente");
        BaseBD.close();

        // Resetear campos
        resetCampos();
    }//GEN-LAST:event_btnGuardarActionPerformed
    private void resetCampos() {
        txtNombreProducto.setText("");
        txtPrecioProducto.setText("");
        txtNumeroProductos.setText("");
        txtExistenciaMaxima.setText("");
        txtExistenciaMinima.setText("");
        txtCodigoCategoria.setText("");
        txtDescripcion.setText("");
        txtProveedorID.setText("");
    }

    public static List<Producto> getListaProductosBase(ObjectContainer BaseFinal) {//metodo para obtener la lista de la base
        List<Producto> listaProductosBase = new ArrayList<>();
        ObjectSet<Producto> productos = BaseFinal.query(Producto.class);
        for (Producto producto : productos) {
            listaProductosBase.add(producto);
        }
        return listaProductosBase;
    }
    List<Producto> listaProductosBase = getListaProductosBase(BaseFinal);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigooProducto;
    private javax.swing.JLabel lblCodigoocategoria;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblExistenciaMinima;
    private javax.swing.JLabel lblExistenciaMinima1;
    private javax.swing.JLabel lblNumeroProductos;
    private javax.swing.JLabel lblPrecioProducto;
    private javax.swing.JLabel lblProveedorID;
    private rojeru_san.RSMTextFull txtCodigoCategoria;
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
