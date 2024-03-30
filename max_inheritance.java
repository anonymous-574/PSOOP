interface interface1
{
    final int x =5;
    default void not_real_fn1()
    {
        ello();
        System.out.println("ello i am "+x+ " from interface 1");
    }

    private void ello()
    {
        System.out.println("ello private interface 1");
    }

    static void eat()
    {
        System.out.println(" i am eating in interface 1");
    }
}

interface interface2
{   
    default void not_real_fn2()
    {
        ello();
        System.out.println("ello from interface 2");
    }

    private void ello()
    {
        System.out.println("ello private interface 2");
    }

    static void eat()
    {
        System.out.println(" i am eating in interface 2");
    }
    
}

abstract class myab
{
    static void eat()
    {
        System.out.println("i am eating in abstract class");
    }
}

class help  extends myab implements interface1,interface2
{
    public void print()
    {
        interface1.super.not_real_fn1();
        interface2.super.not_real_fn2();
        System.out.println("\n\n");
        eat();
        System.out.println("\n\n");
        interface1.eat();
        interface2.eat();

    }

}


public class max_inheritance {
public static void main(String[] args) {

    help h = new help();
    h.print();
}
}