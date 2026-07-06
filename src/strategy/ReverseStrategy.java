package strategy;

import java.util.List;

import task.Task;

public class ReverseStrategy implements ExecutionStrategy {

    @Override
    public boolean execute(List<Task> tasks) {

        for (int i = tasks.size() - 1; i >= 0; i--) {

            Task task = tasks.get(i);

            System.out.println("\nExecuting : " + task.getTaskName());

            if (!task.validate()) {

                System.out.println(task.getTaskName() + " Validation Failed!");
                return false;

            }

            task.execute();

        }

        return true;
    }
}