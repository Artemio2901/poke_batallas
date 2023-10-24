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
public class Golpe_cabeza extends MovimientoFisico{/*el rojo*/

    public Golpe_cabeza() {
        this.tipo=TiposDeMovimiento.NORMAL;
        this.potencia = 70;/*poder*/
        this.precision = 100;/*acc*/
        this.puntosPoder = 15;/*pp*/
    
 }
}