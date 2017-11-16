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
public class Pacifiste implements EspritCombatif {
    public void combat() {
        System.out.println("Je ne combats pas !");
    }
    
    public int estAttaquer(int atk, int vie){
        int pAtk = atk;
        int newPointVie = vie-atk/2;
        return newPointVie;
    }
}