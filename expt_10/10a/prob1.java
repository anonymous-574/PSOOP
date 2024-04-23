class methread implements Runnable
{
    @Override
    public void run() {
        System.out.println("Me is in thread");
    }

   
}


public class prob1 {
    public static void main(String[] args) {
        
        methread a1 = new methread();
        

        Thread t1 = new Thread(a1,"Thread a");
        Thread t2 = new Thread(a1,"Thread b");

        t1.start();
        t2.start();

        System.out.println(t1.getName());
        System.out.println(t2.getName());


    }
}
