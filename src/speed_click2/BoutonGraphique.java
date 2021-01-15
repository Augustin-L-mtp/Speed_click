/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speed_click2;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author augus
     */
public class BoutonGraphique extends JButton{
    Bouton_SP boutonAssocie;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/Images/Bouton_Vide.png"));
    ImageIcon img_luke = new javax.swing.ImageIcon(getClass().getResource("/Images/Bouton_Luke.png"));
    ImageIcon img_vador = new javax.swing.ImageIcon(getClass().getResource("/Images/Bouton_Vador.png"));
    ImageIcon img_yoda = new javax.swing.ImageIcon(getClass().getResource("/Images/Bouton_Yoda.png"));
    ImageIcon img_stormtrooper = new javax.swing.ImageIcon(getClass().getResource("/Images/Bouton_Stormtrooper.png"));



    public BoutonGraphique (Bouton_SP unBouton) {
        boutonAssocie = unBouton;
    }
    
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        if (boutonAssocie.estAllume == true) {
            
            if (boutonAssocie.Couleur.equals("stormtrooper")) {
                setIcon(img_stormtrooper); // il faudra cliquer sur les boutons luke skywalker pour le le click normal 
            }
            
            else if (boutonAssocie.Couleur.equals("vador"))
                setIcon(img_vador);
            
            
            else if (boutonAssocie.Couleur.equals("luke"))
                setIcon(img_luke);
            }
        
        else {
        setIcon(img_vide); // on attribut l'image Bouton_vide
        }
    }
    

}