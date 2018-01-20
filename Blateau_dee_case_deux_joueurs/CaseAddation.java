
public class CaseAddation extends Case {
	
	public CaseAddation() {
		super.setType("operation");
	}

	public int calcul(int val1, int val2) {
		return val2+val1;
	}
	
	
	public String toString(int val1,int val2) {
		return "c'est Addation ("+ val1 + " + " + val2 +")";
	}

}
