
public class Book {
    private final String nameBooks;
    private final Author author;
    int manufacturerYear;
    //
    public Book(String nameBooks, Author author, int manufacturerYear) {
        this.nameBooks = nameBooks;
        this.author = author;
        this.manufacturerYear = manufacturerYear;
    }

    public String getNameBooks() {
        return nameBooks;
    }

    public Author getAuthor() {
        return author;
    }

    public int getManufacturerYear() {
        return manufacturerYear;
    }

    public void setManufacturerYear(int newManufacturerYear) {
        this.manufacturerYear = newManufacturerYear;
    }
}