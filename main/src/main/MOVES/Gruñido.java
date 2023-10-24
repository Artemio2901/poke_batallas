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
public class Gruñido extends MovimientoEstado{
    
    public Gruñido() {
        this.tipo = Movimiento.TiposDeMovimiento.NORMAL;
        this.potencia = 0;/*poder*/
        this.precision = 100;/*acc*/
        this.puntosPoder = 40;/*pp*/

    }
    
}
