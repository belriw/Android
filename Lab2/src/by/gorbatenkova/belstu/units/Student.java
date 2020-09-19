package by.gorbatenkova.belstu.units;

import gorbatenkova.fit.bstu.by.organization.Organization;

public class Student extends Person {
    private Organization studentFrom;

    public Student(String firstName, String lastName, int age, Organization studentFrom) {
        super(firstName, lastName, age);
        this.studentFrom = studentFrom;
        //Organization.incrementStudent(studentFrom);
        studentFrom.incrementStudent();
    }
}
