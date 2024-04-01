import java.util.*;

abstract class question
{
    String question,real_ans;
    int user_marks=0;
    abstract int get_solution(String user_ans);
    abstract void show_ques();
    abstract void show_ans();
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
          user_marks++;
          return 1;  
         }
         else{
            System.out.println("Answer is wrong");
            return 0;
         }
    }

    @Override
    void show_ans() {
        System.out.println("Actual answer was "+real_ans);
        System.out.println("You scored: "+user_marks);
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
          user_marks++;
          return 1;  
         }
         else{
            System.out.println("Answer is wrong");
            return 0;
         }
    }

    @Override
    void show_ans() {
        System.out.println("Actual answer was "+real_ans);
        System.out.println("You scored: "+user_marks);
    }
}




public class quiz_arraylist {
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

        ArrayList <true_or_false> t_f_q=new ArrayList<>(); 
        t_f_q.add(t_f[0]);
        t_f_q.add(t_f[1]);
        t_f_q.add(t_f[2]);
        Collections.shuffle(t_f_q);


        ArrayList <mcq> mcq_q=new ArrayList<>();
        mcq_q.add(m[0]);
        mcq_q.add(m[1]);
        mcq_q.add(m[2]);
        Collections.shuffle(mcq_q);


       


        for (int i = 0; i < t_f_q.size(); i++) {
            t_f_q.get(i).show_ques();
            System.out.println("Enter t for true , f for false: ");
            user_imput=sc.next();
            score+=t_f_q.get(i).get_solution(user_imput);
        }

        for (int i = 0; i < m.length; i++) {
            mcq_q.get(i).show_ques();
            System.out.println("Enter Answer: ");
            user_imput=sc.next();
            score+=mcq_q.get(i).get_solution(user_imput);
        }

        System.out.println("Your final results are: ");

        for (int i = 0; i < t_f_q.size(); i++) {
            System.out.println("Question: "+(i+1));
            t_f_q.get(i).show_ans();
        }

        for (int i = 0; i < mcq_q.size(); i++) {
            System.out.println("Question: "+(i+1));
            mcq_q.get(i).show_ans();
        }


        System.out.println("Your score is: "+score+" out of 10");

        

        sc.close();
    }
}