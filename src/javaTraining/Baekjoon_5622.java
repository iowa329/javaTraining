package javaTraining;
import java.util.Scanner;

//백준 문제 5622번 풀이_김희재
public class Baekjoon_5622 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dial = sc.next();
		sc.close();

		int time=0;
		for(int i=0; i<dial.length(); i++) {
			switch(dial.charAt(i)) {
			case 'A':
			case 'B':
			case 'C':
				time += 3;
				break;
			case 'D':
			case 'E':
			case 'F':
				time += 4;
				break;
			case 'G':
			case 'H':
			case 'I':
				time += 5;
				break;
			case 'J':
			case 'K':
			case 'L':
				time += 6;
				break;
			case 'M':
			case 'N':
			case 'O':
				time += 7;
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				time += 8;
				break;
			case 'T':
			case 'U':
			case 'V':
				time += 9;
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				time += 10;
				break;
			}
		}
		System.out.println(time);
	}
	
}
