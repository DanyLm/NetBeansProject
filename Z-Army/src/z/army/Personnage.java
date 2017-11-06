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
public abstract class Personnage {

    //Nos instances de comportement
    protected EspritCombatif espritCombatif = new Pacifiste();
    protected Soin soin = new AucunSoin();
    protected Deplacement deplacement = new Marcher();
    protected String nomPersonnage;

    //Constructeur par défaut
    public Personnage(){}

    //Constructeur avec paramètres
    public Personnage(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement, String nomPersonnage) {
      this.espritCombatif = espritCombatif;
      this.soin = soin;
      this.deplacement = deplacement;
      this.nomPersonnage = nomPersonnage;
    }

    //Méthode de déplacement de personnage
    public void seDeplacer(){
      //On utilise les objets de déplacement de façon polymorphe
      deplacement.deplacer();
    }

    // Méthode que les combattants utilisent
    public void combattre(){
      //On utilise les objets de déplacement de façon polymorphe
      espritCombatif.combat();
    }

    // Méthode que les combattants utilisent pour attaquer
    public void attaque(String nomPersonnage){
        espritCombatif.attaque(nomPersonnage);
    }

    //Méthode de soin
    public void soigner(){
      //On utilise les objets de déplacement de façon polymorphe
      soin.soigne();
    }

    //Redéfinit le comportement au combat
    public void setEspritCombatif(EspritCombatif espritCombatif) {
      this.espritCombatif = espritCombatif;
    }

    //Redéfinit le comportement de Soin
    public void setSoin(Soin soin) {
      this.soin = soin;
    }

    //Redéfinit le comportement de déplacement
    public void setDeplacement(Deplacement deplacement) {
      this.deplacement = deplacement;
    }

    public String getNomPersonnage() {
        return nomPersonnage;
    }

    public void setNomPersonnage(String nomPersonnage) {
        this.nomPersonnage = nomPersonnage;
    }
  
}
