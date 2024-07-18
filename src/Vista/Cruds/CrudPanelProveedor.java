package Vista.Cruds;

import Vista.Menu.VistaMenu;
import Vista.Tables.TablaProveedor;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import Conexion.Conexion_db;
import com.db4o.*;
import Models.*;
import javax.swing.JOptionPane;

public class CrudPanelProveedor extends javax.swing.JPanel {
    
    public CrudPanelProveedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblRegistroPRov = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        txtCodigo = new rojeru_san.RSMTextFull();
        txtNombre = new rojeru_san.RSMTextFull();
        txtTipo = new rojeru_san.RSMTextFull();
        btnCancelar = new rojeru_san.RSButtonRiple();
        btnGuardar = new rojeru_san.RSButtonRiple();
        lblDireccion = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        txtDireccion = new rojeru_san.RSMTextFull();
        txtCorreo = new rojeru_san.RSMTextFull();
        txtCelular = new rojeru_san.RSMTextFull();
        lblFondo = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistroPRov.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        lblRegistroPRov.setForeground(new java.awt.Color(0, 53, 79));
        lblRegistroPRov.setText("Registro Proveedores");
        jPanel2.add(lblRegistroPRov, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 300, 40));

        lblCodigo.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 53, 79));
        lblCodigo.setText("Código");
        jPanel2.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 70, 40));

        lblNombre.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 53, 79));
        lblNombre.setText("Nombre:");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 100, 40));

        lblTipo.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(0, 53, 79));
        lblTipo.setText("Tipo:");
        jPanel2.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 100, 40));

        txtCodigo.setForeground(new java.awt.Color(0, 53, 79));
        txtCodigo.setColorTransparente(true);
        txtCodigo.setEnabled(false);
        txtCodigo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCodigo.setPlaceholder("AUTOGENERADO");
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 230, 40));

        txtNombre.setForeground(new java.awt.Color(0, 53, 79));
        txtNombre.setColorTransparente(true);
        txtNombre.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombre.setPlaceholder("Ejm: Mega");
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 230, 40));

        txtTipo.setForeground(new java.awt.Color(0, 53, 79));
        txtTipo.setColorTransparente(true);
        txtTipo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtTipo.setPlaceholder("Ejm:Empresa");
        jPanel2.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 230, 40));

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, -1, -1));

        lblDireccion.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(0, 53, 79));
        lblDireccion.setText("Dirección:");
        jPanel2.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 120, 40));

        lblCorreo.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(0, 53, 79));
        lblCorreo.setText("Email:");
        jPanel2.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 100, 40));

        lblCelular.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(0, 53, 79));
        lblCelular.setText("Celular:");
        jPanel2.add(lblCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 100, 40));

        txtDireccion.setForeground(new java.awt.Color(0, 53, 79));
        txtDireccion.setColorTransparente(true);
        txtDireccion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDireccion.setPlaceholder("Ejm: Av.Americas");
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 230, 40));

        txtCorreo.setForeground(new java.awt.Color(0, 53, 79));
        txtCorreo.setColorTransparente(true);
        txtCorreo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCorreo.setPlaceholder("Ejm: usuario@gmail.com");
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 230, 40));

        txtCelular.setForeground(new java.awt.Color(0, 53, 79));
        txtCelular.setColorTransparente(true);
        txtCelular.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCelular.setPlaceholder("Ejm: 0911111111");
        jPanel2.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 230, 40));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/burbujas.png"))); // NOI18N
        lblFondo.setText("jLabel12");
        jPanel2.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 650));

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        System.out.println("salir");
        TablaProveedor tblProv = new TablaProveedor();
        ShowpanelCruds(tblProv);
    }//GEN-LAST:event_btnCancelarMouseClicked

    //verificar Proveedor
    public static int verificarProveedores(String codigo_proveedor) {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Proveedor ProveedorBusca = new Proveedor(codigo_proveedor, null, null, null, null, null, null);
        ObjectSet resultado = BaseBD.get(ProveedorBusca);
        int coincidencias= resultado.size();
        //Cerrar BD
        BaseBD.close();
        return coincidencias;
    }
    public static int verificarProveedoresGuardar(String codigo_proveedor) {
    Proveedor ProveedoresBusca = new Proveedor(codigo_proveedor, null, null, null, null, null, null);

        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        
        ObjectSet resultado = BaseBD.get(ProveedoresBusca);
        int coincidencias= resultado.size();
        //Cerrar BD
        BaseBD.close();
        return coincidencias;
    }
    
    
    //Guardar USUARIO
    public static void guardarProveedores(String idProv, String tipo, String nombre, String direccion, String correo, String celular, Boolean estado) {
        

        Proveedor Proveedor1 = new Proveedor( idProv, tipo,  nombre,  direccion,  correo,  celular, estado);
        
        if (verificarProveedoresGuardar(idProv) == 0) {
            
            //volvemos a abrir para guardar  
            ObjectContainer BaseBD = Conexion_db.ConectarBD();
            BaseBD.set(Proveedor1);
            BaseBD.close();
            System.out.println("Proveedor Guardado");
        } else {
            System.out.println("Proveedor ya existe en la BD");
        } 
    }
   
    
    
    
    
    
    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        Boolean encontrado = false;
        if (!encontrado) {
            if (!txtTipo.getText().trim().isBlank()
                && !txtNombre.getText().trim().isBlank()
                && !txtDireccion.getText().trim().isBlank()
                && !txtCorreo.getText().trim().isBlank()
                && !txtCelular.getText().trim().isBlank()) {// condicion de que todos esten completos
             //Validamos
             if (txtCorreo.getText().trim().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
                 if (txtCelular.getText().trim().matches("^09\\d{8}$")) {
                     guardarProveedores(null, txtTipo.getText().trim().toUpperCase(),txtNombre.getText().trim().toUpperCase(), txtDireccion.getText().trim().toUpperCase(), txtCorreo.getText().trim(), txtCelular.getText().trim(), true);//siempre creara con estado True que significa activo
                     
                     //regresamos a la tabla
                     TablaProveedor tablitaProv = new TablaProveedor();
                     ShowpanelCruds(tablitaProv);
                     
                 }else{JOptionPane.showMessageDialog(this, "Ingrese un celular Válido");}                    
             }else{JOptionPane.showMessageDialog(this, "Ingrese un correo Válido");}             
        } else {
            JOptionPane.showMessageDialog(this, "Ningun campo puede estar vacio");
        } 
        }  
//        resetCampos();
    }//GEN-LAST:event_btnGuardarMouseClicked
    private void ShowpanelCruds(JPanel p) {
        p.setSize(870, 630);
        p.setLocation(0, 0);
        VistaMenu.PanelPrincipal.removeAll();
        VistaMenu.PanelPrincipal.add(p, BorderLayout.CENTER);
        VistaMenu.PanelPrincipal.revalidate();
        VistaMenu.PanelPrincipal.repaint();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegistroPRov;
    private javax.swing.JLabel lblTipo;
    private rojeru_san.RSMTextFull txtCelular;
    private rojeru_san.RSMTextFull txtCodigo;
    private rojeru_san.RSMTextFull txtCorreo;
    private rojeru_san.RSMTextFull txtDireccion;
    private rojeru_san.RSMTextFull txtNombre;
    private rojeru_san.RSMTextFull txtTipo;
    // End of variables declaration//GEN-END:variables
}
