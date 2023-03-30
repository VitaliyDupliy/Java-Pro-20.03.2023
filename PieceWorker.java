package homework3;

public class PieceWorker extends Employee {

	
	final int payForProd = 120;
	int quantityOfProd;
	int salaryPerMonth;
	
	public PieceWorker(String firstName, String lastName, int quantityOfProd) {
		super(firstName, lastName);
		this.quantityOfProd = quantityOfProd;
		
	}

	@Override
	double salaryCalc() {
		salaryPerMonth = quantityOfProd * payForProd;	
		return salaryPerMonth;
	}

	@Override
	public String toString() {
		return super.toString() + " payForProd=" + payForProd + ", quantityOfProd=" + quantityOfProd + ", salaryPerMonth="
				+ salaryCalc() + "]";
	}
	
	
	
}
