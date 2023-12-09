package homework.homework04;

import java.util.LinkedList;

class MyQueue<T> {
    LinkedList<T> list = new LinkedList<>();

    public void enqueue(T element) {
        list.addLast(element);
    }

    public void dequeue() {
        list.pollFirst();
    }

    public T first() {
        return list.getFirst();
    }

    public LinkedList<T> getElements() {
        return list;
    }
}


public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(5);

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}