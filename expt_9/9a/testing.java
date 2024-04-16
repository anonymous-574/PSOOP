import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(args[1]);
        } 
        catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


        sc.close();
    }
}
