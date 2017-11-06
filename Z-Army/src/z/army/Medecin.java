/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.army;
import comportement.*;

/**
 *
 * @author DanyL
 */
public class Medecin extends Personnage{
    public Medecin() {
        this.soin = new PremierSoin();
    }
    public Medecin(EspritCombatif esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
    }	
}