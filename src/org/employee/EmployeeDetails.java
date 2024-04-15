package org.employee;


public class EmployeeDetails { // block or body of the class
	
	private void empName() {
		System.out.println("Employee name : Anand");
	}
	
	private void empId() {
		System.out.println("Employee id : 1122");
	}
	
	private void empMobile() {
		System.out.println("Employee mobile : 8939278836");
	}
	private void empLocation() {
		System.out.println("location: Banglore");
	}
	private void empAdd() {
		System.out.println("Add: OMR chennai");
	}
//<<<<<<< HEAD
//=======
//>>>>>>> 758e20c3b31f9e6c1b52fd57d7507f4936bc875e
	
	// main method -> starting point (jvm)
	public static void main(String[] args) {
		
		
		EmployeeDetails e = new EmployeeDetails();
		e.empName();
		e.empId();
//		e.empMobile();
		
		
	}
	

	
	
	
	
}
