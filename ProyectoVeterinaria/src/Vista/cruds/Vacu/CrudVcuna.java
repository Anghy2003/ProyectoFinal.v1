
package Vista.cruds.Vacu;

import Modelo.bdVacuna;
import Modelo.conexion;
import javax.swing.JOptionPane;
import rojeru_san.RSMTextFull;

public class CrudVcuna extends javax.swing.JPanel {

    public CrudVcuna() {
        initComponents();
         int opcion = JOptionPane.showOptionDialog(
            null, 
            "¿La vacuna ya está registrada en el sistema?", 
            "Consulta de vacunas", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            new Object[] {"Sí", "No"}, 
            "Sí");

    // Manejar las respuestas
    if (opcion == JOptionPane.YES_OPTION) {
      
        lblnombre.setVisible(true);
        txtnombre.setVisible(true);
        btnBuscar.setVisible(true);
        btnGuardar.setVisible(false);
        lbltipo.setVisible(false);
        txttipo.setVisible(false);
        lblfechacreacion.setVisible(false);
        lblfechaexp.setVisible(false);
        jDateChooser1.setVisible(false);
        jDateChooser2.setVisible(false);
        btnEliminar.setVisible(false);
        btnEditar.setVisible(false);

    } else if (opcion == JOptionPane.NO_OPTION) {
        btnGuardar.setVisible(true);
        lbltipo.setVisible(true);
        txttipo.setVisible(true);
        txtnombre.setVisible(true);
        lblnombre.setVisible(true);
        lblfechacreacion.setVisible(true);
        lblfechaexp.setVisible(true);
        jDateChooser1.setVisible(true);
        jDateChooser2.setVisible(true);
        btnBuscar.setVisible(false);
        btnEditar.setVisible(false);
        btnEliminar.setVisible(false);
        

    } else {
        JOptionPane.showMessageDialog(null, "No seleccionaste ninguna opción.");
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnEliminar = new rojeru_san.RSButtonRiple();
        btnBuscar = new rojeru_san.RSButtonRiple();
        btnEditar = new rojeru_san.RSButtonRiple();
        btnGuardar = new rojeru_san.RSButtonRiple();
        jPanel4 = new javax.swing.JPanel();
        lbltipo = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        txttipo = new rojeru_san.RSMTextFull();
        lblfechacreacion = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblfechaexp = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        txtnombre = new rojeru_san.RSMTextFull();

        jPanel1.setBackground(new java.awt.Color(183, 224, 210));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 107, 155)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(79, 107, 155));
        jLabel2.setText("Registro de Vacunas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 320, 40));

        jPanel5.setBackground(new java.awt.Color(183, 224, 210));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 107, 155)));

        jPanel6.setBackground(new java.awt.Color(183, 224, 210));

        btnEliminar.setBackground(new java.awt.Color(183, 224, 210));
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Regresar a la lista de Vehiculos");
        btnEliminar.setColorText(new java.awt.Color(79, 107, 155));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(183, 224, 210));
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("Verificar y rellenar todos los campos");
        btnBuscar.setColorText(new java.awt.Color(79, 107, 155));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(183, 224, 210));
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Verificar y rellenar todos los campos");
        btnEditar.setColorText(new java.awt.Color(79, 107, 155));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(183, 224, 210));
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Verificar y rellenar todos los campos");
        btnGuardar.setColorText(new java.awt.Color(79, 107, 155));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(183, 224, 210));
        jPanel4.setForeground(new java.awt.Color(183, 224, 210));

        lbltipo.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        lbltipo.setForeground(new java.awt.Color(79, 107, 155));
        lbltipo.setText("Tipo:");

        lblnombre.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(79, 107, 155));
        lblnombre.setText("Nombre:");

        txttipo.setForeground(new java.awt.Color(0, 53, 79));
        txttipo.setColorTransparente(true);
        txttipo.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txttipo.setPlaceholder("");

        lblfechacreacion.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        lblfechacreacion.setForeground(new java.awt.Color(79, 107, 155));
        lblfechacreacion.setText("Fecha de Creación:");

        lblfechaexp.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        lblfechaexp.setForeground(new java.awt.Color(79, 107, 155));
        lblfechaexp.setText("Fecha de expiración:");

        txtnombre.setForeground(new java.awt.Color(0, 53, 79));
        txtnombre.setColorTransparente(true);
        txtnombre.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtnombre.setPlaceholder("");
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbltipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblfechacreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblfechaexp, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbltipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblfechaexp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lblfechacreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 590, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked

    int opcion = JOptionPane.showOptionDialog(
            null,
            "¿Está seguro de eliminar esta vacuna del sistema?",
            "Eliminar vacuna",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[] {"Sí", "No"},
            "No");

    if (opcion == JOptionPane.YES_OPTION) {
        String nombreVacuna = txtnombre.getText().trim();
        
        if (nombreVacuna.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre de la vacuna está vacío. No se puede eliminar.");
        } else {
            conexion Base = new conexion();
            bdVacuna miVacuna = new bdVacuna(Base);
           
            miVacuna.eliminar(nombreVacuna);
            
            JOptionPane.showMessageDialog(null, "Vacuna eliminada exitosamente.");
            
            txtnombre.setText("");
            txttipo.setText("");
            jDateChooser1.setDate(null);
            jDateChooser2.setDate(null);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Operación de eliminación cancelada.");
    }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
      
     String nombreVacuna = txtnombre.getText().trim();
    if (nombreVacuna.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese el nombre de la vacuna");
        return; 
    }
    conexion Base = new conexion();
    bdVacuna miVacuna = new bdVacuna(Base);

    boolean vacunaExiste = miVacuna.verificarVacuna(nombreVacuna); 
    
    if (vacunaExiste) {
         JOptionPane.showMessageDialog(null, "Vacuna Encontrada");
        btnBuscar.setVisible(false);
        btnEliminar.setVisible(true);
        btnEditar.setVisible(true);
         lbltipo.setVisible(true);
        txttipo.setVisible(true);
        txtnombre.setVisible(true);
        lblnombre.setVisible(true);
        lblfechacreacion.setVisible(true);
        lblfechaexp.setVisible(true);
        jDateChooser1.setVisible(true);
        jDateChooser2.setVisible(true);
         txtnombre.setEditable(false);
       miVacuna.cargarVacuna(nombreVacuna, (RSMTextFull)txtnombre, txttipo, jDateChooser1, jDateChooser2);
       
    } else {
        JOptionPane.showMessageDialog(null, "La vacuna no se encuentra en la base de datos");
    }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
       
        if (txttipo.getText().isBlank() || txtnombre.getText().isBlank() || jDateChooser1.getDate() == null || jDateChooser2.getDate() == null) {
        JOptionPane.showMessageDialog(null, "No dejar espacios en blanco ni fechas sin seleccionar");
    } else {
        conexion Base = new conexion();
        bdVacuna miVacunitarem = new bdVacuna(Base);
        
     miVacunitarem.editar( txtnombre.getText().trim(), txttipo.getText().trim(), jDateChooser1.getDate(),jDateChooser2.getDate()     );
     resetCampos();
    
   }   
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        if (txttipo.getText().isBlank() || txtnombre.getText().isBlank() || jDateChooser1.getDate() == null ||  jDateChooser2.getDate() == null) {
   JOptionPane.showMessageDialog(null, "No dejar espacios en blanco ni fechas sin seleccionar");
} else {
    conexion Base = new conexion();
    bdVacuna miVacunita = new bdVacuna(Base);

miVacunita.insertar(txttipo.getText().trim(),  txtnombre.getText().trim(), jDateChooser1.getDate(),  jDateChooser2.getDate());
resetCampos();

        }
    }//GEN-LAST:event_btnGuardarMouseClicked
private void resetCampos() {
    txtnombre.setText("");
    txttipo.setText("");
    jDateChooser1.setDate(null);
    jDateChooser2.setDate(null);
}
    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnBuscar;
    private rojeru_san.RSButtonRiple btnEditar;
    private rojeru_san.RSButtonRiple btnEliminar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblfechacreacion;
    private javax.swing.JLabel lblfechaexp;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltipo;
    private rojeru_san.RSMTextFull txtnombre;
    private rojeru_san.RSMTextFull txttipo;
    // End of variables declaration//GEN-END:variables
}
