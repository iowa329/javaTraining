package javaTraining;
import java.util.Scanner;

//백준 문제 1012번 풀이_김희재
public class Baekjoon_1012 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for(int num=1; num<=cnt; num++){
			int width = sc.nextInt();
			int height = sc.nextInt();
			int cabbage = sc.nextInt();
			int[][] field = new int[width+2][height+2];
			
			for(int i=1; i<=cabbage; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				field[x+1][y+1] = 1;
			}
			
			int earthworm = 0;
			for(int i=1; i<field.length-1; i++) {
				for(int j=1; j<field[i].length-1; j++) {
					if(field[i][j] == 1) {
						if(field[i-1][j] == 2 || field[i+1][j] == 2 || field[i][j-1] == 2 || field[i][j+1] == 2) {
							field[i][j] = 2;
						} else {
							earthworm++;
							field[i][j] = 2;
						}
					}//배추가 심어져 있는 경우 처리
				}
			}//배추밭 탐색 종료
			
			System.out.println(earthworm);
		}
		sc.close();
	}
	
}