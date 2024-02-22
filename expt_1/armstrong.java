import java.util.*;

 class arm_check
 {

    void check_arm(int start, int end)
    {
        int arm=0;
        System.out.println("\n\narmstrong numbers are: ");
         
         for(int i=start ; i<=end ; i++)
         {
            int digi_no=0;
            int temp=0;
            int sum=0;
            int rem=0;

          temp =i;
          while(temp>0)
          {
          temp=temp/10;
          digi_no++;
          }
          
          temp=i;
          while(temp>0)
          {
           rem= temp%10;
           
           sum+= Math.pow(rem,digi_no);
           temp= temp/10;
          }
          
          if (i==sum)
          {
           System.out.printf("%d ",i);
           arm++;
          }
          
          
          
          
         }
         
        
         System.out.printf("\n\n there are  %d armstrong numbers ",arm);

    }

 }

public class armstrong {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start range: ");
        int start = sc.nextInt();
        System.out.println("enter end range: ");
        int end = sc.nextInt();

        arm_check num = new arm_check();

        num.check_arm(start,end);

        sc.close();

    }
}
