package seminar01_hw;

import java.util.Scanner;

public class Controller {
    public static void start() throws Exception {
        System.out.print(View.getStartMenu());
        Scanner scanner = new Scanner(System.in);
        String menuPoint = scanner.nextLine();
        boolean flag = true;

        while (flag) {
            if (menuPoint.equalsIgnoreCase("exit")) {
                flag = false;
            } else if (menuPoint.equals("1")) {
                Data.writeNewContact(Models.newContact());
                System.out.print(View.getStartMenu());
                menuPoint = scanner.nextLine();
            }

            else {
                System.out.println(View.getErrorMessage());
                System.out.println(View.getStartMenu());
                menuPoint = scanner.nextLine();
            }
        }
    }

}
