package OOP.Inheritance.Inheritance;

public class Main {

	public static void main(String[] args) {
		
		OldPhone op1 = new OldPhone();
		
		op1.call();
		op1.sms();
		
		NewPhone np1 = new NewPhone();
		
		//using oldPhone method
		np1.call();
		np1.video();
		

	}

}
