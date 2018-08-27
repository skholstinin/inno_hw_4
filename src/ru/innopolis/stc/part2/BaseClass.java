package ru.innopolis.stc.part2;

import java.util.Iterator;
import java.util.List;

public class BaseClass<T> {
    List<T> param;

    public BaseClass(List<T> param) {
        this.param = param;
    }

    public void addObject(T newObject) {
        param.add(newObject);
    }

    public void deleteObject(T delParam) {
        param.remove(delParam);
    }

    public void dump() {
        for (Iterator<T> i = param.iterator(); i.hasNext(); ) {
            Object item = i.next();
            System.out.println(item);
        }
    }

}
