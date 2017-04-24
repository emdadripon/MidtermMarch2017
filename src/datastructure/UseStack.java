package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<String> stack = new Stack<>();
		stack.push("Rituparna Sengupta");
		stack.push("Swastika Mukherjee");
		stack.push("Srabanti Chatterjee");
		stack.push("Sayantika Banerjee");

		System.out.println(stack.peek());
		System.out.println(stack.search("Srabanti Chatterjee"));
		System.out.println(stack.pop());

		System.out.println("Retriving elements From stack by enhance for loop");
		for(String actress:stack){
			System.out.println(actress);
		}
		System.out.println("Retriving elements From stack by while loop with iterator");
		Iterator it = stack.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}
}
