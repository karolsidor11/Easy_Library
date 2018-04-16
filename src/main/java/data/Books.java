package data;

public class Books extends Publication {
    private String author;
    private int pages;
    private String isbn;


    public String getauthor() {
        return author;

    }

    public void setauthor(String author) {
        this.author = author;

    }

    public int getpages() {
        return pages;
    }

    public void setpages(int pages) {
        this.pages = pages;

    }

    public String getisbn() {
        return isbn;

    }

    public void setisbn(String isbn) {
        this.isbn = isbn;

    }

    public Books(String title, String author, int year, int pages, String publisher, String isbn) {
        super(year, title, publisher);
        this.setAuthor(author);
        this.setpages(pages);
        this.setisbn(isbn);

    }
//
//    public void printShow() {
//        String show = getTitle() + " " + getauthor() + " " + getYear() + " " + getpages() + " " + getpublisher() + " " + getisbn();
//        System.out.println(show);
//
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Books books = (Books) o;

        if (pages != books.pages) return false;
        if (author != null ? !author.equals(books.author) : books.author != null) return false;
        return isbn != null ? isbn.equals(books.isbn) : books.isbn == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + pages;
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder print = new StringBuilder(32);
        print.append(getTitle());
        print.append(";");
        print.append(getAuthor());
        print.append(";");
        print.append(getYear());
        print.append(";");
        print.append(getpages());
        print.append(";");
        print.append(getpublisher());
        print.append(";");
        print.append(getisbn());
        return print.toString();

    }
}
