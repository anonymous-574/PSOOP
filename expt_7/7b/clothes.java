import java.util.*;

abstract class payment
{
    double revenue=25000;
    double clothes_cost=500;
    double accesory_cost=250;
    double to_pay;
    int clothes_amt,acc_amt;
    abstract void payment_details();

    void print_revenue()
    {
        System.out.println("revenue is "+revenue);
    }
}

class cash extends payment
{
    cash(int c , int a)
    {
     this.clothes_amt=c;
     this.acc_amt=a;
    }

    void payment_details()
    {
        System.out.println("Thank you for choosing cash payment ");
        to_pay=(clothes_amt*clothes_cost) +(acc_amt*accesory_cost);
        revenue+=to_pay;
        System.out.println("Pay "+to_pay);
    }   
}

class card extends payment
{
    String name;
    long card_no;
    int exp_date,cvv;

    card(String n , long c , int e , int cvv , int clo , int acc)
    {
        this.name=n;
        this.card_no=c;
        this.exp_date=e;
        this.cvv=cvv;
        this.clothes_amt=clo;
        this.acc_amt=acc;
    }

    void payment_details()
    {
        System.out.println("Thank you for choosing card payment ");
        to_pay=(clothes_amt*clothes_cost) +(acc_amt*accesory_cost);
        to_pay+= to_pay*0.05;
        //5% charges
        revenue+=to_pay;
        System.out.println("Pay "+to_pay);
    }
}

public class clothes {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("How many clothes do you want to buy? ");
    int clo = sc.nextInt();
    System.out.println("how many accesories do you want to buy? ");
    int acc = sc.nextInt();

    System.out.println("press 1 to pay by card , press 2 to pay by cash: ");
    int choice = sc.nextInt();

    switch (choice) {
        case 1:
            {
                System.out.println("Enter name: ");
                String nam = sc.next();
                System.out.println("Enter card number: ");
                long c = sc.nextLong();
                System.out.println("Enter expiry year: ");
                int exp=sc.nextInt();
                System.out.println("Enter CVV: ");
                int cvv =sc.nextInt();
                card card_payment = new card(nam, c, exp, cvv, clo, acc);
                card_payment.payment_details();
                card_payment.print_revenue();
                break;
            }

            case 2:
            {
                cash cash_payment = new cash(clo, acc);
                cash_payment.payment_details();
                cash_payment.print_revenue();
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