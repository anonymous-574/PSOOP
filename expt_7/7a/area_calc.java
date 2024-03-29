import java.util.*;

abstract class shape
{
    abstract double rect_area(int len , int bre);
    abstract double circ_area(int r);
    abstract double squ_area(int s);
}

class area extends shape
{
    double rect_area(int l , int b)
    {
        return l*b;
    }

    double circ_area(int r)
    {
        return Math.PI *r*r;
    }

    double squ_area(int s)
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
        int len = sc.nextInt();
        System.out.println("enter breadth of rectangle: ");
        int bre = sc.nextInt();
        a.rect_area(len, bre);
        System.out.println("Enter circle radius: ");
        int rad = sc.nextInt();
        a.circ_area(rad);
        System.out.println("Enter square side");
        int s = sc.nextInt();
        a.squ_area(s);
        sc.close();
    }
}
