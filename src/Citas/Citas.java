/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Citas;

import Conexion.Conexion_db;
import Models.Cliente;
import Models.DetalleCita;
import Models.EncabezadoCita;
import Models.Mecanico;
import Models.Servicios;
import Models.Vehiculo;
import Vista.Cruds.CRUDS1.CrudPanelCliente;
import Vista.Cruds.CRUDS1.CrudPanelMecanico;
import Vista.Cruds.CrudPanelVehiculo;
import Vista.Menu.VistaMenu;
import static Vista.Menu.VistaMenu.PanelPrincipal;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Citas extends javax.swing.JPanel {

    public Citas() {
        initComponents();
        mostrarTablaServicios();
        txtcodigoCita.setEnabled(false);
        txtdireccionCli.setEnabled(false);
        txtNombreCli.setEnabled(false);
        txtCelularCli.setEnabled(false);
        txtModeloVehi.setEnabled(false);
        txtMarcaVehi.setEnabled(false);
        txtNombreMeca.setEnabled(false);
        txtCelularMeca.setEnabled(false);
    }

    private void MostarpanelCruds(JPanel p) {
        p.setSize(890, 630);
        p.setLocation(0, 0);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(p, BorderLayout.CENTER);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TablaServicios = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblServicios = new javax.swing.JTable();
        txtBuscarServicio = new rojeru_san.RSMTextFull();
        jLabel8 = new javax.swing.JLabel();
        btnBuscarServicio = new rsbuttongradiente.RSButtonGradiente();
        btnInsetarServicios = new rsbuttongradiente.RSButtonGradiente();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblDireccion = new javax.swing.JLabel();
        lblDatosCli = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        btnBuscarVehiculo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtableCita = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnResibo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblcedula = new javax.swing.JLabel();
        txtPlacaVehi = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        txtMarcaVehi = new javax.swing.JTextField();
        txtcodigoCita = new javax.swing.JTextField();
        lblcodFac1 = new javax.swing.JLabel();
        btnFinalizarCita = new rojeru_san.RSButton();
        btnAñadirServicos = new javax.swing.JButton();
        lblverlis = new javax.swing.JLabel();
        lblDatosCli1 = new javax.swing.JLabel();
        lblcedula1 = new javax.swing.JLabel();
        txtcedulaCli = new javax.swing.JTextField();
        lblNombre2 = new javax.swing.JLabel();
        txtNombreCli = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        lblDireccion1 = new javax.swing.JLabel();
        txtdireccionCli = new javax.swing.JTextField();
        lblDireccion2 = new javax.swing.JLabel();
        txtCelularCli = new javax.swing.JTextField();
        txtModeloVehi = new javax.swing.JTextField();
        lblDatosCli2 = new javax.swing.JLabel();
        lblcedula2 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        txtNombreMeca = new javax.swing.JTextField();
        txtcedulaMeca = new javax.swing.JTextField();
        lblDireccion4 = new javax.swing.JLabel();
        txtCelularMeca = new javax.swing.JTextField();
        btnBuscaMecanico = new javax.swing.JButton();
        jDateFechaCita = new com.toedter.calendar.JDateChooser();
        btnFinalizarCita1 = new rojeru_san.RSButton();
        lblverlis1 = new javax.swing.JLabel();
        lblverlis2 = new javax.swing.JLabel();
        lblverlis3 = new javax.swing.JLabel();
        lblCuadro1 = new javax.swing.JLabel();
        lblCuadro2 = new javax.swing.JLabel();
        lblCuadro = new javax.swing.JLabel();
        lblTituloFac = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        jLabel7.setText("Listado Servicios");

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane5.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setToolTipText("");
        jScrollPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tblServicios.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tblServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tblServicios);

        txtBuscarServicio.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        txtBuscarServicio.setPlaceholder("ejm. Ser-01");

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel8.setText("Buscar");

        btnBuscarServicio.setText("Buscar");
        btnBuscarServicio.setColorPrimario(new java.awt.Color(0, 51, 153));
        btnBuscarServicio.setColorPrimarioHover(new java.awt.Color(51, 0, 255));
        btnBuscarServicio.setColorSecundario(new java.awt.Color(51, 153, 255));
        btnBuscarServicio.setColorSecundarioHover(new java.awt.Color(153, 204, 255));
        btnBuscarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarServicioActionPerformed(evt);
            }
        });

        btnInsetarServicios.setText("Insertar");
        btnInsetarServicios.setColorPrimario(new java.awt.Color(0, 153, 51));
        btnInsetarServicios.setColorPrimarioHover(new java.awt.Color(0, 204, 102));
        btnInsetarServicios.setColorSecundario(new java.awt.Color(0, 255, 51));
        btnInsetarServicios.setColorSecundarioHover(new java.awt.Color(153, 204, 255));
        btnInsetarServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsetarServiciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(39, 39, 39)
                                .addComponent(txtBuscarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnInsetarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 254, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuscarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnBuscarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnInsetarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8)))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TablaServiciosLayout = new javax.swing.GroupLayout(TablaServicios.getContentPane());
        TablaServicios.getContentPane().setLayout(TablaServiciosLayout);
        TablaServiciosLayout.setHorizontalGroup(
            TablaServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 863, Short.MAX_VALUE)
            .addGroup(TablaServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TablaServiciosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        TablaServiciosLayout.setVerticalGroup(
            TablaServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
            .addGroup(TablaServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TablaServiciosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(0, 53, 79));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDireccion.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblDireccion.setText("Modelo");
        jPanel3.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 60, -1));

        lblDatosCli.setText("Datos Mecanico");
        jPanel3.add(lblDatosCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 20));

        lblFecha.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblFecha.setText("Fecha:");
        jPanel3.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        btnBuscarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/mas (1).png"))); // NOI18N
        btnBuscarVehiculo.setText("Buscar");
        btnBuscarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVehiculoActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 110, 40));

        JtableCita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Servicio", "Precio del Servicio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JtableCita);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 720, 80));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/registro (1)_1.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 80, 70));

        btnResibo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/impresion.png"))); // NOI18N
        jPanel3.add(btnResibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 80, 70));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/rechazar.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, 80, 70));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-sesion.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel3.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 80, 70));

        lblcedula.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblcedula.setText("Placa");
        jPanel3.add(lblcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtPlacaVehi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaVehiActionPerformed(evt);
            }
        });
        jPanel3.add(txtPlacaVehi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 190, 30));

        lblNombre1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblNombre1.setText("Marca");
        jPanel3.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        jPanel3.add(txtMarcaVehi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 190, -1));

        txtcodigoCita.setToolTipText("AUTOGENERADO");
        jPanel3.add(txtcodigoCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 190, -1));

        lblcodFac1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblcodFac1.setText("N° Cita:");
        jPanel3.add(lblcodFac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, -1));

        btnFinalizarCita.setBackground(new java.awt.Color(255, 0, 0));
        btnFinalizarCita.setText("Cancelar");
        btnFinalizarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCitaActionPerformed(evt);
            }
        });
        jPanel3.add(btnFinalizarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 100, -1));

        btnAñadirServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/mas (1).png"))); // NOI18N
        btnAñadirServicos.setText("Añadir Servicios ");
        btnAñadirServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirServicosActionPerformed(evt);
            }
        });
        jPanel3.add(btnAñadirServicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        lblverlis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblverlis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 740, 90));

        lblDatosCli1.setText("Datos del Cliente");
        jPanel3.add(lblDatosCli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 20));

        lblcedula1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblcedula1.setText("Cedula:");
        jPanel3.add(lblcedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtcedulaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaCliActionPerformed(evt);
            }
        });
        jPanel3.add(txtcedulaCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 190, 30));

        lblNombre2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblNombre2.setText("Nombre");
        jPanel3.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel3.add(txtNombreCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 190, -1));

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/mas (1).png"))); // NOI18N
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 110, 40));

        lblDireccion1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblDireccion1.setText("Direccion:");
        jPanel3.add(lblDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));
        jPanel3.add(txtdireccionCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 220, -1));

        lblDireccion2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblDireccion2.setText("Celular");
        jPanel3.add(lblDireccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));
        jPanel3.add(txtCelularCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 220, -1));
        jPanel3.add(txtModeloVehi, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 220, -1));

        lblDatosCli2.setText("Datos Vehiculo");
        jPanel3.add(lblDatosCli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        lblcedula2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblcedula2.setText("Cedula:");
        jPanel3.add(lblcedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        lblNombre3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblNombre3.setText("Nombre");
        jPanel3.add(lblNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));
        jPanel3.add(txtNombreMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 190, -1));

        txtcedulaMeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaMecaActionPerformed(evt);
            }
        });
        jPanel3.add(txtcedulaMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 190, 30));

        lblDireccion4.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblDireccion4.setText("Celular");
        jPanel3.add(lblDireccion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));
        jPanel3.add(txtCelularMeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 220, -1));

        btnBuscaMecanico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/mas (1).png"))); // NOI18N
        btnBuscaMecanico.setText("Buscar");
        btnBuscaMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaMecanicoActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscaMecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 110, 40));
        jPanel3.add(jDateFechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 220, 30));

        btnFinalizarCita1.setBackground(new java.awt.Color(0, 204, 0));
        btnFinalizarCita1.setText("Finalizar");
        btnFinalizarCita1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCita1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnFinalizarCita1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 100, -1));

        lblverlis1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblverlis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 740, 50));

        lblverlis2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblverlis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 740, 100));

        lblverlis3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblverlis3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 740, 100));

        lblCuadro1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblCuadro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 740, 150));

        lblCuadro2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblCuadro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 120, 490));

        lblCuadro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblCuadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 860, 60));

        lblTituloFac.setBackground(new java.awt.Color(0, 53, 79));
        lblTituloFac.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblTituloFac.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloFac.setText("CITAS MECANICA YINGS AND YAN");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logomini1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTituloFac, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblTituloFac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVehiculoActionPerformed
        if (verificarPlacasRepetidas() == 0) {//si es cero, no existen clientes con esa cedula, mandamos a registro
            txtPlacaVehi.setText("");
            JOptionPane.showMessageDialog(this, "Vehiculo no registrado, por favor registrese");
            CrudPanelVehiculo CrearMivehiculo = new CrudPanelVehiculo();
            ShowpanelCruds(CrearMivehiculo);
        } else {//sino vamos a dejar la cedula en el  textfield

            CargarVehiculo();

        }
    }//GEN-LAST:event_btnBuscarVehiculoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Citas nuevo = new Citas();
        MostarpanelCruds(nuevo);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VistaMenu cancelar = new VistaMenu();
        cancelar.setEnabled(true);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        VistaMenu Salir = new VistaMenu();
        Salir.setEnabled(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnFinalizarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCitaActionPerformed

    }//GEN-LAST:event_btnFinalizarCitaActionPerformed

    private void btnAñadirServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirServicosActionPerformed
