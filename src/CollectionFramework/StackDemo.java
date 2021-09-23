package CollectionFramework;

import java.util.Stack;

public class StackDemo {
	// 1.push-to insert
	// 2.pop-to remove
	// 3.peek-to know last element inserted into stack
	public static void main(String[] args) {
		Stack<String> animals=new Stack<>();
		animals.push("Lion");
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");
		animals.push("Rabbit");//LAST inserted
		System.out.println("Stack:"+animals);
		System.out.println(animals.peek());//last inserted items will be picked
		System.out.println(animals);
		animals.pop();
		System.out.println(animals);

	}

}
