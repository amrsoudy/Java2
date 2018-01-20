
public abstract class Case {
	private String Type = null;
	private int BondVal = 0 ;
	
	public abstract int calcul(int val1,int val2);

	public String getType() {
		return Type;
	}

	public int getBondVal() {
		return BondVal;
	}

	public void setBondVal(int bondVal) {
		BondVal = bondVal;
	}

	public void setType(String type) {
		Type = type;
	}

	public String toString(int val1,int val2) {
		return "";
	}
	
	

}
