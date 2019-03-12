package solver;

import java.util.Scanner;

public class Sudoku {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int board[][]=new int[9][9];
		
		//Enter matrix
		System.out.println("\n Enter the initial board status!!!");
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				board[i][j]=sc.nextInt();
			}
		}
		Solver solve=new Solver();
		
		System.out.println();
		if(solve.sudokuSolver(board)) {
			System.out.println("The given board is solvable!!\nThe Board will look like");
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					System.out.print(board[i][j]+" ");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("\n No Solution Possible!!");
		}
	}

}
