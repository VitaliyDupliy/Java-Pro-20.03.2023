package homework3;



public class CommissionWorker extends Employee {
	
	final int basicSal = 2500;
	double salaryPerMonth;
	int sales;
	final int persentOfSal = 30;

	public CommissionWorker(String firstName, String lastName, int sales) {
		super(firstName, lastName);
		this.sales = sales;
	
	}

	@Override
	double salaryCalc() {
		salaryPerMonth = (double)(basicSal  + sales * persentOfSal / 100);
		
		
		
		return salaryPerMonth ;
	}

	@Override
	public String toString() {
		return super.toString() + " basicSal=" + basicSal + ", sales=" + sales + ", salaryPerMonth=" + salaryCalc() + "]";
	}

	

	

}
