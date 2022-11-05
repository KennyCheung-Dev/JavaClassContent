package usaco;

import java.util.LinkedList;

public class LinkedListTests {

	public static void main(String[] args) {
		MyLinkedList<Integer> ll = new MyLinkedList<Integer>();
		LinkedList<Integer> javaLl = new LinkedList<Integer>();
		
		ll.AddToEnd(1);
		ll.AddToEnd(2);
		ll.AddToEnd(3);
		ll.AddToEnd(4);
		ll.AddToEnd(5);
		
		System.out.println(ll);
		
		System.out.println(ReverseLinkedList(ll));
	}
	
	public static MyLinkedList<Integer> ReverseLinkedList(MyLinkedList<Integer> ll) {
		MyLinkedList<Integer>.Node<Integer> previous = null;
		MyLinkedList<Integer>.Node<Integer> current = ll.head;
		MyLinkedList<Integer>.Node<Integer> next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		ll.head = previous;
		return ll;
	}
}
