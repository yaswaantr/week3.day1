package method.overiding;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Axis Bank does not provides Tax Free Deposits");
	}

	public static void main(String[] args) {

		BankInfo bi = new BankInfo();
		bi.savings();
		bi.fixed();
		// bi.deposit();

		AxisBank ab = new AxisBank();
		ab.deposit();
	}

}
//deposit
//override the method deposit in Axis Bank