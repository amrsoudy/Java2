package hypoth;

import java.awt.Component;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		//		double intret = (Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Donner moi le interet annual SVP")))/100;

		double intret = 0;
		int annee = 0;
		double montant_emprunte =0 ;
		boolean flag = true;
		
		
			while (flag){
				try{
					
				intret = (Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Donner moi le interet annual SVP")))/100;
				if (intret<0){
					
					throw new IllegalArgumentException ("  interet  dois etre positive   ");

				}else {
					
					flag = false;
				}

				}catch(IllegalArgumentException e){
					System.out.println(e.getMessage());
				
				

				}
			}

			while (!flag){
				try{
					
				annee =Integer.parseInt(javax.swing.JOptionPane.showInputDialog("par combien anne "));
				if (annee<0){
					
					throw new IllegalArgumentException (" l'anne mois de zero  cest pas possible ");
				}else {
					
					flag = true;
				}

				}catch(IllegalArgumentException e){
					System.out.println(e.getMessage());
				
				

				}
			}
			while (flag){
				try{
					
					 montant_emprunte = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("saisir le montant de hypothéque "));
					if ( montant_emprunte == 0){
							
							throw new IllegalArgumentException ("  montant_emprunte ne dois etre egale zero  ");
					}else {
					
					flag = false;
				}

				}catch(IllegalArgumentException e){
					System.out.println(e.getMessage());
				
				

				}
			}
			
	
		
		javax.swing.JOptionPane.showMessageDialog(null, "the rate is  : "+intret*100+" %"+" and the number of years is  :   "+annee+"  et la montant emprunte est :  "+montant_emprunte+" $ ");
		DecimalFormat df = new DecimalFormat("#.##");
		double payM = calcul(intret,annee, montant_emprunte);
		System.out.println("le montant chaque mois es t : "+df.format(payM));
		System.out.println("le total paye est  : "+df.format(payM*12*annee));
	}
	
	



	private static  double calcul(double rate, int years,double borrow) {
		double Tim = rate/12;
		
		double Map = (Tim * borrow)/(1-(1/fab((1+Tim),12*years)));
		
		return Map ;
	}





	public static double fab(double mont,int combien ){
		double somme =1;
		
		for (int i = 0;i<combien;i++ ){
			somme = mont*somme;
			
			
		}
		
		return somme;
		
	}

}
