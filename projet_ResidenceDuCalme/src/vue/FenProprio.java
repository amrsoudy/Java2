/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import vue.*;
import exception.DataException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modele.Appartement;
import modele.Responsable;
import modele.Usager;
import persistance.ManipulationFichier;

import utils.Utilitaire;

/**
 *
 * @author 1795657
 */
public class FenProprio extends javax.swing.JFrame {

    /**
     * Creates new form FenTypeAppartement
     */
    public FenProprio() {
        initComponents();
        cbxProvince.setSelectedItem("Québec");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_images = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAjouter = new javax.swing.JButton();
        btnQuitter = new javax.swing.JButton();
        txtCNom = new javax.swing.JTextField();
        txtCPrenom = new javax.swing.JTextField();
        txtCtel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNoCivique = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAdresse = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbxProvince = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtVille = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCodePostal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajouter le proprio");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_images.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Client.png"))); // NOI18N

        jLabel2.setText("Nom:");

        jLabel3.setText("Prénom:");

        jLabel5.setText("Tel :");

        btnAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Yes.png"))); // NOI18N
        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnQuitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit.png"))); // NOI18N
        btnQuitter.setText("Quitter");
        btnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitterActionPerformed(evt);
            }
        });

        txtCNom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtCNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNomActionPerformed(evt);
            }
        });

        txtCPrenom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel6.setText("No Civique:");

        jLabel7.setText("Adresse:");

        txtAdresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdresseActionPerformed(evt);
            }
        });

        jLabel8.setText("Province:");

        cbxProvince.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alberta", "Colombie-Britannique", "Île-du-Prince-Édouard", "Manitoba", "Nouveau-Brunswick", "Nouvelle-Écosse", "Ontario", "Québec", "Saskatchewan", "Terre-Neuve ", "Labrador" }));

        jLabel9.setText("Ville:");

        jLabel4.setText("Code Postal:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_images, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 129, Short.MAX_VALUE)
                        .addComponent(btnAjouter)
                        .addGap(33, 33, 33)
                        .addComponent(btnQuitter))
                    .addComponent(txtCtel)
                    .addComponent(txtAdresse)
                    .addComponent(txtCPrenom)
                    .addComponent(txtCNom)
                    .addComponent(txtVille)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(txtNoCivique, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(cbxProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(txtCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(txtCNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCtel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNoCivique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuitter, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAjouter, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addComponent(lbl_images, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitterActionPerformed
        dispose();
    }//GEN-LAST:event_btnQuitterActionPerformed

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        try {
            //Nom du fichier
            boolean valeur= false;
            String nomProprio = txtCNom.getText();
            String prenomProprio = txtCPrenom.getText();
            String telProprio = txtCtel.getText();
            int noCivique = Integer.parseInt(txtNoCivique.getText());
            String adresse = txtAdresse.getText();
            String province = (String) cbxProvince.getSelectedItem();
            String ville = txtVille.getText();
            String codePostal = txtCodePostal.getText();            
            Responsable proprio = new Responsable(nomProprio, prenomProprio, telProprio, noCivique, adresse, province, ville, codePostal);
            String ligne = Utilitaire.retournerLigneFichier(proprio);
            ManipulationFichier.ecrireFichier("Proprietaires.txt", ligne, valeur);
            JOptionPane.showMessageDialog(null,
                    "Opération réussie avec succès", "PROPRIO",
                    JOptionPane.INFORMATION_MESSAGE);
            requestFocusInWindow();
            viderChamps();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    ex.getMessage(), "EXCEPTION",
                    JOptionPane.ERROR_MESSAGE);
            requestFocusInWindow();
            viderChamps();
        }
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void viderChamps() {
        txtCNom.setText("");
        txtCPrenom.setText("");
        txtCtel.setText("");
        txtNoCivique.setText("");
        txtAdresse.setText("");
        cbxProvince.setSelectedItem("Québec");
        txtVille.setText("");
        txtCodePostal.setText("");
    }


    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void txtCNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCNomActionPerformed

    private void txtAdresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdresseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnQuitter;
    private javax.swing.JComboBox<String> cbxProvince;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_images;
    private javax.swing.JTextField txtAdresse;
    private javax.swing.JTextField txtCNom;
    private javax.swing.JTextField txtCPrenom;
    private javax.swing.JTextField txtCodePostal;
    private javax.swing.JTextField txtCtel;
    private javax.swing.JTextField txtNoCivique;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
}