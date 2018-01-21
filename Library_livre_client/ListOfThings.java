import java.util.ArrayList;

public class ListOfThings {
	ArrayList<Things> listThings = new ArrayList<>();

	
	
	public void AjouterThings(Things th){
		
		listThings.add(th);
		
	}
	public void afficherList(){
		System.out.println("le list disponible ------->");
		
		for(Things th:this.listThings){
		
			System.out.println(th.getName());
		}
		System.out.println("**************************");
	}			

	public void afficherListDisponible(){
		
		for(Things th:this.listThings){
			if(th.isIsdis()==true){
				System.out.print(th.getName()+"--");
			}
		}
		System.out.println();
	}			
	public void afficherListPasDis(){
		
		for(Things th:this.listThings){
			if(th.isIsdis()==false){
				System.out.print(th.getName()+"--");
			}
		}
		System.out.println();
	}	
}
