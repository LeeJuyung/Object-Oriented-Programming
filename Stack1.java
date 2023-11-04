package org.object_code.object;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		
		stack.push("사과");
		stack.push("감");
		stack.push("배");
		
		System.out.println("스택의 크기는 "+stack.size());
		System.out.println("감 있나? "+stack.contains("감")); //true
		
		System.out.println(stack.pop()); //배
		System.out.println("스택의 크기는 "+stack.size()); //2
		
		System.out.println(stack.pop());
		System.out.println("스택의 크기는 "+stack.size());
		
		System.out.println(stack.pop());
		System.out.println("스택의 크기는 "+stack.size());
		
		System.out.println(stack.pop());
		System.out.println("스택의 크기는 "+stack.size());
	
	}

}
