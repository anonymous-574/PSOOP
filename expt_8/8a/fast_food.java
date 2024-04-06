import java.util.Scanner;

interface eat_here
{
    void deliver_table();
}
interface take_away
{
    void dispatch_order();
}

class customer implements eat_here , take_away
{
    double cost=0;
    double extra=0;

    customer(double c)
    {
     this.cost=c;
    }


    @Override
    public void deliver_table() {

        extra = cost*0.1;
        if (500>extra ) 
        {
         cost+=extra;    
        }
        else
        {
            cost+=500;
        }
        System.out.println("Cost is "+cost);


    }

    @Override
    public void dispatch_order() {
        extra=cost*0.05;
        if (45>extra) {
            cost+=extra;
        }
        else
        {
            cost+=45;
        }
        System.out.println("Cost is "+cost);
    }


}


public class fast_food {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the cost of your food? ");
        customer c = new customer(sc.nextDouble());
        System.out.println("Enter 1 to do takeaway , 2 to do delivery: ");

        switch (sc.nextInt()) {
            case 1:
            {   
                c.dispatch_order();
                break;
            }
            case 2:
            {
                c.deliver_table();
                break;
            }
            default:
            {
                System.out.println("Error: user is an idiot");
                break;
            }
        }


        sc.close();
    }
}