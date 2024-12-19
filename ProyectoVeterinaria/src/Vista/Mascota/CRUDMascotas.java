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
import Vista.menu.Menu;
import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import java.util.Date;

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
        lblIdOculto.setVisible(false);
        // Mostrar el JOptionPane con la pregunta
        int opcion = JOptionPane.showOptionDialog(
                null,
                "¿Su mascota está registrada en el sistema?",
                "Consulta de Mascota",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Sí", "No"},
                "Sí");

        // Manejar las respuestas
        if (opcion == JOptionPane.YES_OPTION) {

            //PARA BUSQUEDA
            lblIdMascota.setVisible(true);
            cmbIdMascota.setVisible(true);
            btnBuscar.setVisible(true);
            btnGuardar.setVisible(false);
            lblNombre.setVisible(false);
            txtNombre.setVisible(false);
            lblEspecie.setVisible(false);
            txtEspecie.setVisible(false);
            lblRaza.setVisible(false);
            txtRaza.setVisible(false);
            lblCedDuenio.setVisible(true);
            cmbCedula.setVisible(true);
            lblFechaNacimiento.setVisible(false);
            jDateFecha.setVisible(false);
            bloquearDate(jDateFecha);
            btnModificar.setVisible(false);
            btnEliminar.setVisible(false);
            btnRegresar.setVisible(false);
            //agregar datos de dueños  a combobox
            conexion Base = new conexion();

            MascotaDb masDb = new MascotaDb(Base);
            masDb.llenarComboBoxDueños(cmbCedula);
            masDb.llenarComboBoxMascotasPorDueño(cmbIdMascota, cmbCedula.getSelectedItem().toString());

        } else if (opcion == JOptionPane.NO_OPTION) {
            lblIdMascota.setVisible(false);
            cmbIdMascota.setVisible(false);
            btnGuardar.setVisible(true);
            lblNombre.setVisible(true);
            txtNombre.setVisible(true);
            lblEspecie.setVisible(true);
            txtEspecie.setVisible(true);
            lblRaza.setVisible(true);
            txtRaza.setVisible(true);
            lblCedDuenio.setVisible(true);
            cmbCedula.setVisible(true);
            lblFechaNacimiento.setVisible(true);
            jDateFecha.setVisible(true);
            bloquearDate(jDateFecha);
            btnBuscar.setVisible(false);
            btnModificar.setVisible(false);
            btnEliminar.setVisible(false);
            btnRegresar.setVisible(false);
            jDateFecha.setDate(new Date());//pongo por defecto fecha de hoy

            //agregar datos de dueños  a combobox
            conexion Base = new conexion();
            MascotaDb masDb = new MascotaDb(Base);
            masDb.llenarComboBoxDueños(cmbCedula);

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

    public JComboBox<String> getCmbIdMascota() {
        return cmbIdMascota;
    }

    public void setCmbIdMascota(JComboBox<String> cmbIdMascota) {
        this.cmbIdMascota = cmbIdMascota;
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

        pnlLogo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lblMASCOTAS = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnlCRUDS = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        pnlCampos = new javax.swing.JPanel();
        txtRaza = new javax.swing.JTextField();
        lblRaza = new javax.swing.JLabel();
        lblEspecie = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblIdMascota = new javax.swing.JLabel();
        lblCedDuenio = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        cmbCedula = new javax.swing.JComboBox<>();
        cmbIdMascota = new javax.swing.JComboBox<>();
        lblIdOculto = new javax.swing.JLabel();

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

        lblMASCOTAS.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        lblMASCOTAS.setForeground(new java.awt.Color(78, 108, 152));
        lblMASCOTAS.setText("MASCOTAS");

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

        txtRaza.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRaza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazaKeyTyped(evt);
            }
        });

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
        lblIdMascota.setText("Mascota:");

        lblCedDuenio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCedDuenio.setForeground(new java.awt.Color(78, 108, 152));
        lblCedDuenio.setText("Dueño:");

        lblFechaNacimiento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(78, 108, 152));
        lblFechaNacimiento.setText("Fecha Nacimiento:");

        txtEspecie.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEspecie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEspecieKeyTyped(evt);
            }
        });

        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jDateFecha.setForeground(new java.awt.Color(0, 0, 0));

        cmbCedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCedula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCedulaItemStateChanged(evt);
            }
        });

        cmbIdMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbIdMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmbIdMascotaMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlCamposLayout = new javax.swing.GroupLayout(pnlCampos);
        pnlCampos.setLayout(pnlCamposLayout);
        pnlCamposLayout.setHorizontalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRaza, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIdMascota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblEspecie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedDuenio, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbCedula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCamposLayout.createSequentialGroup()
                        .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRaza, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(txtEspecie)
                            .addComponent(txtNombre))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbIdMascota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCamposLayout.setVerticalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedDuenio)
                    .addComponent(cmbCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdMascota)
                    .addComponent(cmbIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFechaNacimiento)
                    .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout pnlCRUDSLayout = new javax.swing.GroupLayout(pnlCRUDS);
        pnlCRUDS.setLayout(pnlCRUDSLayout);
        pnlCRUDSLayout.setHorizontalGroup(
            pnlCRUDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCRUDSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCRUDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCRUDSLayout.createSequentialGroup()
                        .addComponent(pnlCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlCRUDSLayout.setVerticalGroup(
            pnlCRUDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCRUDSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnlCRUDS);

        lblIdOculto.setFont(new java.awt.Font("Dialog", 1, 2)); // NOI18N
        lblIdOculto.setForeground(new java.awt.Color(183, 224, 210));
        lblIdOculto.setText("jLabel1");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMASCOTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblIdOculto)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(lblIdOculto)
                .addGap(18, 18, 18))
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
        if (txtNombre.getText().isBlank() || txtEspecie.getText().isBlank() || txtRaza.getText().isBlank() || jDateFecha.getDate().toString().isBlank() || cmbCedula.getSelectedItem().toString().isBlank()) {
            JOptionPane.showMessageDialog(null, "No dejar espacios en blanco");
        } else {
            conexion Base = new conexion();
            MascotaDb miMascota = new MascotaDb(Base);
            if (miMascota.insertar(txtNombre.getText().trim(), txtEspecie.getText().trim(), txtRaza.getText().trim(), cmbCedula.getSelectedItem().toString(), jDateFecha.getDate())) {
                txtNombre.setText(null);
                txtNombre.setText(null);
                txtEspecie.setText(null);
                txtRaza.setText(null);
                cmbCedula.setSelectedItem(null);
                jDateFecha.setDate(null);
            }

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    //getter setter del combobox
    public JComboBox<String> getCmbCedula() {
        return cmbCedula;
    }

    public void setCmbCedula(JComboBox<String> cmbCedula) {
        this.cmbCedula = cmbCedula;
    }


    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        pnlPrincipal.setVisible(false);
        Mostrarpanelcrud(pnlLogo);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        //BOTONES y campos
        lblIdMascota.setVisible(false);
        cmbIdMascota.setVisible(false);
        btnBuscar.setVisible(false);
        btnGuardar.setVisible(false);
        lblNombre.setVisible(true);
        txtNombre.setVisible(true);
        lblEspecie.setVisible(true);
        txtEspecie.setVisible(true);
        lblRaza.setVisible(true);
        txtRaza.setVisible(true);
        lblCedDuenio.setVisible(true);
        cmbCedula.setVisible(true);
        lblFechaNacimiento.setVisible(true);
        jDateFecha.setVisible(true);
        btnModificar.setVisible(true);
        btnEliminar.setVisible(true);
        btnRegresar.setVisible(true);
        //habilito el id que nadie sabe que existe MUEJEJE
        lblIdOculto.setVisible(true);
        //obtengo id
        conexion Base = new conexion();
        MascotaDb masDb = new MascotaDb(Base);
        masDb.obtenerIdMascotaPorCedulaYNombre(cmbCedula.getSelectedItem().toString(), cmbIdMascota.getSelectedItem().toString());
        lblIdOculto.setText(masDb.quieroId(cmbCedula.getSelectedItem().toString(), cmbIdMascota.getSelectedItem().toString()));
        //setteos
        txtNombre.setText(masDb.obtenerNombreMascotaPorId());
        txtEspecie.setText(masDb.obtenerEspecieMascotaPorId());
        txtRaza.setText(masDb.obtenerRazaMascotaPorId());
        jDateFecha.setDate(masDb.obtenerFechaNacimientoMascotaPorId());


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cmbCedulaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCedulaItemStateChanged

    }//GEN-LAST:event_cmbCedulaItemStateChanged

    private void cmbIdMascotaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbIdMascotaMouseEntered
        conexion Base = new conexion();
        MascotaDb masDb = new MascotaDb(Base);
        masDb.llenarComboBoxMascotasPorDueño(cmbIdMascota, cmbCedula.getSelectedItem().toString());
    }//GEN-LAST:event_cmbIdMascotaMouseEntered

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

