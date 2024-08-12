/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Catálogo;

import Conexion.Conexion_db;
import Conexion.ImageRenderer;
import Models.Servicios;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author 59399
 */
public class CatalogoServicios extends javax.swing.JPanel {

    /**
     * Creates new form CatalogoServicios
     */
    public CatalogoServicios() {
        initComponents();
        mostrarTablaServicios();
        txtNombres.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtCodigoServicios.setEnabled(false);
        txtNombres.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtPrecio.setEnabled(false);

         tblServicios.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            tblServiciosMouseClicked(evt);
        }
    });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombres = new rojeru_san.RSMTextFull();
        lblPrecioProducto = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new rojeru_san.RSMTextFull();
        txtPrecio = new rojeru_san.RSMTextFull();
        lblImagen = new javax.swing.JLabel();
        lblCodigooProducto = new javax.swing.JLabel();
        txtCodigoServicios = new rojeru_san.RSMTextFull();
        lblcerrar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServicios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new rsbuttongradiente.RSButtonGradiente();
        txtBuscarServicios = new rojeru_san.RSMTextFull();

        jDialog1.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Servicio:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 330, 40));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 53, 79));
        jLabel4.setText("Nombre:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 100, 20));

        txtNombres.setForeground(new java.awt.Color(0, 53, 79));
        txtNombres.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtNombres.setColorTransparente(true);
        txtNombres.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombres.setPlaceholder("Escriba el nombre");
        jPanel3.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 190, 40));

        lblPrecioProducto.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblPrecioProducto.setForeground(new java.awt.Color(0, 53, 79));
        lblPrecioProducto.setText("Precio Total:");
        jPanel3.add(lblPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        lblDescripcion.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 53, 79));
        lblDescripcion.setText("Descripción:");
        jPanel3.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, -1));

        txtDescripcion.setForeground(new java.awt.Color(0, 53, 79));
        txtDescripcion.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtDescripcion.setColorTransparente(true);
        txtDescripcion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDescripcion.setPlaceholder("Descripción");
        jPanel3.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 190, 40));

        txtPrecio.setForeground(new java.awt.Color(0, 53, 79));
        txtPrecio.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtPrecio.setColorTransparente(true);
        txtPrecio.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtPrecio.setPlaceholder("Escriba el precio");
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel3.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 190, 40));

        lblImagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 180, 140));

        lblCodigooProducto.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblCodigooProducto.setForeground(new java.awt.Color(0, 53, 79));
        lblCodigooProducto.setText("Código:");
        jPanel3.add(lblCodigooProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        txtCodigoServicios.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigoServicios.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtCodigoServicios.setBotonColor(new java.awt.Color(0, 0, 0));
        txtCodigoServicios.setColorTransparente(true);
        txtCodigoServicios.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCodigoServicios.setPlaceholder("Código");
        jPanel3.add(txtCodigoServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 140, 40));

        lblcerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cruz.png"))); // NOI18N
        lblcerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcerrarMouseClicked(evt);
            }
        });
        jPanel3.add(lblcerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 50, 40));

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 53, 79));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblServicios.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        tblServicios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblServicios);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 870, 530));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 53, 79));
        jLabel1.setText("SERVICIOS DE LA  MECANICA ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 570, 30));

        btnBuscar.setBackground(new java.awt.Color(0, 51, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setColorPrimario(new java.awt.Color(0, 102, 255));
        btnBuscar.setColorPrimarioHover(new java.awt.Color(0, 51, 204));
        btnBuscar.setColorSecundario(new java.awt.Color(0, 51, 204));
        btnBuscar.setColorSecundarioHover(new java.awt.Color(0, 51, 204));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 120, -1));

        txtBuscarServicios.setForeground(new java.awt.Color(0, 53, 79));
        txtBuscarServicios.setBordeColorFocus(new java.awt.Color(109, 109, 109));
        txtBuscarServicios.setBotonColor(new java.awt.Color(0, 53, 79));
        txtBuscarServicios.setPlaceholder("Nombre del Servicio");
        txtBuscarServicios.setSelectedTextColor(new java.awt.Color(0, 53, 79));
        jPanel1.add(txtBuscarServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 310, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
     String nombre = txtBuscarServicios.getText().trim();
        buscarServicioPorNombre(nombre);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void lblcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcerrarMouseClicked
      jDialog1.dispose();
    }//GEN-LAST:event_lblcerrarMouseClicked
private void mostrarTablaServicios() {
    ObjectContainer BaseBD = Conexion_db.ConectarBD();
    Servicios servicio = new Servicios(null, null, null, 0.0, null, null, null, null);
    ObjectSet<Servicios> resul = BaseBD.get(servicio);

    Object[][] matriz = new Object[resul.size()][5];

    int i = 0;
    while (resul.hasNext()) {
        Servicios serv = resul.next();
        matriz[i][0] = serv.getCodigo_Servicio();
        matriz[i][1] = serv.getNombre_Servicio();
        matriz[i][2] = serv.getDescripcion_Servicio();
        matriz[i][3] = serv.getPrecioTotal_Servicio();
        byte[] imagen = serv.getImagen();
        matriz[i][4] = (imagen != null) ? new JLabel(new ImageIcon(new ImageIcon(imagen).getImage().getScaledInstance(180, 140, Image.SCALE_SMOOTH))) : new JLabel("No image");
        i++;
    }

    tblServicios.setModel(new javax.swing.table.DefaultTableModel(
        matriz,
        new String[]{"Código Servicio", "Nombre Servicio", "Descripción", "Precio", "Imagen"}
    ));

    tblServicios.getColumnModel().getColumn(4).setCellRenderer(new ImageRenderer());
    tblServicios.setRowHeight(100);

    tblServicios.getColumnModel().getColumn(2).setMinWidth(0);
    tblServicios.getColumnModel().getColumn(2).setMaxWidth(0);
    tblServicios.getColumnModel().getColumn(2).setWidth(0);

    tblServicios.getColumnModel().getColumn(3).setMinWidth(0);
    tblServicios.getColumnModel().getColumn(3).setMaxWidth(0);
    tblServicios.getColumnModel().getColumn(3).setWidth(0);

    BaseBD.close();
}
 private void buscarServicioPorNombre(String nombre) {
    if (nombre.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese el nombre del servicio.");
        return;
    }

    ObjectContainer BaseBD = Conexion_db.ConectarBD();
    ObjectSet<Servicios> todosLosServicios = BaseBD.query(Servicios.class);
    List<Servicios> serviciosCoincidentes = new ArrayList<>();
    List<Servicios> otrosServicios = new ArrayList<>();
    
    // Clasificar servicios en coincidentes y no coincidentes
    for (Servicios servicio : todosLosServicios) {
        if (servicio.getNombre_Servicio().toLowerCase().contains(nombre.toLowerCase())) {
            serviciosCoincidentes.add(servicio);
        } else {
            otrosServicios.add(servicio);
        }
    }
    
    // Unir ambas listas, primero los coincidentes y luego los demás
    serviciosCoincidentes.addAll(otrosServicios);

    // Crear la matriz para la tabla
    Object[][] matriz = new Object[serviciosCoincidentes.size()][5];

    int i = 0;
    for (Servicios serv : serviciosCoincidentes) {
        matriz[i][0] = serv.getCodigo_Servicio();
        matriz[i][1] = serv.getNombre_Servicio();
        matriz[i][2] = serv.getDescripcion_Servicio();
        matriz[i][3] = serv.getPrecioTotal_Servicio();
        byte[] imagen = serv.getImagen();
        matriz[i][4] = (imagen != null) ? new JLabel(new ImageIcon(new ImageIcon(imagen).getImage().getScaledInstance(180, 140, Image.SCALE_SMOOTH))) : new JLabel("No image");
        i++;
    }

    tblServicios.setModel(new javax.swing.table.DefaultTableModel(
        matriz,
        new String[]{"Código Servicio", "Nombre Servicio", "Descripción", "Precio", "Imagen"}
    ));

    tblServicios.getColumnModel().getColumn(4).setCellRenderer(new ImageRenderer());
    tblServicios.setRowHeight(100);

    BaseBD.close();
}
private void tblServiciosMouseClicked(MouseEvent evt) {
    int selectedRow = tblServicios.getSelectedRow();
    if (selectedRow != -1) {
        String codigo = tblServicios.getModel().getValueAt(selectedRow, 0).toString();
        String nombre = tblServicios.getModel().getValueAt(selectedRow, 1).toString();
        String descripcion = tblServicios.getModel().getValueAt(selectedRow, 2).toString();
        String precio = tblServicios.getModel().getValueAt(selectedRow, 3).toString();
        
        // Verificar si el valor en la columna de imagen es un JLabel
        Object imagenObj = tblServicios.getModel().getValueAt(selectedRow, 4);
        if (imagenObj instanceof JLabel) {
            JLabel imageLabel = (JLabel) imagenObj;
            lblImagen.setIcon(imageLabel.getIcon());
        } else {
            lblImagen.setIcon(null); // En caso de que no haya imagen
        }
        txtCodigoServicios.setText(codigo);
        txtNombres.setText(nombre);
        txtDescripcion.setText(descripcion);
        txtPrecio.setText(precio);

        jDialog1.setVisible(true);        
        jDialog1.setSize(543, 230);
        jDialog1.setLocationRelativeTo(null); // centramos el diálogo en la pantalla
    }
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttongradiente.RSButtonGradiente btnBuscar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigooProducto;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblPrecioProducto;
    private javax.swing.JLabel lblcerrar;
    private javax.swing.JTable tblServicios;
    private rojeru_san.RSMTextFull txtBuscarServicios;
    private rojeru_san.RSMTextFull txtCodigoServicios;
    private rojeru_san.RSMTextFull txtDescripcion;
    private rojeru_san.RSMTextFull txtNombres;
    private rojeru_san.RSMTextFull txtPrecio;
    // End of variables declaration//GEN-END:variables
}