if (txtCelularCli.getText().trim().isEmpty()) {
    JOptionPane.showMessageDialog(this, "AGREGUE LOS DATOS DEL CLIENTE");
} else {
    activarJadialogser(TablaServicios);
}

    }//GEN-LAST:event_btnAñadirServicosActionPerformed

    private void txtPlacaVehiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaVehiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaVehiActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        if (verificarExistenciaCliente() == 0) {//si es cero, no existen clientes con esa cedula, mandamos a registro
            txtCelularCli.setText("");
            JOptionPane.showMessageDialog(this, "Cliente no registrado, por favor registrese");
            CrudPanelCliente CrearMiCliente = new CrudPanelCliente();
            ShowpanelCruds(CrearMiCliente);
        } else {//sino vamos a dejar la cedula en el  textfield

            CargarCliente();

        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void txtcedulaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaCliActionPerformed

    private void txtcedulaMecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaMecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaMecaActionPerformed

    private void btnBuscaMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaMecanicoActionPerformed
        if (verificarExistenciaMecanico() == 0) {//si es cero, no existen clientes con esa cedula, mandamos a registro
            txtcedulaMeca.setText("");
            JOptionPane.showMessageDialog(this, "Mecanico no registrado, por favor registrese");
            CrudPanelMecanico CrearMiCliente = new CrudPanelMecanico();
            ShowpanelCruds(CrearMiCliente);
        } else {//sino vamos a dejar la cedula en el  textfield

            CargarMecanico();
        }
    }//GEN-LAST:event_btnBuscaMecanicoActionPerformed

    private void btnBuscarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarServicioActionPerformed

    }//GEN-LAST:event_btnBuscarServicioActionPerformed

    private void btnFinalizarCita1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCita1ActionPerformed
        guardarCita();
    }//GEN-LAST:event_btnFinalizarCita1ActionPerformed

    private void btnInsetarServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsetarServiciosActionPerformed
        seteardatosSer();
        
    }//GEN-LAST:event_btnInsetarServiciosActionPerformed

    public final int verificarExistenciaCliente() {
        Boolean encontrado = false;
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Query cliente = BaseBD.query();//metodo para iniciar una consulta
        cliente.constrain(Cliente.class);//buscaremos en la clase Vehiculo
        cliente.descend("cedula").constrain(txtcedulaCli.getText().toUpperCase()); // verificamos las coincidencias en el atributo especificado
        ObjectSet<Cliente> resultado = cliente.execute();//Ejecutamos la consulta y almacenamos en "resultado"
        int coincidencias = resultado.size();
        BaseBD.close();
        return coincidencias;
    }

    public final int verificarPlacasRepetidas() {
        Boolean encontrado = false;
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Query vehiculo = BaseBD.query();//metodo para iniciar una consulta
        vehiculo.constrain(Vehiculo.class);//buscaremos en la clase Vehiculo
        vehiculo.descend("placa_Vehiculo").constrain(txtPlacaVehi.getText().toUpperCase()); // verificamos las coincidencias en el atributo especificado
        ObjectSet<Vehiculo> resultado = vehiculo.execute();//Ejecutamos la consulta y almacenamos en "resultado"
        int coincidencias = resultado.size();
        BaseBD.close();
        return coincidencias;
    }

    public final int verificarExistenciaMecanico() {
        Boolean encontrado = false;
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Query meca4 = BaseBD.query();//metodo para iniciar una consulta
        meca4.constrain(Mecanico.class);//buscaremos en la clase Vehiculo
        meca4.descend("cedula").constrain(txtcedulaMeca.getText().toUpperCase()); // verificamos las coincidencias en el atributo especificado
        ObjectSet<Mecanico> resultado = meca4.execute();//Ejecutamos la consulta y almacenamos en "resultado"
        int coincidencias = resultado.size();
        BaseBD.close();
        return coincidencias;
    }

    //autoenumerado de citas
    private static String obtenerProximaCita(ObjectContainer db) {
        // Consultar todos los productos
        ObjectSet<EncabezadoCita> result = db.queryByExample(EncabezadoCita.class);

        // Determinar el máximo ID numérico existente
        int auto = 0;
        while (result.hasNext()) {
            EncabezadoCita city = result.next();
            String codigocita = city.getCodigo_encabezadoCita();
            if (codigocita != null && codigocita.startsWith("CITA-")) {
                int id = Integer.parseInt(codigocita.substring(5)); // Extraer la parte numérica del código
                if (id > auto) {
                    auto = id;
                }
            }
        }
        // El próximo ID es el máximo + 1
        int siguienteID = auto + 1;
        // Retornar el nuevo código concatenado con "PRO"
        return "CITA" + siguienteID;
    }

    //settea para numero citas y fecha
    public void setearcitas() {

        ObjectContainer baseBD = Conexion_db.ConectarBD();

        Query citas = baseBD.query();
        citas.constrain(EncabezadoCita.class);
        ObjectSet<EncabezadoCita> resultado = citas.execute();
        for (EncabezadoCita cita : resultado) {
            txtcodigoCita.setText(cita.getCodigo_encabezadoCita());
            txtcodigoCita.setEnabled(false);
            jDateFechaCita.setDate(convertirStringADate(cita.getFecha_encabezadoCita()));
        }
        baseBD.close();
    }

    public static Date convertirStringADate(String fechaString) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return formato.parse(fechaString);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //datos cliente
    public final void CargarCliente() {
        Boolean encontrado = false;

        // Verifica que el campo de búsqueda no esté vacío
        String cedulaBuscar = txtcedulaCli.getText().trim();
        if (cedulaBuscar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una cédula para buscar.");
            return;
        }

        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = null;
        try {
            BaseBD = Conexion_db.ConectarBD();
            Query clienteQuery = BaseBD.query(); // Método para iniciar una consulta
            clienteQuery.constrain(Cliente.class); // Buscaremos en la clase Cliente
            clienteQuery.descend("cedula").constrain(cedulaBuscar); // Verificamos las coincidencias en el atributo especificado
            ObjectSet<Cliente> resultado = clienteQuery.execute(); // Ejecutamos la consulta y almacenamos en "resultado"

            // si s los resultados
            if (!resultado.isEmpty()) {
                for (Cliente cliente : resultado) {
                    // Seteamos en los campos recibiendo del objeto
                    txtcedulaCli.setText(cliente.getCedula());
                    txtNombreCli.setText(cliente.getNombres());
                    txtdireccionCli.setText(cliente.getDireccion());
                    txtCelularCli.setText(cliente.getCelular());

                    encontrado = true;
                    JOptionPane.showMessageDialog(this, "Cliente encontrado");
                    break; // Salimos del bucle una vez encontrado el cliente
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró Cliente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar el cliente: " + e.getMessage());
        } finally {
            if (BaseBD != null) {
                BaseBD.close();
            }
        }
    }

    //cargar vehiculo
    public final void CargarVehiculo() {
        Boolean encontrado = false;
        // Verifica que el campo de búsqueda no esté vacío
        String placaBuscar = txtPlacaVehi.getText().trim();
        if (placaBuscar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una placa para buscar.");
            return;
        }
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = null;
        try {
            BaseBD = Conexion_db.ConectarBD();
            Query query = BaseBD.query(); // Método para iniciar una consulta
            query.constrain(Vehiculo.class); // Buscaremos en la clase Cliente
            query.descend("placa_Vehiculo").constrain(placaBuscar); // Verificamos las coincidencias en el atributo especificado
            ObjectSet<Vehiculo> resultado = query.execute(); // Ejecutamos la consulta y almacenamos en "resultado"

            // si s los resultados
            if (!resultado.isEmpty()) {
                for (Vehiculo car : resultado) {
                    // Seteamos en los campos recibiendo del objeto
                    txtPlacaVehi.setText(car.getPlaca_Vehiculo());
                    txtMarcaVehi.setText(car.getMarca_Vehiculo());
                    txtModeloVehi.setText(car.getModelo_Vehiculo());

                    encontrado = true;
                    JOptionPane.showMessageDialog(this, "Vehiculo encontrado");
                    break; // Salimos del bucle una vez encontrado el cliente
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró Vehiculo");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar el Vehiculo: " + e.getMessage());
        } finally {
            if (BaseBD != null) {
                BaseBD.close();
            }
        }
    }

    //datos mecanico
    public final void CargarMecanico() {
        Boolean encontrado = false;
        // Verifica que el campo de búsqueda no esté vacío
        String cedulaBuscar = txtcedulaMeca.getText().trim();
        if (cedulaBuscar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una cédula para buscar.");
            return;
        }

        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = null;
        try {
            BaseBD = Conexion_db.ConectarBD();
            Query query = BaseBD.query(); // Método para iniciar una consulta
            query.constrain(Mecanico.class); // Buscaremos en la clase Cliente
            query.descend("cedula").constrain(cedulaBuscar); // Verificamos las coincidencias en el atributo especificado
            ObjectSet<Mecanico> resultado = query.execute(); // Ejecutamos la consulta y almacenamos en "resultado"

            // si s los resultados
            if (!resultado.isEmpty()) {
                for (Mecanico meca : resultado) {
                    // Seteamos en los campos recibiendo del objeto
                    txtcedulaMeca.setText(meca.getCedula());
                    txtNombreMeca.setText(meca.getNombres());
                    txtCelularMeca.setText(meca.getDireccion());

                    encontrado = true;
                    JOptionPane.showMessageDialog(this, "Mecanico encontrado");
                    break; // Salimos del bucle una vez encontrado el cliente
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró Mecanico");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar el Mecanico: " + e.getMessage());
        } finally {
            if (BaseBD != null) {
                BaseBD.close();
            }
        }
    }

    //Servicios
    private String obtenerNombreServicio(String codigoServicio, ObjectContainer baseBD) {
        Servicios servicioBuscar = new Servicios();
        servicioBuscar.setCodigo_Servicio(codigoServicio);
        ObjectSet<Servicios> resultadoServicio = baseBD.get(servicioBuscar);

        if (!resultadoServicio.isEmpty()) {
            return resultadoServicio.next().getNombre_Servicio();
        }
        return "";
    }

    private double obtenerPrecioServicio(String codigoServicio, ObjectContainer baseBD) {
        Servicios servicioBuscar = new Servicios();
        servicioBuscar.setCodigo_Servicio(codigoServicio);
        ObjectSet<Servicios> resultadoServicio = baseBD.get(servicioBuscar);

        if (!resultadoServicio.isEmpty()) {
            return resultadoServicio.next().getPrecioTotal_Servicio();
        }
        return 0.0;
    }

    private void ShowpanelCruds(JPanel p) {
        p.setSize(870, 630);// Establece el tamaño
        p.setLocation(0, 0);// Coloca el panel en la posición (0, 0) 
        VistaMenu.PanelPrincipal.removeAll();// Elimina todos los componentes del panel principal de VistaMenu
        VistaMenu.PanelPrincipal.add(p, BorderLayout.CENTER);// Añade el panel 'p' al panel principal de VistaMenu, centrado en el diseño de borde
        VistaMenu.PanelPrincipal.revalidate();// Vuelve a validar el panel principal para asegurarse de que se actualicen los cambios
        VistaMenu.PanelPrincipal.repaint();// Repinta el panel principal para reflejar los cambios visualmente
    }

    //guardar cita
    
    private void guardarCita() {
        DefaultTableModel model = (DefaultTableModel) JtableCita.getModel();

        Date fechaNacimientoDate = jDateFechaCita.getDate(); // Obtener la fecha de nacimiento del JDateChooser
        // Formatear la fecha como String en el formato deseado (por ejemplo, "dd/MM/yyyy")
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaNacimiento = sdf.format(fechaNacimientoDate);

        // Obtener los datos del encabezado de la factura
        String codigoCita = txtcodigoCita.getText();
        String fecha = fechaNacimiento;
        String cedulaCli = txtcedulaCli.getText();
        String cedulaMec = txtcedulaMeca.getText();
        String placa = txtPlacaVehi.getText();

        // Crear el encabezado de la cita
        EncabezadoCita cita1 = new EncabezadoCita(codigoCita, fecha, cedulaCli, cedulaMec, placa);

        // Guardar el encabezado y los detalles en la base de datos
        ObjectContainer baseBD = Conexion_db.ConectarBD();
        baseBD.store(cita1);

        // Guardar los detalles de la cita
        for (int i = 0; i < model.getRowCount(); i++) {
            String codigo = model.getValueAt(i, 0).toString();
            
            double precio = Double.parseDouble(model.getValueAt(i, 1).toString());

            // Crear el detalle de la cita con nombre del servicio y precio
            DetalleCita detalle = new DetalleCita(precio, codigo);

            // Guardar el detalle en la base de datos
            baseBD.store(detalle);
        }

        baseBD.close();

        JOptionPane.showMessageDialog(this, "Cita guardada exitosamente!");

    }

//Servicios 
    private void mostrarTablaServicios() {
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Servicios servicio = new Servicios();
        ObjectSet<Servicios> resul = BaseBD.get(servicio);

        String[][] matriz = new String[resul.size()][8];

        int i = 0;
        while (resul.hasNext()) {
            Servicios serv = resul.next();

            matriz[i][0] = serv.getCodigo_Servicio();
            matriz[i][1] = serv.getNombre_Servicio();
            matriz[i][2] = String.valueOf(serv.getPrecioTotal_Servicio());

            i++;
        }

        tblServicios.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Código Servicio", "Nombre Servicio", "Precio Total"}));
        BaseBD.close();
    }

    private void activarJadialogser(JDialog TablaServicios) {

        TablaServicios.setTitle("Listado Servicios");
        TablaServicios.setSize(680, 330);
        TablaServicios.setLocationRelativeTo(this);
        TablaServicios.setVisible(true);
}
    
    
    private void filtrarTablaServicios(String consulta) {
    DefaultTableModel modelo = (DefaultTableModel) tblServicios.getModel();
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
    tblServicios.setRowSorter(sorter);

    if (consulta.trim().isEmpty()) {
        sorter.setRowFilter(null);
    } else {
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + consulta));
    }

    // Selecciona automáticamente la primera fila filtrada
    if (tblServicios.getRowCount() > 0) {
        tblServicios.setRowSelectionInterval(0, 0);
    }
}
   public void seteardatosSer() {
    int filaSeleccionada = tblServicios.getSelectedRow();
    if (filaSeleccionada != -1) {
        int filaModelo = tblServicios.convertRowIndexToModel(filaSeleccionada);
        String codigoServicio = (String) tblServicios.getModel().getValueAt(filaModelo, 0);
        String nombreServicio = (String) tblServicios.getModel().getValueAt(filaModelo, 1);
        String precioServicio = (String) tblServicios.getModel().getValueAt(filaModelo, 2);

        String numerodevehiculos = "";
        boolean esValido = false;

        while (!esValido) {
            numerodevehiculos = JOptionPane.showInputDialog("Ingrese el número de vehículos a los que se les realizó el servicio");
            if (numerodevehiculos != null && numerodevehiculos.matches("\\d+")) {
                esValido = true;
                TablaServicios.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese solo dígitos.");
            }
        }

        DefaultTableModel modeloCita = (DefaultTableModel) JtableCita.getModel();
        modeloCita.addRow(new Object[]{codigoServicio, nombreServicio, precioServicio, numerodevehiculos});

        // Limpia la selección de la tabla
        tblServicios.clearSelection();
        tblServicios.setVisible(true);

    } else {
        JOptionPane.showMessageDialog(null, "No se seleccionó ningún producto");
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtableCita;
    private javax.swing.JDialog TablaServicios;
    private javax.swing.JButton btnAñadirServicos;
    private javax.swing.JButton btnBuscaMecanico;
    private javax.swing.JButton btnBuscarCliente;
    private rsbuttongradiente.RSButtonGradiente btnBuscarServicio;
    private javax.swing.JButton btnBuscarVehiculo;
    private javax.swing.JButton btnCancelar;
    private rojeru_san.RSButton btnFinalizarCita;
    private rojeru_san.RSButton btnFinalizarCita1;
    private rsbuttongradiente.RSButtonGradiente btnInsetarServicios;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnResibo;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser jDateFechaCita;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblCuadro;
    private javax.swing.JLabel lblCuadro1;
    private javax.swing.JLabel lblCuadro2;
    private javax.swing.JLabel lblDatosCli;
    private javax.swing.JLabel lblDatosCli1;
    private javax.swing.JLabel lblDatosCli2;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDireccion1;
    private javax.swing.JLabel lblDireccion2;
    private javax.swing.JLabel lblDireccion4;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblTituloFac;
    private javax.swing.JLabel lblcedula;
    private javax.swing.JLabel lblcedula1;
    private javax.swing.JLabel lblcedula2;
    private javax.swing.JLabel lblcodFac1;
    private javax.swing.JLabel lblverlis;
    private javax.swing.JLabel lblverlis1;
    private javax.swing.JLabel lblverlis2;
    private javax.swing.JLabel lblverlis3;
    private javax.swing.JTable tblServicios;
    private rojeru_san.RSMTextFull txtBuscarServicio;
    private javax.swing.JTextField txtCelularCli;
    private javax.swing.JTextField txtCelularMeca;
    private javax.swing.JTextField txtMarcaVehi;
    private javax.swing.JTextField txtModeloVehi;
    private javax.swing.JTextField txtNombreCli;
    private javax.swing.JTextField txtNombreMeca;
    private javax.swing.JTextField txtPlacaVehi;
    private javax.swing.JTextField txtcedulaCli;
    private javax.swing.JTextField txtcedulaMeca;
    private javax.swing.JTextField txtcodigoCita;
    private javax.swing.JTextField txtdireccionCli;
    // End of variables declaration//GEN-END:variables
}
