package task;

public interface Task {

    boolean validate();

    void execute();

    String getTaskName();

}