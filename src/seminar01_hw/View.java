package seminar01_hw;

public class View {

    private static final String errorMessage = "Ошибка ввода данных";

    /**
     * Заприваченный строковый массив
     * с перечнем стартовых команд
     */
    private static final String[] startCommands = new String[] {
            "1: Добавить контакт\n",
            "2: Изменить контакт\n",
            "3: Удалить контакт\n",
            "4: Список контактов\n",
            "exit: Выход\n\n",
            "Выберите пункт меню: " };

    /**
     * Заприваченный строковый массив с перечнем
     * сообщений для создания нового контакта
     */
    private static final String[] addContactMessages = new String[] {
            "Введите имя контакта: ",
            "Введите номер контакта: ",
            "Введите комментарий: ",
            "Контакт успешно добавлен!" };

    /**
     * Возвращает строку с сообщением об ошибке ввода
     */
    public static String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Возвращает строковый массив стартовых команд
     */
    public static String[] getStartCommands() {
        return startCommands;
    }

    /**
     * Возвращает массив строк с сообщениями для создания контакта
     */
    public static String[] getAddContactMessages() {
        return addContactMessages;
    }

    /**
     * Возвращает строку со стартовыми командами.
     * Каждая команда занимает отдельную строку
     */
    public static String getStartMenu() {
        StringBuilder menuString = new StringBuilder("\n" + startCommands[0]);
        for (int i = 1; i < startCommands.length; i++) {
            menuString.append(startCommands[i]);
        }
        return menuString.toString();
    }


    public static void main(String[] args) {
        System.out.println(getStartMenu());
        System.out.println(View.errorMessage);
    }

}
