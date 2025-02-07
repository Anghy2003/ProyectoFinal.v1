/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Cruds;

import Conexion.Conexion_db;
import Models.Cita;
import Models.DetalleCita;
import Models.EncabezadoCita;
import Models.Servicios;
import Vista.Home.Home;
import com.db4o.*;
import com.db4o.query.Query;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import utils.Global;

/**
 *
 * @author aberr
 */
public final class PanelCitasPendientesMecanico extends javax.swing.JPanel {

    /**
     * Creates new form PanelCitasPendientesMecanico
     */
    public PanelCitasPendientesMecanico() {
        initComponents();
        verificarMecanico();
        if (!esMecanico) {
            inicializarTablaCitas(tblCitas);
        }else{btnBuscarMecanico.setVisible(false);}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCitas = new javax.swing.JTable();
        txtCedulaa = new rojeru_san.RSMTextFull();
        btnBuscarMecanico = new rsbuttongradiente.RSButtonGradiente();
        lblCedula = new javax.swing.JLabel();
        btnRealizado = new rsbuttongradiente.RSButtonGradiente();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(890, 650));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("SERVICIOS PENDIENTES:");

        tblCitas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblCitas);

        txtCedulaa.setForeground(new java.awt.Color(0, 53, 79));
        txtCedulaa.setColorTransparente(true);
        txtCedulaa.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtCedulaa.setPlaceholder("Ejm: 0909090909");
        txtCedulaa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaaKeyTyped(evt);
            }
        });

        btnBuscarMecanico.setText("Buscar");
        btnBuscarMecanico.setToolTipText("Previamente ingrese la marca");
        btnBuscarMecanico.setColorPrimario(new java.awt.Color(0, 51, 153));
        btnBuscarMecanico.setColorPrimarioHover(new java.awt.Color(51, 0, 255));
        btnBuscarMecanico.setColorSecundario(new java.awt.Color(51, 153, 255));
        btnBuscarMecanico.setColorSecundarioHover(new java.awt.Color(153, 204, 255));
        btnBuscarMecanico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMecanicoMouseClicked(evt);
            }
        });
        btnBuscarMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMecanicoActionPerformed(evt);
            }
        });

        lblCedula.setFont(new java.awt.Font("Roboto Medium", 0, 21)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(0, 53, 79));
        lblCedula.setText("Cédula:");

        btnRealizado.setText("Realizado");
        btnRealizado.setToolTipText("Previamente seleccione la cita");
        btnRealizado.setColorPrimario(new java.awt.Color(0, 153, 0));
        btnRealizado.setColorPrimarioHover(new java.awt.Color(0, 51, 51));
        btnRealizado.setColorSecundario(new java.awt.Color(0, 204, 204));
        btnRealizado.setColorSecundarioHover(new java.awt.Color(153, 204, 255));
        btnRealizado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRealizadoMouseClicked(evt);
            }
        });
        btnRealizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedulaa, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarMecanico, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCedula)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCedulaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarMecanico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaaKeyTyped
        char x = evt.getKeyChar();
        if (Character.isLowerCase(x)) {
            evt.setKeyChar(Character.toUpperCase(x));
        } else if (txtCedulaa.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaaKeyTyped

    private void btnBuscarMecanicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMecanicoMouseClicked
        if (txtCedulaa.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la cedula del mecanico");
        }else{buscarCitasPorMecanico();}
    }//GEN-LAST:event_btnBuscarMecanicoMouseClicked

    private void btnBuscarMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMecanicoActionPerformed
    if (txtCedulaa.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la cedula del mecanico");
        }else{buscarCitasPorMecanico();}
    }//GEN-LAST:event_btnBuscarMecanicoActionPerformed

    private void btnRealizadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRealizadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRealizadoMouseClicked

    private void btnRealizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizadoActionPerformed
        desactivarCitaSeleccionada();
        buscarCitasPorMecanico();
        txtCedulaa.setEnabled(true);
    }//GEN-LAST:event_btnRealizadoActionPerformed

    public void buscarCitasPorMecanico() {

        // Conectar a la base de datos
        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        // Crear una consulta para buscar encabezados de citas con el id del mecanico y estado ACTIVO
        Query query = BaseBD.query();
        query.constrain(EncabezadoCita.class);
        query.descend("cedulaMecanico_encabezadoCita").constrain(txtCedulaa.getText().trim());
        query.descend("estado").constrain(EncabezadoCita.Estado.ACTIVO);

        // Ejecutar la consulta y obtener los resultados
        ObjectSet<EncabezadoCita> resultadosEncabezado = query.execute();

        // Crear un modelo de tabla para mostrar los resultados
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código Encabezado");
        modelo.addColumn("Fecha Encabezado");
        modelo.addColumn("Cédula Cliente");
        modelo.addColumn("Placa Vehículo");
        modelo.addColumn("Estado");
        modelo.addColumn("Detalle Cita");

        // Agregar los resultados a la tabla
        for (EncabezadoCita encabezado : resultadosEncabezado) {
            Object[] fila = new Object[]{
                encabezado.getCodigo_encabezadoCita(),
                encabezado.getFecha_encabezadoCita(),
                encabezado.getCedulaCliente_encabezadoCita(),
                encabezado.getPlacaVehiculo_encabezadoCita(),
                encabezado.getEstado(),
                
                getDetallesCita(encabezado.getCodigo_encabezadoCita(), BaseBD)
            };
            modelo.addRow(fila);
        }

        // Asignar el modelo a la tabla
        tblCitas.setModel(modelo);

        // Cerrar la base de datos
        BaseBD.close();
        tblCitas.setDefaultEditor(Object.class, null); // Deshabilita la edición
        personalizarEncabezadoTabla(tblCitas);
    }

