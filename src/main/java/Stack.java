import com.sun.security.jgss.GSSUtil;

import java.util.List;

public class Stack {
    private int[] array;
    private int top;
    private int capacity;

    Stack(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        array[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(12);
        stack.push(33);
        stack.push(25);

        System.out.println("Top element: " + stack.peek()); // peek at the top element
     System.out.println("Popping elements from the stack: ");
     while (!stack.isEmpty()) {
           System.out.println(stack.pop());
     }

    }
}