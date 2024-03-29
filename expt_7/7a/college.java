import java.util.*;

abstract class course
{
    String name,year;
    long uid;

    course(String n , String y , long u)
    {
        this.name=n;
        this.year=y;
        this.uid=u;
    }

    abstract void student_details();

    
}

class comps extends course
{

    comps(String n , String y , long u)
    {
        super(n, y, u);
    }

    @Override
    void student_details() {
        System.out.println("Comps student " +name+" of uid "+uid+" and of "+year+" year ");      
    }
}

class it extends course{

    it(String n , String y , long u)
    {
        super(n, y, u);
    }

    @Override
    void student_details() {
        System.out.println("IT student " +name+" of uid "+uid+" and of "+year+" year ");          
    }
}


public class college {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String temp_name , temp_year;
        long temp_uid;

        it[] it_student = new it[3];
        it temp_it;
        comps[] comps_student = new comps[3];
        comps temp_Comps;

        System.out.println("enter details of it students");
        for (int j = 0; j < comps_student.length; j++) {
            System.out.println("Enter info of student "+(j+1));
            System.out.println("Enter your name: ");
            temp_name=sc.next();
            sc.nextLine();
            System.out.println("Enter UID: ");
            temp_uid=sc.nextLong();
            System.out.println("Enter year: ");
            temp_year=sc.next();
            it_student[j]= new it(temp_name, temp_year, temp_uid);
        }

        System.out.println("Enter details of comps students");
        for (int j = 0; j < it_student.length; j++) {
            System.out.println("Enter info of student "+(j+1));
            System.out.println("Enter your name: ");
            temp_name=sc.next();
            sc.nextLine();
            System.out.println("Enter UID: ");
            temp_uid=sc.nextLong();
            System.out.println("Enter year: ");
            temp_year=sc.next();
            comps_student[j]= new comps(temp_name, temp_year, temp_uid);
        }


        for (int i = 0; i < comps_student.length; i++) {
            for (int j = 1; j < comps_student.length-i; j++) 
            {
                if (comps_student[j].year.charAt(0)<comps_student[j-1].year.charAt(0)) 
                {
                    temp_Comps=comps_student[j]; 
                    comps_student[j]=comps_student[j-1];
                    comps_student[j-1]=temp_Comps;   
                }    
            }
        }

        for (int i = 0; i <it_student.length; i++) {
            for (int j = 1; j < it_student.length-i; j++) 
            {
                if (it_student[j].year.charAt(0)<it_student[j-1].year.charAt(0)) 
                {
                    temp_it=it_student[j]; 
                    it_student[j]=it_student[j-1];
                    it_student[j-1]=temp_it;   
                }    
            }
        }

        for (int i = 0; i < comps_student.length; i++) {
            comps_student[i].student_details();
        }

        for (int i = 0; i < it_student.length; i++) {
            it_student[i].student_details();
        }

        sc.close();
    }
}