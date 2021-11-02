package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		//insertion order is not maintained
		//offer()-to add element
		//peek()-to know which is the next smallest element ready to be deleted
		//poll()-//it will remove element (smallest) which has least priority
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		Queue<String> p=new PriorityQueue<String>();
		p.offer("100");
		p.offer("Pankaj");
		p.offer("true");
		System.out.println(p);
		System.out.println(p.peek());
		p.poll();
		System.out.println(p.peek());
		System.out.println(p);
		pq.offer(40);
		pq.offer(8);
		pq.offer(5);
		pq.offer(15);
		
		
		System.out.println(pq);//insertion order is not maintained
		
		pq.poll();
		System.out.println(pq);//it will remove element (smallest) which has least priority
		
		System.out.println(pq.peek());//next smallest will be ready to be removed
	}

}
