package Composite;

import java.util.ArrayList;
import java.util.List;

public class TaskCategory implements Task {
    private String categoryName;
    private List<Task> tasks;

    public TaskCategory(String categoryName) {
        this.categoryName = categoryName;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    @Override
    public void displayInfo() {
        System.out.println("Категория: " + categoryName);
        for (Task task : tasks) {
            task.displayInfo();
        }
    }
}
