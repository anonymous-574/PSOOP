import java.util.*;

interface sortable 
{
    void sort(int []a);
}

class bubble implements sortable
{
    @Override
    public void sort(int []a) {
        int i, j, temp;
        boolean swapped;
        int n = a.length;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                     
                    // Swap arr[j] and arr[j+1]
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
 
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }

        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);
        }
    }
 
}

class selection implements sortable
{
    @Override
    public void sort(int a[]) {
        int n = a.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (a[j] < a[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = a[min_idx]; 
            a[min_idx] = a[i]; 
            a[i] = temp; 
        }

        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);
        } 
    } 
}


public class array_sort {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many numbers are there?");
    int[] arr = new int[sc.nextInt()];

    for (int i = 0; i < arr.length; i++) {
        System.out.println("Enter array element: "+(i+1));
        arr[i]=sc.nextInt();
    }

    System.out.println("Selection sorting......");
    selection s = new selection();
    s.sort(arr);

    System.out.println("Bubble sorting......");
    bubble b = new bubble();
    b.sort(arr);

    sc.close();
}
}