package javaTraining;
import java.util.Scanner;

public class Baekjoon_1065 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int count = 0;
		for(int i=1;i<=num;i++)
			if(num%i == 0)
				count++;
		System.out.println(count);
	}
	
}
