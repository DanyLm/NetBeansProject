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
        Scanner inputText = new Scanner(System.in);
        String nomPersonnage;
        String cible;
        
        Personnage harry = new Guerrier();
        harry.setNomPersonnage("harry");
        Personnage voldemort = new Guerrier();
        voldemort.setNomPersonnage("voldemort");
        Personnage unMedecin = new Medecin();
        unMedecin.setNomPersonnage("medecin");
        Personnage unCivil = new Civil();
        unCivil.setNomPersonnage("civil");
        
        Personnage objet = harry; //Choix de mon personnage pour plus tard
        
        Personnage[] lesPersonnages = {harry, voldemort, unMedecin, unCivil};
        
        while(true){
            
            System.out.print("Qui voulez-vous attaquer ? ");
            cible = inputText.nextLine();
            
            for (Personnage unPersonnage : lesPersonnages) {
                if(cible.equals(unPersonnage.getNomPersonnage())){
                    unPersonnage.estAttaquer(objet);
                    System.out.println(unPersonnage.getVie() + unPersonnage.toString());
                }
            }
           
        }

    }
    
    public void test(){
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
    
    
    public void other(){
        ////////////////////////////////////////////////////////////////////////////////
        /*
        
        // Test demande à l'utilisateur un nom pour son guerrier
        System.out.println("\nTest des attaques !");
        System.out.println("*****************************************");
        Personnage harry = new Guerrier();      
        harry.setNomPersonnage("harry");
    
        Personnage merlin = new Guerrier();
        System.out.println("Nombre de vie de merlin avant l'attaque : "+merlin.getVie());
        
        System.out.println(harry.getNomPersonnage()+" attaque merlin");
         
        System.out.println("L'attaquant posséde "+harry.getAtk()+" point d'attaque");
        merlin.estAttaquer(harry);
        System.out.println("Nombre de vie de merlin apres l'attaque : "+merlin.getVie());
        
        /////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("\nNouveau test des attaques !");
        System.out.println("*****************************************");
        Personnage brute = new Guerrier();
        Personnage doctor = new Medecin();
        
        System.out.println("Nombre de vie du doctor avant l'attaque : "+doctor.getVie());  
        System.out.println("la brute attaque le doctor"); 
        System.out.println("L'attaquant posséde "+brute.getAtk()+" point d'attaque");
        doctor.estAttaquer(brute);
        System.out.println("Nombre de vie du doctor apres l'attaque : "+doctor.getVie());
        System.out.println("Le doctor soigne merlin");
        doctor.soigner(merlin);
        System.out.println("Merlin a maitenant "+merlin.getVie()+" point de vie");
       
        System.out.println("Mon dieu c'est une blessure grave !! Le chirurgien va arranger sa...");
        doctor.setSoin(new Operation());
        
        doctor.opere(merlin);
        System.out.println("Merlin a maitenant "+merlin.getVie()+" point de vie, il a recuperer toute sa vie");*/
                
        /////////////////////////////////////////////////////////////////////////////////
    }
    
}
