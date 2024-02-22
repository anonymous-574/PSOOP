import java.util.*;

class calc
{
 double x=0;
 double y=0;
 double r=0;
 double a=0;
 double c=0;
 
 calc()
 {
  x=3;
  y=5;
  z=6;
 }
 
 calc(int a , int b , int c)
 {
 this.x=a;
 this.y=b;
 this.r=c;
 }
 calc(calc c)
 {
 this.x=c.x;
 this.y=c.y;
 this.r=c.r;
 }
 
 calc(int c)
 {
 this.x=0;
 this.y=0;
 this.r=c;
 }
 
 double area()
 {
  a=3.14159*r*r;
  return a;
 }
 
 double cir()
 {
  c=2*3.14159*r;
  return c;
 }
 
}

public class circle {

    public static void main(String[] args) 
    {
     	calc c1 = new calc();
     	calc c2 = new calc(10,9,8);
     	calc c3 = new calc(c2);
     	calc c4 = new calc(5);
     	int c1a=c1.area;
     	int c1c=c1.cir;
     	
     	int c2a=c2.area;
     	int c2c=c2.cir;
     	
     	int c3a=c3.area;
     	int c3c=c3.cir;
     	
     	int c4a=c4.area;
     	int c4c=c4.cir;
     	
     	
     	
     	System.out.println("C1 has area of "+c1a +"and circumference of "+c1c);
     	System.out.println("C2 has area of "+c2a +"and circumference of "+c2c);
     	System.out.println("C3 has area of "+c3a +"and circumference of "+c3c);
     	System.out.println("C4 has area of "+c4a +"and circumference of "+c4c);
    
    
    
    }
    
    
    
}
