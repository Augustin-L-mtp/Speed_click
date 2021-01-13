/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speed_click2;

/**
 *
 * @author augus
 */
public class Bouton_SP {
    String Couleur;
    boolean estAllume; 
    
    public Bouton_SP() {
        Couleur = "blanc";
        estAllume = false;
        
    }

   
    
    public void allumerUnBouton() {
        estAllume = true; // on utilisera cette fonction pour allumer (true) un bouton de la grille                
               
    }
    
    public void eteindreUnBouton() {
        estAllume = false; // on utilisera cette fonction pour eteindre (false) le dernier bouton allumé de la grille
       
    }
    
    public void colorationBouton(String typeJeton) { 
        Couleur = typeJeton;
    }
    
}

