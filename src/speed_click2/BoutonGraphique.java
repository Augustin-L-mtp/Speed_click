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
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/image/Bouton_Vide.png"));
    


    public BoutonGraphique (Bouton_SP unBouton) {
        boutonAssocie = unBouton;
    }
    
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        setIcon(img_vide); // on attribut l'image Bouton_vide
        
    }
    

}