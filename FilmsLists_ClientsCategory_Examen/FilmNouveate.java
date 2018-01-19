
public class FilmNouveate extends Film{
	
	
	
	

	public FilmNouveate(double prix, String titre, String realisateur) {
		super(prix, titre, realisateur);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return this.prix*(1+0.20);
	}
	
	public String toString(){
		
		return "Nouveaute "+this.titre+"     the last jedi   "+this.getPrix();
		
		
	}

}
