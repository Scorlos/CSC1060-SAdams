public class Student extends Person {

    String status;

    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Address: " + this.address + " Phone Number: " + this.phoneNumber
                + " Email Address: " + this.emailAddress + " Status: " + this.status;
    }
}
