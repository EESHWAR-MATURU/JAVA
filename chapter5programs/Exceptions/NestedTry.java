package Exceptions;

class AgeVerification extends Exception{
	public AgeVerification(String msg) {
		super(msg);
	}
}
class NameLength extends Exception{
	public NameLength(String msg) {
		super(msg);
	}
}
public class NestedTry {
	public static void main(String[] args) {
		int age=18;
		String name="cse Department";
		int year=1000;
		try {		
			try {
				if(age<18)
					throw new AgeVerification("Under 18 not allowed to register");
			}
			catch (AgeVerification e) {
				System.out.println(e.getMessage());
			}
			if(name.length()<10)
				throw new NameLength("Name length should be more than 10");
			else if(year<2000)
				throw new ArithmeticException("Year must be greater than 2000");
			else
				System.out.println("Welcome");
		}
			
				
		catch (NameLength e) {
			System.out.println(e.getMessage());
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
