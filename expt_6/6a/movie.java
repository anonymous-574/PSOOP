import java.util.*;

class production
{
    int cost,seats_booked;
    String title,dir,wri;

    production()
    {
        System.out.println("ME do nothing");
    }

    production(String t , String d , String w , int c,int s)
    {
        this.title=t;
        this.dir=d;
        this.wri=w;
        this.cost=c;
        this.seats_booked=s;
    }
}

class play extends production
{
    public static int no_of_performances;
    play ()
    {
        System.out.println("ME do nothing");
    }

    play(String t , String d , String w , int c,int s)
    {
        super(t,d,w,c,s);
        no_of_performances++;
    }

    @Override
    public String toString()
    {
        return"Play"+title+"has cost of "+cost+" and has "+seats_booked+" seats booked of writer "+wri+" and director "+dir;
    }
}

class musical extends play
{
    String composer,lyric;
    musical(String t , String d , String w , int c, int s , String comp , String lyr)
    {
        super(t, d, w, c,s);
        this.composer=comp;
        this.lyric=lyr;
    }

    @Override
    public String toString()
    {
        return"musical"+title+"has cost of "+cost+" and has "+seats_booked+" seats booked of writer "+wri+" and director "+dir+" with composer "+composer+" and lyrics written by "+lyric;
    }
    
}

public class movie
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //every time object is made performance ++
    //int no_of_performances=0;

    play[] p= new play[3];
    musical[] m= new musical[2];
    String temp_title , temp_dir , temp_wri , temp_comp , temp_lyr;
    int temp_cost,temp_seat;

    for (int i = 0; i < p.length; i++) 
    {
        System.out.println("Enter info for play "+(i+1));
        System.out.println("What is title");
        temp_title=sc.next();
        System.out.println("who is director");
        temp_dir=sc.next();
        System.out.println("who is writer"); 
        temp_wri=sc.next(); 
        System.out.println("what is cost of 1 seat");
        temp_cost=sc.nextInt();
        System.out.println("what is number of seats booked");  
        temp_seat=sc.nextInt();
        //no_of_performances++;
        p[i]=new play(temp_title, temp_dir, temp_wri, temp_cost, temp_seat);
    }


    for (int i = 0; i < m.length; i++) 
    {
        System.out.println("Enter info for musical "+(i+1));
        System.out.println("What is title");
        temp_title=sc.next();
        System.out.println("who is director");
        temp_dir=sc.next();
        System.out.println("who is writer"); 
        temp_wri=sc.next(); 
        System.out.println("what is cost of 1 seat");
        temp_cost=sc.nextInt();
        System.out.println("what is number of seats booked");  
        temp_seat=sc.nextInt();
        System.out.println("who is composer");
        temp_comp=sc.next();
        System.out.println("who is lyricist");
        temp_lyr=sc.next();
        //no_of_performances++;
        m[i]=new musical(temp_title, temp_dir, temp_wri, temp_cost, temp_seat, temp_comp, temp_lyr);
    }
    sc.close();

    for (int i = 0; i < p.length; i++) {
        System.out.println(p[i]);
    }

    for (int i = 0; i < m.length; i++) {
        System.out.println(m[i]);
    }

    System.out.println("number of performances are "+p[0].no_of_performances);

    }
}