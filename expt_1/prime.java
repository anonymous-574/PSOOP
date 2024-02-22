import java.util.*;

 class prime_check
 {

    void check_prime(int start, int end)
    {

        System.out.println("\n\nprime numbers are: ");
        int prime =0;
        int flag =0;
        for(int i=start ; i<=end ; i++)
        {
            flag=0;
            if(i==2 || i==1)
            {
             System.out.printf("%d ",i);
             prime++;
            }
            else
            {  
                for(int j=2;j<=i/2;j++)
              {      
                if(i%j==0)
                {      
                 flag=1;      
                 break;      
                }      
              }      
          
          if(flag==0)  
          {  
            System.out.printf("%d ",i);
            prime++;
          }
          
          }
        }
        System.out.printf("\n\n there are %d prime numbers",prime);
    }
}

    



public class prime 
{

    public static void main(String[] args) 
    {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start range: ");
        int start = sc.nextInt();
        System.out.println("enter end range: ");
        int end = sc.nextInt();

        prime_check num = new prime_check();

        num.check_prime(start,end);

        sc.close();

    }
  }

