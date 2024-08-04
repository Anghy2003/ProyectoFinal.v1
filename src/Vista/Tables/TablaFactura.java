
package Vista.Tables;

import Conexion.Conexion_db;
import Models.DetalleFactura_1;
import Models.EncabezadoFactura_1;
import Models.Producto;
import Models.Servicios;
import Vista.Factura.Factura;
import static Vista.Menu.VistaMenu.PanelPrincipal;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TablaFactura extends javax.swing.JPanel {

    /**
     * Creates new form TablaFactura
     */
    public TablaFactura() {
        initComponents();
        
        mostrarDatosFacturas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFacturas = new javax.swing.JTable();
        txtBuscar = new rojeru_san.RSMTextFull();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new rsbuttongradiente.RSButtonGradiente();
        scrlpTabla = new javax.swing.JScrollPane();
        tabladetalle = new javax.swing.JTable();
        btnbuscar = new rsbuttongradiente.RSButtonGradiente();
        lblDetalleFactura = new javax.swing.JLabel();
        lblEncabezado = new javax.swing.JLabel();
        btnVizualizar1 = new rsbuttongradiente.RSButtonGradiente();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbltitulo.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        lbltitulo.setText("Listado Facturas Ingresadas ");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tblFacturas.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tblFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFacturas);

        txtBuscar.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        txtBuscar.setPlaceholder("ejm. FAC-001");

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel2.setText("Buscar");

        btnEliminar.setText("Eliminar");
        btnEliminar.setColorPrimario(new java.awt.Color(204, 0, 0));
        btnEliminar.setColorPrimarioHover(new java.awt.Color(255, 51, 51));
        btnEliminar.setColorSecundario(new java.awt.Color(255, 153, 153));
        btnEliminar.setColorSecundarioHover(new java.awt.Color(255, 204, 204));

        scrlpTabla.setBackground(new java.awt.Color(255, 255, 255));
        scrlpTabla.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scrlpTabla.setForeground(new java.awt.Color(255, 255, 255));

        tabladetalle.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tabladetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrlpTabla.setViewportView(tabladetalle);

        btnbuscar.setText("Buscar");
        btnbuscar.setColorPrimario(new java.awt.Color(0, 0, 255));
        btnbuscar.setColorPrimarioHover(new java.awt.Color(51, 0, 255));
        btnbuscar.setColorSecundario(new java.awt.Color(102, 153, 255));
        btnbuscar.setColorSecundarioHover(new java.awt.Color(255, 204, 204));
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        lblDetalleFactura.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        lblDetalleFactura.setText("Detalle Factura");

        lblEncabezado.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        lblEncabezado.setText("Encabezado Factura");

        btnVizualizar1.setText("Visualizar");
        btnVizualizar1.setColorPrimario(new java.awt.Color(51, 255, 0));
        btnVizualizar1.setColorPrimarioHover(new java.awt.Color(0, 204, 0));
        btnVizualizar1.setColorSecundario(new java.awt.Color(51, 204, 0));
        btnVizualizar1.setColorSecundarioHover(new java.awt.Color(0, 153, 0));
        btnVizualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVizualizar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(54, Short.MAX_VALUE)
                        .addComponent(lblDetalleFactura)
                        .addGap(675, 675, 675))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrlpTabla, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbltitulo)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(39, 39, 39)
                                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnVizualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(lblEncabezado)
                    .addContainerGap(653, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbltitulo)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVizualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(lblDetalleFactura)
                .addGap(18, 18, 18)
                .addComponent(scrlpTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(152, 152, 152)
                    .addComponent(lblEncabezado)
                    .addContainerGap(465, Short.MAX_VALUE)))
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

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
       String consulta = txtBuscar.getText();  // Suponiendo que txtBuscar es el campo de texto donde se ingresa el código de la factura
    filtrarTablaFacturas(consulta);
    
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnVizualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVizualizar1ActionPerformed
      // Obtiene la linea despues de la filtracion
    int selectedRow = tblFacturas.getSelectedRow();
    if (selectedRow != -1) {
        String codigoFactura = tblFacturas.getValueAt(selectedRow, 0).toString();
        
        //abrir la interfaz con los datos cargados
        abrirFacturaConDatos(codigoFactura);
    } 
    
    }//GEN-LAST:event_btnVizualizar1ActionPerformed
