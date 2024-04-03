import java.util.*;

interface searchable
{
    void search();
}

class document implements searchable
{
    String str;
    char cha;
    document(String s,char c)
    {
        this.str=s;
        this.cha=c;
    }
    @Override
    public void search() {
        int found=0;
        System.out.println(str.length());
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==cha) {
                System.out.println("Element found at: "+i);
                found++;
            }
        }
        if (found==0) {
            System.out.println("Character not in array");
        }
    }
}

class webpage implements searchable
{
    int[]arr;
    int chk;
    webpage(int []imput,int chk)
    {
        this.arr=imput;
        this.chk=chk;
    }

    @Override
    public void search() {

/* 
        Arrays.sort(arr);
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            // Check if x is present at mid
            if (arr[m] == chk)
                System.out.println("Element found at: "+m);
 
            // If x greater, ignore left half
            if (arr[m] < chk)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
 
        // If we reach here, then element was
        // not present
        System.out.println("Element not in array");
        */

        int found=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==chk) 
            {
             System.out.println("Element found at: "+i);
             found++;    
            }
        }
        if (found==0) 
        {
         System.out.println("Element not in array");    
        }

    }
}


public class search_file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Enter char to check: ");
        char c = sc.next().charAt(0);
        document d = new document(str, c);
        d.search();

        System.out.println("Enter array size: ");
        int a[]= new int[sc.nextInt()];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter element: "+i);
            a[i]=sc.nextInt();
        }
        System.out.println("Enter number to find:");
        int find =sc.nextInt();
        webpage w =new webpage(a, find);
        w.search();
        sc.close();
    }
}
