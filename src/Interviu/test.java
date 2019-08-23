package Interviu;

import java.util.EmptyStackException;
import java.util.TreeMap;

public class test {

    public static void main(String args[]){
        Stack stack = new Stack(100);
        Runtime runtime = Runtime.getRuntime();

        for (int i = 0; i < 100; i++) { // fill the stack
            stack.push("a large, large, large, large, string " + i);
        }
        for (int i = 0; i < 100; i++) { // empty the stack
            System.out.println(stack.pop());
        }

    }

    static class Stack {

        // keep these two fields as they​​​​​​‌​​​‌​​​​‌‌​​‌‌​​​​​​‌‌‌‌ are
        private Object[] elements;
        private int size = 0;

        public Stack(int initialCapacity) {
            elements = new Object[initialCapacity];
        }

        public void push(Object object) {
            ensureCapacity();
            elements[size++] = object;
        }

        public Object pop() {
            if (size == 0) {
                throw new EmptyStackException();
            }

            return elements[--size];
        }

        private void ensureCapacity() {
            if (elements.length == size) {
                Object[] old = elements;
                elements = new Object[2 * size + 1];
                System.arraycopy(old, 0, elements, 0, size);
            }
        }
    }
}
