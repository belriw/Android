package by.gorbatenkova.belstu.units;

import by.gorbatenkova.belstu.organization.Organization;

public class Student extends Person {
    private int mark;
    private Organization studentFrom;
    public int getMark() {
        return mark;
    }

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.studentFrom = Organization.getRandom();;
        mark = (int) (Math.random() * 10);
        //studentFrom.incrementStudent();
    }
}
