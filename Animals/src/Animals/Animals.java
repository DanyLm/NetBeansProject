/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals;

/**
 *
 * @author DanyL
 */
public class Animals {
    protected boolean dormir, manger, etat = false;
    protected String animal_Animals, race_Animals, prenom_Animals, cri_Animals;

    public Animals() {
        if (this.getClass().getSimpleName().equals("Chien")){
            this.animal_Animals= "chien";
            System.out.print("Quel nom voulez-vous pour votre chien ? ");     
        }else if(this.getClass().getSimpleName().equals("Chat")){
            this.animal_Animals= "chat";
            System.out.print("Quel nom voulez-vous pour votre chat ? ");
        }
    }

    public Animals(String prenom_Animals, String cri_Animals) {
        this.prenom_Animals = prenom_Animals;
        this.cri_Animals = cri_Animals;

    }

    public String getCri_Animals() {
        return cri_Animals;
    }

    public void setCri_Animals(String cri_Animals) {
        this.cri_Animals = cri_Animals;
    }
    
    public boolean isDormir() {
        return dormir;
    }

    public void setDormir(boolean dormir) {
        this.dormir = dormir;
    }

    public boolean isManger() {
        return manger;
    }

    public void setManger(boolean manger) {
        this.manger = manger;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public String getRace_Animals() {
        return race_Animals;
    }

    public void setRace_Animals(String race_Animals) {
        this.race_Animals = race_Animals;
    }

    public String getPrenom_Animals() {
        return prenom_Animals;
    }

    public void setPrenom_Animals(String prenom_Animals) {
        this.prenom_Animals = prenom_Animals;
    }

    public String getAnimal_Animals() {
        return animal_Animals;
    }

    public void setAnimal_Animals(String animal_Animals) {
        this.animal_Animals = animal_Animals;
    }
   
    
    public String actionAnimals(String var){
        
        switch (var) {
            case "1":
                if(this.dormir){
                    System.out.println(this.prenom_Animals+" est deja entrain de dormir");
                }else{
                    this.dormir=true;
                    System.out.println(this.prenom_Animals+" s'endors ZZZZZZZZZ");
                }
                break;
            case "2":
                System.out.println(this.cri_Animals);
                break;
            case "3":
                if(this.dormir){
                    System.out.println(this.prenom_Animals+" dors, il ne peut manger...");
                }else{
                    if (!this.manger){
                        System.out.println("Miam Miam");
                        this.manger=!manger;
                    }else{
                        System.out.println(this.prenom_Animals+" a deja manger, il est goinfrer.");
                    }
                }
                break;    
            default:
                System.err.println("Veuillez réessayer.");
                break;
        }

        return var;
    }
       
}
