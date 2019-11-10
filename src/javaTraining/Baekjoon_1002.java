package javaTraining;
import java.util.Scanner;

public class Baekjoon_1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		//sc.next();
		
		for(int i=1; i<=cnt; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			int cases = 0;
			int distance = (int) Math.pow((x1-x2)+(y1-y2), 2);
			int radiusSum = (int) Math.pow((r1+r2), 2);
			int radiusDiff = (int) Math.pow((r1-r2), 2);
			
			if(distance == 0) {
				if(r1 == r2)
					cases = -1;
				else
					cases = 0;
			} else {
				if(distance == radiusSum || distance == radiusDiff){
					cases = 1;
				} else if(distance < radiusSum)
					cases = 2;
				else {
					cases = 0;
				}
				
			}
			
			System.out.println(cases);
		}
		sc.close();
		
		
	}
}