/**
 * Author: Jack Pender
 * Class:  APCSA
 * Date:   Jan 2025
 * Description: Manages ListNodes and manipulates and checks the list
 */
public class LinkedList<T> {
    private ListNode<T> front;
    
    public LinkedList() {
        front = null;
    }

    /**
     * Checks if the LinkedList is empty
     * @return
     */
    public boolean isEmpty() {
        return (front == null);
    }

    /**
     * Finds the object in the front and removes it
     * @return
     */
    public T getFront() {
        if (front != null) {
            T temp = front.getObj();
            front = front.getNext();
            return temp;
        }
        return null;
    }

    /**
     * Finds the object in the back and doesn't remove it
     * @return
     */
    public Object getBack() {
        if (front != null) {
            ListNode<T> curr = front;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            return curr.getObj();
        }
        return null;
    }
    
    /**
     * Adds an object to the front of the list
     * @param o
     */
    public void addFront(Object o) {
        ListNode<T> temp = new ListNode(o, front);
        front = temp;
    }

    /**
     * Adds and object to the back
     * @param o
     */
    public void addBack(Object o) {
        ListNode<T> newNode = new ListNode(o, null);
        
        if (front == null) {
            front = newNode;
        } 
		else {
            ListNode<T> current = front;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    /**
     * Makes a toString for each thing in the List, prints it out
     */
	@Override
	public String toString() {
		String temp = "";
		ListNode<T> curr = front;
		
		while (curr != null) {
			if (curr.getObj() != null) {
				temp += curr.getObj().toString() + ", ";
			}
			curr = curr.getNext();
		}
	
		if (temp.length() > 0) {
			temp = temp.substring(0, temp.length() - 2);
		}
	
		return temp;
	}
}
