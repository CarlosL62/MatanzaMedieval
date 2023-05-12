/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas.Personajes;

import Casillas.Casillas;
import Casillas.Terrenos.*;
import Partida.ControladorPartida;

/**
 *
 * @author carlo
 */
public class Personajes extends Casillas {

    protected int vida, daño, movimientoMax;
    protected String nombre, movimiento, tipoMovimiento, ataque;

    private Casillas casillaTerreno;
    private int filaTerreno, columnaTerreno;

    public int getFilaTerreno() {
        return filaTerreno;
    }

    public void setFilaTerreno(int filaTerreno) {
        this.filaTerreno = filaTerreno;
    }

    public int getColumnaTerreno() {
        return columnaTerreno;
    }

    public void setColumnaTerreno(int columnaTerreno) {
        this.columnaTerreno = columnaTerreno;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public Casillas getCasillaTerreno() {
        return casillaTerreno;
    }

    public void setCasillaTerreno(Casillas casillaTerreno, int fila, int columna) {
        this.casillaTerreno = casillaTerreno;
        this.filaTerreno = fila;
        this.columnaTerreno = columna;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public int getMovimientoMax() {
        return movimientoMax;
    }

    public void setMovimientoMax(int movimientoMax) {
        this.movimientoMax = movimientoMax;
    }

    //MOVIMIENTO
    // Variables en uso para el movimiento de los personajes
    protected boolean movimientoValido = true;
    protected int moverContador = 0;
    protected boolean movimientoTerminado = false;
    protected int auxFila, auxColumna;

    // Movimiento de los personajes
    public void movimientoPersonaje(Casillas[][] tablero, int posicionFila, int posicionColumna) {
        
    }

    //MOVIMIENTO PERSONAJE TIERRA
    protected void movimientoPersonajeValido(Casillas[][] tablero, int destinoY, int destinoX) {
        
    }

}
