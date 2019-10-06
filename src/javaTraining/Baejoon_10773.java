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
		int pos = 0; //저장되고 있는 배열의 위치 인덱스값
		for(int i=0; i<count; i++) {
			num[pos] = sc.nextInt();
			if(num[pos] == 0) {
				pos--;
				num[pos] = 0;
			} else {
				pos++;
			}
		}
		
		//입력된 배열의 총합 구하기
		int sum = 0;
		for(int i=0; i<=pos; i++)
			sum += num[i];
		
		System.out.println(sum);
	}
}