
package Vista.Tables;
import Conexion.Conexion_db;
import Models.*;
import static Models.Proveedor.Estado.ACTIVO;
import static Models.Proveedor.Estado.INACTIVO;
import Vista.Cruds.*;
import Vista.Menu.VistaMenu;
import com.db4o.*;
import com.db4o.query.Query;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TablaProveedor extends javax.swing.JPanel {

    /**
     * Creates new form TablaProveedor
     */
    public TablaProveedor() {
        initComponents();
        mostrarDatosActivos();
        mostrarDatosInactivos();
        //mostrarDatos();
    }
    

//    private void mostrarDatos() {
//        // ESTABLECER CONEXION CON LA BASE DE DATOS
//        tblProveedores.setEnabled(true);
//        ObjectContainer BaseBD = Conexion_db.ConectarBD();
//        Proveedor ProveedorBusca = new Proveedor();
//        ObjectSet<Proveedor> resultado = BaseBD.get(ProveedorBusca);
//
//        // Crear una matriz
//        String matriz[][] = new String[resultado.size()][6];
//        int i = 0;
//        for (Proveedor miProveedor : resultado) {
//            matriz[i][0] = miProveedor.getCodigo_proveedor();
//            matriz[i][1] = miProveedor.getTipo_proveedor();
//            matriz[i][2] = miProveedor.getNombre_proveedor();
//            matriz[i][3] = miProveedor.getDireccion_proveedor();
//            matriz[i][4] = miProveedor.getCorreo_proveedor();
//            matriz[i][5] = miProveedor.getCelular_proveedor();
//            i++;
//        }
//
//        // Configurar datos en la tabla
//        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"Código", "Tipo", "Nombre", "Dirección", "Email", "Celular"}));
//        tblProveedores.setEnabled(false);
//
//        // Cerrar la conexión con la base de datos
//        BaseBD.close();
//    }
    
    private void mostrarDatosActivos() {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        tblProveedores.setEnabled(true);
        // Consulta para filtrar solo  inactivos
        Query query = BaseBD.query();
        query.constrain(Proveedor.class);
        query.descend("estado").constrain(ACTIVO);
        ObjectSet<Proveedor> resultado = query.execute();
        //Creo una matriz
        String matriz[][] = new String[resultado.size()][7];
        int i = 0;
        for (Proveedor miProv : resultado) {//iteramos en cada elemento de "resultado"
            matriz[i][0] = miProv.getCodigo_proveedor();
            matriz[i][1] = miProv.getTipo_proveedor();
            matriz[i][2] = miProv.getNombre_proveedor();
            matriz[i][3] = miProv.getDireccion_proveedor();
            matriz[i][4] = miProv.getCorreo_proveedor();
            matriz[i][5] = miProv.getCelular_proveedor();
            String Estao= String.valueOf(miProv.getEstado());
            matriz[i][6]=Estao;
            i++;
        }
        // datos configurados
        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"Código", "Tipo", "Nombre", "Dirección", "Email", "Celular","Estado"}));
        tblProveedores.setEnabled(false);{
        BaseBD.close();
    }
    }
    
    
    
    
    private void mostrarDatosInactivos() {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        tblProveedoresInactivos.setEnabled(true);
        // Consulta para filtrar solo vehículos inactivos
        Query query = BaseBD.query();
        query.constrain(Proveedor.class);
        query.descend("estado").constrain(INACTIVO);
        ObjectSet<Proveedor> resultado = query.execute();
        //Creo una matriz
        String matriz[][] = new String[resultado.size()][7];
        int i = 0;
        for (Proveedor miProv : resultado) {//iteramos en cada elemento de "resultado"
            matriz[i][0] = miProv.getCodigo_proveedor();
            matriz[i][1] = miProv.getTipo_proveedor();
            matriz[i][2] = miProv.getNombre_proveedor();
            matriz[i][3] = miProv.getDireccion_proveedor();
            matriz[i][4] = miProv.getCorreo_proveedor();
            matriz[i][5] = miProv.getCelular_proveedor();
            String Estao= String.valueOf(miProv.getEstado());
            matriz[i][6]=Estao;
            i++;
        }
        // datos configurados
        tblProveedoresInactivos.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"Código", "Tipo", "Nombre", "Dirección", "Email", "Celular","Estado"}));
        tblProveedoresInactivos.setEnabled(false);{
        BaseBD.close();
    }
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        txtBuscar = new rojeru_san.RSMTextFull();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new rsbuttongradiente.RSButtonGradiente();
        btnEliminar = new rsbuttongradiente.RSButtonGradiente();
        btnEditar = new rsbuttongradiente.RSButtonGradiente();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProveedoresInactivos = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        jLabel1.setText("Listado Proveedores");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tblProveedores.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProveedores);

        txtBuscar.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        txtBuscar.setPlaceholder("ejm: PROV12");

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel2.setText("Buscar:");

        btnAgregar.setText("Agregar");
        btnAgregar.setColorPrimario(new java.awt.Color(0, 204, 51));
        btnAgregar.setColorPrimarioHover(new java.awt.Color(0, 204, 51));
        btnAgregar.setColorSecundario(new java.awt.Color(153, 255, 153));
        btnAgregar.setColorSecundarioHover(new java.awt.Color(204, 255, 204));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
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

        btnEditar.setText("Editar");
        btnEditar.setColorPrimario(new java.awt.Color(0, 51, 153));
        btnEditar.setColorPrimarioHover(new java.awt.Color(51, 0, 255));
        btnEditar.setColorSecundario(new java.awt.Color(51, 153, 255));
        btnEditar.setColorSecundarioHover(new java.awt.Color(153, 204, 255));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        tblProveedoresInactivos.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tblProveedoresInactivos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblProveedoresInactivos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addComponent(jScrollPane2))
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6))))
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        CrudPanelProveedor agregarProv = new CrudPanelProveedor();
        ShowpanelCruds(agregarProv);
    }//GEN-LAST:event_btnAgregarMouseClicked

    public void eliminarProveedor(String codigo) {
         ObjectContainer BaseBD = Conexion_db.ConectarBD();
        ObjectSet<Proveedor> result = BaseBD.queryByExample(new Proveedor(codigo, null, null, null,null, null,null)); // Crear objeto para consultar
        if (result.hasNext()) {
            Proveedor ProveedorAEliminar = result.next();
            // Preguntar al usuario si está seguro de eliminar
            int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este Proveedor?",
                    "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                ProveedorAEliminar.desactivarProveedor();
                BaseBD.store(ProveedorAEliminar);
                System.out.println("Proveedor eliminado correctamente.");
            } else {
                System.out.println("Eliminación cancelada por el usuario.");
            }
        } else {
            System.out.println("No se encontró Proveedor con ese codigo.");
        }
        BaseBD.close();
    }
    
    
    
    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if (!txtBuscar.getText().trim().isEmpty()) {
            String eliminarProv = txtBuscar.getText().toUpperCase();
            eliminarProveedor(eliminarProv);
            JOptionPane.showMessageDialog(this, "Proveedor Eliminado");
            mostrarDatosActivos();
            mostrarDatosInactivos();

        } else {
            JOptionPane.showMessageDialog(this, "Proveedor no encontrado ");
        }
    }//GEN-LAST:event_btnEliminarMouseClicked
    

    
    
    public static int verificarProveedor(String idProv) {
        // Crear un nuevo objeto  para usar como plantilla de búsqueda
        Proveedor ProvBusca = new Proveedor(idProv, null,null,null,null,null,null);

        //abrir BD
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        // Obtener todos los objetos que coincidan con la plantilla de búsqueda
        ObjectSet resultado = BaseBD.get(ProvBusca);
        int coincidencias=resultado.size();
        //cierro BD
        BaseBD.close();
        return coincidencias;
    }
    
    
    
    
    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        if (!txtBuscar.getText().trim().isEmpty()) {
            String BuscarPlaca = txtBuscar.getText(); // Obtener el texto de txtBuscar
            BuscarPanelProveedor miBuscarPanelProveedor = new BuscarPanelProveedor(BuscarPlaca);//creo el componente llevando el valor del String
            ShowpanelCruds(miBuscarPanelProveedor);
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese un codigo");
        }
    }//GEN-LAST:event_btnEditarMouseClicked
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTable tblProveedoresInactivos;
    private rojeru_san.RSMTextFull txtBuscar;
    // End of variables declaration//GEN-END:variables
}
