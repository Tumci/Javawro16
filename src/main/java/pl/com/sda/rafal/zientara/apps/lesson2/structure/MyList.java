package pl.com.sda.rafal.zientara.apps.lesson2.structure;

public class MyList<T extends Number> {

    private Element<T> head;
    private Element<T> tail;
    private int count = 0;

    public void add(T value) {
        Element<T> element = new Element<T>(value);
        if (isEmpty()) {
            //dodajemy pierwszy element!
            head = element;
            tail = element;
            count = 1;
        } else {
            element.prev = tail;
            tail.next = element;
            tail = element;
            count++;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Pusta lista!");
        } else if (head == tail) { //1 element
            head = null;
            tail = null;
            count = 0;
        } else {// wiecej niz 1 elementow
            tail = tail.prev;
            tail.next = null;
            count--;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Pusta lista!");
        } else if (head == tail) { //1 element
            head = null;
            tail = null;
            count = 0;
        } else {
            head = head.next;
            head.prev = null;
            count--;
        }
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("Pusta lista!");
        } else {
            Element currentElement = head;
            while (currentElement != null) {
                System.out.println(currentElement.data);
                currentElement = currentElement.next;
            }
        }
    }

    public void printInverted() {
        if (isEmpty()) {
            System.out.println("Pusta lista!");
        } else {
            Element currentElement = tail;
            while (currentElement != null) {
                System.out.println(currentElement.data);
                currentElement = currentElement.prev;
            }
        }
    }

    public boolean isEmpty() {
        return head == null || tail == null;
    }

    public int getCount() {
        return count;
    }

}
