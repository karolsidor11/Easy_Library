package data;


public class Library {
    private static final int MAX_POUBLICATIONS = 2000;
    private Publication[] publications;
    private int publicationNumber;

    public int getPublicationNumber() {
        return publicationNumber;
    }

    public Publication[] getPublications() {
        return publications;
    }

    public Library() {
        publications = new Publication[MAX_POUBLICATIONS];

    }

    public void addBook(Books books) {
        addPublications(books);

    }

    public void addMagazine(Magazine magazine) {
        addPublications(magazine);

    }

    private void addPublications(Publication publication) {

        if (publicationNumber < MAX_POUBLICATIONS) {
            publications[publicationNumber] = publication;
            publicationNumber++;
        } else {
            System.out.println("Maksymalna liczba publikacji została osiagnięta");
        }
    }


//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < publicationNumber; i++) {
//            stringBuilder.append(publications[i]);
//            stringBuilder.append("\n");
//
//        }
//        return stringBuilder.toString();
//
//    }

    public void printBooks() {
        int countBooks = 0;
        for (int i = 0; i < MAX_POUBLICATIONS; i++) {
            if (publications[i] instanceof Books) {
                System.out.println(publications[i]);
                countBooks++;
            }
        }
        if (countBooks == 0) {
            System.out.println("Brak książek w bibliotece");
        }
    }


    public void printMagazine() {
        int countMagazine = 0;
        for (int j = 0; j < MAX_POUBLICATIONS; j++) {
            if (publications[j] instanceof Magazine) {
                System.out.println(publications[j]);
                countMagazine++;
            }
        }
        if (countMagazine == 0) {
            System.out.println("Brak magazynów/gazet w bibliotece");
        }
    }

}

