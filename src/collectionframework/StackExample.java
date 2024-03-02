package collectionframework;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		/* LIFO - last in first out - stack
		 * FIFo - first in first out - queue
		 * stack is a class in java which implements the list interface and extends vector class and also represents lifo principle.
		 * 
		 * special method are used in stack : push,pop,peek(view),search(top to bottom)
		 * */
		
		Stack<String> books = new Stack<>();
		books.push("red");
		books.push("black");
		books.push("white");
		
		//to view
		System.out.println(books.peek());//to display last element : white
		System.out.println(books);
		System.out.println(books.pop());// to delete last element : white
		System.out.println(books);
		books.push("white");
		System.out.println(books);
		System.out.println(books.search("red"));// search from top to bottom 1: white 2:black 3: red output :3
		System.out.println(books.indexOf("red"));//index will be 0:red 1:black 2:white output :0
		System.out.println(books.empty());

	}

}
