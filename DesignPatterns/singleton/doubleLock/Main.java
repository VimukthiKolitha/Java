package doubleLock;

class Singleton{

    //static Singleton veriable = uniqueInstance
    private static Singleton uniqueInstance;

    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if(uniqueInstance == null)
        {
            //double check locking
            synchronized(Singleton.class)
            {
                if(uniqueInstance == null)
                {
                    uniqueInstance = new Singleton();
                }
            }
        }

        return uniqueInstance;
    }
}
public class Main {
    public static void main (String [] args)
    {

    }
}
