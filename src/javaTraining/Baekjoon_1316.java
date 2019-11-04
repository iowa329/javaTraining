package javaTraining;
import java.util.Scanner;

public class Baekjoon_1316 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		sc.nextLine();
		
		int grpwd = cnt;
		
		for(int i=0;i<cnt; i++) {
			String wd = sc.nextLine();
			int length = wd.length();
			char[] check = new char[length];
			
			check[0] = wd.charAt(0);
			for(int j=1; j<length; j++) {
				check[j] = wd.charAt(j);
				if(check[j] != check[j-1]) {
					int pos = j;
					for(int k=0; k<pos; k++) {
						if(check[j] == check[k]) {
							k = j;
							j = length;
							grpwd--;
						}
					}
				}
			}
		}
		sc.close();
		System.out.println(grpwd);
	}
	
}
