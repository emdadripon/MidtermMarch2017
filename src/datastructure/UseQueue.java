package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<String>();
		queue.add("Runa Lila");
		queue.add("Sabina Yasmin");
		queue.add("Baby Naznin");
		queue.add("Konok Chapa");

		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue.poll());

		System.out.println("Retriving elements by enhance for loop");
		for(String singer:queue){
			System.out.println(singer);
		}
		System.out.println("Retriving elements by while loop with Iterator");
		Iterator it = queue.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}
}
