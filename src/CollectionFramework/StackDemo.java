package CollectionFramework;

import java.util.List;
import java.util.Stack;

public class StackDemo {
	// 1.push-to insert
	// 2.pop-to remove
	// 3.peek-Looks at the object at the top of this stack without removing it from the stack.
	public static void main(String[] args) {
		Stack<String> animals=new Stack<>();
		List<Integer> i=new Stack<Integer>();
		i.add(7);
		i.add(9);
		i.add(9);
		i.add(67);
		System.out.println(i);
		animals.push("Lion");
		animals.push("Dog");
		animals.add("Lion");
		animals.push("Horse");
		animals.push("Cat");
		animals.push("Rabbit");//LAST inserted
		System.out.println(animals.empty());
		System.out.println(animals.search("Dog"));//5
		System.out.println("Stack:"+animals);
		System.out.println(animals.peek());//Looks at the object at the top of this stack without removing it from the stack.
		System.out.println(animals);
		animals.pop();//Removes the object at the top of this stack and returns thatobject as the value of this function.
		System.out.println(animals);
		System.out.println(animals.peek());
		animals.pop();
		System.out.println("Stack:"+animals);

	}

}
