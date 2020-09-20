package by.gorbatenkova.belstu;

import by.gorbatenkova.belstu.educationmanager.Manager;
import by.gorbatenkova.belstu.exception.EduException;
import by.gorbatenkova.belstu.organization.Organization;
import by.gorbatenkova.belstu.staff.Staff;
import by.gorbatenkova.belstu.units.Person;
import by.gorbatenkova.belstu.units.Student;

public class Main {
    public static void main(String[] args) throws EduException {
        //Person person = new Student("Lera", "Gorbatenkova", (byte) 19, Organization.BSTU);
        //Person betterPerson = new Student("Dima", "Kazakevich", (byte) 20, Organization.BSTU);
        //System.out.println(person.toString());
        Staff javaDevelopers = new Staff();
        Manager manager = new Manager();
        //manager.generateCourse(javaDevelopers, 10, 10);
        //javaDevelopers.add(person);
        //javaDevelopers.add(betterPerson);
        System.out.println(Organization.BSTU.getAmountStudent());
        System.out.println(Organization.BNTU.getAmountStudent());
        manager.generateCourse(javaDevelopers, 10,10, "D:\\3kurs\\android\\app\\src\\main\\java\\gorbatenkova\\fit\\bstu\\by\\peoples.json");
        javaDevelopers.toString();
    }
}
