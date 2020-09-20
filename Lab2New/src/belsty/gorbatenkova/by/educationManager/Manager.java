package belsty.gorbatenkova.by.educationManager;

import belsty.gorbatenkova.by.Courses.Staff;
import belsty.gorbatenkova.by.Exeption.EduException;
import belsty.gorbatenkova.by.PersonReader;
import belsty.gorbatenkova.by.units.Person;
import belsty.gorbatenkova.by.units.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

import static java.lang.String.format;


public class Manager implements IAction {
    private static final Logger log = Logger.getLogger(Manager.class.getName());
    private final List<Staff> Staff = new ArrayList<>();

    @Override
    public void createCourse(String name) {
        Staff.add(new Staff(name));
        log.info("Создан курс");
    }

    public void addPersonToCourse(String CourseName, Person person) throws EduException {
        findCourseByName(CourseName).getStudentsList().add(person);
        log.info("Участник добавлен на курс");
    }

    public void PrintAllCourses() {
        if (Staff.stream().count() > 0) {
            for (Staff m : Staff) {
                System.out.println(m.getStaffName());
            }
        } else {
            System.out.println("Не создано еще ни одного курса");
        }
    }


    public Staff findCourseByName(String CourseName) throws EduException {
        return Staff.stream().filter(it -> it.getStaffName().equals(CourseName))
                .findFirst().orElseThrow(() -> new EduException(format("Курс с именем %s не найден.", CourseName)));
    }

    public void PrinfAllMembersOfCours(String coursName) throws EduException {

        for (Person wow : findCourseByName(coursName).getStudentsList()
        ) {
            System.out.println(wow.getName());
        }

    }

    public void loadJSONFile(String name) throws EduException {
        new PersonReader("src/belsty/gorbatenkova/by/file.json")
                .getListFromFile().forEach(person -> {
            try {
                this.addPersonToCourse(name, person);
            } catch (EduException e) {
                e.printStackTrace();
            }
        });
    }

    public void GetThreeBestStudents(String courseName) throws EduException {
        findCourseByName(courseName).getStudentsList().stream().filter(o -> o instanceof Student)
                .map(i -> (Student) i)
                .sorted(Comparator.comparingInt(Student::getMark).reversed())
                .limit(3)
                .forEach(o -> System.out.println("Имя:" + o.getName() + " Оценка: " + o.getMark()));
    }

}


