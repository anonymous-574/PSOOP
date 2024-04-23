class a extends Thread 
{
    @Override
    public void run() {
        System.out.println("ELLO");
    }
}

public class threading {

    public static void main(String[] args) {

        Thread a1 = new Thread("thread a");
        a1.start();
        /* 
        try {
            System.out.println("hello");
            Thread.sleep(5000); 
            System.out.println("bye");       

        } catch (Exception e) {
            System.out.println(e);
        }*/
    }
}