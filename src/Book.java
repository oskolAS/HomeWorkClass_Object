import java.util.Objects;

public class Book {
    private final String nameBooks;
    private final Author author;
    private int manufacturerYear;

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

    @Override
   public String toString() {
        return "Название книги - " + this.nameBooks + ", Автор - " + this.author + " , Год публикации - " + this.manufacturerYear;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        if (this == obj) return true;
        else if (this.nameBooks == book.getNameBooks() && (this.author.equals(book.getAuthor())) && this.manufacturerYear == book.getManufacturerYear())
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBooks, author, manufacturerYear);
    }
}