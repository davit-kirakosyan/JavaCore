package homework.exercise.stack;

import java.util.LinkedList;
import java.util.Queue;

public class Stack<T> {
    private final Queue<T> mainQueue;
    private final Queue<T> tempQueue;

    public Stack() {
        mainQueue = new LinkedList<>();
        tempQueue = new LinkedList<>();
    }

    public void push(T element) {
        while (!mainQueue.isEmpty()) {
            tempQueue.add(mainQueue.poll());
        }
        mainQueue.add(element);
        while (!tempQueue.isEmpty()) {
            mainQueue.add(tempQueue.poll());
        }
    }

    public T pop() {
        return mainQueue.poll();
    }

    public T peek() {
        return mainQueue.peek();
    }

    public boolean isEmpty() {
        return mainQueue.isEmpty();
    }

    public int size() {
        return mainQueue.size();
    }
}
