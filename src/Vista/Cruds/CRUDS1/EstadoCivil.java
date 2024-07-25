package Vista.Cruds.CRUDS1;

import Vista.Tables.*;
import Conexion.Conexion_db;
import Models.Estado_Civil;
import Models.Producto;
import Vista.Catálogo.CrudProductos;
import Vista.Menu.VistaMenu;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Vista.Catálogo.BuscarProductos;
import com.db4o.query.Query;


public class EstadoCivil extends javax.swing.JPanel {

    public void GuardarEstadoCivil( String estadoCivil) {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        
        String siguienteID = obtenerProximoIDCiudad(BaseBD);
        
        Estado_Civil estadoci = new Estado_Civil(   estadoCivil);
      
        estadoci.setEstadoCivil(siguienteID);
        BaseBD.close();

        if (VerificarClienteRepetidos() == 0) {

            BaseBD = Conexion_db.ConectarBD();
            BaseBD.set(estadoci);
           BaseBD.close();

            JOptionPane.showMessageDialog(this, "Estado Civil Guardado");

        } else {

            JOptionPane.showMessageDialog(this, "Ya existe el Estado Civil ");
        }
    }

    public final int VerificarClienteRepetidos() {

        ObjectContainer BaseBD = Conexion_db.ConectarBD();        
        Query estadoci = BaseBD.query();
        estadoci.constrain(Estado_Civil.class);
        estadoci.descend("cedula").constrain(txtEstadoCivil.getText());
        ObjectSet<Estado_Civil> resultado = estadoci.execute();
        
        int coincidencias = resultado.size();
        
        BaseBD.close();
        return coincidencias;
        
    }

