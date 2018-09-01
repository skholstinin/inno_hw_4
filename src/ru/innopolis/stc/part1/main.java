package ru.innopolis.stc.part1;

import ru.innopolis.stc.MyException;

import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Double> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add((double) random.nextInt());
        }
        ArrayList<String> strList = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            strList.add(random.toString());
        }
        try {
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
        MathObjectBox mathObjectBox = new MathObjectBox(intList);

        System.out.println(mathObjectBox.summator());
        mathObjectBox.dump();
    }
}
