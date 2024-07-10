public class Book {
    private final String name;
    private final Author author;
    private int publishYear;

    public Book(String name, Author author, int publishYear) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
        this.publishYear = 0;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, author);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Book bookToCheck = (Book) obj;
        return name.equals(bookToCheck.name) && author.equals(bookToCheck.author);
    }

    @Override
    public String toString() {
        String publishYearStr = (publishYear != 0) ? String.valueOf(publishYear) : "-";
        return "Book Information: " + name + ", " + author + ", " + publishYearStr;
    }
}
