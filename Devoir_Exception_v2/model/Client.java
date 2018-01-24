package model;

import utils.MonException;
import utils.Utilitaire;

public class Client {
	String name;
	Hypo hypo =new Hypo();

	public Hypo getHypo() {
		return hypo;
	}

	public void setHypo(Hypo hypo) {
		this.hypo = hypo;
	}

	public Client(String name) throws MonException {
		this.name = name ;
		
		
		Utilitaire.saisierInfo(this.hypo);
		
		
	}	

	

	
	
	
	
	
	

}
