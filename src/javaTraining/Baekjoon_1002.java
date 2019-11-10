package javaTraining;
import java.util.Scanner;

public class Baekjoon_1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		//sc.next();
		
		for(int i=1; i<=cnt; i++) {
			int x1 = sc.nextInt();
			System.out.print(x1+" ");
			int y1 = sc.nextInt();
			System.out.print(y1+" ");
			int r1 = sc.nextInt();
			System.out.print(r1+" ");
			int x2 = sc.nextInt();
			System.out.print(x2+" ");
			int y2 = sc.nextInt();
			System.out.print(y2+" ");
			int r2 = sc.nextInt();
			System.out.println(r2);
			
			int cases = 0;
			int radiusSum = (int) Math.pow((r1+r2), 2);
			System.out.print(radiusSum+" ");
			int result = (int) Math.pow((x1-x2)+(y1-y2), 2);
			System.out.println(result+" ");
			
			if(result == radiusSum) {
				cases = 1;
			} else if(result < radiusSum) {
				cases = 2;
			} else if(result > radiusSum) {
				cases = -1;
			}
			
			System.out.println(cases);
		}
		
		
		
	}
}