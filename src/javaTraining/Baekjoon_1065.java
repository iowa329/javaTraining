package javaTraining;
import java.util.Scanner;

public class Baekjoon_1065 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int count = 0;
		
		int check;
		if(num<10) {
			check = 0;
		} else if(num>=10 && num<100) {
			check = 10;
		} else if(num>=100 && num<1000) {
			check = 100;
		} else {
			check = 1000;
		}
		
		for(int i=1;i<=num;i++) {
			
		}
		System.out.println(count);
	}
	
}
