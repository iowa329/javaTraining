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
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = -1;
			//System.out.print(alphabet[i]);
		}
		
		//입력 단어 순서별 알파벳 위치 인덱싱
		for(int i=0; i<wd.length(); i++) {
			switch(wd.charAt(i)) {
			case 'a' :
				alphabet[0] = i;
				break;
			case 'b' :
				alphabet[1] = i;
				break;
			case 'c' :
				alphabet[2] = i;
				break;
			case 'd' :
				alphabet[3] = i;
				break;
			case 'e' :
				alphabet[4] = i;
				break;
			case 'f' :
				alphabet[5] = i;
				break;
			case 'g' :
				alphabet[6] = i;
				break;
			case 'h' :
				alphabet[7] = i;
				break;
			case 'i' :
				alphabet[8] = i;
				break;
			case 'j' :
				alphabet[9] = i;
				break;
			case 'k' :
				alphabet[10] = i;
				break;
			case 'l' :
				alphabet[11] = i;
				break;
			case 'm' :
				alphabet[12] = i;
				break;
			case 'n' :
				alphabet[13] = i;
				break;
			case 'o' :
				alphabet[14] = i;
				break;
			case 'p' :
				alphabet[15] = i;
				break;
			case 'q' :
				alphabet[16] = i;
				break;
			case 'r' :
				alphabet[17] = i;
				break;
			case 's' :
				alphabet[18] = i;
				break;
			case 't' :
				alphabet[19] = i;
				break;
			case 'u' :
				alphabet[20] = i;
				break;
			case 'v' :
				alphabet[21] = i;
				break;
			case 'w' :
				alphabet[22] = i;
				break;
			case 'x' :
				alphabet[23] = i;
				break;
			case 'y' :
				alphabet[24] = i;
				break;
			case 'z' :
				alphabet[25] = i;
				break;
			}
		}
		
		//인덱싱 값 출력
		for(int i=0; i<alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
	}
}
