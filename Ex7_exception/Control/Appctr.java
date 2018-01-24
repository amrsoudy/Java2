package Control;

import util.EmployeDejaPresentException;
import Modele.Employee;
import Modele.ListEmployee;

public class Appctr {

	public static void main(String[] args)  {
		
		
		Employee emp1 = new Employee("Amr", 30);
		Employee emp2 = new Employee("Adel",60);
		Employee emp3 = new Employee("fares", 30);
		Employee emp4 = new Employee("Amr", 30);


		
		ListEmployee list1 = new ListEmployee();
		
		list1.ajouterEmployee(emp1);
		list1.ajouterEmployee(emp2);
		list1.ajouterEmployee(emp3);
		list1.ajouterEmployee(emp4);

		
		list1.listerEmployee();
	

	}

}
