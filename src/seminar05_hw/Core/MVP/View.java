package seminar05_hw.Core.MVP;

public interface View {

    String inputFullName();

    String inputDateOfBirth();

    String inputDivision();

    String inputPosition();

    Integer inputSalary();

    void print(String value);

    void showMenu();

    String inputMenu();

    void exitMessage();

    void errorMessage();
}
