package seminar01_hw;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Data {

    private static final String fileName = "src/old/ContactList.txt";

    public static void writeNewContact(String[] contactArray) throws IOException {
        FileWriter writeFile = new FileWriter(
                fileName, true);
        StringBuilder contactString = new StringBuilder(contactArray[0]);
        for (int i = 1; i < contactArray.length; i++) {
            contactString.append(" || ").append(contactArray[i]);
        }
        contactString.append("\n");
        writeFile.write(contactString.toString());
        writeFile.close();
    }

    public static String[] readContactList() throws Exception {
        FileReader readFile = new FileReader(fileName);
        Scanner scan = new Scanner(readFile);
        StringBuilder contacts = new StringBuilder();
        while (scan.hasNextLine()) {
            contacts.append(scan.nextLine()).append("\n");
        }
        return contacts.toString().split("\n");
    }

    public static void main(String[] args) throws Exception {
        String[] array = readContactList();
        for (String s : array) {
            System.out.println(s);
        }

    }
}