//    private String getDetallesCita(String codigoEncabezado, ObjectContainer BaseBD) {
//        Query query = BaseBD.query();
//        query.constrain(DetalleCita.class);
//        query.descend("codigo_encabezadoCita").constrain(codigoEncabezado);
//
//        ObjectSet<DetalleCita> resultadosDetalle = query.execute();
//
//        StringBuilder detalles = new StringBuilder();
//        for (DetalleCita detalle : resultadosDetalle) {
//            detalles.append("Codigo Servicio: ").append(detalle.getCodigoServicio_detallecita())
//                    .append(", Precio Servicio: ").append(detalle.getPrecioServicio_detallecita()).append("\n");
//        }
//
//        return detalles.toString();
//    }
    private String getDetallesCita(String codigoEncabezado, ObjectContainer BaseBD) {
    Query query = BaseBD.query();
    query.constrain(DetalleCita.class);
    query.descend("codigo_encabezadoCita").constrain(codigoEncabezado);

    ObjectSet<DetalleCita> resultadosDetalle = query.execute();

    StringBuilder detalles = new StringBuilder();
    for (DetalleCita detalle : resultadosDetalle) {
        String codigoServicio = detalle.getCodigoServicio_detallecita();

        Query queryServicio = BaseBD.query();
        queryServicio.constrain(Servicios.class);
        queryServicio.descend("codigo_Servicio").constrain(codigoServicio);

        ObjectSet<Servicios> resultadosServicio = queryServicio.execute();
        if (resultadosServicio.hasNext()) {
            Servicios servicio = resultadosServicio.next();
            detalles.append("").append(servicio.getNombre_Servicio())
                    .append(", Precio: ").append(detalle.getPrecioServicio_detallecita()).append("\n");
        }
    }

    return detalles.toString();
}

    public void desactivarCitaSeleccionada() {
        // Obtener el índice de la fila seleccionada
        int filaSeleccionada = tblCitas.getSelectedRow();

        // Verificar si se ha seleccionado una fila
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione la cita que desea marcar como realizada");
            return;
        }

        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tblCitas.getModel();

        // Obtener el código de la cita seleccionada
        String codigoCita = (String) modelo.getValueAt(filaSeleccionada, 0);

        // Conectar a la base de datos
        ObjectContainer BaseBD = Conexion_db.ConectarBD();

        try {
            // Crear una consulta para buscar la cita seleccionada
            Query query = BaseBD.query();
            query.constrain(EncabezadoCita.class);
            query.descend("codigo_encabezadoCita").constrain(codigoCita);

            // Ejecutar la consulta y obtener el resultado
            ObjectSet<EncabezadoCita> resultado = query.execute();

            // Verificar si se ha encontrado la cita
            if (resultado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se ha encontrado la cita seleccionada");
                return;
            }

            // Obtener la cita seleccionada
            EncabezadoCita citaSeleccionada = resultado.get(0);
            EncabezadoCita citaAnterior = resultado.get(0);

            // Cambiar el estado de la cita a INACTIVO
            citaSeleccionada.desactivarEncabezadoCita();
            
            // Actualizar la cita en la base de datos
            BaseBD.delete(citaAnterior);
            BaseBD.store(citaSeleccionada);

            // Mostrar un mensaje de confirmación
            JOptionPane.showMessageDialog(null, "La sido realizada con éxito!");
        } finally {
            // Cerrar la base de datos
            BaseBD.close();
        }
    }

    public void personalizarEncabezadoTabla(JTable table) {
        // Obtener el encabezado de la tabla
        JTableHeader header = table.getTableHeader();

        // Crear un TableCellRenderer personalizado
        class HeaderRenderer extends JLabel implements TableCellRenderer {

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                // Establecer el texto del encabezado
                setText(value.toString());

                // Establecer el fondo transparente
                setBackground(new Color(0, 0, 0, 0)); // Color transparente

                // Establecer el borde vacío para eliminar las líneas
                setBorder(BorderFactory.createEmptyBorder());

                // Devolver el componente renderizador personalizado
                return this;
            }
        }

        // Establecer el TableCellRenderer personalizado para el encabezado
        header.setDefaultRenderer(new HeaderRenderer());
    }

    public void inicializarTablaCitas(JTable table) {
        // Crear un modelo de tabla vacío
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código Cita");
        modelo.addColumn("Fecha Cita");
        modelo.addColumn("Cédula Cliente");
        modelo.addColumn("Código Servicio");
        modelo.addColumn("Hora");
        modelo.addColumn("Precio Total");
        modelo.addColumn("Duración Servicio");
        modelo.addColumn("Placa Vehículo");
        modelo.addColumn("Estado");

        // Asignar el modelo a la tabla
        table.setModel(modelo);

        // Personalizar el encabezado de la tabla
        JTableHeader header = table.getTableHeader();
        header.setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                c.setBackground(new Color(0, 0, 0, 0)); // Color transparente
                ((JComponent) c).setBorder(BorderFactory.createEmptyBorder());
                return c;
            }
        });
        personalizarEncabezadoTabla(tblCitas);
    }
    private Boolean esMecanico=false;
    public void verificarMecanico() {
        esMecanico=false;
        if (Global.rolUsuario.equals("MECANICO")) {
            System.out.println("SI ES MECANICO");
            txtCedulaa.setText(Home.CedulaUsuario);//setteo los valores de la cedula en el textfield
            txtCedulaa.setEnabled(false);//deshabilito el textfield
            txtCedulaa.setDisabledTextColor(Color.black);//guardo el color del textfield en negro 
            inicializarTablaCitas(tblCitas);//refresco la tabla
            buscarCitasPorMecanico();//mando a buscar con la cedula
            esMecanico=true;
        }else{System.out.println("NO ES MECANICO");}
    }
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttongradiente.RSButtonGradiente btnBuscarMecanico;
    private rsbuttongradiente.RSButtonGradiente btnRealizado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JTable tblCitas;
    private rojeru_san.RSMTextFull txtCedulaa;
    // End of variables declaration//GEN-END:variables
}
