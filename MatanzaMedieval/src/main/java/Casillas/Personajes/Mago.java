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
public class Mago extends Jugables{
    
    public Mago(){
        super.ruta = "/imagenes/mago.png";
        super.nombre = "Mago";
        super.vida = 100;
        super.movimientoMax = 2;
        super.tipoMovimiento = "Vuela";
        super.movimiento = movimientoMax + " cuadros. " + tipoMovimiento;
        super.daño = 60;
        super.ataque = "Dispara un hechizo hacía el final de una línea";
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
