/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Mascota;

import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;
import Modelo.*;
import com.toedter.calendar.JDateChooser;

/**
 *
 * @author aberr
 */
public class CRUDMascotas extends javax.swing.JPanel {

    /**
     * Creates new form CRUDMascotas
     */
    public CRUDMascotas() {
        initComponents();
        // Mostrar el JOptionPane con la pregunta
        int opcion = JOptionPane.showOptionDialog(
                null, 
                "¿Su mascota está registrada en el sistema?", 
                "Consulta de Mascota", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                new Object[] {"Sí", "No"}, 
                "Sí");

        // Manejar las respuestas
        if (opcion == JOptionPane.YES_OPTION) {
            lblIdMascota.setVisible(true);
            txtIdMascota.setVisible(true);
            btnBuscar.setVisible(true);
            btnGuardar.setVisible(false);
            lblNombre.setVisible(false);
            txtNombre.setVisible(false);
            lblEspecie.setVisible(false);
            txtEspecie.setVisible(false);
            lblRaza.setVisible(false);
            txtRaza.setVisible(false);
            lblCedDuenio.setVisible(false);
            txtCedula.setVisible(false);
            lblFechaNacimiento.setVisible(false);
            jDateFecha.setVisible(false);
            btnModificar.setVisible(false);
            btnEliminar.setVisible(false);
            btnRegresar.setVisible(false);            
        } else if (opcion == JOptionPane.NO_OPTION) {
            lblIdMascota.setVisible(false);
            txtIdMascota.setVisible(false);
            btnGuardar.setVisible(true);
            lblNombre.setVisible(true);
            txtNombre.setVisible(true);
            lblEspecie.setVisible(true);
            txtEspecie.setVisible(true);
            lblRaza.setVisible(true);
            txtRaza.setVisible(true);
            lblCedDuenio.setVisible(true);
            txtCedula.setVisible(true);
            lblFechaNacimiento.setVisible(true);
            jDateFecha.setVisible(true);
            btnBuscar.setVisible(false);
            btnModificar.setVisible(false);
            btnEliminar.setVisible(false);
            btnRegresar.setVisible(false); 
            
        } else {
            JOptionPane.showMessageDialog(null, "No seleccionaste ninguna opción.");
        }
    }
    
    
    
    //getter  setter

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public JButton getBtnBuscar1() {
        return btnModificar;
    }

    public void setBtnBuscar1(JButton btnBuscar1) {
        this.btnModificar = btnBuscar1;
    }

    public JButton getBtnBuscar2() {
        return btnEliminar;
    }

    public void setBtnBuscar2(JButton btnBuscar2) {
        this.btnEliminar = btnBuscar2;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
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

    public JLabel getLblCedDuenio() {
        return lblCedDuenio;
    }

    public void setLblCedDuenio(JLabel lblCedDuenio) {
        this.lblCedDuenio = lblCedDuenio;
    }

    public JLabel getLblEspecie() {
        return lblEspecie;
    }

    public void setLblEspecie(JLabel lblEspecie) {
        this.lblEspecie = lblEspecie;
    }

    public JLabel getLblFechaNacimiento() {
        return lblFechaNacimiento;
    }

    public void setLblFechaNacimiento(JLabel lblFechaNacimiento) {
        this.lblFechaNacimiento = lblFechaNacimiento;
    }

    public JLabel getLblIdMascota() {
        return lblIdMascota;
    }

    public void setLblIdMascota(JLabel lblIdMascota) {
        this.lblIdMascota = lblIdMascota;
    }

    public JLabel getLblMASCOTAS() {
        return lblMASCOTAS;
    }

    public void setLblMASCOTAS(JLabel lblMASCOTAS) {
        this.lblMASCOTAS = lblMASCOTAS;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblRaza() {
        return lblRaza;
    }

    public void setLblRaza(JLabel lblRaza) {
        this.lblRaza = lblRaza;
    }

    public JPanel getPnlBotones() {
        return pnlBotones;
    }

    public void setPnlBotones(JPanel pnlBotones) {
        this.pnlBotones = pnlBotones;
    }

    public JPanel getPnlCRUDS() {
        return pnlCRUDS;
    }

    public void setPnlCRUDS(JPanel pnlCRUDS) {
        this.pnlCRUDS = pnlCRUDS;
    }

    public JPanel getPnlCampos() {
        return pnlCampos;
    }

    public void setPnlCampos(JPanel pnlCampos) {
        this.pnlCampos = pnlCampos;
    }

    public JPanel getPnlPrincipal() {
        return pnlPrincipal;
    }

    public void setPnlPrincipal(JPanel pnlPrincipal) {
        this.pnlPrincipal = pnlPrincipal;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    public JTextField getTxtEspecie() {
        return txtEspecie;
    }

    public void setTxtEspecie(JTextField txtEspecie) {
        this.txtEspecie = txtEspecie;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public JDateChooser getjDateChooser1() {
        return jDateFecha;
    }

    public void setjDateChooser1(JDateChooser jDateChooser1) {
        this.jDateFecha = jDateChooser1;
    }
    

    public JTextField getTxtIdMascota() {
        return txtIdMascota;
    }

    public void setTxtIdMascota(JTextField txtIdMascota) {
        this.txtIdMascota = txtIdMascota;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtRaza() {
        return txtRaza;
    }

    public void setTxtRaza(JTextField txtRaza) {
        this.txtRaza = txtRaza;
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
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lblMASCOTAS = new javax.swing.JLabel();
        pnlCRUDS = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        pnlCampos = new javax.swing.JPanel();
        txtRaza = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        lblRaza = new javax.swing.JLabel();
        lblEspecie = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblIdMascota = new javax.swing.JLabel();
        txtIdMascota = new javax.swing.JTextField();
        lblCedDuenio = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jDateFecha = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(700, 480));
        setMinimumSize(new java.awt.Dimension(700, 480));
        setPreferredSize(new java.awt.Dimension(700, 582));

        pnlPrincipal.setBackground(new java.awt.Color(183, 224, 210));
        pnlPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(78, 108, 152)));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(700, 480));

        btnSalir.setBackground(new java.awt.Color(183, 224, 210));
        btnSalir.setForeground(new java.awt.Color(78, 108, 152));
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblMASCOTAS.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        lblMASCOTAS.setForeground(new java.awt.Color(78, 108, 152));
        lblMASCOTAS.setText("MASCOTAS");

        pnlCRUDS.setBackground(new java.awt.Color(183, 224, 210));
        pnlCRUDS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(78, 108, 152)));

