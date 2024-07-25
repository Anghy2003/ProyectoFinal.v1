package Vista.Cruds.CRUDS1;

import Conexion.Conexion_db;
import Models.Cliente;
import Vista.Menu.VistaMenu;
import Vista.Tables.TablaClientes;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

import java.awt.BorderLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CrudPanelCliente2 extends javax.swing.JPanel {

    private String BuscarCliente;

    public CrudPanelCliente2(String receivedString) {
        this.BuscarCliente = receivedString;
        initComponents();
        Clientebuscar();

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
        lblFEchaNac_Ven = new javax.swing.JLabel();
        lblGenero_Ven = new javax.swing.JLabel();
        lblEstadoCivil_Ven = new javax.swing.JLabel();
        txtCedulaVendedor = new rojeru_san.RSMTextFull();
        txtNombresVendedor = new rojeru_san.RSMTextFull();
        txtApellidosVendedor = new rojeru_san.RSMTextFull();
        txtDireccionVendedor = new rojeru_san.RSMTextFull();
        txtCorreoVendedor = new rojeru_san.RSMTextFull();
        btnCancelar = new rojeru_san.RSButtonRiple();
        jDateFechaNac_Cli = new com.toedter.calendar.JDateChooser();
        cbxGenero = new javax.swing.JComboBox<>();
        cbxEstadoCi = new javax.swing.JComboBox<>();
        btnModificar = new rojeru_san.RSButtonRiple();
        lblPassword_Ven = new javax.swing.JLabel();
        lblCelular_Ven = new javax.swing.JLabel();
        txtCelularVendedor = new rojeru_san.RSMTextFull();
        txtPasswordCli = new rojeru_san.RSMPassView();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Modificar Cliente");
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
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, -1, -1));
        jPanel2.add(jDateFechaNac_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 140, 30));

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMENINO" }));
        jPanel2.add(cbxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 150, 30));

        cbxEstadoCi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SOLTERO", "CASADO", "VIUDO", "DIVORCIADO", "UNION LIBRE" }));
        jPanel2.add(cbxEstadoCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 150, 30));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, -1, -1));

        lblPassword_Ven.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblPassword_Ven.setForeground(new java.awt.Color(0, 53, 79));
        lblPassword_Ven.setText("Contraseña:");
        jPanel2.add(lblPassword_Ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 40));

        lblCelular_Ven.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCelular_Ven.setForeground(new java.awt.Color(0, 53, 79));
        lblCelular_Ven.setText("Celular:");
        jPanel2.add(lblCelular_Ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 80, 40));

        txtCelularVendedor.setForeground(new java.awt.Color(0, 53, 79));
        txtCelularVendedor.setColorTransparente(true);
        txtCelularVendedor.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCelularVendedor.setPlaceholder("Escriba su número celular");
        jPanel2.add(txtCelularVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 230, 40));

        txtPasswordCli.setForeground(new java.awt.Color(0, 53, 79));
        txtPasswordCli.setOpaque(false);
        txtPasswordCli.setPlaceholder("Digite su Contraseña");
        txtPasswordCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordCliActionPerformed(evt);
            }
        });
        jPanel2.add(txtPasswordCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 210, 40));

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

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        Boolean valido = false;
            
            Date fechaNacimientoDate = jDateFechaNac_Cli.getDate(); // Obtener la fecha de nacimiento del JDateChooser

            // Formatear la fecha como String en el formato deseado (por ejemplo, "dd/MM/yyyy")
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimiento = sdf.format(fechaNacimientoDate);

           
            if (valido = txtCedulaVendedor.getText().matches("\\d{10}")) {
                if (valido = txtNombresVendedor.getText().toUpperCase().matches("^[a-zA-Z]+$")) {
                    if (valido = txtApellidosVendedor.getText().toUpperCase().matches("^[a-zA-Z]+$")) {
                        if (valido = txtDireccionVendedor.getText().toUpperCase().matches("^[a-zA-Z]+$")) {
                            if (valido = txtCorreoVendedor.getText().matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
                                if (valido = txtCelularVendedor.getText().matches("^09\\d{8}$")) {

                                    
                                    modificarCliente( Cliente.Estado.ACTIVO,  txtCedulaVendedor.getText(), txtNombresVendedor.getText().toUpperCase(), txtApellidosVendedor.getText().toUpperCase(),
                                            txtDireccionVendedor.getText().toUpperCase(), txtCorreoVendedor.getText(),
                                            txtCelularVendedor.getText(),(String) cbxGenero.getSelectedItem() , fechaNacimiento, (String) cbxEstadoCi.getSelectedItem(), txtCedulaVendedor.getText(),
                                            txtPasswordCli.getText(), txtCorreoVendedor.getText());
                                    

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


    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtPasswordCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordCliActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         System.out.println("salir");
        TablaClientes tblCli = new TablaClientes();
        ShowpanelCruds(tblCli);
    }//GEN-LAST:event_btnCancelarActionPerformed

    public final void Clientebuscar() {

        Boolean encontrado = true;

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        Query cliente = BaseBD.query();
        cliente.constrain(Cliente.class);
        cliente.descend("cedula").constrain(BuscarCliente);
        ObjectSet<Cliente> resultado = cliente.execute();

        for (Cliente cli : resultado) {

            txtCedulaVendedor.setText(cli.getCedula());
            txtCedulaVendedor.setEnabled(false); // porque es el atributo principal
            txtPasswordCli.setText(cli.getPassword());
            txtNombresVendedor.setText(cli.getNombres());
            txtApellidosVendedor.setText(cli.getApellidos());
            txtDireccionVendedor.setText(cli.getDireccion());
            txtCorreoVendedor.setText(cli.getCorreo());
            txtCelularVendedor.setText(cli.getCelular());            
            cbxGenero.setSelectedItem(cli.getGenero());
            cbxEstadoCi.setSelectedItem(cli.getEstadoCivil());
            jDateFechaNac_Cli.setDate(convertirStringADate(cli.getFechaNacimiento()));

           
            encontrado = true;
            JOptionPane.showMessageDialog(this, "Encontrado");
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "No se encontraron Datos");
        }
        BaseBD.close();
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
    public void modificarCliente( Cliente.Estado estado, String cedula, String nombres, String apellidos, String direccion, String correo, String celular,
            String genero, String fechaNacimiento, String estadoCivil, String nombreUsuario, String password, String correoRecuperacion) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        Cliente modificarCliente = new Cliente( estado,  cedula,  nombres,  apellidos,  direccion,  correo,  celular,
             genero,  fechaNacimiento,  estadoCivil,  nombreUsuario,  password,  correoRecuperacion);

        Cliente clienteBusca = new Cliente( null, cedula, null,
                null, null, null, null, null, null, null, null,
                null, null);

        ObjectSet resultado = BaseBD.get(clienteBusca);

        int coincidencias = resultado.size();

        if (coincidencias > 0) {

            Cliente clienteVEliminar = (Cliente) resultado.next();
            BaseBD.delete(clienteVEliminar);

            BaseBD.set(modificarCliente);
            JOptionPane.showMessageDialog(this, "Vendedor Modificado");

        } else {
            JOptionPane.showMessageDialog(this, "No se encontro ningun vehiculo");
        }

        BaseBD.close();
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
    private javax.swing.JLabel Cedula_Ven;
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnModificar;
    private javax.swing.JComboBox<String> cbxEstadoCi;
    private javax.swing.JComboBox<String> cbxGenero;
    private com.toedter.calendar.JDateChooser jDateFechaNac_Cli;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblApellidos_Ven;
    private javax.swing.JLabel lblCelular_Ven;
    private javax.swing.JLabel lblCorreo_Ven;
    private javax.swing.JLabel lblDireccion_Ven;
    private javax.swing.JLabel lblEstadoCivil_Ven;
    private javax.swing.JLabel lblFEchaNac_Ven;
    private javax.swing.JLabel lblGenero_Ven;
    private javax.swing.JLabel lblNombres_Ven;
    private javax.swing.JLabel lblPassword_Ven;
    private rojeru_san.RSMTextFull txtApellidosVendedor;
    private rojeru_san.RSMTextFull txtCedulaVendedor;
    private rojeru_san.RSMTextFull txtCelularVendedor;
    private rojeru_san.RSMTextFull txtCorreoVendedor;
    private rojeru_san.RSMTextFull txtDireccionVendedor;
    private rojeru_san.RSMTextFull txtNombresVendedor;
    private rojeru_san.RSMPassView txtPasswordCli;
    // End of variables declaration//GEN-END:variables
}
