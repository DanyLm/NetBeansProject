/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportement;

/**
 *
 * @author DanyL
 */
public class Operation implements Soin{
     
    public void soigne() {
        System.out.println("Je pratique des opérations !");
    }
    
    public int soigne(int vie, int maxLife){
        throw new UnsupportedOperationException("Ce medecin donne seulement des soins intensif");
    }
    
    public int opere(int vie, int maxLife){
        System.out.print("Opération en cour...");
        vie = maxLife;
        return vie;
    }

}
