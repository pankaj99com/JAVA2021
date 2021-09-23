package CollectionFramework;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.offer(40);
		pq.offer(8);
		pq.offer(5);
		pq.offer(15);
		
		
		System.out.println(pq);//insertion order is not maintained
		
		pq.poll();
		System.out.println(pq);//it will remove element (smallest) which has leasr priority
		
		System.out.println(pq.peek());//next smallest will be ready to be removed
	}

}
