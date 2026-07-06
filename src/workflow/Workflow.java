package workflow;

import java.util.ArrayList;
import java.util.List;

import observer.WorkflowObserver;
import state.WorkflowState;
import strategy.ExecutionStrategy;
import strategy.SequentialStrategy;
import task.Task;

public class Workflow {

    private String workflowName;
    private List<Task> tasks;
    private List<WorkflowObserver> observers;
    private WorkflowState currentState;
    private ExecutionStrategy strategy;

    // Constructor
    public Workflow(String workflowName) {
        this.workflowName = workflowName;
        this.tasks = new ArrayList<>();
        this.observers = new ArrayList<>();
        this.currentState = WorkflowState.PENDING;
        this.strategy = new SequentialStrategy();
    }

    // Add a task
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Register an observer
    public void addObserver(WorkflowObserver observer) {
        observers.add(observer);
    }

    // Change execution strategy
    public void setExecutionStrategy(ExecutionStrategy strategy) {
        this.strategy = strategy;
    }

    // Notify all observers
    private void notifyObservers() {
        for (WorkflowObserver observer : observers) {
            observer.onStateChange(currentState);
        }
    }

    // Helper method to change state
    private void changeState(WorkflowState newState) {
        currentState = newState;
        notifyObservers();
    }

    // Execute workflow
    public void start() {

        changeState(WorkflowState.RUNNING);

        System.out.println("\n====================================");
        System.out.println("Starting Workflow : " + workflowName);
        System.out.println("Workflow State    : " + currentState);
        System.out.println("====================================");

        boolean success = strategy.execute(tasks);

        if (success) {
            changeState(WorkflowState.COMPLETED);

            System.out.println("\n====================================");
            System.out.println("Workflow State : " + currentState);
            System.out.println("Workflow Completed Successfully!");
            System.out.println("====================================");
        } else {
            changeState(WorkflowState.FAILED);

            System.out.println("\n====================================");
            System.out.println("Workflow State : " + currentState);
            System.out.println("Workflow Execution Failed!");
            System.out.println("====================================");
        }
    }
}