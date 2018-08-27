package ru.innopolis.stc.part1;

import ru.innopolis.stc.MathBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            myList.add(random.nextInt(100));
        }
        MathBox mathObject = new MathObject(myList);
        mathObject.dump();
    }
}
