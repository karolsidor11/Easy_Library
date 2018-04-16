package app;

// klasa sterujaca programem


import data.Books;
import data.Library;
import data.Magazine;
import utils.DataReader;

public class LibraryControl {

//     komunikacja z użytkownikiem

    private DataReader dataReader;

    //     przechowywanie danych
    private Library library;

    //    Konstruktor klasy sterujacej
    public LibraryControl() {
        dataReader = new DataReader();
        library = new Library();
    }

    public void controlLoop() {
        Option option;
        printOption();
        while ((option = Option.createFromINT(dataReader.getInt())) != Option.EXIT) {

            switch (option) {
                case ADD_BOOK:
                    addBook();
                    printOption();
                    break;
                case PRINT_BOOK:
                    printBooks();
                    printOption();
                    break;
                case ADD_MAGAZINE:
                    addMagazines();
                    printOption();
                    break;
                case PRINT_MAGAZINE:
                    printMagazine();
                    printOption();
                    break;
                case PRINT_AUTHOR:
                    System.out.println("Autor aplikacji: Karol Sidor");
                    printOption();
                    break;
                default:
                    System.out.println(" Nie ma takiej opcji");
                    break;
            }

        }
        dataReader.close();

    }


    private void printBooks() {
        library.printBooks();
    }

    private void addBook() {
        Books book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printMagazine() {
        library.printMagazine();

    }

    private void addMagazines() {
        Magazine magazine = dataReader.readAndCreateMagazie();
        library.addMagazine(magazine);
    }


    private void printOption() {
        System.out.println("Wybierz opcje:");
        for (Option o : Option.values()) {
            System.out.println(o);

        }
    }


}
