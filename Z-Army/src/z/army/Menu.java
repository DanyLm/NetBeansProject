/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.army;

import comportement.*;
import static java.lang.System.exit;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DanyL
 */
public class Menu {

    public boolean quelPerso(List<Personnage> lesPersonnages, Personnage monPerso, String cible) {
        boolean persoExist = false;
        
        for (Personnage unPersonnage : lesPersonnages) {

            if (cible.equals(monPerso.getNomPersonnage())) {
                System.err.println("Vous ne pouvez pas attaquez votre propre personnage");
                persoExist = true;
                break;
            } else if (cible.equals(unPersonnage.getNomPersonnage())) {
                
                //unPersonnage.estAttaquer(monPerso);
                typeAtkunPerso(monPerso);
                monPerso.attaque(unPersonnage);
                persoExist = true;
                break;
            }
        }
        return persoExist;
    }

    public void menu(List<Personnage> lesPersonnages, boolean persoExist, Cimetiere alivePersonnages) {
        System.out.println("############################");
        System.out.println("## Liste des perso vivant ##");
        for (Personnage unPersonnage : lesPersonnages) {
            System.out.println("## " + unPersonnage.getNomPersonnage() + " - " + unPersonnage.getVie() + " vie" + " | " + unPersonnage.getAtk() + " atk");
        }
        System.out.println("############################");

        if (persoExist) {
            System.out.println("##########################");
            System.out.println("## Liste des perso mort ##");

            for (Personnage unPersonnage : alivePersonnages.getLesPersonnagesInPeace()) {
                System.out.println("## " + unPersonnage.getNomPersonnage());
            }
            System.out.println("##########################");
        }
        //System.out.println(alivePersonnages.getLesPersonnagesInPeace().get(0).getNomPersonnage());
    }

    public List<Personnage> allDead(List<Personnage> lesPersonnagesToRessurect, Cimetiere alivePersonnages) {
        Scanner inputText = new Scanner(System.in);
        Personnage god = new God();
        List<Personnage> lesPersonnagesResurrect = lesPersonnagesToRessurect;

        if (lesPersonnagesResurrect.isEmpty()) {
            System.out.print("Voulez-vous ressuitez tous les personnages (o/n) ? ");
            String answer = inputText.nextLine();

            if (answer.toLowerCase().equals("o")) {
                System.out.println("\nDieu à ressucité tous les personnages !\n");
                lesPersonnagesResurrect = god.resurrect(lesPersonnagesResurrect, alivePersonnages.getLesPersonnagesInPeace());
                alivePersonnages.setLesPersonnagesInPeaceToNone();
            } else if (answer.toLowerCase().equals("n")) {
                System.out.println("Au revoir.");
                exit(0);
            } else {
                System.err.println("Mauvaise reponse");
            }

        }

        return lesPersonnagesResurrect;
    }
    
    private void typeAtkunPerso(Personnage unPerso) {
        Random rand = new Random();
        if (unPerso instanceof Guerrier) {
            int nb = rand.nextInt(3);
            switch (nb) {
                case (1):
                    unPerso.setEspritCombatif(new CombatCouteau());
                    System.out.println("Ce fait aggresser avec des coups de couteau par vous");
                    break;
                case (2):
                    unPerso.setEspritCombatif(new CombatPistolet());
                    System.out.println("Ce mange une raffale de tire au PISTOLET par vous");
                    break;
                default:
                    unPerso.setEspritCombatif(new CombatSortilege());
                    System.out.println("Ce fait atomiser avec un SORTILEGE lancez par vous");
                    break;
            }
        }
    }
}
