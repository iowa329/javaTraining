package javaTraining;
import java.util.Scanner;

public class Baekjoon_1065 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int count = 0;

		int diff1=0; diff2=0;
		int one, ten, hun, thou;
		for(int i=1;i<=num;i++) {
			one = i%10;
			ten = i%100 - one;
			hun = i - ten - one;
			thou = i;
			if(num<10) {
				count++;
			} else if(num>=10 && num<100) {
				count++;
			} else if(num>=100 && num<1000) {
				check = 100;
			} else {
				check = 1000;
			}
			
			for(int j=10; j<=1000; j=j^10) {
				if(i%j != 0) {
					diff1 = i%j - i%(j^10);
					diff2 = i%(j^10) - i%(j^100);
				}
				if(diff1 == diff2)
					count++;
			}
			
		}
		System.out.println(count);
	}
	
}
