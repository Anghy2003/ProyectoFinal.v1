/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Cruds;

import Conexion.Conexion_db;
import Models.Cliente;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author aberr
 */
public final class pnlReporteClientesCiudades extends javax.swing.JPanel {

    public pnlReporteClientesCiudades() {
        initComponents();
        //crearGrafico();
        crearGraficoClientesPorCiudad();
        
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

        pnlPastel.setBackground(new java.awt.Color(204, 204, 204));

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
    public void crearGraficoClientesPorCiudad() {
    Map<String, Integer> clientesPorCiudad = new HashMap<>();
    ObjectContainer BaseBD = Conexion_db.ConectarBD();
    if (BaseBD == null) {
        System.out.println("Error al conectar a la base de datos");
        return;
    }

    // Obtener los clientes de la base de datos
    ObjectSet<Cliente> clientes = BaseBD.get(Cliente.class);

    for (Cliente cliente : clientes) {
    String nombreCiudad = cliente.getCiudad();
    clientesPorCiudad.put(nombreCiudad, clientesPorCiudad.computeIfAbsent(nombreCiudad, key -> 0) + 1);
}

    // Crear el gráfico
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (Map.Entry<String, Integer> entry : clientesPorCiudad.entrySet()) {
            String clave = entry.getKey() != null ? entry.getKey() : "Desconocido";
            dataset.addValue(entry.getValue(), "Clientes", clave);
        }

    JFreeChart chart = ChartFactory.createBarChart(
        "Clientes por Ciudad", // título del gráfico
        "Ciudad", // etiqueta del eje x
        "Número de Clientes", // etiqueta del eje y
        dataset, // conjunto de datos
        PlotOrientation.VERTICAL, // orientación del gráfico
        true, // mostrar leyenda
        true, // mostrar tooltips
        false // mostrar urls
    );

    // Crear una imagen del gráfico
    BufferedImage image = chart.createBufferedImage(800, 600);

    // Crear un JLabel para mostrar la imagen
    JLabel label = new JLabel(new ImageIcon(image));

    // Agregar el JLabel al panel
    pnlPastel.setLayout(new BorderLayout());
    pnlPastel.add(label, BorderLayout.CENTER);

    // Actualizar el panel
    pnlPastel.revalidate();
    pnlPastel.repaint();
}
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlPastel;
    private javax.swing.JPanel pnlReporteUsuarios;
    // End of variables declaration//GEN-END:variables
}
