package seminar05_hw.Core.MVP;

import seminar05_hw.Core.Models.Worker;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Model {
    public Worker[] workersLog;
    private String path;

    public Model(String path) {
        this.path = path;
    }

    public void saveWorker(Worker worker) throws IOException {
        try {
            File file = new File(path + "/" + worker.getFullName() + ".txt");
            FileWriter writer = new FileWriter(file);
            String text = worker.info();
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String loadWorkers() throws FileNotFoundException {
        File folder = new File(path);
        File[] folderEntries = folder.listFiles();
        int i = 0;
        StringBuilder workers = new StringBuilder("\n");
        for (File entry : folderEntries) {
            workers.append("\n");
            FileReader file = new FileReader(entry);
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                workers.append(scan.nextLine()).append("\n");
            }
            i++;
        }
        return workers.toString();
    }


}





