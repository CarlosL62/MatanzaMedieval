/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas.Personajes;

import Casillas.Casillas;
import Casillas.Terrenos.Arbol;
import Casillas.Terrenos.Lava;
import Casillas.Terrenos.Planicie;
import Partida.ControladorPartida;
import com.mycompany.matanzamedieval.Componentes;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Jugables extends Personajes {

    protected String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    // Compra de personaje
    public void comprar(Componentes componentes) {
        if (componentes.getOro() < 200) {
            JOptionPane.showMessageDialog(this, "No tienes suficiente oro", "Oro insuficiente", JOptionPane.INFORMATION_MESSAGE);
        } else {

            //Se solicita asigne un nickName al personaje
            nickName = JOptionPane.showInputDialog(null, "Ingrese un nickname para " + nombre + ":");
            if (!nickName.equals("") && !nickName.equals(null) && !nickName.equals(" ")) {
                // Se descuenta el oro gastado
                componentes.setOro(componentes.getOro() - 200);
                //Se agrega el personaje a la lista de personajes
                componentes.getPersonajesJugables().agregarDato(this);
                //Se notifica al usuario de la compra realizada
                JOptionPane.showMessageDialog(this, "Personaje adquirido exitosamente", "Compra realizada", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }

    // Mejora de vida
    public void mejorarVida(Componentes componentes) {
        if (componentes.getOro() < 80) {
            JOptionPane.showMessageDialog(this, "No tienes suficiente oro", "Oro insuficiente", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Se descuenta el oro gastado
            componentes.setOro(componentes.getOro() - 80);
            // Se mejora la vida del personaje
            vida = vida + 50;
            //Se notifica de la mejora realizada
            JOptionPane.showMessageDialog(null, "Vida mejorada", "Mejora realizada", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // Mejora de daño
    public void mejorarDaño(Componentes componentes) {
        if (componentes.getOro() < 125) {
            JOptionPane.showMessageDialog(this, "No tienes suficiente oro", "Oro insuficiente", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Se descuenta el oro gastado
            componentes.setOro(componentes.getOro() - 125);
            // Se mejora la daño del personaje
            daño = daño + 10;
            //Se notifica de la mejora realizada
            JOptionPane.showMessageDialog(null, "Daño mejorada", "Mejora realizada", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // Mejora de movimiento
    public void mejorarMovimiento(Componentes componentes) {
        if (componentes.getOro() < 500) {
            JOptionPane.showMessageDialog(this, "No tienes suficiente oro", "Oro insuficiente", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Se descuenta el oro gastado
            componentes.setOro(componentes.getOro() - 500);
            // Se mejora el movimientoMax del personaje
            movimientoMax = movimientoMax + 1;
            movimiento = movimientoMax + " cuadros. " + tipoMovimiento;
            //Se notifica de la mejora realizada
            JOptionPane.showMessageDialog(null, "Movimiento mejorado", "Mejora realizada", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //MOVIMIENTO
    // Movimiento de los personajes
    @Override
    public void movimientoPersonaje(Casillas[][] tablero, int posicionFila, int posicionColumna) {
        if (vida > 0) {

            ControladorPartida control = new ControladorPartida();
            //Apagamos todos los botones
            tablero = control.soloBotones(tablero, "a");
            
            movimientoValido = true;
            movimientoTerminado = false;
            moverContador = 0;
            auxFila = posicionFila;
            auxColumna = posicionColumna;

            //Izquierda
            do {
                auxColumna--;
                movimientoPersonajeValido(tablero, auxFila, auxColumna);
            } while (moverContador < movimientoMax && movimientoValido);
            moverContador = 0;
            movimientoTerminado = false;
            movimientoValido = true;
            auxFila = posicionFila;
            auxColumna = posicionColumna;

            //Arriba
            do {
                auxFila--;
                movimientoPersonajeValido(tablero, auxFila, auxColumna);
            } while (moverContador < movimientoMax && movimientoValido);
            moverContador = 0;
            movimientoTerminado = false;
            movimientoValido = true;
            auxFila = posicionFila;
            auxColumna = posicionColumna;

            //Abajo
            do {
                auxFila++;
                movimientoPersonajeValido(tablero, auxFila, auxColumna);
            } while (moverContador < movimientoMax && movimientoValido);
            moverContador = 0;
            movimientoTerminado = false;
            movimientoValido = true;
            auxFila = posicionFila;
            auxColumna = posicionColumna;

            //Derecha
            do {
                auxColumna++;
                movimientoPersonajeValido(tablero, auxFila, auxColumna);
            } while (moverContador < movimientoMax && movimientoValido);
            moverContador = 0;
            movimientoTerminado = false;
            movimientoValido = true;
            auxFila = posicionFila;
            auxColumna = posicionColumna;

            tablero[posicionFila][posicionColumna].setEnabled(true);
        } else {
            // No realiza la acción porque está muerto
        }
    }

    //MOVIMIENTO PERSONAJE TIERRA
    @Override
    protected void movimientoPersonajeValido(Casillas[][] tablero, int destinoY, int destinoX) {
        // Verificación que el movimiento sea válido, primero que este dentro del
        // tablero y que sea a una casilla válida

        if ((destinoX >= 0 && destinoY >= 0 && destinoX < tablero[0].length && destinoY < tablero.length)) {
            moverContador++;

            if ((tablero[destinoY][destinoX] instanceof Planicie)
                    || (tablero[destinoY][destinoX] instanceof Lava)) {
                tablero[destinoY][destinoX].setEnabled(true);
            } else{
                movimientoValido = false;
            }
        } else {
            movimientoValido = false;
        }
    }
    
    
    //ATAQUES
    public void ataquePersonaje(Casillas[][] tablero, int posicionFila, int posicionColumna){
        if (vida > 0) {

            ControladorPartida control = new ControladorPartida();
            //Apagamos todos los botones
            tablero = control.soloBotones(tablero, "a");
            
            movimientoValido = true;
            movimientoTerminado = false;
            moverContador = 0;
            auxFila = posicionFila;
            auxColumna = posicionColumna;

            //Izquierda
            do {
                auxColumna--;
                ataqueValido(tablero, auxFila, auxColumna);
            } while (moverContador < 1 && movimientoValido);
            moverContador = 0;
            movimientoTerminado = false;
            movimientoValido = true;
            auxFila = posicionFila;
            auxColumna = posicionColumna;

            //Arriba
            do {
                auxFila--;
                ataqueValido(tablero, auxFila, auxColumna);
            } while (moverContador < 1 && movimientoValido);
            moverContador = 0;
            movimientoTerminado = false;
            movimientoValido = true;
            auxFila = posicionFila;
            auxColumna = posicionColumna;

            //Abajo
            do {
                auxFila++;
                ataqueValido(tablero, auxFila, auxColumna);
            } while (moverContador < 1 && movimientoValido);
            moverContador = 0;
            movimientoTerminado = false;
            movimientoValido = true;
            auxFila = posicionFila;
            auxColumna = posicionColumna;

            //Derecha
            do {
                auxColumna++;
                ataqueValido(tablero, auxFila, auxColumna);
            } while (moverContador < 1 && movimientoValido);
            moverContador = 0;
            movimientoTerminado = false;
            movimientoValido = true;
            auxFila = posicionFila;
            auxColumna = posicionColumna;

            tablero[posicionFila][posicionColumna].setEnabled(true);
        } else {
            // No realiza la acción porque está muerto
        }
    }

    protected void ataqueValido(Casillas[][] tablero, int yAtaque, int xAtaque){
        // Verificación que el ataque sea válido, primero que este dentro del
        // tablero y que sea a una casilla válida

        if ((xAtaque >= 0 && yAtaque >= 0 && xAtaque < tablero[0].length && yAtaque < tablero.length)) {
            moverContador++;

            if ((tablero[yAtaque][xAtaque] instanceof Enemigos)
                    || (tablero[yAtaque][xAtaque] instanceof Arbol)) {
                tablero[yAtaque][xAtaque].setEnabled(true);
            } else{
                movimientoValido = false;
            }
        } else {
            movimientoValido = false;
        }
    }
    
}
