import java.util.*;

abstract class shape
{
    abstract double rect_area(double len , double bre);
    abstract double circ_area(double r);
    abstract double squ_area(double s);
}

class area extends shape
{
    double rect_area(double l , double b)
    {
        return l*b;
    }

    double circ_area(double r)
    {
        return Math.PI *r*r;
    }

    double squ_area(double s)
    {
        return s*s;
    }
}

public class area_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        area a = new area();
        System.out.println("Enter rectangle details: ");
        System.out.println("Enter length of rectangle: ");
        double len = sc.nextDouble();
        System.out.println("enter breadth of rectangle: ");
        double bre = sc.nextDouble();
        System.out.println(a.rect_area(len, bre));
        System.out.println("Enter circle radius: ");
        double rad = sc.nextDouble();
        System.out.println(a.circ_area(rad));
        System.out.println("Enter square side");
        double s = sc.nextDouble();
        System.out.println(a.squ_area(s));
        sc.close();
    }
}