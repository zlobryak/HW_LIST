package tasklist;
import java.util.ArrayList;
import java.util.List;

//Все мееотды взаимодействия со списоком задач:
//Добавление, удаление, вывод, удаление по ключевому слову
public class TaskList {
    List<String> taskList = new ArrayList<>(); //Список всех задач

// Добавит любую зажачу в конец списка, даже если это повтор
    public void add(String taskName) {
        taskList.add(taskName);
    }

    public void show() {
        int counter = 0; // Переменная для вывода номера задачи в списке.
        for (String task : taskList) {
            counter += 1;
            System.out.printf("%d %s\n", counter, task);
        }
        System.out.println();
    }

// Удалит задачу их списка по номеру
    public boolean deleteNumber(String taskNumber) {
        int counter = 1;
        for (String task : taskList) {
                        if (counter == Integer.parseInt(taskNumber)) {
                taskList.remove(task);
                return true;
            }
                        counter += 1;
        }
        return false;
    }
// Удалит задачу их списка по полному имени
    public boolean deleteName(String taskName) {
        for (String task : taskList) {
            if (task.equals(taskName)) {
                taskList.remove(task);
                return true;
            }
        }
        return false;
    }

// Удалит все задачи по ключевому слову
    public boolean deleteKeyWord(String keyWord) {
        List<String> temp = new ArrayList<>(); //Временный список для хранения всех задач на удаление
        for (String task : taskList) {  //Перебор всех задач в списке
            if (task.toLowerCase().contains(keyWord.toLowerCase())) {
                temp.add(task); //Добавление задач помеченных на удаление в временный список
            }
        }
        if (temp.isEmpty()) {
            return false;
        } else {
            taskList.removeAll(temp); //Удаление всех помеченных задач
            return true;
        }
    }
}


//Должны быть операции:
//
//добавления нового дела в список;
//вывода всех дел с нумерацией;
//удаления дела по его номеру.
//Добавьте операцию удаления по ключевому слову. При такой операции пользователь вводит слово,
// а из списка удаляются все задачи, которые это слово содержат.
//
//Напоминаем, что нельзя модифицировать коллекцию во время её обхода циклом for-each или итератором.
// Подумайте, как можно реализовать требуемый функционал и соблюсти это ограничение.
// Обязательно проверьте работоспособность программы на примере удаления нескольких задач одним вызовом
// этой операции, включая удаление подряд стоящих задач.
