/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DUENO;

import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;
import Modelo.*;
import Vista.menu.Menu;
import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;

/**
 *
 * @author aberr
 */
public class CRUDDuenos extends javax.swing.JPanel {

    /**
     * Creates new form CRUDMascotas
     */
    public CRUDDuenos() {
        initComponents();
        // Mostrar el JOptionPane con la pregunta
        int opcion = JOptionPane.showOptionDialog(
                null, 
                "¿Se encuentra registrad@ en el sistema?", 
                "Consulta de Dueños",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Sí", "No"},
                "Sí");

        // Manejar las respuestas
        if (opcion == JOptionPane.YES_OPTION) {

            //PARA BUSQUEDA
            lblCedula.setVisible(false);
            txtCedula.setVisible(false);
            lblNombre.setVisible(false);
            txtNombre.setVisible(false);
            lblApellido.setVisible(false);
            txtApellido.setVisible(false);
            lblDireccion.setVisible(false);
            txtDireccion.setVisible(false);
            lblTelefono.setVisible(false);
            txtTelefono.setVisible(false);
            //botones
            btnBuscar.setVisible(true);
            btnModificar.setVisible(false);
            btnEliminar.setVisible(false);
            btnRegresar.setVisible(false);
            btnGuardar.setVisible(false);
            //busqueda campos
            lblBuscarDueno.setVisible(true);
            cmbBuscarCedula.setVisible(true);

            //agregar datos de dueños  a combobox
            conexion Base = new conexion();
            DuenoDb dueDb = new DuenoDb(Base);
            dueDb.llenarComboBoxBuscar(cmbBuscarCedula);

        } else if (opcion == JOptionPane.NO_OPTION) {

            lblCedula.setVisible(true);
            txtCedula.setVisible(true);
            lblNombre.setVisible(true);
            txtNombre.setVisible(true);
            lblApellido.setVisible(true);
            txtApellido.setVisible(true);
            lblDireccion.setVisible(true);
            txtDireccion.setVisible(true);
            lblTelefono.setVisible(true);
            txtTelefono.setVisible(true);
            //botones
            btnBuscar.setVisible(false);
            btnModificar.setVisible(false);
            btnEliminar.setVisible(false);
            btnRegresar.setVisible(false);
            btnGuardar.setVisible(true);
            //busqueda
            lblBuscarDueno.setVisible(false);
            cmbBuscarCedula.setVisible(false);
            
            
            
            //agregar datos de dueños  a combobox
            conexion Base = new conexion();
            MascotaDb masDb = new MascotaDb(Base);
            //masDb.llenarComboBoxDueños(cmbCedula);
            
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
        return lblCedula;
    }

    public void setLblCedDuenio(JLabel lblCedDuenio) {
        this.lblCedula = lblCedDuenio;
    }

    public JLabel getLblEspecie() {
        return lblDireccion;
    }

    public void setLblEspecie(JLabel lblEspecie) {
        this.lblDireccion = lblEspecie;
    }

    

    public JLabel getLblIdMascota() {
        return lblNombre;
    }

    public void setLblIdMascota(JLabel lblIdMascota) {
        this.lblNombre = lblIdMascota;
    }

    public JLabel getLblMASCOTAS() {
        return lblDUENOS;
    }

    public void setLblMASCOTAS(JLabel lblMASCOTAS) {
        this.lblDUENOS = lblMASCOTAS;
    }

    public JLabel getLblNombre() {
        return lblApellido;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblApellido = lblNombre;
    }

    public JLabel getLblRaza() {
        return lblTelefono;
    }

    public void setLblRaza(JLabel lblRaza) {
        this.lblTelefono = lblRaza;
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

    public JTextField getTxtEspecie() {
        return txtDireccion;
    }

    public void setTxtEspecie(JTextField txtEspecie) {
        this.txtDireccion = txtEspecie;
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

    
    

    public JTextField getTxtNombre() {
        return txtApellido;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtApellido = txtNombre;
    }

    public JTextField getTxtRaza() {
        return txtTelefono;
    }

    public void setTxtRaza(JTextField txtRaza) {
        this.txtTelefono = txtRaza;
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

        pnlLogo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lblDUENOS = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnlCRUDS = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        pnlCampos = new javax.swing.JPanel();
        txtDireccion = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        lblBuscarDueno = new javax.swing.JLabel();
        cmbBuscarCedula = new javax.swing.JComboBox<>();
        txtTelefono = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();

        pnlLogo.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogo.setForeground(new java.awt.Color(204, 204, 204));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOPL.png"))); // NOI18N

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogoLayout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

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
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        lblDUENOS.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        lblDUENOS.setForeground(new java.awt.Color(78, 108, 152));
        lblDUENOS.setText("DUEÑOS");

        jPanel1.setBackground(new java.awt.Color(183, 224, 210));

        pnlCRUDS.setBackground(new java.awt.Color(183, 224, 210));
        pnlCRUDS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(78, 108, 152), 1, true));

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
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(183, 224, 210));
        btnEliminar.setForeground(new java.awt.Color(78, 108, 152));
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(183, 224, 210));
        btnBuscar.setForeground(new java.awt.Color(78, 108, 152));
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("ID Necesario");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(183, 224, 210));
        btnRegresar.setForeground(new java.awt.Color(78, 108, 152));
        btnRegresar.setText("Regresar");
        btnRegresar.setToolTipText("NO CAMBIAR");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

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

        txtDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblDireccion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(78, 108, 152));
        lblDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDireccion.setText("Direccion:");

        txtApellido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        lblApellido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(78, 108, 152));
        lblApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApellido.setText("Apellido:");

        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(78, 108, 152));
        lblNombre.setText("Nombre:");

        txtCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        lblCedula.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(78, 108, 152));
        lblCedula.setText("Cédula:");

        lblBuscarDueno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblBuscarDueno.setForeground(new java.awt.Color(78, 108, 152));
        lblBuscarDueno.setText("Dueño:");

        cmbBuscarCedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbBuscarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBuscarCedulaActionPerformed(evt);
            }
        });

        txtTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTelefonoMouseClicked(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        lblTelefono.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(78, 108, 152));
        lblTelefono.setText("Teléfono:");

        javax.swing.GroupLayout pnlCamposLayout = new javax.swing.GroupLayout(pnlCampos);
        pnlCampos.setLayout(pnlCamposLayout);
        pnlCamposLayout.setHorizontalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamposLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscarDueno, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCedula, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCamposLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccion)
                            .addComponent(txtNombre)
                            .addComponent(txtCedula)
                            .addComponent(cmbBuscarCedula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellido))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamposLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        pnlCamposLayout.setVerticalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarDueno)
                    .addComponent(cmbBuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCRUDSLayout = new javax.swing.GroupLayout(pnlCRUDS);
        pnlCRUDS.setLayout(pnlCRUDSLayout);
        pnlCRUDSLayout.setHorizontalGroup(
            pnlCRUDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCRUDSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCRUDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCRUDSLayout.setVerticalGroup(
            pnlCRUDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCRUDSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel1.add(pnlCRUDS);

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDUENOS, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDUENOS)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtCedula.getText().isBlank() || txtNombre.getText().isBlank() || txtApellido.getText().isBlank() || txtDireccion.getText().isBlank() || txtTelefono.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "No dejar espacios en blanco");
        } else {
            if (DuenoDb.validarCedula(txtCedula.getText().trim())) {
                if (DuenoDb.verificarTelefono(txtTelefono.getText().trim())) {
                    conexion Base = new conexion();
                    DuenoDb miDueno = new DuenoDb(Base);
                    if (miDueno.guardarDueno(txtCedula.getText(), txtNombre.getText(), txtApellido.getText(), txtDireccion.getText(), txtTelefono.getText())) {
                        txtApellido.setText(null);
                        txtApellido.setText(null);
                        txtDireccion.setText(null);
                        txtTelefono.setText(null);
                        txtCedula.setText(null);
                        txtNombre.setText(null);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un telefono válido");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una cedula válida");
            }

        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    
    
    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        pnlPrincipal.setVisible(false);
        Mostrarpanelcrud(pnlLogo);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        conexion Base = new conexion();
        DuenoDb dueDb = new DuenoDb(Base);
        txtCedula.setText(dueDb.obtenerIdDeString(cmbBuscarCedula.getSelectedItem().toString()));
        txtCedula.setEditable(false);
        //BOTONES y campos
        lblBuscarDueno.setVisible(false);

        txtCedula.setVisible(true);
        lblNombre.setVisible(true);
        txtNombre.setVisible(true);
        btnBuscar.setVisible(false);
        btnGuardar.setVisible(false);
        lblApellido.setVisible(true);
        txtApellido.setVisible(true);
        lblDireccion.setVisible(true);
        txtDireccion.setVisible(true);
        lblTelefono.setVisible(true);
        txtTelefono.setVisible(true);
        lblCedula.setVisible(true);
        btnModificar.setVisible(true);
        btnEliminar.setVisible(true);
        btnRegresar.setVisible(true);

        //llenar campos
        txtNombre.setText(dueDb.obtenerNombrePorCedula(txtCedula.getText()));
        txtApellido.setText(dueDb.obtenerApellidoPorCedula(txtCedula.getText()));
        txtDireccion.setText(dueDb.obtenerDireccionPorCedula(txtCedula.getText()));
        txtTelefono.setText(dueDb.obtenerTelefonoPorCedula(txtCedula.getText()));
        //oculto el combo anterior        
        cmbBuscarCedula.setVisible(false);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
//PARA BUSQUEDA
        lblCedula.setVisible(false);
        txtCedula.setVisible(false);
        lblNombre.setVisible(false);
        txtNombre.setVisible(false);
        lblApellido.setVisible(false);
        txtApellido.setVisible(false);
        lblDireccion.setVisible(false);
        txtDireccion.setVisible(false);
        lblTelefono.setVisible(false);
        txtTelefono.setVisible(false);
        //botones
        btnBuscar.setVisible(true);
        btnModificar.setVisible(false);
        btnEliminar.setVisible(false);
        btnRegresar.setVisible(false);
        btnGuardar.setVisible(false);
        //busqueda campos
        lblBuscarDueno.setVisible(true);
        cmbBuscarCedula.setVisible(true);

        //agregar datos de dueños  a combobox
        conexion Base = new conexion();
        DuenoDb dueDb = new DuenoDb(Base);
        dueDb.llenarComboBoxBuscar(cmbBuscarCedula);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        conexion Base = new conexion();
        DuenoDb dueDb = new DuenoDb(Base);
        dueDb.eliminarDuenoPorCedula(txtCedula.getText());
        //PARA BUSQUEDA
            lblCedula.setVisible(false);
            txtCedula.setVisible(false);
            lblNombre.setVisible(false);
            txtNombre.setVisible(false);
            lblApellido.setVisible(false);
            txtApellido.setVisible(false);
            lblDireccion.setVisible(false);
            txtDireccion.setVisible(false);
            lblTelefono.setVisible(false);
            txtTelefono.setVisible(false);
            //botones
            btnBuscar.setVisible(true);
            btnModificar.setVisible(false);
            btnEliminar.setVisible(false);
            btnRegresar.setVisible(false);
            btnGuardar.setVisible(false);
            //busqueda campos
            lblBuscarDueno.setVisible(true);
            cmbBuscarCedula.setVisible(true);
            dueDb.llenarComboBoxBuscar(cmbBuscarCedula);
        
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
     //erifico que los campos no esten vacios
        if (txtNombre.getText().isBlank()||txtApellido.getText().isBlank()||txtDireccion.getText().isBlank()||txtTelefono.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ingrese los campos");
        }else{
        //Logica de modificacion
        conexion Base = new conexion();
        DuenoDb dueDb = new DuenoDb(Base);
        dueDb.actualizarDueno(txtCedula.getText(), txtNombre.getText(), txtApellido.getText(), txtDireccion.getText(), txtTelefono.getText());
        
        
        
        //reseteo campos
            txtNombre.setText(null);
            txtApellido.setText(null);
            txtDireccion.setText(null);
            txtTelefono.setText(null);
            
            //mostrar menu anterior
            //PARA BUSQUEDA
            lblCedula.setVisible(false);
            txtCedula.setVisible(false);
            lblNombre.setVisible(false);
            txtNombre.setVisible(false);
            lblApellido.setVisible(false);
            txtApellido.setVisible(false);
            lblDireccion.setVisible(false);
            txtDireccion.setVisible(false);
            lblTelefono.setVisible(false);
            txtTelefono.setVisible(false);
            //botones
            btnBuscar.setVisible(true);
            btnModificar.setVisible(false);
            btnEliminar.setVisible(false);
            btnRegresar.setVisible(false);
            btnGuardar.setVisible(false);
            //busqueda campos
            lblBuscarDueno.setVisible(true);
            cmbBuscarCedula.setVisible(true);

            dueDb.llenarComboBoxBuscar(cmbBuscarCedula);
            
        }


    }//GEN-LAST:event_btnModificarActionPerformed

    private void cmbBuscarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBuscarCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBuscarCedulaActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
     char caracter = evt.getKeyChar();
    
    // Verificar si el carácter es un número
    if (Character.isDigit(caracter)) {
        // Obtener el texto actual del campo
        String textoActual = txtCedula.getText(); // Cambiado a txtCedula
        
        // Si el texto actual tiene 10 dígitos, no permitir más entradas
        if (textoActual.length() >= 10) {
            evt.consume(); // Cancelar el evento de tecla
        }
    } else {
        // Si el carácter no es un número (es una letra u otro carácter), cancelar el evento
        evt.consume();
    }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si el carácter es un número
        if (Character.isDigit(caracter)) {
            // Mostrar un JDialog
            JOptionPane.showMessageDialog(this, "No se pueden ingresar números", "Error", JOptionPane.ERROR_MESSAGE);
            // Cancelar el evento de tecla
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si el carácter es un número
        if (Character.isDigit(caracter)) {
            // Mostrar un JDialog
            JOptionPane.showMessageDialog(this, "No se pueden ingresar números", "Error", JOptionPane.ERROR_MESSAGE);
            // Cancelar el evento de tecla
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
    char caracter = evt.getKeyChar();
    
    // Verificar si el carácter es un número
    if (Character.isDigit(caracter)) {
        // Si el campo está vacío y se intenta ingresar un número, agregar "09"
        if (txtTelefono.getText().isEmpty()) {
            txtTelefono.setText("09");
        }

        // Verificar la longitud del texto después de agregar el nuevo carácter
        String textoActual = txtTelefono.getText();
        
        // Si el texto actual tiene 10 dígitos, no permitir más entradas
        if (textoActual.length() >= 10) {
            evt.consume(); // Cancelar el evento de tecla
        }
    } else {
        // Si el carácter no es un número (es una letra u otro carácter), cancelar el evento
        evt.consume();
    }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMouseClicked
        // Si el campo de texto está vacío, agregar "09"
                    if (txtTelefono.getText().isEmpty()) {
                        txtTelefono.setText("09");
                    }
    }//GEN-LAST:event_txtTelefonoMouseClicked

    private void Mostrarpanelcrud(JPanel p) {
        p.setSize(700, 460);
        p.setLocation(0, 0);
        Menu.PanelPrincipal.removeAll();
        Menu.PanelPrincipal.add(p, BorderLayout.CENTER);
        Menu.PanelPrincipal.revalidate();
        Menu.PanelPrincipal.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbBuscarCedula;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBuscarDueno;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDUENOS;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlCRUDS;
    private javax.swing.JPanel pnlCampos;
    public static javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

