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
public class Chien extends Canin implements DoThings {
 
    public Chien(){}
  
    public Chien(String couleur, int poids){
        this.couleur = couleur;
        this.poids = poids;
    }                

    @Override
    void crier() {
        System.out.println("J'aboie sans raison !");
    }        

    @Override
    public void faireCalin() {
        System.out.println("Je te fais un GROS CÂLIN");               
    }

    @Override
    public void faireLeBeau() {
        System.out.println("Je fais le beau !");
    }

    @Override
    public void faireLechouille() {
        System.out.println("Je fais de grosses léchouilles...");
    } 
}