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
    
  doctor(String doc_name , int doc_year , int doc_month , int doc_day , String special , int fee , long income)
  {
    super(doc_name,doc_year,doc_month,doc_day);
    this.special=special;
    this.fee=fee;
    this.income=income;
    
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
  double bill=0;
 
  patient p;
  doctor d;
  
  billing(patient p , doctor d )
  { 
    this.p=p;
    this.d=d;
    chk();
    calc_bill();
  }
  
  void calc_bill()
  {
    Date now = new Date();
    long days_difference = (now.getTime() - p.d.getTime()/ (1000*60*60*24));  
    long days_differnce =5;
    long hospital_bill=(days_differnce*2000);
    long doc_bill = (d.fee*days_differnce);
    d.income +=doc_bill; 
    bill+= hospital_bill+doc_bill;
  }
  
  void chk()
  {
    if(d.name.equalsIgnoreCase(p.pat_doc.name))
    {
    System.out.println("Names Match");
    }
    else
    {
    System.out.println("Names do not Match");
    System.exit(0);
    }
  }
  
}

