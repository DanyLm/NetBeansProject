/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportement;

import java.util.ArrayList;
import java.util.List;
import z.army.Personnage;

/**
 *
 * @author DanyL
 */
public class Juge implements GodPower{
    // Fonction qui ressucite tout les personnages lorsqu'il sont tous mort
    public List<Personnage> resurrectAllPersonnage(List<Personnage> lesPersonnagesMorts, Cimetiere cimetiere) {
        throw new UnsupportedOperationException("Methode non permise");
    }
    
    public List<Personnage> isDeadOrAlive(List<Personnage> lesPersonnages, Cimetiere cimetiere){
        
        List<Personnage> lesPersonnagesVivants = new ArrayList();// creation d'une nouvelle liste de perso vivant pr etre renvoyer 

        for (Personnage unPersonnage : lesPersonnages) {
            if (unPersonnage.getVie() == 0) {
                System.out.println(unPersonnage.getNomPersonnage() + " est mort, il envoyé au cimetiere !");
                addPersonnageToCemetery(unPersonnage, cimetiere);
            } else {
                lesPersonnagesVivants.add(unPersonnage);
            }
        }
        return lesPersonnagesVivants;
    }
    
    //Foncrion qui ajouter les personnage jugé mort dans le cimetiere
    private void addPersonnageToCemetery(Personnage unPersonnage, Cimetiere cimetiere) {//mon personnage mort va etre ajouter au cimetiere
        cimetiere.getLesPersonnagesInPeace().add(unPersonnage);
    }
    
}
