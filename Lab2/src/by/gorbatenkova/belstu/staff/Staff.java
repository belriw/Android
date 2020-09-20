package by.gorbatenkova.belstu.staff;

import by.gorbatenkova.belstu.exception.EduException;
import by.gorbatenkova.belstu.units.Person;

import java.util.ArrayList;

public class Staff {
    private ArrayList<Person> persons;
    private int maxAmountPersons;

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

    public void setMaxAmountPersons(int count) {
        this.maxAmountPersons = count;
    }

    public boolean add(Person person) throws EduException {
        if(persons.size() == maxAmountPersons) {
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


