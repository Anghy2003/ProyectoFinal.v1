package Vista.Tables;

import Conexion.Conexion_db;
import Vista.Cruds.CrudPanelVehiculo;
import Models.*;
import Models.Vehiculo.Estado;
import static Models.Vehiculo.Estado.ACTIVO;
import static Models.Vehiculo.Estado.INACTIVO;
import Vista.Cruds.BuscarPanelVehiculo;
import Vista.Cruds.pnlReporteVehiculos;
import Vista.Menu.VistaMenu;
import com.db4o.*;
import com.db4o.query.Query;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TablaVehiculos extends javax.swing.JPanel {

    /**
     * Creates new form TablaVehiculos
     */
    public TablaVehiculos() {
        initComponents();
        mostrarDatosActivos();
        mostrarDatosInactivo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlListado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scrlpTablaVehi1 = new javax.swing.JScrollPane();
        tblVehiculo = new javax.swing.JTable();
        txtBuscar = new rojeru_san.RSMTextFull();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new rsbuttongradiente.RSButtonGradiente();
        btnEliminar = new rsbuttongradiente.RSButtonGradiente();
        btnEditar = new rsbuttongradiente.RSButtonGradiente();
        scrlpTablaVehi2 = new javax.swing.JScrollPane();
        tblVehiculoInactivo = new javax.swing.JTable();
        lbl_Inactivos = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        pnlListado.setBackground(new java.awt.Color(255, 255, 255));
        pnlListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlListadoMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        jLabel1.setText("Listado Vehículo");

        scrlpTablaVehi1.setBackground(new java.awt.Color(255, 255, 255));
        scrlpTablaVehi1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scrlpTablaVehi1.setForeground(new java.awt.Color(255, 255, 255));

        tblVehiculo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tblVehiculo.setModel(new javax.swing.table.DefaultTableModel(
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
        tblVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVehiculoMouseClicked(evt);
            }
        });
        scrlpTablaVehi1.setViewportView(tblVehiculo);

        txtBuscar.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        txtBuscar.setPlaceholder("ejm. ABG-0023");
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel2.setText("Buscar");

        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("Ingresar un nuevo vehiculo");
        btnAgregar.setColorPrimario(new java.awt.Color(0, 204, 51));
        btnAgregar.setColorPrimarioHover(new java.awt.Color(0, 204, 51));
        btnAgregar.setColorSecundario(new java.awt.Color(153, 255, 153));
        btnAgregar.setColorSecundarioHover(new java.awt.Color(204, 255, 204));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setColorPrimario(new java.awt.Color(204, 0, 0));
        btnEliminar.setColorPrimarioHover(new java.awt.Color(255, 51, 51));
        btnEliminar.setColorSecundario(new java.awt.Color(255, 153, 153));
        btnEliminar.setColorSecundarioHover(new java.awt.Color(255, 204, 204));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setToolTipText("Previamente ingrese una placa");
        btnEditar.setColorPrimario(new java.awt.Color(0, 51, 153));
        btnEditar.setColorPrimarioHover(new java.awt.Color(51, 0, 255));
        btnEditar.setColorSecundario(new java.awt.Color(51, 153, 255));
        btnEditar.setColorSecundarioHover(new java.awt.Color(153, 204, 255));
        btnEditar.setLabel("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        scrlpTablaVehi2.setBackground(new java.awt.Color(255, 255, 255));
        scrlpTablaVehi2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scrlpTablaVehi2.setForeground(new java.awt.Color(255, 255, 255));

        tblVehiculoInactivo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tblVehiculoInactivo.setModel(new javax.swing.table.DefaultTableModel(
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
        tblVehiculoInactivo.setEnabled(false);
        scrlpTablaVehi2.setViewportView(tblVehiculoInactivo);

        lbl_Inactivos.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lbl_Inactivos.setText("Vehiculos Eliminados:");

        javax.swing.GroupLayout pnlListadoLayout = new javax.swing.GroupLayout(pnlListado);
        pnlListado.setLayout(pnlListadoLayout);
        pnlListadoLayout.setHorizontalGroup(
            pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListadoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListadoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(scrlpTablaVehi2, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_Inactivos))
                .addGap(0, 44, Short.MAX_VALUE))
            .addGroup(pnlListadoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListadoLayout.createSequentialGroup()
                        .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlListadoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(39, 39, 39)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addComponent(scrlpTablaVehi1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlListadoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlListadoLayout.setVerticalGroup(
            pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListadoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlListadoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlListadoLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlListadoLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jLabel2))))
                .addGap(53, 53, 53)
                .addComponent(scrlpTablaVehi1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Inactivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrlpTablaVehi2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        add(pnlListado, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        if (verificarClientes() != 0) {
            CrudPanelVehiculo agregarVehi = new CrudPanelVehiculo();
            ShowpanelCruds(agregarVehi);
        } else {
            JOptionPane.showMessageDialog(this, "No se puede crear vehiculo sin Clientes");
        }

    }//GEN-LAST:event_btnAgregarMouseClicked
    public static int verificarClientes() {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Query query = BaseBD.query();
        query.constrain(Cliente.class);
        ObjectSet resultado = query.execute();
        int numClientes = resultado.size();
        //Cerrar BD
        BaseBD.close();
        return numClientes;
    }

    public void eliminarVehiculo(String placa) {
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        ObjectSet<Vehiculo> result = BaseBD.queryByExample(new Vehiculo(placa, null, null, null, 0, null, null)); // Crear objeto para consultar
        if (result.hasNext()) {
            Vehiculo VehiculoAEliminar = result.next();
            // Preguntar al usuario si está seguro de eliminar
            int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este Vehiculo?",
                    "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                VehiculoAEliminar.desactivarVehiculo();
                BaseBD.store(VehiculoAEliminar);
                System.out.println("Vehiculo eliminado correctamente.");
            } else {
                System.out.println("Vehiculo cancelada por el usuario.");
            }
        } else {
            System.out.println("No se encontró Vehiculo con esa placa.");
        }
        BaseBD.close();
    }

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if (!txtBuscar.getText().trim().isEmpty()) {
            String eliminarVehi = txtBuscar.getText().toUpperCase();
            eliminarVehiculo(eliminarVehi);
            JOptionPane.showMessageDialog(this, "Vehiculo Eliminado");
            mostrarDatosActivos();
            mostrarDatosInactivo();

        } else {
            JOptionPane.showMessageDialog(this, "Vehiculo no encontrado ");
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (!txtBuscar.getText().trim().isEmpty()) {
            String BuscarPlaca = txtBuscar.getText(); // Obtener el texto de txtBuscar
            BuscarPanelVehiculo miBuscarPanelVehiculo = new BuscarPanelVehiculo(BuscarPlaca);//creo el componente llevando el valor del String
            ShowpanelCruds(miBuscarPanelVehiculo);
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese la placa del vehiculo  ");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char x= evt.getKeyChar();
        if (Character.isLowerCase(x)) {
            evt.setKeyChar(Character.toUpperCase(x));
        }else if (txtBuscar.getText().length() >= 10) {
        evt.consume();
    }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void tblVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVehiculoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblVehiculoMouseClicked

    private void pnlListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlListadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlListadoMouseClicked

    private void mostrarDatosInactivo() {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        tblVehiculoInactivo.setEnabled(true);

        // Consulta para filtrar solo vehículos inactivos
        Query query = BaseBD.query();
        query.constrain(Vehiculo.class);
        query.descend("estado").constrain(INACTIVO);
        ObjectSet<Vehiculo> resultado = query.execute();

        String matriz[][] = new String[resultado.size()][7];
        int i = 0;
        for (Vehiculo miVehi : resultado) {//iteramos en cada elemento de "resultado"
            matriz[i][0] = miVehi.getPlaca_Vehiculo();
            matriz[i][1] = miVehi.getModelo_Vehiculo();
            matriz[i][2] = miVehi.getMarca_Vehiculo();
            matriz[i][3] = miVehi.getColor_Vehiculo();
            String Año = String.valueOf(miVehi.getAnioFabricacion_Vehiculo());//Convierto el año a String para la tabla
            matriz[i][4] = Año;
            matriz[i][5] = miVehi.getId_Cliente();
            String estao = String.valueOf(miVehi.getEstado());
            matriz[i][6] = estao;
            i++;
        }
        // datos configurados
        tblVehiculoInactivo.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"Placa", "Modelo ", "Marca", "Color", "Año Fabricacion", "Propietario", "Estado"}));
        tblVehiculoInactivo.setEnabled(false);
        BaseBD.close();
    }

    private void mostrarDatosActivos() {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        tblVehiculo.setEnabled(true);
        // Consulta para filtrar solo vehículos inactivos
        Query query = BaseBD.query();
        query.constrain(Vehiculo.class);
        query.descend("estado").constrain(ACTIVO);
        ObjectSet<Vehiculo> resultado = query.execute();
        //Creo una matriz
        String matriz[][] = new String[resultado.size()][7];
        int i = 0;
        for (Vehiculo miVehi : resultado) {//iteramos en cada elemento de "resultado"
            matriz[i][0] = miVehi.getPlaca_Vehiculo();
            matriz[i][1] = miVehi.getModelo_Vehiculo();
            matriz[i][2] = miVehi.getMarca_Vehiculo();
            matriz[i][3] = miVehi.getColor_Vehiculo();
            String Año = String.valueOf(miVehi.getAnioFabricacion_Vehiculo());//Convierto el año a String para la tabla
            matriz[i][4] = Año;
            matriz[i][5] = miVehi.getId_Cliente();
            String Estao = String.valueOf(miVehi.getEstado());
            matriz[i][6] = Estao;
            i++;
        }
        // datos configurados
        tblVehiculo.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"Placa", "Modelo ", "Marca", "Color", "Año Fabricacion", "Propietario", "Estado"}));
        tblVehiculo.setEnabled(false);
        {
            BaseBD.close();
        }
    }

    public static ObjectSet verificarVehiculosActivos() {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Vehiculo VehiculosBusca = new Vehiculo(null, null, null, null, 0, null, Estado.ACTIVO);
        ObjectSet resultado = BaseBD.get(VehiculosBusca);
        //Cerrar BD
        BaseBD.close();
        return resultado;
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
    private rsbuttongradiente.RSButtonGradiente btnAgregar;
    private rsbuttongradiente.RSButtonGradiente btnEditar;
    private rsbuttongradiente.RSButtonGradiente btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_Inactivos;
    private javax.swing.JPanel pnlListado;
    private javax.swing.JScrollPane scrlpTablaVehi1;
    private javax.swing.JScrollPane scrlpTablaVehi2;
    private javax.swing.JTable tblVehiculo;
    private javax.swing.JTable tblVehiculoInactivo;
    private rojeru_san.RSMTextFull txtBuscar;
    // End of variables declaration//GEN-END:variables
}
