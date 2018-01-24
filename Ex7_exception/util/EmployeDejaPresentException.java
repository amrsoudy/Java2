package util;

import Modele.Employee;

public class EmployeDejaPresentException  extends Exception {
	
	
	private Employee emp ;
	
	

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp,Employee individu) {
		this.emp = emp;
		this.emp = individu;
	}

	public EmployeDejaPresentException () {
		
	}

	public EmployeDejaPresentException (String message) {
		super(message);
	}
	

	
	
	
	
	 
}
