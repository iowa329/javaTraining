package javaTraining;
import java.util.Scanner;

//백준 문제 8958번 풀이_김희재
public class Baekjoon_8958 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		sc.nextLine(); //개행문자 제거
		
		for(int i=1; i<=line; i++) {
			String quiz = sc.nextLine();
			int sum = 0, value = 0;
			for(int j=0; j<quiz.length(); j++){	
				if(quiz.charAt(j) == 'O') {
					value++;
					sum += value;
				} else
					value = 0;
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
