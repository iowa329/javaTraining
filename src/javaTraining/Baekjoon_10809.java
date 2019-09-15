package javaTraining;
import java.util.Scanner;

public class Baekjoon_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 입력 : ");
		String wd = sc.next();
		
		int alphabet[] = new int[26];
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
			}
		}
	}
}
