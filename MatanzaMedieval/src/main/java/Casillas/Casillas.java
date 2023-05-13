/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author carlo
 */
public class Casillas extends JButton{
    

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    private int tamaño;
    protected int coordenadaX;
    protected int coordenadaY;

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
    
    
    public Casillas(){
        
    }
    
    //protected Inventario inventario;
    
    protected String ruta = "";

    public String getRuta() {
        return ruta;
    }
    
    
    
    public Casillas[][] accionBoton(Casillas[][] casillas) throws IOException{
        //LOGICA
        return casillas;
    }
    
    public void cambiarIcono(){
        //Se obtiene la ruta de la imagen
        Icon iconoOriginal = new ImageIcon(getClass().getResource(ruta));
        ImageIcon icono = (ImageIcon) iconoOriginal;
        //Redimension de la imagen
        ImageIcon redimension = new ImageIcon(icono.getImage().getScaledInstance(this.getWidth(), this.getHeight(), java.awt.Image.SCALE_SMOOTH));
        //Settear el icono
        this.setIcon(redimension);
        //super.setEnabled(true);
        super.revalidate();
        super.repaint();
    }
}
