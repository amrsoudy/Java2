import java.util.ArrayList;


public class ClientRegulier extends Client{
	
	ArrayList<Film> listfilms = new ArrayList<Film>();
	
	
	
	public void Ajouterunfilm(Film f){
		
		listfilms.add(f);
		
		
		
	}

	@Override
	public double calclemontant() {
		double total = 0 ;
		
		for (Film f :listfilms ){
			
			total +=f.getPrix();
			
		}
		
		return total;
	}
	
	
	
	
	
	

}
