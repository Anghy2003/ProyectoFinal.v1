package Citas;

import Conexion.Conexion_db;
import Models.Cita;
import Models.Mecanico;

import Models.Servicios;
import Models.Vehiculo;
import static Models.Vendedor.Estado.ACTIVO;

import Vista.Menu.VistaMenu;

import Vista.Tables.TablaServicios;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CrudlistadosServicios extends javax.swing.JPanel {

     private byte[] imagenServicio;
    public CrudlistadosServicios() {
        initComponents();
        mostrarCombo();
        mostrarDatosmecanico();
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TablaMeacanicos = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaServicios = new javax.swing.JTable();
        txtBuscar = new rojeru_san.RSMTextFull();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new rsbuttongradiente.RSButtonGradiente();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombres = new rojeru_san.RSMTextFull();
        txtDuracion = new rojeru_san.RSMTextFull();
        btnCancelar = new rojeru_san.RSButtonRiple();
        btnGuardar = new rojeru_san.RSButtonRiple();
        lblPrecioProducto = new javax.swing.JLabel();
        lblCodigoocategoria = new javax.swing.JLabel();
        lblNumeroProductos = new javax.swing.JLabel();
        lblExistenciaMinima = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new rojeru_san.RSMTextFull();
        txtPrecio = new rojeru_san.RSMTextFull();
        txtIdMecanico = new rojeru_san.RSMTextFull();
        CmbPlaca = new javax.swing.JComboBox<>();
        btnBuscarMecanico = new rojeru_san.RSButtonRiple();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        jLabel1.setText("Listado Mecánicos");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tablaServicios.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tablaServicios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaServicios);

        txtBuscar.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        txtBuscar.setPlaceholder("ejm. 0106388747");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel3.setText("Buscar");

        btnAgregar.setText("Agregar");
        btnAgregar.setColorPrimario(new java.awt.Color(0, 204, 51));
        btnAgregar.setColorPrimarioHover(new java.awt.Color(0, 204, 51));
        btnAgregar.setColorSecundario(new java.awt.Color(153, 255, 153));
        btnAgregar.setColorSecundarioHover(new java.awt.Color(204, 255, 204));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(39, 39, 39)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 372, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TablaMeacanicosLayout = new javax.swing.GroupLayout(TablaMeacanicos.getContentPane());
        TablaMeacanicos.getContentPane().setLayout(TablaMeacanicosLayout);
        TablaMeacanicosLayout.setHorizontalGroup(
            TablaMeacanicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 863, Short.MAX_VALUE)
            .addGroup(TablaMeacanicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TablaMeacanicosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        TablaMeacanicosLayout.setVerticalGroup(
            TablaMeacanicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
            .addGroup(TablaMeacanicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TablaMeacanicosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Ordenes De Servicios ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 40));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 53, 79));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 100, 20));

        txtNombres.setForeground(new java.awt.Color(0, 53, 79));
        txtNombres.setColorTransparente(true);
        txtNombres.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombres.setPlaceholder("Escriba el nombre");
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 280, 40));

        txtDuracion.setForeground(new java.awt.Color(0, 53, 79));
        txtDuracion.setColorTransparente(true);
        txtDuracion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDuracion.setPlaceholder("Duración del Servicio");
        jPanel1.add(txtDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 280, 40));

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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        lblPrecioProducto.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblPrecioProducto.setForeground(new java.awt.Color(0, 53, 79));
        lblPrecioProducto.setText("Precio Total:");
        jPanel1.add(lblPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        lblCodigoocategoria.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblCodigoocategoria.setForeground(new java.awt.Color(0, 53, 79));
        lblCodigoocategoria.setText("Duración del servicio:");
        jPanel1.add(lblCodigoocategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        lblNumeroProductos.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblNumeroProductos.setForeground(new java.awt.Color(0, 53, 79));
        lblNumeroProductos.setText("Mecanico:");
        jPanel1.add(lblNumeroProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 150, 20));

        lblExistenciaMinima.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblExistenciaMinima.setForeground(new java.awt.Color(0, 53, 79));
        lblExistenciaMinima.setText("Placa del Vehiculo:");
        jPanel1.add(lblExistenciaMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        lblDescripcion.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 53, 79));
        lblDescripcion.setText("Descripción:");
        jPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 120, -1));

        txtDescripcion.setForeground(new java.awt.Color(0, 53, 79));
        txtDescripcion.setColorTransparente(true);
        txtDescripcion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDescripcion.setPlaceholder("Descripción");
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 280, 40));

        txtPrecio.setForeground(new java.awt.Color(0, 53, 79));
        txtPrecio.setColorTransparente(true);
        txtPrecio.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtPrecio.setPlaceholder("Escriba el precio");
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 200, 40));

        txtIdMecanico.setForeground(new java.awt.Color(0, 53, 79));
        txtIdMecanico.setColorTransparente(true);
        txtIdMecanico.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtIdMecanico.setPlaceholder("ID del Mecanico");
        jPanel1.add(txtIdMecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 200, 40));

        CmbPlaca.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.add(CmbPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 200, 30));

        btnBuscarMecanico.setBackground(new java.awt.Color(0, 204, 0));
        btnBuscarMecanico.setText("Buscar");
        btnBuscarMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMecanicoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarMecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        TablaServicios tblser = new TablaServicios();
        MostrarpaneCruds(tblser);
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        TablaServicios tblser = new TablaServicios();
        MostrarpaneCruds(tblser);
    }//GEN-LAST:event_btnCancelarActionPerformed
    private void MostrarpaneCruds(JPanel p) {
        p.setSize(870, 630);
        p.setLocation(0, 0);
        VistaMenu.PanelPrincipal.removeAll();
        VistaMenu.PanelPrincipal.add(p, BorderLayout.CENTER);
        VistaMenu.PanelPrincipal.revalidate();
        VistaMenu.PanelPrincipal.repaint();
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
 if (!txtNombres.getText().trim().isBlank()) {
            if (!txtDuracion.getText().isBlank()) {
                Boolean valido = false; // creamos una bandera para validar datos

                // número con dos decimales para el precio
                if (valido = txtPrecio.getText().matches("^\\d+(\\.\\d{1,2})?$")) {
                    

                    JOptionPane.showMessageDialog(this, "Servicio Guardado");
                    resetCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "Ingrese un precio válido (ejemplo: 10.99)");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No deje espacios en blanco en la duración del servicio");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No deje espacios en blanco en el nombre del servicio");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    private void resetCampos() {
        txtNombres.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        txtDuracion.setText("");
        txtIdMecanico.setText("");
        CmbPlaca.setSelectedIndex(0);
        
    }
// Método para obtener el próximo código de servicio disponible

  private static String obtenerProximoCodigoCita(ObjectContainer db) {
    // Consultar todos los servicios
    ObjectSet<Servicios> result = db.query(Servicios.class);

    // Determinar el máximo ID numérico existente
    int masid = 0;
    for (Servicios servicio : result) {
        String codigo = servicio.getCodigo_Servicio();
        if (codigo != null && codigo.startsWith("SER")) {
            int id = Integer.parseInt(codigo.substring(3)); // Extraer la parte numérica del código
            if (id > masid) {
                masid = id;
            }
        }
    }
    // El próximo ID es el máximo + 1
    int siguienteID = masid + 1;
    // Retornar el nuevo código concatenado con "SER"
    return "SER" + siguienteID;
}

// Método para guardar un nuevo servicio
   public static void guardarCita(String Codigo_cita, String fecha_cita, String cedula_cliente, String codigo_servicio, String hora, String codigo_Servicio,
            double precioTotal, String duracion_Servicio, String Id_mecanico, String placa_Vehiculo, Cita.Estado estado) {
        ObjectContainer baseBD = Conexion_db.ConectarBD();
       
        String codigo_cita = obtenerProximoCodigoCita(baseBD);

        if (verificarCita(baseBD, codigo_cita) == 0) {
           
            Cita nuevoServicio = new Cita(  Codigo_cita,  fecha_cita,  cedula_cliente,  codigo_servicio,  hora,  codigo_Servicio,
             precioTotal,  duracion_Servicio,  Id_mecanico,  placa_Vehiculo, estado);
            baseBD.set(nuevoServicio);
            JOptionPane.showMessageDialog(null, "Servicio guardado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El código de servicio ya existe. Intente nuevamente.");
        }
        baseBD.close();
    }
// Método para verificar si un servicio existe
    public static int verificarCita(ObjectContainer baseBD, String Codigo_cita) {
//         Crear objeto para buscar el servicio por su código
        Cita servicioBusca = new Cita( Codigo_cita, null, null, null, null, null,
            0.0, null, null, null, null);
        ObjectSet<Servicios> resultado = baseBD.get(servicioBusca);
        return resultado.size();
    }
    private void btnBuscarMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMecanicoActionPerformed
       activarJdialog(TablaMeacanicos);
    }//GEN-LAST:event_btnBuscarMecanicoActionPerformed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        mostrarNombreMecanico();
    }//GEN-LAST:event_btnAgregarActionPerformed
     private void mostrarCombo() {
//abrir base
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
// Consulta a la base de datos para obtener todos los objetos Ciudad
        ObjectSet<Vehiculo> vehiculito = BaseBD.query(Vehiculo.class);

// Itera sobre los resultados y agrega los nombres de ciudades al JComboBox
        vehiculito.forEach((vehi) -> {
            CmbPlaca.addItem(vehi.getPlaca_Vehiculo());
        });
        BaseBD.close();
    }
