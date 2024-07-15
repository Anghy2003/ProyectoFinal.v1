/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Cruds;

import Conexion.Conexion_db;
import Models.Vendedor;
import static Vista.Cruds.CRUD_Cliente.BaseFinal;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 59399
 */
public class CRUD_Vendedor extends javax.swing.JPanel {
    static ObjectContainer BaseFinal = Conexion_db.ConectarBD();

    /**
     * Creates new form CRUD_Vendedor
     */
    public CRUD_Vendedor() {
        initComponents();
        mostrarDatos(BaseFinal);
    }
    static ArrayList<Vendedor> listaVendedor = new ArrayList<>();

    public static List<Vendedor> getlistaVendedorBase(ObjectContainer BaseFinal) {
        List<Vendedor> listaVendedorBase = new ArrayList<>();
        ObjectSet<Vendedor> vendedor = BaseFinal.query(Vendedor.class);
        for (Vendedor vendedor1 : vendedor) {
            listaVendedorBase.add(vendedor1);
        }
        return listaVendedorBase;
    }
    public void GuardarVendedor(ObjectContainer BaseFinal, double sueldoBase_Vendedor, double comiciones_Vendedor, int numeroVentas_Vendedor, String nombreUsuarioVendedor, String passwordVendedor,
            String cedula, String nombres, String apellidos, String direccion, String correo, String celular, String genero, String fechaNacimiento, String estadoCivil) {

        Vendedor cliente = new Vendedor();

        if (VerificarVendedor(BaseFinal, nombreUsuarioVendedor) == 0) {

            BaseFinal.set(cliente);

            JOptionPane.showMessageDialog(this, "Cliente Guardado");

        } else {

            JOptionPane.showMessageDialog(this, "Ya existe el Usuario,Intente otro Usuario");
        }
    }

    public static int VerificarVendedor(ObjectContainer BaseFinal, String userV) {

        Vendedor BuscarV = new Vendedor(userV);

        ObjectSet resultado = BaseFinal.get(BuscarV);//objeto tipo registro

        return resultado.size();
    }                                            
    
    public static Vendedor BuscarVendedor(ObjectContainer base, String userV) {
        Vendedor PBuscar = null;
        ObjectSet<Vendedor> personas = base.queryByExample(new Vendedor(userV)); // Buscar por ejemplo de Persona con la cédula

        if (!personas.isEmpty()) {
            PBuscar = personas.get(0); // Suponiendo que la consulta devuelve solo una persona única
        }
        return PBuscar;
    }
    
