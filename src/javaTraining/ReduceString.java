package javaTraining;
import java.util.Scanner;

public class ReduceString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		int cases = 1;
		String result = "";
		int shortest = s.length();
		int cnt = 1;
		while(cases <= s.length()) {
			for(int pos=0; pos+(cases*2) <= s.length(); pos+=cases) {
				String wd1 = s.substring(pos, pos+cases-1);
				pos += cases;
				String wd2 = s.substring(pos, pos+cases-1);
				
				if(wd1 == wd2) {
					cnt++;
					result = result + (cnt+wd1);
				} else {
					result = result + wd1;
					cnt = 1;
				}
			}
			if(result.length() < shortest)
				shortest = result.length();
			cases++;
		}
		System.out.println(result);
		System.out.println(shortest);
	}

}