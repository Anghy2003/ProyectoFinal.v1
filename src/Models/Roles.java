/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Vista.Catálogo.CatalogoProductos;
import Vista.Catálogo.CatalogoServicios;
import Vista.Catálogo.CrudPanelServicios;
import Vista.Factura.Factura;
import Vista.Tables.TablaServicios;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JPanel;

public class Roles {
   
    private String nombre;

    public Roles(String nombre) {
        this.nombre = nombre;
    }

     public Set<JPanel> getPanelesVisibles() {
        Set<JPanel> panelesVisibles = new HashSet<>();

        // Definir qué paneles son visibles para cada rol
        if (nombre.equals("Cliente")) {
            panelesVisibles.add(new CatalogoProductos());
            panelesVisibles.add(new CatalogoServicios());
            panelesVisibles.add(new TablaServicios());
            
        } else if (nombre.equals("Vendedor")) {
            panelesVisibles.add(new Factura());
        } else if (nombre.equals("Mecanico")) {
            panelesVisibles.add(new CrudPanelServicios());
        }

        return panelesVisibles;
    }
} 

