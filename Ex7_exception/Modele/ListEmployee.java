package Modele;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import util.EmployeDejaPresentException;

public class ListEmployee  {
	ArrayList <Employee> emplist =new ArrayList<>();
	
	
	public void ajouterEmployee(Employee emp) {
		try{
		
		if (isdublicate(emp) == false){
			
			emplist.add(emp);
			
			
			
		}else{
			
			throw new EmployeDejaPresentException("il ya diblicate avec :  "+emp.getNom());
			
		}
		}catch(EmployeDejaPresentException e){
			
			System.out.println(e.getMessage());
	
		}
		
		
	}
	public void listerEmployee(){
		
		for(Employee e:emplist){
			
			System.out.println(e);
			
			
			
		}
		
		
		
	}

	public boolean isdublicate(Employee emp){
		Boolean x = false ; 
		
		for(Employee e : emplist){
			if (emp.getNom()== e.getNom()){
				x = true ; 
				break;

			}
			
			
		}
		return x;
		
		
		
		
		
		
	}
}
