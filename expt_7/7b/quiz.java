import java.util.*;

abstract class question
{
    String question,real_ans;
    abstract int get_solution(String user_ans);
    abstract void show_ques();
}

class mcq extends question
{
    String[] options= new String[4];
    mcq(String ques ,String real_ans, String option0, String option1, String option2, String option3)
    {
        this.question=ques;
        this.real_ans=real_ans;
        this.options[0]=option0;
        this.options[1]=option1;
        this.options[2]=option2;
        this.options[3]=option3;
    }

    @Override
    void show_ques() {
        System.out.println("Question is: ");
        System.out.println(question);
        System.out.println("Options are: \n");

        for (int i = 0; i < options.length; i++) {
            System.out.println("Option "+(char)(65+i)+ ": "+options[i]);
        }
    }

    @Override
    int get_solution(String user_ans) {
         if (user_ans.compareToIgnoreCase(real_ans)==0) 
         {
          System.out.println("Answer is correct"); 
          return 1;  
         }
         else{
            System.out.println("Answer is wrong");
            return 0;
         }
    }
}

class true_or_false extends question
{
    true_or_false(String ques ,String real_ans)
    {
        this.question=ques;
        this.real_ans=real_ans;
    }

    @Override
    void show_ques() {
        System.out.println("Question is: ");
        System.out.println(question);
    }

    @Override
    int get_solution(String user_ans) {
         if (user_ans.compareToIgnoreCase(real_ans)==0) 
         {
          System.out.println("Answer is correct"); 
          return 1;  
         }
         else{
            System.out.println("Answer is wrong");
            return 0;
         }
    }
}



public class quiz {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score=0;
        String user_imput;
        mcq[] m= new mcq[3];
        true_or_false[] t_f = new true_or_false[3];

        t_f[0]= new true_or_false("is 1+1 =2? ", "t");
        t_f[1]= new true_or_false("is 1+3 =5? ", "f");
        t_f[2]= new true_or_false("is 1*6 =5? ", "f");

        m[0]= new mcq("What’s the heaviest organ in the human body? ", "b", "Brain", "Liver", "Skin", "Heart");
        m[1]= new mcq("What element does the chemical symbol Au stand for?  ", "d", "Silver", "Magnesium", "Salt", "Gold");
        m[2]= new mcq("On average, how many seeds are located on the outside of a strawberry? ", "b", "100", "200", "400", "500");


        for (int i = 0; i < t_f.length; i++) {
            t_f[i].show_ques();
            System.out.println("Enter t for true , f for false: ");
            user_imput=sc.next();
            score+=t_f[i].get_solution(user_imput);
        }

        for (int i = 0; i < m.length; i++) {
            m[i].show_ques();
            System.out.println("Enter a or b or c or d: ");
            user_imput=sc.next();
            score+=m[i].get_solution(user_imput);
        }
        System.out.println("Your score is: "+score+" out of 10");

        

        sc.close();
    }
}