import java.util.*;

class user
{
    Scanner sc = new Scanner(System.in);
    private String name;
    private int age;
    private int bal;

    movie_data m1 = new movie_data("Sholay", 16, 200,1);
    movie_data m2 = new movie_data("Que", 18, 800,2);
    movie_data m3 = new movie_data("Red Sun", 12, 1200,3);

    user (String s , int a , int b)
    {
        this.name =s;
        this.age = a;
        this.bal=b;
    }

    int choice=0;
    void show_opt()
    {
        System.out.println("Here is list of available movies ");
        System.out.println("which movie do you want to buy?");
        m1.print_mov();
        m2.print_mov();
        m3.print_mov();
        System.out.println("Enter movie id: ");
        choice = sc.nextInt();
        sc.close();
        buy_mov(choice);
        
    }

    void buy_mov(int c)
    {
        if(choice==1)
        {
            if(age>=m1.age_res && bal>=m1.cost)
            {
                bal-=m1.cost;
                System.out.println("you have now bought "+m1.mov_name);
                System.out.println("now playing "+m1.mov_name);
            }
            else
            {
                System.out.println("You have no money or you are not old enough");
            }

        }
        else if(choice==2)
        {
            if(age>=m2.age_res && bal>=m2.cost)
            {
                bal-=m2.cost;
                System.out.println("you have now bought "+m2.mov_name);
                System.out.println("now playing "+m2.mov_name);

            }
            else
            {
                System.out.println("You have no money or you are not old enough");
            }
            
        }
        else
        {
            if(age>=m3.age_res && bal>=m3.cost)
            {
                bal-=m3.cost;
                System.out.println("you have now bought "+m3.mov_name);
                System.out.println("now playing "+m3.mov_name);

            }
            else
            {
                System.out.println("You have no money or you are not old enough");
            }
            
        }
        System.out.println("You now have: "+bal);
    }


    
}

class movie_data 
{
     String mov_name;
     int age_res;
     int cost;
     int mov_id;

    movie_data(String m , int r , int c , int i)
    {
        this.mov_name=m;
        this.age_res=r;
        this.cost=c;
        this.mov_id=i;


    }

   
    
    void print_mov()
    {
        System.out.println("Movie name: " + mov_name);
        System.out.println("Movie id: "+mov_id);
        System.out.println("age restriction: "+age_res +"+");
        System.out.println("Movie cost: "+cost);
        System.out.println("\n");
    }
}


public class movie {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name =sc1.next();
        System.out.println("Enter your age: ");
        int age=sc1.nextInt();
        System.out.println("enter your pocket money: ");
        int bal=sc1.nextInt();
        

        user u1 = new user(name , age , bal);
        u1.show_opt();

        sc1.close();
    }
}