package DSA;

public class StackUsingQueue {
    /*
        * Implement a Stack using two queues mainQueue and tempQueue.
        * There are two methods to do this
        * Modify push() or Modify pop()
     */
    Queue mainQueue = new Queue();
    Queue tempQueue = new Queue();

    void push(int data) {
        //mainQueue.enQueue(data);
        while (mainQueue.size != 0) {
            tempQueue.enQueue(mainQueue.deQueue());
        }
        mainQueue.enQueue(data);
        while (tempQueue.size != 0) {
            mainQueue.enQueue(tempQueue.deQueue());
        }
    }

    int pop() {
        // while (mainQueue.size != 1) {
        //     tempQueue.enQueue(mainQueue.deQueue());
        // }
        // int y = mainQueue.deQueue();
        // while (tempQueue.size != 0) {
        //     mainQueue.enQueue(tempQueue.deQueue());
        // }
        // return y;
        return mainQueue.deQueue();
    }

    void display() {
        mainQueue.display();
    }

//    public static void main(String[] args) {
//        //Test
//        StackUsingQueue sQueue = new StackUsingQueue();
//        sQueue.push(0);
//        sQueue.push(1);
//        sQueue.push(2);
//        sQueue.push(3);
//        sQueue.display();
//        System.out.println(sQueue.pop());
//        sQueue.display();
//        System.out.println(sQueue.pop());
//    }
}

class Queue {
    Node front = null;
    Node rear = null;
    int size = 0;

    void enQueue(int data) {
        Node n = new Node(data);
        if (front == null) {
            front = n;
            rear = n;
        } else {
            rear.next = n;
            rear = n;
        }
        size++;
    }

    int deQueue() {
        if (front == null) {
            return 401;
        } else {
            int y = front.data;
            Node temp = front;
            front = front.next;
            temp.next = null;
            size--;
            return y;
        }
    }

    void display() {
        if (front == null) {
            System.out.println("underflow");
        } else {
            Node temp = front;
            while (temp != rear) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.print(rear.data);
            System.out.println();
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
