package homework3;

public abstract class Employee  {
	
	
	String firstName, lastName;

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	abstract double salaryCalc();

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	// comments 33
		


	
	
	
	

}
