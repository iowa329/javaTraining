package javaTraining;
import java.util.Scanner;

class Node {
	int num;
	Node next;
}

class LinkedStack {
	Node top;
	
	public LinkedStack(){
		top = null;
	}
	
	public void push(int num){
		if(num == 0) {
			top = top.next;
		} else {
			Node node = new Node();
			node.num = num;
			node.next = top;
			top = node;
//			System.out.print(top.num);
		}
	}
	
	public void popAll() {
		while(top != null) {
			System.out.print(top.num);
			top = top.next;
		}
		System.out.println("\nDone.");
//		int num = top.num;
//		return top.num;
//		top = top.next;
//		return num;
	}
}

public class Baejoon_10773 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		System.out.println();
		
		LinkedStack stack = new LinkedStack();
		
		for(int i=1; i<=count; i++)
			stack.push(sc.nextInt());

		
		stack.popAll();
//		System.out.println();
		
		sc.close();
	}
}


/*
//백준 문제 10773번 풀이_김희재
public class Baejoon_10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		//배열 초기화
		int num[] = new int[count];
		
		//입력값을 배열에 저장
		int pos = 0; //저장되고 있는 배열의 위치 인덱스값
		for(int i=0; i<count; i++) {
			num[pos] = sc.nextInt();
			if(num[pos] == 0) {
				pos--;
				num[pos] = 0;
			} else {
				pos++;
			}
		}
		
		//입력된 배열의 총합 구하기
		int sum = 0;
		for(int i=0; i<=pos; i++)
			sum += num[i];
		
		System.out.println(sum);
	}
}
*/