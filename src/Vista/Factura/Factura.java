package Vista.Factura;

import Conexion.Conexion_db;
import Models.Cliente;
import Models.EncabezadoFactura_1;
import Models.Producto;
import Vista.Menu.VistaMenu;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Factura extends javax.swing.JPanel {

    /**
     * Creates new form Factura
     */
    public Factura() {
        initComponents();
        setearcabe();
        txtNombre1.setEnabled(false);
        txtdireccion.setEnabled(false);
        txtcedula.setEnabled(false);
        txttelefono.setEnabled(false);
        mostrarTablaProductos();
        mostrarDatosCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablaproductos = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tblProductos = new javax.swing.JScrollPane();
        Tablproductos1 = new javax.swing.JTable();
        txtBuscar = new rojeru_san.RSMTextFull();
        jLabel3 = new javax.swing.JLabel();
        btnInsertar = new rsbuttongradiente.RSButtonGradiente();
        tablaClientes = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        txtBuscar1 = new rojeru_san.RSMTextFull();
        btnBuscar = new rsbuttongradiente.RSButtonGradiente();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTituloFac = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblDatosCli = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        lblverlis = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtableFactura = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        lblSubtotal = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        lblTotalFAc = new javax.swing.JLabel();
        lblValorDes = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGenerarVenta = new javax.swing.JButton();
        btnResibo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lbllineas = new javax.swing.JLabel();
        lblcedula = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        txtcodigoFac = new javax.swing.JTextField();
        lblCuadro1 = new javax.swing.JLabel();
        lblcodFac1 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        rSButton1 = new rojeru_san.RSButton();
        btnAñadir1 = new javax.swing.JButton();
        txtfecha = new javax.swing.JTextField();
        lblCuadro = new javax.swing.JLabel();
        btnAñadir2 = new javax.swing.JButton();

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        jLabel1.setText("Listado Productos");

        tblProductos.setBackground(new java.awt.Color(255, 255, 255));
        tblProductos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblProductos.setForeground(new java.awt.Color(255, 255, 255));

        Tablproductos1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Tablproductos1.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProductos.setViewportView(Tablproductos1);

        txtBuscar.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        txtBuscar.setPlaceholder("ejm. Pro-01");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel3.setText("Buscar");

        btnInsertar.setText("Insertar");
        btnInsertar.setColorPrimario(new java.awt.Color(0, 51, 153));
        btnInsertar.setColorPrimarioHover(new java.awt.Color(51, 0, 255));
        btnInsertar.setColorSecundario(new java.awt.Color(51, 153, 255));
        btnInsertar.setColorSecundarioHover(new java.awt.Color(153, 204, 255));
        btnInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertarMouseClicked(evt);
            }
        });
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(tblProductos)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 292, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)))
                .addGap(44, 44, 44)
                .addComponent(tblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaproductos.getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        jLabel4.setText("Listado Clientes");

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setEnabled(false);

        tblClientes.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblClientes);

        txtBuscar1.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        txtBuscar1.setPlaceholder("ejm. 0106388747");

        btnBuscar.setText("Buscar");
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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tablaClientesLayout = new javax.swing.GroupLayout(tablaClientes.getContentPane());
        tablaClientes.getContentPane().setLayout(tablaClientesLayout);
        tablaClientesLayout.setHorizontalGroup(
            tablaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
            .addGroup(tablaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tablaClientesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        tablaClientesLayout.setVerticalGroup(
            tablaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(tablaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tablaClientesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 53, 79));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 53, 79));

        lblTituloFac.setBackground(new java.awt.Color(0, 53, 79));
        lblTituloFac.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblTituloFac.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloFac.setText("FACTURACION MECANICA YIN AND YANS");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logomini1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTituloFac, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloFac, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 70));

        lblDireccion.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblDireccion.setText("Direccion:");
        jPanel3.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblTelefono.setText("Telefono:");
        jPanel3.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        lblDatosCli.setText("Datos del Cliente");
        jPanel3.add(lblDatosCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 10));
        jPanel3.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 220, -1));

        lblFecha.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblFecha.setText("Fecha:");
        jPanel3.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));
        jPanel3.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 220, -1));

        lblverlis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblverlis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 710, 70));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/boton-x (1).png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/mas (1).png"))); // NOI18N
        btnAñadir.setText("Buscar");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        jPanel3.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, 30));

        JtableFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo ", "Nombre ", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JtableFactura);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 710, 90));

        jPanel5.setBackground(new java.awt.Color(0, 53, 79));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 890, 20));

        lblSubtotal.setText("SubTotal:");
        jPanel3.add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        lblDescuento.setText("%Descuento:");
        jPanel3.add(lblDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        lblIva.setText("IVA 15%:");
        jPanel3.add(lblIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        lblTotalFAc.setText("Total Factura:");
        jPanel3.add(lblTotalFAc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        lblValorDes.setText("Valor Descontado:");
        jPanel3.add(lblValorDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/registro (1)_1.png"))); // NOI18N
        jPanel3.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 80, 70));

        btnGenerarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/dinero.png"))); // NOI18N
        jPanel3.add(btnGenerarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 80, 70));

        btnResibo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/impresion.png"))); // NOI18N
        jPanel3.add(btnResibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 80, 70));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/rechazar.png"))); // NOI18N
        jPanel3.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 80, 70));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-sesion.png"))); // NOI18N
        jPanel3.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 80, 70));

        lbllineas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lbllineas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 710, 110));

        lblcedula.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblcedula.setText("Cedula:");
        jPanel3.add(lblcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel3.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 190, 30));

        lblNombre1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblNombre1.setText("Cliente:");
        jPanel3.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
        jPanel3.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 190, -1));
        jPanel3.add(txtcodigoFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 130, -1));

        lblCuadro1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblCuadro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 710, 110));

        lblcodFac1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        lblcodFac1.setText("N° Factura:");
        jPanel3.add(lblcodFac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, -1));
        jPanel3.add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 90, -1));

        rSButton1.setBackground(new java.awt.Color(0, 204, 0));
        rSButton1.setText("Finalizar Factura");
        jPanel3.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, -1, -1));

        btnAñadir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/mas (1).png"))); // NOI18N
        btnAñadir1.setText("Añadir Productos");
        btnAñadir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadir1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAñadir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));
        jPanel3.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 220, -1));

        lblCuadro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblCuadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 710, 40));

        btnAñadir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/mas (1).png"))); // NOI18N
        btnAñadir2.setText("Añadir Servicios ");
        btnAñadir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadir2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAñadir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 640));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarMouseClicked
        // TODO add your handling code here:
        System.out.println("clickmet");
    }//GEN-LAST:event_btnInsertarMouseClicked

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        seteardatos();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnAñadir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadir1ActionPerformed
        activarJdialog(tablaproductos);
    }//GEN-LAST:event_btnAñadir1ActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked

    }//GEN-LAST:event_tblClientesMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        activarJadialog(tablaClientes);
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnAñadir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadir2ActionPerformed
    private static String obtenerProximoCodigoFactura(ObjectContainer db) {
        // Consultar todos los servicios
        ObjectSet<EncabezadoFactura_1> result = db.queryByExample(EncabezadoFactura_1.class);

        // Determinar el máximo ID numérico existente
        int maxID = 0;
        while (result.hasNext()) {
            EncabezadoFactura_1 facturacion = result.next();
            String codigo = facturacion.getCodigo_encabezadoFactura();
            if (codigo != null && codigo.startsWith("FAC-000")) {
                int id = Integer.parseInt(codigo.substring(3)); // Extraer la parte numérica del código
                if (id > maxID) {
                    maxID = id;
                }
            }
        }

        // El próximo ID es el máximo + 1
        int siguienteID = maxID + 1;
        // Retornar el nuevo código concatenado con "SER"
        return "FAC-000" + siguienteID;

    }

    public void setearcabe() {
        ObjectContainer baseBD = Conexion_db.ConectarBD();
        String fac = obtenerProximoCodigoFactura(baseBD);
        txtcodigoFac.setText(fac);
        txtcodigoFac.setEnabled(false);
        txtfecha.setText(obtenerFechaActual());
        txtfecha.setEnabled(false);
        baseBD.close();
    }

    public static String obtenerFechaActual() {
        LocalDate fechaActual = LocalDate.now();
        String fechita = fechaActual.toString();
        return fechita;
    }

    private void activarJdialog(JDialog tablaProductos) {

        tablaProductos.setTitle("Listado Productos");
        tablaProductos.setSize(680, 330);
        tablaProductos.setLocationRelativeTo(this);
        tablaProductos.setVisible(true);
    }

    private void mostrarTablaProductos() {
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Producto producto = new Producto(null, null, null, null, 0, 0, 0, null, null);
        ObjectSet<Producto> resul = BaseBD.get(producto);

        String matriz[][] = new String[resul.size()][4];

        for (int i = 0; i < resul.size(); i++) {
            Producto prod = (Producto) resul.next();

            matriz[i][0] = prod.getCodigo_Producto();
            matriz[i][1] = prod.getNombre_Producto();
            matriz[i][2] = String.valueOf(prod.getPrecio_Producto());
            matriz[i][3] = String.valueOf(prod.getNumeroProductos_Producto());
        }

        Tablproductos1.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Código Producto", "Nombre Producto", "Precio", "Número de Productos"
                }
        ));
        BaseBD.close();
    }

    public void seteardatos() {
        int selectedRow = Tablproductos1.getSelectedRow();
        if (selectedRow != -1) {
            String codigoProducto = (String) Tablproductos1.getValueAt(selectedRow, 0);
            String nombreProducto = (String) Tablproductos1.getValueAt(selectedRow, 1);
            String precioProducto = (String) Tablproductos1.getValueAt(selectedRow, 2);
            //validar
            String numeroProductos = JOptionPane.showInputDialog("Ingrese la cantidad");
            DefaultTableModel modelFactura = (DefaultTableModel) JtableFactura.getModel();
            modelFactura.addRow(new Object[]{codigoProducto, nombreProducto, precioProducto, numeroProductos});
            tablaproductos.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún producto");
        }
    }
    //clientes

    private void activarJadialog(JDialog tablaClientes) {

        tablaClientes.setTitle("Listado Productos");
        tablaClientes.setSize(680, 330);
        tablaClientes.setLocationRelativeTo(this);
        tablaClientes.setVisible(true);
    }

    private void mostrarDatosCliente() {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        tblClientes.setEnabled(true);

        ObjectSet<Cliente> resultado = BaseBD.get(Cliente.class);

        String matriz[][] = new String[resultado.size()][13];
        int i = 0;
        for (Cliente cli : resultado) {

            matriz[i][0] = String.valueOf(cli.getiD_Cliente());
            matriz[i][1] = cli.getNombreUsuario();
            matriz[i][2] = cli.getPassword();
            matriz[i][3] = cli.getCedula();
            matriz[i][4] = cli.getNombres();
            matriz[i][5] = cli.getApellidos();
            matriz[i][6] = cli.getDireccion();
            matriz[i][7] = cli.getCorreo();
            matriz[i][8] = cli.getCorreoRecuperacion();
            matriz[i][9] = cli.getCelular();
            matriz[i][10] = cli.getFechaNacimiento();
            matriz[i][11] = cli.getEstadoCivil();
            matriz[i][12] = cli.getGenero();
            i++;
        }

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{"ID Cliente", "Usuario", "Contraseña", "Cedula", "Nombres", "Apellidos", "Direccion", "Correo Electronico", "Correo recuperacion", "Celular", "Fecha Nacimiento",
                    "Estado Civil", "Genero"}
        ));
        BaseBD.close();
    }
    public void setearcliente(){
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtableFactura;
    private javax.swing.JTable Tablproductos1;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnAñadir1;
    private javax.swing.JButton btnAñadir2;
    private rsbuttongradiente.RSButtonGradiente btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarVenta;
    private rsbuttongradiente.RSButtonGradiente btnInsertar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnResibo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCuadro;
    private javax.swing.JLabel lblCuadro1;
    private javax.swing.JLabel lblDatosCli;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTituloFac;
    private javax.swing.JLabel lblTotalFAc;
    private javax.swing.JLabel lblValorDes;
    private javax.swing.JLabel lblcedula;
    private javax.swing.JLabel lblcodFac1;
    private javax.swing.JLabel lbllineas;
    private javax.swing.JLabel lblverlis;
    private rojeru_san.RSButton rSButton1;
    private javax.swing.JDialog tablaClientes;
    private javax.swing.JDialog tablaproductos;
    private javax.swing.JTable tblClientes;
    private javax.swing.JScrollPane tblProductos;
    private rojeru_san.RSMTextFull txtBuscar;
    private rojeru_san.RSMTextFull txtBuscar1;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcodigoFac;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
