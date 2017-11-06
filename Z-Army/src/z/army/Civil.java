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
public class Civil extends Personnage{
    public Civil() {}

    public Civil(EspritCombatif esprit, Soin soin, Deplacement dep, String name) {
        super(esprit, soin, dep, name);
    }	
}