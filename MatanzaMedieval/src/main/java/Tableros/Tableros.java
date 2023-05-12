/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tableros;

import java.io.Serializable;

/**
 *
 * @author carlo
 */
public class Tableros implements Serializable{
    
    private String id;
    private int filas, columnas;
    private String[][] dimTotal;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String[][] getDimTotal() {
        return dimTotal;
    }

    public void setDimTotal(String[][] dimTotal) {
        this.dimTotal = dimTotal;
    }
}
