package javaTraining;
import java.util.Scanner;

public class Baekjoon_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String quiz = sc.nextLine();
		
		int sum = 0;
		for(int i=0; i<quiz.length(); i++){
			int value = 0;
			if(quiz.charAt(i) == 'O') {
				value++;
				sum += value;
			}
		}
		System.out.println(sum);
	}
}
