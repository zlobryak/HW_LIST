package userinterface;

//Все выводы в консоль через методы этого класса
public class MainScreen {
    public void init() {
        System.out.println("Приветствуем вас, Username!");
    }

    //Выводит на экран список всех доступных вариантов
    public void showOptions() {
        System.out.print("\nВыберите операцию:\n\n" +
                "0. Выход из программы\n" +
                "1. Добавить дело\n" +
                "2. Показать дела\n" +
                "3. Удалить дело по номеру\n" +
                "4. Удалить дело по названию\n" +
                "5. Удалить по ключевому слову\n"
        );
    }

    public void addMessage() {
        System.out.print("Введите название задачи: ");
    }

    public void deleteNumberMessage() {
        System.out.println("Введите номер для удаления: ");
    }

    public void deleted() {
        System.out.println("Удалено!");
    }

    public void noTask() {
        System.out.println("Нет такой задачи!");
    }

    public void deleteNameMessage() {
        System.out.println("Введите задачу для удаления: ");
    }

    public void deleteKeyWord() {
        System.out.println("Введите ключевое слово для удаления нескольких задач: ");
    }

    public static void gameOver() {
        System.out.println("Программа завершена");
    }
}