        pnlBotones.setBackground(new java.awt.Color(183, 224, 210));
        pnlBotones.setForeground(new java.awt.Color(183, 224, 210));

        btnGuardar.setBackground(new java.awt.Color(183, 224, 210));
        btnGuardar.setForeground(new java.awt.Color(78, 108, 152));
        btnGuardar.setText("Guardar Nuevo");
        btnGuardar.setToolTipText("LLENAR TODOS LOS CAMPOS");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(183, 224, 210));
        btnModificar.setForeground(new java.awt.Color(78, 108, 152));
        btnModificar.setText("Modificar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnEliminar.setBackground(new java.awt.Color(183, 224, 210));
        btnEliminar.setForeground(new java.awt.Color(78, 108, 152));
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnBuscar.setBackground(new java.awt.Color(183, 224, 210));
        btnBuscar.setForeground(new java.awt.Color(78, 108, 152));
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("ID Necesario");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnRegresar.setBackground(new java.awt.Color(183, 224, 210));
        btnRegresar.setForeground(new java.awt.Color(78, 108, 152));
        btnRegresar.setText("Regresar");
        btnRegresar.setToolTipText("NO CAMBIAR");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnBuscar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnRegresar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlCampos.setBackground(new java.awt.Color(183, 224, 210));

        txtRaza.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblRaza.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRaza.setForeground(new java.awt.Color(78, 108, 152));
        lblRaza.setText("Raza:");

        lblEspecie.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEspecie.setForeground(new java.awt.Color(78, 108, 152));
        lblEspecie.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEspecie.setText("Especie:");

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(78, 108, 152));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre:");

        lblIdMascota.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblIdMascota.setForeground(new java.awt.Color(78, 108, 152));
        lblIdMascota.setText("ID Mascota:");

        txtIdMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblCedDuenio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCedDuenio.setForeground(new java.awt.Color(78, 108, 152));
        lblCedDuenio.setText("Cedula dueño:");

        lblFechaNacimiento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(78, 108, 152));
        lblFechaNacimiento.setText("Fecha Nacimiento:");

        txtEspecie.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout pnlCamposLayout = new javax.swing.GroupLayout(pnlCampos);
        pnlCampos.setLayout(pnlCamposLayout);
        pnlCamposLayout.setHorizontalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRaza, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCedDuenio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIdMascota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblEspecie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCamposLayout.createSequentialGroup()
                        .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlCamposLayout.setVerticalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdMascota))
                .addGap(18, 18, 18)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEspecie))
                .addGap(18, 18, 18)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRaza))
                .addGap(18, 18, 18)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedDuenio))
                .addGap(18, 18, 18)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFechaNacimiento)
                    .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlCRUDSLayout = new javax.swing.GroupLayout(pnlCRUDS);
        pnlCRUDS.setLayout(pnlCRUDSLayout);
        pnlCRUDSLayout.setHorizontalGroup(
            pnlCRUDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCRUDSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCRUDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCRUDSLayout.createSequentialGroup()
                        .addComponent(pnlCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addContainerGap())
        );
        pnlCRUDSLayout.setVerticalGroup(
            pnlCRUDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCRUDSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(lblMASCOTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(pnlCRUDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMASCOTAS)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCRUDS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(219, 219, 219))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtNombre.getText().isBlank()||txtEspecie.getText().isBlank()||txtRaza.getText().isBlank()||txtCedula.getText().isBlank()||jDateFecha.getDate().toString().isBlank()) {
            JOptionPane.showMessageDialog(null, "No dejar espacios en blanco");
        }else{
            conexion Base= new  conexion();
            MascotaDb miMascota= new MascotaDb(Base);
            miMascota.insertar(txtNombre.getText().trim(), txtEspecie.getText().trim(), txtRaza.getText().trim(), txtCedula.getText().trim(), jDateFecha.getDate());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel lblCedDuenio;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblIdMascota;
    private javax.swing.JLabel lblMASCOTAS;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlCRUDS;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtIdMascota;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}

