package by.gorbatenkova.belstu.educationmanager;

import by.gorbatenkova.belstu.PersonReader;
import by.gorbatenkova.belstu.exception.EduException;
import by.gorbatenkova.belstu.staff.Staff;
import by.gorbatenkova.belstu.units.Person;

public class Manager implements IAction {
    private Staff staff;
    @Override
    public Staff generateCourse(Staff someCourse, int maxStudent, int maxListener) {
        staff = someCourse;
        someCourse.setMaxAmountPersons(maxListener + maxStudent);
        return someCourse;
    }

    @Override
    public Staff generateCourse(Staff someCourse, int maxStudent, int maxListener, String fileName) throws EduException {
        staff = someCourse;
        someCourse.setMaxAmountPersons(maxListener + maxStudent);
        new PersonReader(fileName)
                .getListFromFile().forEach(person -> {
            try {
                this.staff.add(person);
            } catch (EduException e) {
                e.printStackTrace();
            }
        });
        return  someCourse;
    }

    private boolean add(Person person) throws EduException {
        if(staff.add(person)) {
            return true;
        }
        return false;
    }
    private boolean remove(Person person) throws EduException {
        if(staff.remove(person)) {
            return true;
        }

        return  false;
    }
}
