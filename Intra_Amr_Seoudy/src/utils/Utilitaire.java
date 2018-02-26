/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 1795162
 */
public class Utilitaire {

    public Utilitaire() {
    }

    public double calculerIMG(double masse, double taille, int age, int sex) {
//         
        double img = (1.2 * masse / (taille * taille)) + (0.23 * age) - (10.8 * sex) - 5.4;

        return Math.round(img);
    }

    public boolean veriferTxt(JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4) {

        try {
            if (txt1.getText().isEmpty() || txt2.getText().isEmpty() || txt3.getText().isEmpty() || txt4.getText().isEmpty()) {

                throw new ValidException("tu dois Fill Tous les Fildes obligatoire Svp ");

            

            } else {
                return true;
            }

        } catch (ValidException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;

        }

    }

    public void Affechage(JTextField txt, JTextField txt2, double img, int sex) {
        txt2.setText(String.valueOf(img));

        if (sex == 0) {

            if (img < 25) {

                txt.setText("top maigre");
            } else if (img <= 30) {

                txt.setText("normal");
            } else if (img > 30) {

                txt.setText("top de graisse");
            } else {

                JOptionPane.showMessageDialog(null, "la data que saisir pas correct ");
            }

        } else if (sex == 1) {

            if (img < 15) {

                txt.setText("top maigre");
            } else if (img <= 20) {

                txt.setText("normal");
            } else if (img > 20) {

                txt.setText("top de graisse");
            } else {

                JOptionPane.showMessageDialog(null, "la data que saisir pas correct ");
            }

        }

    }

    public boolean veriferTxtCorrectNumbers(JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4) {

        if ((Integer.parseInt(txt1.getText()) == 0) || (Double.parseDouble(txt2.getText()) == 0) || (Integer.parseInt(txt3.getText()) == 0)) {

            return false;
        }

        return true;
    }

}
