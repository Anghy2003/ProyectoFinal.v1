package Vista.Tables;

import Conexion.Conexion_db;
import Models.*;
import Vista.Cruds.CrudPanelColores;
import Vista.Menu.VistaMenu;
import com.db4o.*;
import com.db4o.query.Query;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;

public class TablaColores extends javax.swing.JPanel {

    /**
     * Creates new form TablaVehiculos
     */
    public TablaColores() {
        initComponents();
        mostrarDatosColor();
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
        lblMarcas = new javax.swing.JLabel();
        scrlpTablaVehi1 = new javax.swing.JScrollPane();
        tblColoresLista = new javax.swing.JTable();
        txtBuscar = new rojeru_san.RSMTextFull();
        lblBuscar = new javax.swing.JLabel();
        btnAgregar = new rsbuttongradiente.RSButtonGradiente();
        btnBuscaColor = new rsbuttongradiente.RSButtonGradiente();

        setLayout(new java.awt.BorderLayout());

        pnlListado.setBackground(new java.awt.Color(255, 255, 255));
        pnlListado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMarcas.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        lblMarcas.setText("Listado Colores:");
        pnlListado.add(lblMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 36, -1, -1));

        scrlpTablaVehi1.setBackground(new java.awt.Color(255, 255, 255));
        scrlpTablaVehi1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scrlpTablaVehi1.setForeground(new java.awt.Color(255, 255, 255));

        tblColoresLista.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tblColoresLista.setModel(new javax.swing.table.DefaultTableModel(
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
        scrlpTablaVehi1.setViewportView(tblColoresLista);

        pnlListado.add(scrlpTablaVehi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 799, 360));

        txtBuscar.setFont(new java.awt.Font("Roboto Bold", 2, 14)); // NOI18N
        txtBuscar.setPlaceholder("ejm. Col1");
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        pnlListado.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 81, -1, 38));

        lblBuscar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblBuscar.setText("Buscar color:");
        pnlListado.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 97, -1, -1));

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
        pnlListado.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 102, -1));

        btnBuscaColor.setText("Buscar");
        btnBuscaColor.setToolTipText("Previamente ingrese una placa");
        btnBuscaColor.setColorPrimario(new java.awt.Color(0, 51, 153));
        btnBuscaColor.setColorPrimarioHover(new java.awt.Color(51, 0, 255));
        btnBuscaColor.setColorSecundario(new java.awt.Color(51, 153, 255));
        btnBuscaColor.setColorSecundarioHover(new java.awt.Color(153, 204, 255));
        btnBuscaColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscaColorMouseClicked(evt);
            }
        });
        btnBuscaColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaColorActionPerformed(evt);
            }
        });
        pnlListado.add(btnBuscaColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 102, -1));

        add(pnlListado, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        
    }//GEN-LAST:event_btnAgregarMouseClicked
    

    private void btnBuscaColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscaColorMouseClicked
        
    }//GEN-LAST:event_btnBuscaColorMouseClicked

    private void btnBuscaColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaColorActionPerformed
        
    }//GEN-LAST:event_btnBuscaColorActionPerformed

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtBuscar.getText().toUpperCase().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un color en el campo de colores");
        }else{
            Boolean encontrado = false;
            if (verificarColorRepetido()!= 0) {
                JOptionPane.showMessageDialog(null, "Color ya registrado");
                encontrado = true;
                txtBuscar.setText("");
                            }
            if (!txtBuscar.getText().trim().isBlank()) {//procedemos siempre que no este en blanco
                if (!encontrado) {
                    //enviamos el codigo de este frame al de registro de colores
                    String CodigoColor=txtBuscar.getText().toUpperCase().trim();
                    CrudPanelColores miColor= new CrudPanelColores(CodigoColor);
                    ShowpanelCruds(miColor);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No deje Marca en blanco");
            }
            txtBuscar.setText("");}
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char x= evt.getKeyChar();
        if (Character.isLowerCase(x)) {
            evt.setKeyChar(Character.toUpperCase(x));
        }
    }//GEN-LAST:event_txtBuscarKeyTyped
 
    
       
    
    private void ShowpanelCruds(JPanel p) {
    p.setSize(870, 630);
    p.setLocation(0, 0);
    VistaMenu.PanelPrincipal.removeAll();
    VistaMenu.PanelPrincipal.add(p, BorderLayout.CENTER);
    VistaMenu.PanelPrincipal.revalidate();
    VistaMenu.PanelPrincipal.repaint();
}
    public final int verificarColorRepetido() {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        Query marca = BaseBD.query();//metodo para iniciar una consulta
        marca.constrain(Color.class);//buscaremos en la clase Vehiculo
        marca.descend("codigoColor").constrain(txtBuscar.getText().toUpperCase()); // verificamos las coincidencias en el atributo especificado
        ObjectSet<MarcaVehiculo> resultado = marca.execute();//Ejecutamos la consulta y almacenamos en "resultado"
        int coincidencias = resultado.size();
        BaseBD.close();
        return coincidencias;
    }
    private void mostrarDatosColor() {
        // ESTABLECER CONEXION CON LA BASE DE DATOS
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        tblColoresLista.setEnabled(true);
        // Consulta 
        Query query = BaseBD.query();
        query.constrain(Color.class);
        ObjectSet<Color> resultado = query.execute();
        //Creo una matriz
        String matriz[][] = new String[resultado.size()][3];
        int i = 0;
        for (Color miColor : resultado) {//iteramos en cada elemento de "resultado"
            matriz[i][0] = miColor.getCodigoColor();
            matriz[i][1] = miColor.getNomnbre_color();
            String tipo= (String)miColor.getTipoColor();
            matriz[i][2] = tipo;
            i++;
        }
        // datos configurados
        tblColoresLista.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"CÓDIGO:", "COLOR","TIPO"}));

        // Centrar contenido de celdas
        DefaultTableCellRenderer centrar = new DefaultTableCellRenderer();
        centrar.setHorizontalAlignment(JLabel.CENTER);
        tblColoresLista.getColumnModel().getColumn(0).setCellRenderer(centrar);
        tblColoresLista.getColumnModel().getColumn(1).setCellRenderer(centrar);
        tblColoresLista.getColumnModel().getColumn(2).setCellRenderer(centrar);

        tblColoresLista.setEnabled(false);
        BaseBD.close();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttongradiente.RSButtonGradiente btnAgregar;
    private rsbuttongradiente.RSButtonGradiente btnBuscaColor;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblMarcas;
    private javax.swing.JPanel pnlListado;
    private javax.swing.JScrollPane scrlpTablaVehi1;
    private javax.swing.JTable tblColoresLista;
    private rojeru_san.RSMTextFull txtBuscar;
    // End of variables declaration//GEN-END:variables
}
