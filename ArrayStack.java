import java.util.*;

public class ArrayStack {
    private char[] stack;
    private int capacity;
    private int top = -1;

    
    public ArrayStack(int len) {
        capacity = len;
        stack = new char[len];
    }

    // Task 4: Create a Function "Size"
    public int size() {
        return (top + 1);
    }

    // Task 5: Create the Push Function
    public void push(char data) {
        if (isFull()) {
            System.out.println("Stack is Overflow. Not possible to insert in Full stack");
        } else {
            stack[++top] = data;
            System.out.println("Element is inserted in the stack using Push");
        }
    }

    // Task 6: Create the Pop Function
    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is Underflow. No elements to be popped in Empty Stack");
            return '\0'; // Return null character if stack is empty
        } else {
            return stack[top--];
        }
    }

    // Task 7: Create the isFull Function
    public boolean isFull() {
        return (size() == capacity);
    }

    // Task 8: Create the isEmpty Function
    public boolean isEmpty() {
        return (top < 0);
    }

    // Task 9: Create the Display Function
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Underflow. No elements to display in Empty Stack");
        } else {
            System.out.println("Stack Elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    // Main Function to Reverse a String
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse:");
        String str = sc.nextLine();

        // Create an ArrayStack with a size equal to the length of the input string
        ArrayStack stack = new ArrayStack(str.length());
    }}

        // Push all