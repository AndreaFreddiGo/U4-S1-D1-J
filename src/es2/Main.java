package es2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        concatStrings();
    }

    public static void concatStrings() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la prima stringa:");
        String str1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa:");
        String str2 = scanner.nextLine();
        System.out.println("Inserisci la terza stringa:");
        String str3 = scanner.nextLine();

        System.out.println("Le stringhe concatenate sono: " + str1 + str2 + str3);
        System.out.println("Le stringhe concatenate al contrario sono: " + str3 + str2 + str1);

        scanner.close();
    }
}
