package model;

public class Hypo {
	private Double taux;
	private int annee;
	private double mountant;
	
	public Hypo(){
	}
	
	public Double getTaux() {
		return taux;
	}
	public void setTaux(Double taux) {
		this.taux = taux/100;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public double getMountant() {
		return mountant;
	}
	public void setMountant(double mountant) {
		this.mountant = mountant;
	}

	
	

	

}
