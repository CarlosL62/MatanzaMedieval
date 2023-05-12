/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas.Personajes;

/**
 *
 * @author carlo
 */
public class FlorCarnivora extends Enemigos{
    
    public FlorCarnivora(){
        super.ruta = "/imagenes/florcarnivora.png";
        super.nombre = "Flor carnivora";
        super.puntos = 75;
        super.vida = 250;
        super.movimientoMax = 0;
        super.tipoMovimiento = "Tierra";
        super.movimiento = movimientoMax + " cuadros. " + tipoMovimiento;
        super.daño = 30;
        super.ataque = "Golpea con sus raíces a todos los personajes que estén en una línea en un rango de tres casillas. Si el jugador está a un cuadro de la flor, esta se lo comerá, matando así al personaje";
    }
    
}
