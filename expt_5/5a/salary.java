import java.util.*;

class employee
{
    private String name,id;
    private int age;

    employee()
    {
        name=null;
        id=null;
        age=0;
    }


    employee(String n , String i , int a)
    {
        this.name=n;
        this.id=i;
        this.age=a;
    }

    String ret_name()
    {
        return name;
    }

    String ret_id()
    {
        return id;
    }

    int ret_age()
    {
        return age;
    }

}

class salaried_employee extends employee
{
     private double emp_salary;
    private char status;
    // t is temp , p is permnaent
    salaried_employee(String n , String i , int a , double e , char s)
    {
        super(n,i,a);
        this.emp_salary=e;
        this.status=s;
        set_salary();
    }

    salaried_employee()
    {
        super();
        this.emp_salary=0;
    }

    void set_salary()
    {
        if (status=='p' || status=='P') {
            emp_salary+=2000;
        }
    }

    double ret_sal()
    {
        return emp_salary;
    }
    

    void print_info()
    {
        System.out.println("Empoyee name is "+ret_name());
        System.out.println("Employee id is: "+ret_id());
        System.out.println("Employee age is: "+ret_age());
        System.out.println("Employee salary is: "+emp_salary);
        System.out.println();
    }
}




public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        salaried_employee s[] = new salaried_employee[5];

        String temp_nam;
        String temp_id;
        double temp_sal;
        int temp_age;
        char temp_stat;
        for (int i = 0; i < s.length; i++) {
            System.out.println("Enter info of employee "+(i+1));
            System.out.println("Enter name of Employee: ");
            temp_nam = sc.next();
            System.out.println("Enter id of employee: ");
            temp_id=sc.next();
            System.out.println("Enter employee age: ");
            temp_age=sc.nextInt();
            System.out.println("Enter employee Salary: ");
            temp_sal=sc.nextDouble();
            System.out.println("Enter employment status: ");
            temp_stat =sc.next().charAt(0);
            s[i]= new salaried_employee(temp_nam, temp_id, temp_age, temp_sal, temp_stat);
            

        }
        
        sc.close();
        salaried_employee temp = new salaried_employee();

    for (int i = 0; i < s.length; i++) {
        for (int j = 1; j < s.length-i; j++) {
         if(s[j].ret_sal() >s[j-1].ret_sal())
         {
                        
            temp = s[j];
            s[j] = s[j-1];
            s[j-1] = temp;
        }
       }
             
    }
        System.out.println();
        for (int i = 0; i < s.length; i++) {
            s[i].print_info();
        }
    
    }
    
    


}
