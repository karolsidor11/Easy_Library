package app;

public class LibraryApp {
    private static final String Apps = "Biblioteka cyfrowa";

    public static void main(String[] args) {

        System.out.println(Apps);
        app.LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();


    }

}
