
public class CaseSubstration extends Case {


	public CaseSubstration() {
		super.setType("operation");
	}

	public int calcul(int val1, int val2) {
		// TODO Auto-generated method stub
		return val1-val2;
	}
	
	public String toString(int val1,int val2) {
		return "c'est Substraction("+ val1 + " - " + val2 +")";
	}
}
