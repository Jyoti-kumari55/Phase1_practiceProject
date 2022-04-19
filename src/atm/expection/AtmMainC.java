package atm.expection;

public class AtmMainC {
public static void main(String[] args) throws MoneyCheckException{
	Moneychecker moneychecker = new Moneychecker();
	moneychecker.MoneyCheck(20000.0);
}
}
