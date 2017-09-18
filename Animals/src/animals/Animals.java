/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author axelb
 */
public class Animals {

    /**
     * @param args the command line arguments
     */
    
    protected String nom, couleur, race, etat = "Inactif";
    
    protected boolean dort = false, mange = false;
    
    protected int anneeN;
    
    
    //Construct
    public Animals() {
    }
    //Construct Full
    public Animals(String nom, String couleur,String race){
        this.nom = nom;
        this.couleur = couleur;
        this.race = race;
        this.dort = false;
        this.mange = false;
    }
    
    public String dormir(){
        String reponse = null;
        if (this.mange){
            reponse = "Le " + this.getClass().getSimpleName() + " : " + getNom()
                    + " est en train de manger mais s'arrête pour aller dormir";
            this.setMange(false);
            this.dormir();
        } else if (this.dort){
            reponse = "Le " + this.getClass().getSimpleName() + " : " + getNom()
                    + " viens de se réveiller";  
            this.setDort(false);
        } else if (this.dort == false){
            this.setDort(true);
            reponse ="Le " + this.getClass().getSimpleName() + " : " + getNom()
                    + " viens de s'endormir";
        };
        return reponse;
    }
    
    public String mange(){
        String reponse = null;
        if (this.dort){
            reponse = "Le " + this.getClass().getSimpleName() + " : " + getNom()
                    + " est en train de dormir mais se réveille pour aller manger";
            this.setDort(false);
            this.mange();
        } else if (this.mange){
            reponse = "Le " + this.getClass().getSimpleName() + " : " + getNom()
                    + " à arrêté de manger";
            this.setMange(false);
        } else if (this.mange == false){
            this.setMange(true);
            reponse ="Le " + this.getClass().getSimpleName() + " : " + getNom()
                    + " a commencé à manger";
        };
        return reponse;
    }
    
    //get n set
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setAnneeN(int anneeN) {
        this.anneeN = anneeN;
    }

    public void setDort(boolean dort) {
        this.dort = dort;
        
        if (dort == true){
           this.setEtat("Endormit"); 
        } else {
            this.setEtat();
        }
    }

    public void setMange(boolean mange) {
        this.mange = mange;
        
        if (dort == true){
           this.setEtat("Mange"); 
        } else {
            this.setEtat();
        }
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    
    public void setEtat() {
        this.etat = "Inactif";
    }
    
    public String getNom() {
        return nom;
    }
    
    public String getCouleur() {
        return couleur;
    }

    public String getRace() {
        return race;
    }

    public int getAnneeN() {
        return anneeN;
    }

    public boolean isDort() {
        return dort;
    }

    public boolean isMange() {
        return mange;
    }

    public String getEtat() {
        return etat;
    }
    
}
