package pl.com.sda.rafal.zientara.apps.lesson2.structure;

public class Element {
    Element prev;
    Element next;

    public final Integer data;

    public Element(Integer data) {
        this.data = data;
    }
}
