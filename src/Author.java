import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;
    //
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }





    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString() {
        return  this.firstName + " " + this.lastName;
    }

    @Override
    public boolean equals(Object obj) {
        Author author = (Author) obj;
        if (this == obj) return true;
       else if (this.firstName == author.getFirstName() && this.lastName == author.getLastName() )
            return true;
        else return false;
            }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}