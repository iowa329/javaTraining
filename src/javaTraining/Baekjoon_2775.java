package javaTraining;
import java.util.Scanner;

//백준 문제 2775번 풀이_김희재
public class Baekjoon_2775 {
	
	static int countPeople(int a, int b){
		int people = 0;
		
		if(a==0) {
			for(int i=1; i<=b; i++)
				people += i;
			return people;
		}
		
		for(int j=1; j<=b; j++)
			people = people + countPeople(a-1, j);
		return people;
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T>0) {
			int k, n;
			k = sc.nextInt();
			n = sc.nextInt();
			
			int result = countPeople(k-1,n);
			System.out.println(result);
			
			T--;
		}
		
		}
	}