private void mostrarNombreMecanico() {
    // Establecer conexión con la base de datos
    ObjectContainer BaseBD = Conexion_db.ConectarBD();

    // Crear un objeto de consulta para buscar proveedores
    Query mecanicoQuery = BaseBD.query();
    mecanicoQuery.constrain(Mecanico.class);
    ObjectSet<Mecanico> resultado = mecanicoQuery.execute();

    boolean encontrado = false;
    String inputCodigo = txtIdMecanico.getText().trim();

    // Iterar sobre los resultados para encontrar y cargar el nombre del proveedor
    for (Mecanico miMecanico : resultado) {
        String codigoProveedor = miMecanico.getCedula().trim();
        
        if (codigoProveedor.equals(inputCodigo)) {
            txtIdMecanico.setText(miMecanico.getNombres());
            encontrado = true;
            break;
        }
    }

    if (!encontrado) {
        JOptionPane.showMessageDialog(this, "No se encontró Mecanico");
    }

    // Cerrar la conexión con la base de datos
    BaseBD.close();
}
 private void mostrarDatosmecanico() {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();
    tablaServicios.setEnabled(true);

    Query query = BaseBD.query();
    query.constrain(Mecanico.class);
    query.descend("estado").constrain(ACTIVO);

    ObjectSet<Mecanico> resultado = query.execute();

    String[][] matriz = new String[resultado.size()][4];
    int i = 0;
    for (Mecanico meca : resultado) {
        matriz[i][0] = meca.getCedula();
        matriz[i][1] = meca.getNombres();
        matriz[i][2] = meca.getApellidos();
        matriz[i][3] = meca.getDireccion();
        i++;
    }

    tablaServicios.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{
        "Cedula", "Nombres", "Apellidos", "Direccion"
    }));
    tablaServicios.setEnabled(false);
    BaseBD.close();
    }
 private void activarJdialog(JDialog TablaServicios) {

        TablaServicios.setTitle("Listado Provedores");
        TablaServicios.setSize(680, 330);
        TablaServicios.setLocationRelativeTo(this);
        TablaServicios.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbPlaca;
    private javax.swing.JDialog TablaMeacanicos;
    private rsbuttongradiente.RSButtonGradiente btnAgregar;
    private rojeru_san.RSButtonRiple btnBuscarMecanico;
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoocategoria;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblExistenciaMinima;
    private javax.swing.JLabel lblNumeroProductos;
    private javax.swing.JLabel lblPrecioProducto;
    private javax.swing.JTable tablaServicios;
    private rojeru_san.RSMTextFull txtBuscar;
    private rojeru_san.RSMTextFull txtDescripcion;
    private rojeru_san.RSMTextFull txtDuracion;
    private rojeru_san.RSMTextFull txtIdMecanico;
    private rojeru_san.RSMTextFull txtNombres;
    private rojeru_san.RSMTextFull txtPrecio;
    // End of variables declaration//GEN-END:variables
}