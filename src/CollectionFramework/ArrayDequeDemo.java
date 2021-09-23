package CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		adq.offer(78);
		adq.offerFirst(100);
		adq.offer(30);
		adq.offer(20);
		adq.offerLast(5);
		
		System.out.println(adq);
		
		System.out.println(adq.peek());
		
		System.out.println(adq.peekFirst());
		
		System.out.println(adq.peekLast());
		
		
		System.out.println(adq.poll());
		System.out.println(adq);
		
		
		System.out.println(adq.pollFirst());
		System.out.println(adq);
		
		System.out.println(adq.pollLast());
		System.out.println(adq);
		
		
		
	}

}
