package by.gorbatenkova.belstu.educationmanager;

import by.gorbatenkova.belstu.exception.EduException;
import by.gorbatenkova.belstu.staff.Staff;

public interface IAction {
    public Staff generateCourse(Staff someCourse, int maxStudent, int maxListener);
    public Staff generateCourse(Staff someCourse, int maxStudent, int maxListener, String fileName) throws EduException;
}
