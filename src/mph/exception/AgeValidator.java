package mph.exception;

public class AgeValidator {
	public void AgeValid(int age) throws InvalidageException {
		if (age>=18) {
			System.out.println("You have right to vote.");
			
		}else {
			throw new InvalidageException("The age < 18 dont have right to vote.");
		}
	}

}
