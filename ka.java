package org.object_code.object;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class ka {

	public static void main(String[] args) {
		Queue<String> q=new LinkedList<>();//한국식
		Stack<String> s=new Stack<>();//미국식
		Scanner sc=new Scanner(System.in);
		System.out.println("Type");
		String t=sc.next();
		System.out.println("Country");
		String a=sc.next();
		q.add(a);
		s.push(a);
		System.out.println("City");
		String b= sc.next();
		q.add(b);
		s.push(b);
		System.out.println("Street");
		String c=sc.next();
		q.add(c);
		s.push(c);

		if(t.equals("K")) {
			System.out.println("Adress");
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
		}
		if(t.equals("E")) {
			System.out.println("Adress");
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
		}
			
			
		
	}

}
