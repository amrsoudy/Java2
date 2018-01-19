
public class Boite {
	
	private int longeur;
	private int largeur ;
	
	
	
	public Boite(int longeur, int largeur) {
		super();
		this.longeur = longeur;
		this.largeur = largeur;
	}


	public int getLongeur() {
		return longeur;
	}

	
	public void setLongeur(int longeur) {
		this.longeur = longeur;
	}
	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}


	@Override
	public String toString() {
		return "longeur=" + longeur + ", largeur=" + largeur ;
	}
	
	

}
