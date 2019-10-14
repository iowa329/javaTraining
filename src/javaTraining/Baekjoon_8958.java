package javaTraining;
import java.util.Scanner;

public class Baekjoon_8958 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		
		for(int i=1; i<=line; i++) {
			String quiz = sc.nextLine();
			int sum = 0, value = 0;
			for(int j=0; j<quiz.length(); j++){
				
				if(quiz.charAt(j) == 'O') {
					value++;
					sum += value;
				} else {
					value = 0;
				}
			}
			System.out.println(sum);
		}	
	}

}
