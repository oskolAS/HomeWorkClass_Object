public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Александр Сергеевич", "Пушкин");
        Author author2 = new Author("Александр Сергеевич", "Грибоедов");
        Author author3 = new Author("Александр Сергеевич", "Пушкин");
        Book book1 = new Book("Евгений Онегин", author1, 2012);
        Book book2 = new Book("Горе от Ума", author2, 2001);
        Book book3 = new Book("Евгений Онегин", author1, 2012);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book1.equals(book3));
        System.out.println(book1.equals(book2));
        System.out.println(book2.equals(book3));
    }
}



