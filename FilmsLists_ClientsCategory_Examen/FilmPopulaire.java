
public class FilmPopulaire extends Film{

	public FilmPopulaire(double prix, String titre, String realisateur) {
		super(prix, titre, realisateur);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return this.prix*(1+.10);
	}
	
	public String toString(){
		
		
		return "Populaire  "+this.titre+"....."+this.getPrix();
	}

}
