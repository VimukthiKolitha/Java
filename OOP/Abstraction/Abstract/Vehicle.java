package OOP.Abstraction.Abstract;

abstract public class Vehicle {

	//abstract class does't have constructor
	//abstract method (does't have a body)
	//can store subclass object
	abstract void park();
	
	
	//there can be methods with body (but they are't abstract methods)
	void print()
	{
		//body
	}
}
