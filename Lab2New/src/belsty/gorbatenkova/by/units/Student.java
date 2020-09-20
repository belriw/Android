package belsty.gorbatenkova.by.units;

import belsty.gorbatenkova.by.organization.Organization;

public class Student extends Person {
    private int mark;
    private Organization organization;
    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Student(String name, Integer age) {
        super.setName(name);
        super.setAge(age);
        mark = (int) (Math.random() * 10);
        organization = Organization.getRandomOrg();
    }
}
