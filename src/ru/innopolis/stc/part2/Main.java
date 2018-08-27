package ru.innopolis.stc.part2;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("FistName");
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(25);

        BaseClass<Integer> integerClass = new BaseClass<>(integerList);
        integerClass.addObject(36);
        integerClass.addObject(39);
        integerClass.dump();
        System.out.println("Delete object");
        integerClass.deleteObject(36);
        integerClass.dump();

        BaseClass<String> stringClass = new BaseClass<>(stringList);
        stringClass.addObject("LastName");
        stringClass.addObject("MiddleName");
        stringClass.dump();
        System.out.println("Delete object");
        stringClass.deleteObject("LastName");
        stringClass.dump();
    }
}
