package homework.exercise.stack;

import java.util.LinkedList;
import java.util.Queue;


public class MyStack<T> {

    //Implement the Stack methods using only two Queue objects
    private Queue<T> mainQueue;
    private Queue<T> tempQueue;

    MyStack() {
        mainQueue = new LinkedList<>();
        tempQueue = new LinkedList<>();
    }

    public T push(T element) {
        mainQueue.add(element);
        return element;
    }

    public T pop() {
        if (mainQueue.isEmpty()){
            return null;
        }
        while (mainQueue.size() > 1){
            tempQueue.add(mainQueue.remove());
        }
        T remove = mainQueue.remove();
        Queue<T> temp = mainQueue;
        mainQueue = tempQueue;
        tempQueue = temp;

        return remove;
    }
    public T peek() {
        if (mainQueue.isEmpty()){
            return null;
        }
        while (mainQueue.size() > 1){
            tempQueue.add(mainQueue.remove());
        }
        T peek = mainQueue.peek();
        Queue<T> temp = mainQueue;
        mainQueue = tempQueue;
        tempQueue = temp;

        return peek;
    }

    public boolean isEmpty() {
        return mainQueue.isEmpty();
    }

    public int size() {
        return mainQueue.size();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());


    }
}
