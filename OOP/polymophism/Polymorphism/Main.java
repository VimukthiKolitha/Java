package OOP.polymophism.Polymorphism;

public class Main {

	public static void main(String[] args) {
		

		//using upcasting,inheritance and overriding call child method inside parent 
		
		
		A a = new A();
		a.printA();
		
		B b = new B();
		b.printA();
		
		
		
		//do a upcasting
		A a1 = new A();
		 a1 = b;
		 
		 //this should call child method
		 a1.printA();
		
		
	}

}
