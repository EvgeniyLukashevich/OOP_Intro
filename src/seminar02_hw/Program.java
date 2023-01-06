package seminar02_hw;

import seminar02_hw.Relationships.GenerationCurrent;
import seminar02_hw.Relationships.GenerationOlder;
import seminar02_hw.Relationships.GenerationYounger;

import java.io.IOException;

public class Program {

    //    Преподаватель предложил не тратить время на реализацию вывода.
//    Вместо этого подумать над архитектурой и хранением
    public static void main(String[] args) throws IOException {
        Person person1 = new Person("Vitaliy Popov", "12.11.1913", "male");
        Person person2 = new Person("Marina Popova", "15.07.1917", "female");
        new GenerationCurrent(person1, person2, "husband");
        new GenerationCurrent(person2, person1, "wife");
        Person person3 = new Person("Angelina Shadrina", "25.03.1935", "female");
        new GenerationOlder(person1, person3, "father");
        new GenerationOlder(person2, person3, "mother");
        new GenerationYounger(person3, person1, "daughter");
        new GenerationYounger(person3, person2, "daughter");
        Person person4 = new Person("Maxim Popov", "14.02.1948", "male");
        new GenerationOlder(person1, person4, "father");
        new GenerationOlder(person2, person4, "mother");
        new GenerationYounger(person4, person1, "son");
        new GenerationYounger(person4, person2, "son");
        new GenerationCurrent(person3, person4, "sister");
        new GenerationCurrent(person4, person3, "brother");
        Person person5 = new Person("Andrey Shadrin", "25.05.1933", "male");
        new GenerationOlder(person1, person5, "parent-in-law");
        new GenerationOlder(person2, person5, "mother-in-law");
        new GenerationYounger(person5, person1, "son-in-law");
        new GenerationYounger(person5, person2, "son-in-law");
        new GenerationCurrent(person3, person5, "wife");
        new GenerationCurrent(person5, person3, "husband");


    }
}
