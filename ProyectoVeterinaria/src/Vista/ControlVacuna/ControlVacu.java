
package Vista.ControlVacuna;

import Modelo.bdControlvacu;
import Modelo.conexion;
import Vista.menu.Menu;
import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;
import rojeru_san.RSButtonRiple;
import rojeru_san.RSMTextFull;



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
        lbldueno.setVisible(true);
        txtdueno.setVisible(true);
        lbldosis.setVisible(false);
        lblmasco1.setVisible(true);
        cmbMascota.setVisible(true);
        txtDOsis.setVisible(false);
        lblfecha.setVisible(false);
        jDateChooser1.setVisible(false);
        lblvacu.setVisible(false);
        cmbVacunas.setVisible(false);
      

    } else if (opcion == JOptionPane.NO_OPTION) {
        btnGuardar.setVisible(true);
        btnEliminar.setVisible(false);
        btnEditar.setVisible(false);
        btnBuscar.setVisible(false);
        lbldueno.setVisible(false);
        txtdueno.setVisible(true);
        lbldosis.setVisible(true);
        txtDOsis.setVisible(true);
        lblfecha.setVisible(true);
        jDateChooser1.setVisible(true);
        lbldueno.setVisible(true);
        cmbMascota.setVisible(true);
        lblvacu.setVisible(true);
        cmbVacunas.setVisible(true);
        conexion Base = new conexion();
        bdControlvacu masDb = new bdControlvacu(Base);
        masDb.ComboboxVacuna(cmbVacunas);
        jTable1.setVisible(false);
        jDateChooser1.setDate(new Date());
        bdControlvacu.bloquearFechaMaxima(jDateChooser1);
        cmbMascota.setVisible(false);
        lblmasco1.setVisible(false);
        

    } else {
        JOptionPane.showMessageDialog(null, "No seleccionaste ninguna opción.");
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
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
        lbldueno = new javax.swing.JLabel();
        cmbMascota = new javax.swing.JComboBox<>();
        lblfecha = new javax.swing.JLabel();
        lblvacu = new javax.swing.JLabel();
        cmbVacunas = new javax.swing.JComboBox<>();
        lblmasco1 = new javax.swing.JLabel();
        txtdueno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblIdOculto = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        pnlLogo.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogo.setForeground(new java.awt.Color(204, 204, 204));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOPL.png"))); // NOI18N

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogoLayout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(78, 106, 163)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(79, 107, 155));
        jLabel2.setText("Registro del Control de  Vacunas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 510, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(183, 224, 210));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(77, 104, 151)));

        btnEliminar.setBackground(new java.awt.Color(183, 224, 210));
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Regresar a la lista de Vehiculos");
        btnEliminar.setColorText(new java.awt.Color(77, 104, 151));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(183, 224, 210));
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("Verificar y rellenar todos los campos");
        btnBuscar.setColorText(new java.awt.Color(77, 104, 151));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(183, 224, 210));
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Verificar y rellenar todos los campos");
        btnEditar.setColorText(new java.awt.Color(77, 104, 151));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(183, 224, 210));
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Verificar y rellenar todos los campos");
        btnGuardar.setColorText(new java.awt.Color(77, 104, 151));
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

        lbldueno.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        lbldueno.setForeground(new java.awt.Color(79, 107, 155));
        lbldueno.setText("Cedula Del Dueño:");

        cmbMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin registros" }));
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

        cmbVacunas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin registros" }));
        cmbVacunas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbVacunasMouseClicked(evt);
            }
        });

        lblmasco1.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        lblmasco1.setForeground(new java.awt.Color(79, 107, 155));
        lblmasco1.setText("Mascota:");

        txtdueno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtduenoKeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbldosis)
                                    .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblvacu)
                                .addGap(11, 11, 11)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbVacunas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDOsis, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIdOculto))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblmasco1)
                                    .addComponent(lbldueno))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtdueno, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDOsis, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldosis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdOculto))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbVacunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblvacu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldueno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdueno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblmasco1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cmbMascota)
                        .addGap(6, 6, 6)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btnRegresar.setBackground(new java.awt.Color(183, 224, 210));
        btnRegresar.setForeground(new java.awt.Color(78, 108, 152));
        btnRegresar.setText("Regresar");
        btnRegresar.setToolTipText("NO CAMBIAR");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresar)
                .addContainerGap(118, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 680, 430));

        btnSalir.setBackground(new java.awt.Color(183, 224, 210));
        btnSalir.setForeground(new java.awt.Color(78, 108, 152));
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
//String idControlVacuna = cmbId.getSelectedItem().toString().trim();
//
//    if (idControlVacuna.isEmpty() || idControlVacuna.equals("No hay controles de vacunas registrados")) {
//        JOptionPane.showMessageDialog(null, "Por favor, seleccione un control de vacuna válido");
//        return;
//    }
//
//    int opcion = JOptionPane.showOptionDialog(
//            null,
//            "¿Está seguro de eliminar este control de vacuna?",
//            "Eliminar control de vacuna",
//            JOptionPane.YES_NO_OPTION,
//            JOptionPane.QUESTION_MESSAGE,
//            null,
//            new Object[] {"Sí", "No"},
//            "No");
//
//    if (opcion == JOptionPane.YES_OPTION) {
//        conexion Base = new conexion();
//        bdControlvacu controlVacuna = new bdControlvacu(Base);
//
//        // Eliminar el control de vacuna
//        controlVacuna.eliminar(idControlVacuna);
//    } else {
//        JOptionPane.showMessageDialog(null, "Operación de eliminación cancelada.");
//    }


    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        int idSeleccionado = obtenerIdDeFilaSeleccionada(jTable1);
        if (idSeleccionado != -1) {
            txtDOsis.setVisible(true);
        lbldosis.setVisible(true);
        jDateChooser1.setVisible(true);
        lblfecha.setVisible(true);
        cmbVacunas.setVisible(true);
        lblvacu.setVisible(true);
        cmbMascota.setVisible(true);
        lblmasco1.setVisible(true);
        btnBuscar.setVisible(false);
        btnEditar.setVisible(true);
        btnEliminar.setVisible(true);
        conexion Base = new conexion();
        bdControlvacu masDb = new bdControlvacu(Base);
        
        masDb.cargarDatosPorId(idSeleccionado, txtDOsis, jDateChooser1, cmbVacunas, cmbMascota, txtdueno);
        
        
        
        
        
        } 
        
        
        
                

    }//GEN-LAST:event_btnBuscarMouseClicked

    
    private boolean verificarCedulaValida(String cedula) {
    if (cedula == null || cedula.trim().isEmpty()) {
        return false;
    }

    cedula = cedula.trim();
    if (!cedula.matches("\\d+")) {
        return false;
    }

    // Verificar longitud (ejemplo: 10 caracteres)
    if (cedula.length() != 10) {
        return false;
    }

    return true;
}

    
    
    
    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
