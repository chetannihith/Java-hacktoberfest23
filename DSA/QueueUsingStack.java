package DSA;

public class QueueUsingStack {
    /*
     * Implement a Stack using two queues mainStack and tempStack.
     * There are two methods to do this
     * Modify enqueue() or Modify deQueue()
     */
    Stack mainStack = new Stack();
    Stack tempStack = new Stack();

    void enQueue(int data) {
        // while (mainStack.size != 0) {
        // tempStack.push(mainStack.pop());
        // }
        // mainStack.push(data);
        // while (tempStack.size != 0) {
        // mainStack.push(tempStack.pop());
        // }
        mainStack.push(data);
    }

    int deQueue() {
        // return mainStack.pop();
        while (mainStack.size != 1) {
            tempStack.push(mainStack.pop());
        }
        int y = mainStack.pop();
        while (tempStack.size != 0) {
            mainStack.push(tempStack.pop());
        }
        return y;
    }

    void display() {
        mainStack.display();
    }

    /*
    //Test
    public static void main(String[] args) {
        QueueUsingStack qStack = new QueueUsingStack();
        qStack.enQueue(0);
        qStack.enQueue(1);
        qStack.enQueue(2);
        qStack.display();
        System.out.println(qStack.deQueue());
        qStack.display();
        qStack.enQueue(12);
        qStack.display();
        System.out.println(qStack.deQueue());
        qStack.display();
    }
     */
}

class Stack {
    Node top = null;
    int size = 0;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void push(int data) {
        Node n = new Node(data);
        if (top == null) {
            top = n;
        } else {
            n.next = top;
            top = n;
        }
        size++;
    }

    int pop() {
        if (top == null) {
            return 401;
        } else {
            int y = top.data;
            Node temp = top;
            top = top.next;
            temp.next = null;
            size--;
            return y;
        }
    }

    void display() {
        if (top == null) {
            System.out.println("underflow");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

}

class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
            stack.display();
        }
        for (int i = 0; i < 12; i++) {
            int y = stack.pop();
            System.out.println(y == 401 ? "Underflow" : y);
            stack.display();
        }
    }
}
