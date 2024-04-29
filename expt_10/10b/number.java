class prime extends Thread
{
    int start,end;
    prime(int s, int e)
    {
        this.start=s;
        this.end=e;
    }

    void chk_prime()
    {
        int flag =0;
        for(int i=start ; i<=end ; i++)
        {
            flag=0;
            if(i==2 || i==1)
            {
             System.out.println("Prime is: "+i);
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
            System.out.println("Prime is: "+i);
          }
          
          }
        }
    }
    @Override
    public void run() {
        chk_prime();
        
    }
}


class palin extends Thread
{
    int start,end;
    palin(int s, int e)
    {
        this.start=s;
        this.end=e;
    }

    void chk_palin()
    {
        for(int i=start ; i<=end ; i++)
        {
        int reverse = 0;
        int temp = i;
        while(temp>0) {
        reverse = reverse*10 + temp%10;
        temp = temp/10;
        }
                 
            
    if(i==reverse)
    {
        System.out.println("Palindrome is: "+i);
    }
        }
    }

    @Override
    public void run() {
        chk_palin();
    }
}

public class number {

    public static void main(String[] args) {
        
        
        prime p = new prime(1, 100);
        palin p1 = new palin(1, 100);
        p.run();
       
        try {
            p.join();
        } 
        catch (Exception e) {
            System.out.println(e);
        }

        p1.start();
        
        
        
    }
}