package Composite;

public class SingleTask implements Task {
    private String taskName;

    public SingleTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Задача: " + taskName);
    }
}