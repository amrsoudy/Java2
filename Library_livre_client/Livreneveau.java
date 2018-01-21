
public class Livreneveau extends Livre{


	public Livreneveau(int noPages, String auter,String name,double prix) {
		super.setAuter(auter);;
		super.setNoPages(noPages);
		super.setName(name);
		super.setPrix(prix+(prix*10/100));
		super.setCategory("neveau");

		
	}

	@Override
	public String toString() {
		return "Livreneveau [getNoPages()=" + getNoPages() + ", getAuter()=" + getAuter() + ", getName()=" + getName()
				+ ", getCategory()=" + getCategory() + ", getPrix()=" + getPrix() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
