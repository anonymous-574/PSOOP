import java.util.*;

interface searchable
{
    void search();
}

class document implements searchable
{
    String str;
    CharSequence sub;
    document(String s,CharSequence c)
    {
        this.str=s;
        this.sub=c;
    }
    @Override
    public void search() {
        boolean found=str.contains(sub);

        if (found) 
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Not found");
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


        int location=0;
        Arrays.sort(arr);
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            // Check if x is present at mid
            if (arr[m] == chk)
            {
                System.out.println("Element found at: "+m);
                location=m;

                if (location==0) {
            
                    if (arr[location+1]==chk) {
                        System.out.println("Element found at: "+(location+1));
                    }
        
                 }
                 else if (location==arr.length) {
                    if (arr[location-1]==chk) {
                        System.out.println("Element found at: "+(location-1));
                    }
                 }
                 else
                 {
                    if (arr[location+1]==chk) {
                        System.out.println("Element found at: "+(location+1));
                    }
        
        
                    if (arr[location-1]==chk) {
                        System.out.println("Element found at: "+(location-1));
                    }
                 }

            }
            // If x greater, ignore left half
            if (arr[m] < chk)
            {
                l = m + 1;
            }
 
            // If x is smaller, ignore right half
            else
            {
                r = m - 1;
            }
        }

        
         

 
        // If we reach here, then element was
        // not present
        System.out.println("Element not in array");
    

    }
}


public class search_file_binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Enter sequence to check: ");
        CharSequence c = sc.next();
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