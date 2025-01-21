
public class Main {

    String name;
    //constructor name always should be same as class name
    //constructor doesnot have return type
    Main()
    {
        System.out.println("this is constructor");

        name = "vimukthi";
    }
    //this is method
    void test()
    {
        System.out.println("this is method");
    }
    public static void main (String [] args)
    {
        //when you crate an instance in that time constructor automaticaly called
            Main obj1 = new Main();

            obj1.test();
        //in here i am creating instance and constructor automaticaly called
            Main obj2 = new Main();

            //name is automaticaly assign to vimukthi
            Main obj3 = new Main();
            System.out.println(obj3.name);
    }
}
