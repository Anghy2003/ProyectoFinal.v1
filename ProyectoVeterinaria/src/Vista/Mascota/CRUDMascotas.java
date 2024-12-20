/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Mascota;

import DUENO.DuenoDb;
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
import java.util.Date;
import javax.swing.JScrollBar;

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
            pnlBotones.setVisible(false);
            panelBotonesOpcionales.setVisible(false);
            JScrollBar verticalScrollBar = scrollMascota.getVerticalScrollBar();
            verticalScrollBar.setValue(100);
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
            txtCedulaDueno.setVisible(true);
            lblFechaNacimiento.setVisible(false);
            jDateFecha.setVisible(false);
            bloquearDate(jDateFecha);
            btnModificar.setVisible(false);
            btnEliminar.setVisible(false);
            btnRegresar.setVisible(false);
            //agregar datos de dueños  a combobox
            conexion Base = new conexion();

            MascotaDb masDb = new MascotaDb(Base);
            masDb.llenarComboBoxMascotasPorDueño(cmbIdMascota,txtCedulaDueno.getText().trim());
            masDb.mostrarMascotasYDueno(tblMascotas);

        } else if (opcion == JOptionPane.NO_OPTION) {
            pnlBotones.setVisible(true);
            panelBotonesOpcionales.setVisible(true);
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
            txtCedulaDueno.setVisible(true);
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
            
            masDb.mostrarMascotasYDueno(tblMascotas);

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
        lblIdOculto = new javax.swing.JLabel();
        scrollMascota = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        pnlColorado = new javax.swing.JPanel();
        pnlCRUDS = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        pnlCampos = new javax.swing.JPanel();
        lblIdMascota = new javax.swing.JLabel();
        lblCedDuenio = new javax.swing.JLabel();
        cmbIdMascota = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtCedulaDueno = new javax.swing.JTextField();
        panelBotonesOpcionales = new javax.swing.JPanel();
        lblRaza = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        lblEspecie = new javax.swing.JLabel();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        lblNombre = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMascotas = new javax.swing.JTable();

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

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
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

        lblIdOculto.setFont(new java.awt.Font("Dialog", 1, 2)); // NOI18N
        lblIdOculto.setForeground(new java.awt.Color(183, 224, 210));
        lblIdOculto.setText("jLabel1");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnlColorado.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlColoradoLayout = new javax.swing.GroupLayout(pnlColorado);
        pnlColorado.setLayout(pnlColoradoLayout);
        pnlColoradoLayout.setHorizontalGroup(
            pnlColoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );
        pnlColoradoLayout.setVerticalGroup(
            pnlColoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        pnlCRUDS.setBackground(new java.awt.Color(255, 255, 255));
        pnlCRUDS.setMaximumSize(new java.awt.Dimension(563, 633));

        pnlBotones.setBackground(new java.awt.Color(255, 255, 255));
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
                .addGap(13, 13, 13)
                .addComponent(btnGuardar)
                .addGap(94, 94, 94)
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
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnRegresar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlCampos.setBackground(new java.awt.Color(255, 255, 255));

        lblIdMascota.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblIdMascota.setForeground(new java.awt.Color(78, 108, 152));
        lblIdMascota.setText("Mascota:");

        lblCedDuenio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCedDuenio.setForeground(new java.awt.Color(78, 108, 152));
        lblCedDuenio.setText("Cedula Dueño:");

        cmbIdMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbIdMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmbIdMascotaMouseEntered(evt);
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

        txtCedulaDueno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaDuenoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaDuenoKeyTyped(evt);
            }
        });

        panelBotonesOpcionales.setBackground(new java.awt.Color(255, 255, 255));

        lblRaza.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRaza.setForeground(new java.awt.Color(78, 108, 152));
        lblRaza.setText("Raza:");

        lblFechaNacimiento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(78, 108, 152));
        lblFechaNacimiento.setText("Fecha Nacimiento:");

        txtRaza.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRaza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazaKeyTyped(evt);
            }
        });

        lblEspecie.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEspecie.setForeground(new java.awt.Color(78, 108, 152));
        lblEspecie.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEspecie.setText("Especie:");

        jDateFecha.setForeground(new java.awt.Color(0, 0, 0));

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(78, 108, 152));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre:");

        txtEspecie.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEspecie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEspecieKeyTyped(evt);
            }
        });

        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesOpcionalesLayout = new javax.swing.GroupLayout(panelBotonesOpcionales);
        panelBotonesOpcionales.setLayout(panelBotonesOpcionalesLayout);
        panelBotonesOpcionalesLayout.setHorizontalGroup(
            panelBotonesOpcionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesOpcionalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesOpcionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotonesOpcionalesLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBotonesOpcionalesLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBotonesOpcionalesLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lblRaza)
                        .addGap(10, 10, 10)
                        .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBotonesOpcionalesLayout.createSequentialGroup()
                        .addComponent(lblFechaNacimiento)
                        .addGap(14, 14, 14)
                        .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelBotonesOpcionalesLayout.setVerticalGroup(
            panelBotonesOpcionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesOpcionalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesOpcionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelBotonesOpcionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEspecie)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelBotonesOpcionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRaza)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelBotonesOpcionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaNacimiento)
                    .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlCamposLayout = new javax.swing.GroupLayout(pnlCampos);
        pnlCampos.setLayout(pnlCamposLayout);
        pnlCamposLayout.setHorizontalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCamposLayout.createSequentialGroup()
                        .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCedDuenio)
                            .addGroup(pnlCamposLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblIdMascota)))
                        .addGap(24, 24, 24)
                        .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbIdMascota, 0, 256, Short.MAX_VALUE)
                            .addComponent(txtCedulaDueno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamposLayout.createSequentialGroup()
                        .addComponent(panelBotonesOpcionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btnBuscar)
                .addGap(19, 19, 19))
        );
        pnlCamposLayout.setVerticalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addComponent(panelBotonesOpcionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCamposLayout.createSequentialGroup()
                        .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCedDuenio)
                            .addComponent(txtCedulaDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(lblIdMascota))
                    .addGroup(pnlCamposLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(cmbIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar)))
        );

        tblMascotas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMascotas.setEnabled(false);
        tblMascotas.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tblMascotas);

        javax.swing.GroupLayout pnlCRUDSLayout = new javax.swing.GroupLayout(pnlCRUDS);
        pnlCRUDS.setLayout(pnlCRUDSLayout);
        pnlCRUDSLayout.setHorizontalGroup(
            pnlCRUDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCRUDSLayout.createSequentialGroup()
                .addGroup(pnlCRUDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCRUDSLayout.createSequentialGroup()
                        .addGroup(pnlCRUDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCRUDSLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCRUDSLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnlCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        pnlCRUDSLayout.setVerticalGroup(
            pnlCRUDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCRUDSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCRUDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlColorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pnlCRUDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlColorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        scrollMascota.setViewportView(jPanel1);

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addComponent(lblMASCOTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblIdOculto)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(scrollMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addComponent(lblMASCOTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    


    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        pnlPrincipal.setVisible(false);
        Mostrarpanelcrud(pnlLogo);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void txtCedulaDuenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaDuenoKeyTyped

    }//GEN-LAST:event_txtCedulaDuenoKeyTyped

    private void txtCedulaDuenoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaDuenoKeyReleased
        char c = evt.getKeyChar();
// Verificar si el carácter ingresado no es un número o si es Backspace
        if (!Character.isDigit(c) && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            evt.consume(); // Ignorar el evento si no es un número
        } else {
            // Obtener el texto actual del JTextField
            String cedula = txtCedulaDueno.getText().trim();

            // Verificar si la longitud es 10
            if (cedula.length() >= 10) {
                conexion Base = new conexion();
                MascotaDb masDb = new MascotaDb(Base);
                masDb.llenarComboBoxMascotasPorDueño(cmbIdMascota, txtCedulaDueno.getText().trim());
            } else {
                // Actualizar la lista de mascotas
                conexion Base = new conexion();
                MascotaDb masDb = new MascotaDb(Base);
                masDb.filtrarMascotasPorCedula(tblMascotas, cedula);
            }
        }
    }//GEN-LAST:event_txtCedulaDuenoKeyReleased

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (DuenoDb.validarCedula(txtCedulaDueno.getText().trim())) {
            //obtengo id
            conexion Base = new conexion();
            MascotaDb masDb = new MascotaDb(Base);
            if (masDb.obtenerIdMascotaPorCedulaYNombre(txtCedulaDueno.getText().trim(), cmbIdMascota.getSelectedItem().toString())) {

                panelBotonesOpcionales.setVisible(true);
                pnlBotones.setVisible(true);
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
                txtCedulaDueno.setVisible(true);
                lblFechaNacimiento.setVisible(true);
                jDateFecha.setVisible(true);
                btnModificar.setVisible(true);
                btnEliminar.setVisible(true);
                btnRegresar.setVisible(true);
                //habilito el id que nadie sabe que existe MUEJEJE
                lblIdOculto.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "No encontrado");
            }

            lblIdOculto.setText(masDb.quieroId(txtCedulaDueno.getText().trim(), cmbIdMascota.getSelectedItem().toString()));
            //setteos
            txtNombre.setText(masDb.obtenerNombreMascotaPorId());
            txtEspecie.setText(masDb.obtenerEspecieMascotaPorId());
            txtRaza.setText(masDb.obtenerRazaMascotaPorId());
            jDateFecha.setDate(masDb.obtenerFechaNacimientoMascotaPorId());

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una cedula valida");
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cmbIdMascotaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbIdMascotaMouseEntered
        conexion Base = new conexion();
        MascotaDb masDb = new MascotaDb(Base);
        masDb.llenarComboBoxMascotasPorDueño(cmbIdMascota, txtCedulaDueno.getText().trim());
    }//GEN-LAST:event_cmbIdMascotaMouseEntered

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

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

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
        txtCedulaDueno.setVisible(true);
        lblFechaNacimiento.setVisible(false);
        jDateFecha.setVisible(false);
        btnModificar.setVisible(false);
        btnEliminar.setVisible(false);
        btnRegresar.setVisible(false);
        //agregar datos de dueños  a combobox
        conexion Base = new conexion();

        MascotaDb masDb = new MascotaDb(Base);
        masDb.llenarComboBoxMascotasPorDueño(cmbIdMascota, txtCedulaDueno.getText().trim());
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
conexion Base = new conexion();
        MascotaDb masDb = new MascotaDb(Base);

        //verifico que los campos no esten vacios
        if (txtNombre.getText().isBlank() || txtEspecie.getText().isBlank() || txtRaza.getText().isBlank() || jDateFecha.getDate() == null || !DuenoDb.validarCedula(txtCedulaDueno.getText().trim())) {
            JOptionPane.showMessageDialog(null, "Ingrese los campos validos");
        } else {
            if (!masDb.verificarExistenciaCedulaEnDueno(txtCedulaDueno.getText().trim())) {
                JOptionPane.showMessageDialog(null, "Dueño no registrado");
            } else {
                //Logica de eliminacion
                
                
                
                
                masDb.obtenerIdMascotayEliminar(txtCedulaDueno.getText().trim(), cmbIdMascota.getSelectedItem().toString());

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
        txtCedulaDueno.setVisible(true);
        lblFechaNacimiento.setVisible(false);
        jDateFecha.setVisible(false);
        btnModificar.setVisible(false);
        btnEliminar.setVisible(false);
        btnRegresar.setVisible(false);
        
                masDb.filtrarMascotasPorCedula(tblMascotas, txtCedulaDueno.getText().trim());
        masDb.llenarComboBoxMascotasPorDueño(cmbIdMascota, txtCedulaDueno.getText().trim());
                
                
                
                
                
                
                
            }

        }





        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        conexion Base = new conexion();
        MascotaDb masDb = new MascotaDb(Base);
        //verifico que los campos no esten vacios
        if (txtNombre.getText().isBlank() || txtEspecie.getText().isBlank() || txtRaza.getText().isBlank() || jDateFecha.getDate() == null || !DuenoDb.validarCedula(txtCedulaDueno.getText().trim())) {
            JOptionPane.showMessageDialog(null, "Ingrese los campos validos");
        } else {
            if (!masDb.verificarExistenciaCedulaEnDueno(txtCedulaDueno.getText().trim())) {
                JOptionPane.showMessageDialog(null, "Dueño no registrado");
            } else {
                //Logica de modificacion
                if (masDb.actualizarMascota(lblIdOculto.getText(), txtCedulaDueno.getText().trim(), txtNombre.getText(), txtEspecie.getText(), txtRaza.getText(), jDateFecha.getDate())) {
                    JOptionPane.showMessageDialog(null, "Mascota actualizada correctamente");
                    lblIdOculto.setText(null);
                    lblIdOculto.setVisible(false);
                    //reseteo campos
                    txtCedulaDueno.setText(null);
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
                    txtCedulaDueno.setVisible(true);
                    lblFechaNacimiento.setVisible(false);
                    jDateFecha.setVisible(false);
                    btnModificar.setVisible(false);
                    btnEliminar.setVisible(false);
                    btnRegresar.setVisible(false);
                masDb.filtrarMascotasPorCedula(tblMascotas, txtCedulaDueno.getText().trim());
                    masDb.llenarComboBoxMascotasPorDueño(cmbIdMascota, txtCedulaDueno.getText().trim());
                } else {
                    JOptionPane.showMessageDialog(null, "Error al actualizar Mascota");
                }

            }

        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtNombre.getText().isBlank() || txtEspecie.getText().isBlank() || txtRaza.getText().isBlank() || jDateFecha.getDate() == null || txtCedulaDueno.getText().isBlank()||txtCedulaDueno.getText().length()!=10) {
            JOptionPane.showMessageDialog(null, "No dejar espacios en blanco ni fechas sin seleccionar");
        } else {
            conexion Base = new conexion();
            MascotaDb miMascota = new MascotaDb(Base);
            if (miMascota.insertar(txtNombre.getText().trim(), txtEspecie.getText().trim(), txtRaza.getText().trim(), txtCedulaDueno.getText().trim(), jDateFecha.getDate())) {
                txtNombre.setText(null);
                txtNombre.setText(null);
                txtEspecie.setText(null);
                txtRaza.setText(null);
                txtCedulaDueno.setText(null);
                jDateFecha.setDate(null);
            }

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
    private javax.swing.JComboBox<String> cmbIdMascota;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCedDuenio;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblIdMascota;
    private javax.swing.JLabel lblIdOculto;
    private javax.swing.JLabel lblMASCOTAS;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JPanel panelBotonesOpcionales;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlCRUDS;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JPanel pnlColorado;
    public static javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JScrollPane scrollMascota;
    private javax.swing.JTable tblMascotas;
    private javax.swing.JTextField txtCedulaDueno;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
