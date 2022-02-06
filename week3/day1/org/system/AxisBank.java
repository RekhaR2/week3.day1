package week3.day1.org.system;

public class AxisBank extends BankInfo{
	public void deposit()
	{
		System.out.println("Axis Bank deposit amount = 70000");
	}

	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();	
	}
}
