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
public class Chat extends Animals{
    
    protected String cri = "Miaou";

    public Chat() {
    }

    public Chat(String nom, String couleur, String race) {
        super(nom, couleur, race);
    }
    
    public void setCri(String cri) {
        this.cri = cri;
    }

    public String getCri() {
        if(this.getRace() == "Siamois"){
            setCri("Nya");
        }else if(this.getRace() == "Persan"){
            setCri("Meow");
        }
        return cri;
    }
    
}
