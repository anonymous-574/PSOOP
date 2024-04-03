import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

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


public class file_handling {
    public static void main(String[] args) {

        int noOfLines=0;
        int temp_no=0;

        try (Stream<String> fileStream = Files.lines(Paths.get("ello.txt"))) {
            noOfLines = (int) fileStream.count();
            temp_no=noOfLines;
        }
        catch (Exception e) {
        e.printStackTrace();
        }

        String[] info= new String[temp_no];
        

        
        File myfile = new File("ello.txt");

        try {
            Scanner sc = new Scanner(myfile);

            for (int i = 0; i < info.length; i++) {
                    info[i] =sc.nextLine();
                    if (!sc.hasNextLine()) {
                        break;
                    }
                }
            

            Scanner sc1 = new Scanner(System.in);

            document d[]= new document[info.length];
            char c_temp;
    
            for (int j = 0; j < d.length; j++) {
                System.out.println("Enter the character to check for in line "+(j+1)+": ");
                c_temp = sc1.next().charAt(0);
                d[j]=new document(info[j], c_temp);
                d[j].search();
            }
            sc1.close();
            sc.close();
        }
         
        catch (Exception e) {
            e.printStackTrace();
        }
    }


}
