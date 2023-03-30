package homework3;

public class Boss extends Employee {
	
	int salaryPerWeek;
	int salaryPerMonth;

	public Boss(String firstName, String lastName, int salaryPerWeek) {
		super(firstName, lastName);
		this.salaryPerWeek = salaryPerWeek;
		
	}
	
	

	public double salaryCalc() {
		salaryPerMonth = salaryPerWeek * 4;
		return salaryPerMonth;
	}
	
	@Override
	public String toString() {
		return super.toString() + " salaryPerMonth= " + salaryCalc() + "]";
	}



	
	 

	

}
