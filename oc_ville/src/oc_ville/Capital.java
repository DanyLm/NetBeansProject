/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oc_ville;

/**
 *
 * @author DanyL
 */
public class Capital extends Ville{
    private String monument;
    
    public Capital() {
        super();
        monument = "aucun";
    }
    
    public Capital(String nomVille, String nomPays, int nbreHabitants, String monument) {
        super(nomVille, nomPays, nbreHabitants);
        this.monument = monument;
    }
    
    public String getMonument() {
        return monument;
    }

    public void setMonument(String monument) {
        this.monument = monument;
    }
  
    @Override
    public String decrisToi(){
        String str =  super.decrisToi() + "\n \t ==>>" + this.monument+ " en est un monument";
        System.out.println("Invocation de super.decrisToi()");
        return str;
    }
 
}
