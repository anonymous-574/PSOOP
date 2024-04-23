class welcome extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            try {
                //Thread.sleep(200);
                wait(2000);
            } catch (Exception e) {
                //e.printStackTrace();            
            }
            System.out.println("Welcome to spit");

        }
    }
}

class print extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            try {
                //Thread.sleep(200);
                wait(50);
            } catch (Exception e) {
                //e.printStackTrace();            
            }
            System.out.println("Comps engi dept");
        }
    }
}

public class prob2 {
    public static void main(String[] args) {
        welcome w = new welcome();
        print p = new print();

        w.start();
        p.start();
    }
}
