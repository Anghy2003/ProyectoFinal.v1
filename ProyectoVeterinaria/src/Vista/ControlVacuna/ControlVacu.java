
package Vista.ControlVacuna;

import Modelo.bdControlvacu;
import Modelo.conexion;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;



public class ControlVacu extends javax.swing.JPanel {

    public JComboBox<String> getCmbVacunas() {
        return cmbVacunas;
    }

    public void setCmbVacunas(JComboBox<String> cmbVacunas) {
        this.cmbVacunas = cmbVacunas;
    }

    public JComboBox<String> getCmbMascota() {
        return cmbMascota;
    }

    public void setCmbMascota(JComboBox<String> cmbMascota) {
        this.cmbMascota = cmbMascota;
    }

   
    public ControlVacu() {
        initComponents();
                int opcion = JOptionPane.showOptionDialog(
            null, 
            "¿  El Control de la Vacuna ya se encuentra registrado en el sistema?", 
            "Consulta de vacunas", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            new Object[] {"Sí", "No"}, 
            "Sí");

    // Manejar las respuestas
    if (opcion == JOptionPane.YES_OPTION) {
       btnGuardar.setVisible(false);
        btnEliminar.setVisible(false);
        btnEditar.setVisible(false);
        btnBuscar.setVisible(true);
        lblid.setVisible(true);
        cmbId.setVisible(true);
        lbldosis.setVisible(false);
        txtDOsis.setVisible(false);
        lblfecha.setVisible(false);
        jDateChooser1.setVisible(false);
        lblmasco.setVisible(false);
        cmbMascota.setVisible(false);
        lblvacu.setVisible(false);
        cmbVacunas.setVisible(false);
      

    } else if (opcion == JOptionPane.NO_OPTION) {
        btnGuardar.setVisible(true);
        btnEliminar.setVisible(false);
        btnEditar.setVisible(false);
        btnBuscar.setVisible(false);
        lblid.setVisible(false);
        cmbId.setVisible(false);
        lbldosis.setVisible(true);
        txtDOsis.setVisible(true);
        lblfecha.setVisible(true);
        jDateChooser1.setVisible(true);
        lblmasco.setVisible(true);
        cmbMascota.setVisible(true);
        lblvacu.setVisible(true);
        cmbVacunas.setVisible(true);
        

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
        lbldosis = new javax.swing.JLabel();
        txtDOsis = new rojeru_san.RSMTextFull();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblmasco = new javax.swing.JLabel();
        cmbMascota = new javax.swing.JComboBox<>();
        lblfecha = new javax.swing.JLabel();
        lblvacu = new javax.swing.JLabel();
        cmbVacunas = new javax.swing.JComboBox<>();
        lblid = new javax.swing.JLabel();
        cmbId = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(183, 224, 210));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(79, 107, 155));
        jLabel2.setText("Registro del Control de  Vacunas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 460, 40));

        jPanel6.setBackground(new java.awt.Color(183, 224, 210));

        btnEliminar.setBackground(new java.awt.Color(204, 51, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Regresar a la lista de Vehiculos");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 153, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("Verificar y rellenar todos los campos");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 153, 255));
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Verificar y rellenar todos los campos");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 204, 51));
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Verificar y rellenar todos los campos");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(183, 224, 210));
        jPanel4.setForeground(new java.awt.Color(183, 224, 210));

        lbldosis.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        lbldosis.setForeground(new java.awt.Color(79, 107, 155));
        lbldosis.setText("Dosis:");

        txtDOsis.setForeground(new java.awt.Color(0, 53, 79));
        txtDOsis.setColorTransparente(true);
        txtDOsis.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtDOsis.setPlaceholder("");

        lblmasco.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        lblmasco.setForeground(new java.awt.Color(79, 107, 155));
        lblmasco.setText("Mascota:");

        cmbMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbMascotaMouseClicked(evt);
            }
        });

