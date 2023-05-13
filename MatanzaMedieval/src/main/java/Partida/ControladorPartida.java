/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Partida;

import Archivos.Archivos;
import Casillas.Casillas;
import Casillas.Personajes.Enemigos;
import Casillas.Personajes.Jugables;
import Casillas.Personajes.*;
import Casillas.Terrenos.*;
import Tableros.Tableros;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class ControladorPartida {

    private Casillas[][] botonesAsignados;
    private int filas, columnas;

    public Casillas[][] getBotonesAsignados() {
        return botonesAsignados;
    }

    public void setBotonesAsignados(Casillas[][] botonesAsignados) {
        this.botonesAsignados = botonesAsignados;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public void construccionTablero(Tableros tablero) {

        //Obtenemos los valores de filas y columnas
        filas = tablero.getFilas();
        columnas = tablero.getColumnas();
        //Obtenemos los caracteres del tablero archivo
        String[][] dimTotal = tablero.getDimTotal();

        //Creamos un arreglo de botones
        botonesAsignados = new Casillas[filas][columnas];

        // Se asigna a cada casilla una identidad según el caracter del tablero
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                String caracter = dimTotal[i][j];
                switch (caracter) {
                    case "-":
                        botonesAsignados[i][j] = new Planicie();
                        break;
                    case "T":
                        botonesAsignados[i][j] = new Arbol();
                        //inventario.setCantidadBarcosTablero(inventario.getCantidadBarcosTablero() + 1);
                        break;
                    case "~":
                        botonesAsignados[i][j] = new Agua();
                        //inventario.setCantidadBarcosTablero(inventario.getCantidadBarcosTablero() + 1);
                        break;
                    case "#":
                        botonesAsignados[i][j] = new Lava();
                        //inventario.setCantidadBarcosTablero(inventario.getCantidadBarcosTablero() + 1);
                        break;
                    default:
                        botonesAsignados[i][j] = new Planicie();
                        break;
                }
            }
        }
    }

    public Enemigos[] asignacionEnemigos(Casillas[][] tablero, int opcionDificultad) {
        Random rand = new Random();
        //Obtenemos el arreglo de enemigos
        Enemigos[] enemigos = enemigosAsignables(opcionDificultad);

        int randomNum = 0;
        int cont = 0;

        do {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    randomNum = rand.nextInt(5);
                    //Si es 0, asigna el espacio y almacena el terreno
                    if (randomNum == 0 && tablero[i][j] instanceof Planicie) {
                        //Ubicamos al enemigo
                        if (cont < enemigos.length) {
                            enemigos[cont].setCasillaTerreno(botonesAsignados[i][j], i, j);
                            botonesAsignados[i][j] = enemigos[cont];
                            cont++;
                        } else {
                            break;
                        }

                    }
                }
            }
        } while (cont < enemigos.length);
        return enemigos;
    }

    public Enemigos[] enemigosAsignables(int opcionDificultad) {
        Enemigos[] enemigos;
        switch (opcionDificultad) {
            case 0:
                enemigos = new Enemigos[3];
                enemigos[0] = new Ogro();
                enemigos[1] = new Gargola();
                enemigos[2] = new FlorCarnivora();
                break;
            case 1:
                enemigos = new Enemigos[5];
                enemigos[0] = new Ogro();
                enemigos[1] = new Gargola();
                enemigos[2] = new FlorCarnivora();
                enemigos[3] = new Cancerbero();
                enemigos[4] = new Bruja();
                break;
            case 2:
                enemigos = new Enemigos[8];
                enemigos[0] = new Ogro();
                enemigos[1] = new Gargola();
                enemigos[2] = new FlorCarnivora();
                enemigos[3] = new Cancerbero();
                enemigos[4] = new Bruja();
                enemigos[5] = new Ogro();
                enemigos[6] = new FlorCarnivora();
                enemigos[7] = new Bruja();
                break;
            default:
                throw new AssertionError();
        }
        return enemigos;
    }

    public void muertoCheck(Casillas[][] tablero, Enemigos[] enemigos, Jugables[] jugablePartida) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (botonesAsignados[i][j] instanceof Personajes) {
                    if (botonesAsignados[i][j] instanceof Enemigos) {
                        for (int k = 0; k < enemigos.length; k++) {
                            if (botonesAsignados[i][j] == enemigos[k]) {
                                if (enemigos[k].getVida() <= 0) {
                                    botonesAsignados[i][j] = new Planicie();
                                }
                            }
                        }
                    }
                    if (botonesAsignados[i][j] instanceof Jugables) {
                        for (int k = 0; k < jugablePartida.length; k++) {
                            if (botonesAsignados[i][j] == jugablePartida[k]) {
                                if (jugablePartida[k].getVida() <= 0) {
                                    botonesAsignados[i][j] = new Planicie();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public boolean enemigosMuertos(Enemigos[] enemigos){
        boolean enemigosMuertos = true;
        for (Enemigos enemigo : enemigos) {
            if (enemigo.getVida() > 0) {
                enemigosMuertos = false;
            }
        }
        return enemigosMuertos;
    }
    
    private int puntosPartida;

    public int getPuntosPartida() {
        return puntosPartida;
    }

    public void setPuntosPartida(int puntosPartida) {
        this.puntosPartida = puntosPartida;
    }
    
    public void almacenarPuntaje(String usuario) {
        Archivos archivo = new Archivos();
        try {
            archivo.almacenarPuntaje(usuario, puntosPartida);
        } catch (IOException ex) {
            Logger.getLogger(ControladorPartida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Apagar botones
    public Casillas[][] soloBotones(Casillas[][] tablero, String tipoCasilla) {
        // Apagamos todos los botones que sean diferentes a la planicie
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {

                switch (tipoCasilla) {
                    case "planicie":
                        if (!(tablero[i][j] instanceof Planicie)) {
                            tablero[i][j].setEnabled(false);
                        }
                        break;
                    case "arbol":
                        if (!(tablero[i][j] instanceof Arbol)) {
                            tablero[i][j].setEnabled(false);
                        }
                        break;
                    case "agua":
                        if (!(tablero[i][j] instanceof Agua)) {
                            tablero[i][j].setEnabled(false);
                        }
                        break;
                    case "lava":
                        if (!(tablero[i][j] instanceof Lava)) {
                            tablero[i][j].setEnabled(false);
                        }
                        break;
//                    case "enemigos":
//                        if (!(botonesAsignados[i][j] instanceof Enemigos)) {
//                        botonesAsignados[i][j].setEnabled(false);
//                        }
//                        break;
                    default:
                        tablero[i][j].setEnabled(false);
                }
            }
        }

        return tablero;
    }

    //Encender botones
    public void encenderBotones(Casillas[][] botonesAsigandos) {
        // Apagamos todos los botones que sean diferentes a la planicie
        for (int i = 0; i < botonesAsignados.length; i++) {
            for (int j = 0; j < botonesAsignados[0].length; j++) {

                botonesAsignados[i][j].setEnabled(true);
            }
        }
    }

}
