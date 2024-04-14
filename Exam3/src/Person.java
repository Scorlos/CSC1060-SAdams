public class Person {
    String name;
    String address;
    String phoneNumber;
    String emailAddress;

    Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Address: " + this.address + " Phone Number: " + this.phoneNumber
                + " Email Address: " + this.emailAddress;
    }
}
