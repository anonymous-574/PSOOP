class gen_rand extends Thread
{
    int random_no=0;
    @Override
    public void run() {
        //generate new number 10 times
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            //number between 0 and 50
            random_no=(int)(Math.random()*50);
            System.out.println("Random number guess is: "+random_no);
            squ s = new squ(random_no);
            cub c = new cub(random_no);
            s.start();
            c.start();
        }
    }
}

class squ extends Thread
{
    int num;
    squ(int s)
    {
        this.num=s;
    }

    @Override
    public void run() {
        System.out.println("Square of: "+num+" is: "+(num*num));
    }
}

class cub extends Thread
{
    int num;
    cub(int s)
    {
        this.num=s;
    }

    @Override
    public void run() {
        System.out.println("Cube of: "+num+" is: "+(num*num*num));
    }
}

public class random {
    public static void main(String[] args) {
        gen_rand r = new gen_rand();
        r.start();
    }
}
