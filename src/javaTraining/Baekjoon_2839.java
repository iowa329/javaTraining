package javaTraining;
import java.util.Scanner;

public class Baekjoon_2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int five = num/5;
		int three = -1;
		int rest = num%5;
		int result = 0;
		
		while(five>=0) {
			if(rest%3 == 0) {
				three = rest/3;
				result = five+three;
				five = -1;
			} else {
				five--;
				if(five>0)
					rest = num - (5*five);
			}
		}
		
		if(three == -1) {
			System.out.println(three);
		} else {
			System.out.println(result);
		}
		
	}
}
