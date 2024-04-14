public class Faculty extends Employee {
    String officeHours;
    String rank;

    Faculty(String name, String address, String phoneNumber, String emailAddress, String department,
            double monthlySalary, String dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return this.officeHours;
    }

    public String getRank() {
        return this.rank;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Address: " + this.address + " Phone Number: " + this.phoneNumber
                + " Email Address: " + this.emailAddress + " Department: " + this.department +
                " Monthly Salary: " + this.monthlySalary + " Date Hired: " + this.dateHired +
                " Office Hours: " + this.officeHours + " Rank: " + this.rank;
    }
}
