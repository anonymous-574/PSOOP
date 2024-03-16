import java.util.*;

class bank
{
    double principle;
    double rate;
    //Calendar initial = new Calendar();
    //Calendar maturity = new Calendar();
    Date iniDate;
    Date finDate;
    long days_differnce;

    bank()
    {
        this.principle=0;
        
    }

    bank(double p)
    {
        this.principle=p;
    }

    void get_rate_o_interest()
    {
        System.out.println("My EXISTENCE IS ONLY TO BE OVERRIDEN (；′⌒`)");
    }
}

class icici extends bank
{
    icici(double p , int i_y , int i_m , int i_d , int m_y , int m_m , int m_d)
    {
        super(p);
        iniDate = new Date(i_y, i_m, i_d);
        finDate = new Date(m_y, m_m, m_d);
        days_differnce =(finDate.getTime() - iniDate.getTime())/ (1000*60*60*24); 
        days_differnce = days_differnce%365;
    }

    @Override
    void get_rate_o_interest()
    {
        if (days_differnce<7) 
        {
            System.out.println("Too few days , no interest will be given");
            System.out.println("You have: "+principle);
            return;    
        }


        if (days_differnce>=7 && days_differnce<=14)
        {
            rate=3.10;
        }
        else if (days_differnce>=15 && days_differnce<=30) 
        {
            rate=3.20;    
        }
        else if (days_differnce>=31 && days_differnce<=45) 
        {
            rate=3.50;    
        }
        else if (days_differnce>=46 && days_differnce<=90) 
        {
            rate=4.50;    
        }
        else if (days_differnce>=91 && days_differnce<=120) 
        {
            rate=4.70;    
        }
        else if (days_differnce>=91 && days_differnce<=120) 
        {
            rate=4.90;
        }
        else
        {
            rate=4.90;
        }
        principle=principle * Math.pow((1+(rate/365)),(days_differnce));
        //P(1+r/365)^(365t)
        System.out.println("You have "+principle+" Money now ");

        
    }

}

class axis extends bank
{
    axis(double p , int i_y , int i_m , int i_d , int m_y , int m_m , int m_d)
    {
        super(p);
        iniDate = new Date(i_y, i_m, i_d);
        finDate = new Date(m_y, m_m, m_d);
        days_differnce =(finDate.getTime() - iniDate.getTime())/ (1000*60*60*24); 
        days_differnce = days_differnce%365;
    }

    @Override
    void get_rate_o_interest()
    {
        if (days_differnce<7) 
        {
            System.out.println("Too few days , no interest will be given");
            System.out.println("You have: "+principle);
            return;    
        }


        if (days_differnce>=7 && days_differnce<=14)
        {
            rate=3.15;
        }
        else if (days_differnce>=15 && days_differnce<=30) 
        {
            rate=3.15;    
        }
        else if (days_differnce>=31 && days_differnce<=45) 
        {
            rate=3.45;    
        }
        else if (days_differnce>=46 && days_differnce<=90) 
        {
            rate=4.05;    
        }
        else if (days_differnce>=91 && days_differnce<=120) 
        {
            rate=4.70;    
        }
        else if (days_differnce>=91 && days_differnce<=120) 
        {
            rate=5.00;
        }
        else
        {
            rate=5.00;
        }

        principle=principle * Math.pow((1+(rate/365)),(days_differnce));
        System.out.println("You have "+principle+" Money now ");

        
    }
}

class sbi extends bank
{
    sbi(double p  , int i_y , int i_m , int i_d , int m_y , int m_m , int m_d)
    {
        super(p);
        iniDate = new Date(i_y, i_m, i_d);
        finDate = new Date(m_y, m_m, m_d);
        days_differnce =(finDate.getTime() - iniDate.getTime())/ (1000*60*60*24); 
        days_differnce = days_differnce%365;
    }

