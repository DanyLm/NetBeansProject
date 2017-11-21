/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.army;
import comportement.*;
import java.util.List;

/**
 *
 * @author DanyL
 */
public abstract class Personnage {

    //Nos instances de comportement
    protected EspritCombatif espritCombatif = new Pacifiste();
    protected Soin soin = new AucunSoin();
    protected Deplacement deplacement = new Marcher();
    protected PersonnageSpiritSoul spiritSoul = new Mortel();
    protected String nomPersonnage;
    protected int vie = 100;
    protected int atk = 30;
    
    protected int maxLife = 100;

    //Constructeur par défaut
    public Personnage(){}

    //Constructeur avec paramètres
    public Personnage(EspritCombatif espritCombatif, 
            Soin soin, Deplacement deplacement, PersonnageSpiritSoul spiritSoul, String nomPersonnage, 
            int vie, int atk, int maxLife) {
      this.espritCombatif = espritCombatif;
      this.soin = soin;
      this.deplacement = deplacement;
      this.spiritSoul = spiritSoul;
      this.nomPersonnage = nomPersonnage;
      this.vie = vie;
      this.atk = atk;
    }

    public void soigner(Personnage uneVictime){
        int newLife = this.soin.soigne(uneVictime.getVie(), uneVictime.getMaxLife());
        uneVictime.setVie(notExceedMaxLife(uneVictime, newLife));
    }
    
    private int notExceedMaxLife(Personnage uneVictime, int vie){
        
        if(vie > uneVictime.getMaxLife()){
            vie = uneVictime.getMaxLife();
        }
        
        return vie;
    }
    
    public void opere(Personnage uneVictime){
        uneVictime.setVie(
                this.soin.opere(
                        uneVictime.getVie(), uneVictime.getMaxLife()
                )
        );
    }
    
    /*
    public void estAttaquer(Personnage unAttaquant){
        this.setVie(
                deadOrNot(
                        this.espritCombatif.estAttaquer(unAttaquant, this)
                )
        );
    }*/
    
    public void attaque(Personnage unDefenseur){
        unDefenseur.setVie(
                deadOrNot(
                        this.espritCombatif.estAttaquer(this, unDefenseur)
                )
        );
    }
    
    private int deadOrNot(int vie){
        
        if(vie < 0){
            vie = 0;
        }
        
        return vie;
    }
    
    public List<Personnage> resurrect(List<Personnage> lesPersonnages, List<Personnage> lesPersonnagesDead){
        lesPersonnages = this.spiritSoul.isResurrect(lesPersonnages, lesPersonnagesDead);
        return lesPersonnages;
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
    
    public void setSpiritSoul(PersonnageSpiritSoul spiritSoul){
        this.spiritSoul = spiritSoul;
    }

    public String getNomPersonnage() {
        return nomPersonnage;
    }

    public void setNomPersonnage(String nomPersonnage) {
        this.nomPersonnage = nomPersonnage;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
}
