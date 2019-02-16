package pl.com.sda.rafal.zientara.apps.lesson2.structure;

public class MainMyList {

    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(new Element(1));
        list.add(new Element(2));
        list.add(new Element(4));
        list.add(new Element(1));

        list.printList();
        System.out.println("wow\n");
        list.removeLast();
        list.removeLast();
        list.removeFirst();
        list.printList();
    }
}
