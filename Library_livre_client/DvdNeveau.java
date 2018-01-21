
public class DvdNeveau extends Dvds{
	
	
	public DvdNeveau( String actor,String name,double prix,double duree) {
		super.setActor(actor);
		super.setDuree(duree);
		super.setName(name);
		super.setPrix(prix+(prix*10/100));
		super.setCategory("DvdNew");

		
	}

	@Override
	public String toString() {
		return "DvdNeveau [getActor()=" + getActor() + ", getDuree()=" + getDuree() + ", getName()=" + getName()
				+ ", getCategory()=" + getCategory() + ", getPrix()=" + getPrix() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
