import linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Linked List!");

        LinkedList<Integer> linkedList = new LinkedList<Integer>(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);

        System.out.println("\nPrinting from the start: ");
        linkedList.printFromBeginning();

        System.out.println("\nPrinting from the end: ");

        linkedList.printFromEnd();

        System.out.println("\nRemoving the last elements: ");

        linkedList.pop();
        linkedList.printFromBeginning();
        System.out.println("\nRemoving one more element: ");
        linkedList.pop();
        linkedList.printFromBeginning();
        System.out.println("\nRemoving one more element: ");
        linkedList.pop();
        linkedList.printFromBeginning();
    }
}
