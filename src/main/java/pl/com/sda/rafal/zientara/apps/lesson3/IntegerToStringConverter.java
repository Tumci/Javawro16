package pl.com.sda.rafal.zientara.apps.lesson3;

import java.util.ArrayList;
import java.util.List;

public class IntegerToStringConverter
        extends Process<Integer, String> {

    public IntegerToStringConverter(Integer data) {
        super(data);
    }

    public String execute() {

        Integer i = 5;

        List<Integer> list = new ArrayList<Integer>();
        list.add(6);

        return data.toString();
    }
}
