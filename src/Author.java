public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Author authorToCheck = (Author) obj;
        return name.equals(authorToCheck.name) && surname.equals(authorToCheck.surname);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

}
