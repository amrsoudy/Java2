
public class DvdNormal extends Dvds{
	
	public DvdNormal( String actor,String name,double prix,double duree) {
		super.setActor(actor);
		super.setDuree(duree);
		super.setName(name);
		super.setPrix(prix);
		super.setCategory("Normal");

		
	}

	@Override
	public String toString() {
		return "DvdNormal [getActor()=" + getActor() + ", getDuree()=" + getDuree() + ", getName()=" + getName()
				+ ", getCategory()=" + getCategory() + ", getPrix()=" + getPrix() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
