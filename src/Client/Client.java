package Client;

public class Client {
    private String firstName;
    private String lastName;
    private LinkedListDefinition<Long> contactNo;
    private String emailAddress;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setContactNo(LinkedListDefinition<Long> contactNo) {
        this.contactNo = contactNo;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
