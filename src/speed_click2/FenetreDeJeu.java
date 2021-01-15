/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speed_click2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import javax.swing.JLabel;
import java.awt.event.*;
import javax.swing.ImageIcon;

/**
 *
 * @author julie
 */
public class FenetreDeJeu extends javax.swing.JFrame {

    /**
     * Creates new form FenetreDeJeu
     */
    int compteur = 0;
    Grille_SP GrilleBouton = new Grille_SP();
    String nomJoueur;
    //Timer timer;
    JLabel counterLabel;
    int tempsRestant = 15;
    boolean click = false;

    public FenetreDeJeu() {
        initComponents();
        ImageIcon img_Gif1 = new javax.swing.ImageIcon(getClass().getResource("/Images/Gif_1.gif"));
        ImageIcon img_Gif2 = new javax.swing.ImageIcon(getClass().getResource("/Images/faucon_millenium.gif"));
        ImageIcon img_vitesse_lumiere = new javax.swing.ImageIcon(getClass().getResource("/Images/vitesse_lumiere.png"));

        gif1.setIcon(img_Gif1);
        gif2.setIcon(img_Gif2);
        image_fond.setIcon(img_vitesse_lumiere);
        
        panneau_fond.setVisible(false); // au début on affiche que les gif 
        panneau_regle.setVisible(false);
        panneau_joueur.setVisible(false);
        panneau_timer.setVisible(false);
        panneau_score.setVisible(false);
        panneau_grille.setVisible(false);
        panneau_yoda.setVisible(false);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                BoutonGraphique boutonGraph = new BoutonGraphique(GrilleBouton.GrilleJeu[i][j]);
                panneau_grille.add(boutonGraph);

                boutonGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Bouton_SP b = boutonGraph.boutonAssocie;

                        if (b.estAllume == false) {
                            return;
                        } 
                        else if (b.Couleur.equals("stormtrooper") )  {
                            zone_text.setText("un stormtrooper de moins");
                            b.eteindreUnBouton();
                            click = true;
                            compteur++;
                            nombre_click.setText(compteur + "");
                            
                            
                            for (int i = 0; i < 7; i++) {
                                for (int j = 0; j < 7; j++) {
                                    if (GrilleBouton.GrilleJeu[i][j].Couleur.equals("vador") || GrilleBouton.GrilleJeu[i][j].Couleur.equals("luke")) {
                                        GrilleBouton.GrilleJeu[i][j].eteindreUnBouton();
                                    }
                                }
                            }
                            
                            jouer();
                        }
                        
                        else if (b.Couleur.equals("vador") ) {
                            zone_text.setText("La force tu ne maitrise pas assez pour vaincre vador"); 
                            b.eteindreUnBouton();
                            compteur--;
                            nombre_click.setText(compteur + "");
                                                       
                            for (int i = 0; i < 7; i++) {
                                for (int j = 0; j < 7; j++) {
                                    if (GrilleBouton.GrilleJeu[i][j].Couleur.equals("stormtrooper") || GrilleBouton.GrilleJeu[i][j].Couleur.equals("luke")) {
                                        GrilleBouton.GrilleJeu[i][j].eteindreUnBouton();
                                    }
                                }
                            }
                            jouer();
                        }
                        
                        else if (b.Couleur.equals("luke") ) {
                            zone_text.setText("Jamais je ne viendrais du coté obscur"); 
                            b.eteindreUnBouton();
                            compteur = compteur + 2;
                            nombre_click.setText(compteur + "");
                            panneau_grille.repaint();
                            for (int i = 0; i < 7; i++) {
                                for (int j = 0; j < 7; j++) {
                                    if (GrilleBouton.GrilleJeu[i][j].Couleur.equals("stormtrooper") || GrilleBouton.GrilleJeu[i][j].Couleur.equals("vador")) {
                                        GrilleBouton.GrilleJeu[i][j].eteindreUnBouton();
                                    }
                                }
                            }
                            jouer();
                        }
                        else if (b.Couleur.equals("yoda") ) {
                            zone_text.setText("Jamais je ne viendrais du coté obscur"); 
                            b.eteindreUnBouton();
                            timer.stop();
                            panneau_yoda.setVisible(false);
                            Random alea = new Random(); 
                            int x = alea.nextInt(4);
                            switch (x) {
                                case 1:
                                    Jtext_yoda.setText("Comment s'appelle maître de Obi-Wan Kenobi\n\nRéponse 1 : Maître Windu\nRéponse 2 : Maître qui-Gon Jy");
                            }
                        }

                    }

                });
            }
        }
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_yoda = new javax.swing.JPanel();
        javax.swing.JButton bouton_reponse2 = new javax.swing.JButton();
        bouton_reponse1 = new javax.swing.JButton();
        Jtext_yoda = new javax.swing.JTextArea();
        panneau_regle = new javax.swing.JPanel();
        bouton_regle = new javax.swing.JButton();
        texte_regle = new javax.swing.JTextArea();
        panneau_Gif1 = new javax.swing.JPanel();
        gif1 = new javax.swing.JLabel();
        bouton_gif = new javax.swing.JButton();
        gif2 = new javax.swing.JLabel();
        panneau_grille = new javax.swing.JPanel();
        panneau_joueur = new javax.swing.JPanel();
        jLabel_nomJoueur = new javax.swing.JLabel();
        nom_Joueur = new javax.swing.JTextField();
        jLabel_phrase = new javax.swing.JLabel();
        bouton_start = new javax.swing.JButton();
        panneau_score = new javax.swing.JPanel();
        jlabel_infoJeu = new javax.swing.JLabel();
        jlabel_nbClic = new javax.swing.JLabel();
        nombre_click = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        zone_text = new javax.swing.JTextArea();
        panneau_timer = new javax.swing.JPanel();
        jlabel_tpsRestant = new javax.swing.JLabel();
        case_temps = new javax.swing.JLabel();
        panneau_fond = new javax.swing.JPanel();
        image_fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bouton_reponse2.setText("Réponse 2");

        bouton_reponse1.setText("Réponse 1 ");
        bouton_reponse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_reponse1ActionPerformed(evt);
            }
        });

        Jtext_yoda.setColumns(20);
        Jtext_yoda.setRows(5);

        javax.swing.GroupLayout panneau_yodaLayout = new javax.swing.GroupLayout(panneau_yoda);
        panneau_yoda.setLayout(panneau_yodaLayout);
        panneau_yodaLayout.setHorizontalGroup(
            panneau_yodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_yodaLayout.createSequentialGroup()
                .addContainerGap(370, Short.MAX_VALUE)
                .addComponent(bouton_reponse1)
                .addGap(235, 235, 235)
                .addComponent(bouton_reponse2)
                .addGap(363, 363, 363))
            .addGroup(panneau_yodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panneau_yodaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Jtext_yoda, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panneau_yodaLayout.setVerticalGroup(
            panneau_yodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_yodaLayout.createSequentialGroup()
                .addContainerGap(687, Short.MAX_VALUE)
                .addGroup(panneau_yodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bouton_reponse2)
                    .addComponent(bouton_reponse1))
                .addGap(40, 40, 40))
            .addGroup(panneau_yodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panneau_yodaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Jtext_yoda, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(panneau_yoda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 750));

        panneau_regle.setBackground(new java.awt.Color(0, 0, 0));

        bouton_regle.setText("suivant");
        bouton_regle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_regleActionPerformed(evt);
            }
        });

        texte_regle.setBackground(new java.awt.Color(0, 0, 0));
        texte_regle.setColumns(20);
        texte_regle.setRows(5);

        javax.swing.GroupLayout panneau_regleLayout = new javax.swing.GroupLayout(panneau_regle);
        panneau_regle.setLayout(panneau_regleLayout);
        panneau_regleLayout.setHorizontalGroup(
            panneau_regleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panneau_regleLayout.createSequentialGroup()
                .addContainerGap(1048, Short.MAX_VALUE)
                .addComponent(bouton_regle, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(panneau_regleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panneau_regleLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(texte_regle, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panneau_regleLayout.setVerticalGroup(
            panneau_regleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_regleLayout.createSequentialGroup()
                .addContainerGap(697, Short.MAX_VALUE)
                .addComponent(bouton_regle)
                .addGap(30, 30, 30))
            .addGroup(panneau_regleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panneau_regleLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(texte_regle, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(panneau_regle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 750));

        panneau_Gif1.setBackground(new java.awt.Color(0, 0, 0));
        panneau_Gif1.setAutoscrolls(true);

        bouton_gif.setText("Que la force soit avec toi jeune padawan");
        bouton_gif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_gifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panneau_Gif1Layout = new javax.swing.GroupLayout(panneau_Gif1);
        panneau_Gif1.setLayout(panneau_Gif1Layout);
        panneau_Gif1Layout.setHorizontalGroup(
            panneau_Gif1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panneau_Gif1Layout.createSequentialGroup()
                .addContainerGap(353, Short.MAX_VALUE)
                .addGroup(panneau_Gif1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gif2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panneau_Gif1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panneau_Gif1Layout.createSequentialGroup()
                            .addComponent(bouton_gif, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panneau_Gif1Layout.createSequentialGroup()
                            .addComponent(gif1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(227, 227, 227)))))
        );
        panneau_Gif1Layout.setVerticalGroup(
            panneau_Gif1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_Gif1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(gif1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(gif2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(bouton_gif)
                .addGap(29, 29, 29))
        );

        getContentPane().add(panneau_Gif1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 750));

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(7, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 672, 672));

        panneau_joueur.setBackground(new java.awt.Color(204, 255, 204));

        jLabel_nomJoueur.setText("Nom Joueur ");

        nom_Joueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_JoueurActionPerformed(evt);
            }
        });

        jLabel_phrase.setText("Prêt à éclater le record ?");

        bouton_start.setText("Start");
        bouton_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panneau_joueurLayout = new javax.swing.GroupLayout(panneau_joueur);
        panneau_joueur.setLayout(panneau_joueurLayout);
        panneau_joueurLayout.setHorizontalGroup(
            panneau_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_joueurLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panneau_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panneau_joueurLayout.createSequentialGroup()
                        .addComponent(jLabel_nomJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nom_Joueur, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panneau_joueurLayout.createSequentialGroup()
                        .addComponent(jLabel_phrase, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(bouton_start, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panneau_joueurLayout.setVerticalGroup(
            panneau_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_joueurLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panneau_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nomJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom_Joueur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(panneau_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_phrase, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bouton_start, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        getContentPane().add(panneau_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 310, 150));

        panneau_score.setBackground(new java.awt.Color(204, 255, 204));

        jlabel_infoJeu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel_infoJeu.setText("Infos Jeu :");

        jlabel_nbClic.setText("Nombre de clique :");

        nombre_click.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nombre_click.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        zone_text.setColumns(20);
        zone_text.setRows(5);
        jScrollPane1.setViewportView(zone_text);

        javax.swing.GroupLayout panneau_scoreLayout = new javax.swing.GroupLayout(panneau_score);
        panneau_score.setLayout(panneau_scoreLayout);
        panneau_scoreLayout.setHorizontalGroup(
            panneau_scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_scoreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panneau_scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panneau_scoreLayout.createSequentialGroup()
                        .addGroup(panneau_scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel_infoJeu, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabel_nbClic))
                        .addGap(38, 38, 38)
                        .addComponent(nombre_click, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panneau_scoreLayout.setVerticalGroup(
            panneau_scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_scoreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panneau_scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombre_click, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panneau_scoreLayout.createSequentialGroup()
                        .addComponent(jlabel_infoJeu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlabel_nbClic)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panneau_score, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, 310, 220));

        panneau_timer.setBackground(new java.awt.Color(204, 255, 204));

        jlabel_tpsRestant.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel_tpsRestant.setText("Temps restant :");

        case_temps.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        case_temps.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panneau_timerLayout = new javax.swing.GroupLayout(panneau_timer);
        panneau_timer.setLayout(panneau_timerLayout);
        panneau_timerLayout.setHorizontalGroup(
            panneau_timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_timerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel_tpsRestant)
                .addGap(18, 18, 18)
                .addComponent(case_temps, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );
        panneau_timerLayout.setVerticalGroup(
            panneau_timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_timerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panneau_timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panneau_timerLayout.createSequentialGroup()
                        .addComponent(jlabel_tpsRestant, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(case_temps, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(panneau_timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 310, 120));

        image_fond.setText("jLabel3");
        image_fond.setAlignmentY(0.0F);

        javax.swing.GroupLayout panneau_fondLayout = new javax.swing.GroupLayout(panneau_fond);
        panneau_fond.setLayout(panneau_fondLayout);
        panneau_fondLayout.setHorizontalGroup(
            panneau_fondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image_fond, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
        );
        panneau_fondLayout.setVerticalGroup(
            panneau_fondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_fondLayout.createSequentialGroup()
                .addComponent(image_fond, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(panneau_fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bouton_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_startActionPerformed
        panneau_timer.setVisible(true);
        panneau_score.setVisible(true);
        initialiserPartie();
        panneau_Gif1.setVisible(false);
        panneau_grille.setVisible(true);
        bouton_start.setEnabled(false);
        panneau_grille.repaint();
        case_temps.setText(tempsRestant + "");
        timer.start();

    }//GEN-LAST:event_bouton_startActionPerformed

    private void nom_JoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_JoueurActionPerformed

    }//GEN-LAST:event_nom_JoueurActionPerformed

    private void bouton_gifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_gifActionPerformed
        
        panneau_Gif1.setVisible(false); // quand le bouton est appuyé on enlève les gif
        bouton_gif.setEnabled(false);  // bouton désactivé
        bouton_gif.setVisible(false); // bouton enlevé
        panneau_regle.setVisible(true); // on affiche le panneau règle
        
        texte_regle.setFont(new Font("Serif",Font.BOLD,25));
        texte_regle.setForeground(Color.YELLOW);
        texte_regle.setText("Bonjour jeune Padawan," +'\n'+'\n'+ "L'empire est plus puissant que jamais,\nIl a construit une nouvelle station spatiale appelée Etoile de la mort\nTa mission est d'aider les armées de l'Alliance à combattre les forces du mal\n\nUtilise ta souris laser pour dézinguer les Stormtroopers\nAttention, ne combat pas Vador tout seul ou tu le regretteras\nPendant le combat, utilise l'aide que maître Luke et maître Yoda t'apporteront\nLuke te donnera de la force pour tuer plus de Stormtrooper\nYoda te fera gagner du temps, mais il sera énigmatique, comme toujours...\n\n\nVoici le message que maître Yoda m'a demandé de te transmettre :\n\nUne grande confiance en toi je perçois,\nMais, faire attention au côté obscur tu dois\nLa peur est le chemin vers le côté obscur : \nla peur mène à la colère, la colère mène à la haine, la haine … mène à la souffrance\nA tes intuitions te fier, il faut.\n\n\nQue la force soit avec toi jeune Padawan");
        
    }//GEN-LAST:event_bouton_gifActionPerformed

    private void bouton_regleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_regleActionPerformed
        panneau_regle.setVisible(false); // on enleve le panneau regle
        panneau_fond.setVisible(true); // on affiche le fond de jeu
        
        panneau_joueur.setVisible(true); // on affiche le panneau avec les infos joueur
        panneau_grille.setVisible(true); // on affiche la grille
        panneau_grille.repaint();
// TODO add your handling code here:
    }//GEN-LAST:event_bouton_regleActionPerformed

    private void bouton_reponse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_reponse1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bouton_reponse1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreDeJeu().setVisible(true);
            }
        });
    }

    public void initialiserPartie() {

        nomJoueur = nom_Joueur.getText();

        System.out.println("Commencer, la partie va bientôt");
        //System.out.println("Etes-vous prêt ? Repondez par oui ou vous recommencerez");

        //Timer timer = new Timer();
        GrilleBouton.allumerUnBoutonRandom();
        
    }

    public void jouer() {
        
        
        
        GrilleBouton.allumerUnBoutonRandom();
        panneau_grille.repaint();
    }

    


        Timer timer = new Timer(1000, new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempsRestant--;

                if (tempsRestant >= 0) {
                case_temps.setText(tempsRestant + "");
                }
                
                if (tempsRestant == 0) {
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 7; j++) {
                            GrilleBouton.GrilleJeu[i][j].eteindreUnBouton();  
                            panneau_grille.repaint();
                            timer.stop();
                        }
                    }
                }
            }
        });
        
    
    
    public void allumerUnBoutonRandom(){ //cette methode allume un bouton au hasard
        int a; int b; int c; int d; int e;
        Random alea = new Random(); 
        a = alea.nextInt(7); // la variable a va contenir un nombre aleatoire entre 0 et 6 
        b = alea.nextInt(7); // la variable b va contenir un nombre aleatoire entre 0 et 6 
        GrilleBouton.GrilleJeu[a][b].allumerUnBouton(); // on appelle la methode pour allumer le bouton correspondant à la case [a][b]
        // la variable estAllume va donc passer de fals a true 
        
        c = alea.nextInt(3); // tirage d'un chiffre entre 0 et 3 
        if (c == 1) {  // si ce chiffre est 3 on va faire apparaitre un bouton piège (Maitre vador est trop puissant)
            int x = alea.nextInt(7);
            int y = alea.nextInt(7);
            while (GrilleBouton.GrilleJeu[x][y] == GrilleBouton.GrilleJeu[a][b]) { // on vérifie qu'on allume pas deux fois le meme bouton
                x = alea.nextInt(7);
                y = alea.nextInt(7);
            }
            GrilleBouton.GrilleJeu[x][y].allumerUnBouton();
            GrilleBouton.GrilleJeu[x][y].colorationBouton("vador");
        }
        
        d = alea.nextInt(4);
        if (d == 2) {  // si ce chiffre est 2 on va faire apparaitre un bouton bonus (Maitre luke va nous régaler)
            int p = alea.nextInt(7);
            int q = alea.nextInt(7);
            while (GrilleBouton.GrilleJeu[p][q] == GrilleBouton.GrilleJeu[a][b]) {
                p = alea.nextInt(7);
                q = alea.nextInt(7);
            }
            GrilleBouton.GrilleJeu[p][q].allumerUnBouton();
            GrilleBouton.GrilleJeu[p][q].colorationBouton("luke");
        }
        e = alea.nextInt(3);
        if (e == 2) {  // si ce chiffre est 2 on va faire apparaitre un bouton bonus (Maitre luke va nous régaler)
            int v = alea.nextInt(7);
            int w = alea.nextInt(7);
            while (GrilleBouton.GrilleJeu[a][b] == GrilleBouton.GrilleJeu[v][w]) {
                v = alea.nextInt(7);
                w = alea.nextInt(7);
            }
            GrilleBouton.GrilleJeu[v][w].allumerUnBouton();
            GrilleBouton.GrilleJeu[v][w].colorationBouton("yoda");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Jtext_yoda;
    private javax.swing.JButton bouton_gif;
    private javax.swing.JButton bouton_regle;
    private javax.swing.JButton bouton_reponse1;
    private javax.swing.JButton bouton_start;
    private javax.swing.JLabel case_temps;
    private javax.swing.JLabel gif1;
    private javax.swing.JLabel gif2;
    private javax.swing.JLabel image_fond;
    private javax.swing.JLabel jLabel_nomJoueur;
    private javax.swing.JLabel jLabel_phrase;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel_infoJeu;
    private javax.swing.JLabel jlabel_nbClic;
    private javax.swing.JLabel jlabel_tpsRestant;
    private javax.swing.JTextField nom_Joueur;
    private javax.swing.JLabel nombre_click;
    private javax.swing.JPanel panneau_Gif1;
    private javax.swing.JPanel panneau_fond;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_joueur;
    private javax.swing.JPanel panneau_regle;
    private javax.swing.JPanel panneau_score;
    private javax.swing.JPanel panneau_timer;
    private javax.swing.JPanel panneau_yoda;
    private javax.swing.JTextArea texte_regle;
    private javax.swing.JTextArea zone_text;
    // End of variables declaration//GEN-END:variables

}
