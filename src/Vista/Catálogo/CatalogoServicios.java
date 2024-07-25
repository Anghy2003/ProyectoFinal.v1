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
import javax.swing.ImageIcon;
import javax.swing.JLabel;

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
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServicios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarServicios = new rojeru_san.RSMTextFull();
        btnBuscar = new rsbuttongradiente.RSButtonGradiente();

        jPanel1.setBackground(new java.awt.Color(0, 53, 79));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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
        ));
        jScrollPane1.setViewportView(tblServicios);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 840, 470));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SERVICIOS DE LA  MECANICA ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 570, 30));

        jLabel2.setBackground(new java.awt.Color(0, 51, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 840, 140));

        txtBuscarServicios.setBackground(new java.awt.Color(0, 53, 79));
        txtBuscarServicios.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscarServicios.setText("rSMTextFull1");
        txtBuscarServicios.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtBuscarServicios.setBotonColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtBuscarServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 370, -1));

        btnBuscar.setBackground(new java.awt.Color(0, 51, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setColorPrimario(new java.awt.Color(0, 102, 255));
        btnBuscar.setColorPrimarioHover(new java.awt.Color(0, 51, 204));
        btnBuscar.setColorSecundario(new java.awt.Color(0, 51, 204));
        btnBuscar.setColorSecundarioHover(new java.awt.Color(0, 51, 204));
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
private void mostrarTablaServicios() {
    ObjectContainer BaseBD = Conexion_db.ConectarBD();
    Servicios servicio = new Servicios(null, null, null, 0.0, null, null,  null);
    ObjectSet<Servicios> resul = BaseBD.get(servicio);

    Object matriz[][] = new Object[resul.size()][3]; // Cambiar a Object y definir el tamaño de las columnas

    for (int i = 0; i < resul.size(); i++) {
        Servicios serv = resul.next();

        matriz[i][0] = serv.getCodigo_Servicio();
        matriz[i][1] = serv.getNombre_Servicio();
        
        // Convertir imagen a un icono para mostrar en la tabla
        byte[] imagen = serv.getImagen();
        if (imagen != null) {
            ImageIcon icono = new ImageIcon(new ImageIcon(imagen).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)); // Tamaño más grande
            matriz[i][2] = new JLabel(icono); // Agregar imagen a la matriz
        } else {
            matriz[i][2] = new JLabel("No image"); // Placeholder para servicios sin imagen
        }
    }

    tblServicios.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String[]{
                "Código Servicio", "Nombre Servicio", "Imagen"
            }
    ));

    // Asegúrate de que la tabla tiene la columna de imágenes
    if (tblServicios.getColumnModel().getColumnCount() > 2) {
        tblServicios.getColumnModel().getColumn(2).setCellRenderer(new ImageRenderer());
    } else {
        System.out.println("No hay suficientes columnas en la tabla para renderizar imágenes.");
    }

    // Ajustar el tamaño de las filas para mostrar imágenes más grandes
    tblServicios.setRowHeight(100);

    BaseBD.close();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttongradiente.RSButtonGradiente btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblServicios;
    private rojeru_san.RSMTextFull txtBuscarServicios;
    // End of variables declaration//GEN-END:variables
}
