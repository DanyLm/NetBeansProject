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
public class God extends Personnage {

    private Cimetiere cimetiere = new Cimetiere();
    private GodPower godPower = new Juge();

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
        return this.godPower.isDeadOrAlive(lesPersonnages, this.cimetiere);
    }

    // Fonction qui ressucite tout les personnages lorsqu'il sont tous mort
    public List<Personnage> resurrectAllPersonnage(List<Personnage> lesPersonnagesMorts) {
        return this.godPower.resurrectAllPersonnage(lesPersonnagesMorts, this.cimetiere);
    }

    public Cimetiere getCimetiere() {
        return cimetiere;
    }

    public void setGodPower(GodPower godPower) {
        this.godPower = godPower;
    }
    
    

}
