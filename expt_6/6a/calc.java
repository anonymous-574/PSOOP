import java.util.*;

class shape
{
    double number;
    shape(double r)
    {
        this.number=r;
    }

    void draw()
    {
        System.out.println("My EXISTENCE IS ONLY TO BE OVERRIDEN (；′⌒`)");
    }

    void calc_area()
    {
        System.out.println( number);
    }
}

class circle extends shape
{
    circle(double r)
    {
        super(r);      
        draw();
        calc_area();   
    }

    @Override
    void draw()
    {
        System.out.println("◯");
    }

    void calc_area()
    {
        System.out.println( Math.PI *number*number);
    }
}


class square extends shape
{
    square(double r)
    {
        super(r);       
        draw();
        calc_area();  
    }

    @Override
    void draw()
    {
        System.out.println("◻");
    }

    void calc_area()
    {
        System.out.println( number*number);
    }

}


class triangle extends shape
{
    triangle(double r)
    {
        super(r);   
        draw();
        calc_area();    
    }

    @Override
    void draw()
    {
        System.out.println("△");
    }

    void calc_area()
    {
        System.out.println(Math.sqrt(3)*number*number/4);
    }
}


public class calc {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle");
        double r = sc.nextDouble();
        circle c = new circle(r);

        System.out.println("Enter side of square");
        double s = sc.nextDouble();
        square sq = new square(s);

        System.out.println("Enter side of equ traingle");
        double side = sc.nextDouble();
        triangle t = new triangle(side);

        sc.close();
    }
}
