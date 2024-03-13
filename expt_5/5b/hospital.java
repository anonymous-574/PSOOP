import java.util.*;


class person
{
  String name;
  Date d;
  
  
  person(String name , int year , int month , int day)
  {
   this.name = name;
   d = new Date(year , month ,day);  
  }
  

}

class doctor extends person
{
   String special;
   int fee;
   long income=0; 
    
  doctor(String doc_name , int doc_year , int doc_month , int doc_day , String special , int fee)
  {
    super(doc_name,doc_year,doc_month,doc_day);
    this.special=special;
    this.fee=fee;
    
    
  }

}


class patient extends person
{
    doctor pat_doc;
    
    patient(String pat_name , int pat_year , int pat_mon , int pat_day , doctor d)
    {
     super(pat_name , pat_year , pat_mon , pat_day);
      this.pat_doc= d;
    }  
}

class billing 
{
  long bill;
  Date now = new Date(2024,3,13);
  //Date now = new Date(2024,3,13);
  patient p;
  doctor d;
  long hospital_bill;
  long doc_bill;
  billing(patient p , doctor d )
  { 
    this.p=p;
    this.d=d;
  }
  
  void calc_bill()
  {
    long days_differnce =(now.getTime() - p.d.getTime())/ (1000*60*60*24); 
    days_differnce = days_differnce%365;
    System.out.println("You have been admitted for "+days_differnce+" days"); 
    hospital_bill=(days_differnce*2000);
    doc_bill = (d.fee*days_differnce);
    d.income +=doc_bill; 
    bill = hospital_bill+doc_bill;
    
  }
  
  void chk()
  {
    if(d.name.equalsIgnoreCase(p.pat_doc.name))
    {
    System.out.println("Name of doctor Matches");
    }
    else
    {
    System.out.println("Names do not Match");
    System.exit(0);
    }  
  }
  
  @Override
    public String toString(){//overriding the toString() method  
      return "Pay doctor: "+doc_bill +"\n pay hospital: "+hospital_bill+"\n total bill: "+bill;  
     }  

}


public class hospital {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        doctor d[]=new doctor[3];
        patient p[]= new patient[3];
        billing b[]= new billing[3];

       String temp_doc_n , temp_pat_n , temp_doc_special;
       int doc_year,doc_month , doc_day , pat_year , pat_month , pat_day , doc_fee;
        for(int i=0 ; i<d.length ; i++)
        {
          //take info
          System.out.println("Enter information of doctor: "+(i+1));
          System.out.println("Enter name: ");
          temp_doc_n=sc.next();
          System.out.println("Enter doctor Date of joining: ");
          System.out.println("Enter year: ");
          doc_year=sc.nextInt();
          System.out.println("Enter month: ");
          doc_month=sc.nextInt();
          System.out.println("Enter day: ");
          doc_day=sc.nextInt();
          System.out.println("Enter doctor specialisation: ");
          temp_doc_special=sc.next();
          System.out.println("Enter doctor fee per visit: ");
          doc_fee=sc.nextInt();

          d[i]=new doctor(temp_doc_n, doc_year, doc_month, doc_day, temp_doc_special, doc_fee);
        }

        for(int i=0 ; i<p.length ; i++)
        {
          System.out.println("Enter information of patient: "+(i+1));
          System.out.println("Enter name: ");
          temp_pat_n=sc.next();
          System.out.println("Enter the date admitted in hospital: ");
          System.out.println("Enter year: ");
          pat_year=sc.nextInt();
          System.out.println("Enter month: ");
          pat_month=sc.nextInt();
          System.out.println("Enter day: ");
          pat_day=sc.nextInt();

          System.out.printf("Which doctor did you go to? press 1 for %s , press 2 for %s , press 3 for %s \n",d[0].name,d[1].name,d[2].name);
          int choice = sc.nextInt();
          switch (choice) 
          {
            case 1 -> p[i]= new patient(temp_pat_n, pat_year, pat_month, pat_day, d[0]);
            case 2 -> p[i]= new patient(temp_pat_n, pat_year, pat_month, pat_day, d[1]);
            case 3 -> p[i]= new patient(temp_pat_n, pat_year, pat_month, pat_day, d[2]);
            default -> System.out.println("Error: User is an idiot");  
          }
        }

        for(int i=0 ; i<b.length ;i++)
        {
          b[i]=new billing(p[i], d[i]);
        }
        for (int i = 0; i < b.length; i++) {
          System.out.println("Checking detalis for patient: "+(i+1));
          b[i].chk();
          b[i].calc_bill();
          System.out.println(b[i]);
        }


        long net_hos_income=0;
        for(int i=0 ; i<b.length;i++)
        {
          net_hos_income+=b[i].hospital_bill;
        }
        System.out.println("The hospital in net has earned: "+net_hos_income);

        for (int i = 0; i < d.length; i++) {
          System.out.println("Doctor " +d[i].name +" has earned "+d[i].income +" rupees");
        }

        sc.close();
    }
}