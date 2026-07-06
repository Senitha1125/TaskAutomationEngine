package workflow;

import java.util.ArrayList;
import java.util.List;

import task.Task;

public class Workflow {

    private String workflowName;
    private List<Task> tasks;

    public Workflow(String workflowName) {

        this.workflowName = workflowName;
        tasks = new ArrayList<>();

    }

    public void addTask(Task task) {

        tasks.add(task);

    }

    public void start() {

    System.out.println("\n====================================");
    System.out.println("Starting Workflow : " + workflowName);
    System.out.println("====================================");

    for (Task task : tasks) {

        System.out.println("\nExecuting : " + task.getTaskName());

        if (task.validate()) {

            task.execute();

        } else {

            System.out.println(task.getTaskName() + " validation failed!");

        }

    }

    System.out.println("\n====================================");
    System.out.println("Workflow Completed Successfully!");
    System.out.println("====================================");

}

}