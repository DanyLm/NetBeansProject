/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author axelb
 */
public class Chien extends Animals{
    
    private String cri;

    public Chien() {
    }
    
    public Chien(String nom, String couleur, String race) {
        super(nom, couleur, race);
    }  
    
    public void setCri(String cri) {
        this.cri = cri;
    }

    public String getCri() {
        if(this.getRace() == "Bulldog"){
            setCri("Grrr");
        }else if(this.getRace() == "Berger"){
            setCri("WAAAF");
        }
        return cri;
    }
    
    
}
