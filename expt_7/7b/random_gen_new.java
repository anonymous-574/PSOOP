import java.util.*;

abstract class player
{
    abstract void get_guess(int user , int actual_ans);
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
    void get_guess(int u, int actual_ans) 
    {
        if (u==actual_ans) 
        {
         System.out.println("Congradulations you are correct (*^_^*) ");
         System.out.println("You took "+number_of_tries +" tries ");
         chk=false;
        }
        else if (u>actual_ans) 
        {
         System.out.println("Entered number is too big ");
         number_of_tries++;
         if (number_of_tries>=max_trial) 
         {
          System.out.println("you fail , actual number was "+actual_ans);  
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
          System.out.println("you fail , actual number was "+actual_ans);  
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
    void get_guess(int u,int r) 
    {
        if (u==r) 
        {
         System.out.println("Congradulations you are correct (*^_^*) ");
         System.out.println("You took "+number_of_tries +" tries ");
         chk=false;
        }
        else if (u>r) 
        {
         System.out.println("Entered number is too big ");
         number_of_tries++;
         if (number_of_tries>=max_trial) 
         {
          System.out.println("you fail , actual number was "+r);  
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
          System.out.println("you fail , actual number was "+r);  
          System.exit(0);
         }  
         chk=true;
  
        }  
    }
}

public class random_gen_new {
   public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("For human vs human press 1 , for human vs computer press 2 , for computer vs computer press 3");
    int choice = sc1.nextInt();

    switch (choice) {
        case 1:
        {   
            human_vs_human();
            break;
        }
        case 2:
        {   
            comp_vs_human();
            break;
        }
        case 3:
        {   
            comp_vs_comp();
            break;
        }
        default:
        {
            System.out.println("Error , user is an idiot: ");
            break;
        }
    }
    sc1.close();
   } 

   static void comp_vs_human()
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter max number of trials: ");
    int max_trial = sc.nextInt();
    human_game g = new human_game(max_trial);
    int u_ans,temp;
    double t;

    System.out.println("What is the answer computer is to check? ");
    u_ans=sc.nextInt();
    while (g.chk) 
    {
        t=(Math.random()*100);
        temp = (int)t;
        System.out.println("Computers guess is "+temp);
        g.get_guess(temp,u_ans);
    }
    sc.close();
   }


   static void comp_vs_comp()
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter max number of trials: ");
    int max_trial = sc.nextInt();
    comp_game c1 = new comp_game(max_trial);
    int temp;
    double t;
    double temp_ans=(Math.random()*100);
    int temp_ans_int = (int)temp_ans;

    while(c1.chk)
    {
        t=(Math.random()*100);
        temp = (int)t;
        System.out.println("Computers guess is "+temp);
        c1.get_guess(temp,temp_ans_int);
    }

    sc.close();
   }

   static void human_vs_human()
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter max number of trials: ");
    int max_trial = sc.nextInt();
    human_game g1 = new human_game(max_trial);
    int n,actual_ans;
    System.out.println("Enter actual answer that user 2 is checking for: ");
    actual_ans=sc.nextInt();

    while (g1.chk) 
    {
        System.out.println("Enter number: ");
        n=sc.nextInt();
        g1.get_guess(n,actual_ans);
    }
    sc.close();

   }

   


}