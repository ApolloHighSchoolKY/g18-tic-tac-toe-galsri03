//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));
		int gameNums = file.nextInt();
		file.nextLine();
		
		//Read how many times you should read
		for (int i=0; i<gameNums; i++) {
		//TicTacToe only wants this: file.nextLine()
		String game = file.nextLine();
		//Make TicTacToe Object 
		TicTacToe ttt = new TicTacToe(game);
		//Print the game (TicTacToe)
		System.out.print("\n" + ttt);
		//Print the winner
		System.out.println(ttt.getWinner());
		}
		file.close();
	}
}



