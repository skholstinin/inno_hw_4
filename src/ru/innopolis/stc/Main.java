package ru.innopolis.stc;

public class Main {
    public static void main(String[] args) {

        int intArray[] = {0, 1, 5, 6, 7, 89};
        MathBox mathBox = new MathBox(intArray);
        System.out.println(mathBox.summator());
    }
}
