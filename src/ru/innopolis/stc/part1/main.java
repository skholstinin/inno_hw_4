package ru.innopolis.stc.part1;

import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<Double> doublesList = new ArrayList<Double>();
        for (int i = 0; i < 100; i++) {
            intList.add(random.nextInt(100));
            doublesList.add(random.nextDouble());
        }
        MathObject mathObject = new MathObject(intList);
        MathObject mathObject1 = new MathObject(doublesList);
        mathObject.dump();
        mathObject1.dump();

    }
}
