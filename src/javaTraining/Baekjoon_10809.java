package javaTraining;
import java.util.Scanner;

//백준 문제 10809번 풀이_김희재
public class Baekjoon_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 입력 : ");
		String wd = sc.next();
		
		int alphabet[] = new int[26];
		
		//알파벳 위치 배열 초기화
		for(int i=0; i<wd.length(); i++) {
			alphabet[i] = -1;
		}
		
		//입력 단어 순서별 알파벳 위치 인덱싱
		for(int i=0; i<wd.length(); i++) {
			switch(wd.charAt(i)) {
			case 'a' :
				alphabet[i] = i;
				break;
			case 'b' :
				alphabet[i] = i;
				break;
			case 'c' :
				alphabet[i] = i;
				break;
			case 'd' :
				alphabet[i] = i;
				break;
			case 'e' :
				alphabet[i] = i;
				break;
			case 'f' :
				alphabet[i] = i;
				break;
			case 'g' :
				alphabet[i] = i;
				break;
			case 'h' :
				alphabet[i] = i;
				break;
			case 'i' :
				alphabet[i] = i;
				break;
			case 'j' :
				alphabet[i] = i;
				break;
			case 'k' :
				alphabet[i] = i;
				break;
			case 'l' :
				alphabet[i] = i;
				break;
			case 'm' :
				alphabet[i] = i;
				break;
			case 'n' :
				alphabet[i] = i;
				break;
			case 'o' :
				alphabet[i] = i;
				break;
			case 'p' :
				alphabet[i] = i;
				break;
			case 'q' :
				alphabet[i] = i;
				break;
			case 'r' :
				alphabet[i] = i;
				break;
			case 's' :
				alphabet[i] = i;
				break;
			case 't' :
				alphabet[i] = i;
				break;
			case 'u' :
				alphabet[i] = i;
				break;
			case 'v' :
				alphabet[i] = i;
				break;
			case 'w' :
				alphabet[i] = i;
				break;
			case 'x' :
				alphabet[i] = i;
				break;
			case 'y' :
				alphabet[i] = i;
				break;
			case 'z' :
				alphabet[i] = i;
				break;
			}
			System.out.println(alphabet[i]);
		}
		
		//인덱싱 값 출력
		for(int i=0; i<alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
	}
}
