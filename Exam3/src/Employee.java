public abstract class Employee extends Person {

    String department;
    double monthlySalary;
    String dateHired;

    Employee(String name, String address, String phoneNumber, String emailAddress, String department,
             double monthlySalary, String dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.department = department;
        this.monthlySalary = monthlySalary;
        this.dateHired = dateHired;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    public String getDateHired() {
        return this.dateHired;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Address: " + this.address + " Phone Number: " + this.phoneNumber
                + " Email Address: " + this.emailAddress + " Department: " + this.department +
                " Monthly Salary: " + this.monthlySalary + " Date Hired: " + this.dateHired;
    }
}
