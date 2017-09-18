/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

import java.util.Scanner;

/**
 *
 * @author axelb
 */
public class main {
    
        public static void main(String[] args) {
            Scanner str = new Scanner(System.in);
            String animals;
            
            
            System.out.print("Quel animal désirez vous choisir (Chien/Chat ?) ? ");
            animals = str.nextLine();
            
            if (animals.toLowerCase().equals("chien")){
                System.out.println("sa marchceeeeeee");
            }else if(animals.toLowerCase().equals("chat")){
                System.out.println("wewe");
            }else{
                System.out.println("nothing");
            }
            /*
            Chat FirstChat = new Chat("Félix", "Noir", "Persan");
            System.out.println ("Le nom du chat est : " + FirstChat.getNom() + " et il cri comme ca : " + FirstChat.getCri() );
            
            Chien FirstChien = new Chien("M&M's", "Marron", "Berger");
            System.out.println (FirstChien.getNom());
            System.out.println (FirstChien.getCri());
            
            System.out.println ();
            
            System.out.println (FirstChien.dormir());
            System.out.println (FirstChien.dormir());
            
            System.out.println ();

            System.out.println (FirstChat.mange());
            System.out.println (FirstChat.dormir());
            System.out.println (FirstChat.getEtat());
            System.out.println (FirstChat.dormir());
            System.out.println (FirstChat.getEtat());
            System.out.println (FirstChat.dormir());
            System.out.println (FirstChat.getEtat());
            System.out.println (FirstChat.dormir());
            System.out.println (FirstChat.getEtat());*/
            
    }
}
