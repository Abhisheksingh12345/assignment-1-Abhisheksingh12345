package Client;

public class Client {
    private String firstName;
    private String lastName;
    private LinkedListDefinition<Long> contactNo;
    private String emailAddress;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LinkedListDefinition<Long> getContactNo() {
        return contactNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

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
