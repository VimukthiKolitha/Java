package singletonWithSynchronize;
class Singleton {

    private static Singleton uniqueInstance;

    private Singleton()
    {

    }

    //in here 'synchronized' use for get one thread by one
    public static  synchronized Singleton getInstance()
    {
        if(uniqueInstance == null)
        {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }
    
}
public class Main {
    public static void main (String [] args){

    }
}
