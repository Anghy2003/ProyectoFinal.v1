
package Vista.Cruds.CRUDS1;

public class CrudPanelAdministrador1 extends javax.swing.JPanel {

    /**
     * Creates new form CrudPanelAdministrador1
     */
    public CrudPanelAdministrador1() {
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCedula = new rojeru_san.RSMTextFull();
        txtNombres = new rojeru_san.RSMTextFull();
        txtApellidos = new rojeru_san.RSMTextFull();
        txtDireccion = new rojeru_san.RSMTextFull();
        txtEmail = new rojeru_san.RSMTextFull();
        txtCelular = new rojeru_san.RSMTextFull();
        btnCancelar = new rojeru_san.RSButtonRiple();
        jDateFechaNac = new com.toedter.calendar.JDateChooser();
        cbxTipoClie = new javax.swing.JComboBox<>();
        cbxGenero = new javax.swing.JComboBox<>();
        cbxEstadoC = new javax.swing.JComboBox<>();
        btnGuardar = new rojeru_san.RSButtonRiple();
        jLabel12 = new javax.swing.JLabel();

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 53, 79));
        jLabel1.setText("Tipo Cliente:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 130, 40));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Registro Administrador");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 330, 40));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 53, 79));
        jLabel3.setText("Cédula:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 90, 40));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 53, 79));
        jLabel4.setText("Nombres:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, 40));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 53, 79));
        jLabel5.setText("Apellidos:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 100, 40));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 53, 79));
        jLabel6.setText("Dirección");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 90, 40));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 53, 79));
        jLabel7.setText("Correo Electrónico:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 190, 40));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 53, 79));
        jLabel8.setText("Celular:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 80, 40));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 53, 79));
        jLabel9.setText("Fecha Nacimiento:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 180, 40));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 53, 79));
        jLabel10.setText("Género:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 80, 40));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 53, 79));
        jLabel11.setText("Estado Civil:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 120, 40));

        txtCedula.setForeground(new java.awt.Color(0, 53, 79));
        txtCedula.setColorTransparente(true);
        txtCedula.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCedula.setPlaceholder("Escriba la cédula");
        jPanel3.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 200, 40));

        txtNombres.setForeground(new java.awt.Color(0, 53, 79));
        txtNombres.setColorTransparente(true);
        txtNombres.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombres.setPlaceholder("Escriba los nombres");
        jPanel3.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 200, 40));

        txtApellidos.setForeground(new java.awt.Color(0, 53, 79));
        txtApellidos.setColorTransparente(true);
        txtApellidos.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtApellidos.setPlaceholder("Escriba los apellidos");
        jPanel3.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, 40));

        txtDireccion.setForeground(new java.awt.Color(0, 53, 79));
        txtDireccion.setColorTransparente(true);
        txtDireccion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDireccion.setPlaceholder("Escriba la dirección");
        jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 200, 40));

        txtEmail.setForeground(new java.awt.Color(0, 53, 79));
        txtEmail.setColorTransparente(true);
        txtEmail.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtEmail.setPlaceholder("Escriba el email");
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 200, 40));

        txtCelular.setForeground(new java.awt.Color(0, 53, 79));
        txtCelular.setColorTransparente(true);
        txtCelular.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCelular.setPlaceholder("Escriba su número celular");
        jPanel3.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 200, 40));

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel3.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, -1, -1));
        jPanel3.add(jDateFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 140, 30));

        cbxTipoClie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cbxTipoClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 150, 30));

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cbxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 150, 30));

        cbxEstadoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cbxEstadoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 150, 30));

        btnGuardar.setText("Guardar");
        jPanel3.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondomecanicatamano.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 650));

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

    }//GEN-LAST:event_btnCancelarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private javax.swing.JComboBox<String> cbxEstadoC;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JComboBox<String> cbxTipoClie;
    private com.toedter.calendar.JDateChooser jDateFechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private rojeru_san.RSMTextFull txtApellidos;
    private rojeru_san.RSMTextFull txtCedula;
    private rojeru_san.RSMTextFull txtCelular;
    private rojeru_san.RSMTextFull txtDireccion;
    private rojeru_san.RSMTextFull txtEmail;
    private rojeru_san.RSMTextFull txtNombres;
    // End of variables declaration//GEN-END:variables
}
