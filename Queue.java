/**
 * Author: Jack Pender
 * Class:  APCSA
 * Date:   Jan 2025
 * Description: Interface for what a queue must implement
 */
public interface Queue {
   boolean isEmpty();
   
   Object dequeue();

   Object enqueue(Object o);

   Object getBack();

   Object getFront();
}
