package OOP.Abstraction.Abstract;

public class Car extends Vehicle {
	
	
	//override park method 
	//if you not override all abstract class methods it cursing errors
	void park()
	{
		System.out.println("car is parking");
	}

}
