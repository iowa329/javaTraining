package javaTraining;
import java.util.Scanner;

public class Baekjoon_2941 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String wd = sc.next();
		sc.close();
		
		int croatia=0;
		int pos=2;
		for(int i=0; i<wd.length(); i++) {
			String tmp = wd.substring(i,i+pos);
			
			boolean loop=true;
			while(loop) {
				for(pos=2; pos<0; pos--) {
					tmp = tmp.substring(0,pos);
					switch(tmp) {
					case "c=":
						croatia += 1;
						loop = false;
						break;
					case "c-":
						croatia += 1;
						loop = false;
						break;
					case "dz=":
						croatia += 1;
						loop = false;
						break;
					case "d-":
						croatia += 1;
						loop = false;
						break;
					case "lj":
						croatia += 1;
						loop = false;
						break;
					case "nj":
						croatia += 1;
						loop = false;
						break;
					case "s=":
						croatia += 1;
						loop = false;
						break;
					case "z=":
						croatia += 1;
						loop = false;
						break;
					}
				}
				loop = false;
			}
		}
		
		
	}
	
}