    @Override
    void get_rate_o_interest()
    {
        if (days_differnce<7) 
        {
            System.out.println("Too few days , no interest will be given");
            System.out.println("You have: "+principle);
            return;    
        }


        if (days_differnce>=7 && days_differnce<=14)
        {
            rate=3.00;
        }
        else if (days_differnce>=15 && days_differnce<=30) 
        {
            rate=3.00;    
        }
        else if (days_differnce>=31 && days_differnce<=45) 
        {
            rate=3.00;    
        }
        else if (days_differnce>=46 && days_differnce<=90) 
        {
            rate=4.05;    
        }
        else if (days_differnce>=91 && days_differnce<=120) 
        {
            rate=4.10;    
        }
        else if (days_differnce>=91 && days_differnce<=120) 
        {
            rate=4.10;
        }
        else
        {
            rate=4.10;
        }

        principle=principle * Math.pow((1+(rate/365)),(days_differnce));
        System.out.println("You have "+principle+" Money now ");
    }
}

public class interest {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double temp_prin;
        int ini_y,ini_m,ini_d,fin_y,fin_m,fin_d;
        int chk =1;
        while (chk!=0) 
    {
            
        
        System.out.println("Enter 1 to input new bank details , enter 0 to exit: ");
        chk = sc.nextInt();

        System.out.println("Enter 1 to do icici bank , 2 to do axis bank , 3 to do sbi bank ");
        int choice = sc.nextInt();

        switch (choice)
        {
        case 1: 
        {
            System.out.println("Enter principle: ");
            temp_prin=sc.nextDouble();
            System.out.println("Enter the date you deposited money: ");
            System.out.println("Enter year: ");
            ini_y=sc.nextInt();
            System.out.println("Enter month: ");
            ini_m=sc.nextInt();
            System.out.println("Enter day: ");
            ini_d=sc.nextInt();
            System.out.println("Enter the date you withdrew money: ");
            System.out.println("Enter year: ");
            fin_y=sc.nextInt();
            System.out.println("Enter month: ");
            fin_m=sc.nextInt();
            System.out.println("Enter day: ");
            fin_d=sc.nextInt();
            icici customer = new icici(temp_prin, ini_y, ini_m, ini_d, fin_y, fin_m, fin_d);
            customer.get_rate_o_interest();
            break;
        } 
        case 2: 
        {
            System.out.println("Enter principle: ");
            temp_prin=sc.nextDouble();
            System.out.println("Enter the date you deposited money: ");
            System.out.println("Enter year: ");
            ini_y=sc.nextInt();
            System.out.println("Enter month: ");
            ini_m=sc.nextInt();
            System.out.println("Enter day: ");
            ini_d=sc.nextInt();
            System.out.println("Enter the date you withdrew money: ");
            System.out.println("Enter year: ");
            fin_y=sc.nextInt();
            System.out.println("Enter month: ");
            fin_m=sc.nextInt();
            System.out.println("Enter day: ");
            fin_d=sc.nextInt();
            axis customer = new axis(temp_prin, ini_y, ini_m, ini_d, fin_y, fin_m, fin_d);
            customer.get_rate_o_interest();
            break;
        }
        case 3: 
        {
            System.out.println("Enter principle: ");
            temp_prin=sc.nextDouble();
            System.out.println("Enter the date you deposited money: ");
            System.out.println("Enter year: ");
            ini_y=sc.nextInt();
            System.out.println("Enter month: ");
            ini_m=sc.nextInt();
            System.out.println("Enter day: ");
            ini_d=sc.nextInt();
            System.out.println("Enter the date you withdrew money: ");
            System.out.println("Enter year: ");
            fin_y=sc.nextInt();
            System.out.println("Enter month: ");
            fin_m=sc.nextInt();
            System.out.println("Enter day: ");
            fin_d=sc.nextInt();
            sbi customer = new sbi(temp_prin, ini_y, ini_m, ini_d, fin_y, fin_m, fin_d);
            customer.get_rate_o_interest();
            break;
        }
        default:
        { 
            System.out.println("Error: User is an idiot");
            break;
        }

        }
    }
           
        sc.close();
    }
    
}