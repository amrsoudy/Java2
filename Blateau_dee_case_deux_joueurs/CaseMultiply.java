
public class CaseMultiply extends Case {



	public CaseMultiply() {
		super.setType("operation");
	}

	public int calcul(int val1, int val2) {
		
				
		return val1*val2;
	}

	
	public String toString(int val1,int val2) {
		return "c'est Multiply ("+ val1 + " * " + val2 +")";
	}

	
	
	
	
	

}