   private String obtenerProximoIDCiudad(ObjectContainer db) {
    // Consultar el máximo ID_Vendedor almacenado en la base de datos
    ObjectSet<Estado_Civil> resultado = db.queryByExample(Estado_Civil.class);
    int maxID = 0;
    while (resultado.hasNext()) {
        Estado_Civil estci = resultado.next();
        try {
            int id = Integer.parseInt(estci.getiD_estado_Civil());
            if (id > maxID) {
                maxID = id;
            }
        } catch (NumberFormatException e) {
            // Manejar error si el ID no es un número válido
            e.printStackTrace();
        }
    }
    // El próximo ID es el máximo + 1
    return String.valueOf(maxID + 1);
}
    
    
    public EstadoCivil() {
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
        tblProductos = new javax.swing.JScrollPane();
        TablProductos1 = new javax.swing.JTable();
        txtEstadoCivil = new rojeru_san.RSMTextFull();
        btnAgregar = new rsbuttongradiente.RSButtonGradiente();
        btnEditar = new rsbuttongradiente.RSButtonGradiente();
        btnEliminar = new rsbuttongradiente.RSButtonGradiente();
        jLabel3 = new javax.swing.JLabel();
        txtIdestadoCivil = new rsbuttongradiente.RSButtonGradiente();
        jLabel4 = new javax.swing.JLabel();
        txtEstadoCivil1 = new rojeru_san.RSMTextFull();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        jLabel1.setText("Listado Estado Civil");

        tblProductos.setBackground(new java.awt.Color(255, 255, 255));
        tblProductos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblProductos.setForeground(new java.awt.Color(255, 255, 255));

        TablProductos1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        TablProductos1.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProductos.setViewportView(TablProductos1);

        txtEstadoCivil.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        txtEstadoCivil.setOpaque(false);
        txtEstadoCivil.setPlaceholder("Soltero");

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
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setText("Buscar");
        btnEditar.setColorPrimario(new java.awt.Color(0, 51, 153));
        btnEditar.setColorPrimarioHover(new java.awt.Color(51, 0, 255));
        btnEditar.setColorSecundario(new java.awt.Color(51, 153, 255));
        btnEditar.setColorSecundarioHover(new java.awt.Color(153, 204, 255));
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

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        jLabel3.setText("ID Estado Civil");

        txtIdestadoCivil.setText("Buscar");
        txtIdestadoCivil.setColorPrimario(new java.awt.Color(0, 51, 153));
        txtIdestadoCivil.setColorPrimarioHover(new java.awt.Color(51, 0, 255));
        txtIdestadoCivil.setColorSecundario(new java.awt.Color(51, 153, 255));
        txtIdestadoCivil.setColorSecundarioHover(new java.awt.Color(153, 204, 255));
        txtIdestadoCivil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdestadoCivilMouseClicked(evt);
            }
        });
        txtIdestadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdestadoCivilActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        jLabel4.setText("Estado Civil");

        txtEstadoCivil1.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        txtEstadoCivil1.setOpaque(false);
        txtEstadoCivil1.setPlaceholder("Autogenerado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tblProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdestadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEstadoCivil1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                    .addComponent(txtEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEstadoCivil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdestadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(tblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked

    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        if (!txtEstadoCivil.getText().trim().isEmpty()) {
            String codigoProducto = txtEstadoCivil.getText(); // Obtener el texto de txtBuscar
            BuscarProductos miBuscarProducto = new BuscarProductos(codigoProducto); // Crear el componente con el código de producto
            ShowpanelCruds(miBuscarProducto); // Mostrar el panel de búsqueda de producto
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un código de producto");
        }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
       
       
       
    
    }//GEN-LAST:event_btnEliminarMouseClicked


    private void TablProductosMouseClicked(java.awt.event.MouseEvent evt) {
        int selectedRow = TablProductos1.getSelectedRow();
        if (selectedRow >= 0) {
            String codigo_producto = (String) TablProductos1.getValueAt(selectedRow, 0);

        }
    }


    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        CrudProductos Prodcuto = new CrudProductos();
        ShowpanelCruds(Prodcuto);
    }//GEN-LAST:event_btnAgregarActionPerformed
    private void ShowpanelCruds(JPanel p) {
        p.setSize(870, 630);
        p.setLocation(0, 0);
        VistaMenu.PanelPrincipal.removeAll();
        VistaMenu.PanelPrincipal.add(p, BorderLayout.CENTER);
        VistaMenu.PanelPrincipal.revalidate();
        VistaMenu.PanelPrincipal.repaint();
    }
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed




    
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtIdestadoCivilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdestadoCivilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdestadoCivilMouseClicked

    private void txtIdestadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdestadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdestadoCivilActionPerformed
  

    

    private void mostrarTablaProductos() {
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Producto producto = new Producto(null, null, null, null, 0, 0, 0, null,null);
        ObjectSet <Producto>resul = BaseBD.get(producto);

        String matriz[][] = new String[resul.size()][9];

        for (int i = 0; i < resul.size(); i++) {
            Producto prod = (Producto) resul.next();

            matriz[i][0] = prod.getCodigo_Producto();
            matriz[i][1] = prod.getNombre_Producto();
            matriz[i][2] = String.valueOf(prod.getPrecio_Producto());
            matriz[i][3] = prod.getCodigo_categoria_Producto();
            matriz[i][4] = String.valueOf(prod.getNumeroProductos_Producto());
            matriz[i][5] = String.valueOf(prod.getExistenciaMaxima_Producto());
            matriz[i][6] = String.valueOf(prod.getExistenciaMinima_Producto());
            matriz[i][7] = prod.getDescripcion_Producto();
            matriz[i][8] = prod.getID_Proveedor_Producto();
            
        }

        TablProductos1.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Código Producto", "Nombre Producto", "Precio", "Código Categoría", "Número de Productos", "Existencia Máxima", "Existencia Mínima", "Descripción", "Proveedor"
                }
        ));
        BaseBD.close();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablProductos1;
    private rsbuttongradiente.RSButtonGradiente btnAgregar;
    private rsbuttongradiente.RSButtonGradiente btnEditar;
    private rsbuttongradiente.RSButtonGradiente btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane tblProductos;
    private rojeru_san.RSMTextFull txtEstadoCivil;
    private rojeru_san.RSMTextFull txtEstadoCivil1;
    private rsbuttongradiente.RSButtonGradiente txtIdestadoCivil;
    // End of variables declaration//GEN-END:variables
}
