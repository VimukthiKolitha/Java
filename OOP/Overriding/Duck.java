package OOP.Overriding;

public class Duck extends Animal {
	
	//override speak method according to duck sound
	void speak()
	{
		//using super word you can access to parent class method
		super.speak();
		
		System.out.println("Quack");
	}
	;

}
