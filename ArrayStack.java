import java.util.*;

public class ArrayStack {
    public char[] stack;
    public int capacity;
    protected int top = -1;

    public ArrayStack(int len) {
        capacity = len;
        stack = new char[len];
    }

    public int size() {
        return (top + 1);
    }

    public void push(char data) {
        if (isFull())
            System.out.println("Stack is Overflow. Not possible to insert in Full stack");
        else
            stack[++top] = data;
    }

    public void pop() {
        char data = '0';
        if (isEmpty()) {
            System.out.println("Stack is Underflow. No elements to be popped in Empty Stack");
        } else {
            data = stack[top];
            top--;
        }
        System.out.print(data);
    }

    public boolean isFull() {
        return (size() == capacity);
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public void display() {
        if (isEmpty())
            System.out.println("Stack is Underflow. No elements to display in Empty Stack");
        else {
            System.out.println("Stack Elements");
            for (int i = top; i >= 0; i--)
                System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse:");
        String str = sc.nextLine();
        // TYPE YOUR CODE HERE
        ArrayStack stack = new ArrayStack(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        System.out.println("Reversed string:");
        for (int i = 0; i < str.length(); i++) {
            stack.pop();
        }
        System.out.println(); // Add a newline for better formatting.
        sc.close(); // Close the scanner to prevent resource leaks.
    }
}

