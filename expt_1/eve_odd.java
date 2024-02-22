import java.util.*;

 class check {

    void check_no(int start, int end)
    {
        int even=0;
        int odd=0;
        System.out.println("Even numbers are: ");
        for(int i=start; i<=end ; i++)
        {
            if (i%2==0) 
            {
                System.out.printf("%d ",i);
                even++;
            }
        }

        System.out.println("\n\nOdd numbers are: ");
        for(int i=start ; i<=end ; i++)
        {
            if (i%2!=0) 
            {
                System.out.printf("%d ",i);
                odd++;
            }
        }
        
        

        System.out.printf("\n\n there are %d even numbers and %d odd numbers  ",even,odd);
    }
}

public class eve_odd {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start range: ");
        int start = sc.nextInt();
        System.out.println("enter end range: ");
        int end = sc.nextInt();

        check num = new check();

        num.check_no(start,end);

        sc.close();

    }
}
