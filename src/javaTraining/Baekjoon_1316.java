package javaTraining;
import java.util.Scanner;

public class Baekjoon_1316 {
	
	public static void main() {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i=0;i<cnt; i++) {
			String wd = sc.nextLine();
			int length = wd.length();
			char[] check = new char[length];
			
			check[0] = wd.charAt(0);
			for(int j=1; j<length; j++) {
				
				if(check[j] == check[j-1])
					check[j] = wd.charAt(j);
				else
					j = length;
			}
		}
		sc.close();
	}
	
}
