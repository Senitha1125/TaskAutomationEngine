package workflow;

import java.util.ArrayList;
import java.util.List;

import state.WorkflowState;
import task.Task;

public class Workflow {

    private String workflowName;
    private List<Task> tasks;
    private WorkflowState currentState;

    // Constructor
    public Workflow(String workflowName) {
        this.workflowName = workflowName;
        this.tasks = new ArrayList<>();
        this.currentState = WorkflowState.PENDING;
    }

    // Add a task to the workflow
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Start executing the workflow
    public void start() {

        currentState = WorkflowState.RUNNING;

        System.out.println("\n====================================");
        System.out.println("Starting Workflow : " + workflowName);
        System.out.println("Workflow State    : " + currentState);
        System.out.println("====================================");

        for (Task task : tasks) {

            System.out.println("\nExecuting : " + task.getTaskName());

            if (task.validate()) {

                task.execute();

            } else {

                currentState = WorkflowState.FAILED;

                System.out.println(task.getTaskName() + " Validation Failed!");
                System.out.println("Workflow State : " + currentState);

                return;
            }
        }

        currentState = WorkflowState.COMPLETED;

        System.out.println("\n====================================");
        System.out.println("Workflow State : " + currentState);
        System.out.println("Workflow Completed Successfully!");
        System.out.println("====================================");
    }
}