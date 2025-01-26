package ClassAndObj;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//in here 'Car()'  this is method.it is default constructor
		Car c1 = new Car();
		
		c1.drive();
		c1.park();
		c1.reverse();
		
		//call over load method
		
		c1.speend(250);
		c1.speend(100, 120);
	}

}
