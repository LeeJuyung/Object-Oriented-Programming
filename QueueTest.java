package org.object_code.object;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		System.out.println(queue);
		
		queue.add(2);
		System.out.println(queue);
		
		queue.offer(3);
		System.out.println(queue);
		
		System.out.println(queue.poll());
		
		queue.remove();
		System.out.println(queue);
		
		queue.clear();
		System.out.println(queue);
	}

}
