
public class ContractTeacher extends TeachingStaff implements DailyWage, Schedule {

	@Override
	public void displayTimeTable() {
		System.out.println("\nDisplay Time Table");	
	}

	@Override
	public void calculatePay() {
		System.out.println("\nCalculate Pay");		
	}

	@Override
	public void calculateSalary() {
		calculatePay();
	}

}
