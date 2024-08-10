package Vista.Home;

import Conexion.Conexion_db;

import Models.Administrador;
import Models.Cliente;
import Models.Mecanico;
import Models.Persona;
import Models.Vendedor;
import Vista.Menu.VistaMenu;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.*;
import javax.swing.JOptionPane;
import utils.Global;
import java.awt.BorderLayout;

public class Home extends javax.swing.JFrame {

    private String rolUsuario;

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }
    

    public String getCedulaUsuario() {
        return CedulaUsuario;
    }

    public void setCedulaUsuario(String CedulaUsuario) {
        this.CedulaUsuario = CedulaUsuario;
    }
    

    public Home() {
        initComponents();
        this.setLocationRelativeTo(this);
         verificarYCrearAdminPorDefecto(); // Verifica y crea el administrador por defecto
    }
    public static String CedulaUsuario;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelPron = new javax.swing.JPanel();
        PanelPrin = new javax.swing.JPanel();
        lblIconoLogo = new javax.swing.JLabel();
        txtRolUsuario = new rojeru_san.RSMTextFull();
        jSeparator1 = new javax.swing.JSeparator();
        txtpassword = new rojeru_san.RSMPassView();
        btnCrearCuenta = new rsbuttongradiente.RSButtonGradiente();
        btnIniciarSesion = new rsbuttongradiente.RSButtonGradiente();
        jPanel2 = new javax.swing.JPanel();
        lblCerrarHome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        panelPron.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrin.setBackground(new java.awt.Color(229, 238, 255));
        PanelPrin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIconoLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/LOGOMECANICA3.1.png"))); // NOI18N

        txtRolUsuario.setForeground(new java.awt.Color(0, 53, 79));
        txtRolUsuario.setBordeColorFocus(new java.awt.Color(0, 53, 79));
        txtRolUsuario.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        txtRolUsuario.setPlaceholder("Usuario/Cedula");
        txtRolUsuario.setSelectionColor(new java.awt.Color(0, 53, 79));
        txtRolUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRolUsuarioActionPerformed(evt);
            }
        });
        txtRolUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRolUsuarioKeyTyped(evt);
            }
        });

        txtpassword.setForeground(new java.awt.Color(0, 53, 79));
        txtpassword.setBordeColorFocus(new java.awt.Color(0, 53, 79));
        txtpassword.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        txtpassword.setPlaceholder("Contraseña");

        btnCrearCuenta.setBackground(new java.awt.Color(65, 185, 36));
        btnCrearCuenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCrearCuenta.setText("Crear cuenta nueva");
        btnCrearCuenta.setColorPrimario(new java.awt.Color(65, 185, 36));
        btnCrearCuenta.setColorPrimarioHover(new java.awt.Color(65, 185, 36));
        btnCrearCuenta.setColorSecundario(new java.awt.Color(51, 204, 0));
        btnCrearCuenta.setColorSecundarioHover(new java.awt.Color(0, 255, 102));
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        btnIniciarSesion.setBackground(new java.awt.Color(8, 101, 254));
        btnIniciarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.setColorPrimario(new java.awt.Color(8, 101, 254));
        btnIniciarSesion.setColorPrimarioHover(new java.awt.Color(8, 101, 254));
        btnIniciarSesion.setColorSecundario(new java.awt.Color(0, 0, 204));
        btnIniciarSesion.setColorSecundarioHover(new java.awt.Color(0, 0, 204));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 53, 74));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCerrarHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrarHOME.png"))); // NOI18N
        lblCerrarHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrarHome.setEnabled(false);
        lblCerrarHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrarHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarHomeMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblCerrarHomeMouseReleased(evt);
            }
        });
        jPanel2.add(lblCerrarHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, -1));

        jLabel3.setBackground(new java.awt.Color(1, 53, 74));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/imagenhome.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 501, 753));

        javax.swing.GroupLayout PanelPrinLayout = new javax.swing.GroupLayout(PanelPrin);
        PanelPrin.setLayout(PanelPrinLayout);
        PanelPrinLayout.setHorizontalGroup(
            PanelPrinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrinLayout.createSequentialGroup()
                .addGroup(PanelPrinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrinLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelPrinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPrinLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPrinLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelPrinLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(PanelPrinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRolUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrinLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIconoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelPrinLayout.setVerticalGroup(
            PanelPrinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrinLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblIconoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(txtRolUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
        );

        panelPron.add(PanelPrin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 780));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(panelPron, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        CrudClientesForm miCrud=new CrudClientesForm();
        miCrud.setLocationRelativeTo(null); // Centra la ventana en la pantalla
        miCrud.setVisible(true);
        
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String cedula = obtenerUsuario();
        CedulaUsuario=txtRolUsuario.getText().trim();
        String password = obtenercontraseñaUsu();
        iniciarSesion(cedula, password);
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void lblCerrarHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarHomeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarHomeMouseClicked

    private void lblCerrarHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarHomeMouseEntered
        lblCerrarHome.setEnabled(true);
    }//GEN-LAST:event_lblCerrarHomeMouseEntered

    private void lblCerrarHomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarHomeMouseReleased
        lblCerrarHome.setEnabled(false);
    }//GEN-LAST:event_lblCerrarHomeMouseReleased

    private void lblCerrarHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarHomeMouseExited
        lblCerrarHome.setEnabled(false);
    }//GEN-LAST:event_lblCerrarHomeMouseExited

    private void txtRolUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRolUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRolUsuarioActionPerformed

    private void txtRolUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRolUsuarioKeyTyped
        char x = evt.getKeyChar();
        if (Character.isLetter(x)) {
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
            evt.consume();
        } else if (txtRolUsuario.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRolUsuarioKeyTyped
public void iniciarSesion(String cedula, String password) {
    ObjectContainer BaseBD = Conexion_db.ConectarBD();

    // Buscar  de clientes
    Cliente buscli = new Cliente();
    buscli.setCedula(cedula);
    ObjectSet<Cliente> resultadoCliente = BaseBD.queryByExample(buscli);
    if (resultadoCliente.hasNext()) {
        Cliente cliente = resultadoCliente.next();
        if (cliente.getPassword().equals(password)) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
            Global.rolUsuario = cliente.getRol().name();
            VistaMenu menucli = new VistaMenu(txtRolUsuario.getText().trim());
            menucli.setVisible(true);
            this.dispose();
            BaseBD.close();
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Contraseña Incorrecta");
            BaseBD.close();
            return;
        }
    }

    // Buscar de vendedores
    Vendedor busven = new Vendedor();
    busven.setCedula(cedula);
    ObjectSet<Vendedor> resultadoVendedor = BaseBD.queryByExample(busven);
    if (resultadoVendedor.hasNext()) {
        Vendedor vendedor = resultadoVendedor.next();
        if (vendedor.getPassword().equals(password)) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
            Global.rolUsuario = vendedor.getRol().name();
            VistaMenu menuven = new VistaMenu();
            menuven.setVisible(true);
            this.dispose();
            BaseBD.close();
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Contraseña Incorrecta");
            BaseBD.close();
            return;
        }
    }

    // Buscar de mecanicos
    Mecanico busmec = new Mecanico();
    busmec.setCedula(cedula);
    ObjectSet<Mecanico> resultadoMecanico = BaseBD.queryByExample(busmec);
    if (resultadoMecanico.hasNext()) {
        Mecanico mecanico = resultadoMecanico.next();
        if (mecanico.getPassword().equals(password)) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
            Global.rolUsuario = mecanico.getRol().name();
            VistaMenu menumec = new VistaMenu();
            menumec.setVisible(true);
            this.dispose();
            BaseBD.close();
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Contraseña Incorrecta");
            BaseBD.close();
            return;
        }
    }

    // Buscar de administradores
    Administrador busadm = new Administrador();
    busadm.setCedula(cedula);
    ObjectSet<Administrador> resultadoAdministrador = BaseBD.queryByExample(busadm);
    if (resultadoAdministrador.hasNext()) {
        Administrador administrador = resultadoAdministrador.next();
        if (administrador.getPassword().equals(password)) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
            Global.rolUsuario = administrador.getRol().name();
            VistaMenu menuadm = new VistaMenu();
            menuadm.setVisible(true);
            this.dispose();
            BaseBD.close();
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Contraseña Incorrecta");
            BaseBD.close();
            return;
        }
    }

    // Si no se encontro
    JOptionPane.showMessageDialog(this, "Usuario No Encontrado");
    BaseBD.close();
}

