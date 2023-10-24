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
public class Bofeton_lodo extends MovimientoEspecial {

    public Bofeton_lodo () {
        this.tipo = TiposDeMovimiento.TIERRA;
        this.potencia = 20;/*poder*/
        this.precision = 100;/*acc*/
        this.puntosPoder = 10;/*pp*/

    }    
    
}
