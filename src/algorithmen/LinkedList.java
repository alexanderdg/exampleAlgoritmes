package algorithmen;

/**
 * 
 * @author Alexander
 *
 *Single Linked List
 *
 * @param <T>
 */
public class LinkedList<T> 
{
	private Node head;
	/**
	 * Constructor for a linked list with one element
	 * 
	 * @param elemenet
	 */
	public LinkedList(T elemenet)
	{
		head = new Node(elemenet);
		
	}
	
	public void append(T element){
		Node newNode = new Node(element);
	}
	/**
	 * 
	 * @return the head of the first element
	 */
	
	public T first()
	{
		return head.get();
		
	}
	
	
	private class Node
	{
		private T element;
		private Node next;
		
		public Node(T element)
		{
			this.element = element;
			this.next = next;
		}
		
		public T get()
		{
			return element;
		}
	}
	
}