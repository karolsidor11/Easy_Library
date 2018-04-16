package utils;

import data.Books;
import data.Magazine;

import java.util.Scanner;

public class DataReader {

    private Scanner scanner;

    public DataReader() {
        scanner = new Scanner(System.in);
    }

    public void close() {
        scanner.close();
    }

    public int getInt() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public Books readAndCreateBook() {
        System.out.println("Tytuł:");
        String title = scanner.nextLine();
        System.out.println("Autor:");
        String author = scanner.nextLine();
        System.out.println("Data wydania:");
        int realiseData = scanner.nextInt();
        System.out.println("Liczba stron:");
        int pages = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wydawnicwo:");
        String publisher = scanner.nextLine();
        System.out.println("Numer ISBN:");
        String isbn = scanner.nextLine();

        return new Books(title, author, realiseData, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazie() {
        System.out.println("Tytuł:");
        String title = scanner.nextLine();
        System.out.println("Wydawnictowo:");
        String publisher = scanner.nextLine();
        System.out.println("Język:");
        String language = scanner.nextLine();
        System.out.println("Rok wydania:");
        int year = scanner.nextInt();
        System.out.println("Miesiąc:");
        int month = scanner.nextInt();
        System.out.println("Dzień:");
        int day = scanner.nextInt();

        return new Magazine(title, publisher, year, month, day, language);


    }

}
