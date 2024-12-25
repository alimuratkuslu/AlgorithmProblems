package utils;

public class Stack {

    private Node head;

    public Stack() {
        this.head = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if (head == null) {
            return -1;
        }

        int data = head.val;
        head = head.next;

        return data;
    }

    public int peek() {
        if (head == null) {
            return -1;
        }

        return head.val;
    }
}
