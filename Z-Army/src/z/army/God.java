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
public class God extends Personnage{
    public God(){
        this.espritCombatif = new Pacifiste();
        this.spiritSoul = new Immortel();
        this.vie = 0;
        this.maxLife = 0;
        this.atk = 0;
    }
    public God(EspritCombatif esprit, Soin soin, PersonnageSpiritSoul spiritSoul, Deplacement dep, String name, int vie, int atk, int maxLife) {
        super(esprit, soin, dep, spiritSoul, name, vie, atk, maxLife);
        
    }
    
}
