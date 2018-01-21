import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
//Livreneveau(int noPages, String auter,String name,String category,double prix,int emprunt_duree)
		ListOfThings listofthings1 = new ListOfThings();
				
		Livreneveau livreN1 = new Livreneveau(500,"Amr Seoudy","Space over the moon",23);
		Livreneveau livreN2 = new Livreneveau(1200,"Mazen Seoudy","iot",44);
		Livreneveau livreN3 = new Livreneveau(20,"joodi Seoudy","la paraboui",10);
		
		LivreLang livreFrench = new LivreLang(200,"France","French",30);
		LivreLang livreEnglish = new LivreLang(300,"usa","English",22);
		LivreLang livreArabic = new LivreLang(400,"Egypt","Arabic",30);
		
		LivreEnfants livreenfants1 = new LivreEnfants(20,"Fahita","bonne designer",5);
		
		//( String actor,String name,double prix,double duree)
		DvdNeveau DvdNeveau1 = new DvdNeveau("omar el shireef ","Xfiles",6.80,2.5);
		DvdNeveau DvdNeveau2 = new DvdNeveau("faten ","zahp m3a el reeh",7,2);
		
		DvdNormal DvdNormal1 = new DvdNormal("stefin ","zoro",9.99,1.30);
			
		listofthings1.AjouterThings(livreN1);
		listofthings1.AjouterThings(livreN2);
		listofthings1.AjouterThings(livreN3);
		listofthings1.AjouterThings(livreFrench);
		listofthings1.AjouterThings(livreEnglish);
		listofthings1.AjouterThings(livreArabic);
		listofthings1.AjouterThings(livreenfants1);
		listofthings1.AjouterThings(DvdNeveau1);
		listofthings1.AjouterThings(DvdNeveau2);
		listofthings1.AjouterThings(DvdNormal1);
		
		listofthings1.afficherList();
		
		ClientNormal client1 =new ClientNormal("Amr",36,"M","Normal");
		
		client1.ajouterPanier(livreN1);
		client1.ajouterPanier(DvdNormal1);

		ClientVip client2 =new ClientVip("Mazen",8,"M","Vip");
		client2.ajouterPanier(livreenfants1);
		
		
		
		client1.afficherleprix();
		client2.afficherleprix();
		
		//print les article que disponible 
		listofthings1.afficherListDisponible();
		listofthings1.afficherListPasDis();
		
		
		
	

		
		




		
		
		


		
		


	}

}
