package javaTraining;
import java.util.Scanner;

public class Baekjoon_8958 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		
		for(int i=1; i<=line; i++) {
			String quiz = sc.nextLine();
			int sum = 0;
			for(int j=0; j<quiz.length(); j++){
				int value = 0;
				if(quiz.charAt(i) == 'O') {
					value++;
					sum += value;
				}
			}
			System.out.println(sum);
		}	
	}

}
