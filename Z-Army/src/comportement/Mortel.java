/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportement;

import java.util.List;
import z.army.Personnage;

/**
 *
 * @author DanyL
 */
public class Mortel implements PersonnageSpiritSoul {
    public List<Personnage> isResurrect(List <Personnage> lesPersonnages, List<Personnage> lesPersonnagesDead){
        System.out.println("Je ne peut pas êtres ressucité !");
        return null;
    }
}
