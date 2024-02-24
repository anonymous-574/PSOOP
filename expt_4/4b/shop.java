import java.util.*;

class cart
{
    int[][][] data=new int[3][2][50];
    //max 50 items allowed :)
    //[][][] == cart no , perishible or not (1,0) , price

    cart(int a)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) 
        {  
            System.out.println("Enter info for cart: "+i);
          for (int j = 0; j < 2; j++) 
          {
            System.out.println("Enter persibility of item");
             for (int k = 0; k < 50; k++) 
             {    
                     
             }
          }    
        }
        
        sc.close();
    }

    void tot_cost()
    {

    }

    void no_of_perish()
    {

    }

    void max_non_perish()
    {

    }
    
}

public class shop {
    public static void main(String[] args) {
        cart c1 = new cart();


        c1.tot_cost();
        c1.max_non_perish();
        c1.no_of_perish();
    }
}
