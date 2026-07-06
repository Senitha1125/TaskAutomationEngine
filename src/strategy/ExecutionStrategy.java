package strategy;

import java.util.List;
import task.Task;

public interface ExecutionStrategy {

    boolean execute(List<Task> tasks);

}