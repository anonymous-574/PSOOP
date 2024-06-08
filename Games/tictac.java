import java.util.Scanner;

class board
{
    String[][] board_data= new String[3][3];

    void print()
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board_data[i][j]==null) {
                    System.out.print(" ");
                }
                else
                {
                System.out.print(board_data[i][j]);
                }
            }
            System.out.println();
        }
    }



    void chk_board()
    {
        String temp1, temp2 , temp3;
        // horizontal only
        temp1 = board_data[0][0];
        temp2 = board_data[1][0];
        temp3 = board_data[2][0];

        if (temp1 !=null)
            {
                if( (temp1 == board_data[0][1]) &&(temp1 == board_data[0][2]))
                {
                    if (temp1=="X")
                    {
                        System.out.println("Player 1 Won!!");
                        System.exit(0);
                    }
                    else if (temp1 =="O"){
                        System.out.println("Player 2 Won!!");
                        System.exit(0);
                    }
                }
            }

            if (temp2 !=null)
            {
                if( (temp2 == board_data[1][1]) &&(temp2 == board_data[1][2]))
                {
                    if (temp1=="X")
                    {
                        System.out.println("Player 1 Won!!");
                        System.exit(0);
                    }
                    else if (temp1 =="O"){
                        System.out.println("Player 2 Won!!");
                        System.exit(0);
                    }
                }
            }

            if (temp3 !=null)
            {
                if( (temp3 == board_data[2][1]) &&(temp1 == board_data[2][2]))
                {
                    if (temp1=="X")
                    {
                        System.out.println("Player 1 Won!!");
                        System.exit(0);
                    }
                    else if (temp1 =="O"){
                        System.out.println("Player 2 Won!!");
                        System.exit(0);
                    }
                }
            }
            
        
        // vertical only

        temp1 = board_data[0][0];
        temp2 = board_data[1][0];
        temp3 = board_data[2][0];

        if (temp1 !=null)
            {
                if( (temp1 == board_data[1][0]) &&(temp1 == board_data[2][0]))
                {
                    if (temp1=="X")
                    {
                        System.out.println("Player 1 Won!!");
                        System.exit(0);
                    }
                    else if (temp1 =="O"){
                        System.out.println("Player 2 Won!!");
                        System.exit(0);
                    }
                }
            }

            if (temp2 !=null)
            {
                if( (temp2 == board_data[1][1]) &&(temp2 == board_data[2][1]))
                {
                    if (temp1=="X")
                    {
                        System.out.println("Player 1 Won!!");
                        System.exit(0);
                    }
                    else if (temp1 =="O"){
                        System.out.println("Player 2 Won!!");
                        System.exit(0);
                    }
                }
            }

            if (temp3 !=null)
            {
                if( (temp3 == board_data[1][2]) &&(temp1 == board_data[2][2]))
                {
                    if (temp1=="X")
                    {
                        System.out.println("Player 1 Won!!");
                        System.exit(0);
                    }
                    else if (temp1 =="O"){
                        System.out.println("Player 2 Won!!");
                        System.exit(0);
                    }
                }
            }

            // diagonal

            if( (board_data[0][0]!=null) || (board_data[0][2]!=null))
            {
            if ( (board_data[0][0]==board_data[1][1]) && (board_data[0][0]==board_data[2][2])) {

                if (board_data[0][0]=="X")
                    {
                        System.out.println("Player 1 Won!!");
                        System.exit(0);
                    }
                    else if (board_data[0][0]=="O"){
                        System.out.println("Player 2 Won!!");
                        System.exit(0);
                    }
            }

            if ( (board_data[0][2]==board_data[1][1]) && (board_data[0][2]==board_data[2][0])) {
                if (board_data[0][2]=="X")
                    {
                        System.out.println("Player 1 Won!!");
                        System.exit(0);
                    }
                    else if (board_data[0][2]=="O"){{
                        System.out.println("Player 2 Won!!");
                        System.exit(0);
                    }
            }
        }

    }
}
}

public class tictac
{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp_r , temp_c;
        board b1 = new board();
        // 1 user vs user
        for (int i = 0; i < 9; i++) {
            if(i%2==0)
            {
                System.out.println("Player 1 plays");
                System.out.println("Where do you want to put a X");
                System.out.println("Enter Row:");
                temp_r=sc.nextInt();
                System.out.println("Enter column: ");
                temp_c=sc.nextInt();
                if (b1.board_data[temp_r][temp_c]==null)
                {
                b1.board_data[temp_r][temp_c]="X";
                }
                else{
                    System.out.println("YOU CANT REPLACE THE OTHER GUYS PLAY BRO");
                }

                b1.print();
                b1.chk_board();
            }
            else{
                System.out.println("Player 2 plays");
                System.out.println("Where do you want to put a 0");
                System.out.println("Enter Row:");
                temp_r=sc.nextInt();
                System.out.println("Enter column: ");
                temp_c=sc.nextInt();
                if (b1.board_data[temp_r][temp_c]==null)
                {
                b1.board_data[temp_r][temp_c]="O";
                }
                else{
                    System.out.println("YOU CANT REPLACE THE OTHER GUYS PLAY BRO");
                }
                b1.print();
                b1.chk_board();
            }
        }

        sc.close();
    }
}