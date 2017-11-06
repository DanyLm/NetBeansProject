/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.army;
import comportement.*;

/**
 *
 * @author DanyL
 */
public class ZArmy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personnage[] tPers = {new Guerrier(), new Civil(), new Medecin()};
		
        for (Personnage tPer : tPers) {
            System.out.println("\nInstance de " + tPer.getClass().getName());
            System.out.println("*****************************************");
            tPer.combattre();
            tPer.seDeplacer();
            tPer.soigner();
        }
        
        System.out.println("\nMon personnage qui est un guerrier peut maintenant donner des soins !");
        System.out.println("*****************************************");
        Personnage pers = new Guerrier();
        pers.soigner();
        pers.setSoin(new Operation());
        pers.soigner();
    }
    
}
