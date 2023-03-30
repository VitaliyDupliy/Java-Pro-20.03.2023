package homework3;

public class HourlyWorker extends Employee {

	 
	final int normOfHours = 160;
	int hoursWorked;
	int hourlyRate;
	int salaryPerMonth;
	int multiplyingFactor = 2;
	
	public HourlyWorker(String firstName, String lastName, int hoursWorked, int hourlyRate) {
		super(firstName, lastName);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	 
	 

	double salaryCalc() {
		if(hoursWorked > normOfHours) {
		return salaryPerMonth = (normOfHours * hourlyRate) + ((hoursWorked - normOfHours) * multiplyingFactor * hourlyRate);
		}
		return salaryPerMonth = (normOfHours * hourlyRate);
		
	}



	@Override
	public String toString() {
		return super.toString() + " normOfHours= " + normOfHours + ", hoursWorked= " + hoursWorked + ", hourlyRate= "
				+ hourlyRate + ", salaryPerMonth= " + "]";
	}
	

	
}
