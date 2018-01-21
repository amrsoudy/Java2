
public abstract class Things {
	private String name;
	private String category ; 
	private double prix ;
	private boolean isdis =true ;

	public boolean isIsdis() {
		return isdis;
	}
	public void setIsdis(boolean isdis) {
		this.isdis = isdis;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

	
	
	
}
