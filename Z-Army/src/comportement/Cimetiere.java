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
public class Cimetiere {

    List<Personnage> lesPersonnagesInPeace = new ArrayList();

    public List<Personnage> isDead(List<Personnage> lesPersonnagesDead) {

        List<Personnage> lesPersonnages = new ArrayList();

        lesPersonnages.removeAll(lesPersonnages);

        for (Personnage unPersonnage : lesPersonnagesDead) {
            if (isDead(unPersonnage)) {
                lesPersonnagesInPeace.add(unPersonnage);
                System.out.println(unPersonnage.getNomPersonnage() + " est mort, il est au cimetiere !");
            } else {
                lesPersonnages.add(unPersonnage);
            }
        }

        return lesPersonnages;
    }

    private boolean isDead(Personnage unPersonnage) {
        boolean isDead = false;

        if (unPersonnage.getVie() == 0) {
            isDead = true;
        }

        return isDead;
    }

    public List<Personnage> getLesPersonnagesInPeace() {
        return lesPersonnagesInPeace;
    }

    public void setLesPersonnagesInPeaceToNone() {
        this.lesPersonnagesInPeace.removeAll(lesPersonnagesInPeace);
    }

}
