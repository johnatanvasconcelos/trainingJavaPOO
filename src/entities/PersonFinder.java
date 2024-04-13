package entities;

public class PersonFinder {

    public Person findTallestPerson(Person[] people){
        Person tallestPerson = null;

        for (Person person : people) {
            if (tallestPerson == null || person.getHeight() > tallestPerson.getHeight()){
                tallestPerson = person;
            }
        }
        return tallestPerson;
    }

    public Person findOldestPerson(Person[] people){
        Person oldestPerson = null;

        for (Person person : people) {
            if (oldestPerson == null || person.getAge() > oldestPerson.getAge()){
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }
}
