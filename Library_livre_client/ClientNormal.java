
public class ClientNormal extends Client implements CNormal,Buyer{
	
	
	public ClientNormal(String name, int age, String sex, String type) {
		super.setName(name);
		this.setAge(age);
		this.setSex(sex);
		this.setType(type);
		
	}

	
	public void afficherleprix() {
			double total = 0 ;
			System.out.println("pour le client name : "+this.getName());

			for (Things th : clientlist){
				
				total += th.getPrix();
				System.out.println("le things name : "+th.getName()+"..Et le prix unitaire "+th.getPrix());
				
				
			}
			System.out.println(total);

		}

		
	}


