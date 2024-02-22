import java.util.*;

class posting
{
  private int apt;
  private int course;
  private int tech;
  private int inter;
  private int tot=0;
  
  //programmer
  posting(int a , int b , int c , int d)
  {
  this.apt = b;
  this.course = a;
  this.tech = c;
  this.inter =d;
  }
  
  //team lead
  posting (int p , int q)
  {
   this.tech = p;
   this.inter =q;
  }
  
  //manager
  posting (int x)
  {
   this.inter =x;
  }
  
  void progra()
  {
  tot = apt + course + tech + inter;
  
  if (tot>=80)
     {
          System.out.println("You are hired as programmer :) ");
     }
     else
     {
          System.out.println("You are not hired :( ");
     }
     
  }
  
  void lead()
  {
   tot = tech + inter;
   
   if (tot>=85)
     {
          System.out.println("You are hired as team lead :) ");
     }
     else
     {
          System.out.println("You are not hired :( ");
     }
   
  }
  
  void manag()
  {
    tot = inter;
  
    if (tot>=90)
     {
          System.out.println("You are hired as manager :) ");
     }
     else
     {
          System.out.println("You are not hired :( ");
     }
  
  }

}


public class hire
{
    public static void main (String args[])
    {
    Scanner sc = new Scanner (System.in);
   
    System.out.println("Which position are you applying for");
    System.out.println("Enter 1 to  check for programmer \nEnter 2 to  check for team lead \nEnter 3 to  check for project manager: ");
    int a = sc.nextInt();

        
    switch(a)
    {
     case 1:
     {
      System.out.println("Enter coursework marks");
      int cou = sc.nextInt();
      System.out.println("Enter aptitude test marks");
      int apt = sc.nextInt();
      System.out.println("Enter technical test marks");
      int t = sc.nextInt();
      System.out.println("Enter interview marks");
      int inter = sc.nextInt();
      posting c1 = new posting(cou,apt,t,inter);
      c1.progra();
      break;
     }
    case 2:
     {
      System.out.println("Enter technical test marks");
      int t = sc.nextInt();
      System.out.println("Enter interview marks");
      int inter = sc.nextInt();
      posting c1 = new posting(t,inter);
      c1.lead();
      break;
     }
    case 3:
     {
      System.out.println("Enter interview marks");
      int inter = sc.nextInt();
      posting c1 = new posting(inter);
      c1.manag();
      break;
     }
     default:
     {
      System.out.println("ENTER A NUMBER BETWEEN 1 AND 3 ._. you are fired");
     }
    sc.close();
    
    
    }
    

    
    
    
    }
}    
