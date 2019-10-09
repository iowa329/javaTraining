package javaTraining;
import java.util.Scanner;

// 백준 문제 10773번 풀이_김희재
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
		}
	}
	
	public int sum() {
		int sum = 0;
		while(top != null) {
			sum += top.num; 
			top = top.next;
		}
		return sum;
	}
}

public class Baekjoon_10773 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		LinkedStack stack = new LinkedStack();
		for(int i=1; i<=count; i++)
			stack.push(sc.nextInt());
		sc.close();
		
		System.out.println(stack.sum());
	}
}