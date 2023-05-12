/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas.Personajes;

/**
 *
 * @author carlo
 */
public class Gargola extends Enemigos{
    
    public Gargola(){
        super.ruta = "/imagenes/gargola.png";
        super.nombre = "Gargola";
        super.puntos = 45;
        super.vida = 150;
        super.movimientoMax = 3;
        super.tipoMovimiento = "Vuela";
        super.movimiento = movimientoMax + " cuadros. " + tipoMovimiento;
        super.daño = 100;
        super.ataque = "Lanza una bola de fuego en una línea en un rango de dos cuadros, que impacta con el primer personaje/árbol que encuentre.";
    }
}
