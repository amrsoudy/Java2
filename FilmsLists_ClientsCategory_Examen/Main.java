import java.util.ArrayList;


public class Main {



	public static void main(String[] args) {
		
		ArrayList <Film> films = new ArrayList<Film>();
		
		FilmNouveate nov1 = new FilmNouveate(4,"xfiles","Amr") ;
		FilmPopulaire pop1 = new FilmPopulaire(4,"Super man ","Anis");
		FilmAuteur aut1 = new FilmAuteur(4,"xmen","adel");
		
		films.add(nov1);
		films.add(pop1);
		films.add(aut1);
		
		for (Film f :films){
			
			System.out.println(f);
			
		}
		
		
		ClientRegulier clientreg = new ClientRegulier() ;
		ClientVIP clientvip =new ClientVIP();
		
		clientreg.Ajouterunfilm(nov1);
		clientreg.Ajouterunfilm(pop1);
		clientreg.Ajouterunfilm(aut1);
		
		clientvip.Ajouterunfilm(nov1);
		clientvip.Ajouterunfilm(pop1);
		clientvip.Ajouterunfilm(aut1);
		
		
		System.out.println("pour la client regul "+clientreg.calclemontant());
		System.out.println("pour la client Vip "+clientreg.calclemontant());



	}

}
