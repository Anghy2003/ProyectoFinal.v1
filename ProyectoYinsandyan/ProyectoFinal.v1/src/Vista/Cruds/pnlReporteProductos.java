/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Cruds;

import Conexion.Conexion_db;
import Models.DetalleFactura_1;
import Models.Producto;
import Vista.Menu.VistaMenu;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author aberr
 */
public final class pnlReporteProductos extends javax.swing.JPanel {

    public pnlReporteProductos() {
        initComponents();
        generarGraficoDeBarras3D(pnlPastel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnlReporteUsuarios = new javax.swing.JPanel();
        pnlPastel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        pnlReporteUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        pnlReporteUsuarios.setLayout(new java.awt.BorderLayout());

        pnlPastel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlPastelLayout = new javax.swing.GroupLayout(pnlPastel);
        pnlPastel.setLayout(pnlPastelLayout);
        pnlPastelLayout.setHorizontalGroup(
            pnlPastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        pnlPastelLayout.setVerticalGroup(
            pnlPastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        pnlReporteUsuarios.add(pnlPastel, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(pnlReporteUsuarios);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 820, 520));
    }// </editor-fold>//GEN-END:initComponents


    public void generarGraficoDeBarras3D(JPanel pnlPastel) {
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        ObjectSet<DetalleFactura_1> detalles = BaseBD.query(DetalleFactura_1.class);
        if (!detalles.isEmpty()) {
            for (DetalleFactura_1 detalle : detalles) {
                Query query = BaseBD.query();
                query.constrain(Producto.class);
                query.descend("codigo_Producto").constrain(detalle.getCodigoProducto_detalleFactura());
                ObjectSet<Producto> productos = query.execute();
                if (!productos.isEmpty()) {
                    Producto producto = productos.get(0);
                    dataset.addValue(detalle.getCantidadProdcutos_detalleFactura(), "Ventas", producto.getNombre_Producto());
                }
            }
        }

        System.out.println("Dataset size: " + dataset.getRowCount()); // Verificar tamaño del dataset

        JFreeChart chart = ChartFactory.createBarChart3D(
                "Productos mas Vendidos",
                "Producto",
                "Cantidad",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        CategoryPlot plot = chart.getCategoryPlot();
        BarRenderer3D renderer = (BarRenderer3D) plot.getRenderer();

        // Personalizar eje de categorías (x-axis)
        CategoryAxis axis = plot.getDomainAxis();
        axis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 4.0));
        axis.setTickLabelFont(new Font("Arial", Font.BOLD, 12)); // Opcional: cambiar fuente y tamaño de la etiqueta

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        pnlPastel.removeAll();
        pnlPastel.setLayout(new BorderLayout());
        pnlPastel.add(chartPanel, BorderLayout.CENTER);
        pnlPastel.setPreferredSize(new java.awt.Dimension(800, 600));
        pnlPastel.setVisible(true);

        pnlPastel.revalidate();
        pnlPastel.repaint();

        System.out.println("Chart added to panel: " + pnlPastel.getComponentCount()); // Verificar si el gráfico se agrega al panel

        BaseBD.close();
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlPastel;
    private javax.swing.JPanel pnlReporteUsuarios;
    // End of variables declaration//GEN-END:variables
}
