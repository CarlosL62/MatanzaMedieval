/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas.Personajes;

/**
 *
 * @author carlo
 */
public class Cancerbero extends Enemigos{
    
    public Cancerbero(){
        super.ruta = "/imagenes/cancerbero.png";
        super.nombre = "Cancerbero";
        super.puntos = 30;
        super.vida = 400;
        super.movimientoMax = 1;
        super.tipoMovimiento = "Tierra";
        super.movimiento = movimientoMax + " cuadros. " + tipoMovimiento;
        super.daño = 45;
        super.ataque = "Incendia todo a su alrededor. Rango 1 cuadro";
    }
}
