/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.army;

import comportement.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DanyL
 */
public class God extends Personnage{

    private Cimetiere cimetiere = new Cimetiere();

    public God() {
        this.vie = 0;
        this.maxLife = 0;
        this.atk = 0;
        this.espritCombatif = null;
        this.cimetiere = cimetiere; // Le cimetiere est lié au Personnage Dieu
    }

    public God(EspritCombatif esprit, Soin soin, Deplacement dep, String name, int vie, int atk, int maxLife) {
        super(esprit, soin, dep, name, vie, atk, maxLife);
    }

    //Le personnage Dieu "juge" si mon personnage est mort ou non, si il est mort il l'envoie au cimetiere
    // Sinon il le renvoie dans la liste des personnage vivant
    public List<Personnage> isDeadOrAlive(List<Personnage> lesPersonnages) { // je check si il est a 0 ou non (plus tard ajouter une interface vivant ou mort que je chek)
        
        List<Personnage> lesPersonnagesVivants = new ArrayList();// creation d'une nouvelle liste de perso vivant pr etre renvoyer 
        
        for(Personnage unPersonnage : lesPersonnages){
            if (unPersonnage.getVie() == 0) {
                System.out.println(unPersonnage.getNomPersonnage() + " est mort, il envoyé au cimetiere !");
                addPersonnageToCemetery(unPersonnage);
            }else{
                lesPersonnagesVivants.add(unPersonnage);
            }
        }
        return lesPersonnagesVivants;
    }
    
    //Foncrion qui ajouter les personnage jugé mort dans le cimetiere
    public void addPersonnageToCemetery(Personnage unPersonnage) {//mon personnage mort va etre ajouter au cimetiere
        cimetiere.getLesPersonnagesInPeace().add(unPersonnage);
    }
    
    // Fonction qui ressucite tout les personnages lorsqu'il sont tous mort
    public List<Personnage> resurrectAllPersonnage(List<Personnage> lesPersonnagesMorts) {
        List<Personnage> lesPersonnagesRessucite = new ArrayList(); //renvoie une liste des personnage ressucité
        
        for (Personnage unPersonnage : lesPersonnagesMorts) {
            unPersonnage.setVie(unPersonnage.getMaxLife()); // Met la valeur maximal de vie a chacun des personnages
            lesPersonnagesRessucite.add(unPersonnage);
        }
        
        cimetiere.setLesPersonnagesInPeaceToNone(); // Je supprime la liste des personnages morts
        
        return lesPersonnagesRessucite;
    }

    public Cimetiere getCimetiere() {
        return cimetiere;
    }
    
    

}
