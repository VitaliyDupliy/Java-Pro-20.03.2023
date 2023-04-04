package homework3;

import java.util.Comparator;

public class EmployersComparator implements Comparator<Employee> {

	

	
	public int compare(Employee o1, Employee o2) {
		
		return (int) (o2.salaryCalc() - o1.salaryCalc());
	}

}
