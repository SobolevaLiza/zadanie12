import Composite.SingleTask;
import Composite.TaskCategory;


public class Main {
    public static void main(String[] args) {
        SingleTask task1 = new SingleTask("Задача 1");
        SingleTask task2 = new SingleTask("Задача 2");
        SingleTask task3 = new SingleTask("Задача 3");

        TaskCategory mainCategory = new TaskCategory("Главная категория");
        TaskCategory subCategory1 = new TaskCategory("Подкатегория 1");
        TaskCategory subCategory2 = new TaskCategory("Подкатегория 2");

        subCategory1.addTask(task1);
        subCategory1.addTask(task2);
        subCategory2.addTask(task3);

        mainCategory.addTask(subCategory1);
        mainCategory.addTask(subCategory2);

        mainCategory.displayInfo();
    }
}
