
package Vista.Cruds;

import Conexion.Conexion_db;
import Vista.Menu.VistaMenu;
import Vista.Tables.TablaVehiculos;
import com.db4o.*;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import Models.*;
import static Vista.Cruds.CrudPanelVehiculo.verificarVehiculosGuardar;
import com.db4o.query.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author aberre
 */
public class BuscarPanelVehiculo1 extends javax.swing.JPanel {

    /**
     * Creates new form CrudPanelVehiculo
     */
    private String BuscarPlaca;
    public BuscarPanelVehiculo1(String receivedString) {
        this.BuscarPlaca = receivedString;
        initComponents();
        buscarVehiculo();
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
        jLabel2 = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblAño = new javax.swing.JLabel();
        txtPlaca = new rojeru_san.RSMTextFull();
        txtModelo = new rojeru_san.RSMTextFull();
        txtMarca = new rojeru_san.RSMTextFull();
        txtColor = new rojeru_san.RSMTextFull();
        btnCancelar = new rojeru_san.RSButtonRiple();
        YEARAño = new com.toedter.calendar.JYearChooser();
        btnModificar = new rojeru_san.RSButtonRiple();
        jLabel12 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 79));
        jLabel2.setText("Registro Vehículos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 270, 40));

        lblPlaca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(0, 53, 79));
        lblPlaca.setText("Placa:");
        jPanel1.add(lblPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, 40));

        lblModelo.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(0, 53, 79));
        lblModelo.setText("Modelo:");
        jPanel1.add(lblModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, 40));

        lblMarca.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(0, 53, 79));
        lblMarca.setText("Marca:");
        jPanel1.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 100, 40));

        lblColor.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblColor.setForeground(new java.awt.Color(0, 53, 79));
        lblColor.setText("Color:");
        jPanel1.add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 60, 40));

        lblAño.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblAño.setForeground(new java.awt.Color(0, 53, 79));
        lblAño.setText("Año Fabricación:");
        jPanel1.add(lblAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 180, 40));

        txtPlaca.setForeground(new java.awt.Color(0, 53, 79));
        txtPlaca.setColorTransparente(true);
        txtPlaca.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtPlaca.setPlaceholder("Ejm: AAA-9999");
        jPanel1.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 200, 40));

        txtModelo.setForeground(new java.awt.Color(0, 53, 79));
        txtModelo.setColorTransparente(true);
        txtModelo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtModelo.setPlaceholder("Ejm: F150 o D-MAX");
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 200, 40));

        txtMarca.setForeground(new java.awt.Color(0, 53, 79));
        txtMarca.setColorTransparente(true);
        txtMarca.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtMarca.setPlaceholder("Ejm: Ford");
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, 40));

        txtColor.setForeground(new java.awt.Color(0, 53, 79));
        txtColor.setColorTransparente(true);
        txtColor.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtColor.setPlaceholder("Ejm: Rojo");
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 200, 40));

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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));
        jPanel1.add(YEARAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 160, 30));

        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/burbujas.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 650));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        System.out.println("salir");
        TablaVehiculos tblCli = new TablaVehiculos();
        ShowpanelCruds(tblCli);
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void modificarVehiculo(String placa_Vehiculo, String modelo_Vehiculo, String marca_Vehiculo, String color_Vehiculo, int anioFabricacion_Vehiculo) {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        // Crear el objeto con los datos nuevos
        Vehiculo vehiculoModificado = new Vehiculo(placa_Vehiculo, modelo_Vehiculo, marca_Vehiculo, color_Vehiculo, anioFabricacion_Vehiculo);

        // Buscar el objeto existente en la base de datos
        Vehiculo vehiculoBusca = new Vehiculo(placa_Vehiculo, null, null, null, 0);
        ObjectSet resultado = BaseBD.get(vehiculoBusca);
        int coincidencias = resultado.size();

        if (coincidencias > 0) {
            // Eliminar el objeto existente
            Vehiculo vehiculoAEliminar = (Vehiculo) resultado.next();
            BaseBD.delete(vehiculoAEliminar);

            // Guardar el nuevo objeto con los datos modificados
            BaseBD.set(vehiculoModificado);
            System.out.println("Vehículo modificado y guardado exitosamente.");
        } else {
            System.out.println("No se encontró ningún vehículo con la placa especificada.");
        }

        // Cerrar la base de datos
        BaseBD.close();
    }
    //verificar VEHICULOS
    public static int verificarVehiculosGuardar(String placa_Vehiculo) {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Vehiculo VehiculosBusca = new Vehiculo(placa_Vehiculo, null, null, null, 0);
        ObjectSet resultado = BaseBD.get(VehiculosBusca);
        int coincidencias= resultado.size();
        //Cerrar BD
        BaseBD.close();
        return coincidencias;
    }
    //verificar VEHICULOS
    public static int verificarVehiculos(String placa_Vehiculo) {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Vehiculo VehiculosBusca = new Vehiculo(placa_Vehiculo, null, null, null, 0);
        ObjectSet resultado = BaseBD.get(VehiculosBusca);
        int coincidencias= resultado.size();
        //Cerrar BD
        BaseBD.close();
        return coincidencias;
    }
    public  void resetCampos(){
    txtPlaca.setText("");
    txtMarca.setText("");
    txtColor.setText("");
    txtModelo.setText("");
    YEARAño.setYear(2024);
    }
    public final void buscarVehiculo(){
        Boolean encontrado = false;
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Query vehiculo = BaseBD.query();//metodo para iniciar una consulta
        vehiculo.constrain(Vehiculo.class);//buscaremos en la clase Vehiculo
        vehiculo.descend("placa_Vehiculo").constrain(BuscarPlaca.toUpperCase()); // verificamos las coincidencias en el atributo especificado
        ObjectSet<Vehiculo> resultado=vehiculo.execute();//Ejecutamos la consulta y almacenamos en "resultado"
        // Iterar sobre los resultados para obtener los atributos
        for (Vehiculo vehi : resultado) {
            //con esto setteamos en los campos recibiendo del objeto
            txtPlaca.setText(vehi.getPlaca_Vehiculo());
            txtPlaca.setEnabled(false);//Para que el usuario no edite la placa
            txtModelo.setText(vehi.getModelo_Vehiculo());
            txtMarca.setText(vehi.getMarca_Vehiculo());
            txtColor.setText(vehi.getColor_Vehiculo());
            YEARAño.setYear(vehi.getAnioFabricacion_Vehiculo());
            encontrado = true;
            JOptionPane.showMessageDialog(this, "ENCONTRADO");
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "No se encontró Vehiculo");
        }
        
        BaseBD.close();
    }
    
    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        if (!txtMarca.getText().trim().isBlank()) {
            if (!txtModelo.getText().isBlank()) {
                Boolean valido = false;//creamos una bandera para validar datos
                if (valido = txtColor.getText().matches("^[a-zA-Z]+$")) {

                    modificarVehiculo(txtPlaca.getText().toUpperCase(), txtModelo.getText().toUpperCase(), txtMarca.getText().toUpperCase(), txtColor.getText().toUpperCase(), YEARAño.getYear());
                    JOptionPane.showMessageDialog(this, "Vehiculo Modificado");
                } else {
                    JOptionPane.showMessageDialog(this, "Ingrese un color sin numeros");
                }
                resetCampos();
                TablaVehiculos miTablaVehiculos = new TablaVehiculos();
                ShowpanelCruds(miTablaVehiculos);
            }else{JOptionPane.showMessageDialog(this, "No deje espacios en blanco");}

        }else{JOptionPane.showMessageDialog(this, "No deje espacios en blanco");}


    }//GEN-LAST:event_btnModificarMouseClicked
    private void ShowpanelCruds(JPanel p) {
        p.setSize(870, 630);// Establece el tamaño
        p.setLocation(0, 0);// Coloca el panel en la posición (0, 0) 
        VistaMenu.PanelPrincipal.removeAll();// Elimina todos los componentes del panel principal de VistaMenu
        VistaMenu.PanelPrincipal.add(p, BorderLayout.CENTER);// Añade el panel 'p' al panel principal de VistaMenu, centrado en el diseño de borde
        VistaMenu.PanelPrincipal.revalidate();// Vuelve a validar el panel principal para asegurarse de que se actualicen los cambios
        VistaMenu.PanelPrincipal.repaint();// Repinta el panel principal para reflejar los cambios visualmente
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JYearChooser YEARAño;
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnModificar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private rojeru_san.RSMTextFull txtColor;
    private rojeru_san.RSMTextFull txtMarca;
    private rojeru_san.RSMTextFull txtModelo;
    private rojeru_san.RSMTextFull txtPlaca;
    // End of variables declaration//GEN-END:variables
}