//String idControlVacuna = cmbId.getSelectedItem().toString().trim();
//    String dosisText = txtDOsis.getText().trim();
//    Date fecha = jDateChooser1.getDate();
//    String idVacuna = cmbVacunas.getSelectedItem().toString().split(" ")[0]; // Obtener el ID de la vacuna
//    String idMascota = cmbMascota.getSelectedItem().toString().split(" ")[0]; // Obtener el ID de la mascota
//
//    if (dosisText.isBlank() || fecha == null || idVacuna.isBlank() || idMascota.isBlank()) {
//        JOptionPane.showMessageDialog(null, "No dejar espacios en blanco ni fechas sin seleccionar");
//        return;
//    }
//
//    try {
//        int dosis = Integer.parseInt(dosisText); // Convertir dosis a número
//
//        // Validar si el control de vacuna existe
//        conexion Base = new conexion();
//        bdControlvacu controlVacuna = new bdControlvacu(Base);
//
//        if (controlVacuna.verificarControlVacuna(idControlVacuna)) {
//            // Editar el control de vacuna
//            controlVacuna.editarControlVacuna(idControlVacuna, dosis, fecha, idVacuna, idMascota);
//            resetCampos();
//        } else {
//            JOptionPane.showMessageDialog(null, "El control de vacuna no existe");
//        }
//    } catch (NumberFormatException e) {
//        JOptionPane.showMessageDialog(null, "La dosis debe ser un número válido");
//    } catch (Exception e) {
//        JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
//    }
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
//        conexion Base = new conexion();
//        bdControlvacu masDb = new bdControlvacu(Base);
//        masDb.ComboboxMascota(cmbMascota);
    }//GEN-LAST:event_cmbMascotaMouseClicked

    public RSButtonRiple getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(RSButtonRiple btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public RSButtonRiple getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(RSButtonRiple btnEditar) {
        this.btnEditar = btnEditar;
    }

    public RSButtonRiple getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(RSButtonRiple btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public RSButtonRiple getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(RSButtonRiple btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JButton getBtnRegresar() {
        return btnRegresar;
    }

    public void setBtnRegresar(JButton btnRegresar) {
        this.btnRegresar = btnRegresar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    

    public JDateChooser getjDateChooser1() {
        return jDateChooser1;
    }

    public void setjDateChooser1(JDateChooser jDateChooser1) {
        this.jDateChooser1 = jDateChooser1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public JPanel getjPanel6() {
        return jPanel6;
    }

    public void setjPanel6(JPanel jPanel6) {
        this.jPanel6 = jPanel6;
    }

    public JLabel getLbldosis() {
        return lbldosis;
    }

    public void setLbldosis(JLabel lbldosis) {
        this.lbldosis = lbldosis;
    }

    public JLabel getLblfecha() {
        return lblfecha;
    }

    public void setLblfecha(JLabel lblfecha) {
        this.lblfecha = lblfecha;
    }

   

    public JLabel getLblmasco() {
        return lbldueno;
    }

    public void setLblmasco(JLabel lblmasco) {
        this.lbldueno = lblmasco;
    }

    public JLabel getLblvacu() {
        return lblvacu;
    }

    public void setLblvacu(JLabel lblvacu) {
        this.lblvacu = lblvacu;
    }

    public static JPanel getPnlLogo() {
        return pnlLogo;
    }

    public static void setPnlLogo(JPanel pnlLogo) {
        ControlVacu.pnlLogo = pnlLogo;
    }

    public RSMTextFull getTxtDOsis() {
        return txtDOsis;
    }

    public void setTxtDOsis(RSMTextFull txtDOsis) {
        this.txtDOsis = txtDOsis;
    }

    public ComponentUI getUi() {
        return ui;
    }

    public void setUi(ComponentUI ui) {
        this.ui = ui;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }

    
    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        jPanel1.setVisible(false);
        Mostrarpanelcrud(pnlLogo);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
   
        // Hacer visibles los botones para editar y eliminar
        btnEditar.setVisible(true);
        btnEliminar.setVisible(true);
        // Hacer visibles los campos de texto para modificar
        lbldosis.setVisible(true);
        lblvacu.setVisible(true);
        lbldueno.setVisible(true);
        lblfecha.setVisible(true);
        txtDOsis.setVisible(true);
        cmbVacunas.setVisible(true);
        cmbMascota.setVisible(true);
        jDateChooser1.setVisible(true);
        btnBuscar.setVisible(false);
       
        
    
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cargarComboBoxMascotas(String cedula) {
    // Crear la instancia de la conexión y de MascotaDb
    conexion Base = new conexion(); // Clase conexión
    bdControlvacu masDb = new bdControlvacu(Base); // Clase de operaciones con mascotas

    // Llamar al método que llena el comboBox con las mascotas
    masDb.llenarComboBoxMascotasPorDueño(cmbMascota, cedula);
}
    
    
    
    
    
  
    private void txtduenoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtduenoKeyReleased
      char c = evt.getKeyChar();
    // Verificar si el carácter ingresado no es un número o si es Backspace
    if (!Character.isDigit(c) && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
        evt.consume(); // Ignorar el evento si no es un número
    } else {
        // Obtener el texto actual del JTextField
        String cedula = txtdueno.getText().trim();

        // Verificar si la longitud es mayor o igual a 10 (asumiendo una cédula válida)
        if (cedula.length() > 10) {
            cargarComboBoxMascotas(cedula); // Llama al método para llenar el comboBox
        } else {
          // Actualizar la lista de mascotas
                conexion Base = new conexion();
                bdControlvacu cVac = new bdControlvacu(Base);
                cVac.mostrarVacunasMascotasYDuenoPorCedula(jTable1, cedula);
                cargarComboBoxMascotas(cedula); // Llama al método para llenar el comboBox
                if (cedula.length()==10) {
                    bdControlvacu Db = new bdControlvacu(Base);
            Db.cargarControlVacunaPorCedula(txtdueno.getText().trim(), jTable1);
                
            }
            
        }
    }
    }//GEN-LAST:event_txtduenoKeyReleased

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int idSeleccionado = obtenerIdDeFilaSeleccionada(jTable1);
        if (idSeleccionado != -1) {
        } else {
            // Manejar el caso en que no se seleccionó ninguna fila o hubo un error
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        btnGuardar.setVisible(false);
        btnEliminar.setVisible(false);
        btnEditar.setVisible(false);
        btnBuscar.setVisible(true);
        lbldueno.setVisible(true);
        txtdueno.setVisible(true);
        lbldosis.setVisible(false);
        lblmasco1.setVisible(true);
        cmbMascota.setVisible(true);
        txtDOsis.setVisible(false);
        lblfecha.setVisible(false);
        jDateChooser1.setVisible(false);
        lblvacu.setVisible(false);
        cmbVacunas.setVisible(false);
        cmbMascota.setVisible(false);
        lblmasco1.setVisible(false);
      
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
 try {
        // Obtener el ID desde el label oculto
        int id = Integer.parseInt(lblIdOculto.getText());

        if (id != -1) { // Verificamos que el ID sea válido
            // Obtener la dosis desde el JTextField
            String dosis = txtDOsis.getText().trim();
            if (dosis.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese la dosis.");
                return;
            }

            // Obtener la fecha desde el JDateChooser
            Date fecha = jDateChooser1.getDate();
            if (fecha == null) {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione una fecha.");
                return;
            }

            // Obtener el nombre de la vacuna desde el JComboBox
            String vacuna = (String) cmbVacunas.getSelectedItem();
            if (vacuna == null || vacuna.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione una vacuna.");
                return;
            }

            // Obtener la cédula del dueño desde el JTextField
            String cedulaDueno = txtdueno.getText().trim();
            if (cedulaDueno.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese la cédula del dueño.");
                return;
            }

            // Crear la instancia del objeto que maneja la base de datos
            bdControlvacu bd = new bdControlvacu();

            // Llamar al método editarDatosPorId con los parámetros correctos
            boolean resultado = bd.editarDatosPorId(id, dosis, fecha, vacuna, cedulaDueno);
            if (resultado) {
                JOptionPane.showMessageDialog(null, "Datos editados correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al editar los datos.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un registro válido para editar.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener los datos, verifique los valores.");
        e.printStackTrace();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado.");
        e.printStackTrace();
    }

    }//GEN-LAST:event_btnEditarActionPerformed

    
    
    public int obtenerIdDeFilaSeleccionada(JTable table) {
    // Obtener el índice de la fila seleccionada
    int rowIndex = table.getSelectedRow();
    
    // Verificar si se ha seleccionado una fila
    if (rowIndex != -1) {
        // Obtener el valor de la columna "ID" (supongamos que es la primera columna)
        // Cambiar el índice de columna si "ID" no está en la primera posición (índice 0)
        Object idValue = table.getValueAt(rowIndex, 0); // 0 es el índice de la columna "ID"
        lblIdOculto.setText(idValue.toString());
        System.out.println("id valorsito: "+ idValue);
        
        // Verificar si el valor de la columna "ID" es de tipo Integer
        if (idValue instanceof Integer) {
            return (Integer) idValue;
        } else {
            // Si el tipo no es Integer, convertirlo o manejar el error
            JOptionPane.showMessageDialog(null, "El valor de la columna ID no es un número entero.");
            return -1; // Valor de error
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una fila en la Tabla");
        return -1; // Valor de error
    }
}

    
    
    private void Mostrarpanelcrud(JPanel p) {
        p.setSize(700, 460);
        p.setLocation(0, 0);
        Menu.PanelPrincipal.removeAll();
        Menu.PanelPrincipal.add(p, BorderLayout.CENTER);
        Menu.PanelPrincipal.revalidate();
        Menu.PanelPrincipal.repaint();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnBuscar;
    private rojeru_san.RSButtonRiple btnEditar;
    private rojeru_san.RSButtonRiple btnEliminar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbMascota;
    private javax.swing.JComboBox<String> cmbVacunas;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblIdOculto;
    private javax.swing.JLabel lbldosis;
    private javax.swing.JLabel lbldueno;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblmasco1;
    private javax.swing.JLabel lblvacu;
    public static javax.swing.JPanel pnlLogo;
    private rojeru_san.RSMTextFull txtDOsis;
    private javax.swing.JTextField txtdueno;
    // End of variables declaration//GEN-END:variables
}
