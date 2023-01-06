package seminar02_hw.Relationships;

import seminar02_hw.Person;

public class GenerationBase {
    Person basePerson = new Person();
    Person nextPerson = new Person();

    public Person getBasePerson() {
        return basePerson;
    }

    public Person getNextPerson() {
        return nextPerson;
    }

    public GenerationBase(Person firstPerson, Person secondPerson) {
        this.basePerson = firstPerson;
        this.nextPerson = secondPerson;
    }

    public GenerationBase() {
        super();
    }

}
