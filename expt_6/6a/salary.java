import java.util.*;

class employee
{
    String name;
    int experience;
    int hours;
    int overtime;
    double salary;

    employee(String s , int e , int h , int o)
    {
        this.name=s;
        this.experience=e;
        this.hours=h;
        this.overtime=o;
    }

    void calc_salary()
    {
        System.out.println("My EXISTENCE IS ONLY TO BE OVERRIDEN (；′⌒`)");
    }
}

class manager extends employee
{

    manager(String s , int e , int h , int o)
    {
        super(s, e, h, o);
        calc_salary();
    }

@Override
void calc_salary()
{
    if (experience>=15)
    {
        salary = hours*2000 + overtime*2500;
    }
    else
    {
        salary = hours*1000 + overtime*1500;
    }

    if (salary>=40000) 
    {
        salary = salary *0.95;    
    }
    System.out.println(name + " has salary of "+salary);

}




}

class programmer extends employee
{

    programmer(String s , int e , int h , int o)
    {
        super(s, e, h, o);
        calc_salary();
    }


@Override
void calc_salary()
{
    if (experience>=15)
    {
        salary = hours*1000 + overtime*1500;
    }
    else
    {
        salary = hours*500 + overtime*1000;
    }

    if (salary>=30000) 
    {
        salary = salary *0.95;    
    }

    System.out.println(name + " has salary of "+salary);
}

}


public class salary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        employee emp;

        System.out.println("what is your name");
        String n = sc.next();
        System.out.println("how experienced are you?");
        int e = sc.nextInt();
        System.out.println("how many hours did you work today");
        int h = sc.nextInt();
        System.out.println("how many hours overtime did you work today");
        int o = sc.nextInt();
        System.out.println(" 1 for programmer , 2 for manager ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
            {
               emp = new programmer(n, e, h, o);     
              break;
            }
            
            case 2:
            {
                emp =  new manager(n, e, h, o);
                break;
            }
            default:
            {
                System.out.println("User is an idiot");
                break;
            }
        }
        sc.close();
    }
}