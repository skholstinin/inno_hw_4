package ru.innopolis.stc;


import java.util.ArrayList;
import java.util.List;

public class ObjectBox {

    List<Object> myListObject = new ArrayList<>();

    public ObjectBox(List<Object> array) {
        for (int i = 0; i < array.size(); i++) {
            myListObject.add(array);
        }
    }

    public void addObject(List<? extends Number> newobject) {
        try {
            myListObject.add(newobject);
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public int summator() {
        int sum = 0;
        for (int i = 0; i < myListObject.size(); i++) {
            try {
                sum += (int) myListObject.get(i);
            } catch (MyException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return sum;
    }

    public void searchAndRemoveItem(List<? extends Number> item) {
        try {
            myListObject.remove(item);
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List splitter(int divider) {
        List<Object> localList = new ArrayList<>();
        for (int i = 0; i < myListObject.size(); i++) {
            try {
                localList.add(i, myListObject.get(i));
            } catch (MyException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return localList;
    }
}
