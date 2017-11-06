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
public class CombatCouteau implements EspritCombatif {	
    
    public void combat() {
        System.out.println("Je me bats au couteau !");
    }
    public void attaque(String nomPersonnage){
        System.out.println(nomPersonnage+" attaque un perso qui combat au couteau");
    }
}