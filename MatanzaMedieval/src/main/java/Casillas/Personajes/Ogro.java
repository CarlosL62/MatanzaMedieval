/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas.Personajes;

/**
 *
 * @author carlo
 */
public class Ogro extends Enemigos{
    
    public Ogro(){
        super.ruta = "/imagenes/ogro.png";
        super.nombre = "Ogro";
        super.puntos = 25;
        super.vida = 300;
        super.movimientoMax = 1;
        super.tipoMovimiento = "Tierra";
        super.movimiento = movimientoMax + " cuadros. " + tipoMovimiento;
        super.daño = 50;
        super.ataque = "golpea con su bastón a un punto en un rango de un cuadro a su alrededor.";
    }
}
