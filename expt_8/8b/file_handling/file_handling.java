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
            
        

        //for (int i = 0; i < 6; i++) {
        //    int_arr[i]=Integer.parseInt(broken_arr[i]);
        //}
    
        //int_chk=Integer.parseInt(chk);

        /* 
        int found=0;
        for (int i = 0; i < int_arr.length; i++) {
            if (int_arr[i]==int_chk) 
            {
             System.out.println("Element found ");   
             found++;
            }
        }

            if(found==0)
            {
                System.out.println("Element does not exist");
            }
       */
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


public class file_handling {
    public static void main(String[] args) {

        /* 
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
        

        
        File myfile = new File("string.txt");

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
            String c_temp;
    
            for (int j = 0; j < d.length; j++) {
                System.out.println("Enter the character to check for in line "+(j+1)+": ");
                c_temp = sc1.next();
                d[j]=new document(info[j], c_temp);
                d[j].search();
            }
            sc1.close();
            sc.close();
        }
         
        catch (Exception e) {
            e.printStackTrace();
        }
        */

        String int_info=null;
        

        
        File myfile_int = new File("number.txt");

        try {


            int_info=Files.readString(Path.of("D:\\code\\java_code\\college\\expt_8\\8b\\file\\number.txt"));

            Scanner sc1 = new Scanner(System.in);

            System.out.println("Enter the number in program ");
            String chk=sc1.next();
        
            webpage w = new webpage(int_info, chk);
            w.search();
            sc1.close();
        }
         
        catch (Exception e) {
            e.printStackTrace();
        }







    }


}

