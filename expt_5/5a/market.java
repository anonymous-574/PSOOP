import java.util.*;

class stock
{
  String name;
  int[] price;

  stock()
  {
    name =null;

  }

  stock(String n , int price[] )
  {
    this.name=n;
    this.price=price;
  }
}

class transaction extends stock
{

    transaction(String n , int price[] )
    {
        super(n, price);
    }

    int max_profit()
    {
      int profit=0;
      int j=0;

      for (int i = 1; i < price.length; i++) 
      {
         if(price[i-1]>price[i])
         {
        
          j=i;
         }

         if( (price[i-1]< price[i]) && (i+1==price.length || price[i]>price[i+1]))
         {
          profit+= price[i]-price[j];
          System.out.printf("Buy on day %d and sell on day %d \n",(i+1),(j+1));
         }
      }

      

      return profit;
    }
  }

  
public class market {
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Stock name: ");
      String name = sc.next();
      System.out.println("Enter no of days to track");
      int track_days= sc.nextInt();
      int price_per_day[] = new int [track_days];
      System.out.println("Enter Stock prices ");
      for (int i = 0; i < price_per_day.length; i++) 
      {
        System.out.print("Day "+(i+1)+": ");
        price_per_day[i] =sc.nextInt();
        System.out.println(); 
      }

      transaction t = new transaction(name, price_per_day);
      int pro_max = t.max_profit();

      System.out.println("Max profit is: "+pro_max);
        sc.close();
    }
}


