/**
 * Author: Jack Pender
 * Class:  APCSA
 * Date:   Jan 2025
 * Description: Tests the StackList and QueueList
 */
public class Driver {
    private static StackList<String> sList;
    private static QueueList qList;

    public static void main(String[] args) {
        sList = new StackList<>();
        sList.push("Bill");
        sList.push("Fred");
        sList.push("Joe");
        sList.push("Henrietta");
        sList.push("Mr. M");
        sList.push("Noman");

        System.out.println(sList.toString());

        qList = new QueueList();
        qList.enqueue("Bill");
        qList.enqueue("Fred");
        qList.enqueue("Joe");
        qList.enqueue("Henrietta");
        qList.enqueue("Mr. M");
        qList.enqueue("Noman");

        System.out.println(qList.toString());
    }
}
