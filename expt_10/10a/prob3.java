class even extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 100; i+=2) {
            System.out.println("Even Thread: "+i);
        }
    }
}

class odd extends Thread
{
    @Override
    public void run() {
        for (int i = 1; i < 100; i+=2) {
            System.out.println("ODD Thread: "+i);
        }
    }
}

class eve_odd extends Thread
{
    int sum =0;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            sum+=i;
        }
        System.out.println("Sum is "+sum);
    }
}

public class prob3 {
    public static void main(String[] args) {
        
        even e = new even();
        odd o = new odd();
        eve_odd e_o = new eve_odd();

        e.start();
        o.start();
        try {
            e.join();
            o.join();
        } catch (Exception e1) {
            System.out.println(e1);
        }
        
        e_o.start();
    }
}
