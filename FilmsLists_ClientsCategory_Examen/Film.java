
public abstract class Film {
	 double prix ;
	 String titre ;
	 String  realisateur ;
	
	
	
	
	
	public Film(double prix, String titre, String realisateur) {
		
		this.prix = prix;
		this.titre = titre;
		this.realisateur = realisateur;
	}




	public abstract double getPrix();
	

}
