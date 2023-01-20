package seminar05_hw.Core.MVP;

import seminar05_hw.Core.Models.Worker;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Presenter {
    Model model;
    View view;

    public Presenter(View view, String path) {
        this.view = view;
        model = new Model(path);
    }

    public void addWorker() throws IOException {
        Worker worker = new Worker.WorkerBuilder(view.inputFullName())
                .setDateOfBirth(view.inputDateOfBirth())
                .setDivision(view.inputDivision())
                .setPosition(view.inputPosition())
                .setSalary(view.inputSalary())
                .build();
        model.saveWorker(worker);
    }

    public void showWorkers() throws FileNotFoundException {
        view.print(model.loadWorkers());
    }

    public void showMenu() {
        view.showMenu();
    }

    public String inputMenu() {
        return view.inputMenu();
    }

    public void exit() {
        view.exitMessage();
    }

    public void error() {
        view.errorMessage();
    }
}
