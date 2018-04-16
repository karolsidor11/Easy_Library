package app;


public enum Option {
    EXIT(0, "Wyjście z programu"),
    ADD_BOOK(1, "Dodaj książkę"),
    ADD_MAGAZINE(2, "Dodaj magazyn/gazetę"),
    PRINT_BOOK(3, "Wyświetl dostepne książki"),
    PRINT_MAGAZINE(4, "Wyświetl dostępne magazyny/gazety"),
    PRINT_AUTHOR(5, "Wyświetl informacje o Autorze");


    private int value;
    private String description;

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    Option(int value, String description) {
        this.description = description;
        this.value = value;

    }

    @Override
    public String toString() {
        return value + " - " + description;
    }


    public static Option createFromINT(int option) {

        return Option.values()[option];

    }
}
