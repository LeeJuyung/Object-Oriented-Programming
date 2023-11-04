package org.object_code.object;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("60201359 이주영");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] arr = s.split("");
		Queue<String> queue = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			queue.offer(arr[i]);
		}
		if(queue.size()>1) {
			for(int i=0; i < arr.length/2; i++) {
				if (arr[i].equals(arr[arr.length - 1])) {
					queue.remove();
					queue.remove(arr.length);
					System.out.println("true");
					break;
				} else {
					System.out.println("false");
					break;
				}
			}
		}
		else if(queue.size()==1) {
			System.out.println("true");
		}
	}
}