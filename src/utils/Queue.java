package utils;

public class Queue {
    private Node head;
    private Node tail;

    public Queue() {
        this.head = this.tail = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);

        // If queue is empty
        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public int deque() {
        if (head == null) {
            return -1;
        }

        int data = head.val;
        head = head.next;

        // If the queue becomes empty
        if (head == null) {
            tail = null;
        }

        return data;
    }

    public int peek() {
        if(head == null) {
            return -1;
        }

        return head.val;
    }
}
