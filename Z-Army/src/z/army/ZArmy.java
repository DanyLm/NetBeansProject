/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.army;
import comportement.*;
import java.util.Scanner;

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
        Scanner inputText = new Scanner(System.in);
        String nomPersonnage="";
		
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
        
        // Test demande à l'utilisateur un nom pour son guerrier
        System.out.println("\nTest des attaques !");
        System.out.println("*****************************************");
        Personnage attaker = new Guerrier();      
        System.out.print("Veuillez entrez un nom de personnage : ");
        nomPersonnage = inputText.nextLine();
        attaker.setNomPersonnage(nomPersonnage);
        Personnage defenser = new Civil();
        defenser.attaque(attaker.getNomPersonnage());
        
        
        
        
    }
    
}
