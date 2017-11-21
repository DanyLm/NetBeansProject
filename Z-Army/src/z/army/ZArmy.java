/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.army;

import comportement.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
        Menu menu = new Menu();
        Cimetiere alivePersonnages = new Cimetiere();
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
            menu.menu(lesPersonnages, persoExist, alivePersonnages);
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
            lesPersonnages = menu.allDead(alivePersonnages.isDead(lesPersonnages), alivePersonnages);
            menu.menu(lesPersonnages, persoExist, alivePersonnages);
            System.out.print("Qui voulez-vous attaquer ? ");
            cible = inputText.nextLine();
            persoExist = menu.quelPerso(lesPersonnages, monPerso, cible);
            if (!persoExist) {
                System.err.println("Veuillez choisir un personnage valide");
            }
        }
    }
}
