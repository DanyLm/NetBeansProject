/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportement;

import z.army.Personnage;

/**
 *
 * @author DanyL
 */
public class CombatSortilege implements EspritCombatif {	
    
    public void combat() {
        System.out.println("Je me bats au couteau !");
    }
    
    public int estAttaquer(Personnage unAttaquant, Personnage unDefenseur){
        System.out.println(unAttaquant.getNomPersonnage() + " lance un sortilege sur " + unDefenseur.getNomPersonnage());
        int pAtk = unAttaquant.getAtk();
        int newPointVie = unDefenseur.getVie()-pAtk*2;
        return newPointVie;
    }

}