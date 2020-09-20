package belsty.gorbatenkova.by.educationManager;

import belsty.gorbatenkova.by.Exeption.EduException;
import belsty.gorbatenkova.by.units.Person;

public interface IAction {
    void createCourse(String name);
    void addPersonToCourse(String CourseName, Person person) throws EduException;
    static Manager getManager(){
        Manager manager = new Manager();
        return manager;
    }
    default void defaultMethod() {
        System.out.println("default method");
    }

}
