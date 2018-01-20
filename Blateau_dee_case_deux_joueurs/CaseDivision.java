
public class CaseDivision extends Case {




	public CaseDivision() {
		super.setType("operation");
		
	}

	public int calcul(int val1, int val2) {
		if (val2==0){
			return 0;
			
		}
		return (val1 / val2);
	}
	
	public String toString(int val1,int val2) {
		return "c'est Division ("+ val1 + " / " + val2 +")";
	}

}
