//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

//import java.util.Scanner;
//import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];
	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		int pos = 0;
		//Row-major order will happen here
		for (int row=0; row<3;row++) {
			for (int col=0;col<3; col++) {
				mat[row][col] = game.charAt(pos);
				pos++;
			}
		}
	}

	public String getWinner()
	{
		//check rows
		for (int row=0; row<3; row++) {
			if(mat[row][0]==mat[row][1] && mat[row][1]==mat[row][2]) 
				{
					if (mat[row][0]=='X') 
						return "'X' wins horizontally!";
					if (mat[row][0]== 'O') 
						return "'O' wins horizontally!";

				}
			}
		
		//check columns
		for (int col=0; col<3; col++) {
			if(mat[0][col]==mat[1][col] && mat[1][col]==mat[2][col]) 
				{
					if (mat[0][col]=='X') 
						return "'X' wins vertically!";
					if (mat[0][col]== 'O') 
						return "'O' wins vertically!";
				}
			}
		
		//Check diagonals
		if(mat[0][0]==mat[1][1] && mat[1][1]==mat[2][2]) {
			if (mat[0][0]=='X') 
				return "'X' wins diagonally!";
			if (mat[0][0]=='O') 
				return "'O' wins diagonally!";
		}

		if(mat[0][2]==mat[1][1] && mat[1][1]==mat[2][0]) {
			if (mat[0][2]=='X') 
				return "'X' wins diagonally!";
			if (mat[0][2]=='O') 
				return "'O' wins diagonally!";
		}

		//return "";
		return "Scaredy Cat - no winner!";
	}	
	

	public String toString()
	{
		String output = "";
		for (int row=0; row<3;row++) {
			for (int col=0;col<3; col++) {
				output += mat[row][col]  + " ";	
			}
			//trim output
			output = output.trim() + "\n";
		}
				return output; //+ "\n\n";
	}

}