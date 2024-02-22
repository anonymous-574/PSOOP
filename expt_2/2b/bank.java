import java.util.*;

class calc
{
  private double bal;
  private double inter;
  private double min_bal;
  Scanner sc1 = new Scanner (System.in);
  
  //savings acc
  calc(double a , double b )
  {
    if(a>0)
    {
        this.bal = a;
        this.min_bal =200;
        this.inter = 2.5;
    }
    else
    {
      System.out.println("balance must be more than 0 or rate of interest cant be 0 for a savings account");
    }
 
  }
  
  void sav_menu()
  {
   System.out.println("press 1 to make a deposit \n press 2 to withdraw money \n press 3 to find interest after 1 year \n press 4 to find out your current balance \n press 5 to quit");
   
   int a = sc1.nextInt();
   
   switch (a)
   {
    case 1:
    {
     deposit();
     break;
    }
    case 2:
    {
    withdraw_sav();
    break;
    }
    case 3:
    {
    find_int();
    break;
    }
    case 4:
    {
    print_bal();
    break;
    }
    case 5:
    {
    System.exit(0);
    break;
    }
    default:
    {
     System.out.println("Enter a number between 1 and 5 ._.");
     break;
    }
   } 
  }
  
  void withdraw_sav()
  {
  System.out.println("How much money do you want to withdraw");
      double width_sav = sc1.nextDouble();
      
      if(bal-width_sav>0 && bal-width_sav>min_bal)
      {
       bal-=width_sav;
       print_bal();
      }
      else
      {
       System.out.println("You do not have enough money to widhdraw or you will go below minimum allowed balance ");
      }
  
  }
  
  void find_int()
  {
   bal = bal*(1+(inter*0.01));
   print_bal();
  }
  
 //current acc 
  calc(double a)
  {
  this.bal =a;
  }
  
  void cur_menu()
  {
      
   System.out.println("press 1 to make a deposit \n press 2 to withdraw money   \n press 3 to find out your current balance \n press 4 to exit ");
   
   int a = sc1.nextInt();
   
   switch (a)
   {
    case 1:
    {
     deposit();
     break;
    }
    case 2:
    {
    withdraw_cur();
    break;
    }
    case 3:
    {
    print_bal();
    break;
    }
    case 4:
    {
    System.exit(0);
    break;
    }
    default:
    {
     System.out.println("Enter a number between 1 and 4 ._.");
     break;
    }
   } 
   
   }
  
  
  
  void deposit()
  {
   System.out.println("How much money do you want to deposit");
   double dep = sc1.nextDouble();
   bal+= dep;
   print_bal();
  }  
  
  void print_bal()
  {
     System.out.println("your balance is: "+bal);
  }
  
  void withdraw_cur()
  {
      System.out.println("How much money do you want to withdraw");
      double width_cur = sc1.nextDouble();
      
      if(bal-width_cur>0)
      {
       bal-=width_cur;
       print_bal();
      }
      else
      {
       System.out.println("You do not have enough money to widhdraw");
      }
      
  }



}






public class bank
{
    public static void main (String args[])
    {
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter 1 for savings aaccount \n enter 2 for current account");
    int a = sc.nextInt();
    
    switch (a)
    {
      case 1:
      {
       System.out.println("Enter initial balance");
       double q = sc.nextDouble();
       calc c1 = new calc(q,0);
       c1.sav_menu();
       break;
      }
      case 2:
      {
       System.out.println("Enter initial balance");
       double p = sc.nextDouble();
       calc c1 = new calc(p);
       c1.cur_menu();
       break;
      }
      default:
      {
      System.out.println("Enter a number between 1 and 2 ._. ");
      }
    
    
    }

    
   
    
    }
}    
