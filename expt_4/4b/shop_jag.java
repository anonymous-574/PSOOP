import java.util.*;

class cart
{
    int[][][] data=new int [3][2][];
    int [] no_of_items = new int[3];
    cart()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 stands for a perisible item , 2 is non perisible");
        
        for(int k =0 ; k<3;k++)
        {
        System.out.println("Enter number of items in cart"+(k+1));
        no_of_items[k]=sc.nextInt();
        data[k][0] = new int[no_of_items[k]];
        data[k][1] = new int[no_of_items[k]];
        
        /*
             array_name[] = new data_type[n1] //n1= no. of columns in row-1
             array_name[] = new data_type[n2] //n2= no. of columns in row-2
             array_name[] = new data_type[n3] //n3= no. of columns in row-3
             */
        }
        
        for (int j = 0; j < 3; j++) {
            
        System.out.println("Enter info for cart "+(j+1));
        for (int i = 0; i < no_of_items[j]; i++) 
        {
          System.out.println("Enter Data for item:"+(i+1));
          System.out.println("Enter perishibility info:");
          data[j][0][i]=sc.nextInt();
          /*
          if (data[j][0][i]==0) 
          {
           no_of_items[j]=i;
           
           break; 
          }
          */
          System.out.println("Enter Price: ");
          data[j][1][i]=sc.nextInt();    
        }
    }
        
        sc.close();
    }

    void tot_cost()
    {
        int tot_cost=0;
        for (int j = 0; j < 3; j++) {
            tot_cost=0;
        for (int i = 0; i < no_of_items[j]; i++) {
            tot_cost+=data[j][1][i];
        }
        System.out.printf("Total cost of cart %d is: %d \n",(j+1),tot_cost);
       }
    }

    void cost_of_perish()
    {
        int cost_of_perish=0;
        for (int j = 0; j < 3; j++) {
            
        cost_of_perish=0;
        for (int i = 0; i < no_of_items[j]; i++) 
        {
          if (data[j][0][i]==1) 
          {
            cost_of_perish+=data[j][1][i];
          }  
        }
        System.out.printf("Total Cost of perishible items in card %d is %d \n",(j+1),cost_of_perish);
       }
    }

    void max_non_perish()
    {
        int max_non_perish=0;

        for (int j = 0; j < 3; j++) 
        {
            max_non_perish=0;
        for (int i = 0; i < no_of_items[j]; i++) 
        {
              if (data[j][1][i]>max_non_perish && data[j][0][i]==2) 
              // if data is of non perishible type and value is > than previous non perish one then new max = value
              {
                max_non_perish=data[j][1][i];
              }
           
        }
        System.out.printf("Maximum cost of non perishible item in cart %d is %d \n",(j+1),max_non_perish);
       }
    }
    
}

public class shop_jag {
    public static void main(String[] args) {
        cart c1 = new cart();


        c1.tot_cost();
        c1.max_non_perish();
        c1.cost_of_perish();
    }
}
