/*
 * 	
 Create a class called Person with a member variable name. Save it in a file called Person.java

Create a class called Employee that will inherit the Person class.The other data members of the 
Employee class are annual salary (double), the year the employee started to work, and the national 
insurance number which is a String.Save this in a file called Employee.java

Your class should have the necessary constructors and getter/setter methods.

Write another class called TestEmployee, containing a main method to fully test your class definition.
 */
public class TestEmployee {

	public static void main(String[] args) 
	{
		Employee e=new Employee("Princy", 120000.0, 2019, "In78638");
		System.out.println("Name of the Employee: "+e.getName());
		System.out.println("Annual Salary of the Employee: "+e.getSalary());
		System.out.println("Started Year of the Employee: "+e.getYear());
		System.out.println("Insurance Number of the Employee: "+e.getInsuranceNo());
		
		//changing the values with set methods
		e.setSalary(150000.0);
		e.setName("Princy Nagati");
		
		System.out.println("\nName of the Employee: "+e.getName());
		System.out.println("Annual Salary of the Employee: "+e.getSalary());
		System.out.println("Started Year of the Employee: "+e.getYear());
		System.out.println("Insurance Number of the Employee: "+e.getInsuranceNo());

	}

}
