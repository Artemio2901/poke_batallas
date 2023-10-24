/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import main.MOVES.Amnesia;
import main.MOVES.Golpe_cabeza;
import main.MOVES.Hiperrayo;
import main.MOVES.Movimiento;



/**
 *
 * @author Artemio Abdiel Tenorio Sanchez
 */
public class Snorlax extends Pokemon{
    public enum Movimientos {
        Golpe_cabeza,Amnesia,
        Hiperrayo
    }
     public Snorlax() {
        tipo = "NORMAL";
        hp = 80;
        ataque = 190;
        defensa = 169;
        nivel = 1;
        precision = 3;      
     }
     
        //Constructor alterno 1
    public Snorlax(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
 public void atacar(Pokemon oponente, Snorlax.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case Golpe_cabeza:
                instanciaMovimiento = new Golpe_cabeza();
                break;
            case Hiperrayo:
                instanciaMovimiento = new Hiperrayo();
                break;
            case Amnesia:
                instanciaMovimiento = new Amnesia();
                break;
            //Otros movimientos aquí...
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento
        instanciaMovimiento.utilizar(this, oponente);

    }

}
    

