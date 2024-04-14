public class Staff extends Employee {
    String title;

    Staff(String name, String address, String phoneNumber, String emailAddress, String department,
          double monthlySalary, String dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Address: " + this.address + " Phone Number: " + this.phoneNumber
                + " Email Address: " + this.emailAddress + " Department: " + this.department +
                " Monthly Salary: " + this.monthlySalary + " Date Hired: " + this.dateHired +
                " Title: " + this.title;
    }
}
