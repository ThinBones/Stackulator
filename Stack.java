/**
 * Author: Jack Pender
 * Class:  APCSA
 * Date:   Jan 2025
 * Description: Interface for what a stack must implement
 */
public interface Stack<T> {
    boolean isEmpty();

    T push(T o);

    T pop();

    T peek();

    int search(T o);
}
