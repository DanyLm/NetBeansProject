/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.army;

import comportement.*;
import static java.lang.System.exit;
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
    static Cimetiere alivePersonnages = new Cimetiere();
    static Personnage god = new God();

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

        do {
            menu(lesPersonnages, persoExist);
            System.out.print("\nQuel personnage voulez-vous êtres ? ");
            nomPersonnage = inputText.nextLine();
            for (Personnage unPersonnage : lesPersonnages) {
                if (nomPersonnage.toLowerCase().equals(unPersonnage.getNomPersonnage())) {
                    monPerso = unPersonnage;
                    persoExist = !persoExist;
                }
            }

            if (!persoExist) {
                System.err.println("Ce personnage n'existe pas !");
            }

        } while (!persoExist);

        lesPersonnages.remove(monPerso);

        while (true) {

            persoExist = true;
            lesPersonnages = allDead(alivePersonnages.isDead(lesPersonnages));

            menu(lesPersonnages, persoExist);

            System.out.print("Qui voulez-vous attaquer ? ");
            cible = inputText.nextLine();

            for (Personnage unPersonnage : lesPersonnages) {

                persoExist = false;

                if (cible.equals(monPerso.getNomPersonnage())) {
                    System.err.println("Vous ne pouvez pas attaquez votre propre personnage");
                    persoExist = true;
                    break;
                } else if (cible.equals(unPersonnage.getNomPersonnage())) {
                    unPersonnage.estAttaquer(monPerso);
                    persoExist = true;
                    break;
                }

            }

            if (!persoExist) {
                System.err.println("Veuillez choisir un personnage valide");
            }

        }

    }

    public static void menu(List<Personnage> lesPersonnages, boolean persoExist) {

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

    public static List<Personnage> allDead(List<Personnage> lesPersonnagesToRessurect) {
        Scanner inputText = new Scanner(System.in);
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

}
