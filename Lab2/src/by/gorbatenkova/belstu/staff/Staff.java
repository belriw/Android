package by.gorbatenkova.belstu.staff;

import androidx.annotation.NonNull;

import java.util.ArrayList;

import gorbatenkova.fit.bstu.by.exception.EduException;
import gorbatenkova.fit.bstu.by.units.Person;

public class Staff {
    private ArrayList<Person> persons;
    private int maxPersonsCount;

    public Staff() {
     persons = new ArrayList<>();
    }

    public Staff (ArrayList<Person> persons) { this.persons = persons; }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public void setMaxPersonsCount(int count) {
        this.maxPersonsCount = count;
    }

    public boolean add(Person person) throws EduException {
        if(persons.size() == maxPersonsCount) {
            throw new EduException("Staff is full");
        } else {
            persons.add(person);
            return true;
        }
    }

    public boolean remove(Person person) throws EduException {
        if(persons.contains(person)) {
            persons.remove(person);
            return true;
        } else {
            throw new EduException("Staff doesn't contain this person");
        }
    }

    @NonNull
    @Override
    public String toString() {
        String resultString = "";
        for (Person person : persons) {
            resultString.concat(person.toString());
            resultString.concat("\n");
        }
        return resultString;
    }
}


