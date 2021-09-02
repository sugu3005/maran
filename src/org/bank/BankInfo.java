package org.bank;

public class BankInfo extends AxisBank{
	private void saving() {
		System.out.println("For Savings, interest is 7%");
	}
	private void fixed() {
		System.out.println("For fixed, interest is 10%");
	}
	public static void main(String[] args) {
		BankInfo bi = new BankInfo();
		bi.saving();
		bi.fixed();
		bi.deposit();
	}

}
