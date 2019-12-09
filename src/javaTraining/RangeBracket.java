package javaTraining;
import java.util.Scanner;

public class RangeBracket {
	
	static String range(String w) {
		if(w.equals("")) return w;
		
		String u="",v="";
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
		for(int i=0; open < 0 || i >= u.length(); i++){
			if(u.charAt(i) == '(') {
				open++;
			} else {
				open--;
			}
		}
		if(open >= 0) {
			return range(v);
		} else {
			String s = "(";
			s += v;
			s += ")";
			u = u.substring(1,u.length()-1);
			u = u.replace("(",")");
			u = u.replace(")","(");
			s += u;
			return s;
		}
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		sc.close();
		
		range(w);
	}
	
}
