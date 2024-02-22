import java.util.*;

class calc
{
   private int year;
   private int month;
   private int day;
   private int hour;
   private int min;
   private int sec;

   private String name1;
   private int year1;
   private int month1;
   private int day1;
   private String name2;
   private int year2;
   private int month2;
   private int day2;

    calc()
    {
        this.year =2000;
        this.month =01;
        this.day=1;
        this.hour=00;
        this.min=00;
        this.sec=00;
    }
    
    calc(String n1 , int y1 , int m1 , int d1 , String n2 , int y2 , int m2 , int d2)
    {
        this.name1=n1;
        this.year1=y1;
        this.month1=m1;
        this.day1=d1;

        this.name2=n2;
        this.year2=y2;
        this.month2=m2;
        this.day2=d2;

    }



    void set_date(int y, int m , int d)
    {
        this.year=y;
        this.month=m;
        this.day=d;
    }

    void set_date( int y , int m , int d , int h , int min)
    {
        this.year=y;
        this.month=m;
        this.day=d;
        this.hour=h;
        this.min=min;  
    }

    void set_date(int y , int m , int d , int h , int min, int s)
    {
        this.year=y;
        this.month=m;
        this.day=d;
        this.hour=h;
        this.min=min;
        this.sec=s;
    }

    void print(int a)
    {
        switch (a) {
            case 1:
            {   
                print_date1();
                break;
            }
            case 2:
            {
                print_date2();
                break;
            }
            case 3:
            {
                print_date3();
                break;
            }
        
            default:
            {
                System.out.println("Acheivement unlocked: how did we get here? ");
               break;
            }
        }
    }

    void print_date1()
    {
        System.out.println("today is: " );
        System.out.printf("%d / %d / %d ",day,month,year);
    }

    
    void print_date2()
    {
        System.out.println("today is: " );
        System.out.printf("%d / %d / %d and time is %d:%d",day,month,year,hour,min);
    }

    
    void print_date3()
    {
        System.out.println("today is: " );
        System.out.printf("%d / %d / %d and time is %d:%d:%d ",day,month,year,hour,min,sec);
    }

    void retire()
    {
        year+=60;
        System.out.println("You will retire on: ");
        System.out.printf("%d / %d / %d ",day,month,year);
    }

    void sort_bir()
    {
        if ((year1==year2) && (month1==month2) && (day1==day2))
        {
            int res =name1.compareToIgnoreCase(name2);

            if (res>0)
            {
                //name 2
                System.out.println(name2);

            }
            else if(res>0)
            {
                //name 1
                System.out.println(name1);
            }
            else
            {
                System.out.println("Name and birthdays are same ._. ");
            }
        }
        else
        {
            long sum1=0;
            sum1+= year1*365 + month1*30 +day1;

            long sum2=0;
            sum2+= year2*365 + month2*30 +day2;

            if (sum1>sum2)
            {
                System.out.println(name2 +"is younger");

            }
            else
            {
                System.out.println(name1 +"is younger");
            }


        }
        
    }



}   



public class date {

    public static void main(String[] args) {
        
        calc d1 = new calc(); 
        Scanner sc = new Scanner(System.in);
        //print takes an int (Same as choice :) )
        System.out.println("Enter format of time to enter \n 1 to enter date \n 2 to enter hour and min \n 3 to enter seconds: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
            {
                // set date 1
                System.out.println("Enter year: ");
                int year = sc.nextInt();

                System.out.println("Enter month: ");
                int month = sc.nextInt();

                System.out.println("Enter day: ");
                int day = sc.nextInt();

                d1.set_date(year, month, day);
                d1.print(choice);
                break;
            }
            case 2:
            {
                //setdate 2
                System.out.println("Enter year: ");
                int year = sc.nextInt();

                System.out.println("Enter month: ");
                int month = sc.nextInt();

                System.out.println("Enter day: ");
                int day = sc.nextInt();

                System.out.println("Enter hour: ");
                int hour =sc.nextInt();

                System.out.println("Enter minute: ");
                int min = sc.nextInt();

                d1.set_date(year, month, day, hour, min);
                d1.print(choice);
                break;
            }
            case 3:
            {
                //setdate 3
                System.out.println("Enter year: ");
                int year = sc.nextInt();

                System.out.println("Enter month: ");
                int month = sc.nextInt();

                System.out.println("Enter day: ");
                int day = sc.nextInt();

                System.out.println("Enter hour: ");
                int hour =sc.nextInt();

                System.out.println("Enter minute: ");
                int min = sc.nextInt();

                System.out.println("Enter sec: ");
                int sec = sc.nextInt();

                d1.set_date(year, month, day, hour, min, sec);
                d1.print(choice);
                break;
            }
        
            default:
            {
                System.out.println("Enter a number between 1 and 3 only ._> ");
                d1.print_date3();
                break;
            }
        }

        calc d2 = new calc();

        System.out.println("\n\n\n\n\nWelcome to retirement age calculator");
        System.out.println("enter your date of birth: \n\n");

        System.out.println("Enter year: ");
        int year_bir = sc.nextInt();

        System.out.println("Enter month: ");
        int month_bir = sc.nextInt();

        System.out.println("Enter day: ");
        int day_bir = sc.nextInt();
        d2.set_date(year_bir, month_bir, day_bir);
        d2.retire();
        


        System.out.println("Welcome to young comparer");
        System.out.println("Enter info for person 1");
        System.out.println("Enter your name: ");
        String n1 = sc.next();
        System.out.println("Enter your year of birth: ");
        int y1 = sc.nextInt();
        System.out.println("Enter your month of birth: ");
        int m1 = sc.nextInt();
        System.out.println("Enter your day of birth: ");
        int day_1=sc.nextInt();

        System.out.println("\n\n\nEnter info for person 2");
        System.out.println("Enter your name: ");
        String n2 = sc.next();
        System.out.println("Enter your year of birth: ");
        int y2 = sc.nextInt();
        System.out.println("Enter your month of birth: ");
        int m2 = sc.nextInt();
        System.out.println("Enter your day of birth: ");
        int day_2=sc.nextInt();

        calc d3 = new calc(n1,y1,m1,day_1,n2,y2,m2,day_2);
        d3.sort_bir();





        sc.close();

    }
    
}
