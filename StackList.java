/**
 * Author: Jack Pender
 * Class:  APCSA
 * Date:   Jan 2025
 * Description: A StackList, combines LinkedList and Stack,
 * uses a first-in-first-out way of managing data
 */
public class StackList<T> implements Stack {
    LinkedList<T> list;

    public StackList() {
        list = new LinkedList<T>();
    }

    /**
     * Checks if the StackList is empty
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Adds a node to the top of the stack
     */
    @Override
    public T push(Object o) {
        T tempFront = list.getFront();
        list.addFront(tempFront);
        list.addFront(o);
        return tempFront;
    }

    /**
     * Removes node from the top of the list
     */
    @Override
    public T pop() {
        T tempFront = list.getFront();
        return tempFront;
    }

    /**
     * Looks at the top of the stack, doesn't remove
     * anything
     */
    @Override
    public T peek() {
        T restore = list.getFront();
        list.addFront(restore);
        return restore;
    }

    /**
     * Looks through the whole list and returns the index of
     * where the object is in the stack, returns -1 if
     * object is not found
     */
    @Override
    public int search(Object o) {
        LinkedList<T> tempList = new LinkedList<>();
        int index = 0;
    
        while (!list.isEmpty()) {
            T temp = list.getFront();
            tempList.addFront(temp);
    
            if (temp.equals(o)) {
                return index;
            }
    
            index++;
        }

        while (!tempList.isEmpty()) {
            list.addFront(tempList.getFront());
        }
    
        return -1;
    }

    /**
     * Check if this can even be used
     */
    @Override
    public String toString() {
        return list.toString();
    }
}