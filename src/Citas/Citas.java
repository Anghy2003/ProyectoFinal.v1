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
import Models.EncabezadoCita.Estado;
import Models.Mecanico;
import Models.Servicios;
import Models.Vehiculo;
import Vista.Home.Home;
import Vista.Menu.VistaMenu;
import static Vista.Menu.VistaMenu.PanelPrincipal;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import utils.Global;

public class Citas extends javax.swing.JPanel {
    
     private String pdfPath = "Cita.pdf";

    public Citas() {
        initComponents();
        verificarCliente();
        encabezadoCita();
        mostrarTablaServicios();
        txtdireccionCli.setEnabled(false);
        txtNombreCli.setEnabled(false);
        txtCelularCli.setEnabled(false);
        mostrarComboMecanico();
    }

    private void MostarpanelCruds(JPanel p) {
        p.setSize(890, 630);
        p.setLocation(0, 0);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(p, BorderLayout.CENTER);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
    }

    private void mostrarComboMecanico() {
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Query mechabox = BaseBD.query();
        mechabox.constrain(Mecanico.class);
        ObjectSet<Mecanico> resultado = mechabox.execute();

        cbxMecaCita.removeAllItems();
        for (Mecanico mechanic : resultado) {
            String item = (mechanic.getCedula()) + " " + (mechanic.getNombres()) + " " + (mechanic.getApellidos()) + " " + (mechanic.getCelular());
            cbxMecaCita.addItem(item);
        }
        BaseBD.close();
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
        lblDatosCli = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtableCita = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnResibo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtcodigoCita = new javax.swing.JTextField();
        lblcodFac1 = new javax.swing.JLabel();
        btnFinalizarCita = new rojeru_san.RSButton();
        btnAñadirServicos = new javax.swing.JButton();
        lblDatosCli1 = new javax.swing.JLabel();
        lblcedula1 = new javax.swing.JLabel();
        txtCedulaCli = new javax.swing.JTextField();
        lblNombre2 = new javax.swing.JLabel();
        txtNombreCli = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        lblDireccion1 = new javax.swing.JLabel();
        txtdireccionCli = new javax.swing.JTextField();
        lblDireccion2 = new javax.swing.JLabel();
        txtCelularCli = new javax.swing.JTextField();
        lblDatosCli2 = new javax.swing.JLabel();
        jDateFechaCita = new com.toedter.calendar.JDateChooser();
        btnFinalizarCita1 = new rojeru_san.RSButton();
        lblverlis1 = new javax.swing.JLabel();
        lblCuadro2 = new javax.swing.JLabel();
        lblCuadro = new javax.swing.JLabel();
        cbxPlacasVehiculos = new javax.swing.JComboBox<>();
        cbxMecaCita = new javax.swing.JComboBox<>();
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

        lblDatosCli.setText("Datos Mecanico");
        jPanel3.add(lblDatosCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 20));

