package Modele;

public class Employee {
	private String nom;
	private int age ;
	
	
	public Employee() {
		this.nom = "inconue";
		this.age = 0;
		
		
	}


	public Employee(String nom, int age) {
	
		this.nom = nom;
		this.age = age;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [nom=" + nom + ", age=" + age + "]";
	}
	
	
	
	
	

}
