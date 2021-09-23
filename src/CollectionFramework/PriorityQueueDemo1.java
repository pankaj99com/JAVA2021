package CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo1 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());//using comparator we are changig the priority
		pq.offer(40);
		pq.offer(8);
		pq.offer(5);
		pq.offer(15);
		
		
		System.out.println(pq);//insertion order is not maintained
		
		pq.poll();
		System.out.println(pq);//it will remove element (highest) which has least priority
		
		System.out.println(pq.peek());//next highest will be ready to be removed
	}

}
