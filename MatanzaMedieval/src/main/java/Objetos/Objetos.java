/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import Listas.ListaException;
import com.mycompany.matanzamedieval.Componentes;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Objetos implements Serializable {

    protected String nombreObjeto;
    protected String descripcion;
    protected int cantidadDisponible;
    protected String ruta;

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRuta() {
        return ruta;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    protected int precio;

    // Características de cada objeto
    public void caracteristicas() {
//        Consola.LimpiarPantalla();
//        System.out.println(nombreObjeto);
//        System.out.println("Precio: " + precio);
//        System.out.println("Descripción: " + descripcion);
//        System.out.println(nombreObjeto + " en inventario: " + cantidadDisponible);
    }

    //Compra de objeto
    public void comprar(Componentes componentes) {
        if (componentes.getOro() < precio) {
            JOptionPane.showMessageDialog(null, "No tienes suficiente oro", "Oro insuficiente", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Se descuenta el oro gastado
            componentes.setOro(componentes.getOro() - precio);
            //Se agrega el objeto a la lista de objetos
            cantidadDisponible++;
            //Se notifica al usuario de la compra realizada
            JOptionPane.showMessageDialog(null, "Objeto adquirido exitosamente", "Compra realizada", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void vender(Componentes componentes) {
        if (cantidadDisponible < 1) {
            JOptionPane.showMessageDialog(null, "No tienes "+nombreObjeto+" en tu inventario", "Objetos insuficientes", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Se suma el oro de la venta
            componentes.setOro(componentes.getOro()+precio);
            JOptionPane.showMessageDialog(null, "Objeto vendido exitosamente", "Venta realizada", JOptionPane.INFORMATION_MESSAGE);
            cantidadDisponible--;
        }
    }
}
