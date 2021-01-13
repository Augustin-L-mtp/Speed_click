/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speed_click2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author augus
 */
public class Grille_SP {
    Bouton_SP [][] GrilleJeu; 
    
    public Grille_SP(){ //constructeur qui initialise la grille 
        GrilleJeu = new Bouton_SP[7][7]; // on créer objet grille jeu de la classe bouton qui est un tableau de taille 49 donc 7*7
        for (int i = 0; i<7; i++) { // 7 lignes de 0 à 6
            for (int j = 0; j < 7; j++) { // 7 colonnes de 0 à 6
                GrilleJeu[i][j] = new Bouton_SP(); //,on place un bouton a chaque coordonnées de la grille  
                GrilleJeu[i][j].estAllume = false; // on initialise chaque bouton en mode eteint (false)
            }
        }
    }
    
    public void allumerUnBoutonRandom(){ //cette methode allume un bouton au hasard
        int a; int b; int c;
        Random alea = new Random(); 
        a = alea.nextInt(7); // la variable a va contenir un nombre aleatoire entre 0 et 6 
        b = alea.nextInt(7); // la variable b va contenir un nombre aleatoire entre 0 et 6 
        GrilleJeu[a][b].allumerUnBouton(); // on appelle la methode pour allumer le bouton correspondant à la case [a][b]
        // la variable estAllume va donc passer de fals a true 
        GrilleJeu[a][b].colorationBouton("stormtrooper");
        
        c = alea.nextInt(3); // tirage d'un chiffre entre 0 et 4 
        
        if (c == 1) {  // si ce chiffre est 3 on va faire apparaitre un bouton piège (Maitre vador est trop puissant)
            int x = alea.nextInt(7);
            int y = alea.nextInt(7);
            while (GrilleJeu[a][b] == GrilleJeu[x][y]) {
                x = alea.nextInt(7);
                y = alea.nextInt(7);
            }
            GrilleJeu[x][y].allumerUnBouton();
            GrilleJeu[x][y].colorationBouton("vador");
        }
        
        

    }
    
    public void eteindreBoutonClique(int a, int b) { // cette methode eteint le bouton qui a été cliqué        
        
        if (GrilleJeu[a][b].estAllume == true ) {// on vérifie que le bouton etait bien allumé 
        GrilleJeu[a][b].eteindreUnBouton(); // on eteint donc le bouton qui vient d'être cliqué
        }
    }        


    public boolean verificationBoutonClique(int a, int b) {
        return GrilleJeu[a][b].estAllume;
    }
    
    void afficherGrilleSurConsole() {
 
        //  on affiche d'abord la ligne du haut car c'est une boucle inversée
        for (int i=0; i<7; i++) {
            System.out.println();
            for (int j=0; j<7; j++) {
                if(GrilleJeu[i][j].estAllume == false){
                    System.out.print(" B "); //B pour pouton Blanc donc lorsqu'ils sont éteint 
                }
                  else if (GrilleJeu[i][j].estAllume == true) {
                    System.out.print(" V "); // V pour bouton vert donc un bouton allumé 
                } 
                
            }
            System.out.print(" " + (i+1));
        }
        System.out.println();
        for(int i=0; i<7;i++){
            
            System.out.print(" " + (i+1) + " ");
        }
            System.out.println();

    }
    
    public int[] cliquerBouton() {
        Scanner sc = new Scanner(System.in); // le joueur va ecrire les coordonnées du bouton à éteindre 
        System.out.println("saisissez la ligne entre 1 et 7");
        int a = sc.nextInt() -1;
        System.out.println("saisissez la colonne entre 1 et 7");
        int b = sc.nextInt() -1;
        
        
        // on vérifie que le joueur saisisse des coordonnées valide qu'elles correspondent à un bouton allumé
        while (a>7 || b>7 || GrilleJeu[a][b].estAllume != true) { 
            System.out.println("Vous avez du faire une erreur dans votre saisie");
            afficherGrilleSurConsole();
            System.out.println("Saisissez la ligne entre 1 et 7");
             a = sc.nextInt() -1;
            System.out.println("Saisissez la colonne entre 1 et 7");
             b = sc.nextInt() -1;            
        }
             
        int[] resultat = {a, b}; // on stocke les coordonnées du bouton cliqué dans un tableau ed taille 2 
        return resultat;
    }
}
