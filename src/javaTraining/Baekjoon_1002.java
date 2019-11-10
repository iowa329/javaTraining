package javaTraining;
import java.util.Scanner;

public class Baekjoon_1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		sc.next();
		
		for(int i=1; i<=cnt; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			int x3=0, y3=0;
			
			int case1=0, case2=0;
			int result=0;
			
			result = r1^2 - (x1-x3)^2;
			switch (result) {
				case 0 :
					case1 = 1;
				default :
					if(result > 0)
						case1 = 2;
					else
						case1 = 0;
			}
			
			result = r2^2 - (x2-x3)^2;
			switch (result) {
				case 0 :
					case2 = 1;
				default :
					if(result > 0)
						case2 = 2;
					else
						case2 = 0;
			}
			
			System.out.println(case1+case2);
		}
		
		
		
	}
}