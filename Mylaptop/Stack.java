package Mylaptop;

public class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int max) {
        maxSize = max;
        stackArray = new char[maxSize];
        top = 0;
    }

    public void push(char a) {
        stackArray[++top] = a;
    }

    public char pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == 0);
    }
}
