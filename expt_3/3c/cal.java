import java.util.*;

class calc
{
    double wt;
    int intensity;
    int exer_time;
    int calorie_food;
    double calorie_need=0;
    double servings=0;
    double ht;
    
    calc()
    {
     this.wt=0;
     this.intensity= 0;
     this.exer_time=0;
     this.calorie_food =0;
    }
    
    //natural
   void calorie(double w)
    {
     this.wt =w;
     calorie_need += 70*(wt/2.2)*0.756;
    }
    
    void calorie (int intensity , int time)
    {
     this.intensity = intensity;
     this.exer_time = time;
     calorie_need += 0.0385 * wt *intensity *time;
    }
    
    void calorie (int cal_consum)
    {
     //this is the number of calories that i always consume in a day
     // i always ear bread and eggs , a cup of tea etc
     // on top of that how many calories i will need to eat to maintain wt
     calorie_need += 0.1*cal_consum;
    }
    
    void op(int c_food)
    {
     servings = calorie_need/c_food;
     System.out.println("You need to eat: "+servings +" Servings");
    }

    void bmi(double a , double b )
    {
        this.wt=a;
        this.ht=b*0.01;
        double bmi =wt/(ht*ht);
        System.out.println("Your bmi is: "+bmi);

        //Less than 15	Very severely underweight
        //Between 15 and 16	Severely underweight
        //Between 16 and 18.5	Underweight
        //Between 18.5 and 25	Normal (healthy weight)
        //Between 25 and 30	Overweight
        //Between 30 and 35	Moderately obese
        //Between 35 and 40	Severely obese
        //Over 40	Very severely obese

        if (bmi<=15) 
        {
         System.out.println(" You are Very severely underweight");   
        }
        else if (bmi <=16) 
        {
         System.out.println(" You are severely underweight");  
        }
        else if (bmi<=18.5) 
        {
         System.out.println(" You are underweight");  
        }
        else if (bmi<=25) 
        {
          System.out.println(" You are normal");  
        }
        else if (bmi<=30) 
        {
         System.out.println(" You are overweight");  
        }
        else if (bmi<=35) 
        {
         System.out.println(" You are moderately obese");  
        }
        else if (bmi<=40) 
        {
         System.out.println(" You are severely obese");  
        }
        else
        {
            System.out.println("You are very severly obese");
        }
    }
}



public class cal
{
    public static void main (String args[])
    {
    Scanner sc = new Scanner (System.in);
    calc c1 = new calc();
    //ask for type of meal
    //ask for type of excercise and time done
    
    System.out.println("What is your weight? ");
    double w = sc.nextDouble();
    c1.calorie(w);
    System.out.println("What is your height in centimetres? ");
    double h = sc.nextDouble();
    c1.bmi(w,h);

    
    System.out.println("What exercise did you do today? \n running 10 kmph , runnning 8 kmph , walking , basketball , cricket");
    HashMap<String , Integer> e1 = new HashMap<>();
    e1.put("running 10 kmph", 17);
    e1.put("runnning 8 kmph", 10);
    e1.put("walking", 1);
    e1.put("basketball", 8);
    e1.put("cricket", 7);
    String user_act =sc.next();
    int intensity=0;

    if (e1.containsKey(user_act)) 
    {
        intensity = e1.get(user_act);
    }


    System.out.println("How long did you do that exercise? ");
    int t = sc.nextInt();
    c1.calorie (intensity,t);
   
    System.out.println("how many calories did you already eat today? ");
    int c = sc.nextInt();
    c1.calorie(c);
    
    System.out.println("Which food do you want to eat to combat the calorie deficit? ");
    System.out.println("Mom is only making wadapav , pizza , burger , fries , samosa");
    HashMap<String , Integer> e2 = new HashMap<>();
    e2.put("wadapav", 250);
    e2.put("pizza", 700);
    e2.put("burger", 500);
    e2.put("fries", 100);
    e2.put("samosa", 200);
    int cal_op=0;
    String user_food=sc.next();
    if (e2.containsKey(user_food)) 
    {
     cal_op =e2.get(user_food);   
    }
    c1.op(cal_op);

    sc.close();
    }
    
}
