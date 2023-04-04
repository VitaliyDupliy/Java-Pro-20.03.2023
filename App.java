package homework3;


//comment about fucking github!! graph in git hub is shit!

public class App {

public static void main(String[] args) {
		
		Boss boss = new Boss("Jack", "Ritcher", 4000);
		
		System.out.println(boss);
		
		HourlyWorker hw = new HourlyWorker("Jadd", "Stuart", 190, 30);
		
		System.out.println(hw);
		
		PieceWorker pw = new PieceWorker("Thomas", "Anders", 94);
		System.out.println(pw);
		
		CommissionWorker cw = new CommissionWorker("John", "Travolta", 20000);
		System.out.println(cw);
		System.out.println("######################################################");
		
		Company.employers.add(cw);
		Company.employers.add(boss);
		Company.employers.add(hw);
		Company.employers.add(pw);
		
		for(Employee n: Company.employers) {
			System.out.println(n);
		}
		
		System.out.println("######################################################");
		
//		Company.findEmployee("John", "Travolta");
//		System.out.println(Company.findEmployee("John", "Travolta"));
		
		Company.deleteEmployee("John", "Travolta");
		for(Employee n: Company.employers) {
			System.out.println(n);
		}
		
		System.out.println("######################################################");
		Company.addEmployee(cw);
		
		for(Employee n: Company.employers) {
			System.out.println(n);
		}
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Company.employers.sort(new EmployersComparator());
		
		
		double i = 0;
		for(Employee n: Company.employers) {
			
			i += n.salaryCalc();
			System.out.println(n);
		}
		
		System.out.println("Payroll for Company: " + i);
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
//		Company.employers.sort(new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				
//				return (int) (o1.salaryCalc() - o2.salaryCalc());
//			}
//		});
			
		Company.employers.sort((a,b) -> (int) (a.salaryCalc() - b.salaryCalc()));
		
		
		double j = 0;
		for(Employee n: Company.employers) {
			
			j += n.salaryCalc();
			System.out.println(n);
		}
		
		System.out.println("Payroll for Company: " + j);
		
	}
}
