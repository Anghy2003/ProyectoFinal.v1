
package Vista.Cruds.CRUDS1;

import Conexion.Conexion_db;
import Models.IdManager;
import Models.Vendedor;
import Vista.Menu.VistaMenu;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CrudPanelVendedor extends javax.swing.JPanel {

    /**
     * Creates new form CrudPanelVendedor1
     *
     * @param iD_Vendedor
     * @param sueldoBase_Vendedor
     * @param comiciones_Vendedor
     * @param numeroVentas_Vendedor
     * @param iD_Usuario
     * @param usuario
     * @param password
     * @param correoRecuperacion
     * @param cedula
     * @param nombres
     * @param apellidos
     * @param direccion
     * @param correo
     * @param celular
     * @param genero
     * @param fechaNacimiento
     * @param estadoCivil
     */
    public void GuardarVendedor( double sueldoBase_Vendedor, double comiciones_Vendedor, int numeroVentas_Vendedor, String iD_Usuario, String usuario, String password,
            String correoRecuperacion, String cedula, String nombres, String apellidos, String direccion, String correo, String celular, String genero, String fechaNacimiento,
            String estadoCivil) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        
        String iD_Vendedor = "";
        int cantidadCoincidencias = cantidadobjetos(iD_Vendedor);
            String asignarid = "Ven-" + cantidadCoincidencias;

        Vendedor vendedor = new Vendedor(iD_Vendedor, sueldoBase_Vendedor, comiciones_Vendedor, numeroVentas_Vendedor, iD_Usuario, usuario, password,
                correoRecuperacion, cedula, nombres, apellidos, direccion, correo, celular, genero, fechaNacimiento, estadoCivil);

        BaseBD.close();

        if (VerificarVendedor(cedula) == 0) {

            BaseBD = Conexion_db.ConectarBD();
            BaseBD.set(vendedor);
            BaseBD.close();

            JOptionPane.showMessageDialog(this, "Vendedor Guardado");

        } else {

            JOptionPane.showMessageDialog(this, "Ya existe el Vendedor ");
        }
    }

    public static int VerificarVendedor(String cedula) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        Vendedor buscaVendedor = new Vendedor(null, 0.0, 0.0, 0, null, null, null, null, cedula,
                null, null, null, null, null, null, null, null);

        ObjectSet resultado = BaseBD.get(buscaVendedor);
        int coincidencias = resultado.size();

        BaseBD.close();
        return coincidencias;
    }

    public CrudPanelVendedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Cedula_Ven = new javax.swing.JLabel();
        lblNombres_Ven = new javax.swing.JLabel();
        lblApellidos_Ven = new javax.swing.JLabel();
        lblDireccion_Ven = new javax.swing.JLabel();
        lblCorreo_Ven = new javax.swing.JLabel();
        lblComiciones_Ven = new javax.swing.JLabel();
        lblFEchaNac_Ven = new javax.swing.JLabel();
        lblGenero_Ven = new javax.swing.JLabel();
        lblEstadoCivil_Ven = new javax.swing.JLabel();
        txtCedulaVendedor = new rojeru_san.RSMTextFull();
        txtNombresVendedor = new rojeru_san.RSMTextFull();
        txtApellidosVendedor = new rojeru_san.RSMTextFull();
        txtDireccionVendedor = new rojeru_san.RSMTextFull();
        txtCorreoVendedor = new rojeru_san.RSMTextFull();
        txtComicionesVendedor = new rojeru_san.RSMTextFull();
        btnCancelar = new rojeru_san.RSButtonRiple();
        jDateFechaNacVendedor = new com.toedter.calendar.JDateChooser();
        cbxGeneroVendedor = new javax.swing.JComboBox<>();
        cbxEstadoCivilVendedor = new javax.swing.JComboBox<>();
        btnGuardar = new rojeru_san.RSButtonRiple();
        lblPassword_Ven = new javax.swing.JLabel();
        txtPasswordVendedor = new rojeru_san.RSMTextFull();
        lblNumeroVentas_Ven = new javax.swing.JLabel();
        lblSueldo_Ven = new javax.swing.JLabel();
        lblCelular_Ven = new javax.swing.JLabel();
        txtNumeroVentasVendedor = new rojeru_san.RSMTextFull();
        txtSueldoVendedor = new rojeru_san.RSMTextFull();
        txtCelularVendedor = new rojeru_san.RSMTextFull();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Registro Vendedor");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 260, 40));

        Cedula_Ven.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        Cedula_Ven.setForeground(new java.awt.Color(0, 53, 79));
        Cedula_Ven.setText("Cédula/Usuario:");
        jPanel2.add(Cedula_Ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 40));

        lblNombres_Ven.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblNombres_Ven.setForeground(new java.awt.Color(0, 53, 79));
        lblNombres_Ven.setText("Nombres:");
        jPanel2.add(lblNombres_Ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, 40));

        lblApellidos_Ven.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblApellidos_Ven.setForeground(new java.awt.Color(0, 53, 79));
        lblApellidos_Ven.setText("Apellidos:");
        jPanel2.add(lblApellidos_Ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, 40));

        lblDireccion_Ven.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblDireccion_Ven.setForeground(new java.awt.Color(0, 53, 79));
        lblDireccion_Ven.setText("Dirección");
        jPanel2.add(lblDireccion_Ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 90, 40));

        lblCorreo_Ven.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCorreo_Ven.setForeground(new java.awt.Color(0, 53, 79));
        lblCorreo_Ven.setText("Correo Electrónico:");
        jPanel2.add(lblCorreo_Ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 190, 40));

        lblComiciones_Ven.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblComiciones_Ven.setForeground(new java.awt.Color(0, 53, 79));
        lblComiciones_Ven.setText("Comiciones:");
        jPanel2.add(lblComiciones_Ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 120, 40));

        lblFEchaNac_Ven.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblFEchaNac_Ven.setForeground(new java.awt.Color(0, 53, 79));
        lblFEchaNac_Ven.setText("Fecha Nacimiento:");
        jPanel2.add(lblFEchaNac_Ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 180, 40));

        lblGenero_Ven.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblGenero_Ven.setForeground(new java.awt.Color(0, 53, 79));
        lblGenero_Ven.setText("Género:");
        jPanel2.add(lblGenero_Ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 80, 40));

        lblEstadoCivil_Ven.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblEstadoCivil_Ven.setForeground(new java.awt.Color(0, 53, 79));
        lblEstadoCivil_Ven.setText("Estado Civil:");
        jPanel2.add(lblEstadoCivil_Ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 120, 40));

        txtCedulaVendedor.setForeground(new java.awt.Color(0, 53, 79));
        txtCedulaVendedor.setColorTransparente(true);
        txtCedulaVendedor.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCedulaVendedor.setPlaceholder("0123456789");
        jPanel2.add(txtCedulaVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 200, 40));

        txtNombresVendedor.setForeground(new java.awt.Color(0, 53, 79));
        txtNombresVendedor.setColorTransparente(true);
        txtNombresVendedor.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombresVendedor.setPlaceholder("Escriba los nombres");
        jPanel2.add(txtNombresVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 200, 40));

        txtApellidosVendedor.setForeground(new java.awt.Color(0, 53, 79));
        txtApellidosVendedor.setColorTransparente(true);
        txtApellidosVendedor.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtApellidosVendedor.setPlaceholder("Escriba los apellidos");
        jPanel2.add(txtApellidosVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, 40));

        txtDireccionVendedor.setForeground(new java.awt.Color(0, 53, 79));
        txtDireccionVendedor.setColorTransparente(true);
        txtDireccionVendedor.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDireccionVendedor.setPlaceholder("Escriba la dirección");
        jPanel2.add(txtDireccionVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 200, 40));

        txtCorreoVendedor.setForeground(new java.awt.Color(0, 53, 79));
        txtCorreoVendedor.setColorTransparente(true);
        txtCorreoVendedor.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCorreoVendedor.setPlaceholder("Escriba su correo electronico");
        jPanel2.add(txtCorreoVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 250, 40));

        txtComicionesVendedor.setForeground(new java.awt.Color(0, 53, 79));
        txtComicionesVendedor.setColorTransparente(true);
        txtComicionesVendedor.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtComicionesVendedor.setPlaceholder("Escriba su número celular");
        jPanel2.add(txtComicionesVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 230, 40));

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, -1, -1));
        jPanel2.add(jDateFechaNacVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 140, 30));

        cbxGeneroVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cbxGeneroVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 150, 30));

        cbxEstadoCivilVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cbxEstadoCivilVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 150, 30));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, -1, -1));

        lblPassword_Ven.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblPassword_Ven.setForeground(new java.awt.Color(0, 53, 79));
        lblPassword_Ven.setText("Contraseña:");
        jPanel2.add(lblPassword_Ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 40));

        txtPasswordVendedor.setForeground(new java.awt.Color(0, 53, 79));
        txtPasswordVendedor.setColorTransparente(true);
        txtPasswordVendedor.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtPasswordVendedor.setPlaceholder("123abc");
        jPanel2.add(txtPasswordVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 200, 40));

        lblNumeroVentas_Ven.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblNumeroVentas_Ven.setForeground(new java.awt.Color(0, 53, 79));
        lblNumeroVentas_Ven.setText("Numero Ventas:");
        jPanel2.add(lblNumeroVentas_Ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 160, 40));

        lblSueldo_Ven.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblSueldo_Ven.setForeground(new java.awt.Color(0, 53, 79));
        lblSueldo_Ven.setText("Sueldo:");
        jPanel2.add(lblSueldo_Ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 80, 40));

        lblCelular_Ven.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCelular_Ven.setForeground(new java.awt.Color(0, 53, 79));
        lblCelular_Ven.setText("Celular:");
        jPanel2.add(lblCelular_Ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 80, 40));

        txtNumeroVentasVendedor.setForeground(new java.awt.Color(0, 53, 79));
        txtNumeroVentasVendedor.setColorTransparente(true);
        txtNumeroVentasVendedor.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNumeroVentasVendedor.setPlaceholder("Escriba su número celular");
        jPanel2.add(txtNumeroVentasVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 230, 40));

        txtSueldoVendedor.setForeground(new java.awt.Color(0, 53, 79));
        txtSueldoVendedor.setColorTransparente(true);
        txtSueldoVendedor.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtSueldoVendedor.setPlaceholder("Escriba su número celular");
        jPanel2.add(txtSueldoVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 230, 40));

        txtCelularVendedor.setForeground(new java.awt.Color(0, 53, 79));
        txtCelularVendedor.setColorTransparente(true);
        txtCelularVendedor.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCelularVendedor.setPlaceholder("Escriba su número celular");
        jPanel2.add(txtCelularVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 230, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 448, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 448, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 319, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 319, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

    }//GEN-LAST:event_btnCancelarMouseClicked
