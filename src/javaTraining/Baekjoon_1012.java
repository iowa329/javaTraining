package javaTraining;
import java.util.Scanner;

public class Baekjoon_1012 {
	
	public static void main(String[] args[]) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		int width = sc.nextInt();
		int height = sc.nextInt();
		int cabbage = sc.nextInt();
		int[][] field = new int[width][height];
		
		for(int i=1; i<=cabbage; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			field[x][y] = 1;
		}
		
		
	}

}
