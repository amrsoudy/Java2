
public class FilmAuteur extends Film  {

	public FilmAuteur(double prix, String titre, String realisateur) {
		super(prix, titre, realisateur);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return this.prix*(1-.15);
	}
	
	
	public String toString(){
		
		
		return "Auteur   "+this.titre+"....."+this.getPrix();
	}

}
