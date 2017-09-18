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
public class main {
    public static void main(String[] args){
        
        
        /*Ville v1 = new Ville("Marseille", "France", 1236);       
        Ville v2 = new Ville("Rio", "Brésil",321654);
        
        System.out.println("\n\n"+v1.decrisToi());
        System.out.println(v2.decrisToi()+"\n\n");
        System.out.println(v1.comparer(v2));
        
        
        Capital cap = new Capital("Paris", "France", 654987, "la tour Eiffel");
        System.out.println("\n"+cap.decrisToi());
*/
        //Définition d'un tableau de villes null
        Ville[] tableau = new Ville[6];

        //Définition d'un tableau de noms de villes et un autre de nombres d'habitants
        String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
        String[] tab2 = {"123456", "78456", "654987", "75832165", "1594", "213"};

        //Les trois premiers éléments du tableau seront des villes,
        //et le reste, des capitales
        for(int i = 0; i < 6; i++){
          if (i <3){
            Ville V = new Ville("Marseille", "France", 1236);
            tableau[i] = V;
          }

          else{
            Capital C = new Capital(tab[i], tab2[i], 4685, "la tour Eiffel");
            tableau[i] = C;
          }
        }

        //Il ne nous reste plus qu'à décrire tout notre tableau !
        for(Ville V : tableau){
          System.out.println(V.decrisToi()+"\n");
        }
    }
}
