package es3;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        perimetroRettangolo();
        pariDispari();
        perimetroTriangolo();
    }

    public static void perimetroRettangolo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo lato del rettangolo: ");
        int lato1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il secondo lato del rettangolo: ");
        int lato2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Il perimetro del rettangolo è: " + (lato1 + lato2) * 2);
    }

    public static void pariDispari() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        System.out.println(Integer.parseInt(scanner.nextLine()) % 2);
    }

    public static void perimetroTriangolo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo lato del triangolo: ");
        int lato1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il secondo lato del triangolo: ");
        int lato2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il terzo lato del triangolo: ");
        int lato3 = Integer.parseInt(scanner.nextLine());
        int perimetro = lato1 + lato2 + lato3;
        int area = (int) sqrt(perimetro * (perimetro - lato1) * (perimetro - lato2) * (perimetro - lato3));
        System.out.println("L'area del triangolo è: " + area);
    }
}
