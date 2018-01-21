
public class LivreEnfants extends Livre{
	

	public LivreEnfants(int noPages, String auter,String name,double prix) {
		super.setAuter(auter);;
		super.setNoPages(noPages);
		super.setName(name);
		super.setPrix(prix-(prix*5/100));
		super.setCategory("Enfants");

		
	}

	@Override
	public String toString() {
		return "LivreEnfants [getNoPages()=" + getNoPages() + ", getAuter()=" + getAuter() + ", getName()=" + getName()
				+ ", getCategory()=" + getCategory() + ", getPrix()=" + getPrix() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
