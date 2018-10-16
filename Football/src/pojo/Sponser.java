package pojo;

public class Sponser extends Team implements DailyWage, AccDetail {

	@Override
	public void management() {
		displayDetails();
	}

	@Override
	public void calculatePay() {
		System.out.println("Calculate Pay");
	}

	@Override
	public void displayDetails() {
		System.out.println("--------------------------");
		System.out.println("Account Balance: 92130420");
		System.out.println("--------------------------");
	}
	
}
