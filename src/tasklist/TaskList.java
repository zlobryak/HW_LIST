package tasklist;


import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> taskList = new ArrayList<>();

    public void add(String taskName) {
        taskList.add(taskName);
    }

    public void show() {
        int counter = 0;
        for (String task : taskList) {
            counter += 1;
            System.out.printf("%d %s\n", counter, task);
        }
        System.out.println();
    }

    public boolean deleteNumber(String taskNumber) {
        for (String task : taskList) {
            if (taskList.indexOf(task) + 1 == Integer.parseInt(taskNumber)) {
                taskList.remove(task);
                return true;
            }
        }
        return false;
    }

    public boolean deleteName(String taskName) {
        for (String task : taskList){
            if (task.equals(taskName)){
                taskList.remove(task);
                return true;
            }
        }
        return  false;
    }

    public boolean deleteKeyWord(String keyWord) {
    }
}

//Должны быть операции:
//
//добавления нового дела в список;
//вывода всех дел с нумерацией;
//удаления дела по его номеру.