private void verificarYCrearAdminPorDefecto() {
    ObjectContainer BaseBD = Conexion_db.ConectarBD();
    Administrador exampleAdmin = new Administrador();
    ObjectSet<Administrador> result = BaseBD.queryByExample(exampleAdmin);

    if (result.isEmpty()) {
        Administrador defaultAdmin = new Administrador();
        defaultAdmin.setCedula("1234");
        defaultAdmin.setPassword("admin");
        defaultAdmin.setNombreUsuario("Default Admin");
        defaultAdmin.setRol(Persona.Rol.ADMINISTRADOR); // Usa el enum de Persona

        BaseBD.store(defaultAdmin);
        JOptionPane.showMessageDialog(this, "Administrador por defecto creado. Usuario: 1234, Contraseña: admin");
    }

    BaseBD.close();
}




    private String obtenerUsuario() {
        return txtRolUsuario.getText();
    }

    private String obtenercontraseñaUsu() {
        return new String(txtpassword.getPassword());
    }
    private String obtenerCedulaUsuario() {
        return txtRolUsuario.getText();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
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
    private javax.swing.JPanel PanelPrin;
    private rsbuttongradiente.RSButtonGradiente btnCrearCuenta;
    private rsbuttongradiente.RSButtonGradiente btnIniciarSesion;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCerrarHome;
    private javax.swing.JLabel lblIconoLogo;
    private javax.swing.JPanel panelPron;
    private rojeru_san.RSMTextFull txtRolUsuario;
    private rojeru_san.RSMPassView txtpassword;
    // End of variables declaration//GEN-END:variables
}
