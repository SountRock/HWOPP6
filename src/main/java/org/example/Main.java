package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        System.out.println(ANSI_YELLOW + "green" + ANSI_RESET);
        System.out.println("standard");
        System.out.println(ANSI_RED + "red" + ANSI_RESET);

        printIndicator(24); // красный
        printIndicator(34); // желтый
        printIndicator(74); // желтый
        printIndicator(95); // зеленый
        printIndicator(100); // зеленый

        printIndicator(-5); // некорректно
        printIndicator(101); // некорректно
    }

    static void printIndicator(int value) {
        // TODO: код вписать тут
        List<ColorInterface> listColors = Arrays.asList(new Color("red", 0, 30, ANSI_RED), new Color("green", 76, 100, ANSI_GREEN), new Color("yellow", 31, 75, ANSI_YELLOW));

        ColorAnalizer colorAnalizer = new ColorAnalizer(listColors);

        System.out.println(colorAnalizer.analize(value) + ANSI_RESET);
    }

}