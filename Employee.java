public class Employee 
{
	private String firstName; 
	private String lastName;
	private double monthlySalary;
	
	
	public Employee (String fname, String lname, double msalary)
	{
		firstName = fname; 
		lastName = lname; 
		monthlySalary = msalary;
		
		
		if (msalary < 0.0)
			monthlySalary = 0.0;
	} 
	
	
	public void setFirstName (String fname)
	{
		firstName = fname;
		
	} 

	public String getFirstName ()
	{
		return firstName;
	} 
	
	
	public void setLastName (String lname)
	{
		lastName = lname;
	} 
	
	
	public String getLastName ()
	{
		return lastName;
	} 
	
	
	public void setMonthlySalary (double msalary)
	{
		monthlySalary = msalary;
		

	}
	
	
	public double getMonthlySalary ()
	{
		return monthlySalary;
	} 
	
	
	public double getYearlySalary()
	{
		double yearlySalary = monthlySalary * 12;
		return yearlySalary;
	} 
	
	
	public double getRaiseSalary()
	{
		double raise =  monthlySalary * 0.1 ;
		double raiseSalary = ( monthlySalary + raise ) * 12;
		return raiseSalary;
	} 
	
} 