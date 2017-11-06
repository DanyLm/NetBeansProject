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
public class Ville {
    protected String nomVille, nomPays;
    protected int nbreHabitants;
    protected char categorie;

    public Ville() {
        System.out.println("Création d'une ville !");      
        nomVille = "Inconnu";
        nomPays = "Inconnu";
        nbreHabitants = 0;
    }

    public Ville(String nomVille, String nomPays, int nbreHabitants) {
        System.out.println("Création d'une ville avec parametre !");
        this.nomVille = nomVille;
        this.nomPays = nomPays;
        this.nbreHabitants = nbreHabitants;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public int getNbreHabitants() {
        return nbreHabitants;
    }

    public void setNbreHabitants(int nbreHabitants) {
        this.nbreHabitants = nbreHabitants;
    }
    
    public char getCategorie() {
        return categorie;
    }

    public void setCategorie(char categorie) {
        this.categorie = categorie;
    }
    
    private void setCategorie() {
 
        int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
        char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

        int i = 0;
        while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
          i++;

        this.categorie = categories[i];
     }
    
    public String decrisToi(){
        return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "+this.nbreHabitants+" habitant(s) => elle est donc de catégorie : "+this.categorie;
    }

  //Retourne une chaîne de caractères selon le résultat de la comparaison
  public String comparer(Ville v1){
        String str = new String();

        if (v1.getNbreHabitants() > this.nbreHabitants)
          str = v1.getNomVille()+" est une ville plus peuplée que "+this.nomVille;

        else
          str = this.nomVille+" est une ville plus peuplée que "+v1.getNomVille();

        return str;
    }
    
    
    
}
