/**
 * Author: Jack Pender
 * Class:  APCSA
 * Date:   Jan 2025
 * Description: 
 */
public class ListNode<T> {
	private T obj;
	private ListNode<T> next;

	public ListNode(T o, ListNode<T> n) {
		obj = o;
		next = n;
	}

	/**
	 * Gets the object value
	 * @return
	 */
	public T getObj() {
		return obj;
	}

	/**
	 * Returns the next node in the list
	 * @return
	 */
	public ListNode<T> getNext() {
		return next;
	}

	/**
	 * Sets an object o to a value
	 * @param o
	 */
	public void setObj(T o) {
		obj = o;
	}

	/**
	 * Sets the next ListNode to another ListNode
	 * @param n
	 */
	public void setNext(ListNode<T> n) {
		next = n;
	}
}
