import java.util.*;

class user
{
    private String name;
    private int age;
    private int bal;
    int choice;

    user (String str , int a , int b)
    {
        this.name=str;
        this.age=a;
        this.bal=b;

    
    
    }
    movie_data[] movie= new movie_data[5];

    
    void define()
   {
    movie[0]= new movie_data("Sholay", 16, 200,1,"ALok","shreya","Action");
    movie[1]= new movie_data("Que", 18, 800,2,"rohan","radhika","romance");
    movie[2]= new movie_data("Red Sun", 12, 1200,3,"ello","elloe","Thriller");
    movie[3]= new movie_data("mov", 19, 2000,4,"male_1","female_1","animated");
    movie[4]= new movie_data("nemo?", 10, 1000,5,"male_7","female_98","romance");
   }
    
   

   
    void show_opt()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Here is list of available movies ");
        System.out.println("which movie do you want to buy?");
        for (int i =0 ; i<5;i++) 
        {
         movie[i].print_mov();    
        }
        System.out.println("Enter movie id: ");
        choice = sc.nextInt();
        sc.close();
        buy_mov(choice);
        
    }

    void buy_mov(int a)
    {
        int ch = a;
        ch--;
        if(age>=movie[ch].age_res)
        {
            if(bal>movie[ch].cost)
            {
            bal-=movie[ch].cost;
            System.out.println("you have now bought "+movie[ch].mov_name);
            System.out.println("now playing "+movie[ch].mov_name);
            }
            else{
                System.out.println("Go beg your parents for more money ( $ _ $ )");
            }
        }
        else
        {
            System.out.println("You are too young (✿◡‿◡)");
        }
        
    }

    void sort()
    {
        movie_data temp_movie = new movie_data();
        
        for(int i=0; i < movie.length; i++){  
                for(int j=1; j < (movie.length-i-1); j++){  
                         if(movie[j-1].cost > movie[j].cost)
                         {  
                            temp_movie = movie[j];
                            movie[j] = movie[j + 1];
                            movie[j + 1]= temp_movie; 
                         }
                        
                }
            }

        for (int k = 0; k < 5; k++) 
        {
            System.out.println("Movie: "+(k+1));
            movie[k].print_mov();   
        }
    }


}

class movie_data 
{
     public String mov_name;
     public int age_res;
     public int cost;
     public int mov_id;
     public String hero;
     public String heroine;
     public String type;

    movie_data(String m , int r , int c , int i,String h , String he,String t)
    {
        this.mov_name=m;
        this.age_res=r;
        this.cost=c;
        this.mov_id=i;
        this.hero=h;
        this.heroine=he;
        this.type=t;
    }

    movie_data()
    {
        
    }

   
    
    void print_mov()
    {
        System.out.println("Movie name: " + mov_name);
        System.out.println("Movie id: "+mov_id);
        System.out.println("age restriction: "+age_res +"+");
        System.out.println("Movie cost: "+cost);
        System.out.println("Hero: "+hero);
        System.out.println("Heroine: "+heroine);
        System.out.println("Type: "+type);
        System.out.println("\n");
    }
}


public class movie_arr 
{

    public static void main(String[] args) 
    {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name =sc1.next();
        System.out.println("Enter your age: ");
        int age=sc1.nextInt();
        System.out.println("enter your pocket money: ");
        int bal=sc1.nextInt();
        

        user u1 = new user(name , age , bal);
        u1.define();
        
        //u1.show_opt();
        u1.sort();


        sc1.close();
    }

}