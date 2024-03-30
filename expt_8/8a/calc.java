import java.util.*;


interface volume
{
     void get_volume(int r , int h);
}

interface surface_area
{
     void get_sa(int r , int h);
}

class cylinder implements volume,surface_area
{

    @Override
    public  void get_volume(int r, int h) {
        System.out.println("volume is "+ (Math.PI*r*r*h) );   
    }

    @Override
    public  void get_sa(int r, int h) {
        System.out.println("Surface area is "+ (2*Math.PI*r*(h+r)));
    }
}

class cone implements volume,surface_area
{
    @Override
    public  void get_volume(int r, int h) {
         System.out.println("volume is "+ (Math.PI*r*r*h/3));
    }

    @Override
    public  void get_sa(int r, int h) {
        System.out.println("surface area is "+(Math.PI*r*(r+ Math.sqrt( (h*h)+(r*r) ))) );
    }
}

class sphere implements volume,surface_area
{
    @Override
    public  void get_volume(int r, int h) {
         System.out.println("volume is "+ (4*Math.PI*Math.pow(r, 3)/3 )); 
    }

    @Override
    public  void get_sa(int r, int h) {
         System.out.println("surface area is "+ (4*Math.PI*r*r));
    }
}

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp_ht,temp_rad,choice;
        System.out.println("Enter 1 for cylinder , 2 for cone , 3 for sphere");
        choice=sc.nextInt();

        switch (choice)
        {
            case 1:
            {
                cylinder c = new cylinder();
                System.out.println("enter radius: ");
                temp_rad=sc.nextInt();
                System.out.println("enter height: ");
                temp_ht=sc.nextInt();
                c.get_sa(temp_rad, temp_ht);
                c.get_volume(temp_rad, temp_ht);
                break;
            }

            case 2:
            {
                cone c1 = new cone();
                System.out.println("enter radius: ");
                temp_rad=sc.nextInt();
                System.out.println("enter height: ");
                temp_ht=sc.nextInt();
                c1.get_sa(temp_rad, temp_ht);
                c1.get_volume(temp_rad, temp_ht);
                break;
            }

            case 3:
            {
                sphere s = new sphere();
                System.out.println("enter radius: ");
                temp_rad=sc.nextInt();
                System.out.println("enter height: ");
                temp_ht=sc.nextInt();
                s.get_sa(temp_rad, temp_ht);
                s.get_volume(temp_rad, temp_ht);
                break;
            }
            default:
            {
                System.out.println("Error: User is an idiot ");
            }
        }
        sc.close();
    }
}
