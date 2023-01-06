package seminar02_hw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Model {
    private static String path = "src//seminar02_hw//Data//";

    public static void writePerson(String name, String birth, String gender) throws IOException {
        File dir = new File(path + name);
        dir.mkdir();
        File file = new File(dir, "Person.txt");
        if (file.exists()) {
            System.out.println("Файл PERSON для " + name + " уже создан");
        } else {
            FileWriter writer = new FileWriter(file);
            writer.write(name + "\n" + birth + "\n" + gender);
            writer.close();
        }
    }

    public static void writeRelation(String generationType, String name1,
                                     String birth, String gender, String name2,
                                     String relation) throws IOException {
        File dir = new File(path + name2);
        dir.mkdir();
        File file = new File(dir, generationType);

        if (file.exists()) {
            FileWriter writer = new FileWriter(file, true);
            writer.append(name1 + " || " + birth + " || " + gender + " || " + relation + "\n");
            writer.close();
        } else {
            FileWriter writer = new FileWriter(file);
            writer.write(name1 + " || " + birth + " || " + gender + " || " + relation + "\n");
            writer.close();
        }
    }
}
