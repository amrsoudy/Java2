import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		int longe = 1;
		int large = 1;
		double total = 0;
		int i = 0;
		boolean flag = true;
		
		Scanner kb = new Scanner(System.in);
		
		Camion camion1 = new Camion() ;
		
		
		
		total = camion1.gettotal();
		
		
		while((total < camion1.getSurface()) && flag == true ){
				System.out.println("Saisir le dimenation d'un boite ");
				System.out.println("longueur : ");
				longe = kb.nextInt();
				System.out.println("largeur : ");
				large = kb.nextInt();
				if (longe == 0 || large == 0){
					System.out.println("tu a finir le sasier ");
							
					flag = false ;
				}
				if ((camion1.getSurface() >= camion1.gettotal()+(longe*large))&& flag){
					
					Boite boit = new Boite(longe,large);
					camion1.listboite.add(boit);
					total  =camion1.gettotal();
					System.out.println("le total est : " + total);
					System.out.println("le space rester en camion disponible est  "+ (camion1.getSurface()-total)+"et ca possible avec est diminsion  : "+((camion1.getSurface()-total)/2) +"  X  "+ ((camion1.getSurface()-total)/2));

					
				}else{
					
					System.out.println("le langeur et la longuer plus que le total surface de camion et le camion inclue maintenetant : " +total);
					System.out.println("le space rester en camion disponible est  "+ (camion1.getSurface()-total)+"et ca possible avec est diminsion  : "+((camion1.getSurface()-total)/2) +"  X  "+ ((camion1.getSurface()-total)/2));
					
					
				}
	
			
		}

		System.out.println("******************************************************");
		for (Boite b :camion1.listboite){
				i++;
				System.out.println("Boite "+i+" :"+b.getLargeur()+" X "+b.getLongeur() );
			}
		System.out.println("Donc le total camion boite surface mainteneat est  :  " + total);
		
	
	
		}
		
		
			
			
		
		}
		
		
		
	

	
	
	
	
	
	
	
	
	


