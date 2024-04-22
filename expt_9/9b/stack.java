import java.util.Scanner;

class stack_overflow extends Exception
{
    @Override
    public String toString() {
        return"You are trying to push beyond stack size";
    }
}

class stack_underflow extends Exception
{
    @Override
    public String toString() {
        return"You are trying to pop mull stack";
    }
}


class stack_ops 
{
    int stack_size;
    int[]info;
    int top =-1;

    stack_ops(int s)
    {
        this.stack_size=s;
        info = new int[stack_size];
    }
    
    void push (int a) throws stack_overflow
    {
        top++;
        if (top>=stack_size) {
            throw new stack_overflow();
        }
        info[top]=a;
    }

    int pop() throws stack_underflow
    {
        if (top==-1) {
            throw new stack_underflow();
        }
        return info[top--];
    }

}





public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is stack size? ");
        //stack_ops s = new stack_ops(sc.nextInt());
        stack_ops s = new stack_ops(5);

        try {
            //s.pop();
            s.push(5);
            s.push(43);
            s.push(36);
            s.push(23);
            //s.push(2);
            //s.push(53);
            System.out.println(s.pop());
        } 
        catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}
