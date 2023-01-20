package seminar05_hw.Core.Models;

public class Worker {
    String fullName;
    String dateOfBirth;
    Division division;
    Position position;
    Integer salary;


    private Worker(WorkerBuilder workerBuilder) {
        fullName = workerBuilder.fullName;
        dateOfBirth = workerBuilder.dateOfBirth;
        division = workerBuilder.division;
        salary = workerBuilder.salary;
        position = workerBuilder.position;
    }

    public String extendedInfo() {
        return "ФИО: " + fullName + "\n" +
                "Дата рождения: " + dateOfBirth + "\n" +
                "Подразделение: " + division.getUnit() + "\n" +
                "Должность: " + position.getUnit() + "\n" +
                "Оклад: " + salary + "\n";
    }

    public String info() {
        return fullName + "\n" +
                dateOfBirth + "\n" +
                division.getUnit() + "\n" +
                position.getUnit() + "\n" +
                salary + "\n";
    }

    public String getFullName() {
        return this.fullName;
    }


    public static class WorkerBuilder {
        private String fullName;
        private String dateOfBirth;
        private Division division;
        private Position position;
        private Integer salary;


        public WorkerBuilder(String fullName) {
            this.fullName = fullName;
            this.dateOfBirth = "Неизвестно";
            this.division = new Division();
            this.position = new Position();
            this.salary = 11000;
        }

        public WorkerBuilder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public WorkerBuilder setSalary(Integer salary) {
            this.salary = salary;
            return this;
        }

        public WorkerBuilder setDivision(String division) {
            this.division.setUnit(division);
            return this;
        }

        public WorkerBuilder setPosition(String position) {
            this.position.setUnit(position);
            return this;
        }

        public Worker build() {
            return new Worker(this);
        }

    }
}
