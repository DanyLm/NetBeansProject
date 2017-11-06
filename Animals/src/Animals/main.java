/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals;
import java.util.Scanner;

/**
 *
 * @author DanyL
 */
public class main {
    
    static String animals = null;   
    static Animals animal_ = new Animals();   
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){ 
        
        
        Scanner str = new Scanner(System.in);
        String  prenom, cri, answer;
        boolean test = true;
        
        
        while (test){
            
            System.out.print("Avec quel animal désirez vous jouer (Chien/Chat) ? ");
            animals = str.nextLine();
            
            switch (animals.toLowerCase()) {
                case "chien":
                    Chien chien = new Chien();
                    animal_.setCri_Animals("WaaafWaaf");
                    test = false;
                    break;
                case "chat":
                    Chat chat = new Chat();
                    animal_.setCri_Animals("Miaaooouu");
                    test = false;
                    break;
                default:
                    System.err.println("Veuillez réessayer.");
                    break;
            }
        }
        
        
        prenom = str.nextLine();
        animal_.setPrenom_Animals(prenom);
        
        
        while(true){
            
            
            System.out.println(" ------------------- ");
            System.out.println("| Faire dormir (1)  |");
            System.out.println(criAnimals());
            System.out.println("| Faire manger (3)  |");
            System.out.println(" ------------------- ");
            
            System.out.print("Que voulez-vous faire avec lui ? ");
            answer = str.nextLine();
            animal_.actionAnimals(answer);
        }
        
    } 
    
    /**
     *
     * @return
     */
    public static String criAnimals(){
        String var;
        
        if (animals.toLowerCase().equals("chien")){
            var = "| Faire aboyer (2)  |";
        }else{
            var = "| Faire miauler (2) |";
            
        }
        return var;
    }
    
}
