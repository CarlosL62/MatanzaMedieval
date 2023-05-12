/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas.Personajes;

/**
 *
 * @author carlo
 */
public class Gigante extends Jugables{
    
    public Gigante(){
        super.ruta = "/imagenes/gigante.png";
        super.nombre = "Gigante";
        super.vida = 350;
        super.movimientoMax = 1;
        super.tipoMovimiento = "Tierra";
        super.movimiento = movimientoMax + " cuadros. " + tipoMovimiento;
        super.daño = 56;
        super.ataque = "Golpea con su brazo, en un rango de 3 cuadros.";
    }
}
