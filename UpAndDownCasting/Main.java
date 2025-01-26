package UpAndDownCasting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
           Parent A = new Parent();
           Child C = new Child();
           
           //this is called upcasting
           //Initialize subclass object (C) to super class variable(A)
           A = C;//possible
           
        //   C = A;//not possible
           
        //Downcasting 
        //den A ge athule atthe C ge object ekeki (Upcast kalanisa)
           
       
           
           //Child ge object eka ganna(Child);
           C = (Child)A;
              
           
           

	}

}
