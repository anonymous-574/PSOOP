import java.util.*;

class balance_error extends Exception
{
    @Override
    public String toString() {
        return"User has balance less than 0 or 0";
    }
}

class min_bal_err extends Exception
{
    @Override
    public String toString() {
       return"User has less money than min balance allowed of 500rs";
    }
}

class withdrawal_fail extends Exception
{
    @Override
    public String toString() {
        return "Withdrawal failed because you do not have enough money";
    }
}


class deposit_fail extends Exception
{
    @Override
    public String toString() {
        return "You cannot deposit negative money";
    }
}




abstract class account
{
    String name;
    double balance,interest , min_bal=500;
    long acc_no;
    abstract void deposit(double d);
    abstract void withdraw(double w);
    abstract void print();
    abstract void add_interest();
}

class saving_acc extends account
{

    saving_acc(String n , double b , long acc_no, double i)
    {
        this.name=n;
        this.acc_no=acc_no;
        this.interest=i;

        try
        {
        this.balance=b;
        if (balance<=0) 
        {
         throw new balance_error();    
        }

        if (balance<min_bal) 
        {
            throw new min_bal_err();
        }

        }
        catch (Exception e) {
           System.out.println(e);
           System.exit(0);
        }

    }

    @Override
    void deposit(double d) 
    {
        try {
            if (d<0) {
                throw new deposit_fail();
            }
            balance+=d;
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
    }

    @Override
    void withdraw(double w) {
        
        try {
            
            if (balance<w) {
                throw new withdrawal_fail();
            }
            if (balance<=min_bal) {
                throw new min_bal_err();
            }
            balance-=w;
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
    }

    @Override
    void print() {
        System.out.println("User: "+name+" of account number: "+acc_no+" has balance "+balance);
    }

    @Override
    void add_interest() throws ArithmeticException {
        if (interest<=0) 
        {
         throw new ArithmeticException();    
        }
        balance= balance*interest*1;
    }

}


public class bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your name?");
        String nam = sc.next();
        System.out.println("what is your current account balance? ");
        double cur_bal =sc.nextDouble();


        System.out.println("what is interest rate? ");
        double interest = sc.nextDouble();
        System.out.println("What is account number? ");
        long acc_no =sc.nextLong();
        saving_acc s = new saving_acc(nam, cur_bal, acc_no, interest);

        try {
            s.add_interest();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }

        System.out.println("How much do you want to deposit? ");
        double depo = sc.nextDouble();
        s.deposit(depo);
        System.out.println("how much do you want to withdraw? ");
        double with = sc.nextDouble();
        s.withdraw(with);

        s.print();

        sc.close();
    }
}