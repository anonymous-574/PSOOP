import java.util.Scanner;

class avg_excpetion extends Exception
{
    @Override
    public String toString() {
        return"Batting average cant be less than 0 ";
    }
}

class name_exception extends Exception
{
    @Override
    public String toString() {
        return"Name cannot be null";
    }
}

class run_exception extends Exception
{
    @Override
    public String toString() {
        return"You must have positive runs";
    }
}

class inn_except extends Exception
{
    @Override
    public String toString() {
        return"You cannot have less than 1 innings";
    }
}

class net_avg extends Exception
{
    @Override
    public String toString() {
        return"net average of team cannot be less than 20";
    }
}

class cricket
{
    String name;
    int runs;
    int innings;
    int not_out;
    double batting_avg;

    
    

    cricket(String n , int r , int inn , int not) throws name_exception,run_exception,inn_except
    {
        
        if (n==null) {
            throw new name_exception();
        }
        if (r<0) {
            throw new run_exception();
        }
        if (inn<0) {
            throw new inn_except();
        }
        
        this.name=n;
        this.runs=r;
        this.innings=inn;
        this.not_out=not;

    }

    void get_avg() throws avg_excpetion
    {
        batting_avg=(double) (runs/innings);
        if (batting_avg<0) {
            throw new avg_excpetion();
        }
    }

    @Override
    public String toString() {
        return"Players name is: "+name+" and scored: "+runs+" and has a batting average of: "+batting_avg;
    }

}


public class sports {

    public static void main(String[] args) throws net_avg{
        Scanner sc = new Scanner(System.in);

        cricket c[]= new cricket[3];
        String name;
        int runs,inn,not;

        try {
            for (int i = 0; i < c.length; i++) {
                System.out.println("Enter details of person: "+(i+1));
                System.out.println("Enter name: ");
                name = sc.next();
                System.out.println("Enter runs: ");
                runs=sc.nextInt();
                System.out.println("Enter your innings");
                inn=sc.nextInt();
                System.out.println("Enter number of not balls");
                not=sc.nextInt();
                c[i]= new cricket(name, runs, inn, not);
                c[i].get_avg();
            }
        } catch (Exception e) {
            System.out.println(e);
        }


        //error part
        try {
            c[7]=new cricket("hi", 42, 42, 34);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        cricket temp;
        for (int i = 0; i <c.length; i++) {
            for (int j = 1; j < c.length-i; j++) 
            {
                if (c[j].batting_avg<c[j-1].batting_avg) 
                {
                    temp=c[j]; 
                    c[j]=c[j-1];
                    c[j-1]=temp;   
                }    
            }
        }



        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        double net_avg=0;

        for (int i = 0; i < c.length; i++) {
            net_avg+=c[i].batting_avg;
        }
        net_avg/=c.length;

        try {
            if (net_avg<=20) {
                throw new net_avg();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally
        {
            sc.close();
        }
        
    }
}