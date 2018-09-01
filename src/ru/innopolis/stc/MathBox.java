package ru.innopolis.stc;

import java.util.*;

public class MathBox {

    private final SortedSet<Integer> numberTreeSet = new TreeSet<>();


    public MathBox(ArrayList<Integer> array) {//конструктор для TreeSet
        numberTreeSet.addAll(array);//TreeSet добавит в себя только уникальные значения и отсортирует их
    }

    public void dump() {
        for (Integer item : numberTreeSet) {
            System.out.println(item);
        }
    }

    public void addItem(Integer item) {
        numberTreeSet.add(item);
    }


    public int summator() {
        Iterator<Integer> iterator = numberTreeSet.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }

    public void bubleSort(int arr[]) {//только для конструктора с ArrayList внутри
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public void searchAndRemoveItem(Integer item) {
        numberTreeSet.remove(item);
    }

    public List splitter(int divider) {
        ArrayList<Integer> localList = new ArrayList();
        for (Integer s : numberTreeSet) {
            localList.add(s / divider);
            System.out.println(localList);
        }
        return localList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return Objects.equals(numberTreeSet, mathBox.numberTreeSet);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "MathBox{" +
                ", myTreeSet=" + numberTreeSet +
                '}';
    }
}