
public class Main {

    int height = 6;
    int weight = 70;

    static String name = "vimukthi";
    static int age = 30;

    void languege()
    {
        System.out.println("sinhala");
    }

    static void skill()
    {
        System.out.println("sing");
    }

    public static void main(String[] args) {


        //when you use static key word.you can access without creationg objects. 
        System.out.println(name);
        System.out.println(age);
       skill();

       //without staic you have to create object to access

       Main obj1 = new Main();

       System.out.println(obj1.height);
       System.out.println(obj1.weight);

       obj1.languege();

}
}