package Day3.dsa;

public class Stack {
    private int count;
    private String[] elements = new String[5];
    public boolean isEmpty() {
        return count == 0;
    }

    public void push(String element) {
        elements[count++] = element;
    }

    public String pop() {
        return elements[--count];
    }
}
