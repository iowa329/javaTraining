package javaTraining;
import java.util.Scanner;

public class Baekjoon_1065 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int count = 0;

		int diff1=0, diff2=0;
		int one, ten, hun;
		for(int i=1;i<=num;i++) {
			one = i%10;
			ten = i%100 - one;
			hun = i - ten - one;
			if(num<10) {
				count++;
			} else if(num>=10 && num<100) {
				count++;
			} else if(num>=100 && num<1000) {
				diff1 = one - ten;
				diff2 = ten - hun;
				if(diff1 == diff2)
					count++;
			} else {
			}
		}
		System.out.println(count);
	}
	
}
