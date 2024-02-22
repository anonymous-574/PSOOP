import java.util.*;
 
class user 
{
private String username;
private String password;



user(String u , String p)
{
 this.username=u;

 //boolean val_pas;
   
 char a=p.charAt(0);
 int plen=p.length();
 
 if(plen>8 && plen<32 && !(p.contains("\\") || p.contains("/") || p.contains("=") || p.contains("\'") || p.contains("\"") || p.contains(" ")) &&(Character.isUpperCase(a) || Character.isLowerCase(a)))
    {
  	 this.password=p;
     System.out.println("Password is correct ");
     
    }
    else
    {
      System.out.println("Password is wrong , try again");
      //End program
      System. exit(0);
    }
 }
 
 
 
 
 
post p1 = new post(3, 2, 1);

void update (int c) { 
		if (c==1) 
        {
              p1.like++;  
        }
        else if(c==2)
        {
            p1.comment++;
        }
        else
        {
            p1.comment++;
            p1.like++;
        }
        
        System.out.println("New data: ");
        p1.print_data();
    }
    
  	void print_ini_dat()
  	{
  	System.out.println("initial data: ");
  	p1.print_data();
  	}  
    
}

class post
{
    int like;
    int comment;
    int post_id;

    post(int l , int c , int p)
    {
        this.like=l;
        this.comment=c;
        this.post_id=p;
    }

    void print_data()
    {
        System.out.println("Likes: "+like);
        System.out.println("Comments: "+comment);
        System.out.println("Post Id:"+post_id);
    }

    
}

public class media 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter username: ");
        String user = sc.next();
        System.out.println("Enter password: ");
        String pass =sc.next();
       
        user u1 = new user(user,pass);
        
        u1.print_ini_dat();
        System.out.println("do you want to like, comment or do both to the post");
        System.out.println("press 1 to like , 2 to comment , 3 to like and comment");
        int c=sc.nextInt();
        
        u1.update(c);
        
        sc.close();
    }
}
