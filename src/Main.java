public class Main {

//

    public static void main(String[] args) {

        Author author = new Author("Лев", "Толстой");
        Author author1 = new Author("Александр", "Пушкин");
        Book book = new Book("Война и Мир ", author, 1973);
        Book book1 = new Book("Евгений Онегин", author1, 2012);
        System.out.println("Название книги - " + book.getNameBooks() + ", Автор - " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() + ", Год публикации - " + book.getManufacturerYear());
        book.setManufacturerYear(2000);
        System.out.println("Год публикации - " + book.getManufacturerYear());

        System.out.println("Название книги - " + book1.getNameBooks() + ", Автор - " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Год публикации - " + book1.getManufacturerYear());
        book1.setManufacturerYear(2022);
        System.out.println("Год публикации - " + book1.getManufacturerYear());

            }
}
