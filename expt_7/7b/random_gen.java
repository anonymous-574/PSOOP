import java.util.*;

abstract class player
{
    abstract void get_guess(int u);
    double t=(Math.random()*100);
    int temp = (int)t;
}

class human_game extends player
{
    int number_of_tries;
    int max_trial;
    boolean chk=true;

    human_game(int m)
    {
        this.max_trial=m;
    }

    @Override
    void get_guess(int u) 
    {
        if (u==temp) 
        {
         System.out.println("Congradulations you are correct (*^_^*) ");
         System.out.println("You took "+number_of_tries +" tries ");
         chk=false;
        }
        else if (u>temp) 
        {
         System.out.println("Entered number is too big ");
         number_of_tries++;
         if (number_of_tries>=max_trial) 
         {
          System.out.println("you fail , actual number was "+temp);  
          System.exit(0);
         }  
         chk=true;
        }
        else
        {
            System.out.println("Entered number is too small");
            number_of_tries++; 

            if (number_of_tries>=max_trial) 
         {
          System.out.println("you fail , actual number was "+temp);  
          System.exit(0);
         }  
         chk=true;
  
        }  
    }


}


class comp_game extends player
{
    int number_of_tries;
    int max_trial;
    boolean chk=true;

    comp_game(int m)
    {
        this.max_trial=m;
    }

    @Override
    void get_guess(int u) 
    {
        if (u==temp) 
        {
         System.out.println("Congradulations you are correct (*^_^*) ");
         System.out.println("You took "+number_of_tries +" tries ");
         chk=false;
        }
        else if (u>temp) 
        {
         System.out.println("Entered number is too big ");
         number_of_tries++;
         if (number_of_tries>=max_trial) 
         {
          System.out.println("you fail , actual number was "+temp);  
          System.exit(0);
         }  
         chk=true;
        }
        else
        {
            System.out.println("Entered number is too small");
            number_of_tries++; 

            if (number_of_tries>=max_trial) 
         {
          System.out.println("you fail , actual number was "+temp);  
          System.exit(0);
         }  
         chk=true;
  
        }  
    }
}

public class random_gen {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter max number of trials: ");
    int max_trial = sc.nextInt();
    human_game g = new human_game(max_trial);
    comp_game c = new comp_game(max_trial);
    int n,temp;
    double t;

    while (g.chk) 
    {
        System.out.println("Enter number: ");
        n=sc.nextInt();
        g.get_guess(n);
    }

    while(c.chk)
    {
        t=(Math.random()*100);
        temp = (int)t;
        c.get_guess(temp);
    }

    sc.close();
   } 
}
