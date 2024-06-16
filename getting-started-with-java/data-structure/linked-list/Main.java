import linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Linked List!");

        LinkedList<Integer> linkedList = new LinkedList<>(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);

        System.out.println(
                "\nPrinting from the start, there is " + linkedList.getLength() + " elements in the linked list: ");
        linkedList.printFromBeginning();

        System.out.println("\nPrinting from the end: ");

        linkedList.printFromEnd();

        System.out.println("\nRemoving the last elements: ");

        linkedList.pop();
        linkedList.printFromBeginning();
        linkedList.pop();
        System.out.println("\nRemoving one more element " + linkedList.getLength() + " elements in the linked list: ");
        linkedList.printFromBeginning();
        linkedList.pop();
        System.out.println("\nRemoving one more element " + linkedList.getLength() + " elements in the linked list:");
        linkedList.printFromBeginning();

        linkedList.makeEmpty();

        System.out.println("\nLinked list is empty: " + linkedList.isEmpty() + " and has " + linkedList.getLength()
                + " elements in the linked list: ");

        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);
        linkedList.append(50);
        linkedList.append(60);

        System.out.println(
                "\nPrinting from the start, there is " + linkedList.getLength() + " elements in the linked list: ");
        linkedList.printFromBeginning();

        System.out.println("\nRemoving the first element: ");
        linkedList.deleteHead();
        linkedList.printFromBeginning();

        System.out.println("\nRemoving the element at index 3: ");

        linkedList.deleteFromPosition(3);

        linkedList.printFromBeginning();
    }
}
