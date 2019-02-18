package pl.com.sda.rafal.zientara.apps.lesson2.structure;

import java.util.ArrayList;
import java.util.List;

public class MainMyList {

    public static void main(String[] args) {
        ArrayList<Object> javaList = new ArrayList<Object>();
        javaList.add(1);
        javaList.add("text");
        javaList.add(new Object());
        javaList.add(new MyList<Integer>());


        MyList<Float> list2 = new MyList<Float>();
//        MyList<String> list3 = new MyList<String>();//error
        //  sstring nie dziedziczy po Number
        MyList<Integer> list = new MyList<Integer>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(1);
//        list.add("text");

        list.printList();
        System.out.println("wow\n");
        list.removeLast();
        list.removeLast();
        list.removeFirst();
        list.printList();
    }
}
