package atm.expection;

public class Moneychecker {
	public void MoneyCheck(double money) throws MoneyCheckException {
		if (money>=50000) {
			System.out.println("Eligible to withdraw the money from ATM:");
		}
	else {
		throw new MoneyCheckException("Not eligible to withdraw money");
	}
	
		
	
	}
}
