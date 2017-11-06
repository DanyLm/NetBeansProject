/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi;

/**
 *
 * @author DanyL
 */
public class Lion extends Felin {
 
    public Lion(){}

    public Lion(String couleur, int poids){
        this.couleur = couleur;
        this.poids = poids;
    }       

    @Override
    void crier() {
        System.out.println("Je rugis dans la savane !");
    } 
}