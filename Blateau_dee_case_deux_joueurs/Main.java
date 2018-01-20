import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner kb =new Scanner(System.in);
		
		System.out.println("Enter le primier joueur nom SVP");
		Joueur joueur1 = new Joueur(kb.next());
		
		System.out.println("Enter le deuxieme joueur nom SVP");
		Joueur joueur2 = new Joueur(kb.next());
		
		Blateau blateau = new Blateau(joueur1,joueur2);
		
		

		
		

	}

}
