package com.vst.encapsulation;

public class TestBank {

	public static void main(String[] args) {

		BankDetails objBankDetails = new BankDetails();
		objBankDetails.setSrn(1234);
		objBankDetails.setAccount_number(443251524);
		objBankDetails.setEmpName("Sachin");
		objBankDetails.setBalance(250004);
		System.out.println("Employee srn: " + objBankDetails.getSrn());
		System.out.println("Employee Account  Numbers: " + objBankDetails.getAccount_number());
System.out.println("Employee Account Holder Name:"+objBankDetails.getEmpName());
System.out.println("Employee Account Balance:"+ objBankDetails.getBalance());
	}

}
