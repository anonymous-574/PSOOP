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


public class college_arraylist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String temp_name , temp_year;
        long temp_uid;

        it temp_it;
        comps temp_Comps;

        ArrayList <it> it_stud = new ArrayList<>();
        ArrayList <comps>comps_stud = new ArrayList<>();

        System.out.println("How many IT students are there?");
        int no_of_comps_students=sc.nextInt();
        System.out.println("enter details of it students");
        for (int j = 0; j < no_of_comps_students; j++) {
            System.out.println("Enter info of student "+(j+1));
            System.out.println("Enter your name: ");
            temp_name=sc.next();
            sc.nextLine();
            System.out.println("Enter UID: ");
            temp_uid=sc.nextLong();
            System.out.println("Enter year: ");
            temp_year=sc.next();
            it_stud.add(new it(temp_name, temp_year, temp_uid));
        }

        System.out.println("How many Comps students are there?");
        int no_of_it_students=sc.nextInt();
        System.out.println("Enter details of comps students");
        for (int j = 0; j < no_of_it_students; j++) {
            System.out.println("Enter info of student "+(j+1));
            System.out.println("Enter your name: ");
            temp_name=sc.next();
            sc.nextLine();
            System.out.println("Enter UID: ");
            temp_uid=sc.nextLong();
            System.out.println("Enter year: ");
            temp_year=sc.next();
            comps_stud.add(new comps(temp_name, temp_year, temp_uid));

        }


        for (int i = 0; i <comps_stud.size(); i++) {
            for (int j = 1; j < comps_stud.size()-i; j++) 
            {
                if (comps_stud.get(j).year.charAt(0)<comps_stud.get(j-1).year.charAt(0)) 
                {
                    temp_Comps=comps_stud.get(j);
                    comps_stud.set(j,comps_stud.get(j-1));
                    comps_stud.set(j-1,temp_Comps);  
                }    
            }
        }


        for (int i = 0; i <it_stud.size(); i++) {
            for (int j = 1; j < it_stud.size()-i; j++) 
            {
                if (it_stud.get(j).year.charAt(0)<it_stud.get(j-1).year.charAt(0)) 
                {
                    temp_it=it_stud.get(j);
                    it_stud.set(j,it_stud.get(j-1));
                    it_stud.set(j-1,temp_it);  
                }    
            }
        }



        for (int i = 0; i < comps_stud.size(); i++) {
            comps_stud.get(i).student_details();
        }

        for (int i = 0; i < it_stud.size(); i++) {
            it_stud.get(i).student_details();
        }

        sc.close();
    }
}
