/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Cruds;

import Conexion.Conexion_db;
import Models.Proveedor;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 59399
 */
public class CRUD_Provedor extends javax.swing.JPanel {

    static ObjectContainer BaseFinal = Conexion_db.ConectarBD();

    /**
     * Creates new form CRUD_Provedor
     */
    public CRUD_Provedor() {
        initComponents();
        mostrarDatos(BaseFinal);
        pnlBotones.setVisible(true);
        pnlBotones.setOpaque(false);
        btnModificar.setVisible(false);
        btnEliminar.setVisible(false);
    }

    public final void transparente() {
        txtCodigoProveedor.setVisible(true);
        txtCodigoProveedor.setOpaque(false);
        txtTipoProveedor.setVisible(true);
        txtTipoProveedor.setOpaque(false);
        txtNombreProveedor.setVisible(true);
        txtNombreProveedor.setOpaque(false);

//        
//        btnBotoncito2.setVisible(true);
//        btnBotoncito2.setOpaque(false);
//        btnBotoncito2.setContentAreaFilled(false);
//        btnBotoncito2.setBorderPainted(false);
    }

    public static List<Proveedor> getListaProveedoresBase(ObjectContainer BaseFinal) {//metodo para obtener la lista de la base
        List<Proveedor> listaProveedoresBase = new ArrayList<>();
        ObjectSet<Proveedor> proveedores = BaseFinal.query(Proveedor.class);
        for (Proveedor proveedor : proveedores) {
            listaProveedoresBase.add(proveedor);
        }
        return listaProveedoresBase;
    }

    // Nombrar la lista con el uso del metodo anterior
    List<Proveedor> listaProveedoresBase = getListaProveedoresBase(BaseFinal);

    public static void guardarProveedor(ObjectContainer BaseFinal, String codigo_proveedor, String tipo_proveedor, String nombre_proveedor) {

        Proveedor proveedor1 = new Proveedor(codigo_proveedor, tipo_proveedor, nombre_proveedor);

        if (verificarProveedor(BaseFinal, codigo_proveedor, null, null) == 0) {//mandamos a verificar con el codigo
            BaseFinal.set(proveedor1);
            JOptionPane.showMessageDialog(null, "Proveedor guardado");

        } else {
            JOptionPane.showMessageDialog(null, "Proveedor ya existe en la BD");
        }
    }

    public static int verificarProveedor(ObjectContainer BaseFinal, String codigo_proveedor, String tipo_proveedor, String nombre_proveedor) {
        // Crear un nuevo objeto Clientes para usar como plantilla de búsqueda
        Proveedor BuscarProveedor = new Proveedor(codigo_proveedor, null, null);//se ingreesará el valor del codigo y el resto nulo
        // Obtener todos los objetos que coincidan con la plantilla de búsqueda
        ObjectSet resultado = BaseFinal.get(BuscarProveedor);//se obtendra resultado que coincida con el codigo
        return resultado.size();//devolvera el numero de coincidencias
    }

