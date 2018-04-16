package data;

public class Publication {
    private int year;
    private String title;
    private String author;
    private String publisher;


    int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;

    }

    String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getpublisher() {
        return publisher;

    }

    private void setpublisher(String publisher) {
        this.publisher = publisher;
    }

    protected Publication(int year, String title, String publisher) {
        setYear(year);
        setTitle(title);
        setpublisher(publisher);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publication that = (Publication) o;

        if (year != that.year) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        return publisher != null ? publisher.equals(that.publisher) : that.publisher == null;
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        return result;
    }
}


