package Stack;

import utils.Node;

public class MinStack {

    public static void main(String[] args){

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println("getMin(): " + minStack.getMin()); // return -3

        minStack.pop();

        System.out.println("top(): " + minStack.top()); // return 0
        System.out.println("getMin(): " + minStack.getMin()); // return -2
    }

    private Node head;

    public MinStack() {
        this.head = null;
    }

    public void push(int val) {
        Node newNode = new Node(val);

        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        if(head == null) {
            return;
        }

        head = head.next;
    }

    public int top() {
        if(head == null) {
            return -1;
        }

        return head.val;
    }

    public int getMin() {
        if(head == null) {
            return -1;
        }

        int minVal = Integer.MAX_VALUE;
        Node current = head;

        while(current != null) {
            if(current.val < minVal) {
                minVal = current.val;
            }
            current = current.next;
        }

        return minVal;
    }
}
