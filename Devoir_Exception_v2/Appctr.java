import model.Client;
import utils.MonException;
import utils.Utilitaire;

public class Appctr {

	public static void main(String[] args) {
		
		try{
		Client client1 = new Client("Amr");
		Utilitaire.Affichage(client1);
		}catch(MonException e){
			
			javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
			
		}catch(NumberFormatException n){
			javax.swing.JOptionPane.showMessageDialog(null,n.getMessage());
			

			
		}
		
		
		
		
		
		

	}

}