    private void mostrarDatos(ObjectContainer base) {
        jTable1.setEnabled(true);
        //Guardamos en "resultado" todos proveedores de la base de Datos
        ObjectSet<Proveedor> resultado = base.get(Proveedor.class);
        //Creo una matriz
        String matriz[][] = new String[resultado.size()][3];
        int i = 0;
        for (Proveedor miProveedor : resultado) {//iteramos en cada elemento de "resultado"
            matriz[i][0] = miProveedor.getCodigo_proveedor();
            matriz[i][1] = miProveedor.getNombre_proveedor();
            matriz[i][2] = miProveedor.getTipo_proveedor();
            i++;
        }

        // datos configurados
        jTable1.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"Codigo", "Nombre ", "Tipo de Proveedor"}));
        jTable1.setEnabled(false);
    }

    public static Proveedor buscarProveedorPorCodigo(ObjectContainer base, String codigo) {
        Proveedor proveedor = null;
        ObjectSet<Proveedor> proveedores = base.query(Proveedor.class);
        for (Proveedor p : proveedores) {
            if (p.getCodigo_proveedor().equals(codigo)) {
                proveedor = p;
                break;
            }
        }
        return proveedor;
    }

    public static void cerrar_BD(ObjectContainer BaseFinal) {
        BaseFinal.close();
        System.exit(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lblProveedor = new javax.swing.JLabel();
        lblTipoProveedor = new javax.swing.JLabel();
        txtTipoProveedor = new javax.swing.JTextField();
        lblNombreProveedor = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        txtCodigoProveedor = new javax.swing.JTextField();
        lblCodigooProveedor = new javax.swing.JLabel();
        sprCodigoProveedor = new javax.swing.JSeparator();
        sprTipoProveedor = new javax.swing.JSeparator();
        sprNombreProveedor = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnlBotones = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblFondoCRUD = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProveedor.setFont(new java.awt.Font("Eras Bold ITC", 3, 48)); // NOI18N
        lblProveedor.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedor.setText("PROVEEDOR");
        jPanel1.add(lblProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 440, 80));

        lblTipoProveedor.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        lblTipoProveedor.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoProveedor.setText("Tipo de Proveedor:");
        jPanel1.add(lblTipoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtTipoProveedor.setBackground(new java.awt.Color(0, 21, 27));
        txtTipoProveedor.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        txtTipoProveedor.setForeground(new java.awt.Color(255, 255, 255));
        txtTipoProveedor.setBorder(null);
        txtTipoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoProveedorActionPerformed(evt);
            }
        });
        txtTipoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoProveedorKeyTyped(evt);
            }
        });
        jPanel1.add(txtTipoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 250, 30));

        lblNombreProveedor.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        lblNombreProveedor.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreProveedor.setText("Nombre del Proveedor:");
        jPanel1.add(lblNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtNombreProveedor.setBackground(new java.awt.Color(0, 21, 27));
        txtNombreProveedor.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        txtNombreProveedor.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreProveedor.setBorder(null);
        txtNombreProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProveedorKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 250, 30));

        txtCodigoProveedor.setBackground(new java.awt.Color(0, 21, 27));
        txtCodigoProveedor.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        txtCodigoProveedor.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoProveedor.setBorder(null);
        jPanel1.add(txtCodigoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 250, 30));

        lblCodigooProveedor.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        lblCodigooProveedor.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigooProveedor.setText("Código de Proveedor:");
        jPanel1.add(lblCodigooProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        sprCodigoProveedor.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(sprCodigoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 250, 20));

        sprTipoProveedor.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(sprTipoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 250, 20));

        sprNombreProveedor.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(sprNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 250, 20));

        jTable1.setBackground(new java.awt.Color(0, 21, 27));
        jTable1.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 700, 220));

        pnlBotones.setBackground(new java.awt.Color(0, 21, 27));
        pnlBotones.setLayout(new java.awt.GridBagLayout());

        btnEliminar.setBackground(new java.awt.Color(0, 21, 27));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Eliminar Proveedor seleccionado");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        pnlBotones.add(btnEliminar, gridBagConstraints);

        btnModificar.setBackground(new java.awt.Color(0, 21, 27));
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar/Guardar");
        btnModificar.setToolTipText("Para guardar cambios (Si hubiere)");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        pnlBotones.add(btnModificar, gridBagConstraints);

        btnRegistrar.setBackground(new java.awt.Color(0, 21, 27));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setToolTipText("Ingrese todos los campos");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        pnlBotones.add(btnRegistrar, gridBagConstraints);

        btnBuscar.setBackground(new java.awt.Color(0, 21, 27));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("Ingrese el codigo de proveedor");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        pnlBotones.add(btnBuscar, gridBagConstraints);

        jPanel1.add(pnlBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 230, -1));

        btnSalir.setBackground(new java.awt.Color(0, 21, 27));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 90, 30));

        lblFondoCRUD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CRUD_ORIGINAL.jpg"))); // NOI18N
        jPanel1.add(lblFondoCRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 470));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoProveedorActionPerformed

    private void txtTipoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoProveedorKeyTyped
        char x = evt.getKeyChar();
        if (Character.isDigit(x)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtTipoProveedorKeyTyped

    private void txtNombreProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProveedorKeyTyped
        char x = evt.getKeyChar();
        if (Character.isDigit(x)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtNombreProveedorKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Proveedor ProvEncontrado = new Proveedor(txtCodigoProveedor.getText(), null, null);//generamos un objeto con codigo para buscar
        ObjectSet resultado = BaseFinal.get(ProvEncontrado);//buscamos en la base
        Boolean encontrado = false;//bandera para informar que no se encontro coincidencias
        if (!resultado.isEmpty()) {
            int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar a " + txtNombreProveedor.getText() + "?", "Eliminar Proveedor", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                // Eliminar la persona
                for (Object obj : resultado) {
                    BaseFinal.delete(obj);//eliminamos cada objeto encontrado
                }
                JOptionPane.showMessageDialog(null, "Proveedor eliminado");
                encontrado = true;
                mostrarDatos(BaseFinal);
            } else {
                // No eliminar la persona
                JOptionPane.showMessageDialog(null, "Operación cancelada");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Persona no encontrada en la BD");
        }
        //reset campos
        txtCodigoProveedor.setText("");
        txtNombreProveedor.setText("");
        txtTipoProveedor.setText("");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //buscamos a proveedor de la base
        for (int i = 0; i < listaProveedoresBase.size(); i++) {
            if (txtCodigoProveedor.getText().equals(listaProveedoresBase.get(i).getCodigo_proveedor())) {
                Proveedor encontrado = new Proveedor(txtCodigoProveedor.getText(), null, null);//generamos una persona con la cedula para buscar
                ObjectSet resultado = BaseFinal.get(encontrado);//buscamos en la base
                if (!resultado.isEmpty()) {
                    resultado.forEach((obj) -> {
                        BaseFinal.delete(obj);//eliminamos cada objeto encontrado
                    });
                } else {
                    JOptionPane.showMessageDialog(null, "Proveedor no encontrada en la BD");
                }
                //una vez eliminado procede a guardar para  "Modificar"
                guardarProveedor(BaseFinal, txtCodigoProveedor.getText(), txtTipoProveedor.getText(), txtNombreProveedor.getText());
                mostrarDatos(BaseFinal);
            }
        }
        //reset campos
        txtCodigoProveedor.setText("");
        txtNombreProveedor.setText("");
        txtTipoProveedor.setText("");
        //visualizar botones necesarios
        btnBuscar.setVisible(true);
        btnRegistrar.setVisible(true);
        btnModificar.setVisible(false);
        btnEliminar.setVisible(false);
        txtCodigoProveedor.setEnabled(true);

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //verificamos que no haya el mismo codigo
        Boolean encontrado = false;
        if (listaProveedoresBase.size() > 0) {
            for (int i = 0; i < listaProveedoresBase.size(); i++) {
                if (listaProveedoresBase.get(i).getCodigo_proveedor().equals(txtCodigoProveedor.getText())) {
                    JOptionPane.showMessageDialog(this, "YA EXISTE UN PROVEEDOR CON ESE CODIGO");
                    encontrado = true;
                    txtCodigoProveedor.setText("");
                    txtNombreProveedor.setText("");
                    txtTipoProveedor.setText("");
                }
            }
        }
        Boolean valido = false;//creamos una bandera para validar datos
        guardarProveedor(BaseFinal, txtCodigoProveedor.getText(), txtTipoProveedor.getText(), txtNombreProveedor.getText());
        mostrarDatos(BaseFinal);
        //reset campos
        txtCodigoProveedor.setText("");
        txtNombreProveedor.setText("");
        txtTipoProveedor.setText("");
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // Buscar una Proveedior por codigo
        Proveedor miProv = buscarProveedorPorCodigo(BaseFinal, txtCodigoProveedor.getText());
        if (miProv != null) {//si encontramos resultados (no seria nulo)
            //recibimos los valores del objeto encontrado y lo pasamos a los campos
            txtNombreProveedor.setText(miProv.getNombre_proveedor());
            txtTipoProveedor.setText(miProv.getTipo_proveedor());

            JOptionPane.showMessageDialog(this, "Persona encontrada");
            txtCodigoProveedor.setEnabled(false);
            btnRegistrar.setVisible(false);
            btnBuscar.setVisible(false);
            btnEliminar.setVisible(true);
            btnModificar.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(this, "No se encontro al proveedor con codigo "+txtCodigoProveedor.getText());
            //reset campos
            txtCodigoProveedor.setText("");
            txtNombreProveedor.setText("");
            txtTipoProveedor.setText("");
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
        cerrar_BD(BaseFinal);
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCodigooProveedor;
    private javax.swing.JLabel lblFondoCRUD;
    private javax.swing.JLabel lblNombreProveedor;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblTipoProveedor;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JSeparator sprCodigoProveedor;
    private javax.swing.JSeparator sprNombreProveedor;
    private javax.swing.JSeparator sprTipoProveedor;
    private javax.swing.JTextField txtCodigoProveedor;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtTipoProveedor;
    // End of variables declaration//GEN-END:variables
}
