package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class linkedListQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList();

		queue.offer(10);
		queue.offer(34);
		queue.offer(44);
		queue.offer(12);
		queue.add(5);// this will throw exception if for some reason we are
						// unable to add the element

		queue.poll();// removed the first inserted element.it returns null if
						// the queue is empty
		queue.remove();// This will remove the first inserted element but it will
						// throw exception if queue is empty
		System.out.println(queue);
		queue.element();// this will tell which is the next element ready to
						// move out but it will throw exception if queue is
						// empty

		System.out.println(queue.element());
		System.out.println(queue.peek());// this will tell which is the next
											// element ready to move out

		System.out.println(queue);

	}

}
