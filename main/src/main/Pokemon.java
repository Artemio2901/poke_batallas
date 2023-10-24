/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
/**
 *
 * @author Artemio Abdiel Tenorio Sanchez
 */
import java.util.List;

public class Pokemon {
      //Atributos
    protected String tipo;
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected double precision;

    Pokemon() {
    }

    //Getters
    public int getNivel() {
        return nivel;
    }
    public int getAtaque() {
        return ataque;
    }    
    public int getDefensa(){
        return defensa;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Métodos 
    public void recibirDanio(int danio){
        this.hp = this.hp - danio;
    }        
    

    @Override
    public String toString() {

        return this.getClass().getSimpleName() + 
                "{tipo:" + tipo + " hp:" + hp + "}";
    }

}
    
