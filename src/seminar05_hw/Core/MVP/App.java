package seminar05_hw.Core.MVP;

import seminar05_hw.Config;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
    public static void Click() throws IOException {
        Presenter pr = new Presenter(new ViewConsole(), new Config().getPath());
        while (true) {
            pr.showMenu();
            String choose = pr.inputMenu();
            if (choose.equals("1")) {
                pr.addWorker();
            } else if (choose.equals("2")) {
                pr.showWorkers();
            } else if (choose.equals("0")) {
                break;
            } else {
                pr.error();
            }
        }
        pr.exit();
    }
}