private void abrirFacturaConDatos(String codigoFactura) {
    // Crear una instancia de la interfaz de Factura
    Factura facturaPanel = new Factura();
    
    // Cargar los datos de la factura en la interfaz
    facturaPanel.cargarDatosFactura(codigoFactura);
    
    // Mostrar la interfaz de Factura
    MostarpanelCruds(facturaPanel);
}
 private void mostrarDetallesFactura() {
    // Obtener la factura seleccionada de la tabla de facturas
    int selectedRow = tblFacturas.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione una factura para ver sus detalles");
        return;
    }

    String codigoFactura = tblFacturas.getValueAt(selectedRow, 0).toString();

    // Establecer conexión con la base de datos
    ObjectContainer BaseBD = Conexion_db.ConectarBD();
    DetalleFactura_1 detalleBuscar = new DetalleFactura_1();
    detalleBuscar.setCodigo_encabezadoFactura(codigoFactura);

    ObjectSet<DetalleFactura_1> resultado = BaseBD.get(detalleBuscar);

    // Crear una matriz para almacenar los datos
    String matriz[][] = new String[resultado.size()][4];
    int i = 0;
    for (DetalleFactura_1 miDetalle : resultado) {
        matriz[i][0] = miDetalle.getCodigo_encabezadoFactura();
        String codigo = miDetalle.getCodigoProducto_detalleFactura();
        matriz[i][1] = codigo;
        matriz[i][2] = obtenerNombre(codigo, BaseBD);
        matriz[i][3] = String.valueOf(miDetalle.getCantidadProdcutos_detalleFactura());
        i++;
    }

    // Configurar datos en la tabla de detalles
    tabladetalle.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"Código Factura", "Código", "Nombre", "Cantidad"}));

    // Cerrar la conexión con la base de datos
    BaseBD.close();
}
private void mostrarDatosFacturas() {
    // ESTABLECER CONEXION CON LA BASE DE DATOS
    tblFacturas.setEnabled(true);
    ObjectContainer BaseBD = Conexion_db.ConectarBD();
    EncabezadoFactura_1 facturaBuscar = new EncabezadoFactura_1();
    ObjectSet<EncabezadoFactura_1> resultado = BaseBD.get(facturaBuscar);

    // Crear una matriz para almacenar los datos
    String matriz[][] = new String[resultado.size()][4];
    int i = 0;
    for (EncabezadoFactura_1 miFactura : resultado) {
        matriz[i][0] = miFactura.getCodigo_encabezadoFactura();
        matriz[i][1] = miFactura.getFecha_encabezadoFactura();
        matriz[i][2] = miFactura.getCedulaCliente_encabezadoFactura();
        matriz[i][3] = String.valueOf(miFactura.getTotal_encabezadoFactura());
        i++;
    }

    // Configurar datos en la tabla
    tblFacturas.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"Código Factura", "Fecha", "Cédula", "Total"}));
    tblFacturas.setEnabled(true); // Permitir la selección de filas

    // Añadir listener para manejar la selección de filas
    tblFacturas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        public void valueChanged(ListSelectionEvent event) {
            if (!event.getValueIsAdjusting()) { // Solo actuar cuando la selección esté completa
                mostrarDetallesFactura(); // Llamar al método sin parámetros
            }
        }
    });

    // Cerrar la conexión con la base de datos
    BaseBD.close();
}

private String obtenerNombre(String codigo, ObjectContainer baseBD) {
    // Buscar como Producto
    Producto productoBuscar = new Producto();
    productoBuscar.setCodigo_Producto(codigo);
    ObjectSet<Producto> resultadoProducto = baseBD.get(productoBuscar);

    if (!resultadoProducto.isEmpty()) {
        return resultadoProducto.next().getNombre_Producto();
    }

    // Buscar como Servicio
    Servicios servicioBuscar = new Servicios();
    servicioBuscar.setCodigo_Servicio(codigo);
    ObjectSet<Servicios> resultadoServicio = baseBD.get(servicioBuscar);

    if (!resultadoServicio.isEmpty()) {
        return resultadoServicio.next().getNombre_Servicio();
    }

    return "";
}
private void MostarpanelCruds(JPanel p) {
    p.setSize(900, 660);
    p.setLocation(0, 0);
    PanelPrincipal.removeAll();
    PanelPrincipal.add(p, BorderLayout.CENTER);
    PanelPrincipal.revalidate();
    PanelPrincipal.repaint();
}
private void filtrarTablaFacturas(String consulta) {
    DefaultTableModel modelo = (DefaultTableModel) tblFacturas.getModel();
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
    tblFacturas.setRowSorter(sorter);

    if (consulta.trim().length() == 0) {
        sorter.setRowFilter(null);
    } else {
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + consulta));
    }

    // Selecciona automáticamente la primera fila filtrada
    if (tblFacturas.getRowCount() > 0) {
        tblFacturas.setRowSelectionInterval(0, 0);
        mostrarDetallesFactura();  
    }

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttongradiente.RSButtonGradiente btnEliminar;
    private rsbuttongradiente.RSButtonGradiente btnVizualizar1;
    private rsbuttongradiente.RSButtonGradiente btnbuscar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDetalleFactura;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JScrollPane scrlpTabla;
    private javax.swing.JTable tabladetalle;
    private javax.swing.JTable tblFacturas;
    private rojeru_san.RSMTextFull txtBuscar;
    // End of variables declaration//GEN-END:variables
}