        lblfecha.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(79, 107, 155));
        lblfecha.setText("Fecha:");

        lblvacu.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        lblvacu.setForeground(new java.awt.Color(79, 107, 155));
        lblvacu.setText("Vacuna:");

        cmbVacunas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbVacunas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbVacunasMouseClicked(evt);
            }
        });

        lblid.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        lblid.setForeground(new java.awt.Color(79, 107, 155));
        lblid.setText("Id:");

        cmbId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbIdMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmasco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblvacu, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbVacunas, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldosis)
                            .addComponent(lblid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDOsis, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cmbId, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbldosis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDOsis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbVacunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblvacu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmasco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(482, 482, 482))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 653, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 600, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
String idControlVacuna = cmbId.getSelectedItem().toString().trim();

    if (idControlVacuna.isEmpty() || idControlVacuna.equals("No hay controles de vacunas registrados")) {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione un control de vacuna válido");
        return;
    }

    int opcion = JOptionPane.showOptionDialog(
            null,
            "¿Está seguro de eliminar este control de vacuna?",
            "Eliminar control de vacuna",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[] {"Sí", "No"},
            "No");

    if (opcion == JOptionPane.YES_OPTION) {
        conexion Base = new conexion();
        bdControlvacu controlVacuna = new bdControlvacu(Base);

        // Eliminar el control de vacuna
        controlVacuna.eliminar(idControlVacuna);
    } else {
        JOptionPane.showMessageDialog(null, "Operación de eliminación cancelada.");
    }


    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
String idControlVacuna = cmbId.getSelectedItem().toString().trim();

    if (idControlVacuna.isEmpty() || idControlVacuna.equals("No hay controles de vacunas registrados")) {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione un control de vacuna válido");
        return;
    }

    conexion Base = new conexion();
    bdControlvacu controlVacuna = new bdControlvacu(Base);

    if (controlVacuna.verificarControlVacuna(idControlVacuna)) {
        // Cargar los datos en los campos correspondientes
        controlVacuna.cargarControlVacuna(idControlVacuna, cmbVacunas, cmbMascota, txtDOsis, jDateChooser1);
        
        // Hacer visibles los botones para editar y eliminar
        btnEditar.setVisible(true);
        btnEliminar.setVisible(true);
        // Hacer visibles los campos de texto para modificar
        lbldosis.setVisible(true);
        lblvacu.setVisible(true);
        lblmasco.setVisible(true);
        lblfecha.setVisible(true);
        txtDOsis.setVisible(true);
        cmbVacunas.setVisible(true);
        cmbMascota.setVisible(true);
        jDateChooser1.setVisible(true);
        btnBuscar.setVisible(false);
        lblid.setVisible(false);
        cmbId.setVisible(false);
        
    } else {
        JOptionPane.showMessageDialog(null, "Control de vacuna no encontrado");
    }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
String idControlVacuna = cmbId.getSelectedItem().toString().trim();
    String dosisText = txtDOsis.getText().trim();
    Date fecha = jDateChooser1.getDate();
    String idVacuna = cmbVacunas.getSelectedItem().toString().split(" ")[0]; // Obtener el ID de la vacuna
    String idMascota = cmbMascota.getSelectedItem().toString().split(" ")[0]; // Obtener el ID de la mascota

    if (dosisText.isBlank() || fecha == null || idVacuna.isBlank() || idMascota.isBlank()) {
        JOptionPane.showMessageDialog(null, "No dejar espacios en blanco ni fechas sin seleccionar");
        return;
    }

    try {
        int dosis = Integer.parseInt(dosisText); // Convertir dosis a número

        // Validar si el control de vacuna existe
        conexion Base = new conexion();
        bdControlvacu controlVacuna = new bdControlvacu(Base);

        if (controlVacuna.verificarControlVacuna(idControlVacuna)) {
            // Editar el control de vacuna
            controlVacuna.editarControlVacuna(idControlVacuna, dosis, fecha, idVacuna, idMascota);
            resetCampos();
        } else {
            JOptionPane.showMessageDialog(null, "El control de vacuna no existe");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "La dosis debe ser un número válido");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
    }
    }//GEN-LAST:event_btnEditarMouseClicked
