
//The Singleton design pattern ensures that the same object (single instance) is reused over and over throughout the application, rather than creating a new object every time it is needed.
 class singleton {

    //static variable named uniqueInstance that is used to hold the single instance of the singleton class. 
    private static singleton  uniqueInstance;

    //private constractor
    private singleton()
    {
        System.out.println("Singleton instance created.");
    }
    public static singleton getInstance()
    {
       if(uniqueInstance == null)
       {
        // Create the instance only if it doesn't already exist.
        uniqueInstance = new singleton();
        System.out.println("Singleton instance creating.");
       }
       System.out.println("out of if");
       return uniqueInstance;
    } 
}

public class Main {

    
    public static void main (String [] args){
         
        // First call, creates the instance
        singleton.getInstance();
        // Returns the existing instance
        singleton.getInstance();
        singleton.getInstance();
    }
}
