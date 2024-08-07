package Vista.Tables;

import Conexion.Conexion_db;
import Conexion.ImageRenderer;
import Models.Producto;
import Vista.Catálogo.CrudProductos;
import Vista.Menu.VistaMenu;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Vista.Catálogo.BuscarProductos;
import com.db4o.query.Query;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class TablaProductos extends javax.swing.JPanel {

    /**
     * Creates new form TablaProductos
     */
    public TablaProductos() {
        initComponents();
      mostrarDatosActivos();
      mostrarDatosInactivo();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tblProductos = new javax.swing.JScrollPane();
        TablProductos1 = new javax.swing.JTable();
        txtBuscar = new rojeru_san.RSMTextFull();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new rsbuttongradiente.RSButtonGradiente();
        btnBuscar = new rsbuttongradiente.RSButtonGradiente();
        btnEliminar = new rsbuttongradiente.RSButtonGradiente();
        scrlpTablaVehi2 = new javax.swing.JScrollPane();
        tblProInactivo = new javax.swing.JTable();
        lbl_Inactivos = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        jLabel1.setText("Listado Productos");

        tblProductos.setBackground(new java.awt.Color(255, 255, 255));
        tblProductos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblProductos.setForeground(new java.awt.Color(255, 255, 255));

        TablProductos1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        TablProductos1.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProductos.setViewportView(TablProductos1);

        txtBuscar.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        txtBuscar.setPlaceholder("ejm. Pro-01");

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel2.setText("Buscar");

        btnAgregar.setText("Agregar");
        btnAgregar.setColorPrimario(new java.awt.Color(0, 204, 51));
        btnAgregar.setColorPrimarioHover(new java.awt.Color(0, 204, 51));
        btnAgregar.setColorSecundario(new java.awt.Color(153, 255, 153));
        btnAgregar.setColorSecundarioHover(new java.awt.Color(204, 255, 204));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Editar");
        btnBuscar.setColorPrimario(new java.awt.Color(0, 51, 153));
        btnBuscar.setColorPrimarioHover(new java.awt.Color(51, 0, 255));
        btnBuscar.setColorSecundario(new java.awt.Color(51, 153, 255));
        btnBuscar.setColorSecundarioHover(new java.awt.Color(153, 204, 255));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setColorPrimario(new java.awt.Color(204, 0, 0));
        btnEliminar.setColorPrimarioHover(new java.awt.Color(255, 51, 51));
        btnEliminar.setColorSecundario(new java.awt.Color(255, 153, 153));
        btnEliminar.setColorSecundarioHover(new java.awt.Color(255, 204, 204));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        scrlpTablaVehi2.setBackground(new java.awt.Color(255, 255, 255));
        scrlpTablaVehi2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scrlpTablaVehi2.setForeground(new java.awt.Color(255, 255, 255));

        tblProInactivo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tblProInactivo.setModel(new javax.swing.table.DefaultTableModel(
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
        scrlpTablaVehi2.setViewportView(tblProInactivo);

        lbl_Inactivos.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lbl_Inactivos.setText("Productos Eliminados:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrlpTablaVehi2, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(39, 39, 39)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lbl_Inactivos)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addComponent(tblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Inactivos)
                .addGap(28, 28, 28)
                .addComponent(scrlpTablaVehi2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked

    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
       
       
       
    
    }//GEN-LAST:event_btnEliminarMouseClicked



    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        CrudProductos Prodcuto = new CrudProductos();
        ShowpanelCruds(Prodcuto);
    }//GEN-LAST:event_btnAgregarActionPerformed
    private void ShowpanelCruds(JPanel p) {
        p.setSize(870, 630);
        p.setLocation(0, 0);
        VistaMenu.PanelPrincipal.removeAll();
        VistaMenu.PanelPrincipal.add(p, BorderLayout.CENTER);
        VistaMenu.PanelPrincipal.revalidate();
        VistaMenu.PanelPrincipal.repaint();
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       if (!txtBuscar.getText().trim().isEmpty()) {
            String codigoProducto = txtBuscar.getText(); // Obtener el texto de txtBuscar
            BuscarProductos miBuscarProducto = new BuscarProductos(codigoProducto); // Crear el componente con el código de producto
            ShowpanelCruds(miBuscarProducto); // Mostrar el panel de búsqueda de producto
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un código de producto");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
  if (!txtBuscar.getText().trim().isEmpty()) {
            String codigoProducto = txtBuscar.getText();
            inactivarProducto(codigoProducto);
            JOptionPane.showMessageDialog(this, "Producto inactivado");
            mostrarDatosActivos();
            mostrarDatosInactivo();
        } else {
            JOptionPane.showMessageDialog(this, "Producto no encontrado");
        }  
    }//GEN-LAST:event_btnEliminarActionPerformed
  
    public void inactivarProducto(String codigo_Producto) {
    ObjectContainer BaseBD = Conexion_db.ConectarBD();
    ObjectSet<Producto> result = BaseBD.queryByExample(new Producto(codigo_Producto, null, null, null, 0, 0, 0, null, null, null, null));
    if (result.hasNext()) {
        Producto productoAInactivar = result.next();
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de inactivar este producto?", "Confirmación de inactivación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            productoAInactivar.desactivarProducto();
            BaseBD.store(productoAInactivar);
            BaseBD.commit(); // Asegúrate de que el cambio se guarda en la base de datos
            System.out.println("Producto inactivado correctamente: " + productoAInactivar.getCodigo_Producto() + " Estado: " + productoAInactivar.getEstado());
            BaseBD.close();
            mostrarDatosActivos();//aqui debes estar abriendo la base en ese metodo
            mostrarDatosInactivo();
        } else {
            System.out.println("Inactivación cancelada por el usuario");
        }
    } else {
        System.out.println("No se encontró producto con ese código");
    }
    BaseBD.close();
}

 private void mostrarDatosInactivo() {
    ObjectContainer BaseBD = Conexion_db.ConectarBD();
    tblProInactivo.setEnabled(true);

    Query query = BaseBD.query();
    query.constrain(Producto.class);
    query.descend("estado").constrain(Producto.Estado.INACTIVO);
    ObjectSet<Producto> resultado = query.execute();

    Object matriz[][] = new Object[resultado.size()][11];
    int i = 0;
    for (Producto producto : resultado) {
        matriz[i][0] = producto.getCodigo_Producto();
        matriz[i][1] = producto.getNombre_Producto();
        matriz[i][2] = String.valueOf(producto.getPrecio_Producto());
        matriz[i][3] = producto.getCodigo_categoria_Producto();
        matriz[i][4] = String.valueOf(producto.getNumeroProductos_Producto());
        matriz[i][5] = String.valueOf(producto.getExistenciaMaxima_Producto());
        matriz[i][6] = String.valueOf(producto.getExistenciaMinima_Producto());
        matriz[i][7] = producto.getDescripcion_Producto();
        matriz[i][8] = producto.getID_Proveedor_Producto();

        byte[] imagen = producto.getImagen();
        if (imagen != null && imagen.length > 0) {
            ImageIcon icono = new ImageIcon(new ImageIcon(imagen).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
            matriz[i][9] = new JLabel(icono);
        } else {
            matriz[i][9] = new JLabel("No image");
        }

        matriz[i][10] = producto.getEstado().toString();
        i++;
    }

    tblProInactivo.setModel(new javax.swing.table.DefaultTableModel(
        matriz, new String[]{"Código Producto", "Nombre Producto", "Precio", "Código Categoría", "Número de Productos", "Existencia Máxima", "Existencia Mínima", "Descripción", "Proveedor", "Imagen", "Estado"}
    ));
    tblProInactivo.getColumnModel().getColumn(9).setCellRenderer(new ImageRenderer());
    tblProInactivo.setRowHeight(50);
    tblProInactivo.setEnabled(false);

    BaseBD.close();
}
  private void mostrarDatosActivos() {
    ObjectContainer BaseBD = Conexion_db.ConectarBD();
    Producto producto = new Producto(null, null, null, null, 0, 0, 0, null, null, null, Producto.Estado.ACTIVO);
    ObjectSet<Producto> resul = BaseBD.get(producto);

    Object matriz[][] = new Object[resul.size()][11];

    for (int i = 0; i < resul.size(); i++) {
        Producto prod = resul.next();

        matriz[i][0] = prod.getCodigo_Producto();
        matriz[i][1] = prod.getNombre_Producto();
        matriz[i][2] = String.valueOf(prod.getPrecio_Producto());
        matriz[i][3] = prod.getCodigo_categoria_Producto();
        matriz[i][4] = String.valueOf(prod.getNumeroProductos_Producto());
        matriz[i][5] = String.valueOf(prod.getExistenciaMaxima_Producto());
        matriz[i][6] = String.valueOf(prod.getExistenciaMinima_Producto());
        matriz[i][7] = prod.getDescripcion_Producto();
        matriz[i][8] = prod.getID_Proveedor_Producto();
        byte[] imagen = prod.getImagen();
        if (imagen != null && imagen.length > 0) {
            ImageIcon icono = new ImageIcon(imagen);
            Image img = icono.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            matriz[i][9] = new JLabel(new ImageIcon(img));
        } else {
            matriz[i][9] = new JLabel("No image");
        }
        matriz[i][10] = prod.getEstado().toString();
    }

    TablProductos1.setModel(new javax.swing.table.DefaultTableModel(
        matriz,
        new String[]{
            "Código Producto", "Nombre Producto", "Precio", "Código Categoría", "Número de Productos", "Existencia Máxima", "Existencia Mínima", "Descripción", "Proveedor", "Imagen", "Estado"
        }
    ));

    TablProductos1.getColumnModel().getColumn(9).setCellRenderer(new ImageRenderer());
    TablProductos1.setRowHeight(50);
    TablProductos1.setEnabled(false);
    BaseBD.close();
}
    public static ObjectSet verificarProductosActivos() {
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Producto productoBusca = new Producto(null, null, null, null, 0, 0, 0, null, null, null, Producto.Estado.ACTIVO);
        ObjectSet resultado = BaseBD.get(productoBusca);
        BaseBD.close();
        return resultado;
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablProductos1;
    private rsbuttongradiente.RSButtonGradiente btnAgregar;
    private rsbuttongradiente.RSButtonGradiente btnBuscar;
    private rsbuttongradiente.RSButtonGradiente btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_Inactivos;
    private javax.swing.JScrollPane scrlpTablaVehi2;
    private javax.swing.JTable tblProInactivo;
    private javax.swing.JScrollPane tblProductos;
    private rojeru_san.RSMTextFull txtBuscar;
    // End of variables declaration//GEN-END:variables
}
