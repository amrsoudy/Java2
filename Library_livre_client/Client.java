import java.util.ArrayList;

public abstract class Client {
	private String name ;
	private int age  ;
	private String sex ;
	private String type ;
	ArrayList<Things> clientlist = new ArrayList<>();
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	

	
	public void ajouterPanier(Things th){
		clientlist.add(th);
		th.setIsdis(false);
		
		
	}
	
	public abstract void afficherleprix();

}
