import java.util.Scanner;
public class Tic_Tac_Toe_3 {

	//it creates the empty board were you are able to put imports
	static char[][] board = 
		{
			{' ', ' ', ' '},
			{' ', ' ', ' '},
			{'', ' ', ' '}};
		static Scanner myReader = new Scanner(System.in);
		
		public static void main(String[] args) {
			
	        boardMaker(board);

			//this will choose if either X ends up winning or if O ends up winning
			while (true)
	        {
	            
	            playerXRow(board);
	            if (checkWinner('X'))
	            {
	                System.out.println("Player X wins!");
	                break;
	            }
	            if (endGame().equals("tie"))
	            {
	                System.out.println("It's a tie!");
	                break;
	            }

	            
	            playerORow(board);
	            if (checkWinner('O'))
	            {
	                System.out.println("Player O wins!");
	                break;
	            }
	            if (endGame().equals("tie"))
	            {
	                System.out.println("It's a tie!");
	                break;
	            }
	        }
	    
		}
		
		//this makes the board
		public static void boardMaker(char[][] arr)
		{
			
			for(int i = 0; i <= board.length-1; i++)
			{
				System.out.println();
				for(int j = 0; j <= board.length-1; j++)
				{
					System.out.print(board[i][j]);
				}
			}
			
			
		}

		//this put you put what row you want X to be and if it is not able to work then you try again
		// then you go to the column for X
		public static void playerXRow(char[][] board)
		{
			System.out.println();
			System.out.println("What row would you like to put your X in player X?");
			int p1Input = (myReader.nextInt());
			
			if(p1Input > 3 || p1Input < 1)
			{
				System.out.println("Try again");
				playerXRow(board);
			}
			
			else
			{
				playerXcol(board, p1Input);
			}
			
			
		}
		
		//This puts O for the column you want and if it is not able to be placed then you have to try again
		public static void playerOcol(char[][] board, int row)
		{
			System.out.print("What column would you like to put your O in player O?");
			int p1Input = (myReader.nextInt());
			if(p1Input > 3 || p1Input < 1)
			{
				System.out.print("Try again");
				playerORow(board);
			}
			
			else
			{
				board[row-1][p1Input-1] = 'O';
				boardMaker(board);
			}
			
			
			
			
		}
		
		//this put you put what row you want O to be and if it is not able to work then you try again
		// then you go to the column for O
		public static void playerORow(char[][] board)
		{
			System.out.println();
			System.out.println("What row would you like to put your O in player O?");
			int p1Input = (myReader.nextInt());
			
			if(p1Input > 3 || p1Input < 1)
			{
				System.out.println("Try again");
				playerORow(board);
			}
			
			else
			{
				playerOcol(board, p1Input);
			}
			
			
		}
		
		//This puts X for the column you and if it is not able to be placed then you have to try again
		public static void playerXcol(char[][] board, int row)
		{
			System.out.print("What column would you like to put your X in player X?");
			int p1Input = (myReader.nextInt());
			if(p1Input > 3 || p1Input < 1)
			{
				System.out.print("Try again");
				playerXRow(board);
			}
			
			else
			{
				board[row-1][p1Input-1] = 'X';
				boardMaker(board);
			}
				
			
		}
		
		//This checks to see if there is a tie in my game
	    public static String endGame()
	    {
	        for (int i = 0; i < 3; i++)
	        {
	            for (int j = 0; j < 3; j++)
	            {
	                if (board[i][j] == ' ')  
	                {
	                    return "still going";
	                }
	            }
	        }
	        return "tie";  
	    }

	    //This checking to see if there is a winner
	    public static boolean checkWinner(char player)
	    {
	    	//this checks all rows and columns to see if there is a winner
	        for (int i = 0; i < 3; i++)
	        {
	            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
	            {
	                return true;
	            }
	            if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
	            {
	                return true;
	            }
	        }

	       //this checks diagonal to see if there is a winner
	        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
	        {
	            return true;
	        }
	        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
	        {
	            return true;
	        }

	        return false;  
	    }
}
