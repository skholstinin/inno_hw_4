package ru.innopolis.stc.part1;

import java.util.ArrayList;
import java.util.List;

public class ObjectBox {

    List<Object> myListObject = new ArrayList<>();

    public ObjectBox(List<Integer> array[]) {
        for (int i = 0; i < array.length; i++) {
            myListObject.add(array[i]);
        }

    }

    public void addObject(List<? extends Number> newobject) {
        myListObject.add(newobject);

    }

    public int summator() {
        int sum = 0;
        for (int i = 0; i < myListObject.size(); i++) {
            try {
                sum += (int) myListObject.get(i);
            } catch (ClassCastException e) {

                System.out.println("Error ClassCastException");
            }
        }
        return sum;
    }

    public void searchAndRemoveItem(Integer item) {
        myListObject.remove(item);
    }

    public List splitter(int divider) {
        //List<Integer> ArrayList = new ArrayList<Integer>(numberTreeSet);
        List<Number> localList = new ArrayList<Number>();
        for (int i = 0; i < myListObject.size(); i++) {
            localList.add(i, (int) myListObject.get(i) / divider);
        }
        return localList;
    }
}
