package javaTraining;
import java.util.Scanner;

//백준 문제 2775번 풀이_김희재
public class Baekjoon_2775 {
	
	static int countPeople(int k, int n){
		int people = 0;
		if(k==0) {
			for(int i=1; i<=n; i++) {
				people += n;
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test, k, n;
		test = sc.nextInt();
		k = sc.nextInt();
		n = sc.nextInt();
		
		int result = countPeople(k,n);
		
			
		}
	}