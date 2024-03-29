import java.nio.channels.AcceptPendingException;
import java.util.*;

import javax.crypto.BadPaddingException;

abstract class mark_calc {
double percentage;
abstract void get_percent();
}

class a extends mark_calc
{   
    int[] marks = new int[3];

    a(int[] m)
    {
        this.marks=m;
    }

    @Override
    void get_percent() {
        
        for (int i = 0; i < marks.length; i++) 
        {
         percentage+=marks[i];   
        }

        percentage/=marks.length;
        System.out.println("Your grade is "+percentage +" %");
    }

    void sort_mark()
    {
        int temp;

        for (int i = 0; i < marks.length; i++) {
            for (int j = 1; j < marks.length-i; j++) 
            {
                if(marks[j]>marks[j-1])
                {
                    temp= marks[j];
                    marks[j]=marks[j-1];
                    marks[j-1]=temp;
                }     
            }
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks in subject "+(i+1) +" are "+marks[i]);
        }
    }
}

class b extends mark_calc
{
    int[] marks = new int[4];

    b(int[] m)
    {
        this.marks=m;
    }
    @Override
    void get_percent() {
        
        for (int i = 0; i < marks.length; i++) 
        {
         percentage+=marks[i];   
        }

        percentage/=marks.length;
        System.out.println("Your grade is "+percentage +" %");
    }

    void sort_mark()
    {
        int temp;

        for (int i = 0; i < marks.length; i++) {
            for (int j = 1; j < marks.length-i; j++) 
            {
                if(marks[j]>marks[j-1])
                {
                    temp= marks[j];
                    marks[j]=marks[j-1];
                    marks[j-1]=temp;
                }     
            }
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks in subject "+(i+1) +" are "+marks[i]);
        }
    }
}

public class marks {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int[] a_info= new int[3];
    for (int i = 0; i < a_info.length; i++) {
        System.out.println("Enter info of subject "+ (i+1));
        a_info[i]=sc.nextInt();
    }
    a a1 = new a(a_info);
    a1.get_percent();
    a1.sort_mark();

    int[] b_info= new int[4];
    for (int i = 0; i < b_info.length; i++) {
        System.out.println("Enter info of subject "+ (i+1));
        b_info[i]=sc.nextInt();
    }
    b b1 = new b(b_info);
    b1.get_percent();
    b1.sort_mark();



    sc.close();
    }
}
