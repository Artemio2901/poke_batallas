/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.MOVES;

/**
 *
 * @author Artemio Abdiel Tenorio Sanchez
 */
public class Amnesia extends MovimientoEstado{/*el gris*/
    
    public Amnesia() {
        this.tipo = Movimiento.TiposDeMovimiento.PSIQUICO;
        this.potencia = 0;/*poder*/
        this.precision = 100;/*acc*/
        this.puntosPoder = 20;/*pp*/

    }
        
        
}

