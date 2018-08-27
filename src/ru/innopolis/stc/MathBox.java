package ru.innopolis.stc;

import java.util.*;

public class MathBox {

    private final SortedSet<Integer> numberTreeSet = new TreeSet<>();


    public MathBox(int array[]) {//конструктор для TreeSet

        for (int i = 0; i < array.length; i++) {
            numberTreeSet.add(array[i]);//TreeSet добавит в себя только уникальные значения и отсортирует их
        }
    }

    public int summator() {

        //Поэтому приводим его к ArrayList.
        int sum = 0;
        for (int i = 0; i < numberTreeSet.toArray().length; i++) {
            sum += (int) numberTreeSet.toArray()[i];
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
        List<Integer> ArrayList = new ArrayList<Integer>(numberTreeSet);
        List localList = new ArrayList();
        for (int i = 0; i < ArrayList.size(); i++) {
            localList.add(i, (int) ArrayList.get(i) / divider);
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