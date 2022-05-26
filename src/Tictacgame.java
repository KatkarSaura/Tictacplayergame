import java.util.Scanner;

public class Tictacgame {

	public static void displayGrid(char[][] grid) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 2; j++) {
				
				System.out.println(grid[i][j] + "|");
			   }
			System.out.println(grid[i][2]);
			System.out.println();
			System.out.println("----"); }
		for (int j = 0; j < 2; j++) {
			
			System.out.print(grid[2][j] + "|");
		}
		System.out.println(grid[2][2]);
		System.out.println();
		
			}
	
	public static void main(String[] args) {
			
		
	    char[][] grid = new char [3][3];
		
		grid[0][0] = ' ';
		grid[0][1] = ' ';
		grid[0][2] = ' ';
		grid[1][0] = ' ';
		grid[1][1] = ' ';
		grid[1][2] = ' ';
		grid[2][0] = ' ';
		grid[2][1] = ' ';
		grid[2][2] = ' ';
		
		while (true)
		{
			Scanner s = new Scanner(System.in);
			displayGrid(grid);
	        System.out.println("Player 1,which row and column do you choose?");
		    int p1RowChoice = s.nextInt();
		    int p1ColumnChoice = s.nextInt();
		    grid[p1RowChoice][p1ColumnChoice] = 'X';
		    displayGrid(grid);
		    System.out.println("Player 2,which row and column do you choose?");
		    int p2RowChoice = s.nextInt();
		    int p2ColumnChoice = s.nextInt();
		    grid[p2RowChoice][p2ColumnChoice] = 'O';
		
		}
	}
}

