package by.gorbatenkova.belstu.educationmanager;

import gorbatenkova.fit.bstu.by.staff.Staff;

public class Manager {
//    public Staff createGroup(Staff someGroup, int maxStudent, int maxListener, String filename) {
//
//    }

    public Staff generateCourse(Staff someCourse, int maxStudent, int maxListener) {
        someCourse.setMaxPersonsCount(maxListener + maxStudent);
        return  someCourse;
    }
}
