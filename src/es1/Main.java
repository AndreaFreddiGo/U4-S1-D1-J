package es1;

public class Main {
    public static void main(String[] args) {
        multiply(4, 6);
        concat("Ciao", 2020);
    }

    public static void multiply(int num1, int num2) {
        System.out.println("Il risultato della moltiplicazione è: " + num1 * num2);
    }

    public static void concat(String str, int num3) {
        System.out.println("Il risultato della concatenazione è: " + str + num3);
    }

    public static void insert(String str, int num3) {
        System.out.println("Il risultato della concatenazione è: " + str + num3);
    }

}

