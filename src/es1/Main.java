package es1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        multiply(4, 6);
        concat("Ciao", 2020);
        String[] array = {"a", "b", "c", "d", "e"};
        insert(array, "f");
    }

    public static void multiply(int num1, int num2) {
        System.out.println("Il risultato della moltiplicazione è: " + num1 * num2);
    }

    public static void concat(String str, int num3) {
        System.out.println("Il risultato della concatenazione è: " + str + num3);
    }

    public static void insert(String[] stringArray, String str) {
        String[] newArray = {stringArray[0], stringArray[1], stringArray[2], str, stringArray[3], stringArray[4]};
        System.out.println("Il nuovo array è: " + Arrays.toString(newArray));
    }

}

