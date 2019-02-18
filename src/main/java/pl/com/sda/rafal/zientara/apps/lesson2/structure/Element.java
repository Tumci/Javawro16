package pl.com.sda.rafal.zientara.apps.lesson2.structure;

public class Element<V> {
    Element prev;
    Element next;

    public final V data;

    public Element(V data) {
        this.data = data;
    }
}
