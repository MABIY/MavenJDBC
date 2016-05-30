package hello;

/**
 * Created by liuhua on 16-5-29.
 */
public class Customer {
    private long id;
    private String firstName,lastName;

    public Customer(long id,String firstName,String lastName) {
        this.id = id ;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%1$s,firstName='%2$s',lastName='%3$s']",id,firstName,lastName);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
