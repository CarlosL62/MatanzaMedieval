/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas.Personajes;

import Casillas.Casillas;
import Casillas.Terrenos.*;

/**
 *
 * @author carlo
 */
public class Dragon extends Jugables {
    
    public Dragon(){
        super.ruta = "/imagenes/dragon.png";
        super.nombre = "Dragon";
        super.vida = 250;
        super.movimientoMax = 3;
        super.tipoMovimiento = "Vuela";
        super.movimiento = movimientoMax + " cuadros. " + tipoMovimiento;
        super.daño = 75;
        super.ataque = "En línea y en un rango de dos cuadros";
    }
    
    //MOVIMIENTO PERSONAJE VUELA
    @Override
    protected void movimientoPersonajeValido(Casillas[][] tablero, int destinoY, int destinoX) {
        // Verificación que el movimiento sea válido, primero que este dentro del
        // tablero y que sea a una casilla válida

        if ((destinoX >= 0 && destinoY >= 0 && destinoX < tablero.length && destinoY < tablero.length)) {
            moverContador++;

            if ((tablero[destinoY][destinoX] instanceof Planicie)
                    || (tablero[destinoY][destinoX] instanceof Lava)
                    || (tablero[destinoY][destinoX] instanceof Agua)
                    || (tablero[destinoY][destinoX] instanceof Arbol)) {
                tablero[destinoY][destinoX].setEnabled(true);
            } else{
                movimientoValido = false;
            }
        } else {
            movimientoValido = false;
        }
    }
}
