package ru.innopolis.stc;


import java.util.ArrayList;
import java.util.List;

public class ObjectBox {

    private ArrayList<Number> myListObject = new ArrayList<>();

    public ObjectBox(ArrayList<? extends Number> inputParam) {
        myListObject.addAll(inputParam);

    }

    public void dump() {
        for (Number n : myListObject) {
            System.out.println(n);
        }
    }

    public void addObject(ArrayList<? extends Number> newobject) {
        try {
            myListObject.addAll(newobject);
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public int summator() {
        int sum = 0;
        for (Number n : myListObject) {
            if (n instanceof Integer) {
                sum += n.intValue();
            } else {
                MyException ex = new MyException("Error parametr");
                System.out.println(ex.getMessage());
            }
            }
        return sum;
    }

    public void searchAndRemoveItem(List<? extends Number> item) {
        try {
            myListObject.remove(item);
        } catch (MyException e) {
            e = new MyException("Error");
            System.out.println(e.getMessage());
        }
    }

    public List splitter(int divider) {
        ArrayList<Number> localList = new ArrayList();
        for (Number n : myListObject) {
            localList.add(n.intValue() / divider);
            System.out.println(localList);
        }
        return localList;
    }
}
