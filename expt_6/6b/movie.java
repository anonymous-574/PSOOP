import java.util.*;

class rental
{
    String cust_id;
    double days_late;
    double net_late_fees=0;
    double net_bill=0;

    action a[] = new action[2];
    comedy c[]= new comedy[2];
    drama d[]= new drama[2];
    
    rental(String id )
    {
    this.cust_id=id;
    define();
    }
    
    void define()
    {
    Scanner sc = new Scanner(System.in);
    
   
    System.out.println("How many days were you late for guard galax: ");
    days_late=sc.nextInt();
    a[0]=new action("G","X-563","Guard galax",20,days_late);
    
    System.out.println("How many days were you late for lion king: ");
    days_late=sc.nextInt();
    a[1]=new action("R","X-523","lion king",15,days_late);
    
    System.out.println("How many days were you late for chalrie chap: ");
    days_late=sc.nextInt();
    c[0]=new comedy("PG-13","X-133","charlie chap",10,days_late);
    
    System.out.println("How many days were you late for 3 idiots: ");
    days_late=sc.nextInt();
    c[1]=new comedy("G","X-423","3 idiots",25,days_late);
    
    System.out.println("How many days were you late for drama1: ");
    days_late=sc.nextInt();
    d[0]=new drama("R","X-163","drama 1",12,days_late);
    
    System.out.println("How many days were you late for drama2: ");
    days_late=sc.nextInt();
    d[1]=new drama("G","X-753","drama 2",17,days_late);
    

    
    for(int i=0; i<2 ; i++)
    {
     net_late_fees+= a[i].late_fees+c[i].late_fees+d[i].late_fees;
     net_bill+=a[i].bill+c[i].bill+d[i].bill; 
    }
    
    System.out.println("You have to pay "+net_late_fees+" as late fees");
    System.out.println("You have to pay "+net_bill+" in total");
    sc.close();
    
    }
    
}



class cinema
{
    String age_res,id,title;
    double cost,bill,days_late,late_fees;
    
    cinema(String a , String i , String t , double c, double d)
    {
     this.age_res=a;
     this.id=i;
     this.title=t;
     this.cost=c;
     this.days_late=d;
    }
    
    void calc_late_fees()
    {
    System.out.println("Me is overrided :( ");
    this.bill=cost;
    }
    
    
       @Override
     public boolean equals(cinema obj) {
         if (obj == this) {
             return true;
         }
         if (obj.getClass() != this.getClass()) {
             return false;
         }
         return this.id==obj.id;
}

class action extends cinema
{
    action(String a , String i , String t , double c, double d)
    {
     super(a,i,t,c,d);
     calc_late_fees();
    }

    @Override
    void calc_late_fees()
    {
    this.late_fees=days_late*3;
    this.bill=cost+(late_fees);
    }
} 

class comedy extends cinema
{

    comedy(String a , String i , String t , double c, double d)
    {
     super(a,i,t,c,d);
     calc_late_fees();
    }

    @Override
    void calc_late_fees()
    {
    this.late_fees=days_late*2.5;
    this.bill=cost+(late_fees);
    }
} 

class drama extends cinema
{

    drama(String a , String i , String t , double c, double d)
    {
     super(a,i,t,c,d);
     calc_late_fees();
    }

    @Override
    void calc_late_fees()
    {
    this.late_fees=days_late*2;
    this.bill=cost+(late_fees);
    }
} 

public class movie {
    public static void main(String[] args) 
    {
     Scanner sc1 = new Scanner(System.in);
     System.out.println("What is user id? ");
     String id = sc1.next();
     rental user = new rental(id);
     sc1.close();
    
    
    
    }
    
}