    private void mostrarDatos(ObjectContainer BaseFinal) {
        tablaVendedor.setEnabled(true);
        // Guardamos en "resultado" todas las personas de la base de datos
        ObjectSet<Vendedor> resultado = BaseFinal.get(Vendedor.class);
        // Creamos una matriz para almacenar los datos
        String[][] matriz = new String[resultado.size()][16];
        int i = 0;
        for (Vendedor vendedor : resultado) {
            
            matriz[i][0] = vendedor.getiD_Vendedor();
            matriz[i][1] = vendedor.getiD_Usuario();
            matriz[i][2] = vendedor.getUsuario();
            matriz[i][3] = vendedor.getPassword();
            matriz[i][4] = vendedor.getNombres();
            matriz[i][5] = vendedor.getApellidos();
            matriz[i][6] = vendedor.getDireccion();
            matriz[i][7] = vendedor.getCorreo();
            matriz[i][8] = vendedor.getCelular();
            matriz[i][10] = vendedor.getFechaNacimiento();
            matriz[i][11] = vendedor.getEstadoCivil();
            matriz[i][12] = vendedor.getGenero();
            matriz[i][13] = String.valueOf(vendedor.getSueldoBase_Vendedor());
            matriz[i][14] = String.valueOf(vendedor.getComiciones_Vendedor());
            matriz[i][15] = String.valueOf(vendedor.getNumeroVentas_Vendedor());
                    
                    } 
        
        // Configuramos los datos en la tabla
        tablaVendedor.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{"ID Vendedor", "ID Usuario", "Usuario", "Contraseña", "Nombres", "Apellidos", "Direccion", "Correo Electronico", "Celular","Fecha Nacimiento"
                , "Estado Civil", "Genero", "Sueldo", "Comiciones", "Numero de Ventas"}
        ));
        tablaVendedor.setEnabled(false);
    }
    
    
    public static void cerrarBase() {
        BaseFinal.close();
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
        lblProveedor = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        txtNombresVendedor = new javax.swing.JTextField();
        txtCedulaVendedor = new javax.swing.JTextField();
        txtNombreUserVendedor = new javax.swing.JTextField();
        txtCorreoVendedor = new javax.swing.JTextField();
        txtDireccionVendedor = new javax.swing.JTextField();
        txtApellidosVendedor = new javax.swing.JTextField();
        txtSueldoVendedor = new javax.swing.JTextField();
        lblEstadoCivil = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblSueldo = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        comboxEstadoCivilVendedor = new javax.swing.JComboBox<>();
        comboxGeneroVendedor = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtCelularVendedor = new javax.swing.JTextField();
        lblPassUser = new javax.swing.JLabel();
        txtPassUserVendedor = new javax.swing.JPasswordField();
        lblNombreUser1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblComiciones = new javax.swing.JLabel();
        lblNumeroVentas = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        txtComicionesVendedor = new javax.swing.JTextField();
        txtNumeroVentasVendedor = new javax.swing.JTextField();
        txtFechaVendedor = new javax.swing.JTextField();
        lblFondoCRUD = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVendedor = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProveedor.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        lblProveedor.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedor.setText("VENDEDOR");
        jPanel1.add(lblProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 170, -1));

        lblDireccion.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Direccion");
        jPanel1.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        lblCedula.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula.setText("Cedula");
        jPanel1.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        lblNombres.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres.setText("Nombres:");
        jPanel1.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txtNombresVendedor.setBackground(new java.awt.Color(0, 21, 27));
        txtNombresVendedor.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        txtNombresVendedor.setForeground(new java.awt.Color(255, 255, 255));
        txtNombresVendedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtNombresVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 170, 20));

        txtCedulaVendedor.setBackground(new java.awt.Color(0, 21, 27));
        txtCedulaVendedor.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        txtCedulaVendedor.setForeground(new java.awt.Color(255, 255, 255));
        txtCedulaVendedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCedulaVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 170, 20));

        txtNombreUserVendedor.setBackground(new java.awt.Color(0, 21, 27));
        txtNombreUserVendedor.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        txtNombreUserVendedor.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreUserVendedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombreUserVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUserVendedorActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreUserVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 170, 20));

        txtCorreoVendedor.setBackground(new java.awt.Color(0, 21, 27));
        txtCorreoVendedor.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        txtCorreoVendedor.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreoVendedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCorreoVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 170, 20));

        txtDireccionVendedor.setBackground(new java.awt.Color(0, 21, 27));
        txtDireccionVendedor.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        txtDireccionVendedor.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccionVendedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtDireccionVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 170, 20));

        txtApellidosVendedor.setBackground(new java.awt.Color(0, 21, 27));
        txtApellidosVendedor.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        txtApellidosVendedor.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidosVendedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtApellidosVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 170, 20));

        txtSueldoVendedor.setBackground(new java.awt.Color(0, 21, 27));
        txtSueldoVendedor.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        txtSueldoVendedor.setForeground(new java.awt.Color(255, 255, 255));
        txtSueldoVendedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtSueldoVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 170, 20));

        lblEstadoCivil.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblEstadoCivil.setForeground(new java.awt.Color(255, 255, 255));
        lblEstadoCivil.setText("Estado Civil");
        jPanel1.add(lblEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo");
        jPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        lblSueldo.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblSueldo.setForeground(new java.awt.Color(255, 255, 255));
        lblSueldo.setText("Sueldo");
        jPanel1.add(lblSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, 20));

        lblFechaNacimiento.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNacimiento.setText("Fechas de Nacimiento");
        jPanel1.add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 150, 30));

        lblApellidos.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setText("Apellidos");
        jPanel1.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        lblCelular.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(255, 255, 255));
        lblCelular.setText("Celular");
        jPanel1.add(lblCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        comboxEstadoCivilVendedor.setBackground(new java.awt.Color(0, 21, 27));
        comboxEstadoCivilVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SOLTERO", "CASADO", "DIVORCIADO", "UNION LIBRE", "VIUDO" }));
        jPanel1.add(comboxEstadoCivilVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        comboxGeneroVendedor.setBackground(new java.awt.Color(0, 21, 27));
        comboxGeneroVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FEMENINO", "MASCULINO", " " }));
        jPanel1.add(comboxGeneroVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(0, 21, 27));
        btnRegistrar.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        btnSalir.setBackground(new java.awt.Color(0, 21, 27));
        btnSalir.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        txtCelularVendedor.setBackground(new java.awt.Color(0, 21, 27));
        txtCelularVendedor.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        txtCelularVendedor.setForeground(new java.awt.Color(255, 255, 255));
        txtCelularVendedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCelularVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 170, 20));

        lblPassUser.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblPassUser.setForeground(new java.awt.Color(255, 255, 255));
        lblPassUser.setText("Contraseña*");
        jPanel1.add(lblPassUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        txtPassUserVendedor.setBackground(new java.awt.Color(0, 21, 27));
        txtPassUserVendedor.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPassUserVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 170, -1));

        lblNombreUser1.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblNombreUser1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUser1.setText("Nombe Usuario*");
        jPanel1.add(lblNombreUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(0, 21, 27));
        btnEliminar.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, -1, -1));

        btnModificar.setBackground(new java.awt.Color(0, 21, 27));
        btnModificar.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(0, 21, 27));
        btnBuscar.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        lblComiciones.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblComiciones.setForeground(new java.awt.Color(255, 255, 255));
        lblComiciones.setText("Comiciones");
        jPanel1.add(lblComiciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, 20));

        lblNumeroVentas.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblNumeroVentas.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroVentas.setText("Numero de Ventas");
        jPanel1.add(lblNumeroVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, 20));

        lblGenero.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(255, 255, 255));
        lblGenero.setText("Genero");
        jPanel1.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, 20));

        txtComicionesVendedor.setBackground(new java.awt.Color(0, 21, 27));
        txtComicionesVendedor.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        txtComicionesVendedor.setForeground(new java.awt.Color(255, 255, 255));
        txtComicionesVendedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtComicionesVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 170, 20));

        txtNumeroVentasVendedor.setBackground(new java.awt.Color(0, 21, 27));
        txtNumeroVentasVendedor.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        txtNumeroVentasVendedor.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroVentasVendedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtNumeroVentasVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 170, 20));

        txtFechaVendedor.setBackground(new java.awt.Color(0, 21, 27));
        txtFechaVendedor.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        txtFechaVendedor.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaVendedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtFechaVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 110, 20));

        lblFondoCRUD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CRUD_ORIGINAL.jpg"))); // NOI18N
        lblFondoCRUD.setText("ASASADAS");
        jPanel1.add(lblFondoCRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 850, 710));

        tablaVendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id vendedor", "id usuario", "usuario", "contraseña", "cedula", "nombre", "apellido", "direccion", "correo", "celular", "fecha nacimiento", "estado civil", "genero", "sueldo", "comiciones", "numero de ventas"
            }
        ));
        jScrollPane1.setViewportView(tablaVendedor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreUserVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUserVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUserVendedorActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        boolean usuarioRepetido = false;

        Query vendedor = BaseFinal.query();
        vendedor.constrain(Vendedor.class);
        vendedor.descend("usuario_Vendedor").constrain(txtNombreUserVendedor.getText());
        ObjectSet<Vendedor> result = vendedor.execute();

        if (result.size() > 0) {
            JOptionPane.showMessageDialog(this, "Usuario ya registrado");
            usuarioRepetido = true;
        }

        if (!usuarioRepetido) {

            String auxcedula = txtCedulaVendedor.getText();
            String auxnombre = txtNombresVendedor.getText();
            String auxapellido = txtApellidosVendedor.getText();
            String auxdireccion = txtDireccionVendedor.getText();
            String auxcorreo = txtCorreoVendedor.getText();
            String auxcelular = txtCelularVendedor.getText();
            String auxfechanacimiento = txtFechaVendedor.getText();
            String auxestadocivil = (String) comboxEstadoCivilVendedor.getSelectedItem();
            String auxgenero = (String) comboxGeneroVendedor.getSelectedItem();
            double auxsueldo = Double.parseDouble(txtSueldoVendedor.getText());
            double auxcomiciones = Double.parseDouble(txtComicionesVendedor.getText());
            int auxnumeroventras = Integer.parseInt(txtNumeroVentasVendedor.getText());
            String auxnombreuser = txtNombreUserVendedor.getText();
            String auxpassuser = txtPassUserVendedor.getText();

            Vendedor vendedor1 = new Vendedor();

            vendedor1.setCedula(auxcedula);
            vendedor1.setNombres(auxnombre);
            vendedor1.setApellidos(auxapellido);
            vendedor1.setDireccion(auxdireccion);
            vendedor1.setCorreo(auxcorreo);
            vendedor1.setCelular(auxcelular);
            vendedor1.setFechaNacimiento(auxfechanacimiento);
            vendedor1.setEstadoCivil(auxestadocivil);
            vendedor1.setGenero(auxgenero);
            vendedor1.setSueldoBase_Vendedor(auxsueldo);
            vendedor1.setComiciones_Vendedor(auxcomiciones);
            vendedor1.setNumeroVentas_Vendedor(auxnumeroventras);
            vendedor1.setUsuario(auxnombreuser);
            vendedor1.setPassword(auxpassuser);

            //agrega a la base de datos
            GuardarVendedor(BaseFinal, auxsueldo, auxcomiciones, auxnumeroventras, auxnombreuser, auxnombreuser,
                auxcedula, auxnombre, auxapellido, auxdireccion, auxcorreo, auxcelular, auxgenero, auxfechanacimiento, auxestadocivil);

            mostrarDatos(BaseFinal);

        }

        txtCedulaVendedor.setText("");
        txtNombresVendedor.setText("");
        txtApellidosVendedor.setText("");
        txtDireccionVendedor.setText("");
        txtCorreoVendedor.setText("");
        txtCelularVendedor.setText("");
        txtSueldoVendedor.setText("");
        txtComicionesVendedor.setText("");
        txtNumeroVentasVendedor.setText("");
        comboxEstadoCivilVendedor.setSelectedIndex(-1);
        comboxGeneroVendedor.setSelectedIndex(-1);
        txtNombreUserVendedor.setText("");
        txtPassUserVendedor.setText("");
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        BuscarVendedor(BaseFinal, txtNombreUserVendedor.getText());

    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboxEstadoCivilVendedor;
    private javax.swing.JComboBox<String> comboxGeneroVendedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblComiciones;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblFondoCRUD;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNombreUser1;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblNumeroVentas;
    private javax.swing.JLabel lblPassUser;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JTable tablaVendedor;
    private javax.swing.JTextField txtApellidosVendedor;
    private javax.swing.JTextField txtCedulaVendedor;
    private javax.swing.JTextField txtCelularVendedor;
    private javax.swing.JTextField txtComicionesVendedor;
    private javax.swing.JTextField txtCorreoVendedor;
    private javax.swing.JTextField txtDireccionVendedor;
    private javax.swing.JTextField txtFechaVendedor;
    private javax.swing.JTextField txtNombreUserVendedor;
    private javax.swing.JTextField txtNombresVendedor;
    private javax.swing.JTextField txtNumeroVentasVendedor;
    private javax.swing.JPasswordField txtPassUserVendedor;
    private javax.swing.JTextField txtSueldoVendedor;
    // End of variables declaration//GEN-END:variables
}
