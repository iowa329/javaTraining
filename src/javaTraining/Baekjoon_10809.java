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
		int alphaPos;
		for(int i=0; i<wd.length(); i++) {
			switch(wd.charAt(i)) {
			case 'a' :
				alphaPos=0;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'b' :
				alphaPos=1;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'c' :
				alphaPos=2;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'd' :
				alphaPos=3;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'e' :
				alphaPos=4;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'f' :
				alphaPos=5;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'g' :
				alphaPos=6;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'h' :
				alphaPos=7;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'i' :
				alphaPos=8;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'j' :
				alphaPos=9;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'k' :
				alphaPos=10;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'l' :
				alphaPos=11;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'm' :
				alphaPos=12;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'n' :
				alphaPos=13;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'o' :
				alphaPos=14;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'p' :
				alphaPos=15;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'q' :
				alphaPos=16;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'r' :
				alphaPos=17;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 's' :
				alphaPos=18;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 't' :
				alphaPos=19;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'u' :
				alphaPos=20;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'v' :
				alphaPos=21;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'w' :
				alphaPos=22;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'x' :
				alphaPos=23;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'y' :
				alphaPos=24;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			case 'z' :
				alphaPos=25;
				if(alphabet[alphaPos] != -1)
					break;
				alphabet[alphaPos] = i;
				break;
			}
		}
		
		//인덱싱 값 출력
		for(int i=0; i<alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
	}
}