public static int cantidadobjetos( String idVendedor) {
    ObjectContainer BaseBD = Conexion_db.ConectarBD();
    Vendedor vendedorBuscar = new Vendedor(idVendedor); // Crear un objeto Vendedor con la cédula a buscar
    ObjectSet<Vendedor> resultado = BaseBD.get(vendedorBuscar); // Obtener los vendedores que coincidan con el objeto buscado
    int coincidencias = resultado.size();
    BaseBD.close();
    return coincidencias; // Devolver la cantidad de vendedores encontrados
}


    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        boolean usuarioRepetido = false;
        
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        
        if (VerificarVendedor(txtCedulaVendedor.getText()) != 0) {
            JOptionPane.showMessageDialog(null, "Vendedor ya registrado");
            usuarioRepetido = true;
        }

        if (!usuarioRepetido) {

            

            Date fechaNacimientoDate = jDateFechaNacVendedor.getDate(); // Obtener la fecha de nacimiento del JDateChooser

            // Formatear la fecha como String en el formato deseado (por ejemplo, "dd/MM/yyyy")
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimiento = sdf.format(fechaNacimientoDate);

//            ObjectSet<IdManager> result = BaseBD.query(IdManager.class);
//            IdManager idManager;
//            if (result.isEmpty()) {
//                idManager = new IdManager();
//            } else {
//                idManager = result.get(0);
//            }
//
//            // GENERAR NUEVOS ID
//            int newVendedorId = idManager.getLastClienteId() + 1;
//            int newUsuarioId = idManager.getLastUsuarioId() + 1;

            Boolean valido = false;

            //asignar id
            
            
            if (valido = txtCedulaVendedor.getText().matches("\\d{10}")) {
                if (valido = txtNombresVendedor.getText().toUpperCase().matches("^[a-zA-Z]+$")) {
                    if (valido = txtApellidosVendedor.getText().toUpperCase().matches("^[a-zA-Z]+$")) {
                        if (valido = txtDireccionVendedor.getText().toUpperCase().matches("^[a-zA-Z]+$")) {
                            if (valido = txtCorreoVendedor.getText().matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
                                if (valido = txtCelularVendedor.getText().matches("^09\\d{8}$")) {

                                    
                                    GuardarVendedor( Double.parseDouble(txtSueldoVendedor.getText()), Double.parseDouble(txtComicionesVendedor.getText()), Integer.parseInt(txtNumeroVentasVendedor.getText()), null,
                                            txtCedulaVendedor.getText(), txtPasswordVendedor.getText(), txtCorreoVendedor.getText(), txtCedulaVendedor.getText(), txtNombresVendedor.getText().toUpperCase(),
                                            txtApellidosVendedor.getText().toUpperCase(), txtDireccionVendedor.getText().toUpperCase(), txtCorreoVendedor.getText(), txtCelularVendedor.getText(), (String) cbxGeneroVendedor.getSelectedItem(),
                                            fechaNacimiento, (String) cbxEstadoCivilVendedor.getSelectedItem());

                                } else {
                                    JOptionPane.showMessageDialog(null, "Ingrese un celular valido");
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "Ingrese un correo valida");
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Ingrese una direccion valida");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese un apellido valido");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un nombre valido");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una cedula valida");
            }

            
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void ShowpanelCruds(JPanel p) {
        p.setSize(870, 630);
        p.setLocation(0, 0);
        VistaMenu.PanelPrincipal.removeAll();
        VistaMenu.PanelPrincipal.add(p, BorderLayout.CENTER);
        VistaMenu.PanelPrincipal.revalidate();
        VistaMenu.PanelPrincipal.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cedula_Ven;
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private javax.swing.JComboBox<String> cbxEstadoCivilVendedor;
    private javax.swing.JComboBox<String> cbxGeneroVendedor;
    private com.toedter.calendar.JDateChooser jDateFechaNacVendedor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblApellidos_Ven;
    private javax.swing.JLabel lblCelular_Ven;
    private javax.swing.JLabel lblComiciones_Ven;
    private javax.swing.JLabel lblCorreo_Ven;
    private javax.swing.JLabel lblDireccion_Ven;
    private javax.swing.JLabel lblEstadoCivil_Ven;
    private javax.swing.JLabel lblFEchaNac_Ven;
    private javax.swing.JLabel lblGenero_Ven;
    private javax.swing.JLabel lblNombres_Ven;
    private javax.swing.JLabel lblNumeroVentas_Ven;
    private javax.swing.JLabel lblPassword_Ven;
    private javax.swing.JLabel lblSueldo_Ven;
    private rojeru_san.RSMTextFull txtApellidosVendedor;
    private rojeru_san.RSMTextFull txtCedulaVendedor;
    private rojeru_san.RSMTextFull txtCelularVendedor;
    private rojeru_san.RSMTextFull txtComicionesVendedor;
    private rojeru_san.RSMTextFull txtCorreoVendedor;
    private rojeru_san.RSMTextFull txtDireccionVendedor;
    private rojeru_san.RSMTextFull txtNombresVendedor;
    private rojeru_san.RSMTextFull txtNumeroVentasVendedor;
    private rojeru_san.RSMTextFull txtPasswordVendedor;
    private rojeru_san.RSMTextFull txtSueldoVendedor;
    // End of variables declaration//GEN-END:variables
}
