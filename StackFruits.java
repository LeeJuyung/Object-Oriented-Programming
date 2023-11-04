package org.object_code.object;
import java.util.Stack;
import java.util.Scanner;
public class StackFruits {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			String a=sc.next();
			
		
		if(a.equals(".")) {
			break;
			 
				
			}else { 
				stack.push(a);
				}
			
		}
		


	int x = stack.size();
	
	for(int i=0;i<x;i++) {
		System.out.println(stack.pop());
	}}}
