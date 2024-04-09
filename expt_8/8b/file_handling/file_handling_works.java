import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
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
    String cha;
    document(String s,String c)
    {
        this.str=s;
        this.cha=c;
    }
    @Override
    public void search() 
    {
            
            if (str.contains(cha)) {
                System.out.println("Element found");
            }
            else
            {
                System.out.println("Element not found");
            }

    }
}


class webpage implements searchable
{
    String arr;
    int int_arr[];
    String chk;
    int int_chk;
    String[] broken_arr;
    webpage(String imput,String chk)
    {
        this.arr=imput;
        this.chk=chk;
    }

    @Override
    public void search() {

        String[] broken_arr= arr.split("-");
        
      int found=0;
      for (int i = 0; i < broken_arr.length; i++) {
        
      if (broken_arr[i].contains(chk)) {
        System.out.println("Element found");
        found++;
        }
    }
        
        if (found==0) {
            System.out.println("Element not found");
        }


        
    }
}


public class file_handling_works {
    public static void main(String[] args) {

    System.out.println("Press 1 to do file handling in string , 2 for handling in int");
    Scanner sc = new Scanner(System.in);
    
    switch (sc.nextInt()) {
        case 1:
        {
            call_str();
            break;
        }
        case 2:
        {
            call_int();
            break;
        }
        default:
        {
            System.out.println("Error: User is an idiot");
            break;
        }
    }
    sc.close();
        


    }

    static void call_str()
    {
        int noOfLines=0;
        int temp_no=0;

        try (Stream<String> fileStream = Files.lines(Paths.get("string.txt"))) {
            noOfLines = (int) fileStream.count();
            temp_no=noOfLines;
        }
        catch (Exception e) {
        e.printStackTrace();
        }

        String[] info= new String[temp_no];
        

        
        File myfile_str = new File("string.txt");

        try {
            Scanner sc = new Scanner(myfile_str);

            for (int i = 0; i < info.length; i++) {
                    info[i] =sc.nextLine();
                    if (!sc.hasNextLine()) {
                        break;
                    }
                }
            

            Scanner sc1 = new Scanner(System.in);

            document d[]= new document[info.length];
            String c_temp;
    
            for (int j = 0; j < d.length; j++) {
                System.out.println("Enter the character to check for in line "+(j+1)+": ");
                c_temp = sc1.nextLine();
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

    static void call_int()
    {
        String int_info=null;

        try {


            int_info=Files.readString(Path.of("D:\\code\\java_code\\college\\expt_8\\8b\\file\\number.txt"));

            Scanner sc2 = new Scanner(System.in);

            System.out.println("Enter the number in program ");
            String chk=sc2.next();
        
            webpage w = new webpage(int_info, chk);
            w.search();
            sc2.close();
        }
         
        catch (Exception e) {
            e.printStackTrace();
        }
    }



}
