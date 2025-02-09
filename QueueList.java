/**
 * Author: Jack Pender
 * Class:  APCSA
 * Date:   Jan 2025
 * Description: A QueueList that combines LinkedLists and Queues,
 * LI-FO way of managing data
 */
public class QueueList implements Queue {
    LinkedList list;

    public QueueList() {
        list = new LinkedList();
    }

    /**
     * Checks if the queue is empty
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Removes the node at the front of the queue
     */
    @Override
    public Object dequeue() {
        return list.getFront();
    }

    /**
     * Adds a node at the back of the queue
     */
    @Override
    public Object enqueue(Object o) {
        list.addBack(o);
        return o;
    }

    /**
     * Access the back of the queue
     */
    @Override
    public Object getBack() {
        Object temp = list.getBack();
        return temp;
    }

    /**
     * Accesses the front of the queue
     */
    @Override
    public Object getFront() {
        Object temp = list.getFront();
        return temp;
    }

    /**
     * Check if this can even be used
     */
    @Override
    public String toString() {
        return list.toString();
    }
}
