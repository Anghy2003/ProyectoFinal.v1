package Vista.Catálogo;

import Conexion.Conexion_db;

import Models.Producto;
import static Vista.Catálogo.CrudProductos.guardarProducto;

import Vista.Menu.VistaMenu;
import static Vista.Menu.VistaMenu.PanelPrincipal;
import Vista.Tables.TablaProductos;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import javax.swing.JPanel;

public class BuscarProductos extends javax.swing.JPanel {

    /**
     * Creates new form CrudProductos
     */
    private String BuscarCodigo;
    public BuscarProductos(String receivedString) {
        this.BuscarCodigo = receivedString;
        initComponents();
        buscarProducto();
        
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

        txtCodigoCategoria.setForeground(new java.awt.Color(0, 53, 79));
        txtCodigoCategoria.setColorTransparente(true);
        txtCodigoCategoria.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCodigoCategoria.setPlaceholder("Código de la Categoria");
        jPanel1.add(txtCodigoCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 200, 40));

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
 if (!txtNombreProducto.getText().trim().isBlank()) {
        if (!txtDescripcion.getText().isBlank()) {
            Boolean valido = false; // Creamos una bandera para validar datos
            
            // Validar que la categoría sea alfabética
            if (valido = txtCodigoCategoria.getText().matches("^[a-zA-Z]+$")) {
                // Validar que los campos numéricos contengan valores válidos
                if (txtPrecioProducto.getText().matches("\\d+(\\.\\d{1,2})?")
                        && txtNumeroProductos.getText().matches("\\d+")
                        && txtExistenciaMaxima.getText().matches("\\d+")
                        && txtExistenciaMinima.getText().matches("\\d+")) {

                    // Convertir los campos de texto a tipos numéricos
                    Double precioProducto = Double.parseDouble(txtPrecioProducto.getText());
                    int numeroProductosProducto = Integer.parseInt(txtNumeroProductos.getText());
                    int existenciaMaximaProducto = Integer.parseInt(txtExistenciaMaxima.getText());
                    int existenciaMinimaProducto = Integer.parseInt(txtExistenciaMinima.getText());

                    // Llamar al método modificarProducto
                    modificarProducto(
                            txtCodigoProducto.getText().toUpperCase(),
                            txtNombreProducto.getText(),
                            precioProducto,
                            txtCodigoCategoria.getText().toUpperCase(),
                            numeroProductosProducto,
                            existenciaMaximaProducto,
                            existenciaMinimaProducto,
                            txtDescripcion.getText(),
                            txtProveedorID.getText()
                    );

                    // Mostrar mensaje de éxito
                    JOptionPane.showMessageDialog(this, "Producto Modificado");

                    // Limpiar campos y actualizar la tabla
                    resetCampos();
                    //mostrarTablaProductos(); // Actualizar la tabla de productos

                } else {
                    JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos para precio, número de productos, existencia máxima y mínima");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese una categoría válida sin números");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No deje espacios en blanco en la descripción del producto");
        }
    } else {
        JOptionPane.showMessageDialog(this, "No deje espacios en blanco en el nombre del producto");
    }
    }//GEN-LAST:event_btnModficarActionPerformed
   // Método para modificar producto
public static void modificarProducto(String codigo_Producto, String nombre_Producto, Double precio_Producto, String codigo_categoria_Producto, int numeroProductos_Producto, int existenciaMaxima_Producto, int existenciaMinima_Producto, String descripcion_Producto, String ID_Proveedor_Producto) {
    // ESTABLECER CONEXION CON LA BASE DE DATOS
    ObjectContainer BaseBD = Conexion_db.ConectarBD();

    // Crear el objeto con los datos nuevos
    Producto productoModificado = new Producto(codigo_Producto, nombre_Producto, precio_Producto, codigo_categoria_Producto, numeroProductos_Producto, existenciaMaxima_Producto, existenciaMinima_Producto, descripcion_Producto, ID_Proveedor_Producto);

    // Buscar el objeto existente en la base de datos
    Producto productoBusca = new Producto(codigo_Producto, null, null, null, 0, 0, 0, null, null);
    ObjectSet<Producto> resultado = BaseBD.get(productoBusca);

    if (resultado.size() > 0) {
        // Actualizar el objeto existente
        Producto productoExistente = (Producto) resultado.next();
        
        // Actualizar campos del objeto existente con los nuevos valores
        productoExistente.setNombre_Producto(nombre_Producto);
        productoExistente.setPrecio_Producto(precio_Producto);
        productoExistente.setCodigo_categoria_Producto(codigo_categoria_Producto);
        productoExistente.setNumeroProductos_Producto(numeroProductos_Producto);
        productoExistente.setExistenciaMaxima_Producto(existenciaMaxima_Producto);
        productoExistente.setExistenciaMinima_Producto(existenciaMinima_Producto);
        productoExistente.setDescripcion_Producto(descripcion_Producto);
        productoExistente.setID_Proveedor_Producto(ID_Proveedor_Producto);

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
    Producto productoBusca = new Producto(codigo_Producto, null, null, null, 0, 0, 0, null, null);
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
    Producto productoBusca = new Producto(codigo_Producto, null, null, null, 0, 0, 0, null, null);
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
        txtCodigoCategoria.setText("");
        txtNumeroProductos.setText("");
        txtExistenciaMaxima.setText("");
        txtExistenciaMinima.setText("");
        txtDescripcion.setText("");
        txtProveedorID.setText("");
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
    for (Producto prod : resultado) {
        // Seteamos en los campos recibiendo del objeto
        txtNombreProducto.setText(prod.getNombre_Producto());
        txtCodigoCategoria.setText(prod.getCodigo_categoria_Producto());
        txtPrecioProducto.setText(String.format("%.2f", prod.getPrecio_Producto())); 
        txtNumeroProductos.setText(String.valueOf(prod.getNumeroProductos_Producto()));
        txtExistenciaMaxima.setText(String.valueOf(prod.getExistenciaMaxima_Producto()));
        txtExistenciaMinima.setText(String.valueOf(prod.getExistenciaMinima_Producto()));
        txtDescripcion.setText(prod.getDescripcion_Producto());
        txtProveedorID.setText(prod.getID_Proveedor_Producto());
        // Puede ser útil deshabilitar los campos si no quieres que el usuario los edite
        txtNombreProducto.setEnabled(false);
        encontrado = true;
        JOptionPane.showMessageDialog(this, "PRODUCTO ENCONTRADO");
    }
    if (!encontrado) {
        JOptionPane.showMessageDialog(this, "No se encontró el Producto");
    }
    
    BaseBD.close();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnModficar;
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
