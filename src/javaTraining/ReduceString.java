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
		String result=""; //프린트문을 위한 임시 변수 선언(원래는 안에다가)
		while(cases <= s.length()) {
			/*String*/result = cnt + s.substring(0,cases);
			for(int pos=0; pos+(cases*2) <= s.length();) {
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
			cnt = 1;
			result = result.replace("1","");
			if(result.length() < shortest)
				shortest = result.length();

			System.out.println(result + " (" + cases + ")=>" + shortest);
			
			do {
				cases++;
			} while(s.length() % cases != 0);
		}
		System.out.println(result);
		System.out.println(shortest);
	}

}