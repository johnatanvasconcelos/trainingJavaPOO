package application;

<<<<<<< HEAD
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write the number of lines e columns:");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];
		
		System.out.println("Insert the elements of this array: ");
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Choose a number in the array: ");
		int x = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position: Line " + i + "; Column " + j);
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if(i > 0) {
						System.out.println("Top: " + mat[i-1][j]);
					}
					if(i < mat[j].length-1) {
						System.out.println("Bottom: " + mat[i+1][j]);
					}
				}
			}
		}
		sc.close();
		System.out.println("Finish");
	}

}