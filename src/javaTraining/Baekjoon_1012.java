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
		
		int earthworm = 0;
		for(int i=0; i<field.length; i++) {
			for(int j=0; j<field[i].length; j++) {
				if(field[i][j] == 1) {
					if(field[i-1][j] == 2 || field[i+1][j] == 2 || field[i][j-1] == 2 || field[i][j+1] == 2) {
						field[i][j] = 2;
					} else {
						earthworm++;
						field[i][j] = 2;
					}
				}//배추가 심어져 있는 경우 처리
			}//배추밭 탐색 종료
		}//주어진 밭의 경우의 수 종료
		
		
	}
}