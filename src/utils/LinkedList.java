package utils;

public class LinkedList {

    private Node head;

    // TODO: Implement insertAt(data, index)
    // TODO: Implement removeAt(index)
    // TODO: Implement prepend(data)

    public void add(int data) {
        // Create the Node
        Node newNode = new Node(data);

        // Check if head is null
        if(head == null) {
            head = newNode;
        } else {
            Node current = head;
            // Traverse to the end of the list
            while(current.next != null) {
                current = current.next;
            }

            // Attach the newNode to last element
            current.next = newNode;
        }
    }

    public void printList() {
        Node current = head;

        while(current.next != null) {
            System.out.print(current.val + " ->");
            current = current.next;
        }

        System.out.println("null");
    }

    public void remove(int data) {
        if (head == null) return;
        // Remove head
        if (head.val == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null && current.next.val != data) {
            current = current.next;
        }

        // Found the data to be removed
        if(current.next != null) {
            current.next = current.next.next;
        }
    }

    public boolean find(int data) {
        Node current = head;
        while(current != null) {
            if(current.val == data) {
                return true;
            }

            current = current.next;
        }

        return false;
    }
}
