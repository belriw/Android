package by.gorbatenkova.belstu.units;


public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected int age;

    public Person (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    };

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + " " + age;
    }
}
