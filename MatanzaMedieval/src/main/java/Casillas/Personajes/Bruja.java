/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas.Personajes;

/**
 *
 * @author carlo
 */
public class Bruja extends Enemigos{
    
    public Bruja(){
        super.ruta = "/imagenes/bruja.png";
        super.nombre = "Bruja";
        super.puntos = 100;
        super.vida = 150;
        super.movimientoMax = 100;
        super.tipoMovimiento = "Vuela";
        super.movimiento = movimientoMax + " cuadros. " + tipoMovimiento;
        super.daño = 45;
        super.ataque = "Lanza un hechizo en toda una línea, que impacta con el primer personaje o árbol que encuentre. ";
    }
}
