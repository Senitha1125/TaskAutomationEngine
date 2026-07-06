package strategy;

import java.util.List;

import task.Task;

public class SequentialStrategy implements ExecutionStrategy {

    @Override
    public boolean execute(List<Task> tasks) {

        for (Task task : tasks) {

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