        lblFecha.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblFecha.setText("Fecha:");
        jPanel3.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

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
        btnResibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResiboActionPerformed(evt);
            }
        });
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
        btnAñadirServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAñadirServicosMouseClicked(evt);
            }
        });
        btnAñadirServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirServicosActionPerformed(evt);
            }
        });
        jPanel3.add(btnAñadirServicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        lblDatosCli1.setText("Datos del Cliente");
        jPanel3.add(lblDatosCli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 20));

        lblcedula1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblcedula1.setText("Cedula:");
        jPanel3.add(lblcedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtCedulaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaCliActionPerformed(evt);
            }
        });
        txtCedulaCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaCliKeyTyped(evt);
            }
        });
        jPanel3.add(txtCedulaCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 190, 30));

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
        jPanel3.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 110, 40));

        lblDireccion1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblDireccion1.setText("Direccion:");
        jPanel3.add(lblDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));
        jPanel3.add(txtdireccionCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 220, -1));

        lblDireccion2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblDireccion2.setText("Celular");
        jPanel3.add(lblDireccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));
        jPanel3.add(txtCelularCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 220, -1));

        lblDatosCli2.setText("Datos Vehiculo");
        jPanel3.add(lblDatosCli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));
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

        lblCuadro2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblCuadro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 120, 490));

        lblCuadro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblCuadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 860, 60));

        jPanel3.add(cbxPlacasVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 490, -1));

        cbxMecaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMecaCitaActionPerformed(evt);
            }
        });
        jPanel3.add(cbxMecaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 490, -1));

        lblTituloFac.setBackground(new java.awt.Color(0, 53, 79));
        lblTituloFac.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblTituloFac.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloFac.setText("CITAS MECANICA YINGS AND YAN");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logomini1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTituloFac, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
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
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

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
        if (txtCedulaCli.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "AGREGUE LOS DATOS DEL CLIENTE");
        } else {
            activarJadialogser(TablaServicios);
        }

    }//GEN-LAST:event_btnAñadirServicosActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        CargarVehiculosCliente();

    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void txtCedulaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaCliActionPerformed

    private void btnBuscarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarServicioActionPerformed

    }//GEN-LAST:event_btnBuscarServicioActionPerformed

    private void btnFinalizarCita1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCita1ActionPerformed
        guardarCita();
    }//GEN-LAST:event_btnFinalizarCita1ActionPerformed

    private void btnInsetarServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsetarServiciosActionPerformed
        seteardatosSer();

    }//GEN-LAST:event_btnInsetarServiciosActionPerformed

    private void cbxMecaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMecaCitaActionPerformed

    }//GEN-LAST:event_cbxMecaCitaActionPerformed

    private void btnResiboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResiboActionPerformed
         
        generarReciboPDF();
        String cedula = txtCedulaCli.getText().trim();
        if (!cedula.isEmpty()) {
            String correoCliente = obtenerCorreoCliente(cedula);
            if (correoCliente != null) {
                transfer_to_email(correoCliente, pdfPath);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo obtener el correo del cliente.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un cliente.");
        }
    }//GEN-LAST:event_btnResiboActionPerformed

    private void txtCedulaCliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaCliKeyTyped
        char x = evt.getKeyChar();
        if (txtCedulaCli.getText().length() == 10) {
            CargarVehiculosCliente();
        }
        if (txtCedulaCli.getText().length() >= 10) {
        evt.consume();
    }
    }//GEN-LAST:event_txtCedulaCliKeyTyped

    private void btnAñadirServicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirServicosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirServicosMouseClicked

    public final void CargarVehiculosCliente() {
        // Verifica que el campo de cédula no esté vacío
        String cedulaBuscar = txtCedulaCli.getText().trim();
        if (cedulaBuscar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una cédula para buscar.");
            return;
        }

        // Establecer conexión con la base de datos
        ObjectContainer BaseBD = null;
        try {
            BaseBD = Conexion_db.ConectarBD();

            // Buscar el cliente
            Query clienteQuery = BaseBD.query();
            clienteQuery.constrain(Cliente.class);
            clienteQuery.descend("cedula").constrain(cedulaBuscar);
            ObjectSet<Cliente> resultadoCliente = clienteQuery.execute();
            CargarCliente();
            if (!resultadoCliente.isEmpty()) {
                Cliente cliente = resultadoCliente.get(0);
                CargarCliente();
                // Buscar los vehículos del cliente
                Query vehiculoQuery = BaseBD.query();
                vehiculoQuery.constrain(Vehiculo.class);
                vehiculoQuery.descend("id_Cliente").constrain(cliente.getCedula()); // Asumiendo que los vehículos tienen un campo cedulaCliente
                ObjectSet<Vehiculo> resultadoVehiculo = vehiculoQuery.execute();
                CargarCliente();
                // Limpiar el JComboBox antes de añadir nuevos elementos
                cbxPlacasVehiculos.removeAllItems();
                CargarCliente();
                // Añadir los vehículos al JComboBox
                if (!resultadoVehiculo.isEmpty()) {
                    for (Vehiculo vehiculo : resultadoVehiculo) {
                        
                        cbxPlacasVehiculos.addItem(vehiculo.getPlaca_Vehiculo());
                        CargarCliente();
                    }

                    JOptionPane.showMessageDialog(this, "Vehículos encontrados y añadidos al comboBox.");
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontraron vehículos para el cliente.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el cliente.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar los vehículos del cliente: " + e.getMessage());
        } finally {
            if (BaseBD != null) {
                BaseBD.close();
            }
        }
        txtdireccionCli.setDisabledTextColor(Color.black);
        txtNombreCli.setDisabledTextColor(Color.black);
        txtCelularCli.setDisabledTextColor(Color.black);
    }

    public final int verificarExistenciaCliente() {
        Boolean encontrado = false;
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Query cliente = BaseBD.query();//metodo para iniciar una consulta
        cliente.constrain(Cliente.class);//buscaremos en la clase Vehiculo
        cliente.descend("cedula").constrain(txtCedulaCli.getText().toUpperCase()); // verificamos las coincidencias en el atributo especificado
        ObjectSet<Cliente> resultado = cliente.execute();//Ejecutamos la consulta y almacenamos en "resultado"
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
        String cedulaBuscar = txtCedulaCli.getText().trim();
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
                    txtCedulaCli.setText(cliente.getCedula());
                    txtNombreCli.setText(cliente.getNombres());
                    txtdireccionCli.setText(cliente.getDireccion());
                    txtCelularCli.setText(cliente.getCelular());

                    encontrado = true;

                    break; // Salimos del bucle una vez encontrado el cliente
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró Cliente");
            }
        } catch (Exception e) {

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
            String precioServicio = (String) tblServicios.getModel().getValueAt(filaModelo, 2);//AQUIIII___________________________________________________

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
            // Establecer los nombres de las columnas
            modeloCita.setColumnIdentifiers(new Object[]{"Código Servicio", "Nombre Servicio", "Precio Servicio", "Número de Vehículos"});
            // Agregar la fila
            modeloCita.addRow(new Object[]{codigoServicio, nombreServicio, precioServicio, numerodevehiculos});

            // Limpia la selección de la tabla
            tblServicios.clearSelection();
            tblServicios.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún producto");
        }
    }
    
    
    
    
    
    
    
    
    
   // para generar un pdf y enviar un correo
    
     //para generar un pdf primer paso 
    public void generarReciboPDF() {
        try {
            PdfWriter writer = new PdfWriter(pdfPath);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc);

            // Añadir logotipo
            String logoPath = "src\\Images\\logote_resized.png";
            File logoFile = new File(logoPath);
            if (logoFile.exists()) {
                Image img = new Image(ImageDataFactory.create(logoPath));
                img.setWidth(100);
                img.setHeight(50);
                document.add(img);
            } else {
                JOptionPane.showMessageDialog(null, "Logotipo no encontrado en: " + logoPath);
            }

            // Añadir el título de la factura
            Paragraph title = new Paragraph("Factura de Venta")
                    .setTextAlignment(TextAlignment.CENTER)
                    .setFontSize(18)
                    .setBold();
            document.add(title);

            document.add(new Paragraph(" "));

            // Información del cliente
            document.add(new Paragraph("Cliente: " + txtNombreCli.getText()));
            document.add(new Paragraph("Cédula: " + txtCedulaCli.getText()));
            document.add(new Paragraph("Dirección: " + txtdireccionCli.getText()));
            document.add(new Paragraph("Teléfono: " + txtCelularCli.getText()));
            document.add(new Paragraph("Fecha: " + jDateFechaCita));
            document.add(new Paragraph(" "));

            // Crear una tabla con columnas
            float[] columnWidths = {2, 4, 2, 2, 2};
            Table table = new Table(UnitValue.createPercentArray(columnWidths));
            table.setWidth(UnitValue.createPercentValue(100));

            table.addHeaderCell(new Cell().add(new Paragraph("Código").setBold().setBackgroundColor(ColorConstants.GRAY)));
            table.addHeaderCell(new Cell().add(new Paragraph("Descripción").setBold().setBackgroundColor(ColorConstants.GRAY)));
            table.addHeaderCell(new Cell().add(new Paragraph("Precio Unitario").setBold().setBackgroundColor(ColorConstants.GRAY)));
            table.addHeaderCell(new Cell().add(new Paragraph("Cantidad").setBold().setBackgroundColor(ColorConstants.GRAY)));
            table.addHeaderCell(new Cell().add(new Paragraph("Subtotal").setBold().setBackgroundColor(ColorConstants.GRAY)));

            // Agregar filas con datos de la factura
            DefaultTableModel model = (DefaultTableModel) JtableCita.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                table.addCell(new Cell().add(new Paragraph(model.getValueAt(i, 0).toString())));
                table.addCell(new Cell().add(new Paragraph(model.getValueAt(i, 1).toString())));
                table.addCell(new Cell().add(new Paragraph(model.getValueAt(i, 2).toString())));
                table.addCell(new Cell().add(new Paragraph(model.getValueAt(i, 3).toString())));
                table.addCell(new Cell().add(new Paragraph(model.getValueAt(i, 4).toString())));
            }

            // Añadir la tabla al documento
            document.add(table);

            // Añadir los totales al final del documento
            
