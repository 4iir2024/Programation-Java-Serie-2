package ex1;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	
	public Employee()
	{
		
	}
	

	public Employee(int id, String firstName, String lastName, int salary) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	
	
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}





	

	@Override
	public String toString() {
		return "Employee informations => id= " + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				;
	}
	
	public String getName()
	{
		return lastName + " " + firstName ;
	}
	
	
	public int getAnnualSalary()
	{
		return this.salary * 12;
	}
	
	public int raiseSalary(int parcent)
	{
		return salary*(1+parcent/100);
	}
	
	
	
	
	
	
	






	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1,"Adam","Driw",4200);
		System.out.println("Your name is"+emp1.getName());
		System.out.println("Your Salary Annual "+emp1.getAnnualSalary());
		System.out.println("Your raise "+emp1.raiseSalary(20));
		System.out.println(emp1.toString());

	}

}
