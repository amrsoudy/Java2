package utils;

import java.text.DecimalFormat;
import java.util.Scanner;

import model.Client;
import model.Hypo;

public class Utilitaire {
	Scanner kb = new Scanner(System.in);

	public static void saisierInfo(Hypo hypo) throws MonException, NumberFormatException {
		boolean flag = true;

		double mount, taux = 0;
		int anne = 0;
		while (flag) {
			try {
				taux = ((Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Sasir le taux SVP "))));
				if (taux <= 0) {

					throw new MonException("le taux dois etre positive Svp");
				} else {
					hypo.setTaux(taux);
					flag = false;

				}
			} catch (MonException m) {
				javax.swing.JOptionPane.showMessageDialog(null, m.getMessage());

			} catch (NumberFormatException n) {

				javax.swing.JOptionPane.showMessageDialog(null, "dois etre numeric et pas vide ");

			}
		}
		while (!flag) {
			try {
				anne = (Integer.parseInt(javax.swing.JOptionPane.showInputDialog("par combien anne ")));
				if (anne <= 0) {

					throw new MonException("l'anne dois etre positive Svp");
				} else {
					hypo.setAnnee(anne);
					flag = true;

				}
			} catch (MonException m) {
				javax.swing.JOptionPane.showMessageDialog(null, m.getMessage());

			} catch (NumberFormatException n) {

				javax.swing.JOptionPane.showMessageDialog(null, "dois etre numeric et pas vide ");

			}
		}
		while (flag == true) {
			try {
				mount = (Double.parseDouble(javax.swing.JOptionPane.showInputDialog(null, "Combien le mountant SVP")));
				if (mount <= 0) {

					throw new MonException("l'mountant dois etre positive Svp");
				} else {
					hypo.setMountant(mount);
					flag = false;

				}
			} catch (MonException m) {
				javax.swing.JOptionPane.showMessageDialog(null, m.getMessage());

			} catch (NumberFormatException n) {
				javax.swing.JOptionPane.showMessageDialog(null, "dois etre numeric et pas vide ");

			}
		}

	}

	public static Double calculMap(Client c) {
		double tim = (c.getHypo().getTaux() / 12);
		double map = (tim * c.getHypo().getMountant()) / (1 - (1 / (fab((1 + tim), 12 * c.getHypo().getAnnee()))));
		return map;

	}

	public static double fab(double mont, int combien) {// (2,3)
		double somme = 1;

		for (int i = 0; i <= combien; i++) {
			somme = mont * somme;

		}

		return somme;

	}

	public static void Affichage(Client c) {

		javax.swing.JOptionPane.showMessageDialog(null,
				"the rate is  : " + c.getHypo().getTaux() * 100 + " %" + " and the number of years is  :   "
						+ c.getHypo().getAnnee() + "  et la montant emprunte est :  " + c.getHypo().getMountant()
						+ " $ ");

		DecimalFormat df = new DecimalFormat("#.##");

		javax.swing.JOptionPane.showMessageDialog(null,
				"le mountant Mansual est : " + (df.format(Utilitaire.calculMap(c))) + " $");
		javax.swing.JOptionPane.showMessageDialog(null, "le mountant Total en fin : "
				+ ((df.format(Utilitaire.calculMap(c) * (12 * c.getHypo().getAnnee()))) + " $"));
		;

	}

}
