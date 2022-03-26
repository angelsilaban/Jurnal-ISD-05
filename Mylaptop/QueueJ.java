package Mylaptop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueJ<E> {
    private Queue<E> queueList;
    public QueueJ() {
        queueList = new LinkedList<E>();
    }
    public void enqueue(E object) {
        queueList.add(object);
    }
    public E dequeue() throws NoSuchElementException {
        return queueList.remove();
    }
    public boolean isEmpty() {
        return queueList.isEmpty();
    }
    public void printQueue() {
        Iterator<E> iterator = queueList.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.println(value + " ");
        }
    }
}
