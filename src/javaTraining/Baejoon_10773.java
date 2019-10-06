package javaTraining;
import java.util.Scanner;

//백준 문제 10773번 풀이_김희재
public class Baejoon_10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		//배열 초기화
		int num[] = new int[count];
		for(int i=0; i<num.length; i++)
			num[i]=0;
		
		//입력값을 배열에 저장
		
		for(int i=0; i<count; i++) {
			num[i] = sc.nextInt();
			if(num[i] == 0) {
				num[i-1] = 0;
				i--;
			}
		}
		
		//입력된 배열의 총합 구하기
		int sum = 0;
		for(int i=0; i<num.length; i++)
			sum += num[i];
		
		System.out.println(sum);
	}
}