//PARA BUSQUEDA
        lblIdMascota.setVisible(true);
        cmbIdMascota.setVisible(true);
        btnBuscar.setVisible(true);
        btnGuardar.setVisible(false);
        lblNombre.setVisible(false);
        txtNombre.setVisible(false);
        lblEspecie.setVisible(false);
        txtEspecie.setVisible(false);
        lblRaza.setVisible(false);
        txtRaza.setVisible(false);
        lblCedDuenio.setVisible(true);
        cmbCedula.setVisible(true);
        lblFechaNacimiento.setVisible(false);
        jDateFecha.setVisible(false);
        btnModificar.setVisible(false);
        btnEliminar.setVisible(false);
        btnRegresar.setVisible(false);
        //agregar datos de dueños  a combobox
        conexion Base = new conexion();

        MascotaDb masDb = new MascotaDb(Base);
        masDb.llenarComboBoxDueños(cmbCedula);
        masDb.llenarComboBoxMascotasPorDueño(cmbIdMascota, cmbCedula.getSelectedItem().toString());

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        conexion Base = new conexion();
        MascotaDb masDb = new MascotaDb(Base);

        masDb.obtenerIdMascotayEliminar(cmbCedula.getSelectedItem().toString(), cmbIdMascota.getSelectedItem().toString());

        //mostrar anteriormenu
        //PARA BUSQUEDA
        lblIdMascota.setVisible(true);
        cmbIdMascota.setVisible(true);
        btnBuscar.setVisible(true);
        btnGuardar.setVisible(false);
        lblNombre.setVisible(false);
        txtNombre.setVisible(false);
        lblEspecie.setVisible(false);
        txtEspecie.setVisible(false);
        lblRaza.setVisible(false);
        txtRaza.setVisible(false);
        lblCedDuenio.setVisible(true);
        cmbCedula.setVisible(true);
        lblFechaNacimiento.setVisible(false);
        jDateFecha.setVisible(false);
        btnModificar.setVisible(false);
        btnEliminar.setVisible(false);
        btnRegresar.setVisible(false);
        //agregar datos de dueños  a combobox
        masDb.llenarComboBoxDueños(cmbCedula);
        masDb.llenarComboBoxMascotasPorDueño(cmbIdMascota, cmbCedula.getSelectedItem().toString());

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //verifico que los campos no esten vacios
        if (txtNombre.getText().isBlank() || txtEspecie.getText().isBlank() || txtRaza.getText().isBlank() || jDateFecha.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese los campos");
        } else {
            //Logica de modificacion
            conexion Base = new conexion();
            MascotaDb masDb = new MascotaDb(Base);
            if (masDb.actualizarMascota(lblIdOculto.getText(), cmbCedula.getSelectedItem().toString(), txtNombre.getText(), txtEspecie.getText(), txtRaza.getText(), jDateFecha.getDate())) {
                JOptionPane.showMessageDialog(null, "Mascota actualizada correctamente");
                lblIdOculto.setText(null);
                lblIdOculto.setVisible(false);
                //reseteo campos
                cmbCedula.setSelectedItem(null);
                txtNombre.setText(null);
                txtEspecie.setText(null);
                txtRaza.setText(null);
                jDateFecha.setDate(null);

                //mostrar menu anterior
                //PARA BUSQUEDA
                lblIdMascota.setVisible(true);
                cmbIdMascota.setVisible(true);
                btnBuscar.setVisible(true);
                btnGuardar.setVisible(false);
                lblNombre.setVisible(false);
                txtNombre.setVisible(false);
                lblEspecie.setVisible(false);
                txtEspecie.setVisible(false);
                lblRaza.setVisible(false);
                txtRaza.setVisible(false);
                lblCedDuenio.setVisible(true);
                cmbCedula.setVisible(true);
                lblFechaNacimiento.setVisible(false);
                jDateFecha.setVisible(false);
                btnModificar.setVisible(false);
                btnEliminar.setVisible(false);
                btnRegresar.setVisible(false);
                //agregar datos de dueños  a combobox
                masDb.llenarComboBoxDueños(cmbCedula);
                masDb.llenarComboBoxMascotasPorDueño(cmbIdMascota, cmbCedula.getSelectedItem().toString());

            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar Mascota");
            }
        }


    }//GEN-LAST:event_btnModificarActionPerformed

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

    private void txtEspecieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEspecieKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si el carácter es un número
        if (Character.isDigit(caracter)) {
            // Mostrar un JDialog
            JOptionPane.showMessageDialog(this, "No se pueden ingresar números", "Error", JOptionPane.ERROR_MESSAGE);
            // Cancelar el evento de tecla
            evt.consume();
        }
    }//GEN-LAST:event_txtEspecieKeyTyped

    private void txtRazaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazaKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si el carácter es un número
        if (Character.isDigit(caracter)) {
            // Mostrar un JDialog
            JOptionPane.showMessageDialog(this, "No se pueden ingresar números", "Error", JOptionPane.ERROR_MESSAGE);
            // Cancelar el evento de tecla
            evt.consume();
        }
    }//GEN-LAST:event_txtRazaKeyTyped

    private void Mostrarpanelcrud(JPanel p) {
        p.setSize(700, 460);
        p.setLocation(0, 0);
        Menu.PanelPrincipal.removeAll();
        Menu.PanelPrincipal.add(p, BorderLayout.CENTER);
        Menu.PanelPrincipal.revalidate();
        Menu.PanelPrincipal.repaint();
    }

    private void bloquearDate(JDateChooser dateChooser) {
        // Deshabilitar la edición del campo de texto
        dateChooser.getDateEditor().setEnabled(false);
        // Establecer la fecha máxima como la fecha actual
        dateChooser.setMaxSelectableDate(new Date());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCedula;
    private javax.swing.JComboBox<String> cmbIdMascota;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCedDuenio;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblIdMascota;
    private javax.swing.JLabel lblIdOculto;
    private javax.swing.JLabel lblMASCOTAS;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlCRUDS;
    private javax.swing.JPanel pnlCampos;
    public static javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
