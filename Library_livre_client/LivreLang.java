
public class LivreLang extends Livre{
	

	public LivreLang(int noPages, String auter,String name,double prix) {
		super.setAuter(auter);;
		super.setNoPages(noPages);
		super.setName(name);
		super.setPrix(prix);
		super.setCategory("lang");
	}

	@Override
	public String toString() {
		return "LivreLang [getNoPages()=" + getNoPages() + ", getAuter()=" + getAuter() + ", getName()=" + getName()
				+ ", getCategory()=" + getCategory() + ", getPrix()=" + getPrix() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