//            document.add(new Paragraph("Total: " + txtTotalCit.getText()).setBold());

            // Añadir pie de página con información de la empresa
            document.add(new Paragraph(" "));
            Paragraph footer = new Paragraph("Cita Agendada\n MECANICA YINGS AND YANG\n Octavio Chacon \n Teléfono: 123-456-789")
                    .setTextAlignment(TextAlignment.CENTER)
                    .setFontSize(10);
            document.add(footer);

            // Cerrar el documento
            document.close();

            JOptionPane.showMessageDialog(null, "La Cita generada en PDF con éxito!");

            // Abrir el archivo PDF
            File pdfFile = new File(pdfPath);
            if (pdfFile.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile);
                } else {
                    JOptionPane.showMessageDialog(null, "La funcionalidad de abrir el archivo no está soportada en su sistema.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El archivo PDF no se encontró.");
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al generar el PDF: " + e.getMessage());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al abrir el PDF: " + e.getMessage());
        }
    }

    //para enviar al correo 
    public static void transfer_to_email(String correo, String pdfPath) {
        String correoEnvia = "yingsyyangmecanica@gmail.com";
        String contrasena = "ghsd axnw dxtk fxei";
        String mensaje = "Adjunto encontrará la cita generada.";
        String asunto = "Cita de Servicios";
        Properties objetoPEC = new Properties();
        objetoPEC.put("mail.smtp.host", "smtp.gmail.com");
        objetoPEC.setProperty("mail.smtp.starttls.enable", "true");
        objetoPEC.setProperty("mail.smtp.port", "587");
        objetoPEC.setProperty("mail.smtp.user", correoEnvia);
        objetoPEC.setProperty("mail.smtp.auth", "true");
        Session sesion = Session.getDefaultInstance(objetoPEC);
        MimeMessage mail = new MimeMessage(sesion);
        try {
            mail.setFrom(new InternetAddress(correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
            mail.setSubject(asunto);

            // Crear la parte del mensaje
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(mensaje);

            // Crear la parte del archivo adjunto
            MimeBodyPart attachPart = new MimeBodyPart();
            attachPart.attachFile(pdfPath);

            // Crear multipart para combinar el mensaje y el adjunto
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(attachPart);

            // Configurar el contenido del correo
            mail.setContent(multipart);

            // Enviar el correo
            Transport trasporte = sesion.getTransport("smtp");
            trasporte.connect(correoEnvia, contrasena);
            trasporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            trasporte.close();
            JOptionPane.showMessageDialog(null, "El correo se envió correctamente");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al enviar el correo: " + ex.getMessage());
        }
    }
    //obtener correo cliente
    
    public String obtenerCorreoCliente(String cedula) {
        ObjectContainer baseBD = Conexion_db.ConectarBD();
        String correoCliente = null;

        try {
            // Crear consulta para buscar cliente por cédula
            Query clienteQuery = baseBD.query();
            clienteQuery.constrain(Cliente.class);
            clienteQuery.descend("cedula").constrain(cedula);
            ObjectSet<Cliente> resultado = clienteQuery.execute();

            // Si se encuentra el cliente, obtener el correo
            if (!resultado.isEmpty()) {
                Cliente cliente = resultado.next();
                correoCliente = cliente.getCorreo();
            } else {
                JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar el cliente: " + e.getMessage());
        } finally {
            if (baseBD != null) {
                baseBD.close();
            }
        }

        return correoCliente;
    }
        

    // Método para resetear el formulario
    private void resetearFormulario() {
        Citas miCita = new Citas();
        ShowpanelCruds(miCita);
    }
  
    private void guardarCita() {
        DefaultTableModel model = (DefaultTableModel) JtableCita.getModel();
        // Validar que los datos del cliente y la cita estén completos
        if (txtcodigoCita.getText().isEmpty() || jDateFechaCita.getDate() == null || txtCedulaCli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los datos de la cita.");
            return;
        }
        // Validar que la tabla de detalles no esté vacía
        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No se puede guardar una cita vacía.");
            return;
        }
        // Obtener los datos del encabezado de la cita
        String codigoCita = txtcodigoCita.getText();
        String fechaCita = new SimpleDateFormat("dd/MM/yyyy").format(jDateFechaCita.getDate());
        String cedulaCli = txtCedulaCli.getText();
        Object selectedItem = cbxMecaCita.getSelectedItem();
        String selectedItemString = (selectedItem == null) ? "" : selectedItem.toString();
        String cedulaMec = selectedItemString.substring(0, Math.min(selectedItemString.length(), 10));//obtengo solo la cedula del comboBox

    
        String placaVehiculo=(String)cbxPlacasVehiculos.getSelectedItem();
        // Crear el encabezado de la cita
        EncabezadoCita cita = new EncabezadoCita(codigoCita, fechaCita, cedulaCli, cedulaMec,placaVehiculo, Estado.ACTIVO);
        // Guardar el encabezado y los detalles en la base de datos
        ObjectContainer baseBD = Conexion_db.ConectarBD();
        baseBD.store(cita);
        Boolean citaGuardada=false;
        // Guardar los detalles de la cita
        for (int i = 0; i < model.getRowCount(); i++) {// Iterar sobre cada fila de la tabla, desde la primera (i=0) hasta la última (i=model.getRowCount()-1)
            String codigoServicio = model.getValueAt(i, 0).toString();// Obtener el valor de la celda en la columna 0 (índice 0) de la fila actual y convertirlo a una cadena
            double precioServicio = 0.0;// Inicializar una variable para almacenar el precio del servicio, con un valor inicial de 0.0
            Object value = model.getValueAt(i, 2);// Obtener el valor de la celda en la columna 2 (índice 2) de la fila actual, que se supone que es el precio del servicio
            if (value != null) {// Verificar si el valor obtenido no es nulo
                String valorString = value.toString();// Convertir el objeto value a una cadena
                try {
                    precioServicio = Double.parseDouble(valorString);// Intentar parsear la cadena a un número double, si se puede, se asigna el valor a precioServicio
                } catch (NumberFormatException e) {// Si no se puede parsear la cadena a un número double, se lanza una excepción NumberFormatException
                    JOptionPane.showMessageDialog(this, "El precio del servicio en la fila " + (i + 1) + " no es un número válido.");// Mostrar un mensaje de error y saltar a la siguiente iteración con continue
                    continue; // Saltar esta fila y continuar con las demás
                }
            } else {
                JOptionPane.showMessageDialog(this, "El precio del servicio en la fila " + (i + 1) + " es nulo.");// Si el valor obtenido es nulo, mostrar un mensaje de error y saltar a la siguiente iteración con continue
                continue; // Saltar esta fila y continuar con las demás
            }
            DetalleCita detalle = new DetalleCita(codigoCita, precioServicio, codigoServicio);// Crear un objeto DetalleCita con los valores obtenidos y asignados
            citaGuardada=true;
            baseBD.store(detalle);
        }
        baseBD.close();
        if (citaGuardada) {
            JOptionPane.showMessageDialog(this, "Cita guardada exitosamente!");
        }else{JOptionPane.showMessageDialog(this, "Cita no guardada");}
        
        resetearFormulario();
    }

    
    
    


public void cargarDatosCita(String codigoCita, JTable tblEncabezado, JTable tblDetalle) {
    // Conexión a la base de datos
    ObjectContainer baseBD = Conexion_db.ConectarBD();

    try {
        // Buscar el encabezado de la cita
        EncabezadoCita citaBuscar = new EncabezadoCita();
        citaBuscar.setCodigo_encabezadoCita(codigoCita);
        ObjectSet<EncabezadoCita> resultadoEncabezado = baseBD.get(citaBuscar);

        if (!resultadoEncabezado.isEmpty()) {
            EncabezadoCita encabezado = resultadoEncabezado.get(0);
            txtcodigoCita.setText(encabezado.getCodigo_encabezadoCita());
            jDateFechaCita.setDate(convertirStringADate(encabezado.getFecha_encabezadoCita()));
            txtCedulaCli.setText(encabezado.getCedulaCliente_encabezadoCita());
            // Aquí también podrías cargar otros datos del cliente si es necesario

            // Actualizar la tabla de encabezado
            String[][] matrizEncabezado = new String[1][4];
            matrizEncabezado[0][0] = encabezado.getCodigo_encabezadoCita();
            matrizEncabezado[0][1] = encabezado.getFecha_encabezadoCita();
            matrizEncabezado[0][2] = encabezado.getCedulaCliente_encabezadoCita();
            matrizEncabezado[0][3] = encabezado.getCedulaMecanico_encabezadoCita();
            tblEncabezado.setModel(new javax.swing.table.DefaultTableModel(
                matrizEncabezado,
                new String[]{"Código Cita", "Fecha", "Cédula Cliente", "Cédula Mecánico"}
            ));

            // Buscar los detalles de la cita
            DetalleCita detalleBuscar = new DetalleCita();
            detalleBuscar.setCodigo_encabezadoCita(codigoCita);
            ObjectSet<DetalleCita> resultadoDetalle = baseBD.get(detalleBuscar);

            // Crear una matriz para almacenar los datos de los detalles
            String[][] matrizDetalle = new String[resultadoDetalle.size()][3];
            int i = 0;
            for (DetalleCita detalle : resultadoDetalle) {
                matrizDetalle[i][0] = detalle.getCodigoServicio_detallecita();
                matrizDetalle[i][1] = obtenerNombreServicio(detalle.getCodigoServicio_detallecita(), baseBD);
                matrizDetalle[i][2] = String.valueOf(detalle.getPrecioServicio_detallecita());
                i++;
            }

            // Configurar los datos en la tabla de detalles
            tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
                matrizDetalle,
                new String[]{"Código Servicio", "Nombre Servicio", "Precio Servicio"}
            ));
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró la cita con el código proporcionado.");
        }
    } finally {
        baseBD.close();
    }
}
    private int numeroCita() {//para calcular el numero
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        EncabezadoCita citasBusca = new EncabezadoCita();
        ObjectSet resultado = BaseBD.get(citasBusca);
        System.out.println("se tiene "+resultado.size()+" encabezados de citas");
        int valor=resultado.size()+1;
        BaseBD.close();
        return valor;//devolvera el numero de coincidencias
    }
    private void encabezadoCita(){//para enviar el codigo al Textfield y setear fecha
        String codigo="CITA-00"+numeroCita();
        txtcodigoCita.setText(codigo);//enviamos el codigo
        txtcodigoCita.setDisabledTextColor(Color.black);//definimos la letra del textfield deshabilitado en negro
        jDateFechaCita.setDate(new Date());
        // Limitar la selección de fechas a partir de hoy
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        jDateFechaCita.setMinSelectableDate(calendar.getTime());
        jDateFechaCita.getDateEditor().setEnabled(false);
        JTextField textField = (JTextField) jDateFechaCita.getComponent(1);
        textField.setEnabled(false);//deshabilita la edicion desde el texto
        textField.setDisabledTextColor(Color.BLACK);//para poner la fecha en negro
        txtcodigoCita.setEnabled(false);//deshabilitamos el textfield del codigo
    }
    private void verificarCliente(){
        if (Global.rolUsuario.equals("CLIENTE")) {
            txtCedulaCli.setText(Home.CedulaUsuario);
            txtCedulaCli.setEnabled(false);
            txtCedulaCli.setDisabledTextColor(Color.black);
            CargarVehiculosCliente();
        }else{System.out.println("No es Cliente");}
        
    }
    
    
    









    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtableCita;
    private javax.swing.JDialog TablaServicios;
    private javax.swing.JButton btnAñadirServicos;
    private javax.swing.JButton btnBuscarCliente;
    private rsbuttongradiente.RSButtonGradiente btnBuscarServicio;
    private javax.swing.JButton btnCancelar;
    private rojeru_san.RSButton btnFinalizarCita;
    private rojeru_san.RSButton btnFinalizarCita1;
    private rsbuttongradiente.RSButtonGradiente btnInsetarServicios;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnResibo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxMecaCita;
    private javax.swing.JComboBox<String> cbxPlacasVehiculos;
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
    private javax.swing.JLabel lblCuadro2;
    private javax.swing.JLabel lblDatosCli;
    private javax.swing.JLabel lblDatosCli1;
    private javax.swing.JLabel lblDatosCli2;
    private javax.swing.JLabel lblDireccion1;
    private javax.swing.JLabel lblDireccion2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblTituloFac;
    private javax.swing.JLabel lblcedula1;
    private javax.swing.JLabel lblcodFac1;
    private javax.swing.JLabel lblverlis1;
    private javax.swing.JTable tblServicios;
    private rojeru_san.RSMTextFull txtBuscarServicio;
    private javax.swing.JTextField txtCedulaCli;
    private javax.swing.JTextField txtCelularCli;
    private javax.swing.JTextField txtNombreCli;
    private javax.swing.JTextField txtcodigoCita;
    private javax.swing.JTextField txtdireccionCli;
    // End of variables declaration//GEN-END:variables
}
