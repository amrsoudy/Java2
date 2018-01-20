
public class CaseBond extends Case{
	
	
	
	
	public CaseBond (int bondval){
		super.setType("Bond");
		super.setBondVal(bondval);

		
	}
	
	
	public int calcul(int val1, int val2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toString() {
		return "c'est Bond  "+super.getBondVal()+" ";
	}
	
	

}
