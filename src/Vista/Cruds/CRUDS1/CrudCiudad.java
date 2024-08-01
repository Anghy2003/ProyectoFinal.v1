/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Cruds.CRUDS1;

import Conexion.Conexion_db;
import Models.Ciudad;
import Vista.Menu.VistaMenu;
import Vista.Tables.TablaCiudad;
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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CrudCiudad extends javax.swing.JPanel {

    private byte[] imagenCiudad;

    public CrudCiudad() {
        initComponents();
        txtIdCiudad.setEnabled(false);
    }

    //guardar la ciudad
    public void guardarCiudad( String ciudad, int poblacion, String region, byte[] imagen) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        String siguienteID = obtenerProximoIdCiudad(BaseBD);

        Ciudad city = new Ciudad(  ciudad, poblacion, region, imagen);

        city.setIdCiudad(siguienteID);

        BaseBD.close();

        if (VerificarCiudadRepetida(ciudad) == 0) {
            //crear el objeto

            BaseBD = Conexion_db.ConectarBD();
            BaseBD.set(city);
            BaseBD.close();
        } else {
            JOptionPane.showMessageDialog(this, "Ciudad ya ingresada, agregue otra ciudad");
        }
    }

    //Verificar si existe una ciudad
    public final int VerificarCiudadRepetida(String ciudad) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Query admin = BaseBD.query();
        admin.constrain(Ciudad.class);
        admin.descend("ciudad").constrain(txtNombreCiudad.getText());
        ObjectSet<Ciudad> resultado = admin.execute();

        int coincidencias = resultado.size();

        BaseBD.close();
        return coincidencias;
    }

    private static String obtenerProximoIdCiudad(ObjectContainer db) {
        // Consultar todos los productos
        ObjectSet<Ciudad> result = db.queryByExample(Ciudad.class);

        // Determinar el máximo ID numérico existente
        int auto = 0;
        while (result.hasNext()) {
            Ciudad producto = result.next();
            String codigocity = producto.getIdCiudad();
            if (codigocity != null && codigocity.startsWith("City")) {
                int id = Integer.parseInt(codigocity.substring(4)); // Extraer la parte numérica del código
                if (id > auto) {
                    auto = id;
                }
            }
        }
        // El próximo ID es el máximo + 1
        int siguienteID = auto + 1;
        // Retornar el nuevo código concatenado con "PRO"
        return "City" + siguienteID;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNombreCiudad = new javax.swing.JLabel();
        lblRegion = new javax.swing.JLabel();
        txtNombreCiudad = new rojeru_san.RSMTextFull();
        txtRegion = new rojeru_san.RSMTextFull();
        btnCancelar = new rojeru_san.RSButtonRiple();
        btnGuardar = new rojeru_san.RSButtonRiple();
        btnSeleccionarImgen = new rojeru_san.RSButtonRiple();
        lblImagenCiudad = new javax.swing.JLabel();
        lblPoblacionCiudad = new javax.swing.JLabel();
        txtPoblacionCiudad = new rojeru_san.RSMTextFull();
        txtIdCiudad = new rojeru_san.RSMTextFull();
        lblIDCiudad = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Ciudad");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 100, 40));

        lblNombreCiudad.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblNombreCiudad.setForeground(new java.awt.Color(0, 53, 79));
        lblNombreCiudad.setText("Nombres:");
        jPanel2.add(lblNombreCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 90, 40));

        lblRegion.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblRegion.setForeground(new java.awt.Color(0, 53, 79));
        lblRegion.setText("Region:");
        jPanel2.add(lblRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 80, 40));

        txtNombreCiudad.setForeground(new java.awt.Color(0, 53, 79));
        txtNombreCiudad.setColorTransparente(true);
        txtNombreCiudad.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombreCiudad.setPlaceholder("Cuenca");
        jPanel2.add(txtNombreCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 220, 40));

        txtRegion.setForeground(new java.awt.Color(0, 53, 79));
        txtRegion.setColorTransparente(true);
        txtRegion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtRegion.setPlaceholder("Sierra/Costa/Amazonia");
        jPanel2.add(txtRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 220, 40));

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
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, -1, 40));

        btnSeleccionarImgen.setText("Selecionar Imagen");
        btnSeleccionarImgen.setToolTipText("SOLO JPG");
        btnSeleccionarImgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarImgenActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeleccionarImgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 180, -1));

        lblImagenCiudad.setToolTipText("SOLO JPG");
        lblImagenCiudad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(lblImagenCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 180, 140));

        lblPoblacionCiudad.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblPoblacionCiudad.setForeground(new java.awt.Color(0, 53, 79));
        lblPoblacionCiudad.setText("Cantidad de Poblacion:");
        jPanel2.add(lblPoblacionCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 220, 40));

        txtPoblacionCiudad.setForeground(new java.awt.Color(0, 53, 79));
        txtPoblacionCiudad.setColorTransparente(true);
        txtPoblacionCiudad.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtPoblacionCiudad.setPlaceholder("1000000");
        jPanel2.add(txtPoblacionCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 220, 40));

        txtIdCiudad.setForeground(new java.awt.Color(0, 53, 79));
        txtIdCiudad.setColorTransparente(true);
        txtIdCiudad.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtIdCiudad.setPlaceholder("Autogenerado");
        jPanel2.add(txtIdCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 220, 40));

        lblIDCiudad.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblIDCiudad.setForeground(new java.awt.Color(0, 53, 79));
        lblIDCiudad.setText("ID Ciudad:");
        jPanel2.add(lblIDCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 320, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cambiartabla();
    }//GEN-LAST:event_btnCancelarActionPerformed
     public void cambiartabla() {
        TablaCiudad tblCiu = new TablaCiudad();
        ShowpanelCruds(tblCiu);
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        boolean usuarioRepetido = false;

        if (VerificarCiudadRepetida("ciudad") == 0) {
            JOptionPane.showMessageDialog(null, "Ciudad ya registrada");
            usuarioRepetido = true;
        }

        if (!usuarioRepetido) {

            Boolean valido = false;

            if (valido = txtNombreCiudad.getText().toUpperCase().matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)?$")) {
                if (valido = txtPoblacionCiudad.getText().toUpperCase().matches("\\d+")) {
                    if (valido = txtRegion.getText().matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)?$")) {

                        guardarCiudad( txtNombreCiudad.getText().toUpperCase(),
                                Integer.parseInt(txtPoblacionCiudad.getText()),
                                txtRegion.getText().toUpperCase(), imagenCiudad);
                        
                        JOptionPane.showMessageDialog(null, "Ciudad Guardada");
                        cambiartabla();
                        

                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese una Region Correcta");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese Numero Poblacion Correcta");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una Ciudad Correcta");
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

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
                imagenCiudad = leerImagen(archivoImagen);

                // Mostrar la imagen en el label
                Image mImagen = new ImageIcon(Ruta).getImage();
                ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lblImagenCiudad.getWidth(), lblImagenCiudad.getHeight(), Image.SCALE_SMOOTH));
                lblImagenCiudad.setIcon(mIcono);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al leer la imagen: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnSeleccionarImgenActionPerformed

//transforma la imagen en bytes
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
    
    private void ShowpanelCruds(JPanel p) {
        p.setSize(870, 630);
        p.setLocation(0, 0);
        VistaMenu.PanelPrincipal.removeAll();
        VistaMenu.PanelPrincipal.add(p, BorderLayout.CENTER);
        VistaMenu.PanelPrincipal.revalidate();
        VistaMenu.PanelPrincipal.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private rojeru_san.RSButtonRiple btnSeleccionarImgen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblIDCiudad;
    private javax.swing.JLabel lblImagenCiudad;
    private javax.swing.JLabel lblNombreCiudad;
    private javax.swing.JLabel lblPoblacionCiudad;
    private javax.swing.JLabel lblRegion;
    private rojeru_san.RSMTextFull txtIdCiudad;
    private rojeru_san.RSMTextFull txtNombreCiudad;
    private rojeru_san.RSMTextFull txtPoblacionCiudad;
    private rojeru_san.RSMTextFull txtRegion;
    // End of variables declaration//GEN-END:variables
}
