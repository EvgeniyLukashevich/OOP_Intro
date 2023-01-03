package seminar01_hw;

import java.util.Scanner;

public class Models {
    public static String[] newContact() {
        Scanner scanner = new Scanner(System.in);
        String[] contact = new String[] { "", "", "" };
        for (int i = 0; i < contact.length; i++) {
            System.out.print(View.getAddContactMessages()[i]);
            contact[i] = scanner.nextLine();
        }
        System.out.println(View.getAddContactMessages()[3]);
        return contact;
    }

    public static void main(String[] args) throws Exception {
        Data.writeNewContact(newContact());

    }
}
