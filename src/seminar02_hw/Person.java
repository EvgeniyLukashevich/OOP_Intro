package seminar02_hw;

import java.io.IOException;

public class Person {
    private String name = "unknown";
    private String dateOfBirth = "unknown";
    private String gender = "unknown";

    public String getName() {
        return this.name;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getGender() {
        return this.gender;
    }


    public Person(String name, String birth, String gender) throws IOException {
        this.name = name;
        this.dateOfBirth = birth;
        this.gender = gender;
        Model.writePerson(this.name, this.dateOfBirth, this.gender);

    }

    public Person() {
        super();
    }

    public static void main(String[] args) {
        Person a = new Person();
        System.out.println(a.name + " " + a.dateOfBirth + " " + a.gender);
    }
}
