import linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Linked List!");

        LinkedList<Integer> linkedList = new LinkedList<Integer>(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);

        linkedList.printFromBeginning();

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
