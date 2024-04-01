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
        System.out.println("Computers guess is "+temp);
        c.get_guess(temp);
    }

    if (g.number_of_tries<c.number_of_tries) 
    {
     System.out.println("Human Won !!");    
    }
    else{
        System.out.println("Computer won");
    }



    sc.close();
   }


   static void comp_vs_comp()
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter max number of trials: ");
    int max_trial = sc.nextInt();
    comp_game c1 = new comp_game(max_trial);
    comp_game c2 = new comp_game(max_trial);
    int temp;
    double t;

  
    while(c1.chk)
    {
        t=(Math.random()*100);
        temp = (int)t;
        System.out.println("Computers guess is "+temp);
        c1.get_guess(temp);
    }

    while(c2.chk)
    {
        t=(Math.random()*100);
        temp = (int)t;
        System.out.println("Computers guess is "+temp);
        c2.get_guess(temp);
    }

    if (c1.number_of_tries<c2.number_of_tries) 
    {
     System.out.println("computer 1 Won !!");    
    }
    else{
        System.out.println("Computer 2 won");
    }

    sc.close();
   }

   static void human_vs_human()
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter max number of trials: ");
    int max_trial = sc.nextInt();
    human_game g1 = new human_game(max_trial);
    human_game g2 = new human_game(max_trial);
    int n;

    while (g1.chk) 
    {
        System.out.println("Enter number: ");
        n=sc.nextInt();
        g1.get_guess(n);
    }

    while (g2.chk) 
    {
        System.out.println("Enter number: ");
        n=sc.nextInt();
        g2.get_guess(n);
    }
    
    if (g1.number_of_tries<g2.number_of_tries) 
    {
     System.out.println("Human 1 Won !!");    
    }
    else{
        System.out.println("Human 2 won");
    }

    sc.close();

   }

   


}