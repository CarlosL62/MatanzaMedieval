/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas.Personajes;

/**
 *
 * @author carlo
 */
public class Caballero extends Jugables{
    
    public Caballero(){
        super.ruta = "/imagenes/caballero.png";
        super.nombre = "Caballero";
        super.vida = 300;
        super.movimientoMax = 1;
        super.tipoMovimiento = "Tierra";
        super.movimiento = movimientoMax + " cuadros. " + tipoMovimiento;
        super.daño = 45;
        super.ataque = "Golpea con su espada a todos a su alrededor";
    }
}