private void resetCampos() {
    // Limpiar los campos de texto
    txtDOsis.setText("");
    // Limpiar los ComboBoxes (vacuna y mascota)
    cmbVacunas.setSelectedIndex(0);  // Restablece el ComboBox a la primera opción
    cmbMascota.setSelectedIndex(0);  // Restablece el ComboBox a la primera opción
    // Limpiar el JDateChooser
    jDateChooser1.setDate(null);  // Borra la fecha seleccionada
    // Si tienes otros campos de texto o controles, también deberías limpiarlos
}
    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
         if (txtDOsis.getText().isBlank() || jDateChooser1.getDate() == null || cmbVacunas.getSelectedItem() == null || cmbMascota.getSelectedItem() == null) {
        JOptionPane.showMessageDialog(null, "NO DEJAR ESPACIOS EN BLANCO NI CAMPOS SIN SELECCIONAR");
    } else {
        try {
            int DOSIS = Integer.parseInt(txtDOsis.getText().trim()); // Convertir dosis a número
            Date FECHA = jDateChooser1.getDate(); // Obtener la fecha seleccionada

            // Obtener valores de los ComboBox
            String VACUNA_SELECCIONADA = cmbVacunas.getSelectedItem().toString();
            String MASCOTA_SELECCIONADA = cmbMascota.getSelectedItem().toString();

            // Extraer directamente los IDs de los ComboBox
            String ID_VACUNA = VACUNA_SELECCIONADA.split(" ")[0]; // ID de la vacuna
            String ID_MASCOTA = MASCOTA_SELECCIONADA.split(" ")[0]; // ID de la mascota

            // Validar que los IDs no estén vacíos
            if (ID_VACUNA.isBlank() || ID_MASCOTA.isBlank()) {
                JOptionPane.showMessageDialog(null, "SELECCIONE UNA VACUNA Y UNA MASCOTA VÁLIDAS");
                return;
            }

            conexion Base = new conexion();
    bdControlvacu miVacunita = new bdControlvacu(Base);

            miVacunita.INSERTAR(DOSIS, FECHA, ID_VACUNA, ID_MASCOTA);
            resetCampos();

        } catch (NumberFormatException E) {
            JOptionPane.showMessageDialog(null, "LA DOSIS DEBE SER UN NÚMERO VÁLIDO");
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "ERROR INESPERADO: " + E.getMessage());
        }
    }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void cmbVacunasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbVacunasMouseClicked
        conexion Base = new conexion();
        bdControlvacu masDb = new bdControlvacu(Base);
        masDb.ComboboxVacuna(cmbVacunas);
    }//GEN-LAST:event_cmbVacunasMouseClicked

    private void cmbMascotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbMascotaMouseClicked
        conexion Base = new conexion();
        bdControlvacu masDb = new bdControlvacu(Base);
        masDb.ComboboxMascota(cmbMascota);
    }//GEN-LAST:event_cmbMascotaMouseClicked

    private void cmbIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbIdMouseClicked
       conexion Base = new conexion();
        bdControlvacu masDb = new bdControlvacu(Base);
        masDb.ComboboxControlVacuna(cmbId);
    }//GEN-LAST:event_cmbIdMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnBuscar;
    private rojeru_san.RSButtonRiple btnEditar;
    private rojeru_san.RSButtonRiple btnEliminar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private javax.swing.JComboBox<String> cmbId;
    private javax.swing.JComboBox<String> cmbMascota;
    private javax.swing.JComboBox<String> cmbVacunas;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbldosis;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblmasco;
    private javax.swing.JLabel lblvacu;
    private rojeru_san.RSMTextFull txtDOsis;
    // End of variables declaration//GEN-END:variables
}
