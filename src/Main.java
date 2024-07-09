public class Main {
    public static void main(String[] args) {
        Author authorTurgenev = new Author("Ivan", "Turgenev");
        Author authorDoyle = new Author("Arthur Conan", "Doyle");

        Book book1 = new Book("Fathers and Sons", authorTurgenev, 1862);
        Book book2 = new Book("The Sign of the Four", authorDoyle, 1890);
        Book book3 = new Book("The Valley of Fear", authorDoyle); //1915

        book3.setPublishYear(1915);

        Book bookTestMethods = new Book("The Sign of the Four", authorDoyle);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(bookTestMethods);
        System.out.println("Are book1 and test the same? - " + book1.equals(bookTestMethods));
        System.out.println("Are book2 and test the same? - " + book2.equals(bookTestMethods));

        System.out.println("book1 name hashCode: " + book1.hashCode());

        //Book nullBook = new Book(null, null);
        System.out.println("Are book2 and null the same? - " + book2.equals(null));
    }
}