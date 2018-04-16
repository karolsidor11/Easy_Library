package utils;


import data.Books;
import data.Library;
import data.Magazine;
import data.Publication;

public class LibraryUtils {

    public static void printBooks(Library lib) {
        Publication[] publication = lib.getPublications();
        int publicationNumber = lib.getPublicationNumber();
        int countBooks = 0;
        for (int i = 0; i < publicationNumber; i++) {
            if (publication[i] instanceof Books) {
                System.out.println(publication[i]);
                countBooks++;
            }
        }
        if (countBooks==0){
            System.out.println("Brak książek w bibliotece");
        }
    }

    public static void printMagazines (Library lib){
        Publication []publications = lib.getPublications();
        int numberPublications = lib.getPublicationNumber();
        int countMagazines = 0;
        for ( int j= 0; j<numberPublications; j++){
            if ( publications[j]instanceof Magazine){
                System.out.println(publications[j]);;
                countMagazines++;
            }
        }
        if (countMagazines==0 ){
            System.out.println("Brak magazynów/gazet w bibliotece");
        }
    }
}
