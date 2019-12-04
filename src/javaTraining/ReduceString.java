package javaTraining;
import java.util.Scanner;

//구현문제_02_어피치_문자열_압축하기
//201534007 김희재
public class ReduceString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int shortest = s.length();
		int cnt = 1;
		int cases = 1;
		while(cases <= s.length()) {
			String result = cnt + s.substring(0,cases);
			int pos=0;
			while(pos+(cases*2) <= s.length()) {
				String wd1 = s.substring(pos, pos+cases);
				pos += cases;
				String wd2 = s.substring(pos, pos+cases);
				
				if(wd1.equals(wd2)) {
					result = result.replace(cnt+wd2, ++cnt+wd2);
				} else {
					cnt = 1;
					result = result + (cnt+wd2);
				}
			}
			if(s.length() % cases != 0)
				result = result + s.substring(pos+cases,s.length());
			result = result.replace("1","");
			
			if(result.length() < shortest)
				shortest = result.length();
			
			cnt = 1;
			cases++;
		}
		System.out.println(shortest);
	}

}