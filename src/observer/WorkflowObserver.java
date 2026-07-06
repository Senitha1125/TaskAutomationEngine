package observer;

import state.WorkflowState;

public interface WorkflowObserver {

    void onStateChange(WorkflowState state);

}