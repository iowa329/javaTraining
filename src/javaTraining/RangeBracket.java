package javaTraining;
import java.util.Scanner;

public class RangeBracket {
	
	static String range(String w) {
		if(w.equals("")) return "";
		
		String u="",v="";
		for(int i=0, l=0, r=0; i<w.length(); i++) {
			if(w.charAt(i) == '(') {
				u += '(';
				l++;
			} else {
				u += ')';
				r++;
			}
			
			if(l == r) {
				v = w.substring(i+1);
				i = w.length();
			}
		}
		
		int open=0; int i=0;
		while(open >= 0 && i < u.length()) {
			if(u.charAt(i) == '(') {
				open++;
			} else {
				open--;
			}
			i += 1;
		}
		if(open >= 0) {
			v = range(v);
		} else {
			String s = "(";
			v = range(v);
			s += v;
			s += ")";
			u = u.substring(1,u.length()-1);
			for(i=0; i<u.length(); i++) {
				if(u.charAt(i) == '(') {
					u = u.substring(0, i) + ")" + u.substring(i+1);
				} else {
					u = u.substring(0, i) + "(" + u.substring(i+1);
				}
			}
			s += u;
			v = s;
			return v;
		}
		return u+v;
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		sc.close();
		
		String result = range(w);
		System.out.println(result);
	}
	
}
