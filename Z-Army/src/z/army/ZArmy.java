/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.army;
import comportement.*;
import java.util.ArrayList;
import java.util.List;
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
        boolean persoExist = false;
        
        Personnage monPerso = null;
        
        Personnage sorcier = new Guerrier();
        sorcier.setNomPersonnage("sorcier");
        Personnage mangeMort = new Guerrier();
        mangeMort.setNomPersonnage("mangemort");
        Personnage unMedecin = new Medecin();
        unMedecin.setNomPersonnage("medecin");
        Personnage unMoldu = new Civil();
        unMoldu.setNomPersonnage("moldu");
        
        List<Personnage> lesPersonnages = new ArrayList();
        lesPersonnages.add(sorcier);
        lesPersonnages.add(mangeMort);
        lesPersonnages.add(unMedecin);
        lesPersonnages.add(unMoldu);

        do{
            menu(lesPersonnages);
            System.out.print("\nQuel personnage voulez-vous êtres ? ");
            nomPersonnage = inputText.nextLine();
            for (Personnage unPersonnage : lesPersonnages) {
                if(nomPersonnage.toLowerCase().equals(unPersonnage.getNomPersonnage())){
                    monPerso = unPersonnage;
                    persoExist =! persoExist;
                }
            }
            
            if(!persoExist){
                System.err.println("Ce personnage n'existe pas !");
            }

        }while(!persoExist);
        
        lesPersonnages.remove(monPerso);
        
        while(true){
            
            persoExist = true;
            
            menu(lesPersonnages);
            
            System.out.print("Qui voulez-vous attaquer ? ");
            cible = inputText.nextLine();

            for (Personnage unPersonnage : lesPersonnages) {
                
                persoExist = false;
                
                if(cible.equals(monPerso.getNomPersonnage())){
                    System.err.println("Vous ne pouvez pas attaquez votre propre personnage");
                    persoExist = true;
                    break;
                }
                else if(cible.equals(unPersonnage.getNomPersonnage())){
                    unPersonnage.estAttaquer(monPerso);
                    System.out.println("Jattaque");
                    persoExist = true;
                    break;
                }
                
            }
            
            if(!persoExist){
                System.err.println("Veuillez choisir un personnage valide");
            }
           
        }

    }
    
    private static void menu(List<Personnage> lesPersonnages){
        
        System.out.println("##################");
        for(Personnage unPersonnage : lesPersonnages){
            System.out.println("## " + unPersonnage.getNomPersonnage());
        }
        System.out.println("##################");
        
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
}
