import java.util.ArrayList;

public class TestSchoolRecords {
    public static void main(String[] args) {
        ArrayList<Person> PersonList = new ArrayList<Person>();
        PersonList.add(new Student("Johnny", "0081 Lincoln Ave", "528-904-2856", "JLander408@gmail.com", "Freshman"));
        PersonList.add(new Student("Kate", "2831 Decoy Ave", "528-742-5398", "KSugar826@gmail.com", "Junior"));
        PersonList.add(new Faculty("Dave", "0081 Lincoln Ave", "528-904-2856", "DLander@gmail.com", "Mathematics",
                50000, "January 4th 2020", "MWF 2:00pm - 3:00pm", "Junior"));
        PersonList.add(new Faculty("Margaret", "2831 Decoy Ave", "528-742-5398", "MSugar@gmail.com", "Science",
                60000, "August 25th 2018", "TuTh 2:00pm - 3:00pm", "Senior"));
        PersonList.add(new Staff("Reuben", "Homeless", "N/A", "N/A", "Sanitation",
                20, "July 13th 2015", "Janitor"));
        PersonList.add(new Staff("Janice", "3780 Lakeside St", "528-089-9081", "JCarr@gmail.com", "Information Tech",
                40000, "June 11th 2019", "Computer Tech"));

        PersonList.forEach((n) -> System.out.println(n.toString()));

        ArrayList<Person> NewList = employeeList(PersonList);
        NewList.forEach((n) -> System.out.println(n.toString()));
    }

    public static ArrayList<Person> employeeList(ArrayList<Person> PersonList) {
        ArrayList<Person> PersonList2 = new ArrayList<Person>();
        for (Person check : PersonList) {
            boolean isEmployee = Employee.class.isAssignableFrom(check.getClass());
            if (isEmployee) {
                PersonList2.add(check);
            }
        }
        return PersonList2;
    }
}