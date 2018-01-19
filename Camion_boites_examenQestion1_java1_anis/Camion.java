import java.util.ArrayList;


public class Camion {
	ArrayList <Boite>  listboite = new ArrayList <Boite>(); ;
	private final double surface = 500*300 ;

	
	

	
	public double getSurface() {
		return surface;
	}
	
	public void ajouterleboite(Boite b){
		if (b.getLongeur()*b.getLargeur() <= this.surface){
		
			
			listboite.add(b);

			
			
		}else {
			
			System.out.println("le camion est plain ");
			
		}

		
		
	}



	public boolean estPlein( ){
		
		return true;
		
		
	}
	
	public double gettotal(){
		double total = 0 ;

		for (Boite b :this.listboite){
			total+=b.getLongeur()*b.getLargeur();
		} 
		
		return total ;
	}


}
