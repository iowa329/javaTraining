package javaTraining;
import java.util.Scanner;

//백준 문제 2941번 풀이_김희재
public class Baekjoon_2941 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String wd = sc.next();
		sc.close();
		
		int croatia=0;
		int end; boolean loop;
		int maxIndex = wd.length()-1;
		for(int start=0; start<wd.length(); start=start+end) {
			end = 3;
			if(start+end > maxIndex)
				end = maxIndex - start +1;
			String tmp = wd.substring(start,start+end);
			
			loop=true; ++end;
			while(loop) {
				--end;
				tmp = tmp.substring(0,end);
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
				
				if(end <= 1) {
					croatia += 1;
					loop=false;
				}
			}
		}
	System.out.println(croatia);	
	}
	
}
