package javaTraining;
import java.util.Scanner;

public class RangeBracket {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		sc.close();
		
		if(w.equals(""))
			return "";
		
		String u,v;
		int r=0, l=0;
		for(int i=0; i<w.length(); i++) {
			if(w.charAt(i) == '(') {
				u += '(';
				l++;
			} else {
				u += ')';
				r++;
			}
			
			if(l == r) {
				v = w.substring(i+1, w.length());
				i = w.length();
			}
		}

		int open = 0;
		for(int i=0; open < 0 || i < u.length(); i++) {
			if(u.charAt(i) == '(') {
				open++;
			} else {
				open--;
			}
		}
		if(open < 0)
			
	}
	
}
