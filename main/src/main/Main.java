package main;
import main.Pikachu;
import main.Charmander;
import main.Bullbasaur;
import main.Magikarp;
import main.Snorlax;
import main.Diglett;
/**
 *
 * @author Artemio Abdiel Tenorio Sanchez
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
        
        Pikachu pika = new Pikachu();
        Charmander charm = new Charmander();
        Bullbasaur bullb = new Bullbasaur();
                
        System.out.println("->Pikachu se encuentra con un Charmander y ataca");
        pika.atacar(charm, Pikachu.Movimientos.IMPACTRUENO);
        
        System.out.println("->Charmander se molesta y responde ");
        charm.atacar(pika, Charmander.Movimientos.ATAQUE_RAPIDO);
     
        System.out.println("->Bullbasaur se enoja porque atacaron a su amigo Pikachu y...");
        bullb.atacar(charm, Bullbasaur.Movimientos.LATIGO);
        
        System.out.println("____________________________________________________");
        Snorlax gibi = new Snorlax();
        Magikarp pesencio = new Magikarp();
        Diglett roberto = new Diglett();
        
        System.out.println("magikarp salio del agua y se esta ahogando");
        pesencio.atacar(gibi, Magikarp.Movimientos.Salpicadura);
        
        System.out.println("Diglett ve que pesencio se esta ahogando y quiere mover");
        System.out.println("a el Snorlax");
        roberto.atacar(gibi, Diglett.Movimientos.Bofeton_lodo);
        
        System.out.println("Snorlax se da cuenta que pesencio se esta ahogando lo regresa al agua");
        gibi.atacar(pesencio, Snorlax.Movimientos.Golpe_cabeza);
        
         System.out.println("pesencio regreso asalvo al agua");
    }
    
}
