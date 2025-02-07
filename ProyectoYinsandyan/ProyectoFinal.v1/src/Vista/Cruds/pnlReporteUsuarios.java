/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Cruds;

import Conexion.Conexion_db;
import Models.Administrador;
import Models.Cliente;
import Models.Mecanico;
import Models.Vendedor;
import Vista.Menu.VistaMenu;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author aberr
 */
public class pnlReporteUsuarios extends javax.swing.JPanel {

    public pnlReporteUsuarios() {
        initComponents();
        mostrarGraficoPastel3D();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlReporteUsuarios = new javax.swing.JPanel();
        pnlPastel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    public static int numeroAdministradores() {
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        // Crear un nuevo objeto  para usar como plantilla de búsqueda
        Administrador AdminBusca = new Administrador();

        // Obtener todos los objetos que coincidan con la plantilla de búsqueda
        ObjectSet resultado = BaseBD.get(AdminBusca);

        // Imprimir el número de clientes encontrados
        int Admins = resultado.size();
        BaseBD.close();
        return Admins;
    }

    public static int numeroClientes() {
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        // Crear un nuevo objeto  para usar como plantilla de búsqueda
        Cliente CliBusca = new Cliente();

        // Obtener todos los objetos que coincidan con la plantilla de búsqueda
        ObjectSet resultado = BaseBD.get(CliBusca);

        // Imprimir el número de clientes encontrados
        int clientes = resultado.size();
        BaseBD.close();
        return clientes;
    }

    public static int numeroVendedores() {
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        // Crear un nuevo objeto  para usar como plantilla de búsqueda
        Vendedor VendedorBusca = new Vendedor();

        // Obtener todos los objetos que coincidan con la plantilla de búsqueda
        ObjectSet resultado = BaseBD.get(VendedorBusca);

        // Imprimir el número de clientes encontrados
        int vendedores = resultado.size();
        BaseBD.close();
        return vendedores;
    }

    public static int numeroMecanicos() {
        ObjectContainer BaseBD = Conexion_db.ConectarBD();
        // Crear un nuevo objeto  para usar como plantilla de búsqueda
        Mecanico MecanicoBusca = new Mecanico();

        // Obtener todos los objetos que coincidan con la plantilla de búsqueda
        ObjectSet resultado = BaseBD.get(MecanicoBusca);

        // Imprimir el número de clientes encontrados
        int mecanico = resultado.size();
        BaseBD.close();
        return mecanico;
    }

    private void mostrarGraficoPastel3D() {
    // Crear un conjunto de datos para el gráfico
    DefaultPieDataset datos = new DefaultPieDataset();
    datos.setValue("Admins", numeroAdministradores());
    datos.setValue("Vendedores", numeroVendedores());
    datos.setValue("Clientes", numeroClientes());
    datos.setValue("Mecanicos", numeroMecanicos());

    // Crear un gráfico de pastel 3D
    JFreeChart grafico_pastel_3d = ChartFactory.createPieChart3D(
            "Proporción usuarios", // título
            datos, // conjunto de datos
            true, // mostrar leyenda
            true, // mostrar tooltips
            false // mostrar urls
    );

    // Configurar la propiedad labelGenerator para mostrar porcentajes
    PiePlot3D plot = (PiePlot3D) grafico_pastel_3d.getPlot();
    plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0} ({2})"));//configura las etiquetas de porcentajes
    plot.setBackgroundPaint(Color.WHITE);//color blando al grafico
    plot.setOutlineVisible(false);//quitar bordes

    // Crear un ChartPanel para mostrar el gráfico
    ChartPanel panelGrafico = new ChartPanel(grafico_pastel_3d);
    panelGrafico.setVisible(true);
    panelGrafico.setPreferredSize(new Dimension(300, 100)); // ajusta el tamaño del panel

    // Agregar el panelGrafico al panel
    pnlPastel.setLayout(new BorderLayout());
    pnlPastel.add(panelGrafico, BorderLayout.CENTER);
    pnlPastel.revalidate();
    pnlPastel.repaint();

    pnlReporteUsuarios.add(pnlPastel);
    pnlReporteUsuarios.setVisible(true);
    pnlPastel.setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlPastel;
    private javax.swing.JPanel pnlReporteUsuarios;
    // End of variables declaration//GEN-END:variables
}
