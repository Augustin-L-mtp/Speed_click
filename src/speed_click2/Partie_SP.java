/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speed_click2;

import java.util.Scanner;
import java.util.Timer;

/**
 *
 * @author augus
 */
public class Partie_SP {
    int compteur;
    Grille_SP GrilleBouton = new Grille_SP();
    String nomJoueur;
    Timer chrono = new Timer();
    
    
    public Partie_SP() {
        compteur = 0;
    }
    
    public void initialiserPartie() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez votre pseudo"); // on gardera le nom pour faire un tableau du score 
        nomJoueur = sc.next();
        
        GrilleBouton.afficherGrilleSurConsole(); // on affiche la grille ou pour l'instant aucun jeton n'est allumé
        
        System.out.println("Attention la partie va commencer !!! \n");
        System.out.println("Etes-vous prêt ? Repondez par oui ou vous recommencerez");
        
        
        while (compteur != 3) {
            GrilleBouton.allumerUnBoutonRandom(); 
            GrilleBouton.afficherGrilleSurConsole(); // a chaque fois qu'un bouton va être allumé on affiche la maj sur la console
            int[] resultat = GrilleBouton.cliquerBouton();           
            GrilleBouton.eteindreBoutonClique(resultat[0],resultat[1]); // on passe en parametre les coordonnées du bouton cliqué afin que seul celuici soit éteint 
            compteur ++;
        }
    }
    
    
}
