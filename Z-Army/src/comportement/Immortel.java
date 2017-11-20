/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportement;  
import java.util.ArrayList;
import java.util.List;
import z.army.Personnage;

/**
 *
 * @author DanyL
 */
public class Immortel implements PersonnageSpiritSoul{
    
    public List<Personnage> isResurrect(List <Personnage> lesPersonnages, List<Personnage> lesPersonnagesDead){
        List<Personnage> lesPersonnagesToResurrect = new ArrayList(lesPersonnagesDead);
        
        for(Personnage unPersonnage : lesPersonnagesToResurrect){
            unPersonnage.setVie(unPersonnage.getMaxLife());
        }
        
        return lesPersonnagesToResurrect;
    }
}
