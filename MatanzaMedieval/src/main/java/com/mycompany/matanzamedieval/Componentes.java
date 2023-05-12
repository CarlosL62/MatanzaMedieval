/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matanzamedieval;

import Casillas.Personajes.Jugables;
import Listas.*;
import Objetos.*;
import Tableros.Tableros;
import java.io.Serializable;

/**
 *
 * @author carlo
 */
public class Componentes implements Serializable{
    //En esta clase se almacenarán todos los componentes para almacenar los datos del juego
    
    //Variable para almacenar el oro
    private int oro;
    //Lista para almacenar los personajes
    private ListaGenerica<Jugables> personajesJugables;
    //Lista para almacenar los objetos
    private ListaGenerica<Objetos> objetosInventario;
    //Lista para almacenar los tableros
    private ListaGenerica<Tableros> tablerosCargados;

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public ListaGenerica<Jugables> getPersonajesJugables() {
        return personajesJugables;
    }

    public void setPersonajesJugables(ListaGenerica<Jugables> personajesJugables) {
        this.personajesJugables = personajesJugables;
    }

    public ListaGenerica<Objetos> getObjetosInventario() {
        return objetosInventario;
    }

    public void setObjetosInventario(ListaGenerica<Objetos> objetosInventario) {
        this.objetosInventario = objetosInventario;
    }

    public ListaGenerica<Tableros> getTablerosCargados() {
        return tablerosCargados;
    }

    public void setTablerosCargados(ListaGenerica<Tableros> tablerosCargados) {
        this.tablerosCargados = tablerosCargados;
    }
    
    
    
    public Componentes(){
        //Se inicializan las listas
        personajesJugables = new ListaGenerica<>();
        objetosInventario = new ListaGenerica<>();
        tablerosCargados = new ListaGenerica<>();
        SemillaDeLaVida semillaDeLaVida = new SemillaDeLaVida();
        ElixirVerde elixirVerde = new ElixirVerde();
        CapaDeMovilidad capaDeMovilidad = new CapaDeMovilidad();
        objetosInventario.agregarDato(semillaDeLaVida);
        objetosInventario.agregarDato(elixirVerde);
        objetosInventario.agregarDato(capaDeMovilidad);
    }
}
