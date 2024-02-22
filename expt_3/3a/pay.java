import java.util.*;

class process 
{
    private int item_no;
    private int price;
    private int qty;
    private int pay;
    
    process(int a , int b , int c)
    {
        this.item_no=a;
        this.price=b;
        this.qty=c;
        bill();
    }

    void bill()
    {
        pay = qty*price;
        return;
    }

	
    int payment()
    {
    	// 50rs
        pay +=50;
        return pay;
    }

 	
    int payment(String nam , int acc_no)
    {
    	// 1%
        pay += pay *0.01;
        return pay;
    }

	
    int payment(int card)
    {
    	//2%
        pay += pay *0.02;
        return pay;
    }


}


public class pay
{

public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter barcode number: ");
    int bar = sc.nextInt();
    System.out.println("Enter price of product: ");
    int pri = sc.nextInt();
    System.out.println("Enter quantity of products: ");
    int qty= sc.nextInt();

    process p1 = new process(bar, pri, qty);
    
    System.out.println("Press 0 to exit , any other to continue");
    int ch1= sc.nextInt();
    
    while(ch1!=0)
    {

    
    System.out.println("Enter payment method \n press 1 to pay with cash on delivery \n press 2 to pay with net banking \n press 3 to pay with credit card");
    int ch = sc.nextInt();

    switch (ch) {
        case 1:
        {
            // cash
            System.out.println("You have to pay: "+p1.payment()); 
            break;
        }
        case 2:
        {
            //net bank
            System.out.println("Enter name of bank: ");
            String nam = sc.next();
            System.out.println("Enter bank account no: ");
            int acc = sc.nextInt();
            System.out.println("You have to pay: "+p1.payment(nam,acc));
            break;
        }
        case 3:
        {
            //credit
            System.out.println("Enter credit card number: ");
            int card = sc.nextInt();
            System.out.println("You have to pay: "+p1.payment(card));
            break;
        }

    
        default:
        {
            System.out.println("ENTER A NUMBER BETWEEEN 1 AND 3!!! ._> ");
            break;
        }
    }
    
    System.out.println("Press 0 to exit , any other to continue");
    ch1= sc.nextInt();
    }
    
    
    sc.close();

}


}
