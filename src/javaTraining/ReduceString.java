package javaTraining;
import java.util.Scanner;

public class ReduceString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		int cases = 1;
		int shortest = s.length();
		int cnt = 1;
		String result = s.substring(0,1);
		while(cases <= s.length()) {
			for(int pos=0; pos+(cases*2) <= s.length();) {
				String wd1 = s.substring(pos, pos+cases);
				pos += cases;
				String wd2 = s.substring(pos, pos+cases);
				
				if(wd1 == wd2) {
					result = result + s.replace(cnt+wd1, ++cnt+wd1);
				} else {
					cnt = 1;
					result = result + (cnt+wd2);
				}
			}
			cnt = 1;
			result = result.replace("1","");
			if(result.length() < shortest)
				shortest = result.length();

			System.out.println(result + " (" + cases + ")=>" + shortest);
			
			cases++;
		}
		System.out.println(result);
		System.out.println(shortest);
	}

}