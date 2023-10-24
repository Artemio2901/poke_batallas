/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import main.MOVES.Habilidad_de_Relleno;
import main.MOVES.Movimiento;
import main.MOVES.Placaje;
import main.MOVES.Salpicadura;


/**
 *
 * @author Artemio Abdiel Tenorio Sanchez
 */
public class Magikarp extends Pokemon{
    public enum Movimientos {
        Placaje,Salpicadura,
        Habilidad_de_Relleno/*en la primera generacion magikarp solo tiene dos
        habilidades para aprender una estado y una fisica en las demas 
        generaciones tiendo tres habilidades para aprender y la tercera tambien 
        esfisica asique que esta habilidad emula una especial :3*/
        
    }
     public Magikarp() {
        tipo = "AGUA";
        hp = 30;
        ataque = 29;
        defensa = 85;
        nivel = 1;
        precision = 3;
       
     }
     
        //Constructor alterno 1
    public Magikarp(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    public void atacar(Pokemon oponente, Magikarp.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case Placaje:
                instanciaMovimiento = new Placaje();
                break;
            case Salpicadura:
                instanciaMovimiento = new Salpicadura();
                break;
            case Habilidad_de_Relleno:
                instanciaMovimiento = new Habilidad_de_Relleno();
                break;
            //Otros movimientos aquí...
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento
        instanciaMovimiento.utilizar(this, oponente);

    }
 }

