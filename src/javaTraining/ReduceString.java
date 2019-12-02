package javaTraining;
import java.util.Scanner;

public class ReduceString {
	
	public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		int cases = 1;
		String result = null;
		int shortest = s.length();
		int cnt = 1;
		while(cases <= s.length()) {
			for(int pos=0; pos+cases <= s.length(); pos+=cases) {
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
		System.out.println(shortest);
	}

}