import java.util.*;

class age_exception extends Exception
{
    
    public String toString() {
    return"Your age is greater than 60 years please retire";
    }
}

class name_exception extends Exception
{
    @Override
    public String toString() {
        return"Your name cannot have a number";
    }
}



class employee
{
    int age;
    String name;


    employee(int a, String n)
    {
        try
    {
        try {
            chk_name(n);
            this.name=n;
        } 
        catch (name_exception e) {
            System.out.println(e);
            throw new Exception();
        }

            try {
                ckk_age(a);
                this.age=a;
            } 
            catch (age_exception e) 
            {
            System.out.println(e);
            throw new Exception();
            }
        prnt();
    }
        catch(Exception e)
        {
            //e.printStackTrace();
        }
    
        finally
        {
            System.out.println("i am done");
        }
    
    }

    void prnt()
    {
        System.out.println("Your age is "+age+" and your name is "+name);
    }

    void ckk_age(int a) throws age_exception
    {
        
        
        if (a>60)
        {
            throw new age_exception();
        }
        
       
    }

    void chk_name(String n) throws name_exception
    {

       
        if (n.matches(".*\\d.*"));
        {
            throw new name_exception();
        }
        /* 
                char temp;
            for (int i = 0; i < n.length(); i++) {
                temp=n.charAt(i);

                //if (temp=='1'||temp=='2'||temp=='3'||temp=='4'||temp=='5'||temp=='6'||temp=='7'||temp=='8'||temp=='9'||temp=='0') {
                //    throw new name_exception();
                //}  
                

                //if (Character.isDigit(temp)) {
                //    throw new name_exception();
                //}  
            } 
            */
       
    }


}

class exception_hand {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String temp = sc .next();
        System.out.println("what is your age?");
        int temp1 = sc.nextInt();
        employee e = new employee(temp1, temp);
        sc.close();
    }
}
