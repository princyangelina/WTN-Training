public class Employee extends Person 
{
	private double annual_salary;
	private int started_year;
	private String insurance_no;
	Employee(String n, double a, int s, String i)
	{
		name=n;
		annual_salary=a;
		started_year=s;
		insurance_no=i;
	}
	void setName(String n)
	{
		name=n;
	}
	void setSalary(double s)
	{
		annual_salary=s;	
	}
	void setYear(int y)
	{
		started_year=y;
	}
	void setInsuranceNo(String i)
	{
		insurance_no=i;
	}
	
	String getName()
	{
		return name;
	}
	double getSalary()
	{
		return annual_salary;	
	}
	int getYear()
	{
		return started_year;
	}
	String getInsuranceNo()
	{
		return insurance_no;
	}
	
}
