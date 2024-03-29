import java.util.*;

interface saving_acc
{
    void get_simple_interest();
}

interface current_acc
{
    void get_compound_interest();
}

class customer implements saving_acc , current_acc
{
    double interest_rate,balance;

    customer(double i , double b)
    {
        this.interest_rate=i;
        this.balance=b;
    }



    @Override
    public void get_compound_interest() {
        //assume monthly compounding
        balance+= balance* Math.pow((1+(interest_rate/12)),12);
        System.out.println("Account balance after 1 year is "+ balance);
    }

    @Override
    public void get_simple_interest() {
        balance+=(balance*1*interest_rate)/100;
        System.out.println("Account balance after 1 year is "+ balance);
    }

}

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter interest rate: ");
        double rate = sc.nextDouble();
        System.out.println("Enter initial balance");
        double balance = sc.nextDouble();
        customer c = new customer(rate, balance);

        System.out.println("Enter 1 for current account , 2 for savings account");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
            {
                c.get_compound_interest();
                break;
            }
            case 2:
            {
                c.get_simple_interest();
                break;
            }
        
            default:
            {
                System.out.println("Error user is an idiot");
                break;
            }
        }
        sc.close();
    }
}
