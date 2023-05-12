/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas.Personajes;

/**
 *
 * @author carlo
 */
public class Arquero extends Jugables{
    
    public Arquero(){
        super.ruta = "/imagenes/arquero.png";
        super.nombre = "Arquero";
        super.vida = 150;
        super.movimientoMax = 3;
        super.tipoMovimiento = "Tierra";
        super.movimiento = movimientoMax + " cuadros. " + tipoMovimiento;
        super.daño = 100;
        super.ataque = "Dispara una flecha en un rango de tres casillas";
    }
    
}
