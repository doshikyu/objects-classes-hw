public class Main {
    public static void main(String[] args) {
        Author authorTurgenev = new Author("Ivan", "Turgenev");
        Author authorDoyle = new Author("Arthur Conan", "Doyle");

        Book book1 = new Book("Fathers and Sons", authorTurgenev, 1862);
        Book book2 = new Book("The Sign of the Four", authorDoyle, 1890);
        Book book3 = new Book("The Valley of Fear", authorDoyle); //1915

        book3.setPublishYear(1915);
    }
}