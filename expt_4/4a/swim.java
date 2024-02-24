import java.util.*;


class pool
{
    
     int[][] anna= new int[4][4];
     int[][] jeff= new int[4][4];
     Scanner sc = new Scanner(System.in);
    pool()
    {
        System.out.println("ENTER 1 FOR IN A SESSION , ENTER 0 FOR AVAILABLE");
        System.out.println("Enter initial data for jeff");
       for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            ask(i,j);
            jeff[i][j]=sc.nextInt();
        }
       } 

       System.out.println("Enter initial data for anna");
       for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            ask(i,j);
            anna[i][j]=sc.nextInt();
        }
       } 
    }

    void ask(int a , int b)
    {

      //HashMap< pair<Integer ,Integer>,String > h1 = new HashMap<>();
      

       switch (a) 
       {
        case 0:
          {
          System.out.print("\n  11-12 pm on ");
          break;
          }
        case 1:
          {
           System.out.print("\n  12-1 pm on ");
           break;
          }

        case 2:
          {
            System.out.print("\n  1-2 pm on ");
            break;
          }

        case 3:
          {
            System.out.print("\n  2-3 pm on ");
            break;
          }
        default:
        {
            System.out.println("ERROR: USER IS AN IDIOT ._. ");
            break;
        }
       }

       switch (b) 
       {
        case 0:
        {
          System.out.println("Monday");
          break;
        }
        case 1:
        {
          System.out.println("Tuesday");
          break;
        }
        case 2:
        {
          System.out.println("Wednesday");
          break;
        }
        case 3:
        {
          System.out.println("Thursday");
          break;
        }
       
        default:
        {
            System.out.println("ERROR: USER IS STILL AN IDIOT ._. ");
            break;
        }
       }
    }

    void mark(int m ,int a , int b , int c)
    {
      if(m==1)
      {
      jeff[a][b]=c;
      }
      else if (m==2) 
      {
        anna[a][b]=c;
      }
      else
      {
        System.out.println("Error: User is an idiot");
      }
      
    }

    void print()
    {
      for (int i = 0; i <4; i++) {
       for (int j = 0; j < 4; j++) {
        System.out.print(jeff[i][j]);
       } 
       System.out.println();
      }
      System.out.println("\n\n");

      for (int i = 0; i <4; i++) {
        for (int j = 0; j < 4; j++) {
         System.out.print(anna[i][j]);
        } 
        System.out.println();
       }
    }

    void indi()
    {
      System.out.println("Jeff is free on: \n");
      for (int i = 0; i <4; i++) {
        for (int j = 0; j < 4; j++) 
        {
         
         if (jeff[i][j]==0) 
         {
          ask(i,j);
         }
          
          
        } 
      }
      System.out.println("\n\nAnna is free on: \n");
      for (int i = 0; i <4; i++) 
      {
        for (int j = 0; j < 4; j++) 
        {
          if (anna[i][j]==0) {
            
            ask(i,j);
         }
        }
      }
      

      
    }

    void grp()
    {
      System.out.println("Group sessions can be held on: \n");
      for (int i = 0; i <4; i++) {
        for (int j = 0; j < 4; j++) 
        {
          if (jeff[i][j]==0 && anna[i][j]==0) {
            
            ask(i,j);
          }
        }   
      }
    }
}


public class swim 
{
    public static void main(String[] args) 
    {
        
        pool p1 = new pool();
        Scanner sc1 = new Scanner(System.in);


        System.out.println("Enter 1 to modify schedule \n enter 2 to show individual free schedules \n enter 3 to show group lessons available schedules \n enter 4 to print schedules");
        System.out.println("Enter 1 to modify jeff , 2 to mofify anna");
        int m = sc1.nextInt();
        System.out.println("Enter row");
        int a = sc1.nextInt();
        System.out.println("Enter column");
        int b =sc1.nextInt();
        System.out.print("You will be modifying info of: ");
        p1.ask(a,b);
        System.out.println("Enter 0 to mark as free , 1 to mark as available");
        int c = sc1.nextInt();
        p1.mark(m,a, b, c);

        p1.indi();
        p1.grp();
        p1.print();
        
    }
}
