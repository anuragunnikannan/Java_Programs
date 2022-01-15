import java.util.*;
public class TicTacToe
{
    public char[][] player(char board[][], char playerSign)
    {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        while(flag != 1)
        {
            System.out.println("Enter position to insert "+playerSign);
            char pos = sc.next().charAt(0);
            for(int i = 0;i<3;i++)
            {
                for(int j = 0;j<3;j++)
                {
                    if(board[i][j] == pos)
                    {
                        board[i][j] = playerSign;
                        flag = 1;
                        break;
                    }
                }
            }
            if(flag == 0)
            {
                System.out.println("Position "+pos+" already occupied.");
            }
        }
        return board;
    }

    public char[][] computer(char board[][], char computerSign)
    {
        int flag = 0;
        int xo_counter = 0;
        while(flag != 1)
        {
            double z = Math.random()*10;        //generating random number between 1 and 9
            int a = (int)z;    
            char pos = (char)(a+'0');
            for(int i = 0;i<3;i++)
            {
                for(int j = 0;j<3;j++)
                {
                    if(board[i][j] == pos)
                    {
                        board[i][j] = computerSign;
                        flag = 1;
                        break;
                    }
                    else if(board[i][j] == 'X' || board[i][j] == 'O')
                    {
                        xo_counter++;       //to count the number of total moves so far, to avoid infinite loop, when no more slots are available on the board
                    }
                }
            }
            if(xo_counter == 9) //when all slots are full, stop the loop
            {
                break;
            }
        }
        return board;
    }

    public int checkRow(char board[][], String playerWinCondition, String computerWinCondition)
    {
        for(int i = 0;i<3;i++)
        {
            String s = "";
            for(int j = 0;j<3;j++)
            {
                s = s + board[i][j];
            }
            if(s.equalsIgnoreCase(playerWinCondition))
            {
                return 1;
            }
            else if(s.equalsIgnoreCase(computerWinCondition))
            {
                return 2;
            }
        }
        return 0;
    }

    public int checkColumn(char board[][], String playerWinCondition, String computerWinCondition)
    {
        for(int i = 0;i<3;i++)
        {
            String s = "";
            for(int j = 0;j<3;j++)
            {
                s = s + board[j][i];
            }
            if(s.equalsIgnoreCase(playerWinCondition))
            {
                return 1;
            }
            else if(s.equalsIgnoreCase(computerWinCondition))
            {
                return 2;
            }
        }
        return 0;
    }

    public int checkLeftDiagonal(char board[][], String playerWinCondition, String computerWinCondition)
    {
        String s = "";
        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                if(i == j)
                {
                    s = s + board[i][j];
                }
            }
        }
        if(s.equalsIgnoreCase(playerWinCondition))
        {
            return 1;
        }
        else if(s.equalsIgnoreCase(computerWinCondition))
        {
            return 2;
        }
        else
        {
            return 0;
        }
    }

    public int checkRightDiagonal(char board[][], String playerWinCondition, String computerWinCondition)
    {
        String s = "";
        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                if(i+j == 2)
                {
                    s = s + board[i][j];
                }
            }
        }
        if(s.equalsIgnoreCase(playerWinCondition))
        {
            return 1;
        }
        else if(s.equalsIgnoreCase(computerWinCondition))
        {
            return 2;
        }
        else
        {
            return 0;
        }
    }

    public void printBoard(char board[][])
    {
        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public int result(char board[][], char playerSign, char computerSign)
    {
        String playerWinCondition = "" + playerSign + playerSign + playerSign;
        String computerWinCondition = "" + computerSign + computerSign + computerSign;
        if(checkRow(board, playerWinCondition, computerWinCondition) == 1)
        {
            System.out.println("Player Wins");
            return 1;
        }
        else if(checkRow(board, playerWinCondition, computerWinCondition) == 2)
        {
            System.out.println("Computer Wins");
            return 1;
        }
        else if(checkColumn(board, playerWinCondition, computerWinCondition) == 1)
        {
            System.out.println("Player Wins");
            return 1;
        }
        else if(checkColumn(board, playerWinCondition, computerWinCondition) == 2)
        {
            System.out.println("Computer Wins");
            return 1;
        }
        else if(checkLeftDiagonal(board, playerWinCondition, computerWinCondition) == 1)
        {
            System.out.println("Player Wins");
            return 1;
        }
        else if(checkLeftDiagonal(board, playerWinCondition, computerWinCondition) == 2)
        {
            System.out.println("Computer Wins");
            return 1;
        }
        else if(checkRightDiagonal(board, playerWinCondition, computerWinCondition) == 1)
        {
            System.out.println("Player Wins");
            return 1;
        }
        else if(checkRightDiagonal(board, playerWinCondition, computerWinCondition) == 2)
        {
            System.out.println("Computer Wins");
            return 1;
        }
        return 0;
    }

    public static void main(String args[])
    {
        TicTacToe tt = new TicTacToe();
        Scanner sc = new Scanner(System.in);
        char board[][] = new char[3][3];
        int x = 1;
        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                board[i][j] = (char)(x+'0');        //initializing board with 1, 2, 3....9, in character.
                x++;
            }
        }
        System.out.println("Enter sign to play with X/O: ");
        char playerSign = sc.next().charAt(0);
        char computerSign = playerSign == 'X' ? 'O' : 'X';      //choosing the opposite character of player for computer
        int i = 0;
        int flag = 0;
        while(i <= 9)           //since it's a 3x3 board, total number of inputs (player + computer) combined is 9.
        {
            board = tt.player(board, playerSign);       //player's turn
            i++;
            if(i >= 6)      //checking for result after player's move, if both computer and player has taken atleast 3 moves each
            {
                flag = tt.result(board, playerSign, computerSign);
                if(flag == 1)   // if there is a proper result, then stop the loop
                {
                    break;
                }
            }
            board = tt.computer(board, computerSign);   //computer's turn
            i++;
            if(i >= 6)      //checking for result after computer's move, if both computer and player has taken atleast 3 moves each
            {
                flag = tt.result(board, playerSign, computerSign);
                if(flag == 1)   //if there is a proper result, then stop the loop
                {
                    break;
                }
            }
            tt.printBoard(board);
        }
        if(flag == 0)   //if there is no proper result, then it is a draw
        {
            System.out.println("Draw");
        }
    }
}