package Lessons.Lesson13.Lesson18.Materials;

import java.util.Arrays;

public class NewLinkedList {
    private Node head;
    private int size;

    public void add(int value) {
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    public String toString() {
        int[] result = new int[size];
        int index = 0;
        Node temp = head;
        while (temp != null) {
            result[index++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

    private static class Node {
        private Node next; //ссылка на следующий узел
        private int value; //значение

        public Node(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
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
