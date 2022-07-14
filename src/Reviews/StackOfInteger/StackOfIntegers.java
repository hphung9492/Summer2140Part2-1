package Reviews.StackOfInteger;

public class StackOfIntegers {

    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    //constructor of StackOfInteger.StackOfIntegers
    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    //constructor of StackOfInteger.StackOfIntegers
    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    //push a new integer to the top of the stack
    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    //return and remove the top element from the stack
    //check this site http://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/04/pre-post.html
    public int pop() {
        size = size - 1; //if you use size, it will give you index out of bounds exception in the array
        return elements[size]; //last element is going to be the returning value and remove that element from the stack
        // OR  return elements[--size];
    }

    //return the top element from the stack
    public int peek() {
        return elements[size - 1];
    }

    //test whether the stack is empty
    public boolean empty() {
        if (size == 0)
            return true;
        else return false;

        //or return size == 0;
    }

    public int getSize() {
        return size;
    }
}
