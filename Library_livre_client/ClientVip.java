
public class ClientVip extends Client implements CVip,Buyer{
	
	
	public ClientVip(String name, int age, String sex, String type) {
		super.setName(name);
		this.setAge(age);
		this.setSex(sex);
		this.setType(type);;
	}
	public void afficherleprix() {
		double total = 0 ;
		System.out.println("pour le client name: "+this.getName());

		for (Things th : clientlist){
			
			total += (th.getPrix()-(th.getPrix()*10/100));
			System.out.println("le things name : "+th.getName()+"..Et le prix unitaire "+(th.getPrix()-(th.getPrix()*this.discount)));
			
			
		}
		System.out.println(total);

	}

}
