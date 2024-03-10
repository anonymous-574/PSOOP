import java.util.*;

class stock
{
  String name;
  int[] price;

  stock()
  {
    String n =null;

  }

  stock(String n , int p[] )
  {
    this.name=n;
    this.price=p;
  }
}

class transaction extends stock
{
    transaction(String n , int p[] )
    {
        super(n, p);
    }

    int max_profit()
    {
      int profit=0;
      int stockBuyDay=-1;
      for (int i = 0; i < price.length - 1; i++) {
      if (price[i] < price[i + 1]) {
      if (stockBuyDay == -1) {
      stockBuyDay = i;
      }
      profit += price[i + 1] - price[i];
      if(i==price.length - 2){
      System.out.println("Buy on day " + (price.length -
      1) + " and sell on day " + (price.length)+"\n");
      }}
      else {
      if (stockBuyDay != -1) {
      System.out.println("Buy on day " + (stockBuyDay + 1) +
      " and sell on day " + (i + 1)+"\n");
      stockBuyDay = -1;
      }
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