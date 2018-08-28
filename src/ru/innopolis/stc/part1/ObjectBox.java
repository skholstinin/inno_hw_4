package ru.innopolis.stc;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjectBox {

    private List<Object> myListObject = new ArrayList<Object>();

    public ObjectBox(ArrayList<? extends Object> inputParam) {
        myListObject.add(inputParam);

    }

    public void dump() {
        for (Iterator<Object> i = myListObject.iterator(); i.hasNext(); ) {
            Object item = i.next();
            System.out.println(item);
        }
    }

    public void addObject(List<? extends Object> newobject) {
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

    public void searchAndRemoveItem(List<? extends Object> item) {
        try {
            myListObject.remove(item);
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList splitter(int divider) {
        ArrayList<Object> localList = new ArrayList<>();
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
