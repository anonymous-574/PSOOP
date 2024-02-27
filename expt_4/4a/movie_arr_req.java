import java.util.*;

class user
{
    Scanner sc = new Scanner(System.in);
    String mov_name;
    int age_res;
    int cost;
    int mov_id;
    String hero;
    String heroine;
    String type;
    movie_data[] movie= new movie_data[3];

    user()
    {   

        for (int i = 0; i < movie.length; i++) {
            System.out.println("Enter info of movie: "+ (i+1));
            System.out.println("Enter movie name: ");
            mov_name=sc.next();
            System.out.println("Enter age restriction:");
            age_res=sc.nextInt();
            System.out.println("Enter movie cost: ");
            cost=sc.nextInt();
            System.out.println("enter movie id");
            mov_id=sc.nextInt();
            System.out.println("Enter hero name:");
            hero=sc.next();
            System.out.println("Enter heroine name:");
            heroine=sc.next();
            System.out.println("Enter type of movie:");
            type=sc.next();
            movie[i] = new movie_data(mov_name, age_res, cost, mov_id, hero, heroine, type);
        }

        sc.close();
    }

    void sort()
    {
            movie_data temp = new movie_data();
            for (int i = 0; i < movie.length; i++) {
                for (int j = 1; j < movie.length-i; j++) {
                    if(movie[j].cost >movie[j-1].cost)
                    {
                        
                        temp = movie[j];
                        movie[j] = movie[j-1];
                        movie[j-1] = temp;
                    }
                }
            }
    


        for (int k = 0; k < movie.length; k++) 
        {
            System.out.println("Movie: "+(k+1)); 
            System.out.println("Movie name: "+movie[k].mov_name);
            System.out.println("Movie cost: "+movie[k].cost); 
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

}


public class movie_arr 
{

    public static void main(String[] args) 
    {
        user u1 = new user();
        u1.sort();


       
    }

}