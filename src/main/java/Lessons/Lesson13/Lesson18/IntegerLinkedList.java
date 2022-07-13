package Lessons.Lesson13.Lesson18;

import java.util.Arrays;

public class IntegerLinkedList {

    private IntNode head; //null
    private int size; // =0

    public void add(int value) {
        if (head == null) {
            this.head = new IntNode(value);
        } else {
            IntNode temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new IntNode(value));
        }
        size++;
    }

    public int size() {
        return size;
    }

    public String toString() {
        int[] result = new int[size];
        int index = 0;
        IntNode temp = head;
        while (temp != null) {
            result[index++] = temp.getValue(); //[index++] == index++;
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

    private static class IntNode {
        private IntNode next;
        private int value;

        public IntNode(int value) {
            this.value = value;
        }

        public IntNode getNext() {
            return next;
        }

        public void setNext(IntNode next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
