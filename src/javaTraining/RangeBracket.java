package javaTraining;
import java.util.Scanner;

public class RangeBracket {
	
	String isRightBracket(String p) {
		String u = new String();
		String v = new String();
		
		int i=0, right=0, left=0;
		do {
			if(p.charAt(i) = '(') {
				u.charAt(i) = p.charAt(i);
				right++;
				i++;
			} else {
				u.charAt(i) = p.charAt(i);
				left++;
				i++;
		} while (right != left);
		
		for(;i<p.length(); i++) {
			v.charAt(i) = p.charAt(i);
		}
		
		return isRightBracket(u);
	}
	
	public static void main(String[] args) {
		System.out.println("괄호 입력 : ");
		Scanner sc = new Scanner(System.in);
		String p = sc.next();
		
		String result = isRightBracket(p);
		
		System.out.println("올바른 괄호 문자열 정렬 결과 : " + result);
	}

}

