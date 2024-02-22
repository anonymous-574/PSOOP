import java.util.*;


class time 
{
    int sec;
    int hour;
    int min;
    time()
    {
        sec=0;
        hour=0;
        min=0;
    }



    time(int a , int b , int c)
    {
        this.hour=a;
        this.min=b;
        this.sec=c;
        time_to_sec();
    }
    
    void sec_to_time(int s)
    {
        hour = s/3600;
        s-=(hour*3600);
        min = s/60;
        s-=(min*60);
        sec=s;
        prnt_info();
    }

    void prnt_info()
    {
        System.out.println("Hour: "+hour);
        System.out.println("Minute: "+min);
        System.out.println("Second: "+sec);

    }

    int time_to_sec()
    {
        int tot=0;
        tot+= hour*3600;
        tot+= min*60;
        tot+= sec;


        return tot; 
    }
}

public class clock {

    public static void main(String[] args) 
    {
        time t1 = new time();
        time t2 = new time(60,51,6);

        t1.sec_to_time(50000);
        int time2 =t2.time_to_sec();
        System.out.println(time2);

    }
}