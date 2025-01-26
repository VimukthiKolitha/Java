package ClassAndObj;

public class Car {

	String color;
	int wheels;
	int seats;
	int doors;
	
	//constructor (it's a method)
	//it does't have return type
	//it is create same as class name
	//constructor automatically calls when object created
	public Car()
	{
		
	}
	
	public void drive()
	{
		System.out.println("car can drive");
	}
	public void reverse()
	{
		System.out.println("car can revers");
	}
	public void park()
	{
		System.out.println("car can park");
	}
	
	//method overloading (creating 2 or more methods using same name but parameters are different
	
	public void speend(int p)
	{
		System.out.println("speed is"+p);
	}

	public void speend(int p,int x)
	{
		System.out.println("speed is"+p);
		System.out.println("speed is"+x);
	}
